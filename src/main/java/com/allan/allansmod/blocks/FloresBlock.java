package com.brewdog.brewdogsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class teacherBlock extends Block {
    private static final int hardness = 5;
    private static final float resistance = 6.0f;
    private static final SoundType sound = SoundType.SAND;
    private static final int harvestLevel = 1; //0-4(wood-diamond)
    private static final ToolType tool = ToolType.PICKAXE;

    public teacherBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(hardness,resistance)
                .sound(sound)
                .harvestLevel(harvestLevel)
                .harvestTool(tool)
        );
    }
}
