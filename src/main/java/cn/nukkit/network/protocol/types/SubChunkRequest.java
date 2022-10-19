package cn.nukkit.network.protocol.types;

import lombok.Value;

/**
 * @author Kaooot
 * @version 1.0
 */
@Value
public class SubChunkRequest {

    byte dx;
    byte dy;
    byte dz;
}