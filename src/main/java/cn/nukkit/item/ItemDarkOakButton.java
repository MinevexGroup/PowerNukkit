package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemDarkOakButton extends Item {

    public ItemDarkOakButton() {
        this(0, 1);
    }

    public ItemDarkOakButton(Integer meta) {
        this(meta, 1);
    }

    public ItemDarkOakButton(Integer meta, int count) {
        super(ItemID.DARK_OAK_BUTTON, meta, count, "Dark Oak Button");
        this.block = Block.get(BlockID.DARK_OAK_BUTTON, meta);
    }
}