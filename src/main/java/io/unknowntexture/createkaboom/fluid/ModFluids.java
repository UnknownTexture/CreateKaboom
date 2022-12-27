package io.unknowntexture.createkaboom.fluid;


import io.unknowntexture.createkaboom.CreateKaboom;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation ALCOHOL_FLUID_STILL = new ResourceLocation("createkaboom:fluid/alcohol_fluid");

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateKaboom.MOD_ID);

    public static final RegistryObject<ForgeFlowingFluid> ALCOHOL_FLUID
            = FLUIDS.register("alcohol_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.ALCOHOL_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> ALCOHOL_FLOWING
            = FLUIDS.register("alcohol_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.ALCOHOL_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ALCOHOL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> ALCOHOL_FLUID.get(), () -> ALCOHOL_FLOWING.get(), FluidAttributes.builder(ALCOHOL_FLUID_STILL, null)
            .density(10).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK)
    ).slopeFindDistance(2).levelDecreasePerBlock(2);

    public static final ResourceLocation GUNPOWDER_SAND_FLUID_STILL = new ResourceLocation("createkaboom:fluid/gunpowder_sand_fluid");

    public static final RegistryObject<ForgeFlowingFluid> GUNPOWDER_SAND_FLUID
            = FLUIDS.register("gunpowder_sand_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.GUNPOWDER_SAND_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> GUNPOWDER_SAND_FLOWING
            = FLUIDS.register("gunpowder_sand_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.GUNPOWDER_SAND_PROPERTIES));

    public static final ForgeFlowingFluid.Properties GUNPOWDER_SAND_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> GUNPOWDER_SAND_FLUID.get(), () -> GUNPOWDER_SAND_FLOWING.get(), FluidAttributes.builder(GUNPOWDER_SAND_FLUID_STILL, null)
            .density(15).luminosity(2).viscosity(7).sound(SoundEvents.HONEY_DRINK)).slopeFindDistance(2).levelDecreasePerBlock(10);

    public static final ResourceLocation MOLTEN_GLASS_FLUID_STILL = new ResourceLocation("createkaboom:fluid/molten_glass_fluid");

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_GLASS_FLUID
            = FLUIDS.register("molten_glass_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GLASS_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_GLASS_FLOWING
            = FLUIDS.register("molten_glass_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GLASS_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_GLASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_GLASS_FLUID.get(), () -> MOLTEN_GLASS_FLOWING.get(), FluidAttributes.builder(MOLTEN_GLASS_FLUID_STILL, null)
            .density(20).luminosity(2).viscosity(9).sound(SoundEvents.HONEY_DRINK)).slopeFindDistance(2).levelDecreasePerBlock(10);

    public static final ResourceLocation MOLTEN_IRON_FLUID_STILL = new ResourceLocation("createkaboom:fluid/molten_iron_fluid");

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_IRON_FLUID
            = FLUIDS.register("molten_iron_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_IRON_FLOWING
            = FLUIDS.register("molten_iron_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_IRON_FLUID.get(), () -> MOLTEN_IRON_FLOWING.get(), FluidAttributes.builder(MOLTEN_IRON_FLUID_STILL, null)
            .density(20).luminosity(2).viscosity(9).sound(SoundEvents.HONEY_DRINK)).slopeFindDistance(2).levelDecreasePerBlock(10);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }


}
