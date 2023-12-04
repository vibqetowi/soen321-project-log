package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.RewindableReadableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Deque;
/* loaded from: classes7.dex */
final class ReadableByteChannelDecrypter implements ReadableByteChannel {
    byte[] associatedData;
    RewindableReadableByteChannel ciphertextChannel;
    ReadableByteChannel attemptingChannel = null;
    ReadableByteChannel matchingChannel = null;
    Deque<StreamingAead> remainingPrimitives = new ArrayDeque();

    public ReadableByteChannelDecrypter(PrimitiveSet<StreamingAead> primitives, ReadableByteChannel ciphertextChannel, final byte[] associatedData) {
        for (PrimitiveSet.Entry<StreamingAead> entry : primitives.getRawPrimitives()) {
            this.remainingPrimitives.add(entry.getPrimitive());
        }
        this.ciphertextChannel = new RewindableReadableByteChannel(ciphertextChannel);
        this.associatedData = (byte[]) associatedData.clone();
    }

    private synchronized ReadableByteChannel nextAttemptingChannel() throws IOException {
        while (!this.remainingPrimitives.isEmpty()) {
            try {
            } catch (GeneralSecurityException unused) {
                this.ciphertextChannel.rewind();
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
        return this.remainingPrimitives.removeFirst().newDecryptingChannel(this.ciphertextChannel, this.associatedData);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer dst) throws IOException {
        if (dst.remaining() == 0) {
            return 0;
        }
        ReadableByteChannel readableByteChannel = this.matchingChannel;
        if (readableByteChannel != null) {
            return readableByteChannel.read(dst);
        }
        if (this.attemptingChannel == null) {
            this.attemptingChannel = nextAttemptingChannel();
        }
        while (true) {
            try {
                int read = this.attemptingChannel.read(dst);
                if (read == 0) {
                    return 0;
                }
                this.matchingChannel = this.attemptingChannel;
                this.attemptingChannel = null;
                this.ciphertextChannel.disableRewinding();
                return read;
            } catch (IOException unused) {
                this.ciphertextChannel.rewind();
                this.attemptingChannel = nextAttemptingChannel();
            }
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.ciphertextChannel.close();
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        return this.ciphertextChannel.isOpen();
    }
}
