package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.blockproperty.BlockProperties;
import cn.nukkit.blockproperty.BooleanBlockProperty;
import cn.nukkit.blockproperty.IntBlockProperty;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

import javax.annotation.Nonnull;

/**
 * @author Kaooot
 * @version 1.0
 */
public class BlockCandle extends Block {

    public static final BlockProperties PROPERTIES = new BlockProperties(new IntBlockProperty("candles", false, 3, 0),
            new BooleanBlockProperty("lit", false));

    @Override
    public BlockID getId() {
        return BlockID.CANDLE;
    }

    @Override
    public String getName() {
        return "Candle";
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.CANDLE);
    }

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    @Nonnull
    @Override
    public BlockProperties getProperties() {
        return PROPERTIES;
    }
}