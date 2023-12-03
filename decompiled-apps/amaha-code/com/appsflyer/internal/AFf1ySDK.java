package com.appsflyer.internal;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class AFf1ySDK extends FilterInputStream {
    private final int[] AFLogger;
    private int AFVersionDeclaration;
    private final int afDebugLog;
    private final byte[] afErrorLog;
    private final int[] afInfoLog;
    private final byte[][] afRDLog;
    private int afWarnLog;
    private int getLevel;
    private final byte[] init;
    private static final byte[] values = AFf1wSDK.values;
    private static final int[] AFInAppEventType = AFf1wSDK.AFInAppEventParameterName;
    private static final int[] AFInAppEventParameterName = AFf1wSDK.AFKeystoreWrapper;
    private static final int[] AFKeystoreWrapper = AFf1wSDK.valueOf;
    private static final int[] valueOf = AFf1wSDK.AFInAppEventType;

    public AFf1ySDK(InputStream inputStream, int i6, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.AFLogger = new int[4];
        this.afErrorLog = new byte[16];
        this.init = new byte[16];
        this.AFVersionDeclaration = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.getLevel = 16;
        this.afWarnLog = 16;
        this.afDebugLog = i6;
        this.afInfoLog = AFf1wSDK.AFInAppEventParameterName(bArr, i6);
        this.afRDLog = valueOf(bArr2);
    }

    private int AFInAppEventType() {
        if (this.AFVersionDeclaration == Integer.MAX_VALUE) {
            this.AFVersionDeclaration = ((FilterInputStream) this).in.read();
        }
        int i6 = 16;
        if (this.getLevel == 16) {
            byte[] bArr = this.afErrorLog;
            int i10 = this.AFVersionDeclaration;
            bArr[0] = (byte) i10;
            if (i10 >= 0) {
                int i11 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.afErrorLog, i11, 16 - i11);
                    if (read <= 0) {
                        break;
                    }
                    i11 += read;
                } while (i11 < 16);
                if (i11 >= 16) {
                    values(this.afErrorLog, this.init);
                    int read2 = ((FilterInputStream) this).in.read();
                    this.AFVersionDeclaration = read2;
                    this.getLevel = 0;
                    if (read2 < 0) {
                        i6 = 16 - (this.init[15] & 255);
                    }
                    this.afWarnLog = i6;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.afWarnLog;
    }

    private static byte[][] valueOf(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            bArr2[i6] = new byte[bArr[i6].length];
            int i10 = 0;
            while (true) {
                byte[] bArr3 = bArr[i6];
                if (i10 < bArr3.length) {
                    bArr2[i6][bArr3[i10]] = (byte) i10;
                    i10++;
                }
            }
        }
        return bArr2;
    }

    private void values(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.AFLogger;
        char c10 = 1;
        int i6 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.afInfoLog;
        iArr[0] = i6 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        int i10 = (bArr[13] & 255) << 16;
        iArr[3] = iArr2[3] ^ (((i10 | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i11 = 1;
        int i12 = 4;
        while (i11 < this.afDebugLog) {
            int[] iArr3 = AFInAppEventType;
            int[] iArr4 = this.AFLogger;
            byte[][] bArr3 = this.afRDLog;
            byte[] bArr4 = bArr3[0];
            int i13 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFInAppEventParameterName;
            byte[] bArr5 = bArr3[c10];
            int i14 = i13 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFKeystoreWrapper;
            byte[] bArr6 = bArr3[2];
            int i15 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i14;
            int[] iArr7 = valueOf;
            byte[] bArr7 = bArr3[3];
            int i16 = iArr7[iArr4[bArr7[0]] & 255] ^ i15;
            int[] iArr8 = this.afInfoLog;
            int i17 = i16 ^ iArr8[i12];
            int i18 = ((iArr6[(iArr4[bArr6[c10]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c10]] >>> 24] ^ iArr5[(iArr4[bArr5[c10]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c10]] & 255]) ^ iArr8[i12 + 1];
            int i19 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i12 + 2];
            iArr4[0] = i17;
            iArr4[1] = i18;
            iArr4[2] = i19;
            iArr4[3] = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i12 + 3];
            i11++;
            i12 += 4;
            c10 = 1;
        }
        int[] iArr9 = this.afInfoLog;
        int i20 = iArr9[i12];
        byte[] bArr8 = values;
        int[] iArr10 = this.AFLogger;
        byte[][] bArr9 = this.afRDLog;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i20 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i20 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i20 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i20);
        int i21 = iArr9[i12 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i21 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i21 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i21 >>> 8));
        bArr2[7] = (byte) (i21 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i22 = iArr9[i12 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i22 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[11] = (byte) (i22 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i23 = iArr9[i12 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i23 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[15] = (byte) (i23 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFInAppEventType();
        return this.afWarnLog - this.getLevel;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFInAppEventType();
        int i6 = this.getLevel;
        if (i6 >= this.afWarnLog) {
            return -1;
        }
        byte[] bArr = this.init;
        this.getLevel = i6 + 1;
        return bArr[i6] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            AFInAppEventType();
            int i13 = this.getLevel;
            if (i13 >= this.afWarnLog) {
                if (i12 == i6) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.init;
            this.getLevel = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
