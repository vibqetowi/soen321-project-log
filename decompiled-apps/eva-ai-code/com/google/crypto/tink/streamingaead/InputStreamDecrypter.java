package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
final class InputStreamDecrypter extends InputStream {
    byte[] associatedData;
    InputStream ciphertextStream;
    PrimitiveSet<StreamingAead> primitives;
    boolean attemptedMatching = false;
    InputStream matchingStream = null;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public InputStreamDecrypter(PrimitiveSet<StreamingAead> primitives, InputStream ciphertextStream, final byte[] associatedData) {
        this.primitives = primitives;
        if (ciphertextStream.markSupported()) {
            this.ciphertextStream = ciphertextStream;
        } else {
            this.ciphertextStream = new BufferedInputStream(ciphertextStream);
        }
        this.ciphertextStream.mark(Integer.MAX_VALUE);
        this.associatedData = (byte[]) associatedData.clone();
    }

    private void rewind() throws IOException {
        this.ciphertextStream.reset();
    }

    private void disableRewinding() throws IOException {
        this.ciphertextStream.mark(0);
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream = this.matchingStream;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) == 1) {
            return bArr[0];
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] b, int offset, int len) throws IOException {
        if (len == 0) {
            return 0;
        }
        InputStream inputStream = this.matchingStream;
        if (inputStream != null) {
            return inputStream.read(b, offset, len);
        } else if (this.attemptedMatching) {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        } else {
            this.attemptedMatching = true;
            for (PrimitiveSet.Entry<StreamingAead> entry : this.primitives.getRawPrimitives()) {
                try {
                    InputStream newDecryptingStream = entry.getPrimitive().newDecryptingStream(this.ciphertextStream, this.associatedData);
                    int read = newDecryptingStream.read(b, offset, len);
                    if (read == 0) {
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    }
                    this.matchingStream = newDecryptingStream;
                    disableRewinding();
                    return read;
                } catch (IOException unused) {
                    rewind();
                } catch (GeneralSecurityException unused2) {
                    rewind();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.ciphertextStream.close();
    }
}
