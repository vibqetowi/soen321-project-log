package io.grpc.netty.shaded.io.netty.internal.tcnative;
/* loaded from: classes4.dex */
public final class SSLSession {
    public static native void free(long j);

    public static native byte[] getSessionId(long j);

    public static native long getTime(long j);

    public static native long getTimeout(long j);

    public static native long setTimeout(long j, long j2);

    public static native boolean shouldBeSingleUse(long j);

    public static native boolean upRef(long j);

    private SSLSession() {
    }
}
