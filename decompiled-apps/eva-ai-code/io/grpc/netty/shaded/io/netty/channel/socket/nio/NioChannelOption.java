package io.grpc.netty.shaded.io.netty.channel.socket.nio;

import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import io.grpc.netty.shaded.io.netty.channel.ChannelException;
import io.grpc.netty.shaded.io.netty.channel.ChannelOption;
import java.io.IOException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.Channel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;
import java.util.Set;
/* loaded from: classes4.dex */
public final class NioChannelOption<T> extends ChannelOption<T> {
    private final SocketOption<T> option;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private NioChannelOption(SocketOption<T> socketOption) {
        super(r0);
        String name;
        name = socketOption.name();
        this.option = socketOption;
    }

    public static <T> ChannelOption<T> of(SocketOption<T> socketOption) {
        return new NioChannelOption(socketOption);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> boolean setOption(Channel channel, NioChannelOption<T> nioChannelOption, T t) {
        Set supportedOptions;
        SocketOption<T> socketOption;
        NetworkChannel m7217m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7217m((Object) channel);
        supportedOptions = m7217m.supportedOptions();
        if (supportedOptions.contains(((NioChannelOption) nioChannelOption).option)) {
            if (m7217m instanceof ServerSocketChannel) {
                SocketOption<T> socketOption2 = ((NioChannelOption) nioChannelOption).option;
                socketOption = StandardSocketOptions.IP_TOS;
                if (socketOption2 == socketOption) {
                    return false;
                }
            }
            try {
                m7217m.setOption(((NioChannelOption) nioChannelOption).option, t);
                return true;
            } catch (IOException e) {
                throw new ChannelException(e);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T getOption(Channel channel, NioChannelOption<T> nioChannelOption) {
        Set supportedOptions;
        SocketOption<T> socketOption;
        Object option;
        NetworkChannel m7217m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7217m((Object) channel);
        supportedOptions = m7217m.supportedOptions();
        if (supportedOptions.contains(((NioChannelOption) nioChannelOption).option)) {
            if (m7217m instanceof ServerSocketChannel) {
                SocketOption<T> socketOption2 = ((NioChannelOption) nioChannelOption).option;
                socketOption = StandardSocketOptions.IP_TOS;
                if (socketOption2 == socketOption) {
                    return null;
                }
            }
            try {
                option = m7217m.getOption(((NioChannelOption) nioChannelOption).option);
                return (T) option;
            } catch (IOException e) {
                throw new ChannelException(e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChannelOption[] getOptions(Channel channel) {
        Set<Object> supportedOptions;
        SocketOption socketOption;
        NetworkChannel m7217m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7217m((Object) channel);
        supportedOptions = m7217m.supportedOptions();
        int i = 0;
        if (m7217m instanceof ServerSocketChannel) {
            ArrayList arrayList = new ArrayList(supportedOptions.size());
            for (Object obj : supportedOptions) {
                SocketOption m7214m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7214m(obj);
                socketOption = StandardSocketOptions.IP_TOS;
                if (m7214m != socketOption) {
                    arrayList.add(new NioChannelOption(m7214m));
                }
            }
            return (ChannelOption[]) arrayList.toArray(new ChannelOption[0]);
        }
        ChannelOption[] channelOptionArr = new ChannelOption[supportedOptions.size()];
        for (Object obj2 : supportedOptions) {
            channelOptionArr[i] = new NioChannelOption(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7214m(obj2));
            i++;
        }
        return channelOptionArr;
    }
}
