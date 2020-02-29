package cassiokf.industrialrenewal.blocks.pipes;

import cassiokf.industrialrenewal.blocks.abstracts.BlockAbstractFacing;
import cassiokf.industrialrenewal.tileentity.TileEntityWireIsolator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class BlockHVIsolator extends BlockAbstractFacing
{
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.values());

    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(5, 5, 0, 11, 11, 8);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(5, 5, 8, 11, 11, 16);
    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(8, 5, 5, 1.0, 11, 11);
    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(0, 5, 5, 8, 11, 11);
    protected static final VoxelShape UP_AABB = Block.makeCuboidShape(5, 8, 5, 11, 16, 11);
    protected static final VoxelShape DOWN_AABB = Block.makeCuboidShape(5, 0, 5, 11, 8, 11);

    public BlockHVIsolator()
    {
        super(Block.Properties.create(Material.IRON));
    }

    @Override
    public VoxelShape getVoxelShape(BlockState state)
    {
        Direction dir = state.get(FACING);
        switch (dir)
        {
            case NORTH:
                return NORTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case EAST:
                return EAST_AABB;
            case WEST:
                return WEST_AABB;
            case DOWN:
                return DOWN_AABB;
            default:
                return UP_AABB;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return getDefaultState().with(FACING, context.getFace().getOpposite());
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Nullable
    @Override
    public TileEntityWireIsolator createTileEntity(BlockState state, IBlockReader world)
    {
        return new TileEntityWireIsolator();
    }
}
