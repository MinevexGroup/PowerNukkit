package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.blockproperty.BlockProperties;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

import javax.annotation.Nonnull;

@PowerNukkitOnly
@Since("1.4.0.0-PN")
public class BlockBlackstoneDoubleSlab extends BlockDoubleSlabBase {
    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public BlockBlackstoneDoubleSlab() {
        this(0);
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    protected BlockBlackstoneDoubleSlab(int meta) {
        super(meta);
    }

    @PowerNukkitOnly
    @Override
    public String getSlabName() {
        return "Double Blackstone Slab";
    }

    @Override
    public BlockID getId() {
        return BlockID.BLACKSTONE_DOUBLE_SLAB;
    }

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    @Nonnull
    @Override
    public BlockProperties getProperties() {
        return BlockSlab.SIMPLE_SLAB_PROPERTIES;
    }

    @Override
    public double getResistance() {
        return 6;
    }

    @Override
    public double getHardness() {
        return 2;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @PowerNukkitOnly
    @Override
    public BlockID getSingleSlabId() {
        return BlockID.BLACKSTONE_SLAB;
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.BLACKSTONE_SLAB);
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.BLACK_BLOCK_COLOR;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}