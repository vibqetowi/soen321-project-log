package io.grpc.netty.shaded.io.netty.handler.ssl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public interface OpenSslEngineMap {
    void add(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine);

    ReferenceCountedOpenSslEngine get(long j);

    ReferenceCountedOpenSslEngine remove(long j);
}
