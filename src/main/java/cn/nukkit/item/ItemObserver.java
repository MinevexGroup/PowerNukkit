package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemObserver extends Item {

    public ItemObserver() {
        this(0, 1);
    }

    public ItemObserver(Integer meta) {
        this(meta, 1);
    }

    public ItemObserver(Integer meta, int count) {
        super(ItemID.OBSERVER, meta, count, "Observer");
        this.block = Block.get(BlockID.OBSERVER, meta);
    }
}