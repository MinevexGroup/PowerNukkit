package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import cn.nukkit.math.NukkitMath;
import cn.nukkit.utils.BlockColor;

/**
 * @author CreeperFace
 */
public class BlockHeavyWeightedPressurePlate extends BlockPressurePlateBase {

    public BlockHeavyWeightedPressurePlate() {
        this(0);
    }

    public BlockHeavyWeightedPressurePlate(int meta) {
        super(meta);
        this.onPitch = 0.90000004f;
        this.offPitch = 0.75f;
    }

    @Override
    public BlockID getId() {
        return BlockID.HEAVY_WEIGHTED_PRESSURE_PLATE;
    }

    @Override
    public String getName() {
        return "Weighted Pressure Plate (Heavy)";
    }

    @Override
    public double getHardness() {
        return 0.5D;
    }

    @Override
    public double getResistance() {
        return 2.5D;
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
    public BlockColor getColor() {
        return BlockColor.IRON_BLOCK_COLOR;
    }

    @Override
    protected int computeRedstoneStrength() {
        int count = Math.min(this.level.getCollidingEntities(getCollisionBoundingBox()).length, this.getMaxWeight());

        if (count > 0) {
            float f = (float) Math.min(this.getMaxWeight(), count) / (float) this.getMaxWeight();
            return Math.max(1, NukkitMath.ceilFloat(f * 15.0F));
        } else {
            return 0;
        }
    }

    public int getMaxWeight() {
        return 150;
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.HEAVY_WEIGHTED_PRESSURE_PLATE);
    }
}