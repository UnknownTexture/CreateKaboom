package io.github.unknowntexture.createkaboom.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_KABOOM_TAB = new CreativeModeTab("createkaboomtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.IRON_BOMB.get());
        }
    };
}
