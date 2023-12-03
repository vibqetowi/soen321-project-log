package dw;

import dw.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lv.f0;
/* compiled from: BuiltInConverters.java */
/* loaded from: classes2.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13526a = true;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: dw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0208a implements dw.f<lv.e0, lv.e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0208a f13527a = new C0208a();

        @Override // dw.f
        public final lv.e0 a(lv.e0 e0Var) {
            lv.e0 e0Var2 = e0Var;
            try {
                zv.e eVar = new zv.e();
                e0Var2.g().S(eVar);
                return new f0(e0Var2.e(), e0Var2.a(), eVar);
            } finally {
                e0Var2.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes2.dex */
    public static final class b implements dw.f<lv.c0, lv.c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13528a = new b();

        @Override // dw.f
        public final lv.c0 a(lv.c0 c0Var) {
            return c0Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes2.dex */
    public static final class c implements dw.f<lv.e0, lv.e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13529a = new c();

        @Override // dw.f
        public final lv.e0 a(lv.e0 e0Var) {
            return e0Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes2.dex */
    public static final class d implements dw.f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13530a = new d();

        @Override // dw.f
        public final String a(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes2.dex */
    public static final class e implements dw.f<lv.e0, hs.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13531a = new e();

        @Override // dw.f
        public final hs.k a(lv.e0 e0Var) {
            e0Var.close();
            return hs.k.f19476a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes2.dex */
    public static final class f implements dw.f<lv.e0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f13532a = new f();

        @Override // dw.f
        public final Void a(lv.e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    @Override // dw.f.a
    public final dw.f a(Type type) {
        if (lv.c0.class.isAssignableFrom(e0.e(type))) {
            return b.f13528a;
        }
        return null;
    }

    @Override // dw.f.a
    public final dw.f<lv.e0, ?> b(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (type == lv.e0.class) {
            if (e0.h(annotationArr, fw.w.class)) {
                return c.f13529a;
            }
            return C0208a.f13527a;
        } else if (type == Void.class) {
            return f.f13532a;
        } else {
            if (this.f13526a && type == hs.k.class) {
                try {
                    return e.f13531a;
                } catch (NoClassDefFoundError unused) {
                    this.f13526a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
