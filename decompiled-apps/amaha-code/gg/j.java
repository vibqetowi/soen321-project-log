package gg;

import java.util.Map;
/* compiled from: ITFWriter.java */
/* loaded from: classes.dex */
public final class j extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f16503v = {1, 1, 1, 1};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f16504w = {3, 1, 1};

    /* renamed from: x  reason: collision with root package name */
    public static final int[][] f16505x = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.android.volley.toolbox.a, bg.d
    public final dg.b O(String str, bg.a aVar, int i6, int i10, Map<bg.c, ?> map) {
        if (aVar == bg.a.ITF) {
            return super.O(str, aVar, i6, i10, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.android.volley.toolbox.a
    public final boolean[] c(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int b10 = com.android.volley.toolbox.a.b(zArr, 0, f16503v, true);
                for (int i6 = 0; i6 < length; i6 += 2) {
                    int digit = Character.digit(str.charAt(i6), 10);
                    int digit2 = Character.digit(str.charAt(i6 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i10 = 0; i10 < 5; i10++) {
                        int i11 = i10 * 2;
                        int[][] iArr2 = f16505x;
                        iArr[i11] = iArr2[digit][i10];
                        iArr[i11 + 1] = iArr2[digit2][i10];
                    }
                    b10 += com.android.volley.toolbox.a.b(zArr, b10, iArr, true);
                }
                com.android.volley.toolbox.a.b(zArr, b10, f16504w, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
