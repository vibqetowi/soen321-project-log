package io.grpc.netty.shaded.io.grpc.netty;

import io.grpc.internal.ObjectPool;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public interface ProtocolNegotiator {

    /* loaded from: classes4.dex */
    public interface ClientFactory {
        int getDefaultPort();

        ProtocolNegotiator newNegotiator();
    }

    /* loaded from: classes4.dex */
    public interface ServerFactory {
        ProtocolNegotiator newNegotiator(ObjectPool<? extends Executor> objectPool);
    }

    void close();

    ChannelHandler newHandler(GrpcHttp2ConnectionHandler grpcHttp2ConnectionHandler);

    AsciiString scheme();
}
