package kt;

import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import wu.d1;
import wu.g1;
import wu.j1;
import wu.k1;
import wu.n1;
import wu.v0;
/* compiled from: LazySubstitutingClassDescriptor.java */
/* loaded from: classes2.dex */
public final class a0 extends b0 {

    /* renamed from: u  reason: collision with root package name */
    public final b0 f23817u;

    /* renamed from: v  reason: collision with root package name */
    public final j1 f23818v;

    /* renamed from: w  reason: collision with root package name */
    public j1 f23819w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f23820x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f23821y;

    /* renamed from: z  reason: collision with root package name */
    public wu.k f23822z;

    public a0(b0 b0Var, j1 j1Var) {
        this.f23817u = b0Var;
        this.f23818v = j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void D0(int i6) {
        String str;
        int i10;
        String format;
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6 && i6 != 8 && i6 != 10 && i6 != 13 && i6 != 23) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6 && i6 != 8 && i6 != 10 && i6 != 13 && i6 != 23) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 5) {
                    if (i6 != 6) {
                        if (i6 != 8) {
                            if (i6 != 10) {
                                if (i6 != 13) {
                                    if (i6 != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i6) {
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case 10:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case 7:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case 15:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i6 == 2 && i6 != 3 && i6 != 5 && i6 != 6 && i6 != 8 && i6 != 10) {
                                        if (i6 != 13) {
                                            if (i6 == 23) {
                                                objArr[2] = "substitute";
                                            }
                                        } else {
                                            objArr[2] = "getUnsubstitutedMemberScope";
                                        }
                                    } else {
                                        objArr[2] = "getMemberScope";
                                    }
                                    format = String.format(str, objArr);
                                    if (i6 != 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 8 || i6 == 10 || i6 == 13 || i6 == 23) {
                                        throw new IllegalArgumentException(format);
                                    }
                                    throw new IllegalStateException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i6) {
                }
                if (i6 == 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i6 != 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i6) {
            }
            if (i6 == 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i6 != 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i6) {
        }
        if (i6 == 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i6 != 2) {
        }
        throw new IllegalArgumentException(format);
    }

    @Override // gt.e
    public final pu.i A0() {
        pu.i A0 = this.f23817u.A0();
        if (A0 != null) {
            return A0;
        }
        D0(28);
        throw null;
    }

    @Override // gt.e
    public final boolean B() {
        return this.f23817u.B();
    }

    @Override // gt.e
    public final gt.x0<wu.i0> B0() {
        gt.x0<wu.i0> B0 = this.f23817u.B0();
        if (B0 == null) {
            return null;
        }
        boolean z10 = B0 instanceof gt.v;
        n1 n1Var = n1.INVARIANT;
        j1 j1Var = this.f23818v;
        if (z10) {
            gt.v vVar = (gt.v) B0;
            wu.i0 i0Var = (wu.i0) vVar.f16822b;
            if (i0Var != null && !j1Var.h()) {
                i0Var = (wu.i0) I0().k(i0Var, n1Var);
            }
            return new gt.v(vVar.f16821a, i0Var);
        } else if (B0 instanceof gt.b0) {
            List<hs.f<fu.e, wu.i0>> a10 = B0.a();
            ArrayList arrayList = new ArrayList(is.i.H1(a10, 10));
            Iterator<T> it = a10.iterator();
            while (it.hasNext()) {
                hs.f fVar = (hs.f) it.next();
                fu.e eVar = (fu.e) fVar.f19464u;
                wu.i0 i0Var2 = (wu.i0) ((zu.i) fVar.f19465v);
                if (i0Var2 != null && !j1Var.h()) {
                    i0Var2 = (wu.i0) I0().k(i0Var2, n1Var);
                }
                arrayList.add(new hs.f(eVar, i0Var2));
            }
            return new gt.b0(arrayList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kt.b0
    public final pu.i C0(xu.e eVar) {
        if (eVar != null) {
            pu.i C0 = this.f23817u.C0(eVar);
            if (this.f23818v.h()) {
                if (C0 != null) {
                    return C0;
                }
                D0(14);
                throw null;
            }
            return new pu.m(C0, I0());
        }
        D0(13);
        throw null;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.c(this, d10);
    }

    @Override // gt.e
    public final pu.i G0() {
        pu.i C0 = C0(mu.a.i(iu.g.d(this.f23817u)));
        if (C0 != null) {
            return C0;
        }
        D0(12);
        throw null;
    }

    @Override // gt.y
    public final boolean H0() {
        return this.f23817u.H0();
    }

    @Override // kt.b0
    public final pu.i I(g1 g1Var, xu.e eVar) {
        if (g1Var != null) {
            if (eVar != null) {
                pu.i I = this.f23817u.I(g1Var, eVar);
                if (this.f23818v.h()) {
                    if (I != null) {
                        return I;
                    }
                    D0(7);
                    throw null;
                }
                return new pu.m(I, I0());
            }
            D0(6);
            throw null;
        }
        D0(5);
        throw null;
    }

    public final j1 I0() {
        if (this.f23819w == null) {
            j1 j1Var = this.f23818v;
            if (j1Var.h()) {
                this.f23819w = j1Var;
            } else {
                List<gt.v0> parameters = this.f23817u.l().getParameters();
                this.f23820x = new ArrayList(parameters.size());
                this.f23819w = ca.a.q1(parameters, j1Var.g(), this, this.f23820x);
                ArrayList arrayList = this.f23820x;
                kotlin.jvm.internal.i.g(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (Boolean.valueOf(!((gt.v0) obj).n0()).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                this.f23821y = arrayList2;
            }
        }
        return this.f23819w;
    }

    @Override // gt.e
    public final List<gt.n0> J0() {
        List<gt.n0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D0(17);
        throw null;
    }

    @Override // gt.e
    public final Collection<gt.e> K() {
        Collection<gt.e> K = this.f23817u.K();
        if (K != null) {
            return K;
        }
        D0(31);
        throw null;
    }

    @Override // gt.e
    public final boolean K0() {
        return this.f23817u.K0();
    }

    @Override // gt.e
    public final boolean L() {
        return this.f23817u.L();
    }

    @Override // gt.e
    public final gt.n0 L0() {
        throw new UnsupportedOperationException();
    }

    @Override // gt.y
    public final boolean M() {
        return this.f23817u.M();
    }

    @Override // gt.h
    public final boolean N() {
        return this.f23817u.N();
    }

    @Override // gt.e
    public final gt.d R() {
        return this.f23817u.R();
    }

    @Override // gt.e
    public final pu.i S() {
        pu.i S = this.f23817u.S();
        if (S != null) {
            return S;
        }
        D0(15);
        throw null;
    }

    @Override // gt.e
    public final gt.e U() {
        return this.f23817u.U();
    }

    @Override // kt.b0, gt.e, gt.j
    public final gt.e b() {
        gt.e b10 = this.f23817u.b();
        if (b10 != null) {
            return b10;
        }
        D0(21);
        throw null;
    }

    @Override // gt.e, gt.k, gt.j
    public final gt.j c() {
        gt.j c10 = this.f23817u.c();
        if (c10 != null) {
            return c10;
        }
        D0(22);
        throw null;
    }

    @Override // gt.s0
    public final gt.k d(j1 j1Var) {
        if (j1Var != null) {
            if (j1Var.h()) {
                return this;
            }
            return new a0(this, j1.f(j1Var.g(), I0().g()));
        }
        D0(23);
        throw null;
    }

    @Override // gt.m
    public final gt.q0 g() {
        return gt.q0.f16815a;
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        ht.h annotations = this.f23817u.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        D0(19);
        throw null;
    }

    @Override // gt.j
    public final fu.e getName() {
        fu.e name = this.f23817u.getName();
        if (name != null) {
            return name;
        }
        D0(20);
        throw null;
    }

    @Override // gt.e, gt.n, gt.y
    public final gt.q getVisibility() {
        gt.q visibility = this.f23817u.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        D0(27);
        throw null;
    }

    @Override // gt.y
    public final boolean isExternal() {
        return this.f23817u.isExternal();
    }

    @Override // gt.e
    public final boolean isInline() {
        return this.f23817u.isInline();
    }

    @Override // gt.e
    public final int j() {
        int j10 = this.f23817u.j();
        if (j10 != 0) {
            return j10;
        }
        D0(25);
        throw null;
    }

    @Override // gt.g
    public final wu.x0 l() {
        wu.x0 l2 = this.f23817u.l();
        if (this.f23818v.h()) {
            if (l2 != null) {
                return l2;
            }
            D0(0);
            throw null;
        }
        if (this.f23822z == null) {
            j1 I0 = I0();
            Collection<wu.b0> c10 = l2.c();
            ArrayList arrayList = new ArrayList(c10.size());
            for (wu.b0 b0Var : c10) {
                arrayList.add(I0.k(b0Var, n1.INVARIANT));
            }
            this.f23822z = new wu.k(this, this.f23820x, arrayList, vu.c.f36140e);
        }
        wu.k kVar = this.f23822z;
        if (kVar != null) {
            return kVar;
        }
        D0(1);
        throw null;
    }

    @Override // gt.e, gt.y
    public final gt.z m() {
        gt.z m10 = this.f23817u.m();
        if (m10 != null) {
            return m10;
        }
        D0(26);
        throw null;
    }

    @Override // gt.e, gt.g
    public final wu.i0 r() {
        wu.v0 c10;
        List<d1> e10 = k1.e(l().getParameters());
        ht.h annotations = getAnnotations();
        kotlin.jvm.internal.i.g(annotations, "annotations");
        if (annotations.isEmpty()) {
            wu.v0.f37300v.getClass();
            c10 = wu.v0.f37301w;
        } else {
            v0.a aVar = wu.v0.f37300v;
            List O0 = ca.a.O0(new wu.i(annotations));
            aVar.getClass();
            c10 = v0.a.c(O0);
        }
        return wu.c0.g(e10, G0(), c10, l(), false);
    }

    @Override // gt.e, gt.h
    public final List<gt.v0> t() {
        I0();
        ArrayList arrayList = this.f23821y;
        if (arrayList != null) {
            return arrayList;
        }
        D0(30);
        throw null;
    }

    @Override // gt.e
    public final boolean w() {
        return this.f23817u.w();
    }

    @Override // gt.e
    public final Collection<gt.d> y() {
        Collection<gt.d> y10 = this.f23817u.y();
        ArrayList arrayList = new ArrayList(y10.size());
        for (gt.d dVar : y10) {
            arrayList.add(((gt.d) dVar.s().g(dVar.b()).d(dVar.m()).k(dVar.getVisibility()).q(dVar.m0()).i().build()).d(I0()));
        }
        return arrayList;
    }

    @Override // gt.e
    public final pu.i z0(g1 g1Var) {
        if (g1Var != null) {
            pu.i I = I(g1Var, mu.a.i(iu.g.d(this)));
            if (I != null) {
                return I;
            }
            D0(11);
            throw null;
        }
        D0(10);
        throw null;
    }
}
