package gg;

import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: Code128Writer.java */
/* loaded from: classes.dex */
public final class d extends com.android.volley.toolbox.a {
    public static int J(int i6, CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 1;
        if (i6 >= length) {
            return 1;
        }
        char charAt = charSequence.charAt(i6);
        if (charAt == 241) {
            return 4;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i11 = i6 + 1;
            i10 = 2;
            if (i11 >= length) {
                return 2;
            }
            char charAt2 = charSequence.charAt(i11);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return 3;
            }
        }
        return i10;
    }

    @Override // com.android.volley.toolbox.a, bg.d
    public final dg.b O(String str, bg.a aVar, int i6, int i10, Map<bg.c, ?> map) {
        if (aVar == bg.a.CODE_128) {
            return super.O(str, aVar, i6, i10, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
        if (J(r5 + 3, r17) == 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
        if (r14 == 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
        if (r11 == 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
        r2 = 99;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    @Override // com.android.volley.toolbox.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean[] c(String str) {
        int i6;
        int charAt;
        int J;
        char charAt2;
        int length = str.length();
        if (length > 0 && length <= 80) {
            for (int i10 = 0; i10 < length; i10++) {
                char charAt3 = str.charAt(i10);
                switch (charAt3) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt3 <= 127) {
                            break;
                        } else {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt3)));
                        }
                }
            }
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1;
            while (true) {
                int[][] iArr = c.f16497b;
                int i15 = R.styleable.AppCompatTheme_textAppearanceListItem;
                if (i11 < length) {
                    int J2 = J(i11, str);
                    int i16 = R.styleable.AppCompatTheme_switchStyle;
                    if (J2 != 2) {
                        if (J2 == 1) {
                            if (i11 < str.length() && ((charAt2 = str.charAt(i11)) < ' ' || (i13 == 101 && charAt2 < '`'))) {
                                i6 = R.styleable.AppCompatTheme_switchStyle;
                            }
                        } else {
                            i6 = 99;
                            if (i13 != 99) {
                                if (i13 == 100) {
                                    if (J2 != 4 && (J = J(i11 + 2, str)) != 1 && J != 2) {
                                        if (J != 4) {
                                            int i17 = i11 + 4;
                                            while (true) {
                                                int J3 = J(i17, str);
                                                if (J3 == 3) {
                                                    i17 += 2;
                                                }
                                            }
                                        }
                                    }
                                } else if (J2 == 4) {
                                    J2 = J(i11 + 1, str);
                                }
                            }
                        }
                        if (i6 != i13) {
                            switch (str.charAt(i11)) {
                                case 241:
                                    i16 = R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
                                    break;
                                case 242:
                                    i16 = 97;
                                    break;
                                case 243:
                                    i16 = 96;
                                    break;
                                case 244:
                                    if (i13 != 101) {
                                        i16 = 100;
                                        break;
                                    }
                                    break;
                                default:
                                    if (i13 == 100) {
                                        charAt = str.charAt(i11) - ' ';
                                    } else if (i13 != 101) {
                                        charAt = Integer.parseInt(str.substring(i11, i11 + 2));
                                        i11++;
                                    } else {
                                        charAt = str.charAt(i11) - ' ';
                                        if (charAt < 0) {
                                            charAt += 96;
                                        }
                                    }
                                    i16 = charAt;
                                    break;
                            }
                            i11++;
                        } else {
                            if (i13 == 0) {
                                if (i6 != 100) {
                                    if (i6 != 101) {
                                        i15 = R.styleable.AppCompatTheme_textAppearanceListItemSmall;
                                    }
                                } else {
                                    i15 = R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
                                }
                            } else {
                                i15 = i6;
                            }
                            i13 = i6;
                            i16 = i15;
                        }
                        arrayList.add(iArr[i16]);
                        i12 += i16 * i14;
                        if (i11 == 0) {
                            i14++;
                        }
                    }
                    i6 = 100;
                    if (i6 != i13) {
                    }
                    arrayList.add(iArr[i16]);
                    i12 += i16 * i14;
                    if (i11 == 0) {
                    }
                } else {
                    arrayList.add(iArr[i12 % R.styleable.AppCompatTheme_textAppearanceListItem]);
                    arrayList.add(iArr[106]);
                    Iterator it = arrayList.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        for (int i19 : (int[]) it.next()) {
                            i18 += i19;
                        }
                    }
                    boolean[] zArr = new boolean[i18];
                    Iterator it2 = arrayList.iterator();
                    int i20 = 0;
                    while (it2.hasNext()) {
                        i20 += com.android.volley.toolbox.a.b(zArr, i20, (int[]) it2.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
