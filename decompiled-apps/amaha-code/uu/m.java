package uu;

import au.q;
import gt.b;
import gt.n0;
import gt.q0;
import gt.v0;
import gt.w0;
import gt.z;
import gt.z0;
import ht.h;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kt.o0;
import kt.r0;
import kt.s0;
import kt.x;
import pu.i;
import ta.v;
import wu.i0;
import wu.j1;
import wu.k1;
import wu.n1;
/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes2.dex */
public final class m extends kt.f implements h {
    public final vu.l B;
    public final q C;
    public final cu.c D;
    public final cu.e E;
    public final cu.f F;
    public final g G;
    public Collection<? extends r0> H;
    public i0 I;
    public i0 J;
    public List<? extends v0> K;
    public i0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vu.l storageManager, gt.j containingDeclaration, ht.h hVar, fu.e eVar, gt.q visibility, q proto, cu.c nameResolver, cu.e typeTable, cu.f versionRequirementTable, g gVar) {
        super(containingDeclaration, hVar, eVar, visibility);
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(visibility, "visibility");
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        kotlin.jvm.internal.i.g(versionRequirementTable, "versionRequirementTable");
        this.B = storageManager;
        this.C = proto;
        this.D = nameResolver;
        this.E = typeTable;
        this.F = versionRequirementTable;
        this.G = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v1, types: [kt.x] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [gt.u, kt.s0] */
    public final void I0(List<? extends v0> list, i0 underlyingType, i0 expandedType) {
        pu.i iVar;
        j1 d10;
        gt.d d11;
        o0 o0Var;
        w wVar;
        kotlin.jvm.internal.i.g(underlyingType, "underlyingType");
        kotlin.jvm.internal.i.g(expandedType, "expandedType");
        this.f23836z = list;
        this.I = underlyingType;
        this.J = expandedType;
        this.K = w0.b(this);
        gt.e q10 = q();
        if (q10 == null || (iVar = q10.G0()) == null) {
            iVar = i.b.f29008b;
        }
        this.L = k1.o(this, iVar, new kt.e(this));
        gt.e q11 = q();
        w wVar2 = w.f20676u;
        if (q11 != null) {
            Collection<gt.d> y10 = q11.y();
            kotlin.jvm.internal.i.f(y10, "classDescriptor.constructors");
            ?? arrayList = new ArrayList();
            for (gt.d it : y10) {
                s0.a aVar = s0.c0;
                kotlin.jvm.internal.i.f(it, "it");
                aVar.getClass();
                vu.l storageManager = this.B;
                kotlin.jvm.internal.i.g(storageManager, "storageManager");
                o0 o0Var2 = null;
                if (q() == null) {
                    d10 = null;
                } else {
                    d10 = j1.d(W());
                }
                if (d10 != null && (d11 = it.d(d10)) != null) {
                    ht.h annotations = it.getAnnotations();
                    b.a m02 = it.m0();
                    kotlin.jvm.internal.i.f(m02, "constructor.kind");
                    q0 g5 = g();
                    kotlin.jvm.internal.i.f(g5, "typeAliasDescriptor.source");
                    ?? s0Var = new s0(storageManager, this, d11, null, annotations, m02, g5);
                    List<z0> i6 = it.i();
                    if (i6 != null) {
                        ArrayList O0 = x.O0(s0Var, i6, d10, false, false, null);
                        if (O0 != null) {
                            i0 m03 = kotlin.jvm.internal.h.m0(ca.a.V0(d11.getReturnType().R0()), r());
                            n0 f02 = it.f0();
                            h.a.C0293a c0293a = h.a.f19495a;
                            n1 n1Var = n1.INVARIANT;
                            if (f02 != null) {
                                o0Var = s0Var;
                                o0Var2 = iu.f.g(o0Var, d10.i(f02.a(), n1Var), c0293a);
                            } else {
                                o0Var = s0Var;
                            }
                            o0 o0Var3 = o0Var2;
                            gt.e q12 = q();
                            if (q12 != null) {
                                List<n0> r02 = it.r0();
                                kotlin.jvm.internal.i.f(r02, "constructor.contextReceiverParameters");
                                ?? arrayList2 = new ArrayList(is.i.H1(r02, 10));
                                for (n0 n0Var : r02) {
                                    arrayList2.add(new o0(q12, new qu.b(q12, d10.i(n0Var.a(), n1Var)), c0293a));
                                }
                                wVar = arrayList2;
                            } else {
                                wVar = wVar2;
                            }
                            o0Var.P0(o0Var3, null, wVar, t(), O0, m03, z.FINAL, this.f23835y);
                            o0Var2 = o0Var;
                        }
                    } else {
                        x.I(28);
                        throw null;
                    }
                }
                if (o0Var2 != null) {
                    arrayList.add(o0Var2);
                }
            }
            wVar2 = arrayList;
        }
        this.H = wVar2;
    }

    @Override // uu.h
    public final cu.e T() {
        throw null;
    }

    @Override // gt.u0
    public final i0 W() {
        i0 i0Var = this.J;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.i.q("expandedType");
        throw null;
    }

    @Override // uu.h
    public final cu.c Z() {
        throw null;
    }

    @Override // uu.h
    public final g c0() {
        return this.G;
    }

    @Override // gt.s0
    public final gt.k d(j1 substitutor) {
        kotlin.jvm.internal.i.g(substitutor, "substitutor");
        if (substitutor.h()) {
            return this;
        }
        vu.l lVar = this.B;
        gt.j containingDeclaration = c();
        kotlin.jvm.internal.i.f(containingDeclaration, "containingDeclaration");
        ht.h annotations = getAnnotations();
        kotlin.jvm.internal.i.f(annotations, "annotations");
        fu.e name = getName();
        kotlin.jvm.internal.i.f(name, "name");
        m mVar = new m(lVar, containingDeclaration, annotations, name, this.f23835y, this.C, this.D, this.E, this.F, this.G);
        List<v0> t3 = t();
        i0 g02 = g0();
        n1 n1Var = n1.INVARIANT;
        mVar.I0(t3, kotlin.jvm.internal.h.f(substitutor.i(g02, n1Var)), kotlin.jvm.internal.h.f(substitutor.i(W(), n1Var)));
        return mVar;
    }

    @Override // gt.u0
    public final i0 g0() {
        i0 i0Var = this.I;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.i.q("underlyingType");
        throw null;
    }

    @Override // gt.u0
    public final gt.e q() {
        if (v.E(W())) {
            return null;
        }
        gt.g a10 = W().O0().a();
        if (!(a10 instanceof gt.e)) {
            return null;
        }
        return (gt.e) a10;
    }

    @Override // gt.g
    public final i0 r() {
        i0 i0Var = this.L;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.i.q("defaultTypeImpl");
        throw null;
    }
}
