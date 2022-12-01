package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.blockproperty.BlockProperties;
import cn.nukkit.blockproperty.value.WoodType;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

import javax.annotation.Nonnull;

/**
 * @author xtypr
 * @since 2015/12/2
 */
public class BlockWoodenSlab extends BlockSlab {
    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public static final BlockProperties PROPERTIES = new BlockProperties(
            WoodType.PROPERTY,
            TOP_SLOT_PROPERTY
    );

    public BlockWoodenSlab() {
        this(0);
    }

    public BlockWoodenSlab(int meta) {
        super(meta, BlockID.DOUBLE_WOODEN_SLAB);
    }

    @Override
    public String getName() {
        return (isOnTop() ? "Upper " : "") + getSlabName() + " Wood Slab";
    }

    @PowerNukkitOnly
    @Override
    public String getSlabName() {
        return getWoodType().getEnglishName();
    }

    @Override
    public BlockID getId() {
        return BlockID.WOODEN_SLAB;
    }

    @PowerNukkitOnly
    @Override
    public boolean isSameType(BlockSlab slab) {
        return slab.getId() == getId() && slab.getPropertyValue(WoodType.PROPERTY).equals(getWoodType());
    }

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    @Nonnull
    @Override
    public BlockProperties getProperties() {
        return PROPERTIES;
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
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public WoodType getWoodType() {
        return getPropertyValue(WoodType.PROPERTY);
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public void setWoodType(WoodType type) {
        setPropertyValue(WoodType.PROPERTY, type);
    }

    @Override
    public BlockColor getColor() {
        return getWoodType().getColor();
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.WOODEN_SLAB, this.getDamage());
    }
}