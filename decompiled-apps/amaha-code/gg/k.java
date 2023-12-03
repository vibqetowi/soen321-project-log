package gg;

import com.google.zxing.FormatException;
/* compiled from: UPCEANReader.java */
/* loaded from: classes.dex */
public abstract class k extends androidx.work.k {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f16506b = {1, 1, 1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f16507c = {1, 1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f16508d = {1, 1, 1, 1, 1, 1};

    /* renamed from: e  reason: collision with root package name */
    public static final int[][] f16509e;
    public static final int[][] f;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f16509e = iArr;
        int[][] iArr2 = new int[20];
        f = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i6 = 10; i6 < 20; i6++) {
            int[] iArr3 = f16509e[i6 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            f[i6] = iArr4;
        }
    }

    public static boolean D(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i6 = length - 1;
        if (E(charSequence.subSequence(0, i6)) != Character.digit(charSequence.charAt(i6), 10)) {
            return false;
        }
        return true;
    }

    public static int E(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        for (int i10 = length - 1; i10 >= 0; i10 -= 2) {
            int charAt = charSequence.charAt(i10) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i6 += charAt;
            } else {
                throw FormatException.a();
            }
        }
        int i11 = i6 * 3;
        for (int i12 = length - 2; i12 >= 0; i12 -= 2) {
            int charAt2 = charSequence.charAt(i12) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i11 += charAt2;
            } else {
                throw FormatException.a();
            }
        }
        return (1000 - i11) % 10;
    }
}
