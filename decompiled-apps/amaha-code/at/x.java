package at;

import at.n0;
import at.o;
import gu.g;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mt.c;
import pu.b;
import pu.i;
import zt.a;
/* compiled from: KPackageImpl.kt */
/* loaded from: classes2.dex */
public final class x extends o {

    /* renamed from: v  reason: collision with root package name */
    public final Class<?> f3611v;

    /* renamed from: w  reason: collision with root package name */
    public final n0.b<a> f3612w;

    /* compiled from: KPackageImpl.kt */
    /* loaded from: classes2.dex */
    public final class a extends o.a {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ ys.m<Object>[] f3613g = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: c  reason: collision with root package name */
        public final n0.a f3614c;

        /* renamed from: d  reason: collision with root package name */
        public final n0.a f3615d;

        /* renamed from: e  reason: collision with root package name */
        public final n0.b f3616e;
        public final n0.b f;

        /* compiled from: KPackageImpl.kt */
        /* renamed from: at.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0060a extends kotlin.jvm.internal.k implements ss.a<mt.c> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ x f3617u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0060a(x xVar) {
                super(0);
                this.f3617u = xVar;
            }

            @Override // ss.a
            public final mt.c invoke() {
                return c.a.a(this.f3617u.f3611v);
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.a<Collection<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ x f3618u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f3619v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, x xVar) {
                super(0);
                this.f3618u = xVar;
                this.f3619v = aVar;
            }

            @Override // ss.a
            public final Collection<? extends at.e<?>> invoke() {
                a aVar = this.f3619v;
                aVar.getClass();
                ys.m<Object> mVar = a.f3613g[1];
                Object invoke = aVar.f3615d.invoke();
                kotlin.jvm.internal.i.f(invoke, "<get-scope>(...)");
                return this.f3618u.r((pu.i) invoke, 1);
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes2.dex */
        public static final class c extends kotlin.jvm.internal.k implements ss.a<hs.j<? extends eu.f, ? extends au.k, ? extends eu.e>> {
            public c() {
                super(0);
            }

            @Override // ss.a
            public final hs.j<? extends eu.f, ? extends au.k, ? extends eu.e> invoke() {
                zt.a aVar;
                String[] strArr;
                String[] strArr2;
                mt.c a10 = a.a(a.this);
                if (a10 != null && (aVar = a10.f25738b) != null && (strArr = aVar.f39840c) != null && (strArr2 = aVar.f39842e) != null) {
                    hs.f<eu.f, au.k> h10 = eu.h.h(strArr, strArr2);
                    return new hs.j<>(h10.f19464u, h10.f19465v, aVar.f39839b);
                }
                return null;
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes2.dex */
        public static final class d extends kotlin.jvm.internal.k implements ss.a<Class<?>> {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ x f3622v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(x xVar) {
                super(0);
                this.f3622v = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
            @Override // ss.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Class<?> invoke() {
                String str;
                zt.a aVar;
                boolean z10;
                mt.c a10 = a.a(a.this);
                boolean z11 = true;
                if (a10 != null && (aVar = a10.f25738b) != null) {
                    if (aVar.f39838a == a.EnumC0686a.MULTIFILE_CLASS_PART) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        str = aVar.f;
                        if (str != null) {
                            return null;
                        }
                        if (str.length() <= 0) {
                            z11 = false;
                        }
                        if (!z11) {
                            return null;
                        }
                        return this.f3622v.f3611v.getClassLoader().loadClass(gv.n.E0(str, '/', '.'));
                    }
                }
                str = null;
                if (str != null) {
                }
            }
        }

        /* compiled from: KPackageImpl.kt */
        /* loaded from: classes2.dex */
        public static final class e extends kotlin.jvm.internal.k implements ss.a<pu.i> {
            public e() {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
            @Override // ss.a
            public final pu.i invoke() {
                ?? O0;
                String[] strArr;
                a aVar = a.this;
                mt.c a10 = a.a(aVar);
                if (a10 != null) {
                    boolean z10 = false;
                    ys.m<Object> mVar = o.a.f3588b[0];
                    Object invoke = aVar.f3589a.invoke();
                    kotlin.jvm.internal.i.f(invoke, "<get-moduleData>(...)");
                    s1.s sVar = ((mt.f) invoke).f25743b;
                    sVar.getClass();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) sVar.f31226x;
                    fu.b g5 = a10.g();
                    Object obj = concurrentHashMap.get(g5);
                    if (obj == null) {
                        fu.c h10 = a10.g().h();
                        kotlin.jvm.internal.i.f(h10, "fileClass.classId.packageFqName");
                        zt.a aVar2 = a10.f25738b;
                        a.EnumC0686a enumC0686a = aVar2.f39838a;
                        a.EnumC0686a enumC0686a2 = a.EnumC0686a.MULTIFILE_CLASS;
                        if (enumC0686a == enumC0686a2) {
                            if (enumC0686a == enumC0686a2) {
                                z10 = true;
                            }
                            List<String> list = null;
                            if (z10) {
                                strArr = aVar2.f39840c;
                            } else {
                                strArr = null;
                            }
                            if (strArr != null) {
                                list = is.i.G1(strArr);
                            }
                            if (list == null) {
                                list = is.w.f20676u;
                            }
                            O0 = new ArrayList();
                            for (String str : list) {
                                yt.o u10 = kotlin.jvm.internal.h.u((mt.d) sVar.f31225w, fu.b.l(new fu.c(nu.b.d(str).f26836a.replace('/', '.'))));
                                if (u10 != null) {
                                    O0.add(u10);
                                }
                            }
                        } else {
                            O0 = ca.a.O0(a10);
                        }
                        kt.r rVar = new kt.r(((yt.j) sVar.f31224v).c().f32045b, h10);
                        ArrayList arrayList = new ArrayList();
                        for (yt.o oVar : O0) {
                            uu.j a11 = ((yt.j) sVar.f31224v).a(rVar, oVar);
                            if (a11 != null) {
                                arrayList.add(a11);
                            }
                        }
                        obj = b.a.a("package " + h10 + " (" + a10 + ')', is.u.I2(arrayList));
                        Object putIfAbsent = concurrentHashMap.putIfAbsent(g5, obj);
                        if (putIfAbsent != null) {
                            obj = putIfAbsent;
                        }
                    }
                    kotlin.jvm.internal.i.f(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                    return (pu.i) obj;
                }
                return i.b.f29008b;
            }
        }

