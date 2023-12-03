package at;

import at.n0;
import gt.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: KTypeParameterImpl.kt */
/* loaded from: classes2.dex */
public final class k0 implements ys.o {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f3535x = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(k0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: u  reason: collision with root package name */
    public final v0 f3536u;

    /* renamed from: v  reason: collision with root package name */
    public final n0.a f3537v;

    /* renamed from: w  reason: collision with root package name */
    public final l0 f3538w;

    /* compiled from: KTypeParameterImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends j0>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final List<? extends j0> invoke() {
            List<wu.b0> upperBounds = k0.this.f3536u.getUpperBounds();
            kotlin.jvm.internal.i.f(upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(is.i.H1(upperBounds, 10));
            for (wu.b0 b0Var : upperBounds) {
                arrayList.add(new j0(b0Var, null));
            }
            return arrayList;
        }
    }

    public k0(l0 l0Var, v0 descriptor) {
        uu.h hVar;
        yt.o oVar;
        Class<?> cls;
        l lVar;
        Object F;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.f3536u = descriptor;
        this.f3537v = n0.c(new a());
        if (l0Var == null) {
            gt.j c10 = descriptor.c();
            kotlin.jvm.internal.i.f(c10, "descriptor.containingDeclaration");
            if (c10 instanceof gt.e) {
                F = b((gt.e) c10);
            } else if (c10 instanceof gt.b) {
                gt.j c11 = ((gt.b) c10).c();
                kotlin.jvm.internal.i.f(c11, "declaration.containingDeclaration");
                if (c11 instanceof gt.e) {
                    lVar = b((gt.e) c11);
                } else {
                    if (c10 instanceof uu.h) {
                        hVar = (uu.h) c10;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        uu.g c0 = hVar.c0();
                        yt.l lVar2 = (yt.l) (c0 instanceof yt.l ? c0 : null);
                        if (lVar2 != null) {
                            oVar = lVar2.f39042d;
                        } else {
                            oVar = null;
                        }
                        mt.c cVar = oVar instanceof mt.c ? oVar : null;
                        if (cVar != null && (cls = cVar.f25737a) != null) {
                            ys.d a10 = kotlin.jvm.internal.y.a(cls);
                            kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                            lVar = (l) a10;
                        } else {
                            throw new hs.e("Container of deserialized member is not resolved: " + hVar, 2);
                        }
                    } else {
                        throw new hs.e("Non-class callable descriptor must be deserialized: " + c10, 2);
                    }
                }
                F = c10.F(new at.a(lVar), hs.k.f19476a);
            } else {
                throw new hs.e("Unknown type parameter container: " + c10, 2);
            }
            kotlin.jvm.internal.i.f(F, "when (val declaration = … $declaration\")\n        }");
            l0Var = (l0) F;
        }
        this.f3538w = l0Var;
    }

    public static l b(gt.e eVar) {
        ys.d dVar;
        Class<?> j10 = t0.j(eVar);
        if (j10 != null) {
            dVar = kotlin.jvm.internal.y.a(j10);
        } else {
            dVar = null;
        }
        l lVar = (l) dVar;
        if (lVar != null) {
            return lVar;
        }
        throw new hs.e("Type parameter container is not resolved: " + eVar.c(), 2);
    }

    public final int a() {
        int ordinal = this.f3536u.O().ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 3;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (kotlin.jvm.internal.i.b(this.f3538w, k0Var.f3538w) && kotlin.jvm.internal.i.b(getName(), k0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // ys.o
    public final String getName() {
        String f = this.f3536u.getName().f();
        kotlin.jvm.internal.i.f(f, "descriptor.name.asString()");
        return f;
    }

    @Override // ys.o
    public final List<ys.n> getUpperBounds() {
        ys.m<Object> mVar = f3535x[0];
        Object invoke = this.f3537v.invoke();
        kotlin.jvm.internal.i.f(invoke, "<get-upperBounds>(...)");
        return (List) invoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f3538w.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int d10 = v.h.d(a());
        if (d10 != 1) {
            if (d10 == 2) {
                sb2.append("out ");
            }
        } else {
            sb2.append("in ");
        }
        sb2.append(getName());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
