package cassiokf.industrialrenewal.init;

import cassiokf.industrialrenewal.References;
import cassiokf.industrialrenewal.blocks.*;
import cassiokf.industrialrenewal.blocks.industrialfloor.BlockFloorCable;
import cassiokf.industrialrenewal.blocks.industrialfloor.BlockFloorLamp;
import cassiokf.industrialrenewal.blocks.industrialfloor.BlockFloorPipe;
import cassiokf.industrialrenewal.blocks.industrialfloor.BlockIndustrialFloor;
import cassiokf.industrialrenewal.blocks.machines.BlockLathe;
import cassiokf.industrialrenewal.blocks.pipes.*;
import cassiokf.industrialrenewal.blocks.railroad.*;
import cassiokf.industrialrenewal.blocks.redstone.*;
import cassiokf.industrialrenewal.fluids.BlockFluid;
import cassiokf.industrialrenewal.tileentity.*;
import cassiokf.industrialrenewal.tileentity.machines.TELathe;
import cassiokf.industrialrenewal.tileentity.railroad.TileEntityCargoLoader;
import cassiokf.industrialrenewal.tileentity.railroad.TileEntityFluidLoader;
import cassiokf.industrialrenewal.tileentity.tubes.*;
import cassiokf.industrialrenewal.util.enums.EnumBulkConveyorType;
import cassiokf.industrialrenewal.util.enums.EnumEnergyCableType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{

    public static final BlockBase blockHazard = new BlockBase(Material.IRON, "block_hazard", References.CREATIVE_IR_TAB);
    public static final BlockBase cautionHazard = new BlockBase(Material.IRON, "caution_hazard", References.CREATIVE_IR_TAB);
    public static final BlockBase defectiveHazard = new BlockBase(Material.IRON, "defective_hazard", References.CREATIVE_IR_TAB);
    public static final BlockBase safetyHazard = new BlockBase(Material.IRON, "safety_hazard", References.CREATIVE_IR_TAB);
    public static final BlockBase radiationHazard = new BlockBase(Material.IRON, "radiation_hazard", References.CREATIVE_IR_TAB);
    public static final BlockBase aisleHazard = new BlockBase(Material.IRON, "aisle_hazard", References.CREATIVE_IR_TAB);
    public static final BlockBase fireHazard = new BlockBase(Material.IRON, "fire_hazard", References.CREATIVE_IR_TAB);

    public static final BlockOredict steelBlock = new BlockOredict(Material.IRON, "block_steel", "blockSteel", References.CREATIVE_IR_TAB);

    public static final BlockConcrete concrete = new BlockConcrete(Material.ROCK, "concrete", References.CREATIVE_IR_TAB);

    public static final BlockIndustrialFloor blockIndFloor = new BlockIndustrialFloor("industrial_floor", References.CREATIVE_IR_TAB);
    public static final BlockChimney blockChimney = new BlockChimney("block_chimney", References.CREATIVE_IR_TAB);
    public static final BlockFirstAidKit firstAidKit = new BlockFirstAidKit("firstaid_kit", References.CREATIVE_IR_TAB);
    public static final BlockFireExtinguisher fireExtinguisher = new BlockFireExtinguisher("fire_extinguisher", References.CREATIVE_IR_TAB);
    public static final BlockLocker locker = new BlockLocker("locker", References.CREATIVE_IR_TAB);

    public static final BlockFluid steamBlock = new BlockFluid("steam", FluidInit.STEAM, References.CREATIVE_IR_TAB);
    public static final BlockFluidPipe fluidPipe = new BlockFluidPipe("fluid_pipe", References.CREATIVE_IR_TAB);
    public static final BlockFluidPipeGauge fluidPipeGauge = new BlockFluidPipeGauge("fluid_pipe_gauge", References.CREATIVE_IR_TAB);

    public static final BlockEnergyCable energyCableLV = new BlockEnergyCable(EnumEnergyCableType.LV, "energy_cable_lv", References.CREATIVE_IR_TAB);
    public static final BlockEnergyCable energyCableMV = new BlockEnergyCable(EnumEnergyCableType.MV, "energy_cable", References.CREATIVE_IR_TAB);
    public static final BlockEnergyCable energyCableHV = new BlockEnergyCable(EnumEnergyCableType.HV, "energy_cable_hv", References.CREATIVE_IR_TAB);

    public static final BlockEnergyCableGauge energyCableGaugeLV = new BlockEnergyCableGauge(EnumEnergyCableType.LV, "energy_cable_gauge_lv", References.CREATIVE_IR_TAB);
    public static final BlockEnergyCableGauge energyCableGaugeMV = new BlockEnergyCableGauge(EnumEnergyCableType.MV, "energy_cable_gauge", References.CREATIVE_IR_TAB);
    public static final BlockEnergyCableGauge energyCableGaugeHV = new BlockEnergyCableGauge(EnumEnergyCableType.HV, "energy_cable_gauge_hv", References.CREATIVE_IR_TAB);

    public static final BlockPillarEnergyCable pillarEnergyCableLV = new BlockPillarEnergyCable(EnumEnergyCableType.LV, "iron_pillar_energy_lv", References.CREATIVE_IR_TAB);
    public static final BlockPillarEnergyCable pillarEnergyCableMV = new BlockPillarEnergyCable(EnumEnergyCableType.MV, "iron_pillar_energy", References.CREATIVE_IR_TAB);
    public static final BlockPillarEnergyCable pillarEnergyCableHV = new BlockPillarEnergyCable(EnumEnergyCableType.HV, "iron_pillar_energy_hv", References.CREATIVE_IR_TAB);

    public static final BlockPillarFluidPipe pillarFluidPipe = new BlockPillarFluidPipe("iron_pillar_pipe", References.CREATIVE_IR_TAB);
    public static final BlockFloorPipe floorPipe = new BlockFloorPipe("floor_pipe", References.CREATIVE_IR_TAB);
    public static final BlockFloorCable floorCableLV = new BlockFloorCable(EnumEnergyCableType.LV, "floor_cable_lv", References.CREATIVE_IR_TAB);
    public static final BlockFloorCable floorCableMV = new BlockFloorCable(EnumEnergyCableType.MV, "floor_cable", References.CREATIVE_IR_TAB);
    public static final BlockFloorCable floorCableHV = new BlockFloorCable(EnumEnergyCableType.HV, "floor_cable_hv", References.CREATIVE_IR_TAB);
    public static final BlockFloorLamp floorLamp = new BlockFloorLamp("floor_lamp", References.CREATIVE_IR_TAB);
    public static final BlockHVConnectorBase hvIsolator = new BlockHVConnectorBase("isolator_hv", References.CREATIVE_IR_TAB);

    //Machines
    public static final BlockLathe latheMachine = new BlockLathe("lathe", References.CREATIVE_IR_TAB);

    public static final BlockAlarm alarm = new BlockAlarm("alarm", References.CREATIVE_IR_TAB);
    public static final BlockRecordPlayer recordPlayer = new BlockRecordPlayer("record_player", References.CREATIVE_IR_TAB);

    public static final BlockCatWalk catWalk = new BlockCatWalk("catwalk", References.CREATIVE_IR_TAB);
    public static final BlockCatWalk catWalkSteel = new BlockCatWalk("catwalk_steel", References.CREATIVE_IR_TAB);
    public static final BlockHandRail handRail = new BlockHandRail("handrail", References.CREATIVE_IR_TAB);
    public static final BlockHandRail handRailSteel = new BlockHandRail("handrail_steel", References.CREATIVE_IR_TAB);
    public static final BlockCatwalkStair catwalkStair = new BlockCatwalkStair("catwalk_stair", References.CREATIVE_IR_TAB);
    public static final BlockCatwalkStair catwalkStairSteel = new BlockCatwalkStair("catwalk_stair_steel", References.CREATIVE_IR_TAB);
    public static final BlockPillar pillar = new BlockPillar("catwalk_pillar", References.CREATIVE_IR_TAB);
    public static final BlockPillar steel_pillar = new BlockPillar("catwalk_steel_pillar", References.CREATIVE_IR_TAB);
    public static final BlockColumn column = new BlockColumn("catwalk_column", References.CREATIVE_IR_TAB);
    public static final BlockColumn columSteel = new BlockColumn("catwalk_column_steel", References.CREATIVE_IR_TAB);
    public static final BlockCatwalkLadder iladder = new BlockCatwalkLadder("catwalk_ladder", References.CREATIVE_IR_TAB);
    public static final BlockCatwalkLadder sladder = new BlockCatwalkLadder("catwalk_ladder_steel", References.CREATIVE_IR_TAB);
    public static final BlockRoof roof = new BlockRoof("roof", References.CREATIVE_IR_TAB);
    public static final BlockGutter gutter = new BlockGutter("gutter", References.CREATIVE_IR_TAB);
    public static final BlockLight light = new BlockLight("light", References.CREATIVE_IR_TAB);
    public static final BlockFluorescent fluorescent = new BlockFluorescent("fluorescent", References.CREATIVE_IR_TAB);
    public static final BlockDummy dummy = new BlockDummy("dummy", References.CREATIVE_IR_TAB);
    public static final BlockCatwalkGate catwalkGate = new BlockCatwalkGate("catwalk_gate", References.CREATIVE_IR_TAB);
    public static final BlockCatwalkHatch hatch = new BlockCatwalkHatch("catwalk_hatch", References.CREATIVE_IR_TAB);
    public static final BlockWindow window = new BlockWindow("window", References.CREATIVE_IR_TAB);
    public static final BlockPlatform platform = new BlockPlatform("platform", References.CREATIVE_IR_TAB);
    public static final BlockBrace brace = new BlockBrace("brace", References.CREATIVE_IR_TAB);
    public static final BlockBrace braceSteel = new BlockBrace("brace_steel", References.CREATIVE_IR_TAB);
    public static final BlockScaffold scaffold = new BlockScaffold("scaffold", References.CREATIVE_IR_TAB);
    public static final BlockFrame frame = new BlockFrame("frame", References.CREATIVE_IR_TAB);
    public static final BlockBunkBed bunkBed = new BlockBunkBed("bunkbed", References.CREATIVE_IR_TAB);
    public static final BlockBunkerHatch bunkerHatch = new BlockBunkerHatch("bunker_hatch", References.CREATIVE_IR_TAB);

    public static final BlockBarrel barrel = new BlockBarrel("barrel", References.CREATIVE_IR_TAB);
    public static final BlockTrash trash = new BlockTrash("trash", References.CREATIVE_IR_TAB);
    public static final BlockGauge gauge = new BlockGauge("fluid_gauge", References.CREATIVE_IR_TAB);
    public static final BlockEnergyLevel energyLevel = new BlockEnergyLevel("energy_level", References.CREATIVE_IR_TAB);

    public static final BlockElectricFence efence = new BlockElectricFence("electric_fence", References.CREATIVE_IR_TAB);
    public static final BlockElectricBigFenceColumn bigFenceColumn = new BlockElectricBigFenceColumn("fence_big_column", References.CREATIVE_IR_TAB);
    public static final BlockElectricBigFenceWire bigFenceWire = new BlockElectricBigFenceWire("fence_big_wire", References.CREATIVE_IR_TAB);
    public static final BlockElectricBigFenceCorner bigFenceCorner = new BlockElectricBigFenceCorner("fence_big_corner", References.CREATIVE_IR_TAB);
    public static final BlockBaseWall concreteWall = new BlockBaseWall("wall_concrete", References.CREATIVE_IR_TAB);
    public static final BlockElectricGate egate = new BlockElectricGate("electric_gate", References.CREATIVE_IR_TAB);
    public static final BlockRazorWire razorWire = new BlockRazorWire("razor_wire", References.CREATIVE_IR_TAB);

    public static final BlockDamIntake damIntake = new BlockDamIntake("dam_intake", References.CREATIVE_IR_TAB);
    public static final BlockDamOutFlow damOutFlow = new BlockDamOutFlow("dam_outflow", References.CREATIVE_IR_TAB);

    public static final BlockInfinityGenerator infinityGenerator = new BlockInfinityGenerator("infinity_generator", References.CREATIVE_IR_TAB);
    public static final BlockSolarPanel spanel = new BlockSolarPanel("solar_panel", References.CREATIVE_IR_TAB);
    public static final BlockSolarPanelFrame fpanel = new BlockSolarPanelFrame("solar_panel_frame", References.CREATIVE_IR_TAB);
    public static final BlockSmallWindTurbine sWindTurbine = new BlockSmallWindTurbine("small_wind_turbine", References.CREATIVE_IR_TAB);
    public static final BlockWindTurbinePillar turbinePillar = new BlockWindTurbinePillar("small_wind_turbine_pillar", References.CREATIVE_IR_TAB);
    public static final BlockCableTray cableTray = new BlockCableTray("cable_tray", References.CREATIVE_IR_TAB);
    public static final BlockBatteryBank batteryBank = new BlockBatteryBank("battery_bank", References.CREATIVE_IR_TAB);

    public static final BlockSensorRain sensorRain = new BlockSensorRain("sensor_rain", References.CREATIVE_IR_TAB);
    public static final BlockSignalIndicator signalIndicator = new BlockSignalIndicator("signal_indicator", References.CREATIVE_IR_TAB);
    public static final BlockTrafficLight trafficLight = new BlockTrafficLight("traffic_light", References.CREATIVE_IR_TAB);
    public static final BlockFuseBox fuseBox = new BlockFuseBox("fuse_box", References.CREATIVE_IR_TAB);
    public static final BlockFuseBoxConduitExtension fuseBoxConduitExtension = new BlockFuseBoxConduitExtension("conduit_extension", References.CREATIVE_IR_TAB);
    public static final BlockFuseBoxConnector fuseBoxConnector = new BlockFuseBoxConnector("conduit_connector", References.CREATIVE_IR_TAB);
    public static final BlockFlameDetector flameDetector = new BlockFlameDetector("flame_detector", References.CREATIVE_IR_TAB);
    public static final BlockEntityDetector entityDetector = new BlockEntityDetector("entity_detector", References.CREATIVE_IR_TAB);
    public static final BlockButtonRed buttonRed = new BlockButtonRed("button_red", References.CREATIVE_IR_TAB);

    public static final BlockNormalRail normalRail = new BlockNormalRail("normal_rail", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockCrossingRail crossingRail = new BlockCrossingRail("crossing_rail", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockDetectorRail detectorRail = new BlockDetectorRail("detector_rail", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockBoosterRail boosterRail = new BlockBoosterRail("booster_rail", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockBufferStopRail bufferStopRail = new BlockBufferStopRail("buffer_stop_rail", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockLoaderRail loaderRail = new BlockLoaderRail("rail_loader", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockRailGate railGate = new BlockRailGate("rail_gate", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockCargoLoader cargoLoader = new BlockCargoLoader("cargo_loader", References.CREATIVE_IRLOCOMOTIVE_TAB);
    public static final BlockFluidLoader fluidLoader = new BlockFluidLoader("fluid_loader", References.CREATIVE_IRLOCOMOTIVE_TAB);

    public static final BlockValvePipeLarge valveLarge = new BlockValvePipeLarge("valve_pipe_large", References.CREATIVE_IR_TAB);
    public static final BlockEnergySwitch energySwitch = new BlockEnergySwitch("energy_switch", References.CREATIVE_IR_TAB);

    public static final BlockBulkConveyor conveyorV = new BlockBulkConveyor("conveyor_bulk", References.CREATIVE_IR_TAB, EnumBulkConveyorType.NORMAL);
    public static final BlockBulkConveyor conveyorVHopper = new BlockBulkConveyor("conveyor_bulk_hopper", References.CREATIVE_IR_TAB, EnumBulkConveyorType.HOPPER);
    public static final BlockBulkConveyor conveyorVInserter = new BlockBulkConveyor("conveyor_bulk_inserter", References.CREATIVE_IR_TAB, EnumBulkConveyorType.INSERTER);

    public static final BlockSignBase signHV = new BlockSignBase("sign_hv", References.CREATIVE_IR_TAB);
    public static final BlockSignBase signRA = new BlockSignBase("sign_ra", References.CREATIVE_IR_TAB);
    public static final BlockSignBase signC = new BlockSignBase("sign_c", References.CREATIVE_IR_TAB);

    public static final BlockEotM baseEotM = new BlockEotM("eotm", References.CREATIVE_IR_TAB);
    public static final BlockElectricPump electricPump = new BlockElectricPump("electric_pump", References.CREATIVE_IR_TAB);

    public static final BlockPortableGenerator portableGenerator = new BlockPortableGenerator("portable_generator", References.CREAATIVE_IRWIP_TAB);
    public static final BlockSteamBoiler steamBoiler = new BlockSteamBoiler("steam_boiler", References.CREATIVE_IR_TAB);
    public static final BlockSteamTurbine steamTurbine = new BlockSteamTurbine("steam_turbine", References.CREATIVE_IR_TAB);
    //public static final BlockMining mining = new BlockMining("mining", References.CREAATIVE_IRWIP_TAB);
    public static final BlockTransformerHV transformerHV = new BlockTransformerHV("transformer_hv", References.CREATIVE_IR_TAB);
    public static final BlockDamTurbine damTurbine = new BlockDamTurbine("dam_turbine", References.CREATIVE_IR_TAB);
    public static final BlockDamGenerator damGenerator = new BlockDamGenerator("dam_generator", References.CREATIVE_IR_TAB);
    public static final BlockDamAxis damAxis = new BlockDamAxis("dam_axis", References.CREATIVE_IR_TAB);
    public static final BlockHighPressurePipe highPressurePipe = new BlockHighPressurePipe("high_pressure_pipe", References.CREATIVE_IR_TAB);

    public static final BlockChunkLoader chunkLoader = new BlockChunkLoader("chunk_loader", References.CREATIVE_IR_TAB);

    public static final BlockOreVein veinHematite = new BlockOreVein("orevein_hematite", References.CREAATIVE_IRWIP_TAB);

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
                veinHematite,
                blockHazard,
                aisleHazard,
                cautionHazard,
                defectiveHazard,
                fireHazard,
                radiationHazard,
                safetyHazard,
                concrete,
                steelBlock,
                //Frames
                //Iron
                platform,
                roof,
                frame,
                hatch,
                window,

                catWalk,
                handRail,
                catwalkStair,
                iladder,
                catwalkGate,
                pillar,
                pillarEnergyCableLV,
                pillarEnergyCableMV,
                pillarEnergyCableHV,
                pillarFluidPipe,
                column,
                brace,
                //Steel
                catWalkSteel,
                handRailSteel,
                catwalkStairSteel,
                sladder,
                steel_pillar,
                columSteel,
                braceSteel,
                //Machines
                latheMachine,
                //Redstone
                alarm,
                entityDetector,
                flameDetector,
                sensorRain,
                buttonRed,
                fuseBox,
                fuseBoxConduitExtension,
                fuseBoxConnector,
                signalIndicator,
                trafficLight,
                //Utils
                fireExtinguisher,
                firstAidKit,
                recordPlayer,
                locker,
                bunkBed,
                bunkerHatch,
                blockChimney,
                scaffold,
                efence,
                bigFenceColumn,
                bigFenceCorner,
                concreteWall,
                bigFenceWire,
                egate,
                razorWire,
                damIntake,
                damOutFlow,
                signC,
                signHV,
                signRA,
                fluorescent,
                light,
                chunkLoader,
                //Floor
                blockIndFloor,
                floorCableLV,
                floorCableMV,
                floorCableHV,
                floorLamp,
                floorPipe,
                //Pipes
                energyCableLV,
                energyCableMV,
                energyCableHV,
                energyCableGaugeLV,
                energyCableGaugeMV,
                energyCableGaugeHV,
                cableTray,
                fluidPipe,
                fluidPipeGauge,
                energySwitch,
                valveLarge,
                conveyorV,
                conveyorVHopper,
                conveyorVInserter,
                hvIsolator,
                //Energy
                infinityGenerator,
                spanel,
                fpanel,
                sWindTurbine,
                turbinePillar,
                portableGenerator,
                batteryBank,
                electricPump,
                transformerHV,
                damTurbine,
                damGenerator,
                damAxis,
                highPressurePipe,
                //Machines
                steamBoiler,
                steamTurbine,
                //mining,
                //Railroad
                normalRail,
                boosterRail,
                crossingRail,
                detectorRail,
                loaderRail,
                railGate,
                bufferStopRail,
                cargoLoader,
                fluidLoader,
                //dummys
                dummy,
                //Fluids Block
                barrel,
                trash,
                gauge,
                energyLevel,
                gutter,
                //Patreons
                baseEotM,
                //Fluids
                steamBlock
        );

        GameRegistry.registerTileEntity(TileEntityOreVein.class, veinHematite.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityEnergySwitch.class, energySwitch.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityValvePipeLarge.class, valveLarge.getRegistryName());
        GameRegistry.registerTileEntity(energyCableLV.getTileEntityClass(), energyCableLV.getRegistryName());
        GameRegistry.registerTileEntity(energyCableMV.getTileEntityClass(), energyCableMV.getRegistryName());
        GameRegistry.registerTileEntity(energyCableHV.getTileEntityClass(), energyCableHV.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityEnergyCableLVGauge.class, energyCableGaugeLV.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityEnergyCableMVGauge.class, energyCableGaugeMV.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityEnergyCableHVGauge.class, energyCableGaugeHV.getRegistryName());
        GameRegistry.registerTileEntity(alarm.getTileEntityClass(), alarm.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityGutter.class, gutter.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityInfinityGenerator.class, infinityGenerator.getRegistryName());
        GameRegistry.registerTileEntity(spanel.getTileEntityClass(), spanel.getRegistryName());
        GameRegistry.registerTileEntity(TileEntitySolarPanelFrame.class, fpanel.getRegistryName());
        GameRegistry.registerTileEntity(TileEntitySmallWindTurbine.class, sWindTurbine.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityWindTurbinePillar.class, turbinePillar.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityFirstAidKit.class, firstAidKit.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityRecordPlayer.class, recordPlayer.getRegistryName());
        GameRegistry.registerTileEntity(sensorRain.getTileEntityClass(), sensorRain.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityCargoLoader.class, cargoLoader.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityFluidLoader.class, fluidLoader.getRegistryName());
        GameRegistry.registerTileEntity(loaderRail.getTileEntityClass(), loaderRail.getRegistryName());
        GameRegistry.registerTileEntity(signalIndicator.getTileEntityClass(), signalIndicator.getRegistryName());
        GameRegistry.registerTileEntity(trafficLight.getTileEntityClass(), trafficLight.getRegistryName());
        GameRegistry.registerTileEntity(fuseBox.getTileEntityClass(), fuseBox.getRegistryName());
        GameRegistry.registerTileEntity(fuseBoxConnector.getTileEntityClass(), fuseBoxConnector.getRegistryName());
        GameRegistry.registerTileEntity(flameDetector.getTileEntityClass(), flameDetector.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityLocker.class, locker.getRegistryName());
        GameRegistry.registerTileEntity(entityDetector.getTileEntityClass(), entityDetector.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityBarrel.class, barrel.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityGauge.class, gauge.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityEnergyLevel.class, energyLevel.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityElectricPump.class, electricPump.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityTransformerHV.class, transformerHV.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityDamTurbine.class, damTurbine.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityDamGenerator.class, damGenerator.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityDamAxis.class, damAxis.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityHighPressurePipe.class, highPressurePipe.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityBatteryBank.class, batteryBank.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityCableTray.class, cableTray.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityFluidPipe.class, fluidPipe.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityFluidPipeGauge.class, fluidPipeGauge.getRegistryName());
        GameRegistry.registerTileEntity(TileEntitySteamBoiler.class, steamBoiler.getRegistryName());
        GameRegistry.registerTileEntity(TileEntitySteamTurbine.class, steamTurbine.getRegistryName());
        //GameRegistry.registerTileEntity(TileEntityMining.class, mining.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityTrash.class, trash.getRegistryName());
        GameRegistry.registerTileEntity(bunkBed.getTileEntityClass(), bunkBed.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityBunkerHatch.class, bunkerHatch.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityChunkLoader.class, chunkLoader.getRegistryName());
        GameRegistry.registerTileEntity(catWalk.getTileEntityClass(), catWalk.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityCatWalkStair.class, catwalkStair.getRegistryName());
        GameRegistry.registerTileEntity(conveyorV.getTileEntityClass(), conveyorV.getRegistryName());
        GameRegistry.registerTileEntity(conveyorVHopper.getTileEntityClass(), conveyorVHopper.getRegistryName());
        GameRegistry.registerTileEntity(conveyorVInserter.getTileEntityClass(), conveyorVInserter.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityDamIntake.class, damIntake.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityDamOutFlow.class, damOutFlow.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityConcrete.class, concrete.getRegistryName());
        GameRegistry.registerTileEntity(hvIsolator.getTileEntityClass(), hvIsolator.getRegistryName());
        GameRegistry.registerTileEntity(TELathe.class, latheMachine.getRegistryName());
        GameRegistry.registerTileEntity(TileEntityPortableGenerator.class, portableGenerator.getRegistryName());
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                veinHematite.createItemBlock(),
                blockHazard.createItemBlock(),
                aisleHazard.createItemBlock(),
                cautionHazard.createItemBlock(),
                defectiveHazard.createItemBlock(),
                fireHazard.createItemBlock(),
                radiationHazard.createItemBlock(),
                safetyHazard.createItemBlock(),
                concrete.createItemBlock(),
                steelBlock.createItemBlock(),
                platform.createItemBlock(),
                roof.createItemBlock(),
                frame.createItemBlock(),
                hatch.createItemBlock(),
                bunkerHatch.createItemBlock(),
                window.createItemBlock(),
                catWalk.createItemBlock(),
                handRail.createItemBlock(),
                catwalkStair.createItemBlock(),
                iladder.createItemBlock(),
                catwalkGate.createItemBlock(),
                pillar.createItemBlock(),
                column.createItemBlock(),
                brace.createItemBlock(),
                catWalkSteel.createItemBlock(),
                handRailSteel.createItemBlock(),
                catwalkStairSteel.createItemBlock(),
                sladder.createItemBlock(),
                steel_pillar.createItemBlock(),
                columSteel.createItemBlock(),
                braceSteel.createItemBlock(),
                latheMachine.createItemBlock(),
                alarm.createItemBlock(),
                entityDetector.createItemBlock(),
                flameDetector.createItemBlock(),
                sensorRain.createItemBlock(),
                fuseBox.createItemBlock(),
                fuseBoxConduitExtension.createItemBlock(),
                fuseBoxConnector.createItemBlock(),
                signalIndicator.createItemBlock(),
                trafficLight.createItemBlock(),
                firstAidKit.createItemBlock(),
                recordPlayer.createItemBlock(),
                locker.createItemBlock(),
                bunkBed.createItemBlock(),
                gutter.createItemBlock(),
                blockChimney.createItemBlock(),
                scaffold.createItemBlock(),
                efence.createItemBlock(),
                bigFenceColumn.createItemBlock(),
                bigFenceCorner.createItemBlock(),
                concreteWall.createItemBlock(),
                bigFenceWire.createItemBlock(),
                egate.createItemBlock(),
                razorWire.createItemBlock(),
                damIntake.createItemBlock(),
                damOutFlow.createItemBlock(),
                signHV.createItemBlock(),
                fluorescent.createItemBlock(),
                light.createItemBlock(),
                blockIndFloor.createItemBlock(),
                hvIsolator.createItemBlock(),
                energyCableLV.createItemBlock(),
                energyCableMV.createItemBlock(),
                energyCableHV.createItemBlock(),
                cableTray.createItemBlock(),
                fluidPipe.createItemBlock(),
                energySwitch.createItemBlock(),
                valveLarge.createItemBlock(),
                infinityGenerator.createItemBlock(),
                spanel.createItemBlock(),
                fpanel.createItemBlock(),
                sWindTurbine.createItemBlock(),
                turbinePillar.createItemBlock(),
                portableGenerator.createItemBlock(),
                normalRail.createItemBlock(),
                boosterRail.createItemBlock(),
                crossingRail.createItemBlock(),
                detectorRail.createItemBlock(),
                loaderRail.createItemBlock(),
                railGate.createItemBlock(),
                bufferStopRail.createItemBlock(),
                cargoLoader.createItemBlock(),
                fluidLoader.createItemBlock(),
                gauge.createItemBlock(),
                energyLevel.createItemBlock(),
                buttonRed.createItemBlock(),
                batteryBank.createItemBlock(),
                electricPump.createItemBlock(),
                trash.createItemBlock(),
                transformerHV.createItemBlock(),
                damTurbine.createItemBlock(),
                damGenerator.createItemBlock(),
                damAxis.createItemBlock(),
                highPressurePipe.createItemBlock(),
                steamBoiler.createItemBlock(),
                steamTurbine.createItemBlock(),
                //mining.createItemBlock(),
                baseEotM.createItemBlock(),
                chunkLoader.createItemBlock(),
                conveyorV.createItemBlock(),
                steamBlock.createItemBlock()
        );
    }

    public static void registerItemModels() {
        veinHematite.registerItemModel(Item.getItemFromBlock(veinHematite));
        blockHazard.registerItemModel(Item.getItemFromBlock(blockHazard));
        blockIndFloor.registerItemModel(Item.getItemFromBlock(blockIndFloor));
        blockChimney.registerItemModel(Item.getItemFromBlock(blockChimney));
        normalRail.registerItemModel(Item.getItemFromBlock(normalRail));
        crossingRail.registerItemModel(Item.getItemFromBlock(crossingRail));
        detectorRail.registerItemModel(Item.getItemFromBlock(detectorRail));
        boosterRail.registerItemModel(Item.getItemFromBlock(boosterRail));
        energySwitch.registerItemModel(Item.getItemFromBlock(energySwitch));
        valveLarge.registerItemModel(Item.getItemFromBlock(valveLarge));
        latheMachine.registerItemModel(Item.getItemFromBlock(latheMachine));
        alarm.registerItemModel(Item.getItemFromBlock(alarm));
        cableTray.registerItemModel(Item.getItemFromBlock(cableTray));
        fluidPipe.registerItemModel(Item.getItemFromBlock(fluidPipe));
        energyCableLV.registerItemModel(Item.getItemFromBlock(energyCableLV));
        energyCableMV.registerItemModel(Item.getItemFromBlock(energyCableMV));
        energyCableHV.registerItemModel(Item.getItemFromBlock(energyCableHV));
        catWalk.registerItemModel(Item.getItemFromBlock(catWalk));
        catwalkStair.registerItemModel(Item.getItemFromBlock(catwalkStair));
        pillar.registerItemModel(Item.getItemFromBlock(pillar));
        column.registerItemModel(Item.getItemFromBlock(column));
        iladder.registerItemModel(Item.getItemFromBlock(iladder));
        roof.registerItemModel(Item.getItemFromBlock(roof));
        bunkBed.registerItemModel(Item.getItemFromBlock(bunkBed));
        bunkerHatch.registerItemModel(Item.getItemFromBlock(bunkerHatch));
        gutter.registerItemModel(Item.getItemFromBlock(gutter));
        light.registerItemModel(Item.getItemFromBlock(light));
        fluorescent.registerItemModel(Item.getItemFromBlock(fluorescent));
        catwalkGate.registerItemModel(Item.getItemFromBlock(catwalkGate));
        hatch.registerItemModel(Item.getItemFromBlock(hatch));
        window.registerItemModel(Item.getItemFromBlock(window));
        platform.registerItemModel(Item.getItemFromBlock(platform));
        brace.registerItemModel(Item.getItemFromBlock(brace));
        scaffold.registerItemModel(Item.getItemFromBlock(scaffold));
        frame.registerItemModel(Item.getItemFromBlock(frame));
        efence.registerItemModel(Item.getItemFromBlock(efence));
        bigFenceColumn.registerItemModel(Item.getItemFromBlock(bigFenceColumn));
        bigFenceCorner.registerItemModel(Item.getItemFromBlock(bigFenceCorner));
        bigFenceWire.registerItemModel(Item.getItemFromBlock(bigFenceWire));
        concreteWall.registerItemModel(Item.getItemFromBlock(concreteWall));
        egate.registerItemModel(Item.getItemFromBlock(egate));
        razorWire.registerItemModel(Item.getItemFromBlock(razorWire));
        damIntake.registerItemModel(Item.getItemFromBlock(damIntake));
        damOutFlow.registerItemModel(Item.getItemFromBlock(damOutFlow));
        infinityGenerator.registerItemModel(Item.getItemFromBlock(infinityGenerator));
        spanel.registerItemModel(Item.getItemFromBlock(spanel));
        fpanel.registerItemModel(Item.getItemFromBlock(fpanel));
        sWindTurbine.registerItemModel(Item.getItemFromBlock(sWindTurbine));
        turbinePillar.registerItemModel(Item.getItemFromBlock(turbinePillar));
        portableGenerator.registerItemModel(Item.getItemFromBlock(portableGenerator));
        firstAidKit.registerItemModel(Item.getItemFromBlock(firstAidKit));
        bufferStopRail.registerItemModel(Item.getItemFromBlock(bufferStopRail));
        signHV.registerItemModel(Item.getItemFromBlock(signHV));
        recordPlayer.registerItemModel(Item.getItemFromBlock(recordPlayer));
        sensorRain.registerItemModel(Item.getItemFromBlock(sensorRain));
        loaderRail.registerItemModel(Item.getItemFromBlock(loaderRail));
        railGate.registerItemModel(Item.getItemFromBlock(railGate));
        cargoLoader.registerItemModel(Item.getItemFromBlock(cargoLoader));
        fluidLoader.registerItemModel(Item.getItemFromBlock(fluidLoader));
        signalIndicator.registerItemModel(Item.getItemFromBlock(signalIndicator));
        trafficLight.registerItemModel(Item.getItemFromBlock(trafficLight));
        fuseBox.registerItemModel(Item.getItemFromBlock(fuseBox));
        fuseBoxConduitExtension.registerItemModel(Item.getItemFromBlock(fuseBoxConduitExtension));
        fuseBoxConnector.registerItemModel(Item.getItemFromBlock(fuseBoxConnector));
        cautionHazard.registerItemModel(Item.getItemFromBlock(cautionHazard));
        defectiveHazard.registerItemModel(Item.getItemFromBlock(defectiveHazard));
        safetyHazard.registerItemModel(Item.getItemFromBlock(safetyHazard));
        radiationHazard.registerItemModel(Item.getItemFromBlock(radiationHazard));
        aisleHazard.registerItemModel(Item.getItemFromBlock(aisleHazard));
        fireHazard.registerItemModel(Item.getItemFromBlock(fireHazard));
        handRail.registerItemModel(Item.getItemFromBlock(handRail));
        flameDetector.registerItemModel(Item.getItemFromBlock(flameDetector));
        locker.registerItemModel(Item.getItemFromBlock(locker));
        entityDetector.registerItemModel(Item.getItemFromBlock(entityDetector));
        steel_pillar.registerItemModel(Item.getItemFromBlock(steel_pillar));
        braceSteel.registerItemModel(Item.getItemFromBlock(braceSteel));
        columSteel.registerItemModel(Item.getItemFromBlock(columSteel));
        concrete.registerItemModel(Item.getItemFromBlock(concrete));
        steelBlock.registerItemModel(Item.getItemFromBlock(steelBlock));
        catWalkSteel.registerItemModel(Item.getItemFromBlock(catWalkSteel));
        handRailSteel.registerItemModel(Item.getItemFromBlock(handRailSteel));
        sladder.registerItemModel(Item.getItemFromBlock(sladder));
        catwalkStairSteel.registerItemModel(Item.getItemFromBlock(catwalkStairSteel));
        barrel.registerItemModel(Item.getItemFromBlock(barrel));
        trash.registerItemModel(Item.getItemFromBlock(trash));
        gauge.registerItemModel(Item.getItemFromBlock(gauge));
        energyLevel.registerItemModel(Item.getItemFromBlock(energyLevel));
        buttonRed.registerItemModel(Item.getItemFromBlock(buttonRed));
        batteryBank.registerItemModel(Item.getItemFromBlock(batteryBank));
        electricPump.registerItemModel(Item.getItemFromBlock(electricPump));
        transformerHV.registerItemModel(Item.getItemFromBlock(transformerHV));
        damTurbine.registerItemModel(Item.getItemFromBlock(damTurbine));
        damGenerator.registerItemModel(Item.getItemFromBlock(damGenerator));
        damAxis.registerItemModel(Item.getItemFromBlock(damAxis));
        highPressurePipe.registerItemModel(Item.getItemFromBlock(highPressurePipe));
        steamBoiler.registerItemModel(Item.getItemFromBlock(steamBoiler));
        steamTurbine.registerItemModel(Item.getItemFromBlock(steamTurbine));
        //mining.registerItemModel(Item.getItemFromBlock(mining));
        baseEotM.registerItemModel(Item.getItemFromBlock(baseEotM));
        chunkLoader.registerItemModel(Item.getItemFromBlock(chunkLoader));
        conveyorV.registerItemModel(Item.getItemFromBlock(conveyorV));
        hvIsolator.registerItemModel(Item.getItemFromBlock(hvIsolator));
        steamBlock.registerItemModel(Item.getItemFromBlock(steamBlock));
    }

    public static void registerOreDict()
    {
        steelBlock.initOreDict();
    }
}
