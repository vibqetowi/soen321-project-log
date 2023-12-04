package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageEncoder;
import io.grpc.netty.shaded.io.netty.handler.codec.TooLongFrameException;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
/* loaded from: classes4.dex */
public class WebSocket08FrameEncoder extends MessageToMessageEncoder<WebSocketFrame> implements WebSocketFrameEncoder {
    private static final int GATHERING_WRITE_THRESHOLD = 1024;
    private static final byte OPCODE_BINARY = 2;
    private static final byte OPCODE_CLOSE = 8;
    private static final byte OPCODE_CONT = 0;
    private static final byte OPCODE_PING = 9;
    private static final byte OPCODE_PONG = 10;
    private static final byte OPCODE_TEXT = 1;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(WebSocket08FrameEncoder.class);
    private final boolean maskPayload;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageEncoder
    public /* bridge */ /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, List list) throws Exception {
        encode2(channelHandlerContext, webSocketFrame, (List<Object>) list);
    }

    public WebSocket08FrameEncoder(boolean z) {
        this.maskPayload = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [io.grpc.netty.shaded.io.netty.buffer.ByteBuf] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* renamed from: encode  reason: avoid collision after fix types in other method */
    protected void encode2(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, List<Object> list) throws Exception {
        byte b;
        ?? r4;
        ByteBuf buffer;
        ByteBuf content = webSocketFrame.content();
        int i = 0;
        if (webSocketFrame instanceof TextWebSocketFrame) {
            b = 1;
        } else if (webSocketFrame instanceof PingWebSocketFrame) {
            b = 9;
        } else if (webSocketFrame instanceof PongWebSocketFrame) {
            b = 10;
        } else if (webSocketFrame instanceof CloseWebSocketFrame) {
            b = 8;
        } else if (webSocketFrame instanceof BinaryWebSocketFrame) {
            b = 2;
        } else if (!(webSocketFrame instanceof ContinuationWebSocketFrame)) {
            throw new UnsupportedOperationException("Cannot encode frame of type: " + webSocketFrame.getClass().getName());
        } else {
            b = 0;
        }
        int readableBytes = content.readableBytes();
        InternalLogger internalLogger = logger;
        if (internalLogger.isTraceEnabled()) {
            internalLogger.trace("Encoding WebSocket Frame opCode={} length={}", Byte.valueOf(b), Integer.valueOf(readableBytes));
        }
        int rsv = ((webSocketFrame.rsv() % 8) << 4) | (webSocketFrame.isFinalFragment() ? 128 : 0) | (b % 128);
        if (b == 9 && readableBytes > 125) {
            throw new TooLongFrameException("invalid payload for PING (payload length must be <= 125, was " + readableBytes);
        }
        try {
            boolean z = this.maskPayload;
            int i2 = z ? 4 : 0;
            r4 = 1024;
            try {
                if (readableBytes <= 125) {
                    int i3 = i2 + 2;
                    if (z || readableBytes <= 1024) {
                        i3 += readableBytes;
                    }
                    buffer = channelHandlerContext.alloc().buffer(i3);
                    buffer.writeByte(rsv);
                    buffer.writeByte((byte) (this.maskPayload ? ((byte) readableBytes) | 128 : (byte) readableBytes));
                } else if (readableBytes <= 65535) {
                    int i4 = i2 + 4;
                    if (z || readableBytes <= 1024) {
                        i4 += readableBytes;
                    }
                    buffer = channelHandlerContext.alloc().buffer(i4);
                    buffer.writeByte(rsv);
                    buffer.writeByte(this.maskPayload ? 254 : WebSocketProtocol.PAYLOAD_SHORT);
                    buffer.writeByte((readableBytes >>> 8) & 255);
                    buffer.writeByte(readableBytes & 255);
                } else {
                    int i5 = i2 + 10;
                    if (z || readableBytes <= 1024) {
                        i5 += readableBytes;
                    }
                    buffer = channelHandlerContext.alloc().buffer(i5);
                    buffer.writeByte(rsv);
                    buffer.writeByte(this.maskPayload ? 255 : 127);
                    buffer.writeLong(readableBytes);
                }
                if (this.maskPayload) {
                    byte[] array = ByteBuffer.allocate(4).putInt((int) (Math.random() * 2.147483647E9d)).array();
                    buffer.writeBytes(array);
                    ByteOrder order = content.order();
                    ByteOrder order2 = buffer.order();
                    int readerIndex = content.readerIndex();
                    int writerIndex = content.writerIndex();
                    if (order == order2) {
                        int i6 = ((array[0] & 255) << 24) | ((array[1] & 255) << 16) | ((array[2] & 255) << 8) | (array[3] & 255);
                        if (order == ByteOrder.LITTLE_ENDIAN) {
                            i6 = Integer.reverseBytes(i6);
                        }
                        while (readerIndex + 3 < writerIndex) {
                            buffer.writeInt(content.getInt(readerIndex) ^ i6);
                            readerIndex += 4;
                        }
                    }
                    while (readerIndex < writerIndex) {
                        buffer.writeByte(content.getByte(readerIndex) ^ array[i % 4]);
                        readerIndex++;
                        i++;
                    }
                    list.add(buffer);
                } else if (buffer.writableBytes() >= content.readableBytes()) {
                    buffer.writeBytes(content);
                    list.add(buffer);
                } else {
                    list.add(buffer);
                    list.add(content.retain());
                }
            } catch (Throwable th) {
                th = th;
                if (r4 != 0) {
                    r4.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r4 = 0;
        }
    }
}
