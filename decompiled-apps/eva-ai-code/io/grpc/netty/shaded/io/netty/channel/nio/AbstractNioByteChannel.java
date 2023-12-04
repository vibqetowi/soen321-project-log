package io.grpc.netty.shaded.io.netty.channel.nio;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelConfig;
import io.grpc.netty.shaded.io.netty.channel.ChannelFuture;
import io.grpc.netty.shaded.io.netty.channel.ChannelMetadata;
import io.grpc.netty.shaded.io.netty.channel.ChannelOutboundBuffer;
import io.grpc.netty.shaded.io.netty.channel.ChannelPipeline;
import io.grpc.netty.shaded.io.netty.channel.FileRegion;
import io.grpc.netty.shaded.io.netty.channel.RecvByteBufAllocator;
import io.grpc.netty.shaded.io.netty.channel.nio.AbstractNioChannel;
import io.grpc.netty.shaded.io.netty.channel.socket.ChannelInputShutdownEvent;
import io.grpc.netty.shaded.io.netty.channel.socket.ChannelInputShutdownReadComplete;
import io.grpc.netty.shaded.io.netty.channel.socket.SocketChannelConfig;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
/* loaded from: classes4.dex */
public abstract class AbstractNioByteChannel extends AbstractNioChannel {
    private final Runnable flushTask;
    private boolean inputClosedSeenErrorOnRead;
    private static final ChannelMetadata METADATA = new ChannelMetadata(false, 16);
    private static final String EXPECTED_TYPES = " (expected: " + StringUtil.simpleClassName((Class<?>) ByteBuf.class) + ", " + StringUtil.simpleClassName((Class<?>) FileRegion.class) + ')';

    protected abstract int doReadBytes(ByteBuf byteBuf) throws Exception;

    protected abstract int doWriteBytes(ByteBuf byteBuf) throws Exception;

    protected abstract long doWriteFileRegion(FileRegion fileRegion) throws Exception;

