package cn.nukkit.network.protocol;

import cn.nukkit.math.Vector3f;
import cn.nukkit.network.protocol.types.ClientboundDebugRendererType;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ClientboundDebugRendererPacket extends DataPacket {

    public ClientboundDebugRendererType debugMarkerType;
    public String markerText;
    public Vector3f markerPosition;
    public float markerColorRed;
    public float markerColorGreen;
    public float markerColorBlue;
    public float markerColorAlpha;
    public long markerDuration;

    @Override
    public byte pid() {
        return ProtocolInfo.CLIENTBOUND_DEBUG_RENDERER_PACKET;
    }

    @Override
    public void decode() {
        this.debugMarkerType = ClientboundDebugRendererType.values()[(int) this.getUnsignedVarInt()];
        this.markerText = this.getString();
        this.markerPosition = this.getVector3f();
        this.markerColorRed = this.getLFloat();
        this.markerColorGreen = this.getLFloat();
        this.markerColorBlue = this.getLFloat();
        this.markerColorAlpha = this.getLFloat();
        this.markerDuration = this.getLLong();
    }

    @Override
    public void encode() {
        this.reset();
        this.putUnsignedVarInt(this.debugMarkerType.ordinal());
        this.putString(this.markerText);
        this.putVector3f(this.markerPosition);
        this.putLFloat(this.markerColorRed);
        this.putLFloat(this.markerColorGreen);
        this.putLFloat(this.markerColorBlue);
        this.putLFloat(this.markerColorAlpha);
        this.putLLong(this.markerDuration);
    }
}