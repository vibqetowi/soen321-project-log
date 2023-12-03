package kt;

import gt.q0;
import java.util.List;
import wu.k1;
import wu.m1;
/* compiled from: AbstractTypeAliasDescriptor.kt */
/* loaded from: classes2.dex */
public abstract class f extends q implements gt.u0 {
    public final g A;

    /* renamed from: y  reason: collision with root package name */
    public final gt.q f23835y;

    /* renamed from: z  reason: collision with root package name */
    public List<? extends gt.v0> f23836z;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<m1, Boolean> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(m1 m1Var) {
            boolean z10;
            m1 type = m1Var;
            kotlin.jvm.internal.i.f(type, "type");
            boolean z11 = false;
            if (!ta.v.E(type)) {
                gt.g a10 = type.O0().a();
                if ((a10 instanceof gt.v0) && !kotlin.jvm.internal.i.b(((gt.v0) a10).c(), f.this)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(gt.j containingDeclaration, ht.h hVar, fu.e eVar, gt.q visibilityImpl) {
        super(containingDeclaration, hVar, eVar, r0);
        q0.a aVar = gt.q0.f16815a;
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(visibilityImpl, "visibilityImpl");
        this.f23835y = visibilityImpl;
        this.A = new g(this);
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.m(this, d10);
    }

    @Override // gt.y
    public final boolean H0() {
        return false;
    }

    @Override // gt.y
    public final boolean M() {
        return false;
    }

    @Override // gt.h
    public final boolean N() {
        return k1.c(((uu.m) this).g0(), new a());
    }

    @Override // kt.q, kt.p, gt.j
    public final gt.g b() {
        return this;
    }

    @Override // gt.n, gt.y
    public final gt.q getVisibility() {
        return this.f23835y;
    }

    @Override // gt.y
    public final boolean isExternal() {
        return false;
    }

    @Override // gt.g
    public final wu.x0 l() {
        return this.A;
    }

    @Override // gt.h
    public final List<gt.v0> t() {
        List list = this.f23836z;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.i.q("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kt.p
    public final String toString() {
        return "typealias " + getName().f();
    }

    @Override // kt.q, kt.p, gt.j
    public final gt.j b() {
        return this;
    }

    @Override // kt.q
    public final gt.m D0() {
        return this;
    }
}
