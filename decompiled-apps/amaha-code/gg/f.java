package gg;

import java.util.Map;
/* compiled from: Code39Writer.java */
/* loaded from: classes.dex */
public final class f extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f16499v;

    public /* synthetic */ f(int i6) {
        this.f16499v = i6;
    }

    public static void J(boolean[] zArr, int i6, int[] iArr) {
        boolean z10;
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i6 + 1;
            if (iArr[i10] != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i6] = z10;
            i10++;
            i6 = i11;
        }
    }

    public static int K(int i6, String str) {
        int i10 = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i10 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i6) {
                i11 = 1;
            }
        }
        return i10 % 47;
    }

    public static void L(int[] iArr, int i6) {
        for (int i10 = 0; i10 < 9; i10++) {
            int i11 = 1;
            if (((1 << (8 - i10)) & i6) != 0) {
                i11 = 2;
            }
            iArr[i10] = i11;
        }
    }

    public static void M(int[] iArr, int i6) {
        for (int i10 = 0; i10 < 9; i10++) {
            int i11 = 1;
            if (((1 << (8 - i10)) & i6) == 0) {
                i11 = 0;
            }
            iArr[i10] = i11;
        }
    }

    @Override // com.android.volley.toolbox.a, bg.d
    public final dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        switch (this.f16499v) {
            case 0:
                if (aVar == bg.a.CODE_39) {
                    return super.O(str, aVar, i6, i10, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == bg.a.CODE_93) {
                    return super.O(str, aVar, i6, i10, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
        }
    }

    @Override // com.android.volley.toolbox.a
    public final boolean[] c(String str) {
        switch (this.f16499v) {
            case 0:
                int length = str.length();
                if (length <= 80) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6)) < 0) {
                                int length2 = str.length();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i10 = 0; i10 < length2; i10++) {
                                    char charAt = str.charAt(i10);
                                    if (charAt != 0) {
                                        if (charAt != ' ') {
                                            if (charAt != '@') {
                                                if (charAt != '`') {
                                                    if (charAt != '-' && charAt != '.') {
                                                        if (charAt <= 26) {
                                                            sb2.append('$');
                                                            sb2.append((char) ((charAt - 1) + 65));
                                                        } else if (charAt < ' ') {
                                                            sb2.append('%');
                                                            sb2.append((char) ((charAt - 27) + 65));
                                                        } else if (charAt > ',' && charAt != '/' && charAt != ':') {
                                                            if (charAt <= '9') {
                                                                sb2.append((char) ((charAt - '0') + 48));
                                                            } else if (charAt <= '?') {
                                                                sb2.append('%');
                                                                sb2.append((char) ((charAt - ';') + 70));
                                                            } else if (charAt <= 'Z') {
                                                                sb2.append((char) ((charAt - 'A') + 65));
                                                            } else if (charAt <= '_') {
                                                                sb2.append('%');
                                                                sb2.append((char) ((charAt - '[') + 75));
                                                            } else if (charAt <= 'z') {
                                                                sb2.append('+');
                                                                sb2.append((char) ((charAt - 'a') + 65));
                                                            } else if (charAt <= 127) {
                                                                sb2.append('%');
                                                                sb2.append((char) ((charAt - '{') + 80));
                                                            } else {
                                                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i10) + "'");
                                                            }
                                                        } else {
                                                            sb2.append('/');
                                                            sb2.append((char) ((charAt - '!') + 65));
                                                        }
                                                    }
                                                } else {
                                                    sb2.append("%W");
                                                }
                                            } else {
                                                sb2.append("%V");
                                            }
                                        }
                                        sb2.append(charAt);
                                    } else {
                                        sb2.append("%U");
                                    }
                                }
                                str = sb2.toString();
                                length = str.length();
                                if (length > 80) {
                                    throw new IllegalArgumentException(defpackage.c.q("Requested contents should be less than 80 digits long, but got ", length, " (extended full ASCII mode)"));
                                }
                            } else {
                                i6++;
                            }
                        }
                    }
                    int[] iArr = new int[9];
                    int i11 = length + 25;
                    int i12 = 0;
                    while (true) {
                        int[] iArr2 = e.f16498b;
                        if (i12 < length) {
                            L(iArr, iArr2["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i12))]);
                            for (int i13 = 0; i13 < 9; i13++) {
                                i11 += iArr[i13];
                            }
                            i12++;
                        } else {
                            boolean[] zArr = new boolean[i11];
                            L(iArr, 148);
                            int b10 = com.android.volley.toolbox.a.b(zArr, 0, iArr, true);
                            int[] iArr3 = {1};
                            int b11 = com.android.volley.toolbox.a.b(zArr, b10, iArr3, false) + b10;
                            for (int i14 = 0; i14 < length; i14++) {
                                L(iArr, iArr2["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i14))]);
                                int b12 = com.android.volley.toolbox.a.b(zArr, b11, iArr, true) + b11;
                                b11 = com.android.volley.toolbox.a.b(zArr, b12, iArr3, false) + b12;
                            }
                            L(iArr, 148);
                            com.android.volley.toolbox.a.b(zArr, b11, iArr, true);
                            return zArr;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                break;
            default:
                int length3 = str.length();
                if (length3 <= 80) {
                    int[] iArr4 = new int[9];
                    M(iArr4, g.f16500b[47]);
                    boolean[] zArr2 = new boolean[((str.length() + 2 + 2) * 9) + 1];
                    J(zArr2, 0, iArr4);
                    int i15 = 9;
                    for (int i16 = 0; i16 < length3; i16++) {
                        M(iArr4, g.f16500b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i16))]);
                        J(zArr2, i15, iArr4);
                        i15 += 9;
                    }
                    int K = K(20, str);
                    int[] iArr5 = g.f16500b;
                    M(iArr4, iArr5[K]);
                    J(zArr2, i15, iArr4);
                    int i17 = i15 + 9;
                    StringBuilder c10 = v.h.c(str);
                    c10.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(K));
                    M(iArr4, iArr5[K(15, c10.toString())]);
                    J(zArr2, i17, iArr4);
                    int i18 = i17 + 9;
                    M(iArr4, iArr5[47]);
                    J(zArr2, i18, iArr4);
                    zArr2[i18 + 9] = true;
                    return zArr2;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length3)));
        }
    }
}
