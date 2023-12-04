package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Deque;
/* loaded from: classes7.dex */
final class SeekableByteChannelDecrypter implements SeekableByteChannel {
    byte[] associatedData;
    long cachedPosition;
    SeekableByteChannel ciphertextChannel;
    long startingPosition;
    SeekableByteChannel attemptingChannel = null;
    SeekableByteChannel matchingChannel = null;
    Deque<StreamingAead> remainingPrimitives = new ArrayDeque();

    public SeekableByteChannelDecrypter(PrimitiveSet<StreamingAead> primitives, SeekableByteChannel ciphertextChannel, final byte[] associatedData) throws IOException {
        long position;
        for (PrimitiveSet.Entry<StreamingAead> entry : primitives.getRawPrimitives()) {
            this.remainingPrimitives.add(entry.getPrimitive());
        }
        this.ciphertextChannel = ciphertextChannel;
        this.cachedPosition = -1L;
        position = ciphertextChannel.position();
        this.startingPosition = position;
        this.associatedData = (byte[]) associatedData.clone();
    }

    private synchronized SeekableByteChannel nextAttemptingChannel() throws IOException {
        SeekableByteChannel newSeekableDecryptingChannel;
        while (!this.remainingPrimitives.isEmpty()) {
            this.ciphertextChannel.position(this.startingPosition);
            try {
                newSeekableDecryptingChannel = this.remainingPrimitives.removeFirst().newSeekableDecryptingChannel(this.ciphertextChannel, this.associatedData);
                long j = this.cachedPosition;
                if (j >= 0) {
                    newSeekableDecryptingChannel.position(j);
                }
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
        return newSeekableDecryptingChannel;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer dst) throws IOException {
        int read;
        int read2;
        if (dst.remaining() == 0) {
            return 0;
        }
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            read2 = seekableByteChannel.read(dst);
            return read2;
        }
        if (this.attemptingChannel == null) {
            this.attemptingChannel = nextAttemptingChannel();
        }
        while (true) {
            try {
                read = this.attemptingChannel.read(dst);
                if (read == 0) {
                    return 0;
                }
                this.matchingChannel = this.attemptingChannel;
                this.attemptingChannel = null;
                return read;
            } catch (IOException unused) {
                this.attemptingChannel = nextAttemptingChannel();
            }
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized SeekableByteChannel position(long newPosition) throws IOException {
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            seekableByteChannel.position(newPosition);
        } else if (newPosition < 0) {
            throw new IllegalArgumentException("Position must be non-negative");
        } else {
            this.cachedPosition = newPosition;
            SeekableByteChannel seekableByteChannel2 = this.attemptingChannel;
            if (seekableByteChannel2 != null) {
                seekableByteChannel2.position(newPosition);
            }
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() throws IOException {
        long position;
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            position = seekableByteChannel.position();
            return position;
        }
        return this.cachedPosition;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long size() throws IOException {
        long size;
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            size = seekableByteChannel.size();
        } else {
            throw new IOException("Cannot determine size before first read()-call.");
        }
        return size;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long size) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer src) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.ciphertextChannel.close();
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        boolean isOpen;
        isOpen = this.ciphertextChannel.isOpen();
        return isOpen;
    }
}
