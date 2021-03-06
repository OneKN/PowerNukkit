package cn.nukkit.block;

import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

public class BlockStairsSmoothQuartz extends BlockStairs {
    public BlockStairsSmoothQuartz() {
        this(0);
    }

    public BlockStairsSmoothQuartz(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return SMOOTH_QUARTZ_STAIRS;
    }

    @Override
    public double getHardness() {
        return 1.5;
    }

    @Override
    public double getResistance() {
        return 30;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public String getName() {
        return "Smooth Quartz Brick Stairs";
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.QUARTZ_BLOCK_COLOR;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}
