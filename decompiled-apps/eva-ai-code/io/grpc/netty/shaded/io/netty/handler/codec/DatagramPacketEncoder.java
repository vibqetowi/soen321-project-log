package io.grpc.netty.shaded.io.netty.handler.codec;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.AddressedEnvelope;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.channel.socket.DatagramPacket;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.List;
/* loaded from: classes4.dex */
public class DatagramPacketEncoder<M> extends MessageToMessageEncoder<AddressedEnvelope<M, InetSocketAddress>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final MessageToMessageEncoder<? super M> encoder;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageEncoder
    public /* bridge */ /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object obj, List list) throws Exception {
        encode(channelHandlerContext, (AddressedEnvelope) ((AddressedEnvelope) obj), (List<Object>) list);
    }

    public DatagramPacketEncoder(MessageToMessageEncoder<? super M> messageToMessageEncoder) {
        this.encoder = (MessageToMessageEncoder) ObjectUtil.checkNotNull(messageToMessageEncoder, "encoder");
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(Object obj) throws Exception {
        if (super.acceptOutboundMessage(obj)) {
            AddressedEnvelope addressedEnvelope = (AddressedEnvelope) obj;
            if (this.encoder.acceptOutboundMessage(addressedEnvelope.content())) {
                return ((addressedEnvelope.sender() instanceof InetSocketAddress) || addressedEnvelope.sender() == null) && (addressedEnvelope.recipient() instanceof InetSocketAddress);
            }
            return false;
        }
        return false;
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, AddressedEnvelope<M, InetSocketAddress> addressedEnvelope, List<Object> list) throws Exception {
        this.encoder.encode(channelHandlerContext, addressedEnvelope.content(), list);
        if (list.size() != 1) {
            throw new EncoderException(StringUtil.simpleClassName(this.encoder) + " must produce only one message.");
        }
        Object obj = list.get(0);
        if (obj instanceof ByteBuf) {
            list.set(0, new DatagramPacket((ByteBuf) obj, addressedEnvelope.recipient(), addressedEnvelope.sender()));
            return;
        }
        throw new EncoderException(StringUtil.simpleClassName(this.encoder) + " must produce only ByteBuf.");
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void bind(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, ChannelPromise channelPromise) throws Exception {
        this.encoder.bind(channelHandlerContext, socketAddress, channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void connect(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, SocketAddress socketAddress2, ChannelPromise channelPromise) throws Exception {
        this.encoder.connect(channelHandlerContext, socketAddress, socketAddress2, channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void disconnect(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) throws Exception {
        this.encoder.disconnect(channelHandlerContext, channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void close(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) throws Exception {
        this.encoder.close(channelHandlerContext, channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void deregister(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) throws Exception {
        this.encoder.deregister(channelHandlerContext, channelPromise);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void read(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.encoder.read(channelHandlerContext);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void flush(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.encoder.flush(channelHandlerContext);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.encoder.handlerAdded(channelHandlerContext);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.encoder.handlerRemoved(channelHandlerContext);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable th) throws Exception {
        this.encoder.exceptionCaught(channelHandlerContext, th);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter
    public boolean isSharable() {
        return this.encoder.isSharable();
    }
}
