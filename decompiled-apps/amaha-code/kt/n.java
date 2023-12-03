package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import gt.p;
import gt.q0;
import ht.h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import pu.i;
/* compiled from: ClassDescriptorImpl.java */
/* loaded from: classes2.dex */
public class n extends m {
    public final gt.z B;
    public final int C;
    public final wu.k D;
    public pu.i E;
    public Set<gt.d> F;
    public gt.d G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(gt.j jVar, fu.e eVar, gt.z zVar, int i6, List list, vu.l lVar) {
        super(lVar, jVar, eVar, r0);
        q0.a aVar = gt.q0.f16815a;
        if (jVar != null) {
            if (eVar != null) {
                if (i6 != 0) {
                    if (lVar != null) {
                        this.B = zVar;
                        this.C = i6;
                        this.D = new wu.k(this, Collections.emptyList(), list, lVar);
                        return;
                    }
                    D0(6);
                    throw null;
                }
                D0(3);
                throw null;
            }
            D0(1);
            throw null;
        }
        D0(0);
        throw null;
    }

    public static /* synthetic */ void D0(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i10 = 2;
                break;
            case 12:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i6) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // gt.e
    public final boolean B() {
        return false;
    }

    @Override // gt.e
    public final gt.x0<wu.i0> B0() {
        return null;
    }

    @Override // kt.b0
    public final pu.i C0(xu.e eVar) {
        if (eVar != null) {
            pu.i iVar = this.E;
            if (iVar != null) {
                return iVar;
            }
            D0(13);
            throw null;
        }
        D0(12);
        throw null;
    }

    @Override // gt.y
    public final boolean H0() {
        return false;
    }

    @Override // gt.e
    public final Collection<gt.e> K() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D0(19);
        throw null;
    }

    @Override // gt.e
    public final boolean K0() {
        return false;
    }

    @Override // gt.e
    public final boolean L() {
        return false;
    }

    @Override // gt.y
    public final boolean M() {
        return false;
    }

    public final void M0(pu.i iVar, Set set, l lVar) {
        if (iVar != null) {
            this.E = iVar;
            this.F = set;
            this.G = lVar;
            return;
        }
        D0(7);
        throw null;
    }

    @Override // gt.h
    public final boolean N() {
        return false;
    }

    @Override // gt.e
    public final gt.d R() {
        return this.G;
    }

    @Override // gt.e
    public final pu.i S() {
        i.b bVar = i.b.f29008b;
        if (bVar != null) {
            return bVar;
        }
        D0(14);
        throw null;
    }

    @Override // gt.e
    public final gt.e U() {
        return null;
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        return h.a.f19495a;
    }

    @Override // gt.e, gt.n, gt.y
    public final gt.q getVisibility() {
        p.h hVar = gt.p.f16804e;
        if (hVar != null) {
            return hVar;
        }
        D0(17);
        throw null;
    }

    @Override // gt.e
    public final boolean isInline() {
        return false;
    }

    @Override // gt.e
    public final int j() {
        int i6 = this.C;
        if (i6 != 0) {
            return i6;
        }
        D0(15);
        throw null;
    }

    @Override // gt.g
    public final wu.x0 l() {
        wu.k kVar = this.D;
        if (kVar != null) {
            return kVar;
        }
        D0(10);
        throw null;
    }

    @Override // gt.e, gt.y
    public final gt.z m() {
        gt.z zVar = this.B;
        if (zVar != null) {
            return zVar;
        }
        D0(16);
        throw null;
    }

    @Override // gt.e, gt.h
    public final List<gt.v0> t() {
        List<gt.v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D0(18);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // gt.e
    public final boolean w() {
        return false;
    }

    @Override // gt.e
    public final Collection<gt.d> y() {
        Set<gt.d> set = this.F;
        if (set != null) {
            return set;
        }
        D0(11);
        throw null;
    }
}
