package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Collections;
import java.util.List;
import wu.g1;
import wu.j1;
import wu.k1;
/* compiled from: AbstractClassDescriptor.java */
/* loaded from: classes2.dex */
public abstract class b extends b0 {

    /* renamed from: u  reason: collision with root package name */
    public final fu.e f23823u;

    /* renamed from: v  reason: collision with root package name */
    public final vu.i<wu.i0> f23824v;

    /* renamed from: w  reason: collision with root package name */
    public final vu.i<pu.i> f23825w;

    /* renamed from: x  reason: collision with root package name */
    public final vu.i<gt.n0> f23826x;

    /* compiled from: AbstractClassDescriptor.java */
    /* loaded from: classes2.dex */
    public class a implements ss.a<wu.i0> {
        public a() {
        }

        @Override // ss.a
        public final wu.i0 invoke() {
            b bVar = b.this;
            return k1.o(bVar, bVar.G0(), new kt.a(this));
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kt.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0369b implements ss.a<pu.i> {
        public C0369b() {
        }

        @Override // ss.a
        public final pu.i invoke() {
            return new pu.g(b.this.G0());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* loaded from: classes2.dex */
    public class c implements ss.a<gt.n0> {
        public c() {
        }

        @Override // ss.a
        public final gt.n0 invoke() {
            return new y(b.this);
        }
    }

    public b(vu.l lVar, fu.e eVar) {
        if (lVar != null) {
            if (eVar != null) {
                this.f23823u = eVar;
                this.f23824v = lVar.e(new a());
                this.f23825w = lVar.e(new C0369b());
                this.f23826x = lVar.e(new c());
                return;
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
        if (i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 6 && i6 != 9 && i6 != 12 && i6 != 14 && i6 != 16 && i6 != 17 && i6 != 19 && i6 != 20) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 2 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 6 && i6 != 9 && i6 != 12 && i6 != 14 && i6 != 16 && i6 != 17 && i6 != 19 && i6 != 20) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 4) {
                    if (i6 != 5) {
                        if (i6 != 6) {
                            if (i6 != 9 && i6 != 12 && i6 != 14 && i6 != 16) {
                                if (i6 != 17) {
                                    if (i6 != 19) {
                                        if (i6 != 20) {
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                                        } else {
                                            objArr[1] = "getDefaultType";
                                        }
                                    } else {
                                        objArr[1] = "substitute";
                                    }
                                } else {
                                    objArr[1] = "getUnsubstitutedMemberScope";
                                }
                            } else {
                                objArr[1] = "getMemberScope";
                            }
                        } else {
                            objArr[1] = "getContextReceivers";
                        }
                    } else {
                        objArr[1] = "getThisAsReceiverParameter";
                    }
                } else {
                    objArr[1] = "getUnsubstitutedInnerClassesScope";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        switch (i6) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5 || i6 == 6 || i6 == 9 || i6 == 12 || i6 == 14 || i6 == 16 || i6 == 17 || i6 == 19 || i6 == 20) {
            throw new IllegalStateException(format);
        }
    }

    @Override // gt.e
    public pu.i A0() {
        pu.i invoke = this.f23825w.invoke();
        if (invoke != null) {
            return invoke;
        }
        D0(4);
        throw null;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.c(this, d10);
    }

    @Override // gt.e
    public pu.i G0() {
        pu.i C0 = C0(mu.a.i(iu.g.d(this)));
        if (C0 != null) {
            return C0;
        }
        D0(17);
        throw null;
    }

    @Override // kt.b0
    public pu.i I(g1 g1Var, xu.e eVar) {
        if (g1Var != null) {
            if (eVar != null) {
                if (g1Var.e()) {
                    pu.i C0 = C0(eVar);
                    if (C0 != null) {
                        return C0;
                    }
                    D0(12);
                    throw null;
                }
                return new pu.m(C0(eVar), j1.e(g1Var));
            }
            D0(11);
            throw null;
        }
        D0(10);
        throw null;
    }

    @Override // gt.s0
    /* renamed from: I0 */
    public gt.e d(j1 j1Var) {
        if (j1Var != null) {
            if (j1Var.h()) {
                return this;
            }
            return new a0(this, j1Var);
        }
        D0(18);
        throw null;
    }

    @Override // gt.e
    public List<gt.n0> J0() {
        List<gt.n0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D0(6);
        throw null;
    }

    @Override // gt.e
    public final gt.n0 L0() {
        gt.n0 invoke = this.f23826x.invoke();
        if (invoke != null) {
            return invoke;
        }
        D0(5);
        throw null;
    }

    @Override // kt.b0, gt.e, gt.j
    public final gt.e b() {
        return this;
    }

    @Override // gt.j
    public final fu.e getName() {
        fu.e eVar = this.f23823u;
        if (eVar != null) {
            return eVar;
        }
        D0(2);
        throw null;
    }

    @Override // gt.e, gt.g
    public final wu.i0 r() {
        wu.i0 invoke = this.f23824v.invoke();
        if (invoke != null) {
            return invoke;
        }
        D0(20);
        throw null;
    }

    @Override // gt.e
    public final pu.i z0(g1 g1Var) {
        if (g1Var != null) {
            pu.i I = I(g1Var, mu.a.i(iu.g.d(this)));
            if (I != null) {
                return I;
            }
            D0(16);
            throw null;
        }
        D0(15);
        throw null;
    }

    @Override // kt.b0, gt.e, gt.j
    public final gt.g b() {
        return this;
    }

    @Override // kt.b0, gt.e, gt.j
    public final gt.j b() {
        return this;
    }
}
