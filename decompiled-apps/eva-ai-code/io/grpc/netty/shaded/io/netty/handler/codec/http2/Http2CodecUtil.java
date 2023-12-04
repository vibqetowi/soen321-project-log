package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import com.google.common.net.HttpHeaders;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.channel.DefaultChannelPromise;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.StreamByteDistributor;
import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolNames;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class Http2CodecUtil {
    public static final int CONNECTION_STREAM_ID = 0;
    public static final int CONTINUATION_FRAME_HEADER_LENGTH = 10;
    public static final int DATA_FRAME_HEADER_LENGTH = 10;
    public static final long DEFAULT_HEADER_LIST_SIZE = 8192;
    public static final int DEFAULT_HEADER_TABLE_SIZE = 4096;
    public static final int DEFAULT_MAX_FRAME_SIZE = 16384;
    public static final int DEFAULT_MAX_QUEUED_CONTROL_FRAMES = 10000;
    static final int DEFAULT_MAX_RESERVED_STREAMS = 100;
    static final int DEFAULT_MIN_ALLOCATION_CHUNK = 1024;
    public static final short DEFAULT_PRIORITY_WEIGHT = 16;
    public static final int DEFAULT_WINDOW_SIZE = 65535;
    public static final int FRAME_HEADER_LENGTH = 9;
    public static final int GO_AWAY_FRAME_HEADER_LENGTH = 17;
    public static final int HEADERS_FRAME_HEADER_LENGTH = 15;
    public static final int HTTP_UPGRADE_STREAM_ID = 1;
    public static final int INT_FIELD_LENGTH = 4;
    public static final long MAX_CONCURRENT_STREAMS = 4294967295L;
    public static final int MAX_FRAME_SIZE_LOWER_BOUND = 16384;
    public static final int MAX_FRAME_SIZE_UPPER_BOUND = 16777215;
    public static final long MAX_HEADER_LIST_SIZE = 4294967295L;
    public static final long MAX_HEADER_TABLE_SIZE = 4294967295L;
    public static final int MAX_INITIAL_WINDOW_SIZE = Integer.MAX_VALUE;
    public static final int MAX_PADDING = 256;
    private static final int MAX_PADDING_LENGTH_LENGTH = 1;
    public static final short MAX_UNSIGNED_BYTE = 255;
    public static final long MAX_UNSIGNED_INT = 4294967295L;
    public static final short MAX_WEIGHT = 256;
    public static final long MIN_CONCURRENT_STREAMS = 0;
    public static final long MIN_HEADER_LIST_SIZE = 0;
    public static final long MIN_HEADER_TABLE_SIZE = 0;
    public static final int MIN_INITIAL_WINDOW_SIZE = 0;
    public static final short MIN_WEIGHT = 1;
    public static final int NUM_STANDARD_SETTINGS = 6;
    public static final int PING_FRAME_PAYLOAD_LENGTH = 8;
    public static final int PRIORITY_ENTRY_LENGTH = 5;
    public static final int PRIORITY_FRAME_LENGTH = 14;
    public static final int PUSH_PROMISE_FRAME_HEADER_LENGTH = 14;
    public static final int RST_STREAM_FRAME_LENGTH = 13;
    public static final char SETTINGS_ENABLE_PUSH = 2;
    public static final char SETTINGS_HEADER_TABLE_SIZE = 1;
    public static final char SETTINGS_INITIAL_WINDOW_SIZE = 4;
    public static final char SETTINGS_MAX_CONCURRENT_STREAMS = 3;
    public static final char SETTINGS_MAX_FRAME_SIZE = 5;
    public static final char SETTINGS_MAX_HEADER_LIST_SIZE = 6;
    public static final int SETTING_ENTRY_LENGTH = 6;
    public static final int SMALLEST_MAX_CONCURRENT_STREAMS = 100;
    public static final int WINDOW_UPDATE_FRAME_LENGTH = 13;
    public static final CharSequence HTTP_UPGRADE_SETTINGS_HEADER = AsciiString.cached(HttpHeaders.HTTP2_SETTINGS);
    public static final CharSequence HTTP_UPGRADE_PROTOCOL_NAME = "h2c";
    public static final CharSequence TLS_UPGRADE_PROTOCOL_NAME = ApplicationProtocolNames.HTTP_2;
    private static final ByteBuf CONNECTION_PREFACE = Unpooled.unreleasableBuffer(Unpooled.directBuffer(24).writeBytes("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(CharsetUtil.UTF_8))).asReadOnly();
    public static final long DEFAULT_GRACEFUL_SHUTDOWN_TIMEOUT_MILLIS = TimeUnit.MILLISECONDS.convert(30, TimeUnit.SECONDS);

    public static long calculateMaxHeaderListSizeGoAway(long j) {
        return j + (j >>> 2);
    }

    public static boolean isMaxFrameSizeValid(int i) {
        return i >= 16384 && i <= 16777215;
    }

    public static boolean isOutboundStream(boolean z, int i) {
        return i > 0 && z == ((i & 1) == 0);
    }

    public static boolean isStreamIdValid(int i) {
        return i >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isStreamIdValid(int i, boolean z) {
        if (isStreamIdValid(i)) {
            return z == ((i & 1) == 0);
        }
        return false;
    }

    public static ByteBuf connectionPrefaceBuf() {
        return CONNECTION_PREFACE.retainedDuplicate();
    }

    public static Http2Exception getEmbeddedHttp2Exception(Throwable th) {
        while (th != null) {
            if (th instanceof Http2Exception) {
                return (Http2Exception) th;
            }
            th = th.getCause();
        }
        return null;
    }

    public static ByteBuf toByteBuf(ChannelHandlerContext channelHandlerContext, Throwable th) {
        if (th == null || th.getMessage() == null) {
            return Unpooled.EMPTY_BUFFER;
        }
        return ByteBufUtil.writeUtf8(channelHandlerContext.alloc(), th.getMessage());
    }

    public static int readUnsignedInt(ByteBuf byteBuf) {
        return byteBuf.readInt() & Integer.MAX_VALUE;
    }

    public static void writeFrameHeader(ByteBuf byteBuf, int i, byte b, Http2Flags http2Flags, int i2) {
        byteBuf.ensureWritable(i + 9);
        writeFrameHeaderInternal(byteBuf, i, b, http2Flags, i2);
    }

    public static int streamableBytes(StreamByteDistributor.StreamState streamState) {
        return Math.max(0, (int) Math.min(streamState.pendingBytes(), streamState.windowSize()));
    }

    public static void headerListSizeExceeded(int i, long j, boolean z) throws Http2Exception {
        throw Http2Exception.headerListSizeError(i, Http2Error.PROTOCOL_ERROR, z, "Header size exceeded max allowed size (%d)", Long.valueOf(j));
    }

    public static void headerListSizeExceeded(long j) throws Http2Exception {
        throw Http2Exception.connectionError(Http2Error.PROTOCOL_ERROR, "Header size exceeded max allowed size (%d)", Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeFrameHeaderInternal(ByteBuf byteBuf, int i, byte b, Http2Flags http2Flags, int i2) {
        byteBuf.writeMedium(i);
        byteBuf.writeByte(b);
        byteBuf.writeByte(http2Flags.value());
        byteBuf.writeInt(i2);
    }

    /* loaded from: classes4.dex */
    static final class SimpleChannelPromiseAggregator extends DefaultChannelPromise {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean doneAllocating;
        private int doneCount;
        private int expectedCount;
        private Throwable lastFailure;
        private final ChannelPromise promise;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SimpleChannelPromiseAggregator(ChannelPromise channelPromise, Channel channel, EventExecutor eventExecutor) {
            super(channel, eventExecutor);
            this.promise = channelPromise;
        }

        public ChannelPromise newPromise() {
            this.expectedCount++;
            return this;
        }

        public ChannelPromise doneAllocatingPromises() {
            if (!this.doneAllocating) {
                this.doneAllocating = true;
                int i = this.doneCount;
                int i2 = this.expectedCount;
                if (i == i2 || i2 == 0) {
                    return setPromise();
                }
            }
            return this;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Promise
        public boolean tryFailure(Throwable th) {
            if (allowFailure()) {
                this.doneCount++;
                this.lastFailure = th;
                if (allPromisesDone()) {
                    return tryPromise();
                }
                return true;
            }
            return false;
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.DefaultChannelPromise, io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Promise, io.grpc.netty.shaded.io.netty.channel.ChannelPromise
        public ChannelPromise setFailure(Throwable th) {
            if (allowFailure()) {
                this.doneCount++;
                this.lastFailure = th;
                if (allPromisesDone()) {
                    return setPromise();
                }
            }
            return this;
        }

        @Override // io.grpc.netty.shaded.io.netty.channel.DefaultChannelPromise, io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Promise
        public ChannelPromise setSuccess(Void r1) {
            if (awaitingPromises()) {
                this.doneCount++;
                if (allPromisesDone()) {
                    setPromise();
                }
            }
            return this;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.DefaultPromise, io.grpc.netty.shaded.io.netty.util.concurrent.Promise
        public boolean trySuccess(Void r2) {
            if (awaitingPromises()) {
                this.doneCount++;
                if (allPromisesDone()) {
                    return tryPromise();
                }
                return true;
            }
            return false;
        }

        private boolean allowFailure() {
            return awaitingPromises() || this.expectedCount == 0;
        }

        private boolean awaitingPromises() {
            return this.doneCount < this.expectedCount;
        }

        private boolean allPromisesDone() {
            return this.doneCount == this.expectedCount && this.doneAllocating;
        }

        private ChannelPromise setPromise() {
            Throwable th = this.lastFailure;
            if (th == null) {
                this.promise.setSuccess();
                return super.setSuccess((Void) null);
            }
            this.promise.setFailure(th);
            return super.setFailure(this.lastFailure);
        }

        private boolean tryPromise() {
            Throwable th = this.lastFailure;
            if (th == null) {
                this.promise.trySuccess();
                return super.trySuccess((SimpleChannelPromiseAggregator) null);
            }
            this.promise.tryFailure(th);
            return super.tryFailure(this.lastFailure);
        }
    }

    public static void verifyPadding(int i) {
        if (i < 0 || i > 256) {
            throw new IllegalArgumentException(String.format("Invalid padding '%d'. Padding must be between 0 and %d (inclusive).", Integer.valueOf(i), 256));
        }
    }

    private Http2CodecUtil() {
    }
}
