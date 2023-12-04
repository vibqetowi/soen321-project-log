package io.grpc.netty.shaded.io.grpc.netty;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import io.grpc.InternalChannelz;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
final class NettySocketSupport {
    private static volatile Helper instance = new NettySocketHelperImpl();

    /* loaded from: classes4.dex */
    interface Helper {
        @Nullable
        NativeSocketOptions getNativeSocketOptions(Channel channel);
    }

    NettySocketSupport() {
    }

    /* loaded from: classes4.dex */
    public static class NativeSocketOptions {
        public final ImmutableMap<String, String> otherInfo;
        @Nullable
        public final InternalChannelz.TcpInfo tcpInfo;

        public NativeSocketOptions(InternalChannelz.TcpInfo tcpInfo, Map<String, String> map) {
            Preconditions.checkNotNull(map);
            this.tcpInfo = tcpInfo;
            this.otherInfo = ImmutableMap.copyOf((Map) map);
        }
    }

    public static NativeSocketOptions getNativeSocketOptions(Channel channel) {
        return instance.getNativeSocketOptions(channel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setHelper(Helper helper) {
        instance = (Helper) Preconditions.checkNotNull(helper);
    }

    /* loaded from: classes4.dex */
    private static final class NettySocketHelperImpl implements Helper {
        @Override // io.grpc.netty.shaded.io.grpc.netty.NettySocketSupport.Helper
        public NativeSocketOptions getNativeSocketOptions(Channel channel) {
            return null;
        }

        private NettySocketHelperImpl() {
        }
    }
}
