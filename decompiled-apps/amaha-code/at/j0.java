package at;

import at.n0;
import gt.v0;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import wu.d1;
import wu.k1;
/* compiled from: KTypeImpl.kt */
/* loaded from: classes2.dex */
public final class j0 implements kotlin.jvm.internal.j {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f3526y = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(j0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(j0.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: u  reason: collision with root package name */
    public final wu.b0 f3527u;

    /* renamed from: v  reason: collision with root package name */
    public final n0.a<Type> f3528v;

    /* renamed from: w  reason: collision with root package name */
    public final n0.a f3529w;

    /* renamed from: x  reason: collision with root package name */
    public final n0.a f3530x;

    /* compiled from: KTypeImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends ys.p>> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ss.a<Type> f3532v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ss.a<? extends Type> aVar) {
            super(0);
            this.f3532v = aVar;
        }

        @Override // ss.a
        public final List<? extends ys.p> invoke() {
            ys.p pVar;
            j0 j0Var = j0.this;
            List<d1> M0 = j0Var.f3527u.M0();
            if (M0.isEmpty()) {
                return is.w.f20676u;
            }
            hs.d N = sp.b.N(2, new i0(j0Var));
            ArrayList arrayList = new ArrayList(is.i.H1(M0, 10));
            int i6 = 0;
            for (Object obj : M0) {
                int i10 = i6 + 1;
                h0 h0Var = null;
                if (i6 >= 0) {
                    d1 d1Var = (d1) obj;
                    if (d1Var.d()) {
                        pVar = ys.p.f38974c;
                    } else {
                        wu.b0 a10 = d1Var.a();
                        kotlin.jvm.internal.i.f(a10, "typeProjection.type");
                        if (this.f3532v != null) {
                            h0Var = new h0(j0Var, i6, N);
                        }
                        j0 j0Var2 = new j0(a10, h0Var);
                        int ordinal = d1Var.b().ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    pVar = new ys.p(3, j0Var2);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                pVar = new ys.p(2, j0Var2);
                            }
                        } else {
                            pVar = new ys.p(1, j0Var2);
                        }
                    }
                    arrayList.add(pVar);
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<ys.e> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final ys.e invoke() {
            j0 j0Var = j0.this;
            return j0Var.e(j0Var.f3527u);
        }
    }

    public j0(wu.b0 type, ss.a<? extends Type> aVar) {
        n0.a<Type> aVar2;
        kotlin.jvm.internal.i.g(type, "type");
        this.f3527u = type;
        n0.a<Type> aVar3 = null;
        if (aVar instanceof n0.a) {
            aVar2 = (n0.a) aVar;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null) {
            if (aVar != null) {
                aVar3 = n0.c(aVar);
            }
        } else {
            aVar3 = aVar2;
        }
        this.f3528v = aVar3;
        this.f3529w = n0.c(new b());
        this.f3530x = n0.c(new a(aVar));
    }

    @Override // ys.n
    public final List<ys.p> d() {
        ys.m<Object> mVar = f3526y[1];
        Object invoke = this.f3530x.invoke();
        kotlin.jvm.internal.i.f(invoke, "<get-arguments>(...)");
        return (List) invoke;
    }

    public final ys.e e(wu.b0 b0Var) {
        wu.b0 a10;
        gt.g a11 = b0Var.O0().a();
        if (a11 instanceof gt.e) {
            Class<?> j10 = t0.j((gt.e) a11);
            if (j10 == null) {
                return null;
            }
            if (j10.isArray()) {
                d1 d1Var = (d1) is.u.A2(b0Var.M0());
                if (d1Var != null && (a10 = d1Var.a()) != null) {
                    ys.e e10 = e(a10);
                    if (e10 != null) {
                        return new l(Array.newInstance(sp.b.C(kotlin.jvm.internal.h.y(e10)), 0).getClass());
                    }
                    throw new hs.e("Cannot determine classifier for array element type: " + this, 2);
                }
                return new l(j10);
            } else if (!k1.g(b0Var)) {
                Class<? extends Object> cls = nt.d.f26796b.get(j10);
                if (cls != null) {
                    j10 = cls;
                }
                return new l(j10);
            } else {
                return new l(j10);
            }
        } else if (a11 instanceof v0) {
            return new k0(null, (v0) a11);
        } else {
            if (!(a11 instanceof gt.u0)) {
                return null;
            }
            throw new hs.e("An operation is not implemented: Type alias classifiers are not yet supported", 0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            if (kotlin.jvm.internal.i.b(this.f3527u, ((j0) obj).f3527u)) {
                return true;
            }
        }
        return false;
    }

    @Override // ys.n
    public final ys.e f() {
        ys.m<Object> mVar = f3526y[0];
        return (ys.e) this.f3529w.invoke();
    }

    public final int hashCode() {
        return this.f3527u.hashCode();
    }

    @Override // kotlin.jvm.internal.j
    public final Type k() {
        n0.a<Type> aVar = this.f3528v;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public final String toString() {
        hu.d dVar = p0.f3592a;
        return p0.d(this.f3527u);
    }
}
