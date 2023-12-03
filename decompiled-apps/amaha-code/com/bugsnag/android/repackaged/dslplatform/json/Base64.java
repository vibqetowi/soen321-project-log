package com.bugsnag.android.repackaged.dslplatform.json;

import java.util.Arrays;
/* loaded from: classes.dex */
abstract class Base64 {
    private static final byte[] BA;
    private static final char[] CA;
    private static final byte[] EMPTY_ARRAY;
    private static final int[] IA;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        CA = charArray;
        int[] iArr = new int[256];
        IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i6 = 0; i6 < length; i6++) {
            IA[CA[i6]] = i6;
        }
        IA[61] = 0;
        BA = new byte[CA.length];
        int i10 = 0;
        while (true) {
            char[] cArr = CA;
            if (i10 < cArr.length) {
                BA[i10] = (byte) cArr[i10];
                i10++;
            } else {
                EMPTY_ARRAY = new byte[0];
                return;
            }
        }
    }

    public static byte[] decodeFast(byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = i10 - i6;
        if (i14 == 0) {
            return EMPTY_ARRAY;
        }
        int i15 = i10 - 1;
        while (i6 < i15 && IA[bArr[i6] & 255] < 0) {
            i6++;
        }
        while (i15 > 0 && IA[bArr[i15] & 255] < 0) {
            i15--;
        }
        int i16 = 0;
        if (bArr[i15] == 61) {
            if (bArr[i15 - 1] == 61) {
                i11 = 2;
            } else {
                i11 = 1;
            }
        } else {
            i11 = 0;
        }
        int i17 = (i15 - i6) + 1;
        if (i14 > 76) {
            if (bArr[76] == 13) {
                i13 = i17 / 78;
            } else {
                i13 = 0;
            }
            i12 = i13 << 1;
        } else {
            i12 = 0;
        }
        int i18 = (((i17 - i12) * 6) >> 3) - i11;
        byte[] bArr2 = new byte[i18];
        int i19 = (i18 / 3) * 3;
        int i20 = 0;
        int i21 = 0;
        while (i20 < i19) {
            int[] iArr = IA;
            int i22 = i6 + 1;
            int i23 = i22 + 1;
            int i24 = (iArr[bArr[i6]] << 18) | (iArr[bArr[i22]] << 12);
            int i25 = i23 + 1;
            int i26 = i24 | (iArr[bArr[i23]] << 6);
            int i27 = i25 + 1;
            int i28 = i26 | iArr[bArr[i25]];
            int i29 = i20 + 1;
            bArr2[i20] = (byte) (i28 >> 16);
            int i30 = i29 + 1;
            bArr2[i29] = (byte) (i28 >> 8);
            int i31 = i30 + 1;
            bArr2[i30] = (byte) i28;
            if (i12 > 0 && (i21 = i21 + 1) == 19) {
                i6 = i27 + 2;
                i21 = 0;
            } else {
                i6 = i27;
            }
            i20 = i31;
        }
        if (i20 < i18) {
            int i32 = 0;
            while (i6 <= i15 - i11) {
                i16 |= IA[bArr[i6]] << (18 - (i32 * 6));
                i32++;
                i6++;
            }
            int i33 = 16;
            while (i20 < i18) {
                bArr2[i20] = (byte) (i16 >> i33);
                i33 -= 8;
                i20++;
            }
        }
        return bArr2;
    }

    public static int encodeToBytes(byte[] bArr, byte[] bArr2, int i6) {
        byte b10;
        int length = bArr.length;
        int i10 = (length / 3) * 3;
        int i11 = length - 1;
        int i12 = ((i11 / 3) + 1) << 2;
        int i13 = 0;
        int i14 = i6;
        int i15 = 0;
        while (i15 < i10) {
            int i16 = i15 + 1;
            int i17 = i16 + 1;
            int i18 = ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8);
            int i19 = i17 + 1;
            int i20 = i18 | (bArr[i17] & 255);
            int i21 = i14 + 1;
            byte[] bArr3 = BA;
            bArr2[i14] = bArr3[(i20 >>> 18) & 63];
            int i22 = i21 + 1;
            bArr2[i21] = bArr3[(i20 >>> 12) & 63];
            int i23 = i22 + 1;
            bArr2[i22] = bArr3[(i20 >>> 6) & 63];
            i14 = i23 + 1;
            bArr2[i23] = bArr3[i20 & 63];
            i15 = i19;
        }
        int i24 = length - i10;
        if (i24 > 0) {
            int i25 = (bArr[i10] & 255) << 10;
            if (i24 == 2) {
                i13 = (bArr[i11] & 255) << 2;
            }
            int i26 = i25 | i13;
            int i27 = i6 + i12;
            byte[] bArr4 = BA;
            bArr2[i27 - 4] = bArr4[i26 >> 12];
            bArr2[i27 - 3] = bArr4[(i26 >>> 6) & 63];
            int i28 = i27 - 2;
            if (i24 == 2) {
                b10 = bArr4[i26 & 63];
            } else {
                b10 = 61;
            }
            bArr2[i28] = b10;
            bArr2[i27 - 1] = 61;
        }
        return i12;
    }

    public static int findEnd(byte[] bArr, int i6) {
        while (i6 < bArr.length) {
            if (IA[bArr[i6] & 255] < 0) {
                return i6;
            }
            i6++;
        }
        return bArr.length;
    }
}
