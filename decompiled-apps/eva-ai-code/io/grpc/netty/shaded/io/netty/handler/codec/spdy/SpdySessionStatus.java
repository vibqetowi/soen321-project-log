package io.grpc.netty.shaded.io.netty.handler.codec.spdy;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public class SpdySessionStatus implements Comparable<SpdySessionStatus> {
    private final int code;
    private final String statusPhrase;
    public static final SpdySessionStatus OK = new SpdySessionStatus(0, "OK");
    public static final SpdySessionStatus PROTOCOL_ERROR = new SpdySessionStatus(1, "PROTOCOL_ERROR");
    public static final SpdySessionStatus INTERNAL_ERROR = new SpdySessionStatus(2, "INTERNAL_ERROR");

    public static SpdySessionStatus valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return INTERNAL_ERROR;
                }
                return new SpdySessionStatus(i, "UNKNOWN (" + i + ')');
            }
            return PROTOCOL_ERROR;
        }
        return OK;
    }

    public SpdySessionStatus(int i, String str) {
        this.statusPhrase = (String) ObjectUtil.checkNotNull(str, "statusPhrase");
        this.code = i;
    }

    public int code() {
        return this.code;
    }

    public String statusPhrase() {
        return this.statusPhrase;
    }

    public int hashCode() {
        return code();
    }

    public boolean equals(Object obj) {
        return (obj instanceof SpdySessionStatus) && code() == ((SpdySessionStatus) obj).code();
    }

    public String toString() {
        return statusPhrase();
    }

    @Override // java.lang.Comparable
    public int compareTo(SpdySessionStatus spdySessionStatus) {
        return code() - spdySessionStatus.code();
    }
}
