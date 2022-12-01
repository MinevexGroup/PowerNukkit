package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class BlockCrackedDeepslateBricks extends Block {

    @Override
    public BlockID getId() {
        return BlockID.CRACKED_DEEPSLATE_BRICKS;
    }

    @Override
    public String getName() {
        return "Cracked Deepslate Bricks";
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.CRACKED_DEEPSLATE_BRICKS);
    }
}