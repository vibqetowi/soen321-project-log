package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes4.dex */
public class CompositeReadableBuffer extends AbstractReadableBuffer {
    private final Queue<ReadableBuffer> buffers;
    private int readableBytes;
    private static final NoThrowReadOperation<Void> UBYTE_OP = new NoThrowReadOperation<Void>() { // from class: io.grpc.internal.CompositeReadableBuffer.1
        @Override // io.grpc.internal.CompositeReadableBuffer.NoThrowReadOperation, io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public int read(ReadableBuffer readableBuffer, int i, Void r3, int i2) {
            return readableBuffer.readUnsignedByte();
        }
    };
    private static final NoThrowReadOperation<Void> SKIP_OP = new NoThrowReadOperation<Void>() { // from class: io.grpc.internal.CompositeReadableBuffer.2
        @Override // io.grpc.internal.CompositeReadableBuffer.NoThrowReadOperation, io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public int read(ReadableBuffer readableBuffer, int i, Void r3, int i2) {
            readableBuffer.skipBytes(i);
            return 0;
        }
    };
    private static final NoThrowReadOperation<byte[]> BYTE_ARRAY_OP = new NoThrowReadOperation<byte[]>() { // from class: io.grpc.internal.CompositeReadableBuffer.3
        @Override // io.grpc.internal.CompositeReadableBuffer.NoThrowReadOperation, io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public int read(ReadableBuffer readableBuffer, int i, byte[] bArr, int i2) {
            readableBuffer.readBytes(bArr, i2, i);
            return i2 + i;
        }
    };
    private static final NoThrowReadOperation<ByteBuffer> BYTE_BUF_OP = new NoThrowReadOperation<ByteBuffer>() { // from class: io.grpc.internal.CompositeReadableBuffer.4
        @Override // io.grpc.internal.CompositeReadableBuffer.NoThrowReadOperation, io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public int read(ReadableBuffer readableBuffer, int i, ByteBuffer byteBuffer, int i2) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            readableBuffer.readBytes(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    };
    private static final ReadOperation<OutputStream> STREAM_OP = new ReadOperation<OutputStream>() { // from class: io.grpc.internal.CompositeReadableBuffer.5
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public int read(ReadableBuffer readableBuffer, int i, OutputStream outputStream, int i2) throws IOException {
            readableBuffer.readBytes(outputStream, i);
            return 0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface NoThrowReadOperation<T> extends ReadOperation<T> {
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        int read(ReadableBuffer readableBuffer, int i, T t, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface ReadOperation<T> {
        int read(ReadableBuffer readableBuffer, int i, T t, int i2) throws IOException;
    }

    public CompositeReadableBuffer(int i) {
        this.buffers = new ArrayDeque(i);
    }

    public CompositeReadableBuffer() {
        this.buffers = new ArrayDeque();
    }

    public void addBuffer(ReadableBuffer readableBuffer) {
        if (!(readableBuffer instanceof CompositeReadableBuffer)) {
            this.buffers.add(readableBuffer);
            this.readableBytes += readableBuffer.readableBytes();
            return;
        }
        CompositeReadableBuffer compositeReadableBuffer = (CompositeReadableBuffer) readableBuffer;
        while (!compositeReadableBuffer.buffers.isEmpty()) {
            this.buffers.add(compositeReadableBuffer.buffers.remove());
        }
        this.readableBytes += compositeReadableBuffer.readableBytes;
        compositeReadableBuffer.readableBytes = 0;
        compositeReadableBuffer.close();
    }

    @Override // io.grpc.internal.ReadableBuffer
    public int readableBytes() {
        return this.readableBytes;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public int readUnsignedByte() {
        return executeNoThrow(UBYTE_OP, 1, null, 0);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void skipBytes(int i) {
        executeNoThrow(SKIP_OP, i, null, 0);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void readBytes(byte[] bArr, int i, int i2) {
        executeNoThrow(BYTE_ARRAY_OP, i2, bArr, i);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void readBytes(ByteBuffer byteBuffer) {
        executeNoThrow(BYTE_BUF_OP, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void readBytes(OutputStream outputStream, int i) throws IOException {
        execute(STREAM_OP, i, outputStream, 0);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public ReadableBuffer readBytes(int i) {
        int i2;
        ReadableBuffer poll;
        if (i <= 0) {
            return ReadableBuffers.empty();
        }
        checkReadable(i);
        this.readableBytes -= i;
        CompositeReadableBuffer compositeReadableBuffer = null;
        CompositeReadableBuffer compositeReadableBuffer2 = null;
        while (true) {
            ReadableBuffer peek = this.buffers.peek();
            int readableBytes = peek.readableBytes();
            if (readableBytes > i) {
                poll = peek.readBytes(i);
                i2 = 0;
            } else {
                i2 = i - readableBytes;
                poll = this.buffers.poll();
            }
            if (compositeReadableBuffer == null) {
                compositeReadableBuffer = poll;
            } else {
                if (compositeReadableBuffer2 == null) {
                    compositeReadableBuffer2 = new CompositeReadableBuffer(i2 != 0 ? Math.min(this.buffers.size() + 2, 16) : 2);
                    compositeReadableBuffer2.addBuffer(compositeReadableBuffer);
                    compositeReadableBuffer = compositeReadableBuffer2;
                }
                compositeReadableBuffer2.addBuffer(poll);
            }
            if (i2 <= 0) {
                return compositeReadableBuffer;
            }
            i = i2;
        }
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.buffers.isEmpty()) {
            this.buffers.remove().close();
        }
    }

    private <T> int execute(ReadOperation<T> readOperation, int i, T t, int i2) throws IOException {
        checkReadable(i);
        if (!this.buffers.isEmpty()) {
            advanceBufferIfNecessary();
        }
        while (i > 0 && !this.buffers.isEmpty()) {
            ReadableBuffer peek = this.buffers.peek();
            int min = Math.min(i, peek.readableBytes());
            i2 = readOperation.read(peek, min, t, i2);
            i -= min;
            this.readableBytes -= min;
            advanceBufferIfNecessary();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private <T> int executeNoThrow(NoThrowReadOperation<T> noThrowReadOperation, int i, T t, int i2) {
        try {
            return execute(noThrowReadOperation, i, t, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private void advanceBufferIfNecessary() {
        if (this.buffers.peek().readableBytes() == 0) {
            this.buffers.remove().close();
        }
    }
}
