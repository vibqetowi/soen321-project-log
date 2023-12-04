package io.grpc.netty.shaded.io.grpc.netty;

import io.grpc.InternalChannelz;
import io.grpc.netty.shaded.io.grpc.netty.NettySocketSupport;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import java.util.Map;
/* loaded from: classes4.dex */
public final class InternalNettySocketSupport {

    /* loaded from: classes4.dex */
    public interface InternalHelper extends NettySocketSupport.Helper {
        @Override // io.grpc.netty.shaded.io.grpc.netty.NettySocketSupport.Helper
        InternalNativeSocketOptions getNativeSocketOptions(Channel channel);
    }

    /* loaded from: classes4.dex */
    public static final class InternalNativeSocketOptions extends NettySocketSupport.NativeSocketOptions {
        public InternalNativeSocketOptions(InternalChannelz.TcpInfo tcpInfo, Map<String, String> map) {
            super(tcpInfo, map);
        }
    }

    public static void setHelper(InternalHelper internalHelper) {
        NettySocketSupport.setHelper(internalHelper);
    }

    private InternalNettySocketSupport() {
    }
}
