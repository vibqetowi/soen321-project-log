package io.grpc.netty.shaded.io.netty.channel.oio;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelConfig;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelMetadata;
import io.grpc.netty.shaded.io.netty.channel.ChannelOption;
import io.grpc.netty.shaded.io.netty.channel.ChannelOutboundBuffer;
import io.grpc.netty.shaded.io.netty.channel.ChannelPipeline;
import io.grpc.netty.shaded.io.netty.channel.FileRegion;
import io.grpc.netty.shaded.io.netty.channel.RecvByteBufAllocator;
import io.grpc.netty.shaded.io.netty.channel.socket.ChannelInputShutdownEvent;
import io.grpc.netty.shaded.io.netty.channel.socket.ChannelInputShutdownReadComplete;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import java.io.IOException;
/* loaded from: classes4.dex */
public abstract class AbstractOioByteChannel extends AbstractOioChannel {
    private static final ChannelMetadata METADATA = new ChannelMetadata(false);
    private static final String EXPECTED_TYPES = " (expected: " + StringUtil.simpleClassName((Class<?>) ByteBuf.class) + ", " + StringUtil.simpleClassName((Class<?>) FileRegion.class) + ')';

    protected abstract int available();

    protected abstract int doReadBytes(ByteBuf byteBuf) throws Exception;

    protected abstract void doWriteBytes(ByteBuf byteBuf) throws Exception;

    protected abstract void doWriteFileRegion(FileRegion fileRegion) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isInputShutdown();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ChannelFuture shutdownInput();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractOioByteChannel(Channel channel) {
        super(channel);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    public ChannelMetadata metadata() {
        return METADATA;
    }

    private void closeOnRead(ChannelPipeline channelPipeline) {
        if (isOpen()) {
            if (Boolean.TRUE.equals(config().getOption(ChannelOption.ALLOW_HALF_CLOSURE))) {
                shutdownInput();
                channelPipeline.fireUserEventTriggered((Object) ChannelInputShutdownEvent.INSTANCE);
            } else {
                unsafe().close(unsafe().voidPromise());
            }
            channelPipeline.fireUserEventTriggered((Object) ChannelInputShutdownReadComplete.INSTANCE);
        }
    }

    private void handleReadException(ChannelPipeline channelPipeline, ByteBuf byteBuf, Throwable th, boolean z, RecvByteBufAllocator.Handle handle) {
        if (byteBuf != null) {
            if (byteBuf.isReadable()) {
                this.readPending = false;
                channelPipeline.fireChannelRead((Object) byteBuf);
            } else {
                byteBuf.release();
            }
        }
        handle.readComplete();
        channelPipeline.fireChannelReadComplete();
        channelPipeline.fireExceptionCaught(th);
        if (z || (th instanceof OutOfMemoryError) || (th instanceof IOException)) {
            closeOnRead(channelPipeline);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r5.isReadable() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        r5.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r7.lastBytesRead() >= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r9 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        r12.readPending = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
        r5 = r2;
        r11 = r6;
        r6 = false;
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6 A[DONT_GENERATE] */
    @Override // io.grpc.netty.shaded.io.netty.channel.oio.AbstractOioChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void doRead() {
        boolean z;
        Throwable th;
        boolean z2;
        ChannelConfig config = config();
        if (isInputShutdown() || !this.readPending) {
            return;
        }
        boolean z3 = false;
        this.readPending = false;
        ChannelPipeline pipeline = pipeline();
        ByteBufAllocator allocator = config.getAllocator();
        RecvByteBufAllocator.Handle recvBufAllocHandle = unsafe().recvBufAllocHandle();
        recvBufAllocHandle.reset(config);
        ByteBuf byteBuf = null;
        try {
            ByteBuf allocate = recvBufAllocHandle.allocate(allocator);
            boolean z4 = false;
            while (true) {
                try {
                    recvBufAllocHandle.lastBytesRead(doReadBytes(allocate));
                    z2 = true;
                    if (recvBufAllocHandle.lastBytesRead() <= 0) {
                        break;
                    }
                    try {
                        int available = available();
                        if (available <= 0) {
                            break;
                        }
                        if (!allocate.isWritable()) {
                            int capacity = allocate.capacity();
                            int maxCapacity = allocate.maxCapacity();
                            if (capacity == maxCapacity) {
                                recvBufAllocHandle.incMessagesRead(1);
                                this.readPending = false;
                                pipeline.fireChannelRead((Object) allocate);
                                allocate = recvBufAllocHandle.allocate(allocator);
                            } else if (allocate.writerIndex() + available > maxCapacity) {
                                allocate.capacity(maxCapacity);
                            } else {
                                allocate.ensureWritable(available);
                            }
                        }
                        if (!recvBufAllocHandle.continueReading()) {
                            break;
                        }
                        z4 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        byteBuf = allocate;
                        z3 = true;
                        th = th;
                        try {
                            handleReadException(pipeline, byteBuf, th, z, recvBufAllocHandle);
                        } finally {
                            if (this.readPending || config.isAutoRead() || (!z3 && isActive())) {
                                read();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    byteBuf = allocate;
                }
            }
            z4 = true;
            z2 = false;
            if (allocate != null) {
                try {
                    if (allocate.isReadable()) {
                        this.readPending = false;
                        pipeline.fireChannelRead((Object) allocate);
                    } else {
                        allocate.release();
                    }
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    byteBuf = allocate;
                    th = th5;
                    z3 = z4;
                    z = z2;
                    handleReadException(pipeline, byteBuf, th, z, recvBufAllocHandle);
                }
            } else {
                byteBuf = allocate;
            }
            if (z4) {
                recvBufAllocHandle.readComplete();
                pipeline.fireChannelReadComplete();
            }
            if (z2) {
                closeOnRead(pipeline);
            }
            if (!this.readPending && !config.isAutoRead() && (z4 || !isActive())) {
            }
        } catch (Throwable th6) {
            th = th6;
            z = false;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected void doWrite(ChannelOutboundBuffer channelOutboundBuffer) throws Exception {
        while (true) {
            Object current = channelOutboundBuffer.current();
            if (current == null) {
                return;
            }
            if (current instanceof ByteBuf) {
                ByteBuf byteBuf = (ByteBuf) current;
                int readableBytes = byteBuf.readableBytes();
                while (readableBytes > 0) {
                    doWriteBytes(byteBuf);
                    int readableBytes2 = byteBuf.readableBytes();
                    channelOutboundBuffer.progress(readableBytes - readableBytes2);
                    readableBytes = readableBytes2;
                }
                channelOutboundBuffer.remove();
            } else if (current instanceof FileRegion) {
                FileRegion fileRegion = (FileRegion) current;
                long transferred = fileRegion.transferred();
                doWriteFileRegion(fileRegion);
                channelOutboundBuffer.progress(fileRegion.transferred() - transferred);
                channelOutboundBuffer.remove();
            } else {
                channelOutboundBuffer.remove(new UnsupportedOperationException("unsupported message type: " + StringUtil.simpleClassName(current)));
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected final Object filterOutboundMessage(Object obj) throws Exception {
        if ((obj instanceof ByteBuf) || (obj instanceof FileRegion)) {
            return obj;
        }
        throw new UnsupportedOperationException("unsupported message type: " + StringUtil.simpleClassName(obj) + EXPECTED_TYPES);
    }
}
