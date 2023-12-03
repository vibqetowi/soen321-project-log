package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import gt.a;
import gt.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import wu.j1;
/* compiled from: PropertyAccessorDescriptorImpl.java */
/* loaded from: classes2.dex */
public abstract class k0 extends q implements gt.j0 {
    public final gt.z A;
    public final gt.k0 B;
    public final boolean C;
    public final b.a D;
    public gt.q E;
    public gt.u F;

    /* renamed from: y  reason: collision with root package name */
    public boolean f23860y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f23861z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(gt.z zVar, gt.q qVar, gt.k0 k0Var, ht.h hVar, fu.e eVar, boolean z10, boolean z11, boolean z12, b.a aVar, gt.q0 q0Var) {
        super(k0Var.c(), hVar, eVar, q0Var);
        if (zVar != null) {
            if (qVar != null) {
                if (hVar != null) {
                    if (q0Var != null) {
                        this.F = null;
                        this.A = zVar;
                        this.E = qVar;
                        this.B = k0Var;
                        this.f23860y = z10;
                        this.f23861z = z11;
                        this.C = z12;
                        this.D = aVar;
                        return;
                    }
                    I(5);
                    throw null;
                }
                I(3);
                throw null;
            }
            I(1);
            throw null;
        }
        I(0);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i10 = 2;
                break;
            case 7:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i6) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // gt.a
    public final boolean E() {
        return false;
    }

    @Override // gt.j0
    public final gt.k0 E0() {
        gt.k0 k0Var = this.B;
        if (k0Var != null) {
            return k0Var;
        }
        I(12);
        throw null;
    }

    @Override // gt.u
    public final boolean F0() {
        return false;
    }

    @Override // gt.y
    public final boolean H0() {
        return false;
    }

    @Override // kt.q, kt.p, gt.j
    /* renamed from: I0 */
    public abstract gt.j0 b();

    @Override // gt.y
    public final boolean M() {
        return false;
    }

    public final ArrayList M0(boolean z10) {
        gt.a h10;
        ArrayList arrayList = new ArrayList(0);
        for (gt.k0 k0Var : E0().f()) {
            if (z10) {
                h10 = k0Var.n();
            } else {
                h10 = k0Var.h();
            }
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    @Override // gt.u
    public final boolean Q() {
        return false;
    }

    @Override // gt.j0
    public final boolean V() {
        return this.f23860y;
    }

    @Override // gt.u, gt.s0
    public final /* bridge */ /* synthetic */ gt.k d(j1 j1Var) {
        d(j1Var);
        throw null;
    }

    @Override // gt.b
    public final gt.b d0(gt.j jVar, gt.z zVar, gt.o oVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // gt.u
    public final gt.u e0() {
        return this.F;
    }

    @Override // gt.a
    public final gt.n0 f0() {
        return E0().f0();
    }

    @Override // gt.a
    public final List<gt.v0> getTypeParameters() {
        List<gt.v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(8);
        throw null;
    }

    @Override // gt.n, gt.y
    public final gt.q getVisibility() {
        gt.q qVar = this.E;
        if (qVar != null) {
            return qVar;
        }
        I(10);
        throw null;
    }

    @Override // gt.y
    public final boolean isExternal() {
        return this.f23861z;
    }

    @Override // gt.u
    public final boolean isInfix() {
        return false;
    }

    @Override // gt.u
    public final boolean isInline() {
        return this.C;
    }

    @Override // gt.u
    public final boolean isOperator() {
        return false;
    }

    @Override // gt.u
    public final boolean isSuspend() {
        return false;
    }

    @Override // gt.a
    public final gt.n0 k0() {
        return E0().k0();
    }

    @Override // gt.y
    public final gt.z m() {
        gt.z zVar = this.A;
        if (zVar != null) {
            return zVar;
        }
        I(9);
        throw null;
    }

    @Override // gt.b
    public final b.a m0() {
        b.a aVar = this.D;
        if (aVar != null) {
            return aVar;
        }
        I(6);
        throw null;
    }

    @Override // gt.a
    public final List<gt.n0> r0() {
        List<gt.n0> r02 = E0().r0();
        if (r02 != null) {
            return r02;
        }
        I(13);
        throw null;
    }

    @Override // gt.a
    public final <V> V v(a.InterfaceC0261a<V> interfaceC0261a) {
        return null;
    }

    @Override // gt.u
    public final boolean x0() {
        return false;
    }

    @Override // gt.b
    public final void y0(Collection<? extends gt.b> collection) {
        if (collection != null) {
            return;
        }
        I(15);
        throw null;
    }

    @Override // gt.u, gt.s0
    public final gt.u d(j1 j1Var) {
        if (j1Var == null) {
            I(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }
}
