package cn.nukkit.item;

import cn.nukkit.Player;
import cn.nukkit.api.PowerNukkitDifference;
import cn.nukkit.block.Block;
import cn.nukkit.block.BlockFire;
import cn.nukkit.block.BlockID;
import cn.nukkit.event.block.BlockIgniteEvent;
import cn.nukkit.level.Level;
import cn.nukkit.level.Sound;
import cn.nukkit.math.BlockFace;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public class ItemFlintAndSteel extends ItemTool {
    
    public ItemFlintAndSteel() {
        this(0, 1);
    }

    public ItemFlintAndSteel(Integer meta) {
        this(meta, 1);
    }

    public ItemFlintAndSteel(Integer meta, int count) {
        super(ItemID.FLINT_AND_STEEL, meta, count, "Flint and Steel");
    }

    @Override
    public boolean canBeActivated() {
        return true;
    }

    @PowerNukkitDifference(info = "Using new method to play sounds", since = "1.4.0.0-PN")
    @Override
    public boolean onActivate(Level level, Player player, Block block, Block target, BlockFace face, double fx, double fy, double fz) {
        if (player.isAdventure()) {
            return false;
        }

        if (block.getId() == BlockID.AIR && (target.isSolid() || target.getBurnChance() > 0)) {
            if (target.getId() == BlockID.OBSIDIAN) {
                if (level.createPortal(target)) {
                    damageItem(player, block);
                    return true;
                }
            }

            BlockFire fire = (BlockFire) Block.get(BlockID.FIRE);
            fire.x = block.x;
            fire.y = block.y;
            fire.z = block.z;
            fire.level = level;

            if (fire.isBlockTopFacingSurfaceSolid(fire.down()) || fire.canNeighborBurn()) {
                BlockIgniteEvent e = new BlockIgniteEvent(block, null, player, BlockIgniteEvent.BlockIgniteCause.FLINT_AND_STEEL);
                block.getLevel().getServer().getPluginManager().callEvent(e);

                if (!e.isCancelled()) {
                    level.setBlock(fire, fire, true);
                    level.scheduleUpdate(fire, fire.tickRate() + ThreadLocalRandom.current().nextInt(10));
                }
                damageItem(player, block);
                return true;
            }

            damageItem(player, block);
            return true;
        }
        damageItem(player, block);
        return false;
    }
    
    private void damageItem(Player player, Block block) {
        if (!player.isCreative() && useOn(block)) {
            if (this.getDamage() >= this.getMaxDurability()) {
                this.count = 0;
                player.getInventory().setItemInHand(Item.get(ItemID.AIR));
            } else {
                player.getInventory().setItemInHand(this);
            }
        }
        block.getLevel().addSound(block, Sound.FIRE_IGNITE);
    }

    @Override
    public int getMaxDurability() {
        return ItemTool.DURABILITY_FLINT_STEEL;
    }
}