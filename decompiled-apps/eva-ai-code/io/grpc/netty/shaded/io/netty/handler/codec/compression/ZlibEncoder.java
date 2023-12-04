package io.grpc.netty.shaded.io.netty.handler.codec.compression;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder;
/* loaded from: classes4.dex */
public abstract class ZlibEncoder extends MessageToByteEncoder<ByteBuf> {
    public abstract ChannelFuture close();

    public abstract ChannelFuture close(ChannelPromise channelPromise);

    public abstract boolean isClosed();

    /* JADX INFO: Access modifiers changed from: protected */
    public ZlibEncoder() {
        super(false);
    }
}
