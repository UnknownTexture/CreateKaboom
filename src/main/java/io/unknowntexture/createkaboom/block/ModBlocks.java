package io.unknowntexture.createkaboom.block;

import io.unknowntexture.createkaboom.CreateKaboom;
import io.unknowntexture.createkaboom.block.custom.GunpowderBarrel;
import io.unknowntexture.createkaboom.block.custom.SandCastingBlock;
import io.unknowntexture.createkaboom.item.ModCreativeModeTab;
import io.unknowntexture.createkaboom.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateKaboom.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

//PLEASE space out the block properties (if you can)
    public static final RegistryObject<Block> SAND_CASTING_BLOCK = registerBlock("sand_casting_block",
            () -> new SandCastingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)
            .noOcclusion()),
            ModCreativeModeTab.CREATE_KABOOM_TAB);

    public static final RegistryObject<Block> GUNPOWDER_BARREL = registerBlock("gunpowder_barrel",
            () -> new GunpowderBarrel(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
            ModCreativeModeTab.CREATE_KABOOM_TAB);
}
