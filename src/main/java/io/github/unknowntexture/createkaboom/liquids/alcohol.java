package io.github.unkowntexture.createkaboom.liquids;

    public static final RegistryObject<ForgeFlowingFluid> ALCOHOL_FLUID
            = FLUIDS.register("alcohol_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.ALCOHOL_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> ALCoHOL_FLOWING
            = FLUIDS.register("alcohol_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.ALCOHOL_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ALCOHOL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> ALCOHOL_FLUID.get(), () -> ALCOHOL_FLOWING.get(), FluidAttributes.builder(ALCOHOL_STILL, null)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK)
            ).slopeFindDistance(2).levelDecreasePerBlock(2);
