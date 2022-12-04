package io.unknowntexture.createkaboom.item;

import io.unknowntexture.createkaboom.CreateKaboom;
import io.unknowntexture.createkaboom.item.custom.ThrowableBombItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateKaboom.MOD_ID);

    public static final RegistryObject<Item> IRON_BOMB = ITEMS.register("iron_bomb",
            () -> new ThrowableBombItem(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB)));

    public static final RegistryObject<Item> GLASS_SHELL = ITEMS.register("glass_shell",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB)));
    
    public static final RegistryObject<Item> INCOMPLETE_GLASS_BOMB = ITEMS.register("incomplete_glass_bomb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB)));

    public static final RegistryObject<Item> GLASS_BOMB = ITEMS.register("glass_bomb",
            () -> new ThrowableBombItem(new Item.Properties().tab(ModCreativeModeTab.CREATE_KABOOM_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
