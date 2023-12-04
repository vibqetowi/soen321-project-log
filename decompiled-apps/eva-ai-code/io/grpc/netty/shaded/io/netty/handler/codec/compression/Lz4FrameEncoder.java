package io.grpc.netty.shaded.io.netty.handler.codec.compression;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelFutureListener;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromiseNotifier;
import io.grpc.netty.shaded.io.netty.handler.codec.EncoderException;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder;
import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.concurrent.Future;
import io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.zip.Checksum;
import net.jpountz.lz4.LZ4Compressor;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;
/* loaded from: classes4.dex */
public class Lz4FrameEncoder extends MessageToByteEncoder<ByteBuf> {
    static final int DEFAULT_MAX_ENCODE_SIZE = Integer.MAX_VALUE;
    private final int blockSize;
    private ByteBuf buffer;
    private final ByteBufChecksum checksum;
    private final int compressionLevel;
    private final LZ4Compressor compressor;
    private volatile ChannelHandlerContext ctx;
    private volatile boolean finished;
    private final int maxEncodeSize;

    public Lz4FrameEncoder() {
        this(false);
    }

    public Lz4FrameEncoder(boolean z) {
        this(LZ4Factory.fastestInstance(), z, 65536, new Lz4XXHash32(-1756908916));
    }

    public Lz4FrameEncoder(LZ4Factory lZ4Factory, boolean z, int i, Checksum checksum) {
        this(lZ4Factory, z, i, checksum, Integer.MAX_VALUE);
    }

    public Lz4FrameEncoder(LZ4Factory lZ4Factory, boolean z, int i, Checksum checksum, int i2) {
        ObjectUtil.checkNotNull(lZ4Factory, "factory");
        ObjectUtil.checkNotNull(checksum, "checksum");
        this.compressor = z ? lZ4Factory.highCompressor() : lZ4Factory.fastCompressor();
        this.checksum = ByteBufChecksum.wrapChecksum(checksum);
        this.compressionLevel = compressionLevel(i);
        this.blockSize = i;
        this.maxEncodeSize = ObjectUtil.checkPositive(i2, "maxEncodeSize");
        this.finished = false;
    }

