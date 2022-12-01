package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

/**
 * @author xtypr
 * @since 2015/11/25
 */
public class BlockOakStairs extends BlockStairs {
    public BlockOakStairs() {
        this(0);
    }

    public BlockOakStairs(int meta) {
        super(meta);
    }

    @Override
    public BlockID getId() {
        return BlockID.OAK_STAIRS;
    }

    @Override
    public String getName() {
        return "Wood Stairs";
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }

    @Override
    public double getHardness() {
        return 2;
    }

    @Override
    public double getResistance() {
        return 3;
    }

    @Override
    public int getBurnChance() {
        return 5;
    }

    @Override
    public int getBurnAbility() {
        return 20;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.WOOD_BLOCK_COLOR;
    }
    @Override
    public Item[] getDrops(Item item) {
         return new Item[]{
            toItem()
            };
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.OAK_STAIRS);
    }
}