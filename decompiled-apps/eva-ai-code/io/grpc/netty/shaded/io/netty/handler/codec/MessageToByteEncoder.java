package io.grpc.netty.shaded.io.netty.handler.codec;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.util.ReferenceCountUtil;
import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.internal.TypeParameterMatcher;
/* loaded from: classes4.dex */
public abstract class MessageToByteEncoder<I> extends ChannelOutboundHandlerAdapter {
    private final TypeParameterMatcher matcher;
    private final boolean preferDirect;

    protected abstract void encode(ChannelHandlerContext channelHandlerContext, I i, ByteBuf byteBuf) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public MessageToByteEncoder() {
        this(true);
    }

    protected MessageToByteEncoder(Class<? extends I> cls) {
        this(cls, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MessageToByteEncoder(boolean z) {
        this.matcher = TypeParameterMatcher.find(this, MessageToByteEncoder.class, "I");
        this.preferDirect = z;
    }

    protected MessageToByteEncoder(Class<? extends I> cls, boolean z) {
        this.matcher = TypeParameterMatcher.get(cls);
        this.preferDirect = z;
    }

    public boolean acceptOutboundMessage(Object obj) throws Exception {
        return this.matcher.match(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void write(ChannelHandlerContext channelHandlerContext, Object obj, ChannelPromise channelPromise) throws Exception {
        ReferenceCounted referenceCounted = null;
        try {
            try {
                if (acceptOutboundMessage(obj)) {
                    ByteBuf allocateBuffer = allocateBuffer(channelHandlerContext, obj, this.preferDirect);
                    try {
                        encode(channelHandlerContext, obj, allocateBuffer);
                        ReferenceCountUtil.release(obj);
                        if (allocateBuffer.isReadable()) {
                            channelHandlerContext.write(allocateBuffer, channelPromise);
                            return;
                        }
                        allocateBuffer.release();
                        channelHandlerContext.write(Unpooled.EMPTY_BUFFER, channelPromise);
                        return;
                    } catch (Throwable th) {
                        ReferenceCountUtil.release(obj);
                        throw th;
                    }
                }
                channelHandlerContext.write(obj, channelPromise);
            } catch (Throwable th2) {
                if (0 != 0) {
                    referenceCounted.release();
                }
                throw th2;
            }
        } catch (EncoderException e) {
            throw e;
        } catch (Throwable th3) {
            throw new EncoderException(th3);
        }
    }

    protected ByteBuf allocateBuffer(ChannelHandlerContext channelHandlerContext, I i, boolean z) throws Exception {
        if (z) {
            return channelHandlerContext.alloc().ioBuffer();
        }
        return channelHandlerContext.alloc().heapBuffer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isPreferDirect() {
        return this.preferDirect;
    }
}
