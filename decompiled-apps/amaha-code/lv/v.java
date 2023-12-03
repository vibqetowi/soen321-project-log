package lv;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: MediaType.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f24702d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f24703e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f24704a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24705b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f24706c;

    /* compiled from: MediaType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static v a(String str) {
            kotlin.jvm.internal.i.g(str, "<this>");
            Matcher matcher = v.f24702d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.i.f(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                String e10 = ri.e.e(locale, "US", group, locale, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                kotlin.jvm.internal.i.f(group2, "typeSubtype.group(2)");
                kotlin.jvm.internal.i.f(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = v.f24703e.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (gv.n.H0(group4, "'") && gv.n.z0(group4, "'") && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                kotlin.jvm.internal.i.f(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new v(str, e10, (String[]) array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public static v b(String str) {
            kotlin.jvm.internal.i.g(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public v(String str, String str2, String[] strArr) {
        this.f24704a = str;
        this.f24705b = str2;
        this.f24706c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f24706c;
        int i6 = 0;
        int F = sp.b.F(0, strArr.length - 1, 2);
        if (F >= 0) {
            while (true) {
                int i10 = i6 + 2;
                if (gv.n.A0(strArr[i6], "charset", true)) {
                    str = strArr[i6 + 1];
                    break;
                } else if (i6 == F) {
                    break;
                } else {
                    i6 = i10;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v) && kotlin.jvm.internal.i.b(((v) obj).f24704a, this.f24704a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24704a.hashCode();
    }

    public final String toString() {
        return this.f24704a;
    }
}
