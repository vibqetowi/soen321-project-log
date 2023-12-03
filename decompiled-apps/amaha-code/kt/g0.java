package kt;

import com.google.android.gms.internal.p000firebaseauthapi.s5;
import ht.h;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kt.j0;
import vu.c;
/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes2.dex */
public final class g0 extends p implements gt.a0 {
    public c0 A;
    public gt.e0 B;
    public final boolean C;
    public final vu.g<fu.c, gt.h0> D;
    public final hs.i E;

    /* renamed from: w  reason: collision with root package name */
    public final vu.l f23840w;

    /* renamed from: x  reason: collision with root package name */
    public final dt.j f23841x;

    /* renamed from: y  reason: collision with root package name */
    public final Map<s5, Object> f23842y;

    /* renamed from: z  reason: collision with root package name */
    public final j0 f23843z;

    public g0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(fu.e eVar, vu.l lVar, dt.j jVar, int i6) {
        super(h.a.f19495a, eVar);
        is.x capabilities = (i6 & 16) != 0 ? is.x.f20677u : null;
        kotlin.jvm.internal.i.g(capabilities, "capabilities");
        this.f23840w = lVar;
        this.f23841x = jVar;
        if (eVar.f15931v) {
            this.f23842y = capabilities;
            j0.f23852a.getClass();
            j0 j0Var = (j0) s0(j0.a.f23854b);
            this.f23843z = j0Var == null ? j0.b.f23855b : j0Var;
            this.C = true;
            this.D = lVar.h(new f0(this));
            this.E = sp.b.O(new e0(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + eVar);
    }

    public final void D0() {
        hs.k kVar;
        if (!this.C) {
            gt.x xVar = (gt.x) s0(gt.w.f16823a);
            if (xVar != null) {
                xVar.a();
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                throw new InvalidModuleException("Accessing invalid module descriptor " + this);
            }
        }
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.l(this, d10);
    }

    @Override // gt.a0
    public final gt.h0 H(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        D0();
        return (gt.h0) ((c.k) this.D).invoke(fqName);
    }

    @Override // gt.j
    public final gt.j c() {
        return null;
    }

    @Override // gt.a0
    public final Collection<fu.c> k(fu.c fqName, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        D0();
        D0();
        return ((o) this.E.getValue()).k(fqName, nameFilter);
    }

    @Override // gt.a0
    public final dt.j o() {
        return this.f23841x;
    }

    @Override // gt.a0
    public final boolean p0(gt.a0 targetModule) {
        kotlin.jvm.internal.i.g(targetModule, "targetModule");
        if (kotlin.jvm.internal.i.b(this, targetModule)) {
            return true;
        }
        c0 c0Var = this.A;
        kotlin.jvm.internal.i.d(c0Var);
        if (is.u.Z1(c0Var.b(), targetModule) || u0().contains(targetModule) || targetModule.u0().contains(this)) {
            return true;
        }
        return false;
    }

    @Override // gt.a0
    public final <T> T s0(s5 capability) {
        kotlin.jvm.internal.i.g(capability, "capability");
        T t3 = (T) this.f23842y.get(capability);
        if (t3 == null) {
            return null;
        }
        return t3;
    }

    @Override // gt.a0
    public final List<gt.a0> u0() {
        c0 c0Var = this.A;
        if (c0Var != null) {
            return c0Var.c();
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = getName().f15930u;
        kotlin.jvm.internal.i.f(str, "name.toString()");
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }
}
