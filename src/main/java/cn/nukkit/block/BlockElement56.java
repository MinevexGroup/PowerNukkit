package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

/**
 * @author Kaooot
 * @version 1.0
 */
public class BlockElement56 extends Block {

    @Override
    public BlockID getId() {
        return BlockID.ELEMENT_56;
    }

    @Override
    public String getName() {
        return "Element 56";
    }

    @Override
    public Item toItem() {
        return Item.get(ItemID.ELEMENT_56);
    }
}