        public a(x xVar) {
            super(xVar);
            this.f3614c = n0.c(new C0060a(xVar));
            this.f3615d = n0.c(new e());
            this.f3616e = new n0.b(new d(xVar));
            this.f = new n0.b(new c());
            n0.c(new b(this, xVar));
        }

        public static final mt.c a(a aVar) {
            aVar.getClass();
            ys.m<Object> mVar = f3613g[0];
            return (mt.c) aVar.f3614c.invoke();
        }
    }

    /* compiled from: KPackageImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.f implements ss.p<su.y, au.m, gt.k0> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f3624u = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return kotlin.jvm.internal.y.a(su.y.class);
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // ss.p
        public final gt.k0 invoke(su.y yVar, au.m mVar) {
            su.y p02 = yVar;
            au.m p12 = mVar;
            kotlin.jvm.internal.i.g(p02, "p0");
            kotlin.jvm.internal.i.g(p12, "p1");
            return p02.f(p12);
        }
    }

    public x(Class jClass) {
        kotlin.jvm.internal.i.g(jClass, "jClass");
        this.f3611v = jClass;
        this.f3612w = new n0.b<>(new y(this));
    }

    @Override // kotlin.jvm.internal.b
    public final Class<?> e() {
        return this.f3611v;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            if (kotlin.jvm.internal.i.b(this.f3611v, ((x) obj).f3611v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3611v.hashCode();
    }

    @Override // at.o
    public final Collection<gt.i> o() {
        return is.w.f20676u;
    }

    @Override // at.o
    public final Collection<gt.u> p(fu.e eVar) {
        a invoke = this.f3612w.invoke();
        invoke.getClass();
        ys.m<Object> mVar = a.f3613g[1];
        Object invoke2 = invoke.f3615d.invoke();
        kotlin.jvm.internal.i.f(invoke2, "<get-scope>(...)");
        return ((pu.i) invoke2).a(eVar, ot.c.FROM_REFLECTION);
    }

    @Override // at.o
    public final gt.k0 q(int i6) {
        a invoke = this.f3612w.invoke();
        invoke.getClass();
        ys.m<Object> mVar = a.f3613g[3];
        hs.j jVar = (hs.j) invoke.f.invoke();
        if (jVar != null) {
            eu.f fVar = (eu.f) jVar.f19473u;
            au.k kVar = (au.k) jVar.f19474v;
            eu.e eVar = (eu.e) jVar.f19475w;
            g.e<au.k, List<au.m>> packageLocalVariable = du.a.f13448n;
            kotlin.jvm.internal.i.f(packageLocalVariable, "packageLocalVariable");
            au.m mVar2 = (au.m) kotlin.jvm.internal.h.x(kVar, packageLocalVariable, i6);
            if (mVar2 != null) {
                Class<?> cls = this.f3611v;
                au.s sVar = kVar.A;
                kotlin.jvm.internal.i.f(sVar, "packageProto.typeTable");
                return (gt.k0) t0.f(cls, mVar2, fVar, new cu.e(sVar), eVar, b.f3624u);
            }
        }
        return null;
    }

    @Override // at.o
    public final Class<?> s() {
        a invoke = this.f3612w.invoke();
        invoke.getClass();
        ys.m<Object> mVar = a.f3613g[2];
        Class<?> cls = (Class) invoke.f3616e.invoke();
        if (cls == null) {
            return this.f3611v;
        }
        return cls;
    }

    @Override // at.o
    public final Collection<gt.k0> t(fu.e eVar) {
        a invoke = this.f3612w.invoke();
        invoke.getClass();
        ys.m<Object> mVar = a.f3613g[1];
        Object invoke2 = invoke.f3615d.invoke();
        kotlin.jvm.internal.i.f(invoke2, "<get-scope>(...)");
        return ((pu.i) invoke2).c(eVar, ot.c.FROM_REFLECTION);
    }

    public final String toString() {
        return "file class " + nt.d.a(this.f3611v).b();
    }
}
