package gt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wu.d1;
/* compiled from: typeParameterUtils.kt */
/* loaded from: classes2.dex */
public final class w0 {

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<j, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f16824u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(j jVar) {
            j it = jVar;
            kotlin.jvm.internal.i.g(it, "it");
            return Boolean.valueOf(it instanceof gt.a);
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<j, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f16825u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(j jVar) {
            j it = jVar;
            kotlin.jvm.internal.i.g(it, "it");
            return Boolean.valueOf(!(it instanceof i));
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<j, fv.h<? extends v0>> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f16826u = new c();

        public c() {
            super(1);
        }

        @Override // ss.l
        public final fv.h<? extends v0> invoke(j jVar) {
            j it = jVar;
            kotlin.jvm.internal.i.g(it, "it");
            List<v0> typeParameters = ((gt.a) it).getTypeParameters();
            kotlin.jvm.internal.i.f(typeParameters, "it as CallableDescriptor).typeParameters");
            return is.u.X1(typeParameters);
        }
    }

    public static final s1.s a(wu.i0 i0Var, h hVar, int i6) {
        h hVar2 = null;
        if (hVar == null || yu.i.f(hVar)) {
            return null;
        }
        int size = hVar.t().size() + i6;
        if (!hVar.N()) {
            if (size != i0Var.M0().size()) {
                iu.g.o(hVar);
            }
            return new s1.s(hVar, i0Var.M0().subList(i6, i0Var.M0().size()), (s1.s) null);
        }
        List<d1> subList = i0Var.M0().subList(i6, size);
        j c10 = hVar.c();
        if (c10 instanceof h) {
            hVar2 = (h) c10;
        }
        return new s1.s(hVar, subList, a(i0Var, hVar2, size));
    }

    public static final List<v0> b(h hVar) {
        List<v0> list;
        Object obj;
        wu.x0 l2;
        kotlin.jvm.internal.i.g(hVar, "<this>");
        List<v0> declaredTypeParameters = hVar.t();
        kotlin.jvm.internal.i.f(declaredTypeParameters, "declaredTypeParameters");
        if (!hVar.N() && !(hVar.c() instanceof gt.a)) {
            return declaredTypeParameters;
        }
        int i6 = mu.a.f25746a;
        mu.d dVar = mu.d.f25752u;
        fv.h A0 = fv.t.A0(fv.k.x0(dVar, hVar), 1);
        a predicate = a.f16824u;
        kotlin.jvm.internal.i.g(A0, "<this>");
        kotlin.jvm.internal.i.g(predicate, "predicate");
        List a12 = ca.a.a1(fv.t.J0(fv.t.E0(fv.t.B0(new fv.u(A0, predicate), b.f16825u), c.f16826u)));
        Iterator it = fv.t.A0(fv.k.x0(dVar, hVar), 1).iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        e eVar = (e) obj;
        if (eVar != null && (l2 = eVar.l()) != null) {
            list = l2.getParameters();
        }
        if (list == null) {
            list = is.w.f20676u;
        }
        if (a12.isEmpty() && list.isEmpty()) {
            List<v0> declaredTypeParameters2 = hVar.t();
            kotlin.jvm.internal.i.f(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        ArrayList u22 = is.u.u2(list, a12);
        ArrayList arrayList = new ArrayList(is.i.H1(u22, 10));
        Iterator it2 = u22.iterator();
        while (it2.hasNext()) {
            v0 it3 = (v0) it2.next();
            kotlin.jvm.internal.i.f(it3, "it");
            arrayList.add(new gt.c(it3, hVar, declaredTypeParameters.size()));
        }
        return is.u.u2(arrayList, declaredTypeParameters);
    }
}
