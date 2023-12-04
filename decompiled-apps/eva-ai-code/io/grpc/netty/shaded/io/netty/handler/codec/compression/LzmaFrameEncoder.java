package io.grpc.netty.shaded.io.netty.handler.codec.compression;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufInputStream;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufOutputStream;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import lzma.sdk.ICodeProgress;
import lzma.sdk.lzma.Encoder;
/* loaded from: classes4.dex */
public class LzmaFrameEncoder extends MessageToByteEncoder<ByteBuf> {
    private static final int DEFAULT_LC = 3;
    private static final int DEFAULT_LP = 0;
    private static final int DEFAULT_MATCH_FINDER = 1;
    private static final int DEFAULT_PB = 2;
    private static final int MAX_FAST_BYTES = 273;
    private static final int MEDIUM_DICTIONARY_SIZE = 65536;
    private static final int MEDIUM_FAST_BYTES = 32;
    private static final int MIN_FAST_BYTES = 5;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(LzmaFrameEncoder.class);
    private static boolean warningLogged;
    private final Encoder encoder;
    private final int littleEndianDictionarySize;
    private final byte properties;

    private static int maxOutputBufferLength(int i) {
        return ((int) (i * (i < 200 ? 1.5d : i < 500 ? 1.2d : i < 1000 ? 1.1d : i < 10000 ? 1.05d : 1.02d))) + 13;
    }

    public LzmaFrameEncoder() {
        this(65536);
    }

    public LzmaFrameEncoder(int i, int i2, int i3) {
        this(i, i2, i3, 65536);
    }

    public LzmaFrameEncoder(int i) {
        this(3, 0, 2, i);
    }

    public LzmaFrameEncoder(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, false, 32);
    }

    public LzmaFrameEncoder(int i, int i2, int i3, int i4, boolean z, int i5) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("lc: " + i + " (expected: 0-8)");
        } else if (i2 < 0 || i2 > 4) {
            throw new IllegalArgumentException("lp: " + i2 + " (expected: 0-4)");
        } else if (i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException("pb: " + i3 + " (expected: 0-4)");
        } else {
            if (i + i2 > 4 && !warningLogged) {
                logger.warn("The latest versions of LZMA libraries (for example, XZ Utils) has an additional requirement: lc + lp <= 4. Data which don't follow this requirement cannot be decompressed with this libraries.");
                warningLogged = true;
            }
            if (i4 < 0) {
                throw new IllegalArgumentException("dictionarySize: " + i4 + " (expected: 0+)");
            } else if (i5 < 5 || i5 > MAX_FAST_BYTES) {
                throw new IllegalArgumentException(String.format("numFastBytes: %d (expected: %d-%d)", Integer.valueOf(i5), 5, Integer.valueOf((int) MAX_FAST_BYTES)));
            } else {
                Encoder encoder = new Encoder();
                this.encoder = encoder;
                encoder.setDictionarySize(i4);
                encoder.setEndMarkerMode(z);
                encoder.setMatchFinder(1);
                encoder.setNumFastBytes(i5);
                encoder.setLcLpPb(i, i2, i3);
                this.properties = (byte) ((((i3 * 5) + i2) * 9) + i);
                this.littleEndianDictionarySize = Integer.reverseBytes(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        ByteBufOutputStream byteBufOutputStream;
        int readableBytes = byteBuf.readableBytes();
        ByteBufInputStream byteBufInputStream = null;
        try {
            ByteBufInputStream byteBufInputStream2 = new ByteBufInputStream(byteBuf);
            try {
                byteBufOutputStream = new ByteBufOutputStream(byteBuf2);
                try {
                    byteBufOutputStream.writeByte(this.properties);
                    byteBufOutputStream.writeInt(this.littleEndianDictionarySize);
                    byteBufOutputStream.writeLong(Long.reverseBytes(readableBytes));
                    this.encoder.code(byteBufInputStream2, byteBufOutputStream, -1L, -1L, (ICodeProgress) null);
                    byteBufInputStream2.close();
                    byteBufOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    byteBufInputStream = byteBufInputStream2;
                    if (byteBufInputStream != null) {
                        byteBufInputStream.close();
                    }
                    if (byteBufOutputStream != null) {
                        byteBufOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteBufOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteBufOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder
    public ByteBuf allocateBuffer(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, boolean z) throws Exception {
        return channelHandlerContext.alloc().ioBuffer(maxOutputBufferLength(byteBuf.readableBytes()));
    }
}