    protected boolean isInputShutdown0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ChannelFuture shutdownInput();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractNioByteChannel(Channel channel, SelectableChannel selectableChannel) {
        super(channel, selectableChannel, 1);
        this.flushTask = new Runnable() { // from class: io.grpc.netty.shaded.io.netty.channel.nio.AbstractNioByteChannel.1
            @Override // java.lang.Runnable
            public void run() {
                ((AbstractNioChannel.AbstractNioUnsafe) AbstractNioByteChannel.this.unsafe()).flush0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    public AbstractNioChannel.AbstractNioUnsafe newUnsafe() {
        return new NioByteUnsafe();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.Channel
    public ChannelMetadata metadata() {
        return METADATA;
    }

    final boolean shouldBreakReadReady(ChannelConfig channelConfig) {
        return isInputShutdown0() && (this.inputClosedSeenErrorOnRead || !isAllowHalfClosure(channelConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAllowHalfClosure(ChannelConfig channelConfig) {
        return (channelConfig instanceof SocketChannelConfig) && ((SocketChannelConfig) channelConfig).isAllowHalfClosure();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class NioByteUnsafe extends AbstractNioChannel.AbstractNioUnsafe {
        /* JADX INFO: Access modifiers changed from: protected */
        public NioByteUnsafe() {
            super();
        }

        private void closeOnRead(ChannelPipeline channelPipeline) {
            if (!AbstractNioByteChannel.this.isInputShutdown0()) {
                if (AbstractNioByteChannel.isAllowHalfClosure(AbstractNioByteChannel.this.config())) {
                    AbstractNioByteChannel.this.shutdownInput();
                    channelPipeline.fireUserEventTriggered((Object) ChannelInputShutdownEvent.INSTANCE);
                    return;
                }
                close(voidPromise());
                return;
            }
            AbstractNioByteChannel.this.inputClosedSeenErrorOnRead = true;
            channelPipeline.fireUserEventTriggered((Object) ChannelInputShutdownReadComplete.INSTANCE);
        }

        private void handleReadException(ChannelPipeline channelPipeline, ByteBuf byteBuf, Throwable th, boolean z, RecvByteBufAllocator.Handle handle) {
            if (byteBuf != null) {
                if (byteBuf.isReadable()) {
                    AbstractNioByteChannel.this.readPending = false;
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

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
            r5.release();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            if (r7.lastBytesRead() >= 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            r8 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
            if (r8 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
            r9.this$0.readPending = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
            r5 = r1;
            r4 = null;
            r6 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            r4 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
            handleReadException(r3, r4, r5, r6, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
            if (r9.this$0.readPending == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
            removeReadOp();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        @Override // io.grpc.netty.shaded.io.netty.channel.nio.AbstractNioChannel.NioUnsafe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void read() {
            boolean z;
            Throwable th;
            boolean z2;
            ByteBuf byteBuf;
            ChannelConfig config = AbstractNioByteChannel.this.config();
            if (AbstractNioByteChannel.this.shouldBreakReadReady(config)) {
                AbstractNioByteChannel.this.clearReadPending();
                return;
            }
            ChannelPipeline pipeline = AbstractNioByteChannel.this.pipeline();
            ByteBufAllocator allocator = config.getAllocator();
            RecvByteBufAllocator.Handle recvBufAllocHandle = recvBufAllocHandle();
            recvBufAllocHandle.reset(config);
            while (true) {
                z = false;
                try {
                    ByteBuf allocate = recvBufAllocHandle.allocate(allocator);
                    try {
                        recvBufAllocHandle.lastBytesRead(AbstractNioByteChannel.this.doReadBytes(allocate));
                        boolean z3 = true;
                        if (recvBufAllocHandle.lastBytesRead() > 0) {
                            recvBufAllocHandle.incMessagesRead(1);
                            AbstractNioByteChannel.this.readPending = false;
                            pipeline.fireChannelRead((Object) allocate);
                            if (!recvBufAllocHandle.continueReading()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Throwable th2) {
                        z2 = false;
                        byteBuf = allocate;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z2 = z;
                    byteBuf = null;
                }
            }
            recvBufAllocHandle.readComplete();
            pipeline.fireChannelReadComplete();
            if (z) {
                closeOnRead(pipeline);
            }
            if (AbstractNioByteChannel.this.readPending || config.isAutoRead()) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int doWrite0(ChannelOutboundBuffer channelOutboundBuffer) throws Exception {
        if (channelOutboundBuffer.current() == null) {
            return 0;
        }
        return doWriteInternal(channelOutboundBuffer, channelOutboundBuffer.current());
    }

    private int doWriteInternal(ChannelOutboundBuffer channelOutboundBuffer, Object obj) throws Exception {
        if (obj instanceof ByteBuf) {
            ByteBuf byteBuf = (ByteBuf) obj;
            if (!byteBuf.isReadable()) {
                channelOutboundBuffer.remove();
                return 0;
            }
            int doWriteBytes = doWriteBytes(byteBuf);
            if (doWriteBytes > 0) {
                channelOutboundBuffer.progress(doWriteBytes);
                if (!byteBuf.isReadable()) {
                    channelOutboundBuffer.remove();
                }
                return 1;
            }
            return Integer.MAX_VALUE;
        } else if (obj instanceof FileRegion) {
            FileRegion fileRegion = (FileRegion) obj;
            if (fileRegion.transferred() >= fileRegion.count()) {
                channelOutboundBuffer.remove();
                return 0;
            }
            long doWriteFileRegion = doWriteFileRegion(fileRegion);
            if (doWriteFileRegion > 0) {
                channelOutboundBuffer.progress(doWriteFileRegion);
                if (fileRegion.transferred() >= fileRegion.count()) {
                    channelOutboundBuffer.remove();
                }
                return 1;
            }
            return Integer.MAX_VALUE;
        } else {
            throw new Error();
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected void doWrite(ChannelOutboundBuffer channelOutboundBuffer) throws Exception {
        int writeSpinCount = config().getWriteSpinCount();
        do {
            Object current = channelOutboundBuffer.current();
            if (current == null) {
                clearOpWrite();
                return;
            }
            writeSpinCount -= doWriteInternal(channelOutboundBuffer, current);
        } while (writeSpinCount > 0);
        incompleteWrite(writeSpinCount < 0);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.AbstractChannel
    protected final Object filterOutboundMessage(Object obj) {
        if (obj instanceof ByteBuf) {
            ByteBuf byteBuf = (ByteBuf) obj;
            return byteBuf.isDirect() ? obj : newDirectBuffer(byteBuf);
        } else if (obj instanceof FileRegion) {
            return obj;
        } else {
            throw new UnsupportedOperationException("unsupported message type: " + StringUtil.simpleClassName(obj) + EXPECTED_TYPES);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void incompleteWrite(boolean z) {
        if (z) {
            setOpWrite();
            return;
        }
        clearOpWrite();
        eventLoop().execute(this.flushTask);
    }

    protected final void setOpWrite() {
        SelectionKey selectionKey = selectionKey();
        if (selectionKey.isValid()) {
            int interestOps = selectionKey.interestOps();
            if ((interestOps & 4) == 0) {
                selectionKey.interestOps(interestOps | 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void clearOpWrite() {
        SelectionKey selectionKey = selectionKey();
        if (selectionKey.isValid()) {
            int interestOps = selectionKey.interestOps();
            if ((interestOps & 4) != 0) {
                selectionKey.interestOps(interestOps & (-5));
            }
        }
    }
}
