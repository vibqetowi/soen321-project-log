package rt;

import com.theinnerhour.b2b.utils.SessionManager;
import cv.f;
import cv.r;
import gt.a;
import gt.b;
import gt.j;
import gt.n0;
import gt.q;
import gt.q0;
import gt.u;
import gt.z;
import gt.z0;
import ht.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kt.o0;
import kt.p0;
import kt.x;
import wu.b0;
/* compiled from: JavaMethodDescriptor.java */
/* loaded from: classes2.dex */
public final class e extends p0 implements rt.a {

    /* renamed from: a0  reason: collision with root package name */
    public static final a f31016a0 = new a();

    /* renamed from: b0  reason: collision with root package name */
    public static final b f31017b0 = new b();
    public int Y;
    public final boolean Z;

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes2.dex */
    public static class a implements a.InterfaceC0261a<z0> {
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes2.dex */
    public static class b implements a.InterfaceC0261a<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, gt.p0 p0Var, h hVar, fu.e eVar, b.a aVar, q0 q0Var, boolean z10) {
        super(jVar, p0Var, hVar, eVar, aVar, q0Var);
        if (jVar != null) {
            if (hVar != null) {
                if (eVar != null) {
                    if (aVar != null) {
                        if (q0Var != null) {
                            this.Y = 0;
                            this.Z = z10;
                            return;
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
        if (i6 != 13 && i6 != 18 && i6 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 13 && i6 != 18 && i6 != 21) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i6 != 13) {
            if (i6 != 18) {
                if (i6 != 21) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                } else {
                    objArr[1] = "enhance";
                }
            } else {
                objArr[1] = "createSubstitutedCopy";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i6) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 == 13 || i6 == 18 || i6 == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static e a1(j jVar, st.e eVar, fu.e eVar2, vt.a aVar, boolean z10) {
        if (jVar != null) {
            if (eVar2 != null) {
                if (aVar != null) {
                    return new e(jVar, null, eVar, eVar2, b.a.DECLARATION, aVar, z10);
                }
                I(8);
                throw null;
            }
            I(7);
            throw null;
        }
        I(5);
        throw null;
    }

    @Override // kt.x, gt.a
    public final boolean E() {
        return ri.e.b(this.Y);
    }

    @Override // rt.a
    public final rt.a G(b0 b0Var, ArrayList arrayList, b0 b0Var2, hs.f fVar) {
        o0 g5;
        ArrayList K = ca.a.K(arrayList, i(), this);
        if (b0Var == null) {
            g5 = null;
        } else {
            g5 = iu.f.g(this, b0Var, h.a.f19495a);
        }
        x.a aVar = (x.a) s();
        aVar.f23910g = K;
        aVar.n(b0Var2);
        aVar.f23912i = g5;
        aVar.f23919p = true;
        aVar.f23918o = true;
        e eVar = (e) aVar.build();
        if (fVar != null) {
            eVar.R0((a.InterfaceC0261a) fVar.f19464u, fVar.f19465v);
        }
        if (eVar != null) {
            return eVar;
        }
        I(21);
        throw null;
    }

    @Override // kt.p0, kt.x
    public final x M0(b.a aVar, j jVar, u uVar, q0 q0Var, h hVar, fu.e eVar) {
        if (jVar != null) {
            if (aVar != null) {
                if (hVar != null) {
                    gt.p0 p0Var = (gt.p0) uVar;
                    if (eVar == null) {
                        eVar = getName();
                    }
                    e eVar2 = new e(jVar, p0Var, hVar, eVar, aVar, q0Var, this.Z);
                    int i6 = this.Y;
                    eVar2.b1(ri.e.a(i6), ri.e.b(i6));
                    return eVar2;
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r5.b(r6) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[SYNTHETIC] */
    @Override // kt.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p0 Z0(o0 o0Var, n0 n0Var, List list, List list2, List list3, b0 b0Var, z zVar, q qVar, Map map) {
        cv.f fVar;
        boolean z10;
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (qVar != null) {
                        super.Z0(o0Var, n0Var, list, list2, list3, b0Var, zVar, qVar, map);
                        r.f12080v.getClass();
                        Iterator<cv.j> it = r.f12081w.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                cv.j next = it.next();
                                next.getClass();
                                int i6 = 0;
                                fu.e eVar = next.f12064a;
                                if (eVar == null || i.b(getName(), eVar)) {
                                    gv.e eVar2 = next.f12065b;
                                    if (eVar2 != null) {
                                        String f = getName().f();
                                        i.f(f, "functionDescriptor.name.asString()");
                                    }
                                    Collection<fu.e> collection = next.f12066c;
                                    if (collection == null || collection.contains(getName())) {
                                        z10 = true;
                                        continue;
                                        if (z10) {
                                            cv.e[] eVarArr = next.f12068e;
                                            int length = eVarArr.length;
                                            while (true) {
                                                if (i6 < length) {
                                                    String b10 = eVarArr[i6].b(this);
                                                    if (b10 != null) {
                                                        fVar = new f.b(b10);
                                                        break;
                                                    }
                                                    i6++;
                                                } else {
                                                    String invoke = next.f12067d.invoke(this);
                                                    if (invoke != null) {
                                                        fVar = new f.b(invoke);
                                                    } else {
                                                        fVar = f.c.f12060b;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                continue;
                                if (z10) {
                                }
                            } else {
                                fVar = f.a.f12059b;
                                break;
                            }
                        }
                        this.G = fVar.f12058a;
                        return this;
                    }
                    I(12);
                    throw null;
                }
                I(11);
                throw null;
            }
            I(10);
            throw null;
        }
        I(9);
        throw null;
    }

    public final void b1(boolean z10, boolean z11) {
        int i6;
        if (z10) {
            if (z11) {
                i6 = 4;
            } else {
                i6 = 2;
            }
        } else if (z11) {
            i6 = 3;
        } else {
            i6 = 1;
        }
        this.Y = i6;
    }
}
