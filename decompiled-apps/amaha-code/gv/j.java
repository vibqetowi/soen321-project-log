package gv;

import com.appsflyer.R;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Indent.kt */
/* loaded from: classes2.dex */
public class j extends kotlin.jvm.internal.h {
    public static final String u0(String str) {
        Comparable comparable;
        int i6;
        boolean z10;
        kotlin.jvm.internal.i.g(str, "<this>");
        List<String> S0 = r.S0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : S0) {
            if (!n.B0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i10 < length) {
                    if (!ca.a.N0(str2.charAt(i10))) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i10));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = 0;
        }
        int size = (S0.size() * 0) + str.length();
        int l02 = ca.a.l0(S0);
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        for (Object obj2 : S0) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                String str3 = (String) obj2;
                if ((i11 == 0 || i11 == l02) && n.B0(str3)) {
                    str3 = null;
                } else {
                    kotlin.jvm.internal.i.g(str3, "<this>");
                    if (i6 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int length2 = str3.length();
                        if (i6 <= length2) {
                            length2 = i6;
                        }
                        String substring = str3.substring(length2);
                        kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                        String invoke = i.f16953u.invoke(substring);
                        if (invoke != null) {
                            str3 = invoke;
                        }
                    } else {
                        throw new IllegalArgumentException(defpackage.c.q("Requested character count ", i6, " is less than zero.").toString());
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i11 = i12;
            } else {
                ca.a.t1();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(size);
        u.l2(arrayList3, sb2, "\n", null, null, null, R.styleable.AppCompatTheme_windowMinWidthMajor);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb3;
    }

    public static String v0(String str) {
        kotlin.jvm.internal.i.g(str, "<this>");
        if (!n.B0("|")) {
            List<String> S0 = r.S0(str);
            int size = (S0.size() * 0) + str.length();
            int l02 = ca.a.l0(S0);
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            for (Object obj : S0) {
                int i10 = i6 + 1;
                String str2 = null;
                if (i6 >= 0) {
                    String str3 = (String) obj;
                    if ((i6 != 0 && i6 != l02) || !n.B0(str3)) {
                        int length = str3.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (!ca.a.N0(str3.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1 && n.G0(i11, str3, "|", false)) {
                            str2 = str3.substring("|".length() + i11);
                            kotlin.jvm.internal.i.f(str2, "this as java.lang.String).substring(startIndex)");
                        }
                        if (str2 == null || (str2 = i.f16953u.invoke(str2)) == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
            StringBuilder sb2 = new StringBuilder(size);
            u.l2(arrayList, sb2, "\n", null, null, null, R.styleable.AppCompatTheme_windowMinWidthMajor);
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb3;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
