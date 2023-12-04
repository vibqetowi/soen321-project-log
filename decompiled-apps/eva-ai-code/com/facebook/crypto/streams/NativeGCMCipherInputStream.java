package com.facebook.crypto.streams;

import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public class NativeGCMCipherInputStream extends InputStream {
    private static final int SKIP_BUFFER_SIZE = 256;
    private final NativeGCMCipher mCipher;
    private final TailInputStream mCipherDelegate;
    private byte[] mSkipBuffer;
    private boolean mTagChecked = false;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public NativeGCMCipherInputStream(InputStream inputStream, NativeGCMCipher nativeGCMCipher, int i) {
        this.mCipherDelegate = new TailInputStream(inputStream, i);
        this.mCipher = nativeGCMCipher;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mCipherDelegate.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ensureTagValid();
        } finally {
            this.mCipherDelegate.close();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        if (bArr.length < i3) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
        int read = this.mCipherDelegate.read(bArr, i, i2);
        if (read == -1) {
            ensureTagValid();
            return -1;
        }
        return this.mCipher.update(bArr, i, read, bArr, i);
    }

    private void ensureTagValid() throws IOException {
        if (this.mTagChecked) {
            return;
        }
        this.mTagChecked = true;
        try {
            byte[] tail = this.mCipherDelegate.getTail();
            this.mCipher.decryptFinal(tail, tail.length);
        } finally {
            this.mCipher.destroy();
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (this.mSkipBuffer == null) {
            this.mSkipBuffer = new byte[256];
        }
        long j2 = 0;
        while (j > 0) {
            int read = read(this.mSkipBuffer, 0, (int) Math.min(j, 256L));
            if (read < 0) {
                break;
            }
            long j3 = read;
            j2 += j3;
            j -= j3;
        }
        if (j2 == 0) {
            return -1L;
        }
        return j2;
    }
}
