package at;

import at.n0;
import at.o;
import dt.n;
import gt.v0;
import gu.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mt.c;
import pu.k;
import zt.a;
/* compiled from: KClassImpl.kt */
/* loaded from: classes2.dex */
public final class l<T> extends o implements ys.d<T>, l0 {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f3540x = 0;

    /* renamed from: v  reason: collision with root package name */
    public final Class<T> f3541v;

    /* renamed from: w  reason: collision with root package name */
    public final n0.b<l<T>.a> f3542w;

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes2.dex */
    public final class a extends o.a {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ ys.m<Object>[] f3543l = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "annotations", "getAnnotations()Ljava/util/List;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: c  reason: collision with root package name */
        public final n0.a f3544c;

        /* renamed from: d  reason: collision with root package name */
        public final n0.a f3545d;

        /* renamed from: e  reason: collision with root package name */
        public final n0.a f3546e;
        public final n0.a f;

        /* renamed from: g  reason: collision with root package name */
        public final n0.a f3547g;

        /* renamed from: h  reason: collision with root package name */
        public final n0.a f3548h;

        /* renamed from: i  reason: collision with root package name */
        public final n0.a f3549i;

        /* renamed from: j  reason: collision with root package name */
        public final n0.a f3550j;

        /* renamed from: k  reason: collision with root package name */
        public final n0.a f3551k;

