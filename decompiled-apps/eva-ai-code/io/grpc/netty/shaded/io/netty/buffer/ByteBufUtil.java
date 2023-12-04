package io.grpc.netty.shaded.io.netty.buffer;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.netty.shaded.io.netty.util.ByteProcessor;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.IllegalReferenceCountException;
import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal;
import io.grpc.netty.shaded.io.netty.util.internal.MathUtil;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectPool;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.ClassUtils;
/* loaded from: classes4.dex */
public final class ByteBufUtil {
    private static final FastThreadLocal<byte[]> BYTE_ARRAYS;
    static final ByteBufAllocator DEFAULT_ALLOCATOR;
    private static final ByteProcessor FIND_NON_ASCII;
    private static final int MAX_BYTES_PER_CHAR_UTF8;
    private static final int MAX_CHAR_BUFFER_SIZE;
    static final int MAX_TL_ARRAY_LEN = 1024;
    private static final int THREAD_LOCAL_BUFFER_SIZE;
    static final int WRITE_CHUNK_SIZE = 8192;
    private static final byte WRITE_UTF_UNKNOWN = 63;
    private static final InternalLogger logger;

    public static boolean ensureWritableSuccess(int i) {
        return i == 0 || i == 2;
    }

    public static int swapMedium(int i) {
        int i2 = ((i >>> 16) & 255) | ((i << 16) & 16711680) | (65280 & i);
        return (8388608 & i2) != 0 ? i2 | (-16777216) : i2;
    }

