package kt;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import gt.b;
import gt.u;
import ht.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: SimpleFunctionDescriptorImpl.java */
/* loaded from: classes2.dex */
public class p0 extends x implements gt.p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(gt.j jVar, gt.p0 p0Var, ht.h hVar, fu.e eVar, b.a aVar, gt.q0 q0Var) {
        super(aVar, jVar, p0Var, q0Var, hVar, eVar);
        if (jVar != null) {
            if (hVar != null) {
                if (eVar != null) {
                    if (aVar != null) {
                        if (q0Var != null) {
                            return;
                        } else {
                            I(4);
                            throw null;
                        }
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
        if (i6 != 13 && i6 != 18 && i6 != 23 && i6 != 24 && i6 != 29 && i6 != 30) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 13 && i6 != 18 && i6 != 23 && i6 != 24 && i6 != 29 && i6 != 30) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i6 != 13 && i6 != 18 && i6 != 23) {
            if (i6 != 24) {
                if (i6 != 29) {
                    if (i6 != 30) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                    } else {
                        objArr[1] = "newCopyBuilder";
                    }
                } else {
                    objArr[1] = "copy";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i6) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 13 || i6 == 18 || i6 == 23 || i6 == 24 || i6 == 29 || i6 == 30) {
            throw new IllegalStateException(format);
        }
    }

    public static p0 W0(gt.j jVar, fu.e eVar, b.a aVar, gt.q0 q0Var) {
        h.a.C0293a c0293a = h.a.f19495a;
        if (jVar != null) {
            if (eVar != null) {
                if (q0Var != null) {
                    return new p0(jVar, null, c0293a, eVar, aVar, q0Var);
                }
                I(9);
                throw null;
            }
            I(7);
            throw null;
        }
        I(5);
        throw null;
    }

    @Override // kt.x
    public x M0(b.a aVar, gt.j jVar, gt.u uVar, gt.q0 q0Var, ht.h hVar, fu.e eVar) {
        if (jVar != null) {
            if (aVar != null) {
                if (hVar != null) {
                    gt.p0 p0Var = (gt.p0) uVar;
                    if (eVar == null) {
                        eVar = getName();
                    }
                    return new p0(jVar, p0Var, hVar, eVar, aVar, q0Var);
                }
                I(27);
                throw null;
            }
            I(26);
            throw null;
        }
        I(25);
        throw null;
    }

    @Override // kt.x, gt.b
    /* renamed from: V0 */
    public gt.p0 d0(gt.j jVar, gt.z zVar, gt.o oVar) {
        return (gt.p0) super.d0(jVar, zVar, oVar);
    }

    @Override // kt.x, kt.q, kt.p, gt.j
    /* renamed from: X0 */
    public final gt.p0 b() {
        gt.p0 p0Var = (gt.p0) super.b();
        if (p0Var != null) {
            return p0Var;
        }
        I(24);
        throw null;
    }

    @Override // kt.x
    /* renamed from: Y0 */
    public final p0 P0(o0 o0Var, gt.n0 n0Var, List list, List list2, List list3, wu.b0 b0Var, gt.z zVar, gt.q qVar) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (qVar != null) {
                        p0 Z0 = Z0(o0Var, n0Var, list, list2, list3, b0Var, zVar, qVar, null);
                        if (Z0 != null) {
                            return Z0;
                        }
                        I(18);
                        throw null;
                    }
                    I(17);
                    throw null;
                }
                I(16);
                throw null;
            }
            I(15);
            throw null;
        }
        I(14);
        throw null;
    }

    public p0 Z0(o0 o0Var, gt.n0 n0Var, List list, List list2, List list3, wu.b0 b0Var, gt.z zVar, gt.q qVar, Map map) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (qVar != null) {
                        super.P0(o0Var, n0Var, list, list2, list3, b0Var, zVar, qVar);
                        if (map != null && !map.isEmpty()) {
                            this.X = new LinkedHashMap(map);
                        }
                        return this;
                    }
                    I(22);
                    throw null;
                }
                I(21);
                throw null;
            }
            I(20);
            throw null;
        }
        I(19);
        throw null;
    }

    @Override // kt.x, gt.u
    public u.a<? extends gt.p0> s() {
        return super.s();
    }
}
