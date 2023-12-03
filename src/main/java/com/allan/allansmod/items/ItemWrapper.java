package com.brewdog.brewdogsmod.items;

import com.brewdog.brewdogsmod.util.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemWrapper extends Item {
    public static final ItemGroup brewdogS_ITEM_GROUP = new ItemGroup("brewdogs_item_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.RED_SWORD.get());
        }
    };
    public ItemWrapper() {
        super(new Item.Properties().group(brewdogS_ITEM_GROUP));
    }
}
