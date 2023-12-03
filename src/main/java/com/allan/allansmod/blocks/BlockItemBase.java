package com.brewdog.brewdogsmod.blocks;

import com.brewdog.brewdogsmod.items.ItemWrapper;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;


public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ItemWrapper.brewdogS_ITEM_GROUP));
    }
}
