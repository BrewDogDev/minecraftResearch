package com.brewdog.brewdogsmod.util;


import com.brewdog.brewdogsmod.ModName;
import com.brewdog.brewdogsmod.blocks.brewdogBlock;
import com.brewdog.brewdogsmod.blocks.BlockItemBase;
import com.brewdog.brewdogsmod.blocks.teacherBlock;
import com.brewdog.brewdogsmod.items.ItemWrapper;
import com.brewdog.brewdogsmod.items.Red_Sword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TieredItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModName.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, ModName.MOD_ID );

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> BASIC_ITEM = ITEMS.register("basic_item", ItemWrapper::new);
    public static final RegistryObject<Item> RED_SWORD = ITEMS.register("red_sword", Red_Sword::new);


    //blocks
    public static final RegistryObject<Block> brewdog_BLOCK = BLOCKS.register("brewdog_block", brewdogBlock::new);

    public static final RegistryObject<Block> teacher_BLOCK = BLOCKS.register("teacher_block", teacherBlock::new);

    //block Items
    public static final RegistryObject<Item> brewdog_BLOCK_ITEM = ITEMS.register("brewdog_block", ()->new BlockItemBase(brewdog_BLOCK.get()));

    public static final RegistryObject<Item> teacher_BLOCK_ITEM = ITEMS.register("teacher_block", ()->new BlockItemBase(teacher_BLOCK.get()));






}
