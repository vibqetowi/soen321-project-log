package kt;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import gt.a;
import gt.b;
import gt.q0;
import gt.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import wu.g1;
import wu.j1;
import wu.n1;
/* compiled from: PropertyDescriptorImpl.java */
/* loaded from: classes2.dex */
public class l0 extends x0 implements gt.k0 {
    public final gt.z C;
    public gt.q D;
    public Collection<? extends gt.k0> E;
    public final gt.k0 F;
    public final b.a G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public List<gt.n0> N;
    public gt.n0 O;
    public gt.n0 P;
    public ArrayList Q;
    public m0 R;
    public gt.m0 S;
    public gt.s T;
    public gt.s U;

    /* compiled from: PropertyDescriptorImpl.java */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a */
        public gt.j f23862a;

        /* renamed from: b */
        public gt.z f23863b;

        /* renamed from: c */
        public gt.q f23864c;

        /* renamed from: e */
        public b.a f23866e;

        /* renamed from: h */
        public final gt.n0 f23868h;

        /* renamed from: i */
        public final fu.e f23869i;

        /* renamed from: j */
        public final wu.b0 f23870j;

        /* renamed from: d */
        public gt.k0 f23865d = null;
        public g1 f = g1.f37244a;

        /* renamed from: g */
        public boolean f23867g = true;

