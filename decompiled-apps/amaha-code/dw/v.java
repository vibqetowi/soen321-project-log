package dw;

import dw.a;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import lv.s;
import lv.w;
/* compiled from: ParameterHandler.java */
/* loaded from: classes2.dex */
public abstract class v<T> {

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13605a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13606b;

        /* renamed from: c  reason: collision with root package name */
        public final dw.f<T, lv.c0> f13607c;

        public a(Method method, int i6, dw.f<T, lv.c0> fVar) {
            this.f13605a = method;
            this.f13606b = i6;
            this.f13607c = fVar;
        }

        @Override // dw.v
        public final void a(x xVar, T t3) {
            int i6 = this.f13606b;
            Method method = this.f13605a;
            if (t3 != null) {
                try {
                    xVar.f13659k = this.f13607c.a(t3);
                    return;
                } catch (IOException e10) {
                    throw e0.k(method, e10, i6, "Unable to convert " + t3 + " to RequestBody", new Object[0]);
                }
            }
            throw e0.j(method, i6, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f13608a;

        /* renamed from: b  reason: collision with root package name */
        public final dw.f<T, String> f13609b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13610c;

        public b(String str, boolean z10) {
            a.d dVar = a.d.f13530a;
            Objects.requireNonNull(str, "name == null");
            this.f13608a = str;
            this.f13609b = dVar;
            this.f13610c = z10;
        }

        @Override // dw.v
        public final void a(x xVar, T t3) {
            String a10;
            if (t3 == null || (a10 = this.f13609b.a(t3)) == null) {
                return;
            }
            xVar.a(this.f13608a, a10, this.f13610c);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class c<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13611a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13612b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13613c;

        public c(Method method, int i6, boolean z10) {
            this.f13611a = method;
            this.f13612b = i6;
            this.f13613c = z10;
        }

        @Override // dw.v
        public final void a(x xVar, Object obj) {
            Map map = (Map) obj;
            int i6 = this.f13612b;
            Method method = this.f13611a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                xVar.a(str, obj2, this.f13613c);
                            } else {
                                throw e0.j(method, i6, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw e0.j(method, i6, defpackage.b.m("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.j(method, i6, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.j(method, i6, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class d<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f13614a;

        /* renamed from: b  reason: collision with root package name */
        public final dw.f<T, String> f13615b;

        public d(String str) {
            a.d dVar = a.d.f13530a;
            Objects.requireNonNull(str, "name == null");
            this.f13614a = str;
            this.f13615b = dVar;
        }

        @Override // dw.v
        public final void a(x xVar, T t3) {
            String a10;
            if (t3 == null || (a10 = this.f13615b.a(t3)) == null) {
                return;
            }
            xVar.b(this.f13614a, a10);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class e<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13616a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13617b;

        public e(Method method, int i6) {
            this.f13616a = method;
            this.f13617b = i6;
        }

        @Override // dw.v
        public final void a(x xVar, Object obj) {
            Map map = (Map) obj;
            int i6 = this.f13617b;
            Method method = this.f13616a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            xVar.b(str, value.toString());
                        } else {
                            throw e0.j(method, i6, defpackage.b.m("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.j(method, i6, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.j(method, i6, "Header map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class f extends v<lv.s> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13618a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13619b;

        public f(int i6, Method method) {
            this.f13618a = method;
            this.f13619b = i6;
        }

        @Override // dw.v
        public final void a(x xVar, lv.s sVar) {
            lv.s sVar2 = sVar;
            if (sVar2 != null) {
                s.a aVar = xVar.f;
                aVar.getClass();
                int length = sVar2.f24683u.length / 2;
                for (int i6 = 0; i6 < length; i6++) {
                    aVar.c(sVar2.m(i6), sVar2.q(i6));
                }
                return;
            }
            int i10 = this.f13619b;
            throw e0.j(this.f13618a, i10, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class g<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13620a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13621b;

        /* renamed from: c  reason: collision with root package name */
        public final lv.s f13622c;

        /* renamed from: d  reason: collision with root package name */
        public final dw.f<T, lv.c0> f13623d;

        public g(Method method, int i6, lv.s sVar, dw.f<T, lv.c0> fVar) {
            this.f13620a = method;
            this.f13621b = i6;
            this.f13622c = sVar;
            this.f13623d = fVar;
        }

        @Override // dw.v
        public final void a(x xVar, T t3) {
            if (t3 == null) {
                return;
            }
            try {
                xVar.c(this.f13622c, this.f13623d.a(t3));
            } catch (IOException e10) {
                throw e0.j(this.f13620a, this.f13621b, "Unable to convert " + t3 + " to RequestBody", e10);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class h<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13624a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13625b;

        /* renamed from: c  reason: collision with root package name */
        public final dw.f<T, lv.c0> f13626c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13627d;

        public h(Method method, int i6, dw.f<T, lv.c0> fVar, String str) {
            this.f13624a = method;
            this.f13625b = i6;
            this.f13626c = fVar;
            this.f13627d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dw.v
        public final void a(x xVar, Object obj) {
            Map map = (Map) obj;
            int i6 = this.f13625b;
            Method method = this.f13624a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            xVar.c(s.b.c("Content-Disposition", defpackage.b.m("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f13627d), (lv.c0) this.f13626c.a(value));
                        } else {
                            throw e0.j(method, i6, defpackage.b.m("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.j(method, i6, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.j(method, i6, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class i<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13628a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13629b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13630c;

        /* renamed from: d  reason: collision with root package name */
        public final dw.f<T, String> f13631d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13632e;

        public i(Method method, int i6, String str, boolean z10) {
            a.d dVar = a.d.f13530a;
            this.f13628a = method;
            this.f13629b = i6;
            Objects.requireNonNull(str, "name == null");
            this.f13630c = str;
            this.f13631d = dVar;
            this.f13632e = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
        @Override // dw.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(x xVar, T t3) {
            String str;
            String replace;
            String str2 = this.f13630c;
            if (t3 != null) {
                String a10 = this.f13631d.a(t3);
                if (xVar.f13652c != null) {
                    int length = a10.length();
                    int i6 = 0;
                    while (i6 < length) {
                        int codePointAt = a10.codePointAt(i6);
                        int i10 = 47;
                        boolean z10 = this.f13632e;
                        int i11 = -1;
                        if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z10 || (codePointAt != 47 && codePointAt != 37))) {
                            i6 += Character.charCount(codePointAt);
                        } else {
                            zv.e eVar = new zv.e();
                            eVar.Q0(0, i6, a10);
                            zv.e eVar2 = null;
                            while (i6 < length) {
                                int codePointAt2 = a10.codePointAt(i6);
                                if (!z10 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                                    if (codePointAt2 >= 32 && codePointAt2 < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt2) == i11 && (z10 || (codePointAt2 != i10 && codePointAt2 != 37))) {
                                        eVar.S0(codePointAt2);
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new zv.e();
                                        }
                                        eVar2.S0(codePointAt2);
                                        while (!eVar2.B()) {
                                            int readByte = eVar2.readByte() & 255;
                                            eVar.L0(37);
                                            char[] cArr = x.f13648l;
                                            eVar.L0(cArr[(readByte >> 4) & 15]);
                                            eVar.L0(cArr[readByte & 15]);
                                        }
                                    }
                                }
                                i6 += Character.charCount(codePointAt2);
                                i10 = 47;
                                i11 = -1;
                            }
                            str = eVar.k0();
                            String str3 = xVar.f13652c;
                            replace = str3.replace("{" + str2 + "}", str);
                            if (x.f13649m.matcher(replace).matches()) {
                                xVar.f13652c = replace;
                                return;
                            }
                            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(a10));
                        }
                    }
                    str = a10;
                    String str32 = xVar.f13652c;
                    replace = str32.replace("{" + str2 + "}", str);
                    if (x.f13649m.matcher(replace).matches()) {
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                throw e0.j(this.f13628a, this.f13629b, defpackage.b.m("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class j<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f13633a;

        /* renamed from: b  reason: collision with root package name */
        public final dw.f<T, String> f13634b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13635c;

        public j(String str, boolean z10) {
            a.d dVar = a.d.f13530a;
            Objects.requireNonNull(str, "name == null");
            this.f13633a = str;
            this.f13634b = dVar;
            this.f13635c = z10;
        }

        @Override // dw.v
        public final void a(x xVar, T t3) {
            String a10;
            if (t3 == null || (a10 = this.f13634b.a(t3)) == null) {
                return;
            }
            xVar.d(this.f13633a, a10, this.f13635c);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class k<T> extends v<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13636a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13637b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13638c;

        public k(Method method, int i6, boolean z10) {
            this.f13636a = method;
            this.f13637b = i6;
            this.f13638c = z10;
        }

        @Override // dw.v
        public final void a(x xVar, Object obj) {
            Map map = (Map) obj;
            int i6 = this.f13637b;
            Method method = this.f13636a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                xVar.d(str, obj2, this.f13638c);
                            } else {
                                throw e0.j(method, i6, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw e0.j(method, i6, defpackage.b.m("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw e0.j(method, i6, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw e0.j(method, i6, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class l<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13639a;

        public l(boolean z10) {
            this.f13639a = z10;
        }

        @Override // dw.v
        public final void a(x xVar, T t3) {
            if (t3 == null) {
                return;
            }
            xVar.d(t3.toString(), null, this.f13639a);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class m extends v<w.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f13640a = new m();

        @Override // dw.v
        public final void a(x xVar, w.b bVar) {
            w.b bVar2 = bVar;
            if (bVar2 != null) {
                w.a aVar = xVar.f13657i;
                aVar.getClass();
                aVar.f24717c.add(bVar2);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class n extends v<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13641a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13642b;

        public n(int i6, Method method) {
            this.f13641a = method;
            this.f13642b = i6;
        }

        @Override // dw.v
        public final void a(x xVar, Object obj) {
            if (obj != null) {
                xVar.f13652c = obj.toString();
                return;
            }
            int i6 = this.f13642b;
            throw e0.j(this.f13641a, i6, "@Url parameter is null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes2.dex */
    public static final class o<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f13643a;

        public o(Class<T> cls) {
            this.f13643a = cls;
        }

        @Override // dw.v
        public final void a(x xVar, T t3) {
            xVar.f13654e.d(this.f13643a, t3);
        }
    }

    public abstract void a(x xVar, T t3);
}
