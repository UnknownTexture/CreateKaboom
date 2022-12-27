package io.unknowntexture.createkaboom.item;

import com.ibm.icu.text.AlphabeticIndex;
import io.unknowntexture.createkaboom.CreateKaboom;
import io.unknowntexture.createkaboom.fluid.ModFluids;
import io.unknowntexture.createkaboom.item.custom.ThrowableBombItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateKaboom.MOD_ID);

    // Throwable Bombs
    public static final RegistryObject<Item> IRON_BOMB = ITEMS.register("iron_bomb",
            () -> new ThrowableBombItem(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB).stacksTo(8)));

    public static final RegistryObject<Item> GLASS_BOMB = ITEMS.register("glass_bomb",
            () -> new ThrowableBombItem(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB).stacksTo(8)));

    // Throwable Bomb Crafting Stages

    public static final RegistryObject<Item> GLASS_SHELL = ITEMS.register("glass_shell",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB)));
    
    public static final RegistryObject<Item> INCOMPLETE_GLASS_BOMB = ITEMS.register("incomplete_glass_bomb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB)));



    // Buckets

    public static final RegistryObject<Item> ALCOHOL_BUCKET = ITEMS.register("alcohol_bucket",
            () -> new BucketItem(ModFluids.ALCOHOL_FLUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GUNPOWDER_BUCKET = ITEMS.register("gunpowder_bucket",
            () -> new BucketItem(ModFluids.GUNPOWDER_SAND_FLUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_GLASS_BUCKET = ITEMS.register("molten_glass_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_GLASS_FLUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_IRON_FLUID, new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
