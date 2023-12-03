package iu;

import com.appsflyer.R;
import gt.b;
import gt.k0;
import gt.q0;
import gt.z;
import ht.h;
import java.util.Collections;
import java.util.List;
import kt.m0;
import kt.n0;
import kt.o0;
import kt.p0;
import kt.v0;
import wu.b0;
/* compiled from: DescriptorFactory.java */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: DescriptorFactory.java */
    /* loaded from: classes2.dex */
    public static class a extends kt.l {
        public a(uu.d dVar) {
            super(dVar, null, h.a.f19495a, true, b.a.DECLARATION, q0.f16815a);
            gt.q qVar;
            List emptyList = Collections.emptyList();
            int i6 = g.f20688a;
            int i10 = dVar.E;
            if (i10 != 3 && !defpackage.e.b(i10)) {
                if (g.q(dVar)) {
                    qVar = gt.p.f16800a;
                    if (qVar == null) {
                        g.a(51);
                        throw null;
                    }
                } else if (g.k(dVar)) {
                    qVar = gt.p.f16809k;
                    if (qVar == null) {
                        g.a(52);
                        throw null;
                    }
                } else {
                    qVar = gt.p.f16804e;
                    if (qVar == null) {
                        g.a(53);
                        throw null;
                    }
                }
            } else {
                qVar = gt.p.f16800a;
                if (qVar == null) {
                    g.a(49);
                    throw null;
                }
            }
            X0(emptyList, qVar);
        }
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 12 && i6 != 23 && i6 != 25) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 12 && i6 != 23 && i6 != 25) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case 32:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                objArr[0] = "owner";
                break;
        }
        if (i6 != 12) {
            if (i6 != 23) {
                if (i6 != 25) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                } else {
                    objArr[1] = "createEnumValueOfMethod";
                }
            } else {
                objArr[1] = "createEnumValuesMethod";
            }
        } else {
            objArr[1] = "createSetter";
        }
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 12 || i6 == 23 || i6 == 25) {
            throw new IllegalStateException(format);
        }
    }

    public static o0 b(gt.a aVar, b0 b0Var, ht.h hVar) {
        if (hVar != null) {
            if (b0Var == null) {
                return null;
            }
            return new o0(aVar, new qu.b(aVar, b0Var, null, 0), hVar);
        }
        a(32);
        throw null;
    }

    public static m0 c(k0 k0Var, ht.h hVar) {
        return h(k0Var, hVar, true, k0Var.g());
    }

    public static n0 d(k0 k0Var, ht.h hVar) {
        h.a.C0293a c0293a = h.a.f19495a;
        q0 g5 = k0Var.g();
        if (g5 != null) {
            return i(k0Var, hVar, c0293a, true, k0Var.getVisibility(), g5);
        }
        a(6);
        throw null;
    }

    public static p0 e(gt.e eVar) {
        if (eVar != null) {
            h.a.C0293a c0293a = h.a.f19495a;
            p0 W0 = p0.W0(eVar, dt.n.f13383b, b.a.SYNTHESIZED, eVar.g());
            return W0.P0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new v0(W0, null, 0, c0293a, fu.e.j("value"), mu.a.e(eVar).v(), false, false, false, null, eVar.g())), eVar.r(), z.FINAL, gt.p.f16804e);
        }
        a(24);
        throw null;
    }

    public static p0 f(gt.e eVar) {
        if (eVar != null) {
            return p0.W0(eVar, dt.n.f13382a, b.a.SYNTHESIZED, eVar.g()).P0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), mu.a.e(eVar).h(eVar.r()), z.FINAL, gt.p.f16804e);
        }
        a(22);
        throw null;
    }

    public static o0 g(gt.a aVar, b0 b0Var, ht.h hVar) {
        if (aVar != null) {
            if (b0Var == null) {
                return null;
            }
            return new o0(aVar, new qu.b(aVar, b0Var, null, 1), hVar);
        }
        a(29);
        throw null;
    }

    public static m0 h(k0 k0Var, ht.h hVar, boolean z10, q0 q0Var) {
        if (hVar != null) {
            if (q0Var != null) {
                return new m0(k0Var, hVar, k0Var.m(), k0Var.getVisibility(), z10, false, false, b.a.DECLARATION, null, q0Var);
            }
            a(19);
            throw null;
        }
        a(18);
        throw null;
    }

    public static n0 i(k0 k0Var, ht.h hVar, ht.h hVar2, boolean z10, gt.q qVar, q0 q0Var) {
        if (hVar != null) {
            if (hVar2 != null) {
                if (qVar != null) {
                    if (q0Var != null) {
                        n0 n0Var = new n0(k0Var, hVar, k0Var.m(), qVar, z10, false, false, b.a.DECLARATION, null, q0Var);
                        n0Var.G = n0.N0(n0Var, k0Var.a(), hVar2);
                        return n0Var;
                    }
                    a(11);
                    throw null;
                }
                a(10);
                throw null;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean j(gt.u uVar) {
        if (uVar.m0() == b.a.SYNTHESIZED && g.n(uVar.c(), 3)) {
            return true;
        }
        return false;
    }
}
