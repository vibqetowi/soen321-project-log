package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import gt.q0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import wu.n1;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes2.dex */
public abstract class k extends q implements gt.v0 {
    public final int A;
    public final vu.i<wu.x0> B;
    public final vu.i<wu.i0> C;
    public final vu.l D;

    /* renamed from: y  reason: collision with root package name */
    public final n1 f23856y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f23857z;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* loaded from: classes2.dex */
    public class a extends wu.f {

        /* renamed from: c  reason: collision with root package name */
        public final gt.t0 f23858c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k f23859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, vu.l lVar, gt.t0 t0Var) {
            super(lVar);
            if (lVar != null) {
                this.f23859d = kVar;
                this.f23858c = t0Var;
                return;
            }
            n(0);
            throw null;
        }

        public static /* synthetic */ void n(int i6) {
            String str;
            int i10;
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 8) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 8) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                if (i6 != 8) {
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                                } else {
                                    objArr[1] = "processSupertypesWithoutCycles";
                                }
                            } else {
                                objArr[1] = "getSupertypeLoopChecker";
                            }
                        } else {
                            objArr[1] = "getBuiltIns";
                        }
                    } else {
                        objArr[1] = "getDeclarationDescriptor";
                    }
                } else {
                    objArr[1] = "getParameters";
                }
            } else {
                objArr[1] = "computeSupertypes";
            }
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5 || i6 == 8) {
                throw new IllegalStateException(format);
            }
        }

        @Override // wu.l, wu.x0
        public final gt.g a() {
            k kVar = this.f23859d;
            if (kVar != null) {
                return kVar;
            }
            n(3);
            throw null;
        }

        @Override // wu.x0
        public final boolean d() {
            return true;
        }

        @Override // wu.l
        public final boolean f(gt.g gVar) {
            if (gVar instanceof gt.v0) {
                k a10 = this.f23859d;
                kotlin.jvm.internal.i.g(a10, "a");
                if (kotlin.jvm.internal.b0.J.g(a10, (gt.v0) gVar, true, iu.e.f20687u)) {
                    return true;
                }
            }
            return false;
        }

        @Override // wu.f
        public final Collection<wu.b0> g() {
            List<wu.b0> N0 = this.f23859d.N0();
            if (N0 != null) {
                return N0;
            }
            n(1);
            throw null;
        }

        @Override // wu.x0
        public final List<gt.v0> getParameters() {
            List<gt.v0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            n(2);
            throw null;
        }

        @Override // wu.f
        public final wu.b0 h() {
            return yu.i.c(yu.h.A, new String[0]);
        }

        @Override // wu.f
        public final gt.t0 j() {
            gt.t0 t0Var = this.f23858c;
            if (t0Var != null) {
                return t0Var;
            }
            n(5);
            throw null;
        }

        @Override // wu.f
        public final List<wu.b0> l(List<wu.b0> list) {
            List<wu.b0> I0 = this.f23859d.I0(list);
            if (I0 != null) {
                return I0;
            }
            n(8);
            throw null;
        }

        @Override // wu.f
        public final void m(wu.b0 b0Var) {
            if (b0Var != null) {
                this.f23859d.M0(b0Var);
            } else {
                n(6);
                throw null;
            }
        }

        @Override // wu.x0
        public final dt.j o() {
            dt.j e10 = mu.a.e(this.f23859d);
            if (e10 != null) {
                return e10;
            }
            n(4);
            throw null;
        }

        public final String toString() {
            return this.f23859d.getName().f15930u;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(vu.l lVar, gt.j jVar, ht.h hVar, fu.e eVar, n1 n1Var, boolean z10, int i6, gt.t0 t0Var) {
        super(jVar, hVar, eVar, r0);
        q0.a aVar = gt.q0.f16815a;
        if (lVar != null) {
            if (jVar != null) {
                if (hVar != null) {
                    if (eVar != null) {
                        if (n1Var != null) {
                            if (t0Var != null) {
                                this.f23856y = n1Var;
                                this.f23857z = z10;
                                this.A = i6;
                                this.B = lVar.e(new h(this, lVar, t0Var));
                                this.C = lVar.e(new j(this, eVar));
                                this.D = lVar;
                                return;
                            }
                            I(6);
                            throw null;
                        }
                        I(4);
                        throw null;
                    }
                    I(3);
                    throw null;
                }
                I(2);
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i6) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // gt.v0
    public final boolean D() {
        return this.f23857z;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.f(this, d10);
    }

    public abstract void M0(wu.b0 b0Var);

    public abstract List<wu.b0> N0();

    @Override // gt.v0
    public final n1 O() {
        n1 n1Var = this.f23856y;
        if (n1Var != null) {
            return n1Var;
        }
        I(7);
        throw null;
    }

    @Override // kt.q, kt.p, gt.j
    public final gt.g b() {
        return this;
    }

    @Override // gt.v0
    public final int getIndex() {
        return this.A;
    }

    @Override // gt.v0
    public final List<wu.b0> getUpperBounds() {
        List<wu.b0> c10 = ((a) l()).c();
        if (c10 != null) {
            return c10;
        }
        I(8);
        throw null;
    }

    @Override // gt.v0
    public final vu.l h0() {
        vu.l lVar = this.D;
        if (lVar != null) {
            return lVar;
        }
        I(14);
        throw null;
    }

    @Override // gt.v0, gt.g
    public final wu.x0 l() {
        wu.x0 invoke = this.B.invoke();
        if (invoke != null) {
            return invoke;
        }
        I(9);
        throw null;
    }

    @Override // gt.v0
    public final boolean n0() {
        return false;
    }

    @Override // gt.g
    public final wu.i0 r() {
        wu.i0 invoke = this.C.invoke();
        if (invoke != null) {
            return invoke;
        }
        I(10);
        throw null;
    }

    @Override // kt.q, kt.p, gt.j
    public final gt.j b() {
        return this;
    }

    @Override // kt.q, kt.p, gt.j
    public final gt.v0 b() {
        return this;
    }

    @Override // kt.q
    public final gt.m D0() {
        return this;
    }

    public List<wu.b0> I0(List<wu.b0> list) {
        return list;
    }
}
