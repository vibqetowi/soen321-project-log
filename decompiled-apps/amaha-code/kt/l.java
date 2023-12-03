package kt;

import gt.b;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import wu.j1;
/* compiled from: ClassConstructorDescriptorImpl.java */
/* loaded from: classes2.dex */
public class l extends x implements gt.d {
    public final boolean Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gt.e eVar, gt.i iVar, ht.h hVar, boolean z10, b.a aVar, gt.q0 q0Var) {
        super(aVar, eVar, iVar, q0Var, hVar, fu.g.f15937e);
        if (eVar != null) {
            if (hVar != null) {
                if (aVar != null) {
                    if (q0Var != null) {
                        this.Y = z10;
                        return;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        if (i6 != 21 && i6 != 27) {
            switch (i6) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i6 != 21 && i6 != 27) {
                switch (i6) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i10 = 3;
                        break;
                }
                Object[] objArr = new Object[i10];
                switch (i6) {
                    case 1:
                    case 5:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case 6:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i6 == 21) {
                    if (i6 != 27) {
                        switch (i6) {
                            case 15:
                            case 16:
                                objArr[1] = "calculateContextReceiverParameters";
                                break;
                            case 17:
                                objArr[1] = "getContainingDeclaration";
                                break;
                            case 18:
                                objArr[1] = "getConstructedClass";
                                break;
                            case 19:
                                objArr[1] = "getOriginal";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                                break;
                        }
                    } else {
                        objArr[1] = "copy";
                    }
                } else {
                    objArr[1] = "getOverriddenDescriptors";
                }
                switch (i6) {
                    case 4:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i6 != 21 && i6 != 27) {
                    switch (i6) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
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
            if (i6 == 21) {
            }
            switch (i6) {
            }
            String format2 = String.format(str, objArr2);
            if (i6 != 21) {
                switch (i6) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i6 != 21) {
            switch (i6) {
            }
            Object[] objArr22 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 21) {
            }
            switch (i6) {
            }
            String format22 = String.format(str, objArr22);
            if (i6 != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i10 = 2;
        Object[] objArr222 = new Object[i10];
        switch (i6) {
        }
        if (i6 == 21) {
        }
        switch (i6) {
        }
        String format222 = String.format(str, objArr222);
        if (i6 != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // gt.i
    public final gt.e A() {
        gt.e c10 = c();
        if (c10 != null) {
            return c10;
        }
        I(18);
        throw null;
    }

    @Override // kt.x, gt.j
    public final <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.k(this, d10);
    }

    @Override // kt.x
    public final gt.u I0(gt.j jVar, gt.z zVar, gt.o oVar) {
        return (gt.d) super.d0(jVar, zVar, oVar);
    }

    @Override // kt.x
    /* renamed from: V0 */
    public l M0(b.a aVar, gt.j jVar, gt.u uVar, gt.q0 q0Var, ht.h hVar, fu.e eVar) {
        if (jVar != null) {
            if (aVar != null) {
                if (hVar != null) {
                    b.a aVar2 = b.a.DECLARATION;
                    if (aVar != aVar2 && aVar != b.a.SYNTHESIZED) {
                        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + jVar + "\nkind: " + aVar);
                    }
                    return new l((gt.e) jVar, this, hVar, this.Y, aVar2, q0Var);
                }
                I(25);
                throw null;
            }
            I(24);
            throw null;
        }
        I(23);
        throw null;
    }

    @Override // kt.q, gt.j
    /* renamed from: W0 */
    public final gt.e c() {
        gt.e eVar = (gt.e) super.c();
        if (eVar != null) {
            return eVar;
        }
        I(17);
        throw null;
    }

    public final void X0(List list, gt.q qVar) {
        if (list != null) {
            if (qVar != null) {
                Y0(list, qVar, c().t());
                return;
            } else {
                I(14);
                throw null;
            }
        }
        I(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(List list, gt.q qVar, List list2) {
        gt.n0 n0Var;
        gt.e c10;
        List<gt.n0> emptyList;
        if (list != null) {
            if (qVar != null) {
                if (list2 != null) {
                    gt.e c11 = c();
                    if (c11.N()) {
                        gt.j c12 = c11.c();
                        if (c12 instanceof gt.e) {
                            n0Var = ((gt.e) c12).L0();
                            c10 = c();
                            if (c10.J0().isEmpty()) {
                                emptyList = c10.J0();
                                if (emptyList == null) {
                                    I(15);
                                    throw null;
                                }
                            } else {
                                emptyList = Collections.emptyList();
                                if (emptyList == null) {
                                    I(16);
                                    throw null;
                                }
                            }
                            P0(null, n0Var, emptyList, list2, list, null, gt.z.FINAL, qVar);
                            return;
                        }
                    }
                    n0Var = null;
                    c10 = c();
                    if (c10.J0().isEmpty()) {
                    }
                    P0(null, n0Var, emptyList, list2, list, null, gt.z.FINAL, qVar);
                    return;
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

    @Override // kt.x, gt.b
    public final gt.b d0(gt.j jVar, gt.z zVar, gt.o oVar) {
        return (gt.d) super.d0(jVar, zVar, oVar);
    }

    @Override // kt.x, gt.u, gt.b, gt.a
    public final Collection<? extends gt.u> f() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        I(21);
        throw null;
    }

    @Override // kt.x, gt.b
    public final void y0(Collection<? extends gt.b> collection) {
        if (collection != null) {
            return;
        }
        I(22);
        throw null;
    }

    @Override // gt.i
    public final boolean z() {
        return this.Y;
    }

    @Override // kt.x, gt.u, gt.s0
    public final gt.d d(j1 j1Var) {
        if (j1Var != null) {
            return (gt.d) super.d(j1Var);
        }
        I(20);
        throw null;
    }

    @Override // kt.x, kt.q, kt.p, gt.j
    public final gt.d b() {
        gt.d dVar = (gt.d) super.b();
        if (dVar != null) {
            return dVar;
        }
        I(19);
        throw null;
    }
}
