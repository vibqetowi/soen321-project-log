package gv;

import java.util.Collection;
import java.util.Locale;
/* compiled from: StringsJVM.kt */
/* loaded from: classes2.dex */
public class n extends m {
    public static final boolean A0(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final boolean B0(CharSequence charSequence) {
        boolean z10;
        kotlin.jvm.internal.i.g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        xs.f fVar = new xs.f(0, charSequence.length() - 1);
        if (!(fVar instanceof Collection) || !((Collection) fVar).isEmpty()) {
            xs.e it = fVar.iterator();
            while (it.f38001w) {
                if (!ca.a.N0(charSequence.charAt(it.nextInt()))) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    public static final boolean C0(int i6, int i10, int i11, String str, String other, boolean z10) {
        kotlin.jvm.internal.i.g(str, "<this>");
        kotlin.jvm.internal.i.g(other, "other");
        if (!z10) {
            return str.regionMatches(i6, other, i10, i11);
        }
        return str.regionMatches(z10, i6, other, i10, i11);
    }

    public static final String D0(int i6, String str) {
        boolean z10;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 != 0) {
                if (i6 != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb2 = new StringBuilder(str.length() * i6);
                            xs.e it = new xs.f(1, i6).iterator();
                            while (it.f38001w) {
                                it.nextInt();
                                sb2.append((CharSequence) str);
                            }
                            String sb3 = sb2.toString();
                            kotlin.jvm.internal.i.f(sb3, "{\n                    va…tring()\n                }");
                            return sb3;
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i6];
                        for (int i10 = 0; i10 < i6; i10++) {
                            cArr[i10] = charAt;
                        }
                        return new String(cArr);
                    }
                } else {
                    return str.toString();
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i6 + '.').toString());
    }

    public static String E0(String str, char c10, char c11) {
        kotlin.jvm.internal.i.g(str, "<this>");
        String replace = str.replace(c10, c11);
        kotlin.jvm.internal.i.f(replace, "this as java.lang.String…replace(oldChar, newChar)");
        return replace;
    }

    public static String F0(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.i.g(str, "<this>");
        kotlin.jvm.internal.i.g(oldValue, "oldValue");
        kotlin.jvm.internal.i.g(newValue, "newValue");
        int L0 = r.L0(0, str, oldValue, false);
        if (L0 >= 0) {
            int length = oldValue.length();
            int i6 = 1;
            if (length >= 1) {
                i6 = length;
            }
            int length2 = newValue.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb2 = new StringBuilder(length2);
                int i10 = 0;
                do {
                    sb2.append((CharSequence) str, i10, L0);
                    sb2.append(newValue);
                    i10 = L0 + length;
                    if (L0 >= str.length()) {
                        break;
                    }
                    L0 = r.L0(L0 + i6, str, oldValue, false);
                } while (L0 > 0);
                sb2.append((CharSequence) str, i10, str.length());
                String sb3 = sb2.toString();
                kotlin.jvm.internal.i.f(sb3, "stringBuilder.append(this, i, length).toString()");
                return sb3;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final boolean G0(int i6, String str, String str2, boolean z10) {
        kotlin.jvm.internal.i.g(str, "<this>");
        if (!z10) {
            return str.startsWith(str2, i6);
        }
        return C0(i6, 0, str2.length(), str, str2, z10);
    }

    public static boolean H0(String str, String prefix) {
        kotlin.jvm.internal.i.g(str, "<this>");
        kotlin.jvm.internal.i.g(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static final String y0(String str) {
        boolean z10;
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.i.f(locale, "getDefault()");
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb2 = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb2.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String upperCase = substring.toUpperCase(locale);
                    kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    sb2.append(upperCase);
                }
                String substring2 = str.substring(1);
                kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                String sb3 = sb2.toString();
                kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            }
            return str;
        }
        return str;
    }

    public static boolean z0(String str, String suffix) {
        kotlin.jvm.internal.i.g(str, "<this>");
        kotlin.jvm.internal.i.g(suffix, "suffix");
        return str.endsWith(suffix);
    }
}
