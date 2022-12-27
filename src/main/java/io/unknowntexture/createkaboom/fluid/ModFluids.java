package io.unknowntexture.createkaboom.fluid;


import io.unknowntexture.createkaboom.CreateKaboom;
import io.unknowntexture.createkaboom.block.ModBlocks;
import io.unknowntexture.createkaboom.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    // Alcohol
    public static final ResourceLocation ALCOHOL_FLUID_STILL = new ResourceLocation("createkaboom:fluid/alcohol_fluid");
    public static final ResourceLocation ALCOHOL_FLUID_FLOWING = new ResourceLocation("createkaboom:fluid/alcohol_flowing");

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateKaboom.MOD_ID);

    public static final RegistryObject<ForgeFlowingFluid> ALCOHOL_FLUID
            = FLUIDS.register("alcohol_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.ALCOHOL_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> ALCOHOL_FLOWING
            = FLUIDS.register("alcohol_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.ALCOHOL_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ALCOHOL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> ALCOHOL_FLUID.get(), () -> ALCOHOL_FLOWING.get(), FluidAttributes.builder(ALCOHOL_FLUID_STILL, ALCOHOL_FLUID_FLOWING)
            .density(10).luminosity(2).viscosity(5).sound(SoundEvents.BOAT_PADDLE_WATER)
    ).slopeFindDistance(2).levelDecreasePerBlock(2) .block(() -> ModFluids.ALCOHOL_BLOCK.get()).bucket(() -> ModItems.ALCOHOL_BUCKET.get());

    public static final RegistryObject<LiquidBlock> ALCOHOL_BLOCK = ModBlocks.BLOCKS.register("alcohol",
            () -> new LiquidBlock(() -> ModFluids.ALCOHOL_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    // Gunpowder Sand
    public static final ResourceLocation GUNPOWDER_SAND_FLUID_STILL = new ResourceLocation("createkaboom:fluid/gunpowder_sand_fluid");

    public static final RegistryObject<ForgeFlowingFluid> GUNPOWDER_SAND_FLUID
            = FLUIDS.register("gunpowder_sand_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.GUNPOWDER_SAND_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> GUNPOWDER_SAND_FLOWING
            = FLUIDS.register("gunpowder_sand_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.GUNPOWDER_SAND_PROPERTIES));

    public static final ForgeFlowingFluid.Properties GUNPOWDER_SAND_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> GUNPOWDER_SAND_FLUID.get(), () -> GUNPOWDER_SAND_FLOWING.get(), FluidAttributes.builder(GUNPOWDER_SAND_FLUID_STILL, null)
            .density(15).luminosity(2).viscosity(7).sound(SoundEvents.SAND_HIT)).slopeFindDistance(2).levelDecreasePerBlock(10) .block(() -> ModFluids.GUNPOWDER_SAND_BLOCK.get()).bucket(() -> ModItems.GUNPOWDER_BUCKET.get());;
    public static final RegistryObject<LiquidBlock> GUNPOWDER_SAND_BLOCK = ModBlocks.BLOCKS.register("gunpowder_sand",
            () -> new LiquidBlock(() -> ModFluids.GUNPOWDER_SAND_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    // Molten Glass
    public static final ResourceLocation MOLTEN_GLASS_FLUID_STILL = new ResourceLocation("createkaboom:fluid/molten_glass_fluid");
    public static final ResourceLocation MOLTEN_GLASS_FLUID_FLOWING = new ResourceLocation("createkaboom:fluid/molten_glass_flowing");

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_GLASS_FLUID
            = FLUIDS.register("molten_glass_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GLASS_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_GLASS_FLOWING
            = FLUIDS.register("molten_glass_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GLASS_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_GLASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_GLASS_FLUID.get(), () -> MOLTEN_GLASS_FLOWING.get(), FluidAttributes.builder(MOLTEN_GLASS_FLUID_STILL, MOLTEN_GLASS_FLUID_FLOWING)
            .density(20).luminosity(2).viscosity(9).sound(SoundEvents.HONEY_DRINK)).slopeFindDistance(2).levelDecreasePerBlock(10) .block(() -> ModFluids.MOLTEN_GLASS_BLOCK.get()).bucket(() -> ModItems.MOLTEN_GLASS_BUCKET.get());
    public static final RegistryObject<LiquidBlock> MOLTEN_GLASS_BLOCK = ModBlocks.BLOCKS.register("molten_glass",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_GLASS_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    // Molten Iron
    public static final ResourceLocation MOLTEN_IRON_FLUID_STILL = new ResourceLocation("createkaboom:fluid/molten_iron_fluid");
    public static final ResourceLocation MOLTEN_IRON_FLUID_FLOWING = new ResourceLocation("createkaboom:fluid/molten_iron_flowing");

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_IRON_FLUID
            = FLUIDS.register("molten_iron_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_IRON_FLOWING
            = FLUIDS.register("molten_iron_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_IRON_FLUID.get(), () -> MOLTEN_IRON_FLOWING.get(), FluidAttributes.builder(MOLTEN_IRON_FLUID_STILL, MOLTEN_IRON_FLUID_FLOWING)
            .density(20).luminosity(2).viscosity(9).sound(SoundEvents.HONEY_DRINK)).slopeFindDistance(2).levelDecreasePerBlock(10) .block(() -> ModFluids.MOLTEN_IRON_BLOCK.get()).bucket(() -> ModItems.MOLTEN_IRON_BUCKET.get());
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = ModBlocks.BLOCKS.register("molten_iron",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_IRON_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }


}
