package cn.nukkit.network.protocol;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ToastRequestPacket extends DataPacket {

    public String title = "";
    public String content = "";

    @Override
    public byte pid() {
        return ProtocolInfo.TOAST_REQUEST_PACKET;
    }

    @Override
    public void decode() {
        this.title = this.getString();
        this.content = this.getString();
    }

    @Override
    public void encode() {
        this.reset();
        this.putString(this.title);
        this.putString(this.content);
    }
}