package cn.nukkit.network.protocol.types.itemrequestaction;

import lombok.Value;

/**
 * @author Kaooot
 * @version 1.0
 */
@Value
public class CraftLoomAction implements ItemStackRequestAction {

    String pattern;
}