package dw;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import lv.p;
import lv.s;
import lv.t;
import lv.v;
import lv.w;
import lv.z;
/* compiled from: RequestBuilder.java */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f13648l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f13649m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f13650a;

    /* renamed from: b  reason: collision with root package name */
    public final lv.t f13651b;

    /* renamed from: c  reason: collision with root package name */
    public String f13652c;

    /* renamed from: d  reason: collision with root package name */
    public t.a f13653d;

    /* renamed from: e  reason: collision with root package name */
    public final z.a f13654e = new z.a();
    public final s.a f;

    /* renamed from: g  reason: collision with root package name */
    public lv.v f13655g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13656h;

    /* renamed from: i  reason: collision with root package name */
    public final w.a f13657i;

    /* renamed from: j  reason: collision with root package name */
    public final p.a f13658j;

    /* renamed from: k  reason: collision with root package name */
    public lv.c0 f13659k;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes2.dex */
    public static class a extends lv.c0 {

        /* renamed from: a  reason: collision with root package name */
        public final lv.c0 f13660a;

        /* renamed from: b  reason: collision with root package name */
        public final lv.v f13661b;

        public a(lv.c0 c0Var, lv.v vVar) {
            this.f13660a = c0Var;
            this.f13661b = vVar;
        }

        @Override // lv.c0
        public final long a() {
            return this.f13660a.a();
        }

        @Override // lv.c0
        public final lv.v b() {
            return this.f13661b;
        }

        @Override // lv.c0
        public final void c(zv.g gVar) {
            this.f13660a.c(gVar);
        }
    }

    public x(String str, lv.t tVar, String str2, lv.s sVar, lv.v vVar, boolean z10, boolean z11, boolean z12) {
        this.f13650a = str;
        this.f13651b = tVar;
        this.f13652c = str2;
        this.f13655g = vVar;
        this.f13656h = z10;
        if (sVar != null) {
            this.f = sVar.o();
        } else {
            this.f = new s.a();
        }
        if (z11) {
            this.f13658j = new p.a();
        } else if (z12) {
            w.a aVar = new w.a();
            this.f13657i = aVar;
            lv.v type = lv.w.f;
            kotlin.jvm.internal.i.g(type, "type");
            if (kotlin.jvm.internal.i.b(type.f24705b, "multipart")) {
                aVar.f24716b = type;
                return;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(type, "multipart != ").toString());
        }
    }

    public final void a(String name, String str, boolean z10) {
        p.a aVar = this.f13658j;
        if (z10) {
            aVar.getClass();
            kotlin.jvm.internal.i.g(name, "name");
            aVar.f24674b.add(t.b.a(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f24673a, 83));
            aVar.f24675c.add(t.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f24673a, 83));
            return;
        }
        aVar.getClass();
        kotlin.jvm.internal.i.g(name, "name");
        aVar.f24674b.add(t.b.a(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f24673a, 91));
        aVar.f24675c.add(t.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f24673a, 91));
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = lv.v.f24702d;
                this.f13655g = v.a.a(str2);
                return;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(defpackage.c.r("Malformed content type: ", str2), e10);
            }
        }
        this.f.a(str, str2);
    }

    public final void c(lv.s sVar, lv.c0 body) {
        String g5;
        boolean z10;
        w.a aVar = this.f13657i;
        aVar.getClass();
        kotlin.jvm.internal.i.g(body, "body");
        String str = null;
        if (sVar == null) {
            g5 = null;
        } else {
            g5 = sVar.g("Content-Type");
        }
        boolean z11 = false;
        if (g5 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (sVar != null) {
                str = sVar.g("Content-Length");
            }
            if (str == null) {
                z11 = true;
            }
            if (z11) {
                aVar.f24717c.add(new w.b(sVar, body));
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    public final void d(String name, String str, boolean z10) {
        t.a aVar;
        String str2 = this.f13652c;
        String str3 = null;
        if (str2 != null) {
            lv.t tVar = this.f13651b;
            tVar.getClass();
            try {
                aVar = new t.a();
                aVar.d(tVar, str2);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f13653d = aVar;
            if (aVar != null) {
                this.f13652c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + tVar + ", Relative: " + this.f13652c);
            }
        }
        if (z10) {
            t.a aVar2 = this.f13653d;
            aVar2.getClass();
            kotlin.jvm.internal.i.g(name, "encodedName");
            if (aVar2.f24700g == null) {
                aVar2.f24700g = new ArrayList();
            }
            List<String> list = aVar2.f24700g;
            kotlin.jvm.internal.i.d(list);
            list.add(t.b.a(name, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            List<String> list2 = aVar2.f24700g;
            kotlin.jvm.internal.i.d(list2);
            if (str != null) {
                str3 = t.b.a(str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211);
            }
            list2.add(str3);
            return;
        }
        t.a aVar3 = this.f13653d;
        aVar3.getClass();
        kotlin.jvm.internal.i.g(name, "name");
        if (aVar3.f24700g == null) {
            aVar3.f24700g = new ArrayList();
        }
        List<String> list3 = aVar3.f24700g;
        kotlin.jvm.internal.i.d(list3);
        list3.add(t.b.a(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        List<String> list4 = aVar3.f24700g;
        kotlin.jvm.internal.i.d(list4);
        if (str != null) {
            str3 = t.b.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219);
        }
        list4.add(str3);
    }
}
