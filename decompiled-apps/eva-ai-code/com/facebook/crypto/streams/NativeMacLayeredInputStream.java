package com.facebook.crypto.streams;

import com.facebook.crypto.mac.NativeMac;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public class NativeMacLayeredInputStream extends InputStream {
    private static final String MAC_DOES_NOT_MATCH = "Mac does not match";
    private final TailInputStream mInputDelegate;
    private final NativeMac mMac;
    private boolean mMacChecked = false;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public NativeMacLayeredInputStream(NativeMac nativeMac, InputStream inputStream) {
        this.mMac = nativeMac;
        this.mInputDelegate = new TailInputStream(inputStream, nativeMac.getMacLength());
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mInputDelegate.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ensureMacValid();
        } finally {
            this.mInputDelegate.close();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        while (read == 0) {
            read = read(bArr, 0, 1);
        }
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.mInputDelegate.read(bArr, i, i2);
        if (read == -1) {
            ensureMacValid();
            return -1;
        }
        if (read > 0) {
            this.mMac.update(bArr, i, read);
        }
        return read;
    }

    private void ensureMacValid() throws IOException {
        if (this.mMacChecked) {
            return;
        }
        this.mMacChecked = true;
        try {
            if (constantTimeEquals(this.mInputDelegate.getTail(), this.mMac.doFinal())) {
                return;
            }
            throw new IOException(MAC_DOES_NOT_MATCH);
        } finally {
            this.mMac.destroy();
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        throw new UnsupportedOperationException();
    }

    private boolean constantTimeEquals(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }
}
