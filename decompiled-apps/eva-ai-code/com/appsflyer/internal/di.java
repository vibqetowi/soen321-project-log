package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public final class di extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private final int AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger$LogLevel;
    private int[] AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback;
    private int getLevel;
    private int init;
    private dj valueOf;
    private byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public di(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        this.AppsFlyer2dXConversionCallback = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.AFInAppEventType = min;
        this.AFInAppEventParameterName = new byte[8];
        byte[] bArr2 = new byte[8];
        this.values = bArr2;
        this.AFKeystoreWrapper = new byte[8];
        this.AFVersionDeclaration = new int[2];
        this.AFLogger$LogLevel = 8;
        this.getLevel = 8;
        this.init = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new dj(iArr, min, true, false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.AFLogger$LogLevel;
        if (i >= this.getLevel) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
        this.AFLogger$LogLevel = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.AFLogger$LogLevel;
            if (i5 >= this.getLevel) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFInAppEventParameterName;
            this.AFLogger$LogLevel = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.getLevel - this.AFLogger$LogLevel;
    }

    private void AFKeystoreWrapper() {
        if (this.init == 2) {
            byte[] bArr = this.AFInAppEventParameterName;
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, bArr.length);
        }
        byte[] bArr2 = this.AFInAppEventParameterName;
        dk.values(((bArr2[0] << Ascii.CAN) & (-16777216)) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255), ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.AFInAppEventType, this.valueOf.AFInAppEventParameterName, this.valueOf.AFInAppEventType, this.AFVersionDeclaration);
        int[] iArr = this.AFVersionDeclaration;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.AFInAppEventParameterName;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.init == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.AFInAppEventParameterName;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.values[i3]);
            }
            byte[] bArr5 = this.AFKeystoreWrapper;
            System.arraycopy(bArr5, 0, this.values, 0, bArr5.length);
        }
    }

    private int AFInAppEventType() throws IOException {
        if (this.AppsFlyer2dXConversionCallback == Integer.MAX_VALUE) {
            this.AppsFlyer2dXConversionCallback = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger$LogLevel == 8) {
            byte[] bArr = this.AFInAppEventParameterName;
            int i = this.AppsFlyer2dXConversionCallback;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFInAppEventParameterName, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFKeystoreWrapper();
            int read2 = ((FilterInputStream) this).in.read();
            this.AppsFlyer2dXConversionCallback = read2;
            this.AFLogger$LogLevel = 0;
            this.getLevel = read2 < 0 ? 8 - (this.AFInAppEventParameterName[7] & 255) : 8;
        }
        return this.getLevel;
    }
}