    static {
        ByteBufAllocator byteBufAllocator;
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(ByteBufUtil.class);
        logger = internalLoggerFactory;
        BYTE_ARRAYS = new FastThreadLocal<byte[]>() { // from class: io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal
            public byte[] initialValue() throws Exception {
                return PlatformDependent.allocateUninitializedArray(1024);
            }
        };
        MAX_BYTES_PER_CHAR_UTF8 = (int) CharsetUtil.encoder(CharsetUtil.UTF_8).maxBytesPerChar();
        String trim = SystemPropertyUtil.get("io.grpc.netty.shaded.io.netty.allocator.type", PlatformDependent.isAndroid() ? "unpooled" : "pooled").toLowerCase(Locale.US).trim();
        if ("unpooled".equals(trim)) {
            byteBufAllocator = UnpooledByteBufAllocator.DEFAULT;
            internalLoggerFactory.debug("-Dio.netty.allocator.type: {}", trim);
        } else if ("pooled".equals(trim)) {
            byteBufAllocator = PooledByteBufAllocator.DEFAULT;
            internalLoggerFactory.debug("-Dio.netty.allocator.type: {}", trim);
        } else {
            byteBufAllocator = PooledByteBufAllocator.DEFAULT;
            internalLoggerFactory.debug("-Dio.netty.allocator.type: pooled (unknown: {})", trim);
        }
        DEFAULT_ALLOCATOR = byteBufAllocator;
        int i = SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.threadLocalDirectBufferSize", 0);
        THREAD_LOCAL_BUFFER_SIZE = i;
        internalLoggerFactory.debug("-Dio.netty.threadLocalDirectBufferSize: {}", Integer.valueOf(i));
        int i2 = SystemPropertyUtil.getInt("io.grpc.netty.shaded.io.netty.maxThreadLocalCharBufferSize", 16384);
        MAX_CHAR_BUFFER_SIZE = i2;
        internalLoggerFactory.debug("-Dio.netty.maxThreadLocalCharBufferSize: {}", Integer.valueOf(i2));
        FIND_NON_ASCII = new ByteProcessor() { // from class: io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil.2
            @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
            public boolean process(byte b) {
                return b >= 0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] threadLocalTempArray(int i) {
        if (i <= 1024) {
            return BYTE_ARRAYS.get();
        }
        return PlatformDependent.allocateUninitializedArray(i);
    }

    public static boolean isAccessible(ByteBuf byteBuf) {
        return byteBuf.isAccessible();
    }

    public static ByteBuf ensureAccessible(ByteBuf byteBuf) {
        if (byteBuf.isAccessible()) {
            return byteBuf;
        }
        throw new IllegalReferenceCountException(byteBuf.refCnt());
    }

    public static String hexDump(ByteBuf byteBuf) {
        return hexDump(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public static String hexDump(ByteBuf byteBuf, int i, int i2) {
        return HexUtil.hexDump(byteBuf, i, i2);
    }

    public static String hexDump(byte[] bArr) {
        return hexDump(bArr, 0, bArr.length);
    }

    public static String hexDump(byte[] bArr, int i, int i2) {
        return HexUtil.hexDump(bArr, i, i2);
    }

    public static byte decodeHexByte(CharSequence charSequence, int i) {
        return StringUtil.decodeHexByte(charSequence, i);
    }

    public static byte[] decodeHexDump(CharSequence charSequence) {
        return StringUtil.decodeHexDump(charSequence, 0, charSequence.length());
    }

    public static byte[] decodeHexDump(CharSequence charSequence, int i, int i2) {
        return StringUtil.decodeHexDump(charSequence, i, i2);
    }

    public static int hashCode(ByteBuf byteBuf) {
        int i;
        int readableBytes = byteBuf.readableBytes();
        int i2 = readableBytes >>> 2;
        int i3 = readableBytes & 3;
        int readerIndex = byteBuf.readerIndex();
        if (byteBuf.order() == ByteOrder.BIG_ENDIAN) {
            i = 1;
            while (i2 > 0) {
                i = (i * 31) + byteBuf.getInt(readerIndex);
                readerIndex += 4;
                i2--;
            }
        } else {
            i = 1;
            while (i2 > 0) {
                i = (i * 31) + swapInt(byteBuf.getInt(readerIndex));
                readerIndex += 4;
                i2--;
            }
        }
        while (i3 > 0) {
            i = (i * 31) + byteBuf.getByte(readerIndex);
            i3--;
            readerIndex++;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static int indexOf(ByteBuf byteBuf, ByteBuf byteBuf2) {
        int readableBytes = (byteBuf2.readableBytes() - byteBuf.readableBytes()) + 1;
        for (int i = 0; i < readableBytes; i++) {
            if (equals(byteBuf, byteBuf.readerIndex(), byteBuf2, byteBuf2.readerIndex() + i, byteBuf.readableBytes())) {
                return byteBuf2.readerIndex() + i;
            }
        }
        return -1;
    }

    public static boolean equals(ByteBuf byteBuf, int i, ByteBuf byteBuf2, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("All indexes and lengths must be non-negative");
        }
        if (byteBuf.writerIndex() - i3 < i || byteBuf2.writerIndex() - i3 < i2) {
            return false;
        }
        int i4 = i3 >>> 3;
        if (byteBuf.order() == byteBuf2.order()) {
            while (i4 > 0) {
                if (byteBuf.getLong(i) != byteBuf2.getLong(i2)) {
                    return false;
                }
                i += 8;
                i2 += 8;
                i4--;
            }
        } else {
            while (i4 > 0) {
                if (byteBuf.getLong(i) != swapLong(byteBuf2.getLong(i2))) {
                    return false;
                }
                i += 8;
                i2 += 8;
                i4--;
            }
        }
        for (int i5 = i3 & 7; i5 > 0; i5--) {
            if (byteBuf.getByte(i) != byteBuf2.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static boolean equals(ByteBuf byteBuf, ByteBuf byteBuf2) {
        int readableBytes = byteBuf.readableBytes();
        if (readableBytes != byteBuf2.readableBytes()) {
            return false;
        }
        return equals(byteBuf, byteBuf.readerIndex(), byteBuf2, byteBuf2.readerIndex(), readableBytes);
    }

    public static int compare(ByteBuf byteBuf, ByteBuf byteBuf2) {
        long compareUintBigEndianB;
        int readableBytes = byteBuf.readableBytes();
        int readableBytes2 = byteBuf2.readableBytes();
        int min = Math.min(readableBytes, readableBytes2);
        int i = min >>> 2;
        int i2 = min & 3;
        int readerIndex = byteBuf.readerIndex();
        int readerIndex2 = byteBuf2.readerIndex();
        if (i > 0) {
            boolean z = byteBuf.order() == ByteOrder.BIG_ENDIAN;
            int i3 = i << 2;
            if (byteBuf.order() == byteBuf2.order()) {
                if (z) {
                    compareUintBigEndianB = compareUintBigEndian(byteBuf, byteBuf2, readerIndex, readerIndex2, i3);
                } else {
                    compareUintBigEndianB = compareUintLittleEndian(byteBuf, byteBuf2, readerIndex, readerIndex2, i3);
                }
            } else if (z) {
                compareUintBigEndianB = compareUintBigEndianA(byteBuf, byteBuf2, readerIndex, readerIndex2, i3);
            } else {
                compareUintBigEndianB = compareUintBigEndianB(byteBuf, byteBuf2, readerIndex, readerIndex2, i3);
            }
            if (compareUintBigEndianB != 0) {
                return (int) Math.min(2147483647L, Math.max(-2147483648L, compareUintBigEndianB));
            }
            readerIndex += i3;
            readerIndex2 += i3;
        }
        int i4 = i2 + readerIndex;
        while (readerIndex < i4) {
            int unsignedByte = byteBuf.getUnsignedByte(readerIndex) - byteBuf2.getUnsignedByte(readerIndex2);
            if (unsignedByte != 0) {
                return unsignedByte;
            }
            readerIndex++;
            readerIndex2++;
        }
        return readableBytes - readableBytes2;
    }

    private static long compareUintBigEndian(ByteBuf byteBuf, ByteBuf byteBuf2, int i, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            long unsignedInt = byteBuf.getUnsignedInt(i) - byteBuf2.getUnsignedInt(i2);
            if (unsignedInt != 0) {
                return unsignedInt;
            }
            i += 4;
            i2 += 4;
        }
        return 0L;
    }

    private static long compareUintLittleEndian(ByteBuf byteBuf, ByteBuf byteBuf2, int i, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            long unsignedIntLE = byteBuf.getUnsignedIntLE(i) - byteBuf2.getUnsignedIntLE(i2);
            if (unsignedIntLE != 0) {
                return unsignedIntLE;
            }
            i += 4;
            i2 += 4;
        }
        return 0L;
    }

    private static long compareUintBigEndianA(ByteBuf byteBuf, ByteBuf byteBuf2, int i, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            long unsignedInt = byteBuf.getUnsignedInt(i) - byteBuf2.getUnsignedIntLE(i2);
            if (unsignedInt != 0) {
                return unsignedInt;
            }
            i += 4;
            i2 += 4;
        }
        return 0L;
    }

    private static long compareUintBigEndianB(ByteBuf byteBuf, ByteBuf byteBuf2, int i, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            long unsignedIntLE = byteBuf.getUnsignedIntLE(i) - byteBuf2.getUnsignedInt(i2);
            if (unsignedIntLE != 0) {
                return unsignedIntLE;
            }
            i += 4;
            i2 += 4;
        }
        return 0L;
    }

    public static int indexOf(ByteBuf byteBuf, int i, int i2, byte b) {
        if (i <= i2) {
            return firstIndexOf(byteBuf, i, i2, b);
        }
        return lastIndexOf(byteBuf, i, i2, b);
    }

    public static short swapShort(short s) {
        return Short.reverseBytes(s);
    }

    public static int swapInt(int i) {
        return Integer.reverseBytes(i);
    }

    public static long swapLong(long j) {
        return Long.reverseBytes(j);
    }

    public static ByteBuf writeShortBE(ByteBuf byteBuf, int i) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.writeShort(i) : byteBuf.writeShortLE(i);
    }

    public static ByteBuf setShortBE(ByteBuf byteBuf, int i, int i2) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.setShort(i, i2) : byteBuf.setShortLE(i, i2);
    }

    public static ByteBuf writeMediumBE(ByteBuf byteBuf, int i) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.writeMedium(i) : byteBuf.writeMediumLE(i);
    }

    public static ByteBuf readBytes(ByteBufAllocator byteBufAllocator, ByteBuf byteBuf, int i) {
        ByteBuf buffer = byteBufAllocator.buffer(i);
        try {
            byteBuf.readBytes(buffer);
            return buffer;
        } catch (Throwable th) {
            buffer.release();
            throw th;
        }
    }

    private static int firstIndexOf(ByteBuf byteBuf, int i, int i2, byte b) {
        int max = Math.max(i, 0);
        if (max >= i2 || byteBuf.capacity() == 0) {
            return -1;
        }
        return byteBuf.forEachByte(max, i2 - max, new ByteProcessor.IndexOfProcessor(b));
    }

    private static int lastIndexOf(ByteBuf byteBuf, int i, int i2, byte b) {
        int capacity = byteBuf.capacity();
        int min = Math.min(i, capacity);
        if (min < 0 || capacity == 0) {
            return -1;
        }
        return byteBuf.forEachByteDesc(i2, min - i2, new ByteProcessor.IndexOfProcessor(b));
    }

    private static CharSequence checkCharSequenceBounds(CharSequence charSequence, int i, int i2) {
        if (MathUtil.isOutOfBounds(i, i2 - i, charSequence.length())) {
            throw new IndexOutOfBoundsException("expected: 0 <= start(" + i + ") <= end (" + i2 + ") <= seq.length(" + charSequence.length() + ')');
        }
        return charSequence;
    }

    public static ByteBuf writeUtf8(ByteBufAllocator byteBufAllocator, CharSequence charSequence) {
        ByteBuf buffer = byteBufAllocator.buffer(utf8MaxBytes(charSequence));
        writeUtf8(buffer, charSequence);
        return buffer;
    }

    public static int writeUtf8(ByteBuf byteBuf, CharSequence charSequence) {
        int length = charSequence.length();
        return reserveAndWriteUtf8Seq(byteBuf, charSequence, 0, length, utf8MaxBytes(length));
    }

    public static int writeUtf8(ByteBuf byteBuf, CharSequence charSequence, int i, int i2) {
        checkCharSequenceBounds(charSequence, i, i2);
        return reserveAndWriteUtf8Seq(byteBuf, charSequence, i, i2, utf8MaxBytes(i2 - i));
    }

    public static int reserveAndWriteUtf8(ByteBuf byteBuf, CharSequence charSequence, int i) {
        return reserveAndWriteUtf8Seq(byteBuf, charSequence, 0, charSequence.length(), i);
    }

    public static int reserveAndWriteUtf8(ByteBuf byteBuf, CharSequence charSequence, int i, int i2, int i3) {
        return reserveAndWriteUtf8Seq(byteBuf, checkCharSequenceBounds(charSequence, i, i2), i, i2, i3);
    }

    private static int reserveAndWriteUtf8Seq(ByteBuf byteBuf, CharSequence charSequence, int i, int i2, int i3) {
        while (true) {
            if (byteBuf instanceof WrappedCompositeByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else if (byteBuf instanceof AbstractByteBuf) {
                AbstractByteBuf abstractByteBuf = (AbstractByteBuf) byteBuf;
                abstractByteBuf.ensureWritable0(i3);
                int writeUtf8 = writeUtf8(abstractByteBuf, abstractByteBuf.writerIndex, charSequence, i, i2);
                abstractByteBuf.writerIndex += writeUtf8;
                return writeUtf8;
            } else if (byteBuf instanceof WrappedByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else {
                byte[] bytes = charSequence.subSequence(i, i2).toString().getBytes(CharsetUtil.UTF_8);
                byteBuf.writeBytes(bytes);
                return bytes.length;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int writeUtf8(AbstractByteBuf abstractByteBuf, int i, CharSequence charSequence, int i2) {
        return writeUtf8(abstractByteBuf, i, charSequence, 0, i2);
    }

    static int writeUtf8(AbstractByteBuf abstractByteBuf, int i, CharSequence charSequence, int i2, int i3) {
        int i4 = i;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 128) {
                abstractByteBuf._setByte(i4, (byte) charAt);
                i4++;
            } else if (charAt < 2048) {
                int i5 = i4 + 1;
                abstractByteBuf._setByte(i4, (byte) ((charAt >> 6) | PsExtractor.AUDIO_STREAM));
                i4 = i5 + 1;
                abstractByteBuf._setByte(i5, (byte) ((charAt & '?') | 128));
            } else if (StringUtil.isSurrogate(charAt)) {
                if (Character.isHighSurrogate(charAt)) {
                    i2++;
                    if (i2 == i3) {
                        abstractByteBuf._setByte(i4, 63);
                        i4++;
                        break;
                    }
                    i4 = writeUtf8Surrogate(abstractByteBuf, i4, charAt, charSequence.charAt(i2));
                } else {
                    abstractByteBuf._setByte(i4, 63);
                    i4++;
                }
            } else {
                int i6 = i4 + 1;
                abstractByteBuf._setByte(i4, (byte) ((charAt >> '\f') | 224));
                int i7 = i6 + 1;
                abstractByteBuf._setByte(i6, (byte) ((63 & (charAt >> 6)) | 128));
                abstractByteBuf._setByte(i7, (byte) ((charAt & '?') | 128));
                i4 = i7 + 1;
            }
            i2++;
        }
        return i4 - i;
    }

    private static int writeUtf8Surrogate(AbstractByteBuf abstractByteBuf, int i, char c, char c2) {
        if (!Character.isLowSurrogate(c2)) {
            int i2 = i + 1;
            abstractByteBuf._setByte(i, 63);
            int i3 = i2 + 1;
            if (Character.isHighSurrogate(c2)) {
                c2 = '?';
            }
            abstractByteBuf._setByte(i2, c2);
            return i3;
        }
        int codePoint = Character.toCodePoint(c, c2);
        int i4 = i + 1;
        abstractByteBuf._setByte(i, (byte) ((codePoint >> 18) | PsExtractor.VIDEO_STREAM_MASK));
        int i5 = i4 + 1;
        abstractByteBuf._setByte(i4, (byte) (((codePoint >> 12) & 63) | 128));
        int i6 = i5 + 1;
        abstractByteBuf._setByte(i5, (byte) (((codePoint >> 6) & 63) | 128));
        int i7 = i6 + 1;
        abstractByteBuf._setByte(i6, (byte) ((codePoint & 63) | 128));
        return i7;
    }

    public static int utf8MaxBytes(int i) {
        return i * MAX_BYTES_PER_CHAR_UTF8;
    }

    public static int utf8MaxBytes(CharSequence charSequence) {
        return utf8MaxBytes(charSequence.length());
    }

    public static int utf8Bytes(CharSequence charSequence) {
        return utf8ByteCount(charSequence, 0, charSequence.length());
    }

    public static int utf8Bytes(CharSequence charSequence, int i, int i2) {
        return utf8ByteCount(checkCharSequenceBounds(charSequence, i, i2), i, i2);
    }

    private static int utf8ByteCount(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof AsciiString) {
            return i2 - i;
        }
        int i3 = i;
        while (i3 < i2 && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = i3 - i;
        return i3 < i2 ? i4 + utf8BytesNonAscii(charSequence, i3, i2) : i4;
    }

    private static int utf8BytesNonAscii(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i3 += ((127 - charAt) >>> 31) + 1;
            } else if (!StringUtil.isSurrogate(charAt)) {
                i3 += 3;
            } else if (Character.isHighSurrogate(charAt)) {
                i++;
                if (i == i2) {
                    return i3 + 1;
                }
                i3 = !Character.isLowSurrogate(charSequence.charAt(i)) ? i3 + 2 : i3 + 4;
            } else {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public static ByteBuf writeAscii(ByteBufAllocator byteBufAllocator, CharSequence charSequence) {
        ByteBuf buffer = byteBufAllocator.buffer(charSequence.length());
        writeAscii(buffer, charSequence);
        return buffer;
    }

    public static int writeAscii(ByteBuf byteBuf, CharSequence charSequence) {
        int length = charSequence.length();
        if (charSequence instanceof AsciiString) {
            AsciiString asciiString = (AsciiString) charSequence;
            byteBuf.writeBytes(asciiString.array(), asciiString.arrayOffset(), length);
            return length;
        }
        while (true) {
            if (byteBuf instanceof WrappedCompositeByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else if (byteBuf instanceof AbstractByteBuf) {
                AbstractByteBuf abstractByteBuf = (AbstractByteBuf) byteBuf;
                abstractByteBuf.ensureWritable0(length);
                int writeAscii = writeAscii(abstractByteBuf, abstractByteBuf.writerIndex, charSequence, length);
                abstractByteBuf.writerIndex += writeAscii;
                return writeAscii;
            } else if (byteBuf instanceof WrappedByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else {
                byte[] bytes = charSequence.toString().getBytes(CharsetUtil.US_ASCII);
                byteBuf.writeBytes(bytes);
                return bytes.length;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int writeAscii(AbstractByteBuf abstractByteBuf, int i, CharSequence charSequence, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            abstractByteBuf._setByte(i, AsciiString.c2b(charSequence.charAt(i3)));
            i3++;
            i++;
        }
        return i2;
    }

    public static ByteBuf encodeString(ByteBufAllocator byteBufAllocator, CharBuffer charBuffer, Charset charset) {
        return encodeString0(byteBufAllocator, false, charBuffer, charset, 0);
    }

    public static ByteBuf encodeString(ByteBufAllocator byteBufAllocator, CharBuffer charBuffer, Charset charset, int i) {
        return encodeString0(byteBufAllocator, false, charBuffer, charset, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuf encodeString0(ByteBufAllocator byteBufAllocator, boolean z, CharBuffer charBuffer, Charset charset, int i) {
        ByteBuf buffer;
        CharsetEncoder encoder = CharsetUtil.encoder(charset);
        int remaining = ((int) (charBuffer.remaining() * encoder.maxBytesPerChar())) + i;
        if (z) {
            buffer = byteBufAllocator.heapBuffer(remaining);
        } else {
            buffer = byteBufAllocator.buffer(remaining);
        }
        try {
            try {
                ByteBuffer internalNioBuffer = buffer.internalNioBuffer(buffer.readerIndex(), remaining);
                int position = internalNioBuffer.position();
                CoderResult encode = encoder.encode(charBuffer, internalNioBuffer, true);
                if (!encode.isUnderflow()) {
                    encode.throwException();
                }
                CoderResult flush = encoder.flush(internalNioBuffer);
                if (!flush.isUnderflow()) {
                    flush.throwException();
                }
                buffer.writerIndex((buffer.writerIndex() + internalNioBuffer.position()) - position);
                return buffer;
            } catch (CharacterCodingException e) {
                throw new IllegalStateException(e);
            }
        } catch (Throwable th) {
            buffer.release();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeString(ByteBuf byteBuf, int i, int i2, Charset charset) {
        byte[] threadLocalTempArray;
        int i3;
        if (i2 == 0) {
            return "";
        }
        if (byteBuf.hasArray()) {
            threadLocalTempArray = byteBuf.array();
            i3 = byteBuf.arrayOffset() + i;
        } else {
            threadLocalTempArray = threadLocalTempArray(i2);
            byteBuf.getBytes(i, threadLocalTempArray, 0, i2);
            i3 = 0;
        }
        if (CharsetUtil.US_ASCII.equals(charset)) {
            return new String(threadLocalTempArray, 0, i3, i2);
        }
        return new String(threadLocalTempArray, i3, i2, charset);
    }

    public static ByteBuf threadLocalDirectBuffer() {
        if (THREAD_LOCAL_BUFFER_SIZE <= 0) {
            return null;
        }
        if (PlatformDependent.hasUnsafe()) {
            return ThreadLocalUnsafeDirectByteBuf.newInstance();
        }
        return ThreadLocalDirectByteBuf.newInstance();
    }

    public static byte[] getBytes(ByteBuf byteBuf) {
        return getBytes(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public static byte[] getBytes(ByteBuf byteBuf, int i, int i2) {
        return getBytes(byteBuf, i, i2, true);
    }

    public static byte[] getBytes(ByteBuf byteBuf, int i, int i2, boolean z) {
        int capacity = byteBuf.capacity();
        if (MathUtil.isOutOfBounds(i, i2, capacity)) {
            throw new IndexOutOfBoundsException("expected: 0 <= start(" + i + ") <= start + length(" + i2 + ") <= buf.capacity(" + capacity + ')');
        } else if (byteBuf.hasArray()) {
            int arrayOffset = byteBuf.arrayOffset() + i;
            byte[] array = byteBuf.array();
            return (!z && arrayOffset == 0 && i2 == array.length) ? array : Arrays.copyOfRange(array, arrayOffset, i2 + arrayOffset);
        } else {
            byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray(i2);
            byteBuf.getBytes(i, allocateUninitializedArray);
            return allocateUninitializedArray;
        }
    }

    public static void copy(AsciiString asciiString, ByteBuf byteBuf) {
        copy(asciiString, 0, byteBuf, asciiString.length());
    }

    public static void copy(AsciiString asciiString, int i, ByteBuf byteBuf, int i2, int i3) {
        if (MathUtil.isOutOfBounds(i, i3, asciiString.length())) {
            throw new IndexOutOfBoundsException("expected: 0 <= srcIdx(" + i + ") <= srcIdx + length(" + i3 + ") <= srcLen(" + asciiString.length() + ')');
        }
        ((ByteBuf) ObjectUtil.checkNotNull(byteBuf, "dst")).setBytes(i2, asciiString.array(), i + asciiString.arrayOffset(), i3);
    }

    public static void copy(AsciiString asciiString, int i, ByteBuf byteBuf, int i2) {
        if (MathUtil.isOutOfBounds(i, i2, asciiString.length())) {
            throw new IndexOutOfBoundsException("expected: 0 <= srcIdx(" + i + ") <= srcIdx + length(" + i2 + ") <= srcLen(" + asciiString.length() + ')');
        }
        ((ByteBuf) ObjectUtil.checkNotNull(byteBuf, "dst")).writeBytes(asciiString.array(), i + asciiString.arrayOffset(), i2);
    }

    public static String prettyHexDump(ByteBuf byteBuf) {
        return prettyHexDump(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public static String prettyHexDump(ByteBuf byteBuf, int i, int i2) {
        return HexUtil.prettyHexDump(byteBuf, i, i2);
    }

    public static void appendPrettyHexDump(StringBuilder sb, ByteBuf byteBuf) {
        appendPrettyHexDump(sb, byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public static void appendPrettyHexDump(StringBuilder sb, ByteBuf byteBuf, int i, int i2) {
        HexUtil.appendPrettyHexDump(sb, byteBuf, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class HexUtil {
        private static final char[] BYTE2CHAR = new char[256];
        private static final char[] HEXDUMP_TABLE = new char[1024];
        private static final String[] HEXPADDING = new String[16];
        private static final String[] HEXDUMP_ROWPREFIXES = new String[4096];
        private static final String[] BYTE2HEX = new String[256];
        private static final String[] BYTEPADDING = new String[16];

        private HexUtil() {
        }

        static {
            char[] charArray = "0123456789abcdef".toCharArray();
            int i = 0;
            for (int i2 = 0; i2 < 256; i2++) {
                char[] cArr = HEXDUMP_TABLE;
                int i3 = i2 << 1;
                cArr[i3] = charArray[(i2 >>> 4) & 15];
                cArr[i3 + 1] = charArray[i2 & 15];
            }
            int i4 = 0;
            while (true) {
                String[] strArr = HEXPADDING;
                if (i4 >= strArr.length) {
                    break;
                }
                int length = strArr.length - i4;
                StringBuilder sb = new StringBuilder(length * 3);
                for (int i5 = 0; i5 < length; i5++) {
                    sb.append("   ");
                }
                HEXPADDING[i4] = sb.toString();
                i4++;
            }
            int i6 = 0;
            while (true) {
                String[] strArr2 = HEXDUMP_ROWPREFIXES;
                if (i6 >= strArr2.length) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(StringUtil.NEWLINE);
                sb2.append(Long.toHexString(((i6 << 4) & 4294967295L) | 4294967296L));
                sb2.setCharAt(sb2.length() - 9, '|');
                sb2.append('|');
                strArr2[i6] = sb2.toString();
                i6++;
            }
            int i7 = 0;
            while (true) {
                String[] strArr3 = BYTE2HEX;
                if (i7 >= strArr3.length) {
                    break;
                }
                strArr3[i7] = " " + StringUtil.byteToHexStringPadded(i7);
                i7++;
            }
            int i8 = 0;
            while (true) {
                String[] strArr4 = BYTEPADDING;
                if (i8 >= strArr4.length) {
                    break;
                }
                int length2 = strArr4.length - i8;
                StringBuilder sb3 = new StringBuilder(length2);
                for (int i9 = 0; i9 < length2; i9++) {
                    sb3.append(' ');
                }
                BYTEPADDING[i8] = sb3.toString();
                i8++;
            }
            while (true) {
                char[] cArr2 = BYTE2CHAR;
                if (i >= cArr2.length) {
                    return;
                }
                if (i <= 31 || i >= 127) {
                    cArr2[i] = ClassUtils.PACKAGE_SEPARATOR_CHAR;
                } else {
                    cArr2[i] = (char) i;
                }
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String hexDump(ByteBuf byteBuf, int i, int i2) {
            ObjectUtil.checkPositiveOrZero(i2, SessionDescription.ATTR_LENGTH);
            if (i2 == 0) {
                return "";
            }
            int i3 = i + i2;
            char[] cArr = new char[i2 << 1];
            int i4 = 0;
            while (i < i3) {
                System.arraycopy(HEXDUMP_TABLE, byteBuf.getUnsignedByte(i) << 1, cArr, i4, 2);
                i++;
                i4 += 2;
            }
            return new String(cArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String hexDump(byte[] bArr, int i, int i2) {
            ObjectUtil.checkPositiveOrZero(i2, SessionDescription.ATTR_LENGTH);
            if (i2 == 0) {
                return "";
            }
            int i3 = i + i2;
            char[] cArr = new char[i2 << 1];
            int i4 = 0;
            while (i < i3) {
                System.arraycopy(HEXDUMP_TABLE, (bArr[i] & 255) << 1, cArr, i4, 2);
                i++;
                i4 += 2;
            }
            return new String(cArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String prettyHexDump(ByteBuf byteBuf, int i, int i2) {
            if (i2 == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder(((i2 / 16) + ((i2 & 15) == 0 ? 0 : 1) + 4) * 80);
            appendPrettyHexDump(sb, byteBuf, i, i2);
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void appendPrettyHexDump(StringBuilder sb, ByteBuf byteBuf, int i, int i2) {
            if (MathUtil.isOutOfBounds(i, i2, byteBuf.capacity())) {
                throw new IndexOutOfBoundsException("expected: 0 <= offset(" + i + ") <= offset + length(" + i2 + ") <= buf.capacity(" + byteBuf.capacity() + ')');
            } else if (i2 != 0) {
                sb.append("         +-------------------------------------------------+" + StringUtil.NEWLINE + "         |  0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f |" + StringUtil.NEWLINE + "+--------+-------------------------------------------------+----------------+");
                int i3 = i2 >>> 4;
                int i4 = i2 & 15;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i5 << 4) + i;
                    appendHexDumpRowPrefix(sb, i5, i6);
                    int i7 = i6 + 16;
                    for (int i8 = i6; i8 < i7; i8++) {
                        sb.append(BYTE2HEX[byteBuf.getUnsignedByte(i8)]);
                    }
                    sb.append(" |");
                    while (i6 < i7) {
                        sb.append(BYTE2CHAR[byteBuf.getUnsignedByte(i6)]);
                        i6++;
                    }
                    sb.append('|');
                }
                if (i4 != 0) {
                    int i9 = (i3 << 4) + i;
                    appendHexDumpRowPrefix(sb, i3, i9);
                    int i10 = i9 + i4;
                    for (int i11 = i9; i11 < i10; i11++) {
                        sb.append(BYTE2HEX[byteBuf.getUnsignedByte(i11)]);
                    }
                    sb.append(HEXPADDING[i4]);
                    sb.append(" |");
                    while (i9 < i10) {
                        sb.append(BYTE2CHAR[byteBuf.getUnsignedByte(i9)]);
                        i9++;
                    }
                    sb.append(BYTEPADDING[i4]);
                    sb.append('|');
                }
                sb.append(StringUtil.NEWLINE + "+--------+-------------------------------------------------+----------------+");
            }
        }

        private static void appendHexDumpRowPrefix(StringBuilder sb, int i, int i2) {
            String[] strArr = HEXDUMP_ROWPREFIXES;
            if (i < strArr.length) {
                sb.append(strArr[i]);
                return;
            }
            sb.append(StringUtil.NEWLINE);
            sb.append(Long.toHexString((i2 & 4294967295L) | 4294967296L));
            sb.setCharAt(sb.length() - 9, '|');
            sb.append('|');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ThreadLocalUnsafeDirectByteBuf extends UnpooledUnsafeDirectByteBuf {
        private static final ObjectPool<ThreadLocalUnsafeDirectByteBuf> RECYCLER = ObjectPool.newPool(new ObjectPool.ObjectCreator<ThreadLocalUnsafeDirectByteBuf>() { // from class: io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.grpc.netty.shaded.io.netty.util.internal.ObjectPool.ObjectCreator
            public ThreadLocalUnsafeDirectByteBuf newObject(ObjectPool.Handle<ThreadLocalUnsafeDirectByteBuf> handle) {
                return new ThreadLocalUnsafeDirectByteBuf(handle);
            }
        });
        private final ObjectPool.Handle<ThreadLocalUnsafeDirectByteBuf> handle;

        static ThreadLocalUnsafeDirectByteBuf newInstance() {
            ThreadLocalUnsafeDirectByteBuf threadLocalUnsafeDirectByteBuf = RECYCLER.get();
            threadLocalUnsafeDirectByteBuf.resetRefCnt();
            return threadLocalUnsafeDirectByteBuf;
        }

        private ThreadLocalUnsafeDirectByteBuf(ObjectPool.Handle<ThreadLocalUnsafeDirectByteBuf> handle) {
            super(UnpooledByteBufAllocator.DEFAULT, 256, Integer.MAX_VALUE);
            this.handle = handle;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf, io.grpc.netty.shaded.io.netty.buffer.AbstractReferenceCountedByteBuf
        protected void deallocate() {
            if (capacity() > ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE) {
                super.deallocate();
                return;
            }
            clear();
            this.handle.recycle(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ThreadLocalDirectByteBuf extends UnpooledDirectByteBuf {
        private static final ObjectPool<ThreadLocalDirectByteBuf> RECYCLER = ObjectPool.newPool(new ObjectPool.ObjectCreator<ThreadLocalDirectByteBuf>() { // from class: io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.grpc.netty.shaded.io.netty.util.internal.ObjectPool.ObjectCreator
            public ThreadLocalDirectByteBuf newObject(ObjectPool.Handle<ThreadLocalDirectByteBuf> handle) {
                return new ThreadLocalDirectByteBuf(handle);
            }
        });
        private final ObjectPool.Handle<ThreadLocalDirectByteBuf> handle;

        static ThreadLocalDirectByteBuf newInstance() {
            ThreadLocalDirectByteBuf threadLocalDirectByteBuf = RECYCLER.get();
            threadLocalDirectByteBuf.resetRefCnt();
            return threadLocalDirectByteBuf;
        }

        private ThreadLocalDirectByteBuf(ObjectPool.Handle<ThreadLocalDirectByteBuf> handle) {
            super(UnpooledByteBufAllocator.DEFAULT, 256, Integer.MAX_VALUE);
            this.handle = handle;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf, io.grpc.netty.shaded.io.netty.buffer.AbstractReferenceCountedByteBuf
        protected void deallocate() {
            if (capacity() > ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE) {
                super.deallocate();
                return;
            }
            clear();
            this.handle.recycle(this);
        }
    }

    public static boolean isText(ByteBuf byteBuf, Charset charset) {
        return isText(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes(), charset);
    }

    public static boolean isText(ByteBuf byteBuf, int i, int i2, Charset charset) {
        ObjectUtil.checkNotNull(byteBuf, "buf");
        ObjectUtil.checkNotNull(charset, "charset");
        int readerIndex = byteBuf.readerIndex() + byteBuf.readableBytes();
        if (i < 0 || i2 < 0 || i > readerIndex - i2) {
            throw new IndexOutOfBoundsException("index: " + i + " length: " + i2);
        } else if (charset.equals(CharsetUtil.UTF_8)) {
            return isUtf8(byteBuf, i, i2);
        } else {
            if (charset.equals(CharsetUtil.US_ASCII)) {
                return isAscii(byteBuf, i, i2);
            }
            CharsetDecoder decoder = CharsetUtil.decoder(charset, CodingErrorAction.REPORT, CodingErrorAction.REPORT);
            try {
                if (byteBuf.nioBufferCount() == 1) {
                    decoder.decode(byteBuf.nioBuffer(i, i2));
                } else {
                    ByteBuf heapBuffer = byteBuf.alloc().heapBuffer(i2);
                    heapBuffer.writeBytes(byteBuf, i, i2);
                    decoder.decode(heapBuffer.internalNioBuffer(heapBuffer.readerIndex(), i2));
                    heapBuffer.release();
                }
                return true;
            } catch (CharacterCodingException unused) {
                return false;
            }
        }
    }

    private static boolean isAscii(ByteBuf byteBuf, int i, int i2) {
        return byteBuf.forEachByte(i, i2, FIND_NON_ASCII) == -1;
    }

    private static boolean isUtf8(ByteBuf byteBuf, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        while (i < i4) {
            int i5 = i + 1;
            byte b = byteBuf.getByte(i);
            if ((b & 128) == 0) {
                i = i5;
            } else if ((b & 224) == 192) {
                if (i5 >= i4) {
                    return false;
                }
                int i6 = i5 + 1;
                if ((byteBuf.getByte(i5) & 192) != 128 || (b & 255) < 194) {
                    return false;
                }
                i = i6;
            } else if ((b & 240) != 224) {
                if ((b & 248) != 240 || i5 > i4 - 3) {
                    return false;
                }
                int i7 = i5 + 1;
                byte b2 = byteBuf.getByte(i5);
                int i8 = i7 + 1;
                byte b3 = byteBuf.getByte(i7);
                int i9 = i8 + 1;
                byte b4 = byteBuf.getByte(i8);
                if ((b2 & 192) == 128 && (b3 & 192) == 128 && (b4 & 192) == 128 && (i3 = b & 255) <= 244 && ((i3 != 240 || (b2 & 255) >= 144) && (i3 != 244 || (b2 & 255) <= 143))) {
                    i = i9;
                }
                return false;
            } else if (i5 > i4 - 2) {
                return false;
            } else {
                int i10 = i5 + 1;
                byte b5 = byteBuf.getByte(i5);
                int i11 = i10 + 1;
                byte b6 = byteBuf.getByte(i10);
                if ((b5 & 192) != 128 || (b6 & 192) != 128) {
                    return false;
                }
                int i12 = b & Ascii.SI;
                if (i12 == 0 && (b5 & 255) < 160) {
                    return false;
                }
                if (i12 == 13 && (b5 & 255) > 159) {
                    return false;
                }
                i = i11;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void readBytes(ByteBufAllocator byteBufAllocator, ByteBuffer byteBuffer, int i, int i2, OutputStream outputStream) throws IOException {
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), i + byteBuffer.arrayOffset(), i2);
            return;
        }
        int min = Math.min(i2, 8192);
        byteBuffer.clear().position(i);
        if (i2 <= 1024 || !byteBufAllocator.isDirectBufferPooled()) {
            getBytes(byteBuffer, threadLocalTempArray(min), 0, min, outputStream, i2);
            return;
        }
        ByteBuf heapBuffer = byteBufAllocator.heapBuffer(min);
        try {
            getBytes(byteBuffer, heapBuffer.array(), heapBuffer.arrayOffset(), min, outputStream, i2);
        } finally {
            heapBuffer.release();
        }
    }

    private static void getBytes(ByteBuffer byteBuffer, byte[] bArr, int i, int i2, OutputStream outputStream, int i3) throws IOException {
        do {
            int min = Math.min(i2, i3);
            byteBuffer.get(bArr, i, min);
            outputStream.write(bArr, i, min);
            i3 -= min;
        } while (i3 > 0);
    }

    private ByteBufUtil() {
    }
}
