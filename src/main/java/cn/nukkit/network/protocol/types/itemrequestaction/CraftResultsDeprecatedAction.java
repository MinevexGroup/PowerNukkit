package cn.nukkit.network.protocol.types.itemrequestaction;

import cn.nukkit.item.Item;
import lombok.Value;

/**
 * @author Kaooot
 * @version 1.0
 */
@Value
public class CraftResultsDeprecatedAction implements ItemStackRequestAction {

    Item[] resultItems;
    byte timesCrafted;
}