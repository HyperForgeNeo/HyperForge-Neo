package com.hyperforgeneo.hyperforgeneo.item;

import com.hyperforgeneo.hyperforgeneo.HyperForgeNeo;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HyperForgeNeo.MODID);

    public static final DeferredItem<Item> RING = ITEMS.register("ring",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_EMERALD = ITEMS.register("red_emerald",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
