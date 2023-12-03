package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import gt.q0;
import ht.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import pu.i;
import vu.c;
/* compiled from: MutableClassDescriptor.java */
/* loaded from: classes2.dex */
public final class h0 extends m {
    public final int B;
    public final boolean C;
    public gt.z D;
    public gt.q E;
    public wu.k F;
    public ArrayList G;
    public final ArrayList H;
    public final vu.l I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(r rVar, fu.e eVar, c.a aVar) {
        super(aVar, rVar, eVar, r0);
        q0.a aVar2 = gt.q0.f16815a;
        if (eVar != null) {
            if (aVar != null) {
                this.H = new ArrayList();
                this.I = aVar;
                this.B = 2;
                this.C = false;
                return;
            }
            D0(4);
            throw null;
        }
        D0(2);
        throw null;
    }

    public static /* synthetic */ void D0(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i10 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
            i.b bVar = i.b.f29008b;
            if (bVar != null) {
                return bVar;
            }
            D0(17);
            throw null;
        }
        D0(16);
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

    @Override // gt.h
    public final boolean N() {
        return this.C;
    }

    @Override // gt.e
    public final gt.d R() {
        return null;
    }

    @Override // gt.e
    public final pu.i S() {
        i.b bVar = i.b.f29008b;
        if (bVar != null) {
            return bVar;
        }
        D0(18);
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
        gt.q qVar = this.E;
        if (qVar != null) {
            return qVar;
        }
        D0(10);
        throw null;
    }

    @Override // gt.e
    public final boolean isInline() {
        return false;
    }

    @Override // gt.e
    public final int j() {
        int i6 = this.B;
        if (i6 != 0) {
            return i6;
        }
        D0(8);
        throw null;
    }

    @Override // gt.g
    public final wu.x0 l() {
        wu.k kVar = this.F;
        if (kVar != null) {
            return kVar;
        }
        D0(11);
        throw null;
    }

    @Override // gt.e, gt.y
    public final gt.z m() {
        gt.z zVar = this.D;
        if (zVar != null) {
            return zVar;
        }
        D0(7);
        throw null;
    }

    @Override // gt.e, gt.h
    public final List<gt.v0> t() {
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            return arrayList;
        }
        D0(15);
        throw null;
    }

    public final String toString() {
        return p.C0(this);
    }

    @Override // gt.e
    public final boolean w() {
        return false;
    }

    @Override // gt.e
    public final Collection y() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        D0(13);
        throw null;
    }
}
