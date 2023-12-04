package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;
@Deprecated
/* loaded from: classes4.dex */
public interface JdkApplicationProtocolNegotiator extends ApplicationProtocolNegotiator {

    /* loaded from: classes4.dex */
    public interface ProtocolSelectionListener {
        void selected(String str) throws Exception;

        void unsupported();
    }

    /* loaded from: classes4.dex */
    public interface ProtocolSelectionListenerFactory {
        ProtocolSelectionListener newListener(SSLEngine sSLEngine, List<String> list);
    }

    /* loaded from: classes4.dex */
    public interface ProtocolSelector {
        String select(List<String> list) throws Exception;

        void unsupported();
    }

    /* loaded from: classes4.dex */
    public interface ProtocolSelectorFactory {
        ProtocolSelector newSelector(SSLEngine sSLEngine, Set<String> set);
    }

    /* loaded from: classes4.dex */
    public interface SslEngineWrapperFactory {
        SSLEngine wrapSslEngine(SSLEngine sSLEngine, JdkApplicationProtocolNegotiator jdkApplicationProtocolNegotiator, boolean z);
    }

    ProtocolSelectionListenerFactory protocolListenerFactory();

    ProtocolSelectorFactory protocolSelectorFactory();

    SslEngineWrapperFactory wrapperFactory();

    /* loaded from: classes4.dex */
    public static abstract class AllocatorAwareSslEngineWrapperFactory implements SslEngineWrapperFactory {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract SSLEngine wrapSslEngine(SSLEngine sSLEngine, ByteBufAllocator byteBufAllocator, JdkApplicationProtocolNegotiator jdkApplicationProtocolNegotiator, boolean z);

        @Override // io.grpc.netty.shaded.io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory
        public final SSLEngine wrapSslEngine(SSLEngine sSLEngine, JdkApplicationProtocolNegotiator jdkApplicationProtocolNegotiator, boolean z) {
            return wrapSslEngine(sSLEngine, ByteBufAllocator.DEFAULT, jdkApplicationProtocolNegotiator, z);
        }
    }
}
