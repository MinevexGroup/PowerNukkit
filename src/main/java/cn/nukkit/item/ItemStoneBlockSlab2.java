package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemStoneBlockSlab2 extends Item {

    public ItemStoneBlockSlab2() {
        this(0, 1);
    }

    public ItemStoneBlockSlab2(Integer meta) {
        this(meta, 1);
    }

    public ItemStoneBlockSlab2(Integer meta, int count) {
        super(ItemID.STONE_BLOCK_SLAB2, meta, count, "Stone Block Slab2");
        this.block = Block.get(BlockID.STONE_BLOCK_SLAB2, meta);
    }
}