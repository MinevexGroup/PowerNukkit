package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.blockproperty.BlockProperties;
import cn.nukkit.blockproperty.value.StoneSlab4Type;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

import javax.annotation.Nonnull;

@PowerNukkitOnly
public class BlockDoubleStoneBlockSlab4 extends BlockDoubleSlabBase {
    @PowerNukkitOnly public static final int MOSSY_STONE_BRICKS = 0;
    @PowerNukkitOnly public static final int SMOOTH_QUARTZ = 1;
    @PowerNukkitOnly public static final int STONE = 2;
    @PowerNukkitOnly public static final int CUT_SANDSTONE = 3;
    @PowerNukkitOnly public static final int CUT_RED_SANDSTONE = 4;

    @PowerNukkitOnly
    public BlockDoubleStoneBlockSlab4() {
        this(0);
    }

    @PowerNukkitOnly
    public BlockDoubleStoneBlockSlab4(int meta) {
        super(meta);
    }

    @Override
    public BlockID getId() {
        return BlockID.DOUBLE_STONE_BLOCK_SLAB4;
    }

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    @Nonnull
    @Override
    public BlockProperties getProperties() {
        return BlockStoneBlockSlab4.PROPERTIES;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public StoneSlab4Type getSlabType() {
        return getPropertyValue(StoneSlab4Type.PROPERTY);
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public void setSlabType(StoneSlab4Type type) {
        setPropertyValue(StoneSlab4Type.PROPERTY, type);
    }

    @PowerNukkitOnly
    @Override
    public String getSlabName() {
        return getSlabType().getEnglishName();
    }

    @Override
    public double getResistance() {
        return getToolType() > ItemTool.TIER_WOODEN ? 30 : 15;
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
        return BlockID.STONE_BLOCK_SLAB4;
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.STONE_BLOCK_SLAB4);
    }

    @Override
    @PowerNukkitOnly
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }

    @Override
    public BlockColor getColor() {
        return getSlabType().getColor();
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}