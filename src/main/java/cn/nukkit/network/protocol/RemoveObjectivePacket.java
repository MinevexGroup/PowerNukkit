package cn.nukkit.network.protocol;

/**
 * @author Kaooot
 * @version 1.0
 */
public class RemoveObjectivePacket extends DataPacket {

    public String objectiveName;

    @Override
    public byte pid() {
        return ProtocolInfo.REMOVE_OBJECTIVE_PACKET;
    }

    @Override
    public void decode() {
        this.objectiveName = this.getString();
    }

    @Override
    public void encode() {
        this.reset();
        this.putString(this.objectiveName);
    }
}