package cn.nukkit.item;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemComposter extends Item {

    public ItemComposter() {
        this(0, 1);
    }

    public ItemComposter(Integer meta) {
        this(meta, 1);
    }

    public ItemComposter(Integer meta, int count) {
        super(ItemID.COMPOSTER, meta, count, "Composter");
        this.block = Block.get(BlockID.COMPOSTER, meta);
    }
}