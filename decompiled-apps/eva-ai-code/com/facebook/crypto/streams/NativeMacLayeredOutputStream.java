package com.facebook.crypto.streams;

import com.facebook.crypto.mac.NativeMac;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public class NativeMacLayeredOutputStream extends OutputStream {
    private final NativeMac mMac;
    private boolean mMacAppended = false;
    private final OutputStream mOutputDelegate;

    public NativeMacLayeredOutputStream(NativeMac nativeMac, OutputStream outputStream) {
        this.mMac = nativeMac;
        this.mOutputDelegate = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            appendMac();
        } finally {
            this.mOutputDelegate.close();
        }
    }

    private void appendMac() throws IOException {
        if (this.mMacAppended) {
            return;
        }
        this.mMacAppended = true;
        try {
            this.mOutputDelegate.write(this.mMac.doFinal());
        } finally {
            this.mMac.destroy();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.mOutputDelegate.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.mMac.update(bArr, i, i2);
        this.mOutputDelegate.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.mMac.update((byte) i);
        this.mOutputDelegate.write(i);
    }
}
