package cn.nukkit.network.protocol.types.itemrequestaction;

/**
 * @author Kaooot
 * @version 1.0
 */
public interface CraftingRecipeAction extends ItemStackRequestAction {

    int getRecipeNetworkId();
}