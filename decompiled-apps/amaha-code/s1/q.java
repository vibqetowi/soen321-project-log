package s1;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class q {
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f31201m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final String f31202a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31203b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31204c;
    public final String f;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f31208h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f31209i;

    /* renamed from: j  reason: collision with root package name */
    public final String f31210j;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f31212l;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f31205d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f31206e = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final hs.i f31207g = sp.b.O(new c());

    /* renamed from: k  reason: collision with root package name */
    public final hs.i f31211k = sp.b.O(new b());

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f31213a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f31214b = new ArrayList();
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<Pattern> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final Pattern invoke() {
            String str = q.this.f31210j;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<Pattern> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final Pattern invoke() {
            String str = q.this.f;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [s1.q] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int] */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    public q(String str, String str2, String str3) {
        int i6;
        List list;
        boolean z10;
        boolean z11;
        this.f31202a = str;
        this.f31203b = str2;
        this.f31204c = str3;
        boolean z12 = true;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31208h = z11;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f31201m.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (z11) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    kotlin.jvm.internal.i.f(fillInPattern, "fillInPattern");
                    this.f31212l = a(substring, sb2, fillInPattern);
                }
                for (String paramName : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParam = parse.getQueryParameter(paramName);
                    if (queryParam == null) {
                        this.f31209i = z12;
                        queryParam = paramName;
                    }
                    Matcher matcher2 = fillInPattern.matcher(queryParam);
                    a aVar = new a();
                    int i10 = 0;
                    ?? r14 = z12;
                    while (matcher2.find()) {
                        String group = matcher2.group((int) r14);
                        if (group != null) {
                            aVar.f31214b.add(group);
                            kotlin.jvm.internal.i.f(queryParam, "queryParam");
                            String substring2 = queryParam.substring(i10, matcher2.start());
                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb3.append(Pattern.quote(substring2));
                            sb3.append("(.+?)?");
                            i10 = matcher2.end();
                            r14 = 1;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i10 < queryParam.length()) {
                        String substring3 = queryParam.substring(i10);
                        kotlin.jvm.internal.i.f(substring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(substring3));
                    }
                    String sb4 = sb3.toString();
                    kotlin.jvm.internal.i.f(sb4, "argRegex.toString()");
                    aVar.f31213a = gv.n.F0(sb4, ".*", "\\E.*\\Q");
                    LinkedHashMap linkedHashMap = this.f31206e;
                    kotlin.jvm.internal.i.f(paramName, "paramName");
                    linkedHashMap.put(paramName, aVar);
                    z12 = true;
                }
            } else {
                kotlin.jvm.internal.i.f(fillInPattern, "fillInPattern");
                this.f31212l = a(str, sb2, fillInPattern);
            }
            String sb5 = sb2.toString();
            kotlin.jvm.internal.i.f(sb5, "uriRegex.toString()");
            this.f = gv.n.F0(sb5, ".*", "\\E.*\\Q");
        }
        if (this.f31204c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f31204c).matches()) {
                String mimeType = this.f31204c;
                kotlin.jvm.internal.i.g(mimeType, "mimeType");
                List c10 = new gv.e("/").c(mimeType);
                if (!c10.isEmpty()) {
                    ListIterator listIterator = c10.listIterator(c10.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() == 0) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (!z10) {
                            i6 = 1;
                            list = is.u.E2(c10, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                i6 = 1;
                list = is.w.f20676u;
                this.f31210j = gv.n.F0("^(" + ((String) list.get(0)) + "|[*]+)/(" + ((String) list.get(i6)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
                return;
            }
            throw new IllegalArgumentException(r1.b0.b(new StringBuilder("The given mimeType "), this.f31204c, " does not match to required \"type/subtype\" format").toString());
        }
    }

    public static void b(Bundle bundle, String key, String str, e eVar) {
        if (eVar != null) {
            c0<Object> c0Var = eVar.f31109a;
            c0Var.getClass();
            kotlin.jvm.internal.i.g(key, "key");
            c0Var.d(bundle, key, c0Var.c(str));
            return;
        }
        bundle.putString(key, str);
    }

    public final boolean a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !gv.r.J0(str, ".*");
        int i6 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f31205d.add(group);
                String substring = str.substring(i6, matcher.start());
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(substring));
                sb2.append("([^/]+?)");
                i6 = matcher.end();
                z10 = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i6 < str.length()) {
            String substring2 = str.substring(i6);
            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        return z10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!kotlin.jvm.internal.i.b(this.f31202a, qVar.f31202a) || !kotlin.jvm.internal.i.b(this.f31203b, qVar.f31203b) || !kotlin.jvm.internal.i.b(this.f31204c, qVar.f31204c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f31202a;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i6 + 0) * 31;
        String str2 = this.f31203b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f31204c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }
}
