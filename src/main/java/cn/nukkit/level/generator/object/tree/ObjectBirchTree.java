package cn.nukkit.level.generator.object.tree;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockID;
import cn.nukkit.block.BlockWood;
import cn.nukkit.level.ChunkManager;
import cn.nukkit.math.NukkitRandom;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public class ObjectBirchTree extends ObjectTree {
    protected int treeHeight = 7;

    @Override
    public BlockID getTrunkBlock() {
        return BlockID.LOG;
    }

    @Override
    public BlockID getLeafBlock() {
        return BlockID.LEAVES;
    }

    @Override
    public int getType() {
        return BlockWood.BIRCH;
    }

    @Override
    public int getTreeHeight() {
        return this.treeHeight;
    }

    @Override
    public void placeObject(ChunkManager level, int x, int y, int z, NukkitRandom random) {
        this.treeHeight = random.nextBoundedInt(2) + 5;
        super.placeObject(level, x, y, z, random);
    }
}
