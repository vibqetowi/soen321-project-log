package io.grpc.netty.shaded.io.netty.internal.tcnative;
/* loaded from: classes4.dex */
public interface SSLSessionCache {
    long getSession(long j, byte[] bArr);

    boolean sessionCreated(long j, long j2);
}