        public a() {
            l0.this = r2;
            this.f23862a = r2.c();
            this.f23863b = r2.m();
            this.f23864c = r2.getVisibility();
            this.f23866e = r2.m0();
            this.f23868h = r2.O;
            this.f23869i = r2.getName();
            this.f23870j = r2.a();
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 5 && i6 != 7 && i6 != 9 && i6 != 11 && i6 != 19 && i6 != 13 && i6 != 14 && i6 != 16 && i6 != 17) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 5 && i6 != 7 && i6 != 9 && i6 != 11 && i6 != 19 && i6 != 13 && i6 != 14 && i6 != 16 && i6 != 17) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = SessionManager.KEY_NAME;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 5) {
                            if (i6 != 7) {
                                if (i6 != 9) {
                                    if (i6 != 11) {
                                        if (i6 != 19) {
                                            if (i6 != 13) {
                                                if (i6 != 14) {
                                                    if (i6 != 16) {
                                                        if (i6 != 17) {
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                                                        } else {
                                                            objArr[1] = "setCopyOverrides";
                                                        }
                                                    } else {
                                                        objArr[1] = "setSubstitution";
                                                    }
                                                } else {
                                                    objArr[1] = "setDispatchReceiverParameter";
                                                }
                                            } else {
                                                objArr[1] = "setTypeParameters";
                                            }
                                        } else {
                                            objArr[1] = "setName";
                                        }
                                    } else {
                                        objArr[1] = "setKind";
                                    }
                                } else {
                                    objArr[1] = "setVisibility";
                                }
                            } else {
                                objArr[1] = "setModality";
                            }
                        } else {
                            objArr[1] = "setReturnType";
                        }
                    } else {
                        objArr[1] = "setPreserveSourceElement";
                    }
                } else {
                    objArr[1] = "setOriginal";
                }
            } else {
                objArr[1] = "setOwner";
            }
            switch (i6) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 5 || i6 == 7 || i6 == 9 || i6 == 11 || i6 == 19 || i6 == 13 || i6 == 14 || i6 == 16 || i6 == 17) {
                throw new IllegalStateException(format);
            }
        }

        public final l0 b() {
            d dVar;
            o0 o0Var;
            m0 n10;
            int i6;
            m0 m0Var;
            n0 n0Var;
            gt.m0 h10;
            u uVar;
            ss.a<vu.j<ku.g<?>>> aVar;
            wu.b0 b0Var;
            o0 o0Var2;
            Iterator<gt.n0> it;
            n1 n1Var;
            wu.b0 k10;
            l0 l0Var = l0.this;
            l0Var.getClass();
            gt.j jVar = this.f23862a;
            gt.z zVar = this.f23863b;
            gt.q qVar = this.f23864c;
            gt.k0 k0Var = this.f23865d;
            b.a aVar2 = this.f23866e;
            fu.e eVar = this.f23869i;
            q0.a aVar3 = gt.q0.f16815a;
            l0 N0 = l0Var.N0(jVar, zVar, qVar, k0Var, aVar2, eVar);
            List<gt.v0> typeParameters = l0Var.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            j1 q1 = ca.a.q1(typeParameters, this.f, N0, arrayList);
            n1 n1Var2 = n1.OUT_VARIANCE;
            wu.b0 b0Var2 = this.f23870j;
            wu.b0 k11 = q1.k(b0Var2, n1Var2);
            if (k11 != null) {
                n1 n1Var3 = n1.IN_VARIANCE;
                wu.b0 k12 = q1.k(b0Var2, n1Var3);
                if (k12 != null) {
                    N0.Q0(k12);
                }
                gt.n0 n0Var2 = this.f23868h;
                if (n0Var2 != null) {
                    d d10 = n0Var2.d(q1);
                    if (d10 != null) {
                        dVar = d10;
                    }
                } else {
                    dVar = null;
                }
                gt.n0 n0Var3 = l0Var.P;
                if (n0Var3 != null && (k10 = q1.k(n0Var3.a(), n1Var3)) != null) {
                    o0Var = new o0(N0, new qu.b(N0, k10, n0Var3.getValue(), 1), n0Var3.getAnnotations());
                } else {
                    o0Var = null;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<gt.n0> it2 = l0Var.N.iterator();
                while (it2.hasNext()) {
                    gt.n0 next = it2.next();
                    wu.b0 k13 = q1.k(next.a(), n1Var3);
                    if (k13 == null) {
                        it = it2;
                        n1Var = n1Var3;
                        o0Var2 = null;
                    } else {
                        it = it2;
                        n1Var = n1Var3;
                        o0Var2 = new o0(N0, new qu.b(N0, k13, next.getValue(), 0), next.getAnnotations());
                    }
                    if (o0Var2 != null) {
                        arrayList2.add(o0Var2);
                    }
                    it2 = it;
                    n1Var3 = n1Var;
                }
                N0.R0(k11, arrayList, dVar, o0Var, arrayList2);
                m0 m0Var2 = l0Var.R;
                b.a aVar4 = b.a.FAKE_OVERRIDE;
                if (m0Var2 == null) {
                    m0Var = null;
                    i6 = 0;
                } else {
                    ht.h annotations = m0Var2.getAnnotations();
                    gt.z zVar2 = this.f23863b;
                    gt.q visibility = l0Var.R.getVisibility();
                    if (this.f23866e == aVar4 && gt.p.e(visibility.d())) {
                        visibility = gt.p.f16806h;
                    }
                    gt.q qVar2 = visibility;
                    m0 m0Var3 = l0Var.R;
                    boolean z10 = m0Var3.f23860y;
                    boolean z11 = m0Var3.f23861z;
                    boolean z12 = m0Var3.C;
                    b.a aVar5 = this.f23866e;
                    gt.k0 k0Var2 = this.f23865d;
                    if (k0Var2 == null) {
                        n10 = null;
                    } else {
                        n10 = k0Var2.n();
                    }
                    i6 = 0;
                    m0Var = new m0(N0, annotations, zVar2, qVar2, z10, z11, z12, aVar5, n10, aVar3);
                }
                if (m0Var != null) {
                    m0 m0Var4 = l0Var.R;
                    wu.b0 b0Var3 = m0Var4.G;
                    m0Var.F = l0.O0(q1, m0Var4);
                    if (b0Var3 != null) {
                        b0Var = q1.k(b0Var3, n1Var2);
                    } else {
                        b0Var = null;
                    }
                    m0Var.O0(b0Var);
                }
                gt.m0 m0Var5 = l0Var.S;
                if (m0Var5 == null) {
                    n0Var = null;
                } else {
                    ht.h annotations2 = m0Var5.getAnnotations();
                    gt.z zVar3 = this.f23863b;
                    gt.q visibility2 = l0Var.S.getVisibility();
                    if (this.f23866e == aVar4 && gt.p.e(visibility2.d())) {
                        visibility2 = gt.p.f16806h;
                    }
                    gt.q qVar3 = visibility2;
                    boolean V = l0Var.S.V();
                    boolean isExternal = l0Var.S.isExternal();
                    boolean isInline = l0Var.S.isInline();
                    b.a aVar6 = this.f23866e;
                    gt.k0 k0Var3 = this.f23865d;
                    if (k0Var3 == null) {
                        h10 = null;
                    } else {
                        h10 = k0Var3.h();
                    }
                    n0Var = new n0(N0, annotations2, zVar3, qVar3, V, isExternal, isInline, aVar6, h10, aVar3);
                }
                if (n0Var != null) {
                    List O0 = x.O0(n0Var, l0Var.S.i(), q1, false, false, null);
                    if (O0 == null) {
                        O0 = Collections.singletonList(n0.N0(n0Var, mu.a.e(this.f23862a).o(), l0Var.S.i().get(i6).getAnnotations()));
                    }
                    if (O0.size() == 1) {
                        n0Var.F = l0.O0(q1, l0Var.S);
                        z0 z0Var = (z0) O0.get(i6);
                        if (z0Var != null) {
                            n0Var.G = z0Var;
                        } else {
                            n0.I(6);
                            throw null;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                u uVar2 = null;
                gt.s sVar = l0Var.T;
                if (sVar == null) {
                    uVar = null;
                } else {
                    uVar = new u(N0, sVar.getAnnotations());
                }
                gt.s sVar2 = l0Var.U;
                if (sVar2 != null) {
                    uVar2 = new u(N0, sVar2.getAnnotations());
                }
                N0.P0(m0Var, n0Var, uVar, uVar2);
                if (this.f23867g) {
                    dv.e eVar2 = new dv.e();
                    for (gt.k0 k0Var4 : l0Var.f()) {
                        eVar2.add(k0Var4.d(q1));
                    }
                    N0.y0(eVar2);
                }
                if (l0Var.x() && (aVar = l0Var.B) != null) {
                    N0.I0(l0Var.A, aVar);
                    return N0;
                }
                return N0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(gt.j jVar, gt.k0 k0Var, ht.h hVar, gt.z zVar, gt.q qVar, boolean z10, fu.e eVar, b.a aVar, gt.q0 q0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(jVar, hVar, eVar, z10, q0Var);
        if (jVar == null) {
            I(0);
            throw null;
        } else if (hVar == null) {
            I(1);
            throw null;
        } else if (zVar == null) {
            I(2);
            throw null;
        } else if (qVar == null) {
            I(3);
            throw null;
        } else if (eVar == null) {
            I(4);
            throw null;
        } else if (aVar == null) {
            I(5);
            throw null;
        } else if (q0Var != null) {
            this.E = null;
            this.N = Collections.emptyList();
            this.C = zVar;
            this.D = qVar;
            this.F = k0Var == null ? this : k0Var;
            this.G = aVar;
            this.H = z11;
            this.I = z12;
            this.J = z13;
            this.K = z14;
            this.L = z15;
            this.M = z16;
        } else {
            I(6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 28 && i6 != 38 && i6 != 39 && i6 != 41 && i6 != 42) {
            switch (i6) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i6 != 28 && i6 != 38 && i6 != 39 && i6 != 41 && i6 != 42) {
                switch (i6) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i10 = 3;
                        break;
                }
                Object[] objArr = new Object[i10];
                switch (i6) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = SessionManager.KEY_NAME;
                        break;
                    case 5:
                    case 12:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        objArr[0] = "source";
                        break;
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        objArr[0] = "substitutor";
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        objArr[0] = "newModality";
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i6 == 28) {
                    if (i6 != 38) {
                        if (i6 != 39) {
                            if (i6 != 41) {
                                if (i6 != 42) {
                                    switch (i6) {
                                        case 21:
                                            objArr[1] = "getTypeParameters";
                                            break;
                                        case 22:
                                            objArr[1] = "getContextReceiverParameters";
                                            break;
                                        case 23:
                                            objArr[1] = "getReturnType";
                                            break;
                                        case 24:
                                            objArr[1] = "getModality";
                                            break;
                                        case 25:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 26:
                                            objArr[1] = "getAccessors";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                                            break;
                                    }
                                } else {
                                    objArr[1] = "copy";
                                }
                            } else {
                                objArr[1] = "getOverriddenDescriptors";
                            }
                        } else {
                            objArr[1] = "getKind";
                        }
                    } else {
                        objArr[1] = "getOriginal";
                    }
                } else {
                    objArr[1] = "getSourceToUseForCopy";
                }
                switch (i6) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case 36:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i6 != 28 && i6 != 38 && i6 != 39 && i6 != 41 && i6 != 42) {
                    switch (i6) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i10 = 2;
            Object[] objArr2 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 28) {
            }
            switch (i6) {
            }
            String format2 = String.format(str, objArr2);
            if (i6 != 28) {
                switch (i6) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i6 != 28) {
            switch (i6) {
            }
            Object[] objArr22 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 28) {
            }
            switch (i6) {
            }
            String format22 = String.format(str, objArr22);
            if (i6 != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i10 = 2;
        Object[] objArr222 = new Object[i10];
        switch (i6) {
        }
        if (i6 == 28) {
        }
        switch (i6) {
        }
        String format222 = String.format(str, objArr222);
        if (i6 != 28) {
        }
        throw new IllegalStateException(format222);
    }

    public static gt.u O0(j1 j1Var, gt.j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.e0() == null) {
                return null;
            }
            return j0Var.e0().d(j1Var);
        }
        I(31);
        throw null;
    }

    @Override // gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.j(this, d10);
    }

    @Override // gt.y
    public final boolean H0() {
        return this.K;
    }

    @Override // gt.y
    public final boolean M() {
        return this.J;
    }

    @Override // gt.b
    /* renamed from: M0 */
    public final l0 d0(gt.j jVar, gt.z zVar, gt.o oVar) {
        b.a aVar = b.a.FAKE_OVERRIDE;
        a aVar2 = new a();
        if (jVar != null) {
            aVar2.f23862a = jVar;
            aVar2.f23865d = null;
            aVar2.f23863b = zVar;
            if (oVar != null) {
                aVar2.f23864c = oVar;
                aVar2.f23866e = aVar;
                aVar2.f23867g = false;
                l0 b10 = aVar2.b();
                if (b10 != null) {
                    return b10;
                }
                I(42);
                throw null;
            }
            a.a(8);
            throw null;
        }
        a.a(0);
        throw null;
    }

    public l0 N0(gt.j jVar, gt.z zVar, gt.q qVar, gt.k0 k0Var, b.a aVar, fu.e eVar) {
        q0.a aVar2 = gt.q0.f16815a;
        if (jVar != null) {
            if (zVar != null) {
                if (qVar != null) {
                    if (aVar != null) {
                        if (eVar != null) {
                            return new l0(jVar, k0Var, getAnnotations(), zVar, qVar, this.f23927z, eVar, aVar, aVar2, this.H, x(), this.J, this.K, isExternal(), this.M);
                        }
                        I(36);
                        throw null;
                    }
                    I(35);
                    throw null;
                }
                I(34);
                throw null;
            }
            I(33);
            throw null;
        }
        I(32);
        throw null;
    }

    @Override // gt.k0
    public final boolean P() {
        return this.M;
    }

    public final void P0(m0 m0Var, n0 n0Var, gt.s sVar, gt.s sVar2) {
        this.R = m0Var;
        this.S = n0Var;
        this.T = sVar;
        this.U = sVar2;
    }

    public final void R0(wu.b0 b0Var, List list, gt.n0 n0Var, o0 o0Var, List list2) {
        if (b0Var != null) {
            this.f23902y = b0Var;
            this.Q = new ArrayList(list);
            this.P = o0Var;
            this.O = n0Var;
            this.N = list2;
            return;
        }
        I(17);
        throw null;
    }

    @Override // gt.a
    public final Collection<? extends gt.k0> f() {
        Collection<? extends gt.k0> collection = this.E;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        I(41);
        throw null;
    }

    @Override // kt.w0, gt.a
    public final gt.n0 f0() {
        return this.O;
    }

    @Override // kt.w0, gt.a
    public final wu.b0 getReturnType() {
        wu.b0 a10 = a();
        if (a10 != null) {
            return a10;
        }
        I(23);
        throw null;
    }

    @Override // kt.w0, gt.a
    public final List<gt.v0> getTypeParameters() {
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(p.C0(this)));
    }

    @Override // gt.n, gt.y
    public final gt.q getVisibility() {
        gt.q qVar = this.D;
        if (qVar != null) {
            return qVar;
        }
        I(25);
        throw null;
    }

    @Override // gt.k0
    public final gt.m0 h() {
        return this.S;
    }

    @Override // gt.y
    public boolean isExternal() {
        return this.L;
    }

    @Override // kt.w0, gt.a
    public final gt.n0 k0() {
        return this.P;
    }

    @Override // gt.k0
    public final gt.s l0() {
        return this.U;
    }

    @Override // gt.y
    public final gt.z m() {
        gt.z zVar = this.C;
        if (zVar != null) {
            return zVar;
        }
        I(24);
        throw null;
    }

    @Override // gt.b
    public final b.a m0() {
        b.a aVar = this.G;
        if (aVar != null) {
            return aVar;
        }
        I(39);
        throw null;
    }

    @Override // gt.k0
    public final m0 n() {
        return this.R;
    }

    @Override // gt.k0
    public final gt.s q0() {
        return this.T;
    }

    @Override // gt.a
    public final List<gt.n0> r0() {
        List<gt.n0> list = this.N;
        if (list != null) {
            return list;
        }
        I(22);
        throw null;
    }

    @Override // gt.a1
    public final boolean t0() {
        return this.H;
    }

    @Override // gt.k0
    public final ArrayList u() {
        ArrayList arrayList = new ArrayList(2);
        m0 m0Var = this.R;
        if (m0Var != null) {
            arrayList.add(m0Var);
        }
        gt.m0 m0Var2 = this.S;
        if (m0Var2 != null) {
            arrayList.add(m0Var2);
        }
        return arrayList;
    }

    @Override // gt.a
    public <V> V v(a.InterfaceC0261a<V> interfaceC0261a) {
        return null;
    }

    @Override // gt.a1
    public boolean x() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gt.b
    public final void y0(Collection<? extends gt.b> collection) {
        if (collection != 0) {
            this.E = collection;
        } else {
            I(40);
            throw null;
        }
    }

    @Override // gt.s0
    public final gt.k0 d(j1 j1Var) {
        if (j1Var != null) {
            if (j1Var.h()) {
                return this;
            }
            a aVar = new a();
            g1 g5 = j1Var.g();
            if (g5 != null) {
                aVar.f = g5;
                aVar.f23865d = b();
                return aVar.b();
            }
            a.a(15);
            throw null;
        }
        I(27);
        throw null;
    }

    @Override // kt.q, kt.p, gt.j
    public final gt.k0 b() {
        gt.k0 k0Var = this.F;
        gt.k0 b10 = k0Var == this ? this : k0Var.b();
        if (b10 != null) {
            return b10;
        }
        I(38);
        throw null;
    }

    public void Q0(wu.b0 b0Var) {
    }
}
