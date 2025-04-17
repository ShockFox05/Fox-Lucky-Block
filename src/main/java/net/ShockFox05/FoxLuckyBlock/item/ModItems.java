package net.ShockFox05.FoxLuckyBlock.item;

import net.ShockFox05.FoxLuckyBlock.FoxLuckyBlockSFMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FoxLuckyBlockSFMod.MOD_ID);

    public static final DeferredItem<SwordItem> LUCKY_FOX_SWORD = ITEMS.register("lucky_fox_sword",
            () -> new SwordItem(ModToolTiers.LUCKY_FOX, new  Item
                    .Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.LUCKY_FOX, 3,-2.4F)
                    )));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