        /* compiled from: KClassImpl.kt */
        /* renamed from: at.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0057a extends kotlin.jvm.internal.k implements ss.a<List<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3552u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0057a(l<T>.a aVar) {
                super(0);
                this.f3552u = aVar;
            }

            @Override // ss.a
            public final List<? extends at.e<?>> invoke() {
                l<T>.a aVar = this.f3552u;
                aVar.getClass();
                ys.m<Object>[] mVarArr = a.f3543l;
                ys.m<Object> mVar = mVarArr[14];
                Object invoke = aVar.f3550j.invoke();
                kotlin.jvm.internal.i.f(invoke, "<get-allNonStaticMembers>(...)");
                ys.m<Object> mVar2 = mVarArr[15];
                Object invoke2 = aVar.f3551k.invoke();
                kotlin.jvm.internal.i.f(invoke2, "<get-allStaticMembers>(...)");
                return is.u.u2((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.a<List<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3553u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l<T>.a aVar) {
                super(0);
                this.f3553u = aVar;
            }

            @Override // ss.a
            public final List<? extends at.e<?>> invoke() {
                l<T>.a aVar = this.f3553u;
                aVar.getClass();
                ys.m<Object>[] mVarArr = a.f3543l;
                ys.m<Object> mVar = mVarArr[10];
                Object invoke = aVar.f.invoke();
                kotlin.jvm.internal.i.f(invoke, "<get-declaredNonStaticMembers>(...)");
                ys.m<Object> mVar2 = mVarArr[12];
                Object invoke2 = aVar.f3548h.invoke();
                kotlin.jvm.internal.i.f(invoke2, "<get-inheritedNonStaticMembers>(...)");
                return is.u.u2((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class c extends kotlin.jvm.internal.k implements ss.a<List<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3554u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(l<T>.a aVar) {
                super(0);
                this.f3554u = aVar;
            }

            @Override // ss.a
            public final List<? extends at.e<?>> invoke() {
                l<T>.a aVar = this.f3554u;
                aVar.getClass();
                ys.m<Object>[] mVarArr = a.f3543l;
                ys.m<Object> mVar = mVarArr[11];
                Object invoke = aVar.f3547g.invoke();
                kotlin.jvm.internal.i.f(invoke, "<get-declaredStaticMembers>(...)");
                ys.m<Object> mVar2 = mVarArr[13];
                Object invoke2 = aVar.f3549i.invoke();
                kotlin.jvm.internal.i.f(invoke2, "<get-inheritedStaticMembers>(...)");
                return is.u.u2((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class d extends kotlin.jvm.internal.k implements ss.a<List<? extends Annotation>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3555u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(l<T>.a aVar) {
                super(0);
                this.f3555u = aVar;
            }

            @Override // ss.a
            public final List<? extends Annotation> invoke() {
                return t0.d(this.f3555u.a());
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class e extends kotlin.jvm.internal.k implements ss.a<List<? extends ys.g<? extends T>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3556u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(l<T> lVar) {
                super(0);
                this.f3556u = lVar;
            }

            @Override // ss.a
            public final Object invoke() {
                l<T> lVar = this.f3556u;
                Collection<gt.i> o10 = lVar.o();
                ArrayList arrayList = new ArrayList(is.i.H1(o10, 10));
                for (gt.i iVar : o10) {
                    arrayList.add(new t(lVar, iVar));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class f extends kotlin.jvm.internal.k implements ss.a<List<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3557u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(l<T>.a aVar) {
                super(0);
                this.f3557u = aVar;
            }

            @Override // ss.a
            public final List<? extends at.e<?>> invoke() {
                l<T>.a aVar = this.f3557u;
                aVar.getClass();
                ys.m<Object>[] mVarArr = a.f3543l;
                ys.m<Object> mVar = mVarArr[10];
                Object invoke = aVar.f.invoke();
                kotlin.jvm.internal.i.f(invoke, "<get-declaredNonStaticMembers>(...)");
                ys.m<Object> mVar2 = mVarArr[11];
                Object invoke2 = aVar.f3547g.invoke();
                kotlin.jvm.internal.i.f(invoke2, "<get-declaredStaticMembers>(...)");
                return is.u.u2((Collection) invoke2, (Collection) invoke);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class g extends kotlin.jvm.internal.k implements ss.a<Collection<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3558u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(l<T> lVar) {
                super(0);
                this.f3558u = lVar;
            }

            @Override // ss.a
            public final Collection<? extends at.e<?>> invoke() {
                l<T> lVar = this.f3558u;
                return lVar.r(lVar.A(), 1);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class h extends kotlin.jvm.internal.k implements ss.a<Collection<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3559u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(l<T> lVar) {
                super(0);
                this.f3559u = lVar;
            }

            @Override // ss.a
            public final Collection<? extends at.e<?>> invoke() {
                l<T> lVar = this.f3559u;
                return lVar.r(lVar.B(), 1);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class i extends kotlin.jvm.internal.k implements ss.a<gt.e> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3560u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(l<T> lVar) {
                super(0);
                this.f3560u = lVar;
            }

            @Override // ss.a
            public final gt.e invoke() {
                gt.e a10;
                a.EnumC0686a enumC0686a;
                int i6;
                zt.a aVar;
                int i10 = l.f3540x;
                l<T> lVar = this.f3560u;
                fu.b y10 = lVar.y();
                l<T>.a invoke = lVar.f3542w.invoke();
                invoke.getClass();
                ys.m<Object> mVar = o.a.f3588b[0];
                Object invoke2 = invoke.f3589a.invoke();
                kotlin.jvm.internal.i.f(invoke2, "<get-moduleData>(...)");
                boolean z10 = y10.f15920c;
                su.l lVar2 = ((mt.f) invoke2).f25742a;
                if (z10) {
                    a10 = lVar2.b(y10);
                } else {
                    a10 = gt.t.a(lVar2.f32045b, y10);
                }
                if (a10 == null) {
                    Class<T> cls = lVar.f3541v;
                    mt.c a11 = c.a.a(cls);
                    if (a11 != null && (aVar = a11.f25738b) != null) {
                        enumC0686a = aVar.f39838a;
                    } else {
                        enumC0686a = null;
                    }
                    if (enumC0686a == null) {
                        i6 = -1;
                    } else {
                        i6 = b.f3574a[enumC0686a.ordinal()];
                    }
                    switch (i6) {
                        case -1:
                        case 6:
                            throw new hs.e(defpackage.b.l("Unresolved class: ", cls), 2);
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                        case 2:
                        case 3:
                            throw new UnsupportedOperationException(defpackage.b.l("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: ", cls));
                        case 4:
                            throw new UnsupportedOperationException(defpackage.b.l("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: ", cls));
                        case 5:
                            throw new hs.e("Unknown class: " + cls + " (kind = " + enumC0686a + ')', 2);
                    }
                }
                return a10;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class j extends kotlin.jvm.internal.k implements ss.a<Collection<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3561u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(l<T> lVar) {
                super(0);
                this.f3561u = lVar;
            }

            @Override // ss.a
            public final Collection<? extends at.e<?>> invoke() {
                l<T> lVar = this.f3561u;
                return lVar.r(lVar.A(), 2);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class k extends kotlin.jvm.internal.k implements ss.a<Collection<? extends at.e<?>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3562u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(l<T> lVar) {
                super(0);
                this.f3562u = lVar;
            }

            @Override // ss.a
            public final Collection<? extends at.e<?>> invoke() {
                l<T> lVar = this.f3562u;
                return lVar.r(lVar.B(), 2);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: at.l$a$l  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0058l extends kotlin.jvm.internal.k implements ss.a<List<? extends l<? extends Object>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3563u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0058l(l<T>.a aVar) {
                super(0);
                this.f3563u = aVar;
            }

            @Override // ss.a
            public final List<? extends l<? extends Object>> invoke() {
                gt.e eVar;
                Class<?> cls;
                l lVar;
                pu.i A0 = this.f3563u.a().A0();
                kotlin.jvm.internal.i.f(A0, "descriptor.unsubstitutedInnerClassesScope");
                Collection a10 = k.a.a(A0, null, 3);
                ArrayList arrayList = new ArrayList();
                for (T t3 : a10) {
                    if (!iu.g.m((gt.j) t3)) {
                        arrayList.add(t3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    gt.j jVar = (gt.j) it.next();
                    if (jVar instanceof gt.e) {
                        eVar = (gt.e) jVar;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        cls = t0.j(eVar);
                    } else {
                        cls = null;
                    }
                    if (cls != null) {
                        lVar = new l(cls);
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList2.add(lVar);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class m extends kotlin.jvm.internal.k implements ss.a<T> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3564u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ l<T> f3565v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(l<T>.a aVar, l<T> lVar) {
                super(0);
                this.f3564u = aVar;
                this.f3565v = lVar;
            }

            @Override // ss.a
            public final T invoke() {
                Field declaredField;
                gt.e a10 = this.f3564u.a();
                if (a10.j() != 6) {
                    return null;
                }
                boolean w10 = a10.w();
                l<T> lVar = this.f3565v;
                if (w10) {
                    LinkedHashSet linkedHashSet = dt.c.f13354a;
                    if (!kotlin.jvm.internal.h.J(a10)) {
                        declaredField = lVar.f3541v.getEnclosingClass().getDeclaredField(a10.getName().f());
                        T t3 = (T) declaredField.get(null);
                        kotlin.jvm.internal.i.e(t3, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                        return t3;
                    }
                }
                declaredField = lVar.f3541v.getDeclaredField("INSTANCE");
                T t32 = (T) declaredField.get(null);
                kotlin.jvm.internal.i.e(t32, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t32;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class n extends kotlin.jvm.internal.k implements ss.a<String> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3566u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(l<T> lVar) {
                super(0);
                this.f3566u = lVar;
            }

            @Override // ss.a
            public final String invoke() {
                l<T> lVar = this.f3566u;
                if (lVar.f3541v.isAnonymousClass()) {
                    return null;
                }
                fu.b y10 = lVar.y();
                if (y10.f15920c) {
                    return null;
                }
                return y10.b().b();
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class o extends kotlin.jvm.internal.k implements ss.a<List<? extends l<? extends T>>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3567u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(l<T>.a aVar) {
                super(0);
                this.f3567u = aVar;
            }

            @Override // ss.a
            public final Object invoke() {
                l lVar;
                Collection<gt.e> K = this.f3567u.a().K();
                kotlin.jvm.internal.i.f(K, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (gt.e eVar : K) {
                    kotlin.jvm.internal.i.e(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> j10 = t0.j(eVar);
                    if (j10 != null) {
                        lVar = new l(j10);
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class p extends kotlin.jvm.internal.k implements ss.a<String> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T> f3568u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3569v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(a aVar, l lVar) {
                super(0);
                this.f3568u = lVar;
                this.f3569v = aVar;
            }

            @Override // ss.a
            public final String invoke() {
                l<T> lVar = this.f3568u;
                if (lVar.f3541v.isAnonymousClass()) {
                    return null;
                }
                fu.b y10 = lVar.y();
                if (y10.f15920c) {
                    this.f3569v.getClass();
                    Class<T> cls = lVar.f3541v;
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        return gv.r.c1(simpleName, enclosingMethod.getName() + '$', simpleName);
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        return gv.r.c1(simpleName, enclosingConstructor.getName() + '$', simpleName);
                    }
                    return gv.r.d1(simpleName, '$');
                }
                String f = y10.j().f();
                kotlin.jvm.internal.i.f(f, "classId.shortClassName.asString()");
                return f;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class q extends kotlin.jvm.internal.k implements ss.a<List<? extends j0>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3570u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ l<T> f3571v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(l<T>.a aVar, l<T> lVar) {
                super(0);
                this.f3570u = aVar;
                this.f3571v = lVar;
            }

            @Override // ss.a
            public final List<? extends j0> invoke() {
                boolean z10;
                l<T>.a aVar = this.f3570u;
                Collection<wu.b0> c10 = aVar.a().l().c();
                kotlin.jvm.internal.i.f(c10, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(c10.size());
                for (wu.b0 kotlinType : c10) {
                    kotlin.jvm.internal.i.f(kotlinType, "kotlinType");
                    arrayList.add(new j0(kotlinType, new at.m(kotlinType, aVar, this.f3571v)));
                }
                if (!dt.j.I(aVar.a())) {
                    boolean z11 = true;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int j10 = iu.g.c(((j0) it.next()).f3527u).j();
                            defpackage.c.y(j10, "getClassDescriptorForType(it.type).kind");
                            if (j10 != 2 && j10 != 5) {
                                z10 = false;
                                continue;
                            } else {
                                z10 = true;
                                continue;
                            }
                            if (!z10) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    if (z11) {
                        wu.i0 f = mu.a.e(aVar.a()).f();
                        kotlin.jvm.internal.i.f(f, "descriptor.builtIns.anyType");
                        arrayList.add(new j0(f, at.n.f3581u));
                    }
                }
                return ca.a.A(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* loaded from: classes2.dex */
        public static final class r extends kotlin.jvm.internal.k implements ss.a<List<? extends k0>> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ l<T>.a f3572u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ l<T> f3573v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(l<T>.a aVar, l<T> lVar) {
                super(0);
                this.f3572u = aVar;
                this.f3573v = lVar;
            }

