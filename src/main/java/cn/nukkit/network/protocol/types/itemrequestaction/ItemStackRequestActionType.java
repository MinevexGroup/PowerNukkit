package cn.nukkit.network.protocol.types.itemrequestaction;

/**
 * @author Kaooot
 * @version 1.0
 */
public enum ItemStackRequestActionType {

    TAKE,
    PLACE,
    SWAP,
    DROP,
    DESTROY,
    CONSUME,
    CREATE,
    PLACE_IN_ITEM_CONTAINER,
    TAKE_FROM_ITEM_CONTAINER,
    LAB_TABLE_COMBINE,
    BEACON_PAYMENT,
    MINE_BLOCK,
    CRAFT_RECIPE,
    CRAFT_RECIPE_AUTO,
    CRAFT_CREATIVE,
    CRAFT_RECIPE_OPTIONAL,
    CRAFT_REPAIR_AND_DISENCHANT,
    CRAFT_LOOM,
    CRAFT_NON_IMPLEMENTED_DEPRECATED,
    CRAFT_RESULTS_DEPRECATED
}