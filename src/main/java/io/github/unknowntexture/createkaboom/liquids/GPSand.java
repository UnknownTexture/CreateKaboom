
    public static final RegistryObject<ForgeFlowingFluid> GUNPOWDER_SAND_FLUID
            = FLUIDS.register("GUNPOWDER_SAND_FLUID", () -> new ForgeFlowingFluid.Source(FluidRegistry.GUNPOWDER_SAND_PROPERTIES));

    public static final RegistryObject<ForgeFlowingFluid> GUNPOWDER_SAND_FLOWING
            = FLUIDS.register("GUNPOWDER_SAND_FLOWING", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.GUNPOWDER_SAND_PROPERTIES));


    public static final ForgeFlowingFluid.Properties GUNPOWDER_SAND_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> GUNPOWDER_SAND_FLUID.get(), () -> GUNPOWDER_SAND_FLOWING.get(), FluidAttributes.builder(GUNPOWDER_SAND_FLUID_STILL, null)
            .density(15).luminosity(2).viscosity(7.5).sound(SoundEvents.HONEY_DRINK)
            ).slopeFindDistance(2).levelDecreasePerBlock(10);