    private static int compressionLevel(int i) {
        if (i < 64 || i > 33554432) {
            throw new IllegalArgumentException(String.format("blockSize: %d (expected: %d-%d)", Integer.valueOf(i), 64, 33554432));
        }
        return Math.max(0, (32 - Integer.numberOfLeadingZeros(i - 1)) - 10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder
    public ByteBuf allocateBuffer(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, boolean z) {
        return allocateBuffer(channelHandlerContext, byteBuf, z, true);
    }

    private ByteBuf allocateBuffer(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, boolean z, boolean z2) {
        int readableBytes = byteBuf.readableBytes() + this.buffer.readableBytes();
        if (readableBytes < 0) {
            throw new EncoderException("too much data to allocate a buffer for compression");
        }
        int i = 0;
        while (readableBytes > 0) {
            int min = Math.min(this.blockSize, readableBytes);
            readableBytes -= min;
            i += this.compressor.maxCompressedLength(min) + 21;
        }
        if (i > this.maxEncodeSize || i < 0) {
            throw new EncoderException(String.format("requested encode buffer size (%d bytes) exceeds the maximum allowable size (%d bytes)", Integer.valueOf(i), Integer.valueOf(this.maxEncodeSize)));
        }
        if (!z2 || i >= this.blockSize) {
            if (z) {
                return channelHandlerContext.alloc().ioBuffer(i, i);
            }
            return channelHandlerContext.alloc().heapBuffer(i, i);
        }
        return Unpooled.EMPTY_BUFFER;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        if (this.finished) {
            if (!byteBuf2.isWritable(byteBuf.readableBytes())) {
                throw new IllegalStateException("encode finished and not enough space to write remaining data");
            }
            byteBuf2.writeBytes(byteBuf);
            return;
        }
        ByteBuf byteBuf3 = this.buffer;
        while (true) {
            int readableBytes = byteBuf.readableBytes();
            if (readableBytes <= 0) {
                return;
            }
            byteBuf.readBytes(byteBuf3, Math.min(readableBytes, byteBuf3.writableBytes()));
            if (!byteBuf3.isWritable()) {
                flushBufferedData(byteBuf2);
            }
        }
    }

    private void flushBufferedData(ByteBuf byteBuf) {
        int i;
        int i2;
        int readableBytes = this.buffer.readableBytes();
        if (readableBytes == 0) {
            return;
        }
        this.checksum.reset();
        ByteBufChecksum byteBufChecksum = this.checksum;
        ByteBuf byteBuf2 = this.buffer;
        byteBufChecksum.update(byteBuf2, byteBuf2.readerIndex(), readableBytes);
        int value = (int) this.checksum.getValue();
        byteBuf.ensureWritable(this.compressor.maxCompressedLength(readableBytes) + 21);
        int writerIndex = byteBuf.writerIndex();
        int i3 = writerIndex + 21;
        try {
            ByteBuffer internalNioBuffer = byteBuf.internalNioBuffer(i3, byteBuf.writableBytes() - 21);
            int position = internalNioBuffer.position();
            LZ4Compressor lZ4Compressor = this.compressor;
            ByteBuf byteBuf3 = this.buffer;
            lZ4Compressor.compress(byteBuf3.internalNioBuffer(byteBuf3.readerIndex(), readableBytes), internalNioBuffer);
            int position2 = internalNioBuffer.position() - position;
            if (position2 >= readableBytes) {
                byteBuf.setBytes(i3, this.buffer, 0, readableBytes);
                i2 = 16;
                i = readableBytes;
            } else {
                i = position2;
                i2 = 32;
            }
            byteBuf.setLong(writerIndex, 5501767354678207339L);
            byteBuf.setByte(writerIndex + 8, (byte) (i2 | this.compressionLevel));
            byteBuf.setIntLE(writerIndex + 9, i);
            byteBuf.setIntLE(writerIndex + 13, readableBytes);
            byteBuf.setIntLE(writerIndex + 17, value);
            byteBuf.writerIndex(i3 + i);
            this.buffer.clear();
        } catch (LZ4Exception e) {
            throw new CompressionException((Throwable) e);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void flush(ChannelHandlerContext channelHandlerContext) throws Exception {
        ByteBuf byteBuf = this.buffer;
        if (byteBuf != null && byteBuf.isReadable()) {
            ByteBuf allocateBuffer = allocateBuffer(channelHandlerContext, Unpooled.EMPTY_BUFFER, isPreferDirect(), false);
            flushBufferedData(allocateBuffer);
            channelHandlerContext.write(allocateBuffer);
        }
        channelHandlerContext.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ChannelFuture finishEncode(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) {
        if (this.finished) {
            channelPromise.setSuccess();
            return channelPromise;
        }
        this.finished = true;
        ByteBuf heapBuffer = channelHandlerContext.alloc().heapBuffer(this.compressor.maxCompressedLength(this.buffer.readableBytes()) + 21);
        flushBufferedData(heapBuffer);
        int writerIndex = heapBuffer.writerIndex();
        heapBuffer.setLong(writerIndex, 5501767354678207339L);
        heapBuffer.setByte(writerIndex + 8, (byte) (this.compressionLevel | 16));
        heapBuffer.setInt(writerIndex + 9, 0);
        heapBuffer.setInt(writerIndex + 13, 0);
        heapBuffer.setInt(writerIndex + 17, 0);
        heapBuffer.writerIndex(writerIndex + 21);
        return channelHandlerContext.writeAndFlush(heapBuffer, channelPromise);
    }

    public boolean isClosed() {
        return this.finished;
    }

    public ChannelFuture close() {
        return close(ctx().newPromise());
    }

    public ChannelFuture close(final ChannelPromise channelPromise) {
        ChannelHandlerContext ctx = ctx();
        EventExecutor executor = ctx.executor();
        if (executor.inEventLoop()) {
            return finishEncode(ctx, channelPromise);
        }
        executor.execute(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.handler.codec.compression.Lz4FrameEncoder.1
            @Override // java.lang.Runnable
            public void run() {
                Lz4FrameEncoder lz4FrameEncoder = Lz4FrameEncoder.this;
                lz4FrameEncoder.finishEncode(lz4FrameEncoder.ctx(), channelPromise).addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelPromiseNotifier(channelPromise));
            }
        });
        return channelPromise;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelOutboundHandler
    public void close(final ChannelHandlerContext channelHandlerContext, final ChannelPromise channelPromise) throws Exception {
        ChannelFuture finishEncode = finishEncode(channelHandlerContext, channelHandlerContext.newPromise());
        finishEncode.addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: io.grpc.netty.shaded.io.netty.handler.codec.compression.Lz4FrameEncoder.2
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.GenericFutureListener
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                channelHandlerContext.close(channelPromise);
            }
        });
        if (finishEncode.isDone()) {
            return;
        }
        channelHandlerContext.executor().schedule(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.handler.codec.compression.Lz4FrameEncoder.3
            @Override // java.lang.Runnable
            public void run() {
                channelHandlerContext.close(channelPromise);
            }
        }, 10L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ChannelHandlerContext ctx() {
        ChannelHandlerContext channelHandlerContext = this.ctx;
        if (channelHandlerContext != null) {
            return channelHandlerContext;
        }
        throw new IllegalStateException("not added to a pipeline");
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) {
        this.ctx = channelHandlerContext;
        ByteBuf wrappedBuffer = Unpooled.wrappedBuffer(new byte[this.blockSize]);
        this.buffer = wrappedBuffer;
        wrappedBuffer.clear();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.handlerRemoved(channelHandlerContext);
        ByteBuf byteBuf = this.buffer;
        if (byteBuf != null) {
            byteBuf.release();
            this.buffer = null;
        }
    }

    final ByteBuf getBackingBuffer() {
        return this.buffer;
    }
}
