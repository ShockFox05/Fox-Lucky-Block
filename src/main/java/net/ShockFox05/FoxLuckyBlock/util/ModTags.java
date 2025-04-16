package net.ShockFox05.FoxLuckyBlock.util;

import net.ShockFox05.FoxLuckyBlock.FoxLuckyBlockSFMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> FOX_LUCKY_BLOCK_BLOCKS = createTag("fox_lucky_block_blocks");
        public static final TagKey<Block> NEEDS_FOX_LUCKY_TOOL = createTag("needs_fox_lucky_tool");
        public static final TagKey<Block> INCORRECT_FOR_FOX_LUCKY_TOOL = createTag("incorrect_for_fox_lucky_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(FoxLuckyBlockSFMod.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> LUCKY_FOX_SWORD = createTag("lucky_fox_sword");
        public static final TagKey<Item> FOX_LUCKY_BLOCK_ITEMS = createTag("fox_lucky_block_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(FoxLuckyBlockSFMod.MOD_ID, name));
        }
    }
}
