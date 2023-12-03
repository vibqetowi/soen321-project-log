package gv;

import fv.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
public class r extends n {
    public static boolean I0(CharSequence charSequence, char c10) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        if (N0(charSequence, c10, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean J0(CharSequence charSequence, CharSequence other) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        kotlin.jvm.internal.i.g(other, "other");
        if (other instanceof String) {
            if (O0(charSequence, (String) other, 0, false, 2) < 0) {
                return false;
            }
        } else if (M0(charSequence, other, 0, charSequence.length(), false, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int K0(CharSequence charSequence) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int L0(int i6, CharSequence charSequence, String string, boolean z10) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        kotlin.jvm.internal.i.g(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i6);
        }
        return M0(charSequence, string, i6, charSequence.length(), z10, false);
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x004a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int M0(CharSequence charSequence, CharSequence charSequence2, int i6, int i10, boolean z10, boolean z11) {
        xs.d dVar;
        if (!z11) {
            if (i6 < 0) {
                i6 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            dVar = new xs.f(i6, i10);
        } else {
            int K0 = K0(charSequence);
            if (i6 > K0) {
                i6 = K0;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            dVar = new xs.d(i6, i10, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i11 = dVar.f37996u;
        int i12 = dVar.f37998w;
        int i13 = dVar.f37997v;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i12 > 0 && i11 <= i13) || (i12 < 0 && i13 <= i11)) {
                while (!n.C0(0, r3, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i11 != i13) {
                        i11 += i12;
                    }
                }
                return i11;
            }
        } else if ((i12 > 0 && i11 <= i13) || (i12 < 0 && i13 <= i11)) {
            while (!U0(charSequence2, 0, charSequence, i11, charSequence2.length(), z10)) {
                if (i11 != i13) {
                    i11 += i12;
                }
            }
            return i11;
        }
        return -1;
    }

    public static int N0(CharSequence charSequence, char c10, int i6, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i6);
        }
        return P0(i6, charSequence, z10, new char[]{c10});
    }

    public static /* synthetic */ int O0(CharSequence charSequence, String str, int i6, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return L0(i6, charSequence, str, z10);
    }

    public static final int P0(int i6, CharSequence charSequence, boolean z10, char[] chars) {
        boolean z11;
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        kotlin.jvm.internal.i.g(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(is.k.d2(chars), i6);
        }
        if (i6 < 0) {
            i6 = 0;
        }
        xs.e it = new xs.f(i6, K0(charSequence)).iterator();
        while (it.f38001w) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = chars.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (ca.a.S(chars[i10], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    }
                    i10++;
                } else {
                    z11 = false;
                    continue;
                    break;
                }
            }
            if (z11) {
                return nextInt;
            }
        }
        return -1;
    }

