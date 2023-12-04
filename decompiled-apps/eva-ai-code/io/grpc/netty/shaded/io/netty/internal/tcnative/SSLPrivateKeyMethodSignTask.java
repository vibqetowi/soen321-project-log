package io.grpc.netty.shaded.io.netty.internal.tcnative;
/* loaded from: classes4.dex */
final class SSLPrivateKeyMethodSignTask extends SSLPrivateKeyMethodTask {
    private final byte[] digest;
    private final int signatureAlgorithm;

    SSLPrivateKeyMethodSignTask(long j, int i, byte[] bArr, SSLPrivateKeyMethod sSLPrivateKeyMethod) {
        super(j, sSLPrivateKeyMethod);
        this.signatureAlgorithm = i;
        this.digest = bArr;
    }

    @Override // io.grpc.netty.shaded.io.netty.internal.tcnative.SSLPrivateKeyMethodTask
    protected byte[] runTask(long j, SSLPrivateKeyMethod sSLPrivateKeyMethod) throws Exception {
        return sSLPrivateKeyMethod.sign(j, this.signatureAlgorithm, this.digest);
    }
}
