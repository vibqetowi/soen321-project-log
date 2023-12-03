package rt;

import com.theinnerhour.b2b.utils.SessionManager;
import dt.r;
import gt.a;
import gt.b;
import gt.j;
import gt.k0;
import gt.q;
import gt.q0;
import gt.z;
import gt.z0;
import ht.h;
import is.w;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kt.l0;
import kt.m0;
import kt.n0;
import kt.o0;
import pt.d0;
import wu.b0;
import wu.k1;
import xu.a;
/* compiled from: JavaPropertyDescriptor.java */
/* loaded from: classes2.dex */
public class f extends l0 implements a {
    public final boolean V;
    public final hs.f<a.InterfaceC0261a<?>, ?> W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, h hVar, z zVar, q qVar, boolean z10, fu.e eVar, q0 q0Var, k0 k0Var, b.a aVar, boolean z11, hs.f<a.InterfaceC0261a<?>, ?> fVar) {
        super(jVar, k0Var, hVar, zVar, qVar, z10, eVar, aVar, q0Var, false, false, false, false, false, false);
        if (jVar != null) {
            if (hVar != null) {
                if (zVar != null) {
                    if (qVar != null) {
                        if (eVar != null) {
                            if (q0Var != null) {
                                if (aVar != null) {
                                    this.V = z11;
                                    this.W = fVar;
                                    return;
                                }
                                I(6);
                                throw null;
                            }
                            I(5);
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
        if (i6 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 21) {
            i10 = 3;
        } else {
            i10 = 2;
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
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i6 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static f S0(j jVar, st.e eVar, q qVar, boolean z10, fu.e eVar2, vt.a aVar, boolean z11) {
        z zVar = z.FINAL;
        if (jVar != null) {
            if (eVar2 != null) {
                if (aVar != null) {
                    return new f(jVar, eVar, zVar, qVar, z10, eVar2, aVar, null, b.a.DECLARATION, z11, null);
                }
                I(12);
                throw null;
            }
            I(11);
            throw null;
        }
        I(7);
        throw null;
    }

    @Override // kt.w0, gt.a
    public final boolean E() {
        return false;
    }

    @Override // rt.a
    public final a G(b0 b0Var, ArrayList arrayList, b0 b0Var2, hs.f fVar) {
        k0 b10;
        m0 m0Var;
        o0 o0Var;
        n0 n0Var;
        o0 g5;
        gt.m0 h10;
        m0 n10;
        if (b() == this) {
            b10 = null;
        } else {
            b10 = b();
        }
        f fVar2 = new f(c(), getAnnotations(), m(), getVisibility(), this.f23927z, getName(), g(), b10, m0(), this.V, fVar);
        m0 m0Var2 = this.R;
        if (m0Var2 != null) {
            h annotations = m0Var2.getAnnotations();
            z m10 = m0Var2.m();
            q visibility = m0Var2.getVisibility();
            boolean z10 = m0Var2.f23860y;
            boolean z11 = m0Var2.f23861z;
            boolean z12 = m0Var2.C;
            b.a m02 = m0();
            if (b10 == null) {
                n10 = null;
            } else {
                n10 = b10.n();
            }
            m0Var = r14;
            m0 m0Var3 = new m0(fVar2, annotations, m10, visibility, z10, z11, z12, m02, n10, m0Var2.g());
            m0Var.F = m0Var2.F;
            m0Var.O0(b0Var2);
        } else {
            m0Var = null;
        }
        gt.m0 m0Var4 = this.S;
        if (m0Var4 != null) {
            h annotations2 = m0Var4.getAnnotations();
            z m11 = m0Var4.m();
            q visibility2 = m0Var4.getVisibility();
            boolean V = m0Var4.V();
            boolean isExternal = m0Var4.isExternal();
            boolean isInline = m0Var4.isInline();
            b.a m03 = m0();
            if (b10 == null) {
                h10 = null;
            } else {
                h10 = b10.h();
            }
            n0Var = r13;
            n0 n0Var2 = new n0(fVar2, annotations2, m11, visibility2, V, isExternal, isInline, m03, h10, m0Var4.g());
            n0Var.F = n0Var.F;
            z0 z0Var = m0Var4.i().get(0);
            if (z0Var != null) {
                n0Var.G = z0Var;
                o0Var = null;
            } else {
                n0.I(6);
                throw null;
            }
        } else {
            o0Var = null;
            n0Var = null;
        }
        fVar2.P0(m0Var, n0Var, this.T, this.U);
        ss.a<vu.j<ku.g<?>>> aVar = this.B;
        if (aVar != null) {
            fVar2.I0(this.A, aVar);
        }
        fVar2.y0(f());
        if (b0Var == null) {
            g5 = o0Var;
        } else {
            g5 = iu.f.g(this, b0Var, h.a.f19495a);
        }
        fVar2.R0(b0Var2, getTypeParameters(), this.O, g5, w.f20676u);
        return fVar2;
    }

    @Override // kt.l0
    public final l0 N0(j jVar, z zVar, q qVar, k0 k0Var, b.a aVar, fu.e eVar) {
        q0.a aVar2 = q0.f16815a;
        if (jVar != null) {
            if (zVar != null) {
                if (qVar != null) {
                    if (aVar != null) {
                        if (eVar != null) {
                            return new f(jVar, getAnnotations(), zVar, qVar, this.f23927z, eVar, aVar2, k0Var, aVar, this.V, this.W);
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
        I(13);
        throw null;
    }

    @Override // kt.l0, gt.a
    public final <V> V v(a.InterfaceC0261a<V> interfaceC0261a) {
        hs.f<a.InterfaceC0261a<?>, ?> fVar = this.W;
        if (fVar != null && fVar.f19464u.equals(interfaceC0261a)) {
            return (V) fVar.f19465v;
        }
        return null;
    }

    @Override // kt.l0, gt.a1
    public final boolean x() {
        boolean z10;
        b0 type = a();
        if (!this.V) {
            return false;
        }
        i.g(type, "type");
        if (((!dt.j.H(type) && !r.a(type)) || k1.g(type)) && !dt.j.J(type)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        ht.i iVar = xt.w.f38090a;
        fu.c ENHANCED_NULLABILITY_ANNOTATION = d0.f28884p;
        i.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        if (a.C0645a.D(type, ENHANCED_NULLABILITY_ANNOTATION) && !dt.j.J(type)) {
            return false;
        }
        return true;
    }

    @Override // kt.l0
    public final void Q0(b0 b0Var) {
    }
}
