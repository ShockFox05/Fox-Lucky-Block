package net.ShockFox05.FoxLuckyBlock.item;

import net.ShockFox05.FoxLuckyBlock.block.ModBlocks;
import net.ShockFox05.FoxLuckyBlock.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier LUCKY_FOX = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_FOX_LUCKY_TOOL,
            1561, 9.0F, 4.0F, 15, () -> Ingredient.of(ModBlocks.FOX_LUCKY_BLOCK));
}
