package io.grpc.netty.shaded.io.netty.internal.tcnative;
/* loaded from: classes4.dex */
final class SSLPrivateKeyMethodDecryptTask extends SSLPrivateKeyMethodTask {
    private final byte[] input;

    SSLPrivateKeyMethodDecryptTask(long j, byte[] bArr, SSLPrivateKeyMethod sSLPrivateKeyMethod) {
        super(j, sSLPrivateKeyMethod);
        this.input = bArr;
    }

    @Override // io.grpc.netty.shaded.io.netty.internal.tcnative.SSLPrivateKeyMethodTask
    protected byte[] runTask(long j, SSLPrivateKeyMethod sSLPrivateKeyMethod) throws Exception {
        return sSLPrivateKeyMethod.decrypt(j, this.input);
    }
}
