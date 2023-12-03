package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFe1bSDK {
    public static void valueOf(int i6, int i10, boolean z10, int i11, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z10) {
            values(iArr);
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i6 ^ iArr[i12];
            int valueOf = i10 ^ valueOf(i13, iArr2);
            i12++;
            i10 = i13;
            i6 = valueOf;
        }
        int i14 = i6 ^ iArr[iArr.length - 2];
        int i15 = i10 ^ iArr[iArr.length - 1];
        if (!z10) {
            values(iArr);
        }
        iArr3[0] = i15;
        iArr3[1] = i14;
    }

    private static void values(int[] iArr) {
        for (int i6 = 0; i6 < iArr.length / 2; i6++) {
            int i10 = iArr[i6];
            iArr[i6] = iArr[(iArr.length - i6) - 1];
            iArr[(iArr.length - i6) - 1] = i10;
        }
    }

    private static int valueOf(int i6, int[][] iArr) {
        return ((iArr[0][i6 >>> 24] + iArr[1][(i6 >>> 16) & 255]) ^ iArr[2][(i6 >>> 8) & 255]) + iArr[3][i6 & 255];
    }
}
