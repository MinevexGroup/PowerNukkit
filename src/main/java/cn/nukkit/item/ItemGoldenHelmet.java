package cn.nukkit.item;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public class ItemGoldenHelmet extends ItemArmor {

    public ItemGoldenHelmet() {
        this(0, 1);
    }

    public ItemGoldenHelmet(Integer meta) {
        this(meta, 1);
    }

    public ItemGoldenHelmet(Integer meta, int count) {
        super(ItemID.GOLDEN_HELMET, meta, count, "Golden Helmet");
    }

    @Override
    public int getTier() {
        return ItemArmor.TIER_GOLD;
    }

    @Override
    public boolean isHelmet() {
        return true;
    }

    @Override
    public int getArmorPoints() {
        return 2;
    }

    @Override
    public int getMaxDurability() {
        return 78;
    }
}
