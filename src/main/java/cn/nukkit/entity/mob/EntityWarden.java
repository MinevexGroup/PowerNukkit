package cn.nukkit.entity.mob;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * @author Kaooot
 * @version 1.0
 */
public class EntityWarden extends EntityMob {

    public static final int NETWORK_ID = 131;

    public EntityWarden(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Since("1.5.1.0-PN")
    @PowerNukkitOnly
    @Override
    public String getOriginalName() {
        return "Warden";
    }

    @Override
    public float getWidth() {
        return 0.9f;
    }

    @Override
    public float getHeight() {
        return 2.9f;
    }

    @Override
    protected void initEntity() {
        super.initEntity();
        this.setMaxHealth(500);
    }
}