package at;

import at.n0;
import gt.v0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.reflect.full.IllegalCallableAccessException;
/* compiled from: KCallableImpl.kt */
/* loaded from: classes2.dex */
public abstract class e<R> implements ys.c<R>, l0 {

    /* renamed from: u  reason: collision with root package name */
    public final n0.a<List<Annotation>> f3495u = n0.c(new a(this));

    /* renamed from: v  reason: collision with root package name */
    public final n0.a<ArrayList<ys.j>> f3496v = n0.c(new b(this));

    /* renamed from: w  reason: collision with root package name */
    public final n0.a<j0> f3497w = n0.c(new c(this));

    /* renamed from: x  reason: collision with root package name */
    public final n0.a<List<k0>> f3498x = n0.c(new d(this));

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends Annotation>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ e<R> f3499u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e<? extends R> eVar) {
            super(0);
            this.f3499u = eVar;
        }

        @Override // ss.a
        public final List<? extends Annotation> invoke() {
            return t0.d(this.f3499u.t());
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<ArrayList<ys.j>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ e<R> f3500u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e<? extends R> eVar) {
            super(0);
            this.f3500u = eVar;
        }

        @Override // ss.a
        public final ArrayList<ys.j> invoke() {
            int i6;
            e<R> eVar = this.f3500u;
            gt.b t3 = eVar.t();
            ArrayList<ys.j> arrayList = new ArrayList<>();
            int i10 = 0;
            if (!eVar.w()) {
                gt.n0 g5 = t0.g(t3);
                if (g5 != null) {
                    arrayList.add(new b0(eVar, 0, 1, new f(g5)));
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                gt.n0 k02 = t3.k0();
                if (k02 != null) {
                    arrayList.add(new b0(eVar, i6, 2, new g(k02)));
                    i6++;
                }
            } else {
                i6 = 0;
            }
            int size = t3.i().size();
            while (i10 < size) {
                arrayList.add(new b0(eVar, i6, 3, new h(t3, i10)));
                i10++;
                i6++;
            }
            if (eVar.v() && (t3 instanceof rt.a) && arrayList.size() > 1) {
                is.p.P1(arrayList, new i());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<j0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ e<R> f3501u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e<? extends R> eVar) {
            super(0);
            this.f3501u = eVar;
        }

        @Override // ss.a
        public final j0 invoke() {
            e<R> eVar = this.f3501u;
            wu.b0 returnType = eVar.t().getReturnType();
            kotlin.jvm.internal.i.d(returnType);
            return new j0(returnType, new j(eVar));
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<List<? extends k0>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ e<R> f3502u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e<? extends R> eVar) {
            super(0);
            this.f3502u = eVar;
        }

        @Override // ss.a
        public final List<? extends k0> invoke() {
            e<R> eVar = this.f3502u;
            List<v0> typeParameters = eVar.t().getTypeParameters();
            kotlin.jvm.internal.i.f(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList = new ArrayList(is.i.H1(typeParameters, 10));
            for (v0 descriptor : typeParameters) {
                kotlin.jvm.internal.i.f(descriptor, "descriptor");
                arrayList.add(new k0(eVar, descriptor));
            }
            return arrayList;
        }
    }

    public static Object m(ys.n nVar) {
        Class C = sp.b.C(kotlin.jvm.internal.h.z(nVar));
        if (C.isArray()) {
            Object newInstance = Array.newInstance(C.getComponentType(), 0);
            kotlin.jvm.internal.i.f(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new hs.e("Cannot instantiate the default empty array of type " + C.getSimpleName() + ", because it is not an array type", 2);
    }

    @Override // ys.c
    public final R call(Object... args) {
        kotlin.jvm.internal.i.g(args, "args");
        try {
            return (R) o().call(args);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }

    @Override // ys.c
    public final R callBy(Map<ys.j, ? extends Object> args) {
        boolean z10;
        Object e10;
        Object m10;
        kotlin.jvm.internal.i.g(args, "args");
        if (v()) {
            List<ys.j> parameters = getParameters();
            ArrayList arrayList = new ArrayList(is.i.H1(parameters, 10));
            for (ys.j jVar : parameters) {
                if (args.containsKey(jVar)) {
                    m10 = args.get(jVar);
                    if (m10 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + jVar + ')');
                    }
                } else if (jVar.l()) {
                    m10 = null;
                } else if (jVar.b()) {
                    m10 = m(jVar.a());
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
                }
                arrayList.add(m10);
            }
            bt.e<?> s10 = s();
            if (s10 != null) {
                try {
                    Object[] array = arrayList.toArray(new Object[0]);
                    kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return (R) s10.call(array);
                } catch (IllegalAccessException e11) {
                    throw new IllegalCallableAccessException(e11);
                }
            }
            throw new hs.e("This callable does not support a default call: " + t(), 2);
        }
        List<ys.j> parameters2 = getParameters();
        ArrayList arrayList2 = new ArrayList(parameters2.size());
        ArrayList arrayList3 = new ArrayList(1);
        boolean z11 = false;
        int i6 = 0;
        int i10 = 0;
        for (ys.j jVar2 : parameters2) {
            if (i6 != 0 && i6 % 32 == 0) {
                arrayList3.add(Integer.valueOf(i10));
                i10 = 0;
            }
            if (args.containsKey(jVar2)) {
                arrayList2.add(args.get(jVar2));
            } else if (jVar2.l()) {
                j0 a10 = jVar2.a();
                fu.c cVar = t0.f3605a;
                kotlin.jvm.internal.i.g(a10, "<this>");
                wu.b0 b0Var = a10.f3527u;
                if (b0Var != null && iu.i.c(b0Var)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    e10 = null;
                } else {
                    j0 a11 = jVar2.a();
                    kotlin.jvm.internal.i.g(a11, "<this>");
                    Type k10 = a11.k();
                    if (k10 == null && (k10 = a11.k()) == null) {
                        k10 = ys.t.b(a11, false);
                    }
                    e10 = t0.e(k10);
                }
                arrayList2.add(e10);
                i10 = (1 << (i6 % 32)) | i10;
                z11 = true;
            } else if (jVar2.b()) {
                arrayList2.add(m(jVar2.a()));
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar2);
            }
            if (jVar2.j() == 3) {
                i6++;
            }
        }
        if (!z11) {
            Object[] array2 = arrayList2.toArray(new Object[0]);
            kotlin.jvm.internal.i.e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return call(Arrays.copyOf(array2, array2.length));
        }
        arrayList3.add(Integer.valueOf(i10));
        bt.e<?> s11 = s();
        if (s11 != null) {
            arrayList2.addAll(arrayList3);
            arrayList2.add(null);
            try {
                Object[] array3 = arrayList2.toArray(new Object[0]);
                kotlin.jvm.internal.i.e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return (R) s11.call(array3);
            } catch (IllegalAccessException e12) {
                throw new IllegalCallableAccessException(e12);
            }
        }
        throw new hs.e("This callable does not support a default call: " + t(), 2);
    }

    @Override // ys.b
    public final List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f3495u.invoke();
        kotlin.jvm.internal.i.f(invoke, "_annotations()");
        return invoke;
    }

    @Override // ys.c
    public final List<ys.j> getParameters() {
        ArrayList<ys.j> invoke = this.f3496v.invoke();
        kotlin.jvm.internal.i.f(invoke, "_parameters()");
        return invoke;
    }

    @Override // ys.c
    public final ys.n getReturnType() {
        j0 invoke = this.f3497w.invoke();
        kotlin.jvm.internal.i.f(invoke, "_returnType()");
        return invoke;
    }

    @Override // ys.c
    public final List<ys.o> getTypeParameters() {
        List<k0> invoke = this.f3498x.invoke();
        kotlin.jvm.internal.i.f(invoke, "_typeParameters()");
        return invoke;
    }

    @Override // ys.c
    public final ys.q getVisibility() {
        boolean b10;
        gt.q visibility = t().getVisibility();
        kotlin.jvm.internal.i.f(visibility, "descriptor.visibility");
        fu.c cVar = t0.f3605a;
        if (kotlin.jvm.internal.i.b(visibility, gt.p.f16804e)) {
            return ys.q.PUBLIC;
        }
        if (kotlin.jvm.internal.i.b(visibility, gt.p.f16802c)) {
            return ys.q.PROTECTED;
        }
        if (kotlin.jvm.internal.i.b(visibility, gt.p.f16803d)) {
            return ys.q.INTERNAL;
        }
        if (kotlin.jvm.internal.i.b(visibility, gt.p.f16800a)) {
            b10 = true;
        } else {
            b10 = kotlin.jvm.internal.i.b(visibility, gt.p.f16801b);
        }
        if (b10) {
            return ys.q.PRIVATE;
        }
        return null;
    }

    @Override // ys.c
    public final boolean isAbstract() {
        if (t().m() == gt.z.ABSTRACT) {
            return true;
        }
        return false;
    }

    @Override // ys.c
    public final boolean isFinal() {
        if (t().m() == gt.z.FINAL) {
            return true;
        }
        return false;
    }

    @Override // ys.c
    public final boolean isOpen() {
        if (t().m() == gt.z.OPEN) {
            return true;
        }
        return false;
    }

    public abstract bt.e<?> o();

    public abstract o p();

    public abstract bt.e<?> s();

    public abstract gt.b t();

    public final boolean v() {
        if (kotlin.jvm.internal.i.b(getName(), "<init>") && p().e().isAnnotation()) {
            return true;
        }
        return false;
    }

    public abstract boolean w();
}
