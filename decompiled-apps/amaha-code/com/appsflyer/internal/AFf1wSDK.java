package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFf1wSDK {
    private static byte[] afErrorLog = new byte[256];
    static final byte[] values = new byte[256];
    static final int[] AFInAppEventParameterName = new int[256];
    static final int[] AFKeystoreWrapper = new int[256];
    static final int[] valueOf = new int[256];
    static final int[] AFInAppEventType = new int[256];
    private static int[] afInfoLog = new int[10];

    static {
        int i6;
        byte b10;
        byte[] bArr;
        int i10;
        byte b11 = 1;
        byte b12 = 1;
        do {
            int i11 = (b11 << 1) ^ b11;
            if ((b11 & 128) != 0) {
                i6 = 27;
            } else {
                i6 = 0;
            }
            b11 = (byte) (i6 ^ i11);
            byte b13 = (byte) (b12 ^ (b12 << 1));
            byte b14 = (byte) (b13 ^ (b13 << 2));
            byte b15 = (byte) (b14 ^ (b14 << 4));
            if ((b15 & 128) != 0) {
                b10 = 9;
            } else {
                b10 = 0;
            }
            b12 = (byte) (b15 ^ b10);
            bArr = afErrorLog;
            i10 = b11 & 255;
            int i12 = b12 & 255;
            bArr[i10] = (byte) (((((b12 ^ 99) ^ ((i12 << 1) | (i12 >> 7))) ^ ((i12 << 2) | (i12 >> 6))) ^ ((i12 << 3) | (i12 >> 5))) ^ ((i12 >> 4) | (i12 << 4)));
        } while (i10 != 1);
        bArr[0] = 99;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = afErrorLog[i13] & 255;
            values[i14] = (byte) i13;
            int i15 = i13 << 1;
            if (i15 >= 256) {
                i15 ^= 283;
            }
            int i16 = i15 << 1;
            if (i16 >= 256) {
                i16 ^= 283;
            }
            int i17 = i16 << 1;
            if (i17 >= 256) {
                i17 ^= 283;
            }
            int i18 = i17 ^ i13;
            int i19 = ((i15 ^ (i16 ^ i17)) << 24) | (i18 << 16) | ((i18 ^ i16) << 8) | (i18 ^ i15);
            AFInAppEventParameterName[i14] = i19;
            AFKeystoreWrapper[i14] = (i19 >>> 8) | (i19 << 24);
            valueOf[i14] = (i19 >>> 16) | (i19 << 16);
            AFInAppEventType[i14] = (i19 << 8) | (i19 >>> 24);
        }
        afInfoLog[0] = 16777216;
        int i20 = 1;
        for (int i21 = 1; i21 < 10; i21++) {
            i20 <<= 1;
            if (i20 >= 256) {
                i20 ^= 283;
            }
            afInfoLog[i21] = i20 << 24;
        }
    }

    private static int[] AFInAppEventParameterName(byte[] bArr, int[] iArr, int i6) {
        if (bArr.length == 16) {
            int i10 = 4;
            int[] iArr2 = new int[(i6 + 1) * 4];
            int i11 = i6 * 4;
            int i12 = i11 + 1;
            iArr2[0] = iArr[i11];
            int i13 = i12 + 1;
            int i14 = 1;
            iArr2[1] = iArr[i12];
            int i15 = i13 + 1;
            iArr2[2] = iArr[i13];
            iArr2[3] = iArr[i15];
            int i16 = i15 - 7;
            while (i14 < i6) {
                int i17 = i16 + 1;
                int i18 = iArr[i16];
                int i19 = i10 + 1;
                int[] iArr3 = AFInAppEventParameterName;
                byte[] bArr2 = afErrorLog;
                int i20 = iArr3[bArr2[i18 >>> 24] & 255];
                int[] iArr4 = AFKeystoreWrapper;
                int i21 = i20 ^ iArr4[bArr2[(i18 >>> 16) & 255] & 255];
                int[] iArr5 = valueOf;
                int i22 = i21 ^ iArr5[bArr2[(i18 >>> 8) & 255] & 255];
                int[] iArr6 = AFInAppEventType;
                iArr2[i10] = iArr6[bArr2[i18 & 255] & 255] ^ i22;
                int i23 = i17 + 1;
                int i24 = iArr[i17];
                int i25 = i19 + 1;
                iArr2[i19] = iArr6[bArr2[i24 & 255] & 255] ^ ((iArr3[bArr2[i24 >>> 24] & 255] ^ iArr4[bArr2[(i24 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i24 >>> 8) & 255] & 255]);
                int i26 = i23 + 1;
                int i27 = iArr[i23];
                int i28 = i25 + 1;
                iArr2[i25] = iArr6[bArr2[i27 & 255] & 255] ^ ((iArr3[bArr2[i27 >>> 24] & 255] ^ iArr4[bArr2[(i27 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i27 >>> 8) & 255] & 255]);
                int i29 = iArr[i26];
                iArr2[i28] = iArr6[bArr2[i29 & 255] & 255] ^ ((iArr3[bArr2[i29 >>> 24] & 255] ^ iArr4[bArr2[(i29 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i29 >>> 8) & 255] & 255]);
                i14++;
                i16 = i26 - 7;
                i10 = i28 + 1;
            }
            int i30 = i10 + 1;
            int i31 = i16 + 1;
            iArr2[i10] = iArr[i16];
            int i32 = i30 + 1;
            int i33 = i31 + 1;
            iArr2[i30] = iArr[i31];
            iArr2[i32] = iArr[i33];
            iArr2[i32 + 1] = iArr[i33 + 1];
            return iArr2;
        }
        throw new IllegalArgumentException();
    }

    public static byte[][] AFInAppEventParameterName(int i6) {
        byte[][] bArr = new byte[4];
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i6 >>> (i10 << 3);
            byte[] bArr2 = new byte[4];
            bArr2[0] = (byte) (i11 & 3);
            bArr2[1] = (byte) ((i11 >> 2) & 3);
            bArr2[2] = (byte) ((i11 >> 4) & 3);
            bArr2[3] = (byte) ((i11 >> 6) & 3);
            bArr[i10] = bArr2;
        }
        return bArr;
    }

    public static int[] AFInAppEventParameterName(byte[] bArr, int i6) {
        if (bArr.length == 16) {
            int i10 = (i6 + 1) * 4;
            int[] iArr = new int[i10];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < 4) {
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = (bArr[i13] << 24) | ((bArr[i14] & 255) << 16);
                int i17 = i15 + 1;
                iArr[i12] = i16 | ((bArr[i15] & 255) << 8) | (bArr[i17] & 255);
                i12++;
                i13 = i17 + 1;
            }
            int i18 = 0;
            int i19 = 4;
            while (i19 < i10) {
                int i20 = iArr[i19 - 1];
                if (i11 == 0) {
                    byte[] bArr2 = afErrorLog;
                    i20 = ((bArr2[i20 >>> 24] & 255) | (((bArr2[(i20 >>> 16) & 255] << 24) | ((bArr2[(i20 >>> 8) & 255] & 255) << 16)) | ((bArr2[i20 & 255] & 255) << 8))) ^ afInfoLog[i18];
                    i18++;
                    i11 = 4;
                }
                iArr[i19] = i20 ^ iArr[i19 - 4];
                i19++;
                i11--;
            }
            return AFInAppEventParameterName(bArr, iArr, i6);
        }
        throw new IllegalArgumentException();
    }
}
