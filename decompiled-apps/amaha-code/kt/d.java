package kt;

import gt.p;
import gt.z0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import wu.j1;
import wu.n1;
/* compiled from: AbstractReceiverParameterDescriptor.java */
/* loaded from: classes2.dex */
public abstract class d extends p implements gt.n0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ht.h hVar) {
        super(hVar, fu.g.f15936d);
        if (hVar != null) {
        } else {
            I(0);
            throw null;
        }
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i6) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i6) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // gt.a
    public final boolean E() {
        return false;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.b(this, d10);
    }

    @Override // gt.y0
    public final wu.b0 a() {
        wu.b0 a10 = getValue().a();
        if (a10 != null) {
            return a10;
        }
        I(4);
        throw null;
    }

    @Override // kt.p, gt.j
    public final gt.a b() {
        return this;
    }

    @Override // gt.a
    public final Collection<? extends gt.a> f() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        I(6);
        throw null;
    }

    @Override // gt.a
    public final gt.n0 f0() {
        return null;
    }

    @Override // gt.m
    public final gt.q0 g() {
        return gt.q0.f16815a;
    }

    @Override // gt.a
    public final wu.b0 getReturnType() {
        return a();
    }

    @Override // gt.a
    public final List<gt.v0> getTypeParameters() {
        List<gt.v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(3);
        throw null;
    }

    @Override // gt.n, gt.y
    public final gt.q getVisibility() {
        p.i iVar = gt.p.f;
        if (iVar != null) {
            return iVar;
        }
        I(7);
        throw null;
    }

    @Override // gt.a
    public final List<z0> i() {
        List<z0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        I(5);
        throw null;
    }

    @Override // gt.a
    public final gt.n0 k0() {
        return null;
    }

    @Override // kt.p, gt.j
    public final gt.j b() {
        return this;
    }

    @Override // gt.n0, gt.s0
    public final d d(j1 j1Var) {
        wu.b0 k10;
        if (j1Var != null) {
            if (j1Var.h()) {
                return this;
            }
            if (c() instanceof gt.e) {
                k10 = j1Var.k(a(), n1.OUT_VARIANCE);
            } else {
                k10 = j1Var.k(a(), n1.INVARIANT);
            }
            if (k10 == null) {
                return null;
            }
            return k10 == a() ? this : new o0(c(), new qu.g(k10), getAnnotations());
        }
        I(1);
        throw null;
    }
}
