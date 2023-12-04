package io.grpc.netty.shaded.io.netty.buffer.search;
/* loaded from: classes4.dex */
public abstract class AbstractMultiSearchProcessorFactory implements MultiSearchProcessorFactory {
    public static AhoCorasicSearchProcessorFactory newAhoCorasicSearchProcessorFactory(byte[]... bArr) {
        return new AhoCorasicSearchProcessorFactory(bArr);
    }
}
