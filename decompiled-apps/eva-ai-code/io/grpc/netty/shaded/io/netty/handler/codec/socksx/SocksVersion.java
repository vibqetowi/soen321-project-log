package io.grpc.netty.shaded.io.netty.handler.codec.socksx;
/* loaded from: classes4.dex */
public enum SocksVersion {
    SOCKS4a((byte) 4),
    SOCKS5((byte) 5),
    UNKNOWN((byte) -1);
    
    private final byte b;

    public static SocksVersion valueOf(byte b) {
        SocksVersion socksVersion = SOCKS4a;
        if (b == socksVersion.byteValue()) {
            return socksVersion;
        }
        SocksVersion socksVersion2 = SOCKS5;
        return b == socksVersion2.byteValue() ? socksVersion2 : UNKNOWN;
    }

    SocksVersion(byte b) {
        this.b = b;
    }

    public byte byteValue() {
        return this.b;
    }
}
