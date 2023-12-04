package io.grpc.netty.shaded.io.netty.buffer.search;
/* loaded from: classes4.dex */
public abstract class AbstractSearchProcessorFactory implements SearchProcessorFactory {
    public static KmpSearchProcessorFactory newKmpSearchProcessorFactory(byte[] bArr) {
        return new KmpSearchProcessorFactory(bArr);
    }

    public static BitapSearchProcessorFactory newBitapSearchProcessorFactory(byte[] bArr) {
        return new BitapSearchProcessorFactory(bArr);
    }
}
