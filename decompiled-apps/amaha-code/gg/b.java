package gg;
/* compiled from: CodaBarWriter.java */
/* loaded from: classes.dex */
public final class b extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public static final char[] f16493v;

    /* renamed from: w  reason: collision with root package name */
    public static final char[] f16494w = {'T', 'N', '*', 'E'};

    /* renamed from: x  reason: collision with root package name */
    public static final char[] f16495x = {'/', ':', '+', '.'};

    /* renamed from: y  reason: collision with root package name */
    public static final char f16496y;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f16493v = cArr;
        f16496y = cArr[0];
    }

    @Override // com.android.volley.toolbox.a
    public final boolean[] c(String str) {
        int i6;
        int length = str.length();
        char c10 = f16496y;
        if (length < 2) {
            str = c10 + str + c10;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f16493v;
            boolean D = a.D(cArr, upperCase);
            boolean D2 = a.D(cArr, upperCase2);
            char[] cArr2 = f16494w;
            boolean D3 = a.D(cArr2, upperCase);
            boolean D4 = a.D(cArr2, upperCase2);
            if (D) {
                if (!D2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (D3) {
                if (!D4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!D2 && !D4) {
                str = c10 + str + c10;
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i10 = 20;
        for (int i11 = 1; i11 < str.length() - 1; i11++) {
            if (!Character.isDigit(str.charAt(i11)) && str.charAt(i11) != '-' && str.charAt(i11) != '$') {
                if (a.D(f16495x, str.charAt(i11))) {
                    i10 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i11) + '\'');
                }
            } else {
                i10 += 9;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i10];
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i13));
            if (i13 == 0 || i13 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i14 = 0;
            while (true) {
                char[] cArr3 = a.f16491b;
                if (i14 < cArr3.length) {
                    if (upperCase3 == cArr3[i14]) {
                        i6 = a.f16492c[i14];
                        break;
                    }
                    i14++;
                } else {
                    i6 = 0;
                    break;
                }
            }
            int i15 = 0;
            boolean z10 = true;
            while (true) {
                int i16 = 0;
                while (i15 < 7) {
                    zArr[i12] = z10;
                    i12++;
                    if (((i6 >> (6 - i15)) & 1) != 0 && i16 != 1) {
                        i16++;
                    } else {
                        z10 = !z10;
                        i15++;
                    }
                }
                break;
            }
            if (i13 < str.length() - 1) {
                zArr[i12] = false;
                i12++;
            }
        }
        return zArr;
    }
}
