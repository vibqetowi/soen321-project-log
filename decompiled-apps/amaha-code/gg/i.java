package gg;

import com.google.zxing.FormatException;
import java.util.Map;
/* compiled from: EAN13Writer.java */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f16502v;

    public /* synthetic */ i(int i6) {
        this.f16502v = i6;
    }

    @Override // com.android.volley.toolbox.a, bg.d
    public final dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        switch (this.f16502v) {
            case 0:
                if (aVar == bg.a.EAN_13) {
                    return super.O(str, aVar, i6, i10, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
            case 1:
                if (aVar == bg.a.EAN_8) {
                    return super.O(str, aVar, i6, i10, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == bg.a.UPC_E) {
                    return super.O(str, aVar, i6, i10, map);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
        }
    }

    @Override // com.android.volley.toolbox.a
    public final boolean[] c(String str) {
        switch (this.f16502v) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!k.D(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                } else {
                    try {
                        str = str + k.E(str);
                    } catch (FormatException e10) {
                        throw new IllegalArgumentException(e10);
                    }
                }
                int i6 = h.f16501g[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int b10 = com.android.volley.toolbox.a.b(zArr, 0, k.f16506b, true) + 0;
                for (int i10 = 1; i10 <= 6; i10++) {
                    int digit = Character.digit(str.charAt(i10), 10);
                    if (((i6 >> (6 - i10)) & 1) == 1) {
                        digit += 10;
                    }
                    b10 += com.android.volley.toolbox.a.b(zArr, b10, k.f[digit], false);
                }
                int b11 = com.android.volley.toolbox.a.b(zArr, b10, k.f16507c, false) + b10;
                for (int i11 = 7; i11 <= 12; i11++) {
                    b11 += com.android.volley.toolbox.a.b(zArr, b11, k.f16509e[Character.digit(str.charAt(i11), 10)], true);
                }
                com.android.volley.toolbox.a.b(zArr, b11, k.f16506b, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!k.D(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused2) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                } else {
                    try {
                        str = str + k.E(str);
                    } catch (FormatException e11) {
                        throw new IllegalArgumentException(e11);
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int b12 = com.android.volley.toolbox.a.b(zArr2, 0, k.f16506b, true) + 0;
                for (int i12 = 0; i12 <= 3; i12++) {
                    b12 += com.android.volley.toolbox.a.b(zArr2, b12, k.f16509e[Character.digit(str.charAt(i12), 10)], false);
                }
                int b13 = com.android.volley.toolbox.a.b(zArr2, b12, k.f16507c, false) + b12;
                for (int i13 = 4; i13 <= 7; i13++) {
                    b13 += com.android.volley.toolbox.a.b(zArr2, b13, k.f16509e[Character.digit(str.charAt(i13), 10)], true);
                }
                com.android.volley.toolbox.a.b(zArr2, b13, k.f16506b, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!k.D(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused3) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                } else {
                    try {
                        str = str + k.E(m.F(str));
                    } catch (FormatException e12) {
                        throw new IllegalArgumentException(e12);
                    }
                }
                int digit2 = Character.digit(str.charAt(0), 10);
                if (digit2 != 0 && digit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i14 = m.f16510g[digit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int b14 = com.android.volley.toolbox.a.b(zArr3, 0, k.f16506b, true) + 0;
                for (int i15 = 1; i15 <= 6; i15++) {
                    int digit3 = Character.digit(str.charAt(i15), 10);
                    if (((i14 >> (6 - i15)) & 1) == 1) {
                        digit3 += 10;
                    }
                    b14 += com.android.volley.toolbox.a.b(zArr3, b14, k.f[digit3], false);
                }
                com.android.volley.toolbox.a.b(zArr3, b14, k.f16508d, false);
                return zArr3;
        }
    }
}