            @Override // ss.a
            public final List<? extends k0> invoke() {
                List<v0> t3 = this.f3572u.a().t();
                kotlin.jvm.internal.i.f(t3, "descriptor.declaredTypeParameters");
                ArrayList arrayList = new ArrayList(is.i.H1(t3, 10));
                for (v0 descriptor : t3) {
                    kotlin.jvm.internal.i.f(descriptor, "descriptor");
                    arrayList.add(new k0(this.f3573v, descriptor));
                }
                return arrayList;
            }
        }

        public a(l lVar) {
            super(lVar);
            this.f3544c = n0.c(new i(lVar));
            n0.c(new d(this));
            this.f3545d = n0.c(new p(this, lVar));
            this.f3546e = n0.c(new n(lVar));
            n0.c(new e(lVar));
            n0.c(new C0058l(this));
            new m(this, lVar);
            n0.c(new r(this, lVar));
            n0.c(new q(this, lVar));
            n0.c(new o(this));
            this.f = n0.c(new g(lVar));
            this.f3547g = n0.c(new h(lVar));
            this.f3548h = n0.c(new j(lVar));
            this.f3549i = n0.c(new k(lVar));
            this.f3550j = n0.c(new b(this));
            this.f3551k = n0.c(new c(this));
            n0.c(new f(this));
            n0.c(new C0057a(this));
        }

