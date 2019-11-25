package com.ggemo.bilidanmakuclient;

import com.ggemo.bilidanmakuclient.copyCS.util.BitConverter;
import lombok.Getter;

@Getter
public enum OperationEnum {
    /**
     *
     */
    HANDSHAKE(0),
    HANDSHAKE_REPLY(1),
    HEARTBEAT(2),
    HEARTBEAT_REPLY(3),
    SEND_MSG(4),
    SEND_MSG_REPLY(5),
    DISCONNECT_REPLY(6),
    AUTH(7),
    AUTH_REPLY(8),
    RAW(9),
    PROTO_READY(10),
    PROTO_FINISH(11),
    CHANGE_ROOM(12),
    CHANGE_ROOM_REPLY(13),
    REGISTER(14),
    REGISTER_REPLY(15),
    UNREGISTER(16),
    UNREGISTER_REPLY(17),
    MinBusinessOp(1000),
    MaxBusinessOp(10000),
    ;
    int value;
    byte[] byteValue;

    OperationEnum(int i) {
        this.value = i;
        this.byteValue = BitConverter.toBe(BitConverter.getBytes(i));
    }
}
