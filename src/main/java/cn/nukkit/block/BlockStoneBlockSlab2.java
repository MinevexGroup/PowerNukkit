package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.blockproperty.BlockProperties;
import cn.nukkit.blockproperty.value.StoneSlab2Type;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

import javax.annotation.Nonnull;

/**
 * @author CreeperFace
 * @since 26. 11. 2016
 */
public class BlockStoneBlockSlab2 extends BlockSlab {
    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public static final BlockProperties PROPERTIES = new BlockProperties(
            StoneSlab2Type.PROPERTY,
            TOP_SLOT_PROPERTY
    );

    public static final int RED_SANDSTONE = 0;
    public static final int PURPUR = 1;
    @PowerNukkitOnly public static final int PRISMARINE = 2;
    @PowerNukkitOnly public static final int PRISMARINE_BRICKS = 3;
    @PowerNukkitOnly public static final int DARK_PRISMARINE = 4;
    @PowerNukkitOnly public static final int MOSSY_COBBLESTONE = 5;
    @PowerNukkitOnly public static final int SMOOTH_SANDSTONE = 6;
    @PowerNukkitOnly public static final int RED_NETHER_BRICK = 7;

    public BlockStoneBlockSlab2() {
        this(0);
    }

    public BlockStoneBlockSlab2(int meta) {
        super(meta, BlockID.DOUBLE_STONE_BLOCK_SLAB2);
    }

    @Override
    public BlockID getId() {
        return BlockID.STONE_BLOCK_SLAB2;
    }

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    @Nonnull
    @Override
    public BlockProperties getProperties() {
        return PROPERTIES;
    }

    @PowerNukkitOnly
    @Override
    public String getSlabName() {
        return getSlabType().getEnglishName();
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public StoneSlab2Type getSlabType() {
        return getPropertyValue(StoneSlab2Type.PROPERTY);
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public void setSlabType(StoneSlab2Type type) {
        setPropertyValue(StoneSlab2Type.PROPERTY, type);
    }

    @PowerNukkitOnly
    @Override
    public boolean isSameType(BlockSlab slab) {
        return slab.getId() == getId() && getSlabType().equals(slab.getPropertyValue(StoneSlab2Type.PROPERTY));
    }

    @Override
    public BlockColor getColor() {
        return getSlabType().getColor();
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    @PowerNukkitOnly
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.STONE_BLOCK_SLAB2, this.getDamage());
    }
}