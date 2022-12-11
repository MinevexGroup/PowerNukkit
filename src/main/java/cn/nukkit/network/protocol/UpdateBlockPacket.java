package cn.nukkit.network.protocol;


import cn.nukkit.utils.BedrockMappingUtil;
import lombok.ToString;

/**
 * @author MagicDroidX (Nukkit Project)
 */
@ToString
public class UpdateBlockPacket extends DataPacket {
    public static final byte NETWORK_ID = ProtocolInfo.UPDATE_BLOCK_PACKET;

    public static final int FLAG_NONE = 0b0000;
    public static final int FLAG_NEIGHBORS = 0b0001;
    public static final int FLAG_NETWORK = 0b0010;
    public static final int FLAG_NOGRAPHIC = 0b0100;
    public static final int FLAG_PRIORITY = 0b1000;

    public static final int FLAG_ALL = (FLAG_NEIGHBORS | FLAG_NETWORK);
    public static final int FLAG_ALL_PRIORITY = (FLAG_ALL | FLAG_PRIORITY);

    public int x;
    public int z;
    public int y;
    public int blockRuntimeId;
    public int flags;
    public int dataLayer = 0;

    @Override
    public byte pid() {
        return NETWORK_ID;
    }

    @Override
    public void decode() {

    }

    @Override
    public void encode() {
        this.reset();
        this.putBlockVector3(x, y, z);
        this.putUnsignedVarInt(BedrockMappingUtil.translateBlockRuntimeId(this.protocolVersion, this.blockRuntimeId, true));
        this.putUnsignedVarInt(flags);
        this.putUnsignedVarInt(dataLayer);
    }
}
