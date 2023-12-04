package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v4;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public class Socks4CommandType implements Comparable<Socks4CommandType> {
    private final byte byteValue;
    private final String name;
    private String text;
    public static final Socks4CommandType CONNECT = new Socks4CommandType(1, "CONNECT");
    public static final Socks4CommandType BIND = new Socks4CommandType(2, "BIND");

    public static Socks4CommandType valueOf(byte b) {
        if (b != 1) {
            if (b == 2) {
                return BIND;
            }
            return new Socks4CommandType(b);
        }
        return CONNECT;
    }

    public Socks4CommandType(int i) {
        this(i, "UNKNOWN");
    }

    public Socks4CommandType(int i, String str) {
        this.name = (String) ObjectUtil.checkNotNull(str, "name");
        this.byteValue = (byte) i;
    }

    public byte byteValue() {
        return this.byteValue;
    }

    public int hashCode() {
        return this.byteValue;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Socks4CommandType) && this.byteValue == ((Socks4CommandType) obj).byteValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(Socks4CommandType socks4CommandType) {
        return this.byteValue - socks4CommandType.byteValue;
    }

    public String toString() {
        String str = this.text;
        if (str == null) {
            String str2 = this.name + '(' + (this.byteValue & 255) + ')';
            this.text = str2;
            return str2;
        }
        return str;
    }
}
