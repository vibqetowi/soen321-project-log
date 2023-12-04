package com.facebook.crypto.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
/* loaded from: classes2.dex */
public class BetterCipherInputStream extends FilterInputStream {
    private static final int UPDATE_BUFFER_SIZE = 256;
    private final Cipher mCipher;
    private final byte[] mUpdateBuffer;

    public BetterCipherInputStream(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.mCipher = cipher;
        this.mUpdateBuffer = new byte[256];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        int i3 = read / 256;
        int i4 = read % 256;
        int i5 = i;
        int i6 = i5;
        for (int i7 = 0; i7 < i3; i7++) {
            try {
                int update = this.mCipher.update(bArr, i5, 256, this.mUpdateBuffer);
                System.arraycopy(this.mUpdateBuffer, 0, bArr, i6, update);
                i6 += update;
                i5 += 256;
            } catch (ShortBufferException unused) {
            }
        }
        if (i4 > 0) {
            int update2 = this.mCipher.update(bArr, i5, i4, this.mUpdateBuffer);
            System.arraycopy(this.mUpdateBuffer, 0, bArr, i6, update2);
            i6 += update2;
        }
        return i6 - i;
    }
}
