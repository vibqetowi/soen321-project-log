package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes7.dex */
public final class RewindableReadableByteChannel implements ReadableByteChannel {
    final ReadableByteChannel baseChannel;
    ByteBuffer buffer = null;
    boolean canRewind = true;
    boolean directRead = false;

    public RewindableReadableByteChannel(ReadableByteChannel baseChannel) {
        this.baseChannel = baseChannel;
    }

    public synchronized void disableRewinding() {
        this.canRewind = false;
    }

    public synchronized void rewind() throws IOException {
        if (!this.canRewind) {
            throw new IOException("Cannot rewind anymore.");
        }
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
    }

    private synchronized void setBufferLimit(int newLimit) {
        if (this.buffer.capacity() < newLimit) {
            int position = this.buffer.position();
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.buffer.capacity() * 2, newLimit));
            this.buffer.rewind();
            allocate.put(this.buffer);
            allocate.position(position);
            this.buffer = allocate;
        }
        this.buffer.limit(newLimit);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer dst) throws IOException {
        if (this.directRead) {
            return this.baseChannel.read(dst);
        }
        int remaining = dst.remaining();
        if (remaining == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer == null) {
            if (!this.canRewind) {
                this.directRead = true;
                return this.baseChannel.read(dst);
            }
            ByteBuffer allocate = ByteBuffer.allocate(remaining);
            this.buffer = allocate;
            int read = this.baseChannel.read(allocate);
            this.buffer.flip();
            if (read > 0) {
                dst.put(this.buffer);
            }
            return read;
        } else if (byteBuffer.remaining() >= remaining) {
            int limit = this.buffer.limit();
            ByteBuffer byteBuffer2 = this.buffer;
            byteBuffer2.limit(byteBuffer2.position() + remaining);
            dst.put(this.buffer);
            this.buffer.limit(limit);
            if (!this.canRewind && !this.buffer.hasRemaining()) {
                this.buffer = null;
                this.directRead = true;
            }
            return remaining;
        } else {
            int remaining2 = this.buffer.remaining();
            int position = this.buffer.position();
            int limit2 = this.buffer.limit();
            setBufferLimit((remaining - remaining2) + limit2);
            this.buffer.position(limit2);
            int read2 = this.baseChannel.read(this.buffer);
            this.buffer.flip();
            this.buffer.position(position);
            dst.put(this.buffer);
            if (remaining2 != 0 || read2 >= 0) {
                int position2 = this.buffer.position() - position;
                if (!this.canRewind && !this.buffer.hasRemaining()) {
                    this.buffer = null;
                    this.directRead = true;
                }
                return position2;
            }
            return -1;
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.canRewind = false;
        this.directRead = true;
        this.baseChannel.close();
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        return this.baseChannel.isOpen();
    }
}
