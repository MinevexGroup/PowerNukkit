package cn.nukkit.level.particle;

import cn.nukkit.block.Block;
import cn.nukkit.level.GlobalBlockPalette;
import cn.nukkit.math.Vector3;
import cn.nukkit.network.protocol.DataPacket;
import cn.nukkit.network.protocol.LevelEventPacket;
import cn.nukkit.utils.BedrockMappingUtil;

/**
 * @author xtypr
 * @since 2015/11/21
 */
public class DestroyBlockParticle extends ProtocolParticle {

    protected final int data;

    public DestroyBlockParticle(Vector3 pos, Block block) {
        super(pos.x, pos.y, pos.z);
        this.data = GlobalBlockPalette.getOrCreateRuntimeId(block.getId(), block.getDamage());
    }

    @Override
    public DataPacket[] encode(final int protocol) {
        LevelEventPacket pk = new LevelEventPacket();
        pk.evid = LevelEventPacket.EVENT_PARTICLE_DESTROY;
        pk.x = (float) this.x;
        pk.y = (float) this.y;
        pk.z = (float) this.z;
        pk.data = BedrockMappingUtil.translateBlockRuntimeId(protocol, this.data, true);

        return new DataPacket[]{pk};
    }
}