        public final gt.e a() {
            ys.m<Object> mVar = f3543l[0];
            Object invoke = this.f3544c.invoke();
            kotlin.jvm.internal.i.f(invoke, "<get-descriptor>(...)");
            return (gt.e) invoke;
        }
    }

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3574a;

        static {
            int[] iArr = new int[a.EnumC0686a.values().length];
            try {
                LinkedHashMap linkedHashMap = a.EnumC0686a.f39844v;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkedHashMap linkedHashMap2 = a.EnumC0686a.f39844v;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LinkedHashMap linkedHashMap3 = a.EnumC0686a.f39844v;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LinkedHashMap linkedHashMap4 = a.EnumC0686a.f39844v;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LinkedHashMap linkedHashMap5 = a.EnumC0686a.f39844v;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LinkedHashMap linkedHashMap6 = a.EnumC0686a.f39844v;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3574a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<l<T>.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ l<T> f3575u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l<T> lVar) {
            super(0);
            this.f3575u = lVar;
        }

        @Override // ss.a
        public final Object invoke() {
            return new a(this.f3575u);
        }
    }

    /* compiled from: KClassImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.f implements ss.p<su.y, au.m, gt.k0> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f3576u = new d();

        public d() {
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

    public l(Class<T> jClass) {
        kotlin.jvm.internal.i.g(jClass, "jClass");
        this.f3541v = jClass;
        this.f3542w = n0.b(new c(this));
    }

    public final pu.i A() {
        return z().r().p();
    }

    public final pu.i B() {
        pu.i S = z().S();
        kotlin.jvm.internal.i.f(S, "descriptor.staticScope");
        return S;
    }

    @Override // ys.d
    public final String c() {
        l<T>.a invoke = this.f3542w.invoke();
        invoke.getClass();
        ys.m<Object> mVar = a.f3543l[3];
        return (String) invoke.f3546e.invoke();
    }

    @Override // kotlin.jvm.internal.b
    public final Class<T> e() {
        return this.f3541v;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l) && kotlin.jvm.internal.i.b(sp.b.D(this), sp.b.D((ys.d) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return sp.b.D(this).hashCode();
    }

    @Override // ys.d
    public final String i() {
        l<T>.a invoke = this.f3542w.invoke();
        invoke.getClass();
        ys.m<Object> mVar = a.f3543l[2];
        return (String) invoke.f3545d.invoke();
    }

    @Override // at.o
    public final Collection<gt.i> o() {
        gt.e z10 = z();
        if (z10.j() != 2 && z10.j() != 6) {
            Collection<gt.d> y10 = z10.y();
            kotlin.jvm.internal.i.f(y10, "descriptor.constructors");
            return y10;
        }
        return is.w.f20676u;
    }

    @Override // at.o
    public final Collection<gt.u> p(fu.e eVar) {
        pu.i A = A();
        ot.c cVar = ot.c.FROM_REFLECTION;
        return is.u.u2(B().a(eVar, cVar), A.a(eVar, cVar));
    }

    @Override // at.o
    public final gt.k0 q(int i6) {
        uu.d dVar;
        Class<?> declaringClass;
        Class<T> cls = this.f3541v;
        if (kotlin.jvm.internal.i.b(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            ys.d a10 = kotlin.jvm.internal.y.a(declaringClass);
            kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((l) a10).q(i6);
        }
        gt.e z10 = z();
        if (z10 instanceof uu.d) {
            dVar = (uu.d) z10;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        g.e<au.b, List<au.m>> classLocalVariable = du.a.f13444j;
        kotlin.jvm.internal.i.f(classLocalVariable, "classLocalVariable");
        au.m mVar = (au.m) kotlin.jvm.internal.h.x(dVar.f34533y, classLocalVariable, i6);
        if (mVar == null) {
            return null;
        }
        Class<T> cls2 = this.f3541v;
        j7.k kVar = dVar.F;
        return (gt.k0) t0.f(cls2, mVar, (cu.c) kVar.f21733v, (cu.e) kVar.f21735x, dVar.f34534z, d.f3576u);
    }

    @Override // at.o
    public final Collection<gt.k0> t(fu.e eVar) {
        pu.i A = A();
        ot.c cVar = ot.c.FROM_REFLECTION;
        return is.u.u2(B().c(eVar, cVar), A.c(eVar, cVar));
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder("class ");
        fu.b y10 = y();
        fu.c h10 = y10.h();
        kotlin.jvm.internal.i.f(h10, "classId.packageFqName");
        if (h10.d()) {
            concat = "";
        } else {
            concat = h10.b().concat(".");
        }
        String E0 = gv.n.E0(y10.i().b(), '.', '$');
        sb2.append(concat + E0);
        return sb2.toString();
    }

    public final fu.b y() {
        fu.b bVar = r0.f3597a;
        Class<T> klass = this.f3541v;
        kotlin.jvm.internal.i.g(klass, "klass");
        dt.k kVar = null;
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.i.f(componentType, "klass.componentType");
            if (componentType.isPrimitive()) {
                kVar = nu.c.f(componentType.getSimpleName()).i();
            }
            if (kVar != null) {
                return new fu.b(dt.n.f13390j, kVar.f13371v);
            }
            return fu.b.l(n.a.f13402g.h());
        } else if (kotlin.jvm.internal.i.b(klass, Void.TYPE)) {
            return r0.f3597a;
        } else {
            if (klass.isPrimitive()) {
                kVar = nu.c.f(klass.getSimpleName()).i();
            }
            if (kVar != null) {
                return new fu.b(dt.n.f13390j, kVar.f13370u);
            }
            fu.b a10 = nt.d.a(klass);
            if (!a10.f15920c) {
                String str = ft.c.f15851a;
                fu.c b10 = a10.b();
                kotlin.jvm.internal.i.f(b10, "classId.asSingleFqName()");
                fu.b f = ft.c.f(b10);
                if (f != null) {
                    return f;
                }
                return a10;
            }
            return a10;
        }
    }

    public final gt.e z() {
        return this.f3542w.invoke().a();
    }
}