    public static int Q0(CharSequence charSequence, char c10, int i6, int i10) {
        if ((i10 & 2) != 0) {
            i6 = K0(charSequence);
        }
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c10};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(is.k.d2(cArr), i6);
            }
            int K0 = K0(charSequence);
            if (i6 > K0) {
                i6 = K0;
            }
            while (-1 < i6) {
                if (ca.a.S(cArr[0], charSequence.charAt(i6), false)) {
                    return i6;
                }
                i6--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c10, i6);
    }

    public static int R0(CharSequence charSequence, String string, int i6, int i10) {
        if ((i10 & 2) != 0) {
            i6 = K0(charSequence);
        }
        int i11 = i6;
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        kotlin.jvm.internal.i.g(string, "string");
        if (!(charSequence instanceof String)) {
            return M0(charSequence, string, i11, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(string, i11);
    }

    public static final List<String> S0(CharSequence charSequence) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        return ca.a.a1(t.J0(t.G0(T0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new q(charSequence))));
    }

    public static b T0(CharSequence charSequence, String[] strArr, boolean z10, int i6) {
        X0(i6);
        return new b(charSequence, 0, i6, new p(is.i.G1(strArr), z10));
    }

    public static final boolean U0(CharSequence charSequence, int i6, CharSequence other, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        kotlin.jvm.internal.i.g(other, "other");
        if (i10 < 0 || i6 < 0 || i6 > charSequence.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!ca.a.S(charSequence.charAt(i6 + i12), other.charAt(i10 + i12), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String V0(CharSequence charSequence, String str) {
        boolean U0;
        kotlin.jvm.internal.i.g(str, "<this>");
        if (charSequence instanceof String) {
            U0 = n.H0(str, (String) charSequence);
        } else {
            U0 = U0(str, 0, charSequence, 0, charSequence.length(), false);
        }
        if (U0) {
            String substring = str.substring(charSequence.length());
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final String W0(String str, String str2) {
        if (n.z0(str2, str)) {
            String substring = str2.substring(0, str2.length() - str.length());
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static final void X0(int i6) {
        boolean z10;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(defpackage.c.p("Limit must be non-negative, but was ", i6).toString());
    }

    public static final List Y0(int i6, CharSequence charSequence, String str, boolean z10) {
        boolean z11;
        X0(i6);
        int i10 = 0;
        int L0 = L0(0, charSequence, str, z10);
        if (L0 != -1 && i6 != 1) {
            if (i6 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = 10;
            if (z11 && i6 <= 10) {
                i11 = i6;
            }
            ArrayList arrayList = new ArrayList(i11);
            do {
                arrayList.add(charSequence.subSequence(i10, L0).toString());
                i10 = str.length() + L0;
                if (z11 && arrayList.size() == i6 - 1) {
                    break;
                }
                L0 = L0(i10, charSequence, str, z10);
            } while (L0 != -1);
            arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            return arrayList;
        }
        return ca.a.O0(charSequence.toString());
    }

    public static List Z0(CharSequence charSequence, char[] cArr) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        if (cArr.length == 1) {
            return Y0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        X0(0);
        fv.q qVar = new fv.q(new b(charSequence, 0, 0, new o(cArr, false)));
        ArrayList arrayList = new ArrayList(is.i.H1(qVar, 10));
        Iterator<Object> it = qVar.iterator();
        while (it.hasNext()) {
            arrayList.add(b1(charSequence, (xs.f) it.next()));
        }
        return arrayList;
    }

    public static List a1(CharSequence charSequence, String[] strArr, int i6, int i10) {
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        boolean z10 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                return Y0(i6, charSequence, str, false);
            }
        }
        fv.q qVar = new fv.q(T0(charSequence, strArr, false, i6));
        ArrayList arrayList = new ArrayList(is.i.H1(qVar, 10));
        Iterator<Object> it = qVar.iterator();
        while (it.hasNext()) {
            arrayList.add(b1(charSequence, (xs.f) it.next()));
        }
        return arrayList;
    }

    public static final String b1(CharSequence charSequence, xs.f range) {
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        kotlin.jvm.internal.i.g(range, "range");
        return charSequence.subSequence(Integer.valueOf(range.f37996u).intValue(), Integer.valueOf(range.f37997v).intValue() + 1).toString();
    }

    public static final String c1(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.i.g(str, "<this>");
        kotlin.jvm.internal.i.g(delimiter, "delimiter");
        kotlin.jvm.internal.i.g(missingDelimiterValue, "missingDelimiterValue");
        int O0 = O0(str, delimiter, 0, false, 6);
        if (O0 != -1) {
            String substring = str.substring(delimiter.length() + O0, str.length());
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String d1(String str, char c10) {
        int N0 = N0(str, c10, 0, false, 6);
        if (N0 != -1) {
            String substring = str.substring(N0 + 1, str.length());
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String e1(String missingDelimiterValue, char c10) {
        kotlin.jvm.internal.i.g(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.i.g(missingDelimiterValue, "missingDelimiterValue");
        int Q0 = Q0(missingDelimiterValue, c10, 0, 6);
        if (Q0 != -1) {
            String substring = missingDelimiterValue.substring(Q0 + 1, missingDelimiterValue.length());
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final String f1(String str, String str2, String missingDelimiterValue) {
        kotlin.jvm.internal.i.g(str, "<this>");
        kotlin.jvm.internal.i.g(missingDelimiterValue, "missingDelimiterValue");
        int O0 = O0(str, str2, 0, false, 6);
        if (O0 != -1) {
            String substring = str.substring(0, O0);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String g1(String missingDelimiterValue, char c10) {
        kotlin.jvm.internal.i.g(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.i.g(missingDelimiterValue, "missingDelimiterValue");
        int N0 = N0(missingDelimiterValue, c10, 0, false, 6);
        if (N0 != -1) {
            String substring = missingDelimiterValue.substring(0, N0);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final String h1(String str, String missingDelimiterValue) {
        kotlin.jvm.internal.i.g(str, "<this>");
        kotlin.jvm.internal.i.g(missingDelimiterValue, "missingDelimiterValue");
        int R0 = R0(str, ".", 0, 6);
        if (R0 != -1) {
            String substring = str.substring(0, R0);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final CharSequence i1(CharSequence charSequence) {
        int i6;
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            if (!z10) {
                i6 = i10;
            } else {
                i6 = length;
            }
            boolean N0 = ca.a.N0(charSequence.charAt(i6));
            if (!z10) {
                if (!N0) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!N0) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
