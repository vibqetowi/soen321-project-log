package com.google.crypto.tink.shaded.protobuf;

import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes7.dex */
final class ByteBufferWriter {
    private static final ThreadLocal<SoftReference<byte[]>> BUFFER = new ThreadLocal<>();
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET;
    private static final Class<?> FILE_OUTPUT_STREAM_CLASS;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    private static boolean needToReallocate(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    private ByteBufferWriter() {
    }

    static {
        Class<?> safeGetClass = safeGetClass("java.io.FileOutputStream");
        FILE_OUTPUT_STREAM_CLASS = safeGetClass;
        CHANNEL_FIELD_OFFSET = getChannelFieldOffset(safeGetClass);
    }

    static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void write(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!writeToChannel(byteBuffer, outputStream)) {
                byte[] orCreateBuffer = getOrCreateBuffer(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), orCreateBuffer.length);
                    byteBuffer.get(orCreateBuffer, 0, min);
                    outputStream.write(orCreateBuffer, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    private static byte[] getOrCreateBuffer(int i) {
        int max = Math.max(i, 1024);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(max, buffer.length)) {
            buffer = new byte[max];
            if (max <= 16384) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    private static byte[] getBuffer() {
        SoftReference<byte[]> softReference = BUFFER.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static void setBuffer(byte[] bArr) {
        BUFFER.set(new SoftReference<>(bArr));
    }

    private static boolean writeToChannel(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = CHANNEL_FIELD_OFFSET;
        if (j < 0 || !FILE_OUTPUT_STREAM_CLASS.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) UnsafeUtil.getObject(outputStream, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel != null) {
            writableByteChannel.write(byteBuffer);
            return true;
        }
        return false;
    }

    private static Class<?> safeGetClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static long getChannelFieldOffset(Class<?> cls) {
        if (cls != null) {
            try {
                if (UnsafeUtil.hasUnsafeArrayOperations()) {
                    return UnsafeUtil.objectFieldOffset(cls.getDeclaredField(AppsFlyerProperties.CHANNEL));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }
}
