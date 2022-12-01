package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemElement6 extends Item {

    public ItemElement6() {
        this(0, 1);
    }

    public ItemElement6(Integer meta) {
        this(meta, 1);
    }

    public ItemElement6(Integer meta, int count) {
        super(ItemID.ELEMENT_6, meta, count, "Element 6");
        this.block = Block.get(BlockID.ELEMENT_6, meta);
    }
}