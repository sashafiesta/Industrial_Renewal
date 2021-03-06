package cassiokf.industrialrenewal.handlers;

import cassiokf.industrialrenewal.config.IRConfig;
import cassiokf.industrialrenewal.tileentity.TileEntityChunkLoader;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.PlayerOrderedLoadingCallback;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

public class ChunkManagerCallback implements PlayerOrderedLoadingCallback
{
    public static boolean isTicketValid(IBlockAccess blockAccess, Ticket ticket)
    {
        NBTTagCompound modData = ticket.getModData();
        if (!modData.hasKey("blockPosition"))
        {
            return false;
        }
        BlockPos pos = NBTUtil.getPosFromTag(modData.getCompoundTag("blockPosition"));
        TileEntity te = blockAccess.getTileEntity(pos);
        return te instanceof TileEntityChunkLoader && ((TileEntityChunkLoader) te).isMaster();
    }

    public static void activateTicket(World world, Ticket ticket)
    {
        if (!isTicketValid(world, ticket)) return;

        NBTTagCompound modData = ticket.getModData();
        BlockPos pos = NBTUtil.getPosFromTag(modData.getCompoundTag("blockPosition"));
        TileEntity te = world.getTileEntity(pos);

        if (!(te instanceof TileEntityChunkLoader) || !((TileEntityChunkLoader) te).isMaster())
        {
            return;
        }

        TileEntityChunkLoader tileEntity = (TileEntityChunkLoader) te;

        int size = modData.getInteger("size");

        final ChunkPos chunk = new ChunkPos(pos);

        int minX = chunk.x - (int) (size / 2.0f);
        int maxX = chunk.x + (int) ((size - 1) / 2.0f);
        int minZ = chunk.z - (int) (size / 2.0f);
        int maxZ = chunk.z + (int) ((size - 1) / 2.0f);

        for (int z = minZ; z <= maxZ; ++z)
        {
            for (int x = minX; x <= maxX; ++x)
            {
                final ChunkPos ticketChunk = new ChunkPos(x, z);

                ForgeChunkManager.forceChunk(ticket, ticketChunk);
            }
        }

        tileEntity.setTicket(ticket);

        String playerName = ticket.getPlayerName();

        final EntityPlayerMP player = getOnlinePlayerByName(world.getMinecraftServer(), playerName);
        if (player != null)
        {
            tileEntity.addTrackedPlayer(player);
        }
    }

    public static EntityPlayerMP getOnlinePlayerByName(MinecraftServer server, String playerName)
    {
        EntityPlayerMP locatedPlayer = null;
        if (server == null || server.getPlayerList() == null || playerName == null)
        {
            return null;
        }
        final PlayerList playerList = server.getPlayerList();

        for (final EntityPlayerMP entityPlayerMP : playerList.getPlayers())
        {
            if (playerName.equals(entityPlayerMP.getName()))
            {
                locatedPlayer = entityPlayerMP;
                break;
            }
        }
        return locatedPlayer;
    }

    @Override
    public ListMultimap<String, ForgeChunkManager.Ticket> playerTicketsLoaded(ListMultimap<String, ForgeChunkManager.Ticket> tickets, World world)
    {
        final ListMultimap<String, Ticket> returnedTickets = ArrayListMultimap.create();

        if (IRConfig.MainConfig.Main.emergencyMode)
        {//Disable Chunk Load
            return returnedTickets;
        }

        for (final Entry<String, Collection<Ticket>> playerTicketMap : tickets.asMap().entrySet())
        {
            final String player = playerTicketMap.getKey();
            for (final Ticket ticket : playerTicketMap.getValue())
            {
                if (isTicketValid(world, ticket))
                {
                    returnedTickets.put(player, ticket);
                }
            }
        }

        return returnedTickets;
    }

    @Override
    public void ticketsLoaded(List<ForgeChunkManager.Ticket> tickets, World world)
    {
        for (final Ticket ticket : tickets)
        {
            final NBTTagCompound modData = ticket.getModData();
            if (!modData.hasKey("blockPosition"))
            {
                continue;
            }

            activateTicket(world, ticket);
        }
    }
}
