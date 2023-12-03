package com.appsflyer.internal;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class AFe1cSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private AFf1xSDK AFInAppEventType;
    private final int AFKeystoreWrapper;
    private int AFLogger;
    private int afDebugLog;
    private int afErrorLog;
    private int[] afInfoLog;
    private int afRDLog;
    private byte[] valueOf;
    private byte[] values;

    public AFe1cSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i6, boolean z10, int i10) {
        super(inputStream);
        this.afErrorLog = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        int min = Math.min(Math.max(i6, 3), 16);
        this.AFKeystoreWrapper = min;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFInAppEventParameterName = bArr2;
        this.valueOf = new byte[8];
        this.afInfoLog = new int[2];
        this.afRDLog = 8;
        this.AFLogger = 8;
        this.afDebugLog = i10;
        if (i10 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AFInAppEventType = new AFf1xSDK(iArr, min, true, false);
    }

    private int AFInAppEventParameterName() {
        if (this.afErrorLog == Integer.MAX_VALUE) {
            this.afErrorLog = ((FilterInputStream) this).in.read();
        }
        int i6 = 8;
        if (this.afRDLog == 8) {
            byte[] bArr = this.values;
            int i10 = this.afErrorLog;
            bArr[0] = (byte) i10;
            if (i10 >= 0) {
                int i11 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.values, i11, 8 - i11);
                    if (read <= 0) {
                        break;
                    }
                    i11 += read;
                } while (i11 < 8);
                if (i11 >= 8) {
                    values();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.afErrorLog = read2;
                    this.afRDLog = 0;
                    if (read2 < 0) {
                        i6 = 8 - (this.values[7] & 255);
                    }
                    this.AFLogger = i6;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.AFLogger;
    }

    private void values() {
        if (this.afDebugLog == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.valueOf, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i6 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i10 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i11 = this.AFKeystoreWrapper;
        AFf1xSDK aFf1xSDK = this.AFInAppEventType;
        AFe1bSDK.valueOf(i6, i10, false, i11, aFf1xSDK.values, aFf1xSDK.AFInAppEventType, this.afInfoLog);
        int[] iArr = this.afInfoLog;
        int i12 = iArr[0];
        int i13 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i12 >> 24);
        bArr3[1] = (byte) (i12 >> 16);
        bArr3[2] = (byte) (i12 >> 8);
        bArr3[3] = (byte) i12;
        bArr3[4] = (byte) (i13 >> 24);
        bArr3[5] = (byte) (i13 >> 16);
        bArr3[6] = (byte) (i13 >> 8);
        bArr3[7] = (byte) i13;
        if (this.afDebugLog == 2) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.values;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.AFInAppEventParameterName[i14]);
            }
            byte[] bArr5 = this.valueOf;
            System.arraycopy(bArr5, 0, this.AFInAppEventParameterName, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFInAppEventParameterName();
        return this.AFLogger - this.afRDLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFInAppEventParameterName();
        int i6 = this.afRDLog;
        if (i6 >= this.AFLogger) {
            return -1;
        }
        byte[] bArr = this.values;
        this.afRDLog = i6 + 1;
        return bArr[i6] & 255;
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
    public final int read(byte[] bArr, int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            AFInAppEventParameterName();
            int i13 = this.afRDLog;
            if (i13 >= this.AFLogger) {
                if (i12 == i6) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.values;
            this.afRDLog = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
