package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

import javax.annotation.Nonnull;

/**
 * @author Pub4Game
 * @since 26.12.2015
 */
public class BlockIronTrapdoor extends BlockTrapdoor {

    public BlockIronTrapdoor() {
        this(0);
    }

    public BlockIronTrapdoor(int meta) {
        super(meta);
    }

    @Override
    public BlockID getId() {
        return BlockID.IRON_TRAPDOOR;
    }

    @Override
    public String getName() {
        return "Iron Trapdoor";
    }

    @Override
    public double getHardness() {
        return 5;
    }

    @Override
    public double getResistance() {
        return 25;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.IRON_BLOCK_COLOR;
    }

    @Override
    public boolean onActivate(@Nonnull Item item, Player player) {
        return false;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    @Override
    @PowerNukkitOnly
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.IRON_TRAPDOOR);
    }
}