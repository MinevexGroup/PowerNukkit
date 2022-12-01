package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemElement22 extends Item {

    public ItemElement22() {
        this(0, 1);
    }

    public ItemElement22(Integer meta) {
        this(meta, 1);
    }

    public ItemElement22(Integer meta, int count) {
        super(ItemID.ELEMENT_22, meta, count, "Element 22");
        this.block = Block.get(BlockID.ELEMENT_22, meta);
    }
}