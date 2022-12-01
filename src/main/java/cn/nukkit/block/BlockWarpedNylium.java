package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.BlockColor;

@PowerNukkitOnly
@Since("1.4.0.0-PN")
public class BlockWarpedNylium extends BlockNylium {

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public BlockWarpedNylium() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Warped Nylium";
    }

    @Override
    public BlockID getId() {
        return BlockID.WARPED_NYLIUM;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.WARPED_NYLIUM_BLOCK_COLOR;
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.WARPED_NYLIUM);
    }
}