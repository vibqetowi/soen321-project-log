package su;

import cu.b;
import gt.b;
import gt.n0;
import gt.q0;
import gt.v0;
import gt.z0;
import ht.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kt.m0;
import kt.o0;
import su.f0;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final j7.k f32074a;

    /* renamed from: b  reason: collision with root package name */
    public final f f32075b;

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends ht.c>> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ gu.n f32077v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ su.c f32078w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gu.n nVar, su.c cVar) {
            super(0);
            this.f32077v = nVar;
            this.f32078w = cVar;
        }

        @Override // ss.a
        public final List<? extends ht.c> invoke() {
            List<? extends ht.c> list;
            y yVar = y.this;
            f0 a10 = yVar.a((gt.j) yVar.f32074a.f21734w);
            if (a10 != null) {
                list = is.u.I2(((l) yVar.f32074a.f21732u).f32048e.g(a10, this.f32077v, this.f32078w));
            } else {
                list = null;
            }
            if (list == null) {
                return is.w.f20676u;
            }
            return list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<List<? extends ht.c>> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f32080v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ au.m f32081w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, au.m mVar) {
            super(0);
            this.f32080v = z10;
            this.f32081w = mVar;
        }

        @Override // ss.a
        public final List<? extends ht.c> invoke() {
            List<? extends ht.c> list;
            y yVar = y.this;
            f0 a10 = yVar.a((gt.j) yVar.f32074a.f21734w);
            if (a10 != null) {
                j7.k kVar = yVar.f32074a;
                boolean z10 = this.f32080v;
                au.m mVar = this.f32081w;
                if (z10) {
                    list = is.u.I2(((l) kVar.f21732u).f32048e.i(a10, mVar));
                } else {
                    list = is.u.I2(((l) kVar.f21732u).f32048e.f(a10, mVar));
                }
            } else {
                list = null;
            }
            if (list == null) {
                return is.w.f20676u;
            }
            return list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<List<? extends ht.c>> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ f0 f32083v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ gu.n f32084w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ su.c f32085x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f32086y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ au.t f32087z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f0 f0Var, gu.n nVar, su.c cVar, int i6, au.t tVar) {
            super(0);
            this.f32083v = f0Var;
            this.f32084w = nVar;
            this.f32085x = cVar;
            this.f32086y = i6;
            this.f32087z = tVar;
        }

        @Override // ss.a
        public final List<? extends ht.c> invoke() {
            return is.u.I2(((l) y.this.f32074a.f21732u).f32048e.c(this.f32083v, this.f32084w, this.f32085x, this.f32086y, this.f32087z));
        }
    }

    public y(j7.k c10) {
        kotlin.jvm.internal.i.g(c10, "c");
        this.f32074a = c10;
        Object obj = c10.f21732u;
        this.f32075b = new f(((l) obj).f32045b, ((l) obj).f32054l);
    }

    public final f0 a(gt.j jVar) {
        if (jVar instanceof gt.d0) {
            fu.c e10 = ((gt.d0) jVar).e();
            j7.k kVar = this.f32074a;
            return new f0.b(e10, (cu.c) kVar.f21733v, (cu.e) kVar.f21735x, (uu.g) kVar.A);
        } else if (jVar instanceof uu.d) {
            return ((uu.d) jVar).Q;
        } else {
            return null;
        }
    }

    public final ht.h b(gu.n nVar, int i6, su.c cVar) {
        if (!cu.b.f12021c.c(i6).booleanValue()) {
            return h.a.f19495a;
        }
        return new uu.o(this.f32074a.c(), new a(nVar, cVar));
    }

    public final ht.h c(au.m mVar, boolean z10) {
        if (!cu.b.f12021c.c(mVar.f3769x).booleanValue()) {
            return h.a.f19495a;
        }
        return new uu.o(this.f32074a.c(), new b(z10, mVar));
    }

    public final uu.c d(au.c cVar, boolean z10) {
        j7.k a10;
        j7.k kVar = this.f32074a;
        gt.j jVar = (gt.j) kVar.f21734w;
        kotlin.jvm.internal.i.e(jVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        gt.e eVar = (gt.e) jVar;
        int i6 = cVar.f3681x;
        su.c cVar2 = su.c.FUNCTION;
        uu.c cVar3 = new uu.c(eVar, null, b(cVar, i6, cVar2), z10, b.a.DECLARATION, cVar, (cu.c) kVar.f21733v, (cu.e) kVar.f21735x, (cu.f) kVar.f21736y, (uu.g) kVar.A, null);
        a10 = kVar.a(cVar3, is.w.f20676u, (cu.c) kVar.f21733v, (cu.e) kVar.f21735x, (cu.f) kVar.f21736y, (cu.a) kVar.f21737z);
        List<au.t> list = cVar.f3682y;
        kotlin.jvm.internal.i.f(list, "proto.valueParameterList");
        cVar3.X0(((y) a10.C).h(list, cVar, cVar2), h0.a((au.w) cu.b.f12022d.c(cVar.f3681x)));
        cVar3.U0(eVar.r());
        cVar3.L = eVar.M();
        cVar3.Q = !cu.b.f12031n.c(cVar.f3681x).booleanValue();
        return cVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r1 != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uu.l e(au.h proto) {
        boolean z10;
        int i6;
        boolean z11;
        ht.h hVar;
        cu.f fVar;
        j7.k a10;
        o0 o0Var;
        gt.e eVar;
        n0 n0Var;
        wu.b0 g5;
        boolean z12;
        kotlin.jvm.internal.i.g(proto, "proto");
        boolean z13 = false;
        if ((proto.f3740w & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i6 = proto.f3741x;
        } else {
            int i10 = proto.f3742y;
            i6 = ((i10 >> 8) << 6) + (i10 & 63);
        }
        int i11 = i6;
        su.c cVar = su.c.FUNCTION;
        ht.h b10 = b(proto, i11, cVar);
        int i12 = proto.f3740w;
        if ((i12 & 32) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if ((i12 & 64) == 64) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        z13 = true;
        ht.h hVar2 = h.a.f19495a;
        j7.k kVar = this.f32074a;
        if (z13) {
            hVar = new uu.a(kVar.c(), new z(this, proto, cVar));
        } else {
            hVar = hVar2;
        }
        fu.c g10 = mu.a.g((gt.j) kVar.f21734w);
        Object obj = kVar.f21733v;
        if (kotlin.jvm.internal.i.b(g10.c(ta.v.x((cu.c) obj, proto.f3743z)), i0.f32022a)) {
            fVar = cu.f.f12049b;
        } else {
            fVar = (cu.f) kVar.f21736y;
        }
        ht.h hVar3 = hVar;
        uu.l lVar = new uu.l((gt.j) kVar.f21734w, null, b10, ta.v.x((cu.c) obj, proto.f3743z), h0.b((au.i) cu.b.f12032o.c(i11)), proto, (cu.c) obj, (cu.e) kVar.f21735x, fVar, (uu.g) kVar.A, null);
        List<au.r> list = proto.C;
        kotlin.jvm.internal.i.f(list, "proto.typeParameterList");
        a10 = kVar.a(lVar, list, (cu.c) kVar.f21733v, (cu.e) kVar.f21735x, (cu.f) kVar.f21736y, (cu.a) kVar.f21737z);
        au.p d12 = ca.a.d1(proto, (cu.e) kVar.f21735x);
        ArrayList<au.p> arrayList = null;
        Object obj2 = a10.B;
        if (d12 != null && (g5 = ((j0) obj2).g(d12)) != null) {
            o0Var = iu.f.g(lVar, g5, hVar3);
        } else {
            o0Var = null;
        }
        gt.j jVar = (gt.j) kVar.f21734w;
        if (jVar instanceof gt.e) {
            eVar = (gt.e) jVar;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            n0Var = eVar.L0();
        } else {
            n0Var = null;
        }
        cu.e typeTable = (cu.e) kVar.f21735x;
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        List<au.p> list2 = proto.F;
        if (!list2.isEmpty()) {
            arrayList = list2;
        }
        if (arrayList == null) {
            List<Integer> contextReceiverTypeIdList = proto.G;
            kotlin.jvm.internal.i.f(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            ArrayList arrayList2 = new ArrayList(is.i.H1(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                kotlin.jvm.internal.i.f(it, "it");
                arrayList2.add(typeTable.a(it.intValue()));
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (au.p pVar : arrayList) {
            o0 b11 = iu.f.b(lVar, ((j0) obj2).g(pVar), hVar2);
            if (b11 != null) {
                arrayList3.add(b11);
            }
        }
        j0 j0Var = (j0) obj2;
        List<v0> b12 = j0Var.b();
        List<au.t> list3 = proto.I;
        kotlin.jvm.internal.i.f(list3, "proto.valueParameterList");
        lVar.Z0(o0Var, n0Var, arrayList3, b12, ((y) a10.C).h(list3, proto, cVar), j0Var.g(ca.a.j1(proto, (cu.e) kVar.f21735x)), g0.a((au.j) cu.b.f12023e.c(i11)), h0.a((au.w) cu.b.f12022d.c(i11)), is.x.f20677u);
        lVar.G = ri.e.g(cu.b.f12033p, i11, "IS_OPERATOR.get(flags)");
        lVar.H = ri.e.g(cu.b.f12034q, i11, "IS_INFIX.get(flags)");
        lVar.I = ri.e.g(cu.b.f12036t, i11, "IS_EXTERNAL_FUNCTION.get(flags)");
        lVar.J = ri.e.g(cu.b.r, i11, "IS_INLINE.get(flags)");
        lVar.K = ri.e.g(cu.b.f12035s, i11, "IS_TAILREC.get(flags)");
        lVar.P = ri.e.g(cu.b.f12037u, i11, "IS_SUSPEND.get(flags)");
        lVar.L = ri.e.g(cu.b.f12038v, i11, "IS_EXPECT_FUNCTION.get(flags)");
        lVar.Q = !cu.b.f12039w.c(i11).booleanValue();
        ((l) kVar.f21732u).f32055m.a(proto, lVar, (cu.e) kVar.f21735x, j0Var);
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01db A[LOOP:1: B:65:0x01d5->B:67:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uu.k f(au.m proto) {
        boolean z10;
        int i6;
        j7.k a10;
        int i10;
        ht.h hVar;
        gt.j jVar;
        gt.e eVar;
        n0 n0Var;
        int i11;
        boolean z11;
        boolean z12;
        au.p pVar;
        o0 o0Var;
        List<au.p> list;
        au.w wVar;
        int i12;
        j7.k kVar;
        b.a aVar;
        b.a aVar2;
        b.a aVar3;
        b.C0179b c0179b;
        b.C0179b c0179b2;
        int i13;
        m0 m0Var;
        y yVar;
        m0 m0Var2;
        kt.n0 n0Var2;
        gt.e eVar2;
        int i14;
        boolean z13;
        int i15;
        j7.k a11;
        boolean z14;
        int i16;
        wu.b0 g5;
        boolean z15;
        boolean z16;
        boolean z17;
        kotlin.jvm.internal.i.g(proto, "proto");
        if ((proto.f3768w & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i6 = proto.f3769x;
        } else {
            int i17 = proto.f3770y;
            i6 = ((i17 >> 8) << 6) + (i17 & 63);
        }
        int i18 = i6;
        j7.k kVar2 = this.f32074a;
        ht.h b10 = b(proto, i18, su.c.PROPERTY);
        gt.z a12 = g0.a((au.j) cu.b.f12023e.c(i18));
        gt.o a13 = h0.a((au.w) cu.b.f12022d.c(i18));
        boolean g10 = ri.e.g(cu.b.f12040x, i18, "IS_VAR.get(flags)");
        Object obj = kVar2.f21733v;
        uu.k kVar3 = new uu.k((gt.j) kVar2.f21734w, null, b10, a12, a13, g10, ta.v.x((cu.c) obj, proto.f3771z), h0.b((au.i) cu.b.f12032o.c(i18)), ri.e.g(cu.b.B, i18, "IS_LATEINIT.get(flags)"), ri.e.g(cu.b.A, i18, "IS_CONST.get(flags)"), ri.e.g(cu.b.D, i18, "IS_EXTERNAL_PROPERTY.get(flags)"), ri.e.g(cu.b.E, i18, "IS_DELEGATED.get(flags)"), ri.e.g(cu.b.F, i18, "IS_EXPECT_PROPERTY.get(flags)"), proto, (cu.c) obj, (cu.e) kVar2.f21735x, (cu.f) kVar2.f21736y, (uu.g) kVar2.A);
        List<au.r> list2 = proto.C;
        kotlin.jvm.internal.i.f(list2, "proto.typeParameterList");
        a10 = kVar2.a(kVar3, list2, (cu.c) kVar2.f21733v, (cu.e) kVar2.f21735x, (cu.f) kVar2.f21736y, (cu.a) kVar2.f21737z);
        boolean g11 = ri.e.g(cu.b.f12041y, i18, "HAS_GETTER.get(flags)");
        su.c cVar = su.c.PROPERTY_GETTER;
        h.a.C0293a c0293a = h.a.f19495a;
        if (g11) {
            int i19 = proto.f3768w;
            if ((i19 & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                if ((i19 & 64) == 64) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    z16 = false;
                    if (z16) {
                        i10 = i18;
                        hVar = new uu.a(kVar2.c(), new z(this, proto, cVar));
                        Object obj2 = a10.B;
                        j0 j0Var = (j0) obj2;
                        wu.b0 g12 = j0Var.g(ca.a.k1(proto, (cu.e) kVar2.f21735x));
                        List<v0> b11 = j0Var.b();
                        jVar = (gt.j) kVar2.f21734w;
                        if (!(jVar instanceof gt.e)) {
                            eVar = (gt.e) jVar;
                        } else {
                            eVar = null;
                        }
                        if (eVar == null) {
                            n0Var = eVar.L0();
                        } else {
                            n0Var = null;
                        }
                        cu.e typeTable = (cu.e) kVar2.f21735x;
                        kotlin.jvm.internal.i.g(typeTable, "typeTable");
                        i11 = proto.f3768w;
                        if ((i11 & 32) != 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            pVar = proto.D;
                        } else {
                            if ((i11 & 64) == 64) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                pVar = typeTable.a(proto.E);
                            } else {
                                pVar = null;
                            }
                        }
                        if (pVar == null && (g5 = j0Var.g(pVar)) != null) {
                            o0Var = iu.f.g(kVar3, g5, hVar);
                        } else {
                            o0Var = null;
                        }
                        o0 o0Var2 = o0Var;
                        cu.e typeTable2 = (cu.e) kVar2.f21735x;
                        kotlin.jvm.internal.i.g(typeTable2, "typeTable");
                        list = proto.F;
                        if (!(!list.isEmpty())) {
                            list = null;
                        }
                        ArrayList arrayList = list;
                        if (list == null) {
                            List<Integer> contextReceiverTypeIdList = proto.G;
                            kotlin.jvm.internal.i.f(contextReceiverTypeIdList, "contextReceiverTypeIdList");
                            ArrayList arrayList2 = new ArrayList(is.i.H1(contextReceiverTypeIdList, 10));
                            for (Integer it : contextReceiverTypeIdList) {
                                kotlin.jvm.internal.i.f(it, "it");
                                arrayList2.add(typeTable2.a(it.intValue()));
                            }
                            arrayList = arrayList2;
                        }
                        ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList, 10));
                        for (au.p pVar2 : arrayList) {
                            arrayList3.add(iu.f.b(kVar3, ((j0) obj2).g(pVar2), c0293a));
                        }
                        kVar3.R0(g12, b11, n0Var, o0Var2, arrayList3);
                        b.a aVar4 = cu.b.f12021c;
                        boolean g13 = ri.e.g(aVar4, i10, "HAS_ANNOTATIONS.get(flags)");
                        b.C0179b c0179b3 = cu.b.f12022d;
                        wVar = (au.w) c0179b3.c(i10);
                        b.C0179b c0179b4 = cu.b.f12023e;
                        au.j jVar2 = (au.j) c0179b4.c(i10);
                        if (wVar == null) {
                            if (jVar2 != null) {
                                int d10 = aVar4.d(Boolean.valueOf(g13)) | (jVar2.e() << c0179b4.f12044a) | (wVar.e() << c0179b3.f12044a);
                                b.a aVar5 = cu.b.J;
                                Boolean bool = Boolean.FALSE;
                                b.a aVar6 = cu.b.K;
                                b.a aVar7 = cu.b.L;
                                int d11 = d10 | aVar5.d(bool) | aVar6.d(bool) | aVar7.d(bool);
                                q0.a aVar8 = q0.f16815a;
                                if (g11) {
                                    if ((proto.f3768w & 256) == 256) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        i16 = proto.J;
                                    } else {
                                        i16 = d11;
                                    }
                                    boolean g14 = ri.e.g(aVar5, i16, "IS_NOT_DEFAULT.get(getterFlags)");
                                    boolean g15 = ri.e.g(aVar6, i16, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
                                    boolean g16 = ri.e.g(aVar7, i16, "IS_INLINE_ACCESSOR.get(getterFlags)");
                                    ht.h b12 = b(proto, i16, cVar);
                                    if (g14) {
                                        aVar = aVar7;
                                        aVar2 = aVar6;
                                        i12 = d11;
                                        aVar3 = aVar5;
                                        kVar = kVar2;
                                        c0179b = c0179b4;
                                        c0179b2 = c0179b3;
                                        i13 = i10;
                                        m0Var = new m0(kVar3, b12, g0.a((au.j) c0179b4.c(i16)), h0.a((au.w) c0179b3.c(i16)), !g14, g15, g16, kVar3.m0(), null, aVar8);
                                    } else {
                                        i12 = d11;
                                        kVar = kVar2;
                                        aVar = aVar7;
                                        aVar2 = aVar6;
                                        aVar3 = aVar5;
                                        c0179b = c0179b4;
                                        c0179b2 = c0179b3;
                                        i13 = i10;
                                        m0Var = iu.f.c(kVar3, b12);
                                    }
                                    m0Var.O0(kVar3.getReturnType());
                                } else {
                                    i12 = d11;
                                    kVar = kVar2;
                                    aVar = aVar7;
                                    aVar2 = aVar6;
                                    aVar3 = aVar5;
                                    c0179b = c0179b4;
                                    c0179b2 = c0179b3;
                                    i13 = i10;
                                    m0Var = null;
                                }
                                m0 m0Var3 = m0Var;
                                if (ri.e.g(cu.b.f12042z, i13, "HAS_SETTER.get(flags)")) {
                                    if ((proto.f3768w & 512) == 512) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        i15 = proto.K;
                                    } else {
                                        i15 = i12;
                                    }
                                    boolean g17 = ri.e.g(aVar3, i15, "IS_NOT_DEFAULT.get(setterFlags)");
                                    boolean g18 = ri.e.g(aVar2, i15, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
                                    boolean g19 = ri.e.g(aVar, i15, "IS_INLINE_ACCESSOR.get(setterFlags)");
                                    su.c cVar2 = su.c.PROPERTY_SETTER;
                                    ht.h b13 = b(proto, i15, cVar2);
                                    if (g17) {
                                        yVar = this;
                                        m0Var2 = m0Var3;
                                        kt.n0 n0Var3 = new kt.n0(kVar3, b13, g0.a((au.j) c0179b.c(i15)), h0.a((au.w) c0179b2.c(i15)), !g17, g18, g19, kVar3.m0(), null, aVar8);
                                        a11 = a10.a(n0Var3, is.w.f20676u, (cu.c) a10.f21733v, (cu.e) a10.f21735x, (cu.f) a10.f21736y, (cu.a) a10.f21737z);
                                        z0 z0Var = (z0) is.u.y2(((y) a11.C).h(ca.a.O0(proto.I), proto, cVar2));
                                        if (z0Var != null) {
                                            n0Var3.G = z0Var;
                                            n0Var2 = n0Var3;
                                        } else {
                                            kt.n0.I(6);
                                            throw null;
                                        }
                                    } else {
                                        yVar = this;
                                        m0Var2 = m0Var3;
                                        n0Var2 = iu.f.d(kVar3, b13);
                                    }
                                } else {
                                    yVar = this;
                                    m0Var2 = m0Var3;
                                    n0Var2 = null;
                                }
                                if (ri.e.g(cu.b.C, i13, "HAS_CONSTANT.get(flags)")) {
                                    kVar3.I0(null, new b0(yVar, proto, kVar3));
                                }
                                gt.j jVar3 = (gt.j) kVar.f21734w;
                                if (jVar3 instanceof gt.e) {
                                    eVar2 = (gt.e) jVar3;
                                } else {
                                    eVar2 = null;
                                }
                                if (eVar2 != null) {
                                    i14 = eVar2.j();
                                } else {
                                    i14 = 0;
                                }
                                if (i14 == 5) {
                                    kVar3.I0(null, new d0(yVar, proto, kVar3));
                                }
                                kVar3.P0(m0Var2, n0Var2, new kt.u(kVar3, yVar.c(proto, false)), new kt.u(kVar3, yVar.c(proto, true)));
                                return kVar3;
                            }
                            cu.b.a(11);
                            throw null;
                        }
                        cu.b.a(10);
                        throw null;
                    }
                }
            }
            z16 = true;
            if (z16) {
            }
        }
        i10 = i18;
        hVar = c0293a;
        Object obj22 = a10.B;
        j0 j0Var2 = (j0) obj22;
        wu.b0 g122 = j0Var2.g(ca.a.k1(proto, (cu.e) kVar2.f21735x));
        List<v0> b112 = j0Var2.b();
        jVar = (gt.j) kVar2.f21734w;
        if (!(jVar instanceof gt.e)) {
        }
        if (eVar == null) {
        }
        cu.e typeTable3 = (cu.e) kVar2.f21735x;
        kotlin.jvm.internal.i.g(typeTable3, "typeTable");
        i11 = proto.f3768w;
        if ((i11 & 32) != 32) {
        }
        if (!z11) {
        }
        if (pVar == null) {
        }
        o0Var = null;
        o0 o0Var22 = o0Var;
        cu.e typeTable22 = (cu.e) kVar2.f21735x;
        kotlin.jvm.internal.i.g(typeTable22, "typeTable");
        list = proto.F;
        if (!(!list.isEmpty())) {
        }
        ArrayList arrayList4 = list;
        if (list == null) {
        }
        ArrayList arrayList32 = new ArrayList(is.i.H1(arrayList4, 10));
        while (r1.hasNext()) {
        }
        kVar3.R0(g122, b112, n0Var, o0Var22, arrayList32);
        b.a aVar42 = cu.b.f12021c;
        boolean g132 = ri.e.g(aVar42, i10, "HAS_ANNOTATIONS.get(flags)");
        b.C0179b c0179b32 = cu.b.f12022d;
        wVar = (au.w) c0179b32.c(i10);
        b.C0179b c0179b42 = cu.b.f12023e;
        au.j jVar22 = (au.j) c0179b42.c(i10);
        if (wVar == null) {
        }
    }

    public final uu.m g(au.q proto) {
        j7.k kVar;
        ht.h iVar;
        j7.k a10;
        boolean z10;
        boolean z11;
        au.p underlyingType;
        boolean z12;
        au.p expandedType;
        kotlin.jvm.internal.i.g(proto, "proto");
        List<au.a> list = proto.E;
        kotlin.jvm.internal.i.f(list, "proto.annotationList");
        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            kVar = this.f32074a;
            if (!hasNext) {
                break;
            }
            au.a it2 = (au.a) it.next();
            kotlin.jvm.internal.i.f(it2, "it");
            arrayList.add(this.f32075b.a(it2, (cu.c) kVar.f21733v));
        }
        if (arrayList.isEmpty()) {
            iVar = h.a.f19495a;
        } else {
            iVar = new ht.i(arrayList);
        }
        ht.h hVar = iVar;
        gt.o a11 = h0.a((au.w) cu.b.f12022d.c(proto.f3832x));
        vu.l c10 = kVar.c();
        gt.j jVar = (gt.j) kVar.f21734w;
        Object obj = kVar.f21733v;
        uu.m mVar = new uu.m(c10, jVar, hVar, ta.v.x((cu.c) obj, proto.f3833y), a11, proto, (cu.c) obj, (cu.e) kVar.f21735x, (cu.f) kVar.f21736y, (uu.g) kVar.A);
        List<au.r> list2 = proto.f3834z;
        kotlin.jvm.internal.i.f(list2, "proto.typeParameterList");
        a10 = kVar.a(mVar, list2, (cu.c) kVar.f21733v, (cu.e) kVar.f21735x, (cu.f) kVar.f21736y, (cu.a) kVar.f21737z);
        j0 j0Var = (j0) a10.B;
        List<v0> b10 = j0Var.b();
        cu.e typeTable = (cu.e) kVar.f21735x;
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        int i6 = proto.f3831w;
        boolean z13 = true;
        if ((i6 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            underlyingType = proto.A;
            kotlin.jvm.internal.i.f(underlyingType, "underlyingType");
        } else {
            if ((i6 & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                underlyingType = typeTable.a(proto.B);
            } else {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
            }
        }
        wu.i0 d10 = j0Var.d(underlyingType, false);
        cu.e typeTable2 = (cu.e) kVar.f21735x;
        kotlin.jvm.internal.i.g(typeTable2, "typeTable");
        int i10 = proto.f3831w;
        if ((i10 & 16) == 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            expandedType = proto.C;
            kotlin.jvm.internal.i.f(expandedType, "expandedType");
        } else {
            if ((i10 & 32) != 32) {
                z13 = false;
            }
            if (z13) {
                expandedType = typeTable2.a(proto.D);
            } else {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
            }
        }
        mVar.I0(b10, d10, j0Var.d(expandedType, false));
        return mVar;
    }

    public final List<z0> h(List<au.t> list, gu.n nVar, su.c cVar) {
        boolean z10;
        int i6;
        ht.h hVar;
        boolean z11;
        boolean z12;
        au.p pVar;
        wu.b0 b0Var;
        j7.k kVar = this.f32074a;
        gt.j jVar = (gt.j) kVar.f21734w;
        kotlin.jvm.internal.i.e(jVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        gt.a aVar = (gt.a) jVar;
        gt.j c10 = aVar.c();
        kotlin.jvm.internal.i.f(c10, "callableDescriptor.containingDeclaration");
        f0 a10 = a(c10);
        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                au.t tVar = (au.t) obj;
                if ((tVar.f3861w & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i6 = tVar.f3862x;
                } else {
                    i6 = 0;
                }
                if (a10 != null && ri.e.g(cu.b.f12021c, i6, "HAS_ANNOTATIONS.get(flags)")) {
                    hVar = new uu.o(kVar.c(), new c(a10, nVar, cVar, i10, tVar));
                } else {
                    hVar = h.a.f19495a;
                }
                fu.e x10 = ta.v.x((cu.c) kVar.f21733v, tVar.f3863y);
                Object obj2 = kVar.B;
                wu.b0 g5 = ((j0) obj2).g(ca.a.z1(tVar, (cu.e) kVar.f21735x));
                boolean g10 = ri.e.g(cu.b.G, i6, "DECLARES_DEFAULT_VALUE.get(flags)");
                boolean g11 = ri.e.g(cu.b.H, i6, "IS_CROSSINLINE.get(flags)");
                boolean g12 = ri.e.g(cu.b.I, i6, "IS_NOINLINE.get(flags)");
                cu.e typeTable = (cu.e) kVar.f21735x;
                kotlin.jvm.internal.i.g(typeTable, "typeTable");
                int i12 = tVar.f3861w;
                if ((i12 & 16) == 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    pVar = tVar.B;
                } else {
                    if ((i12 & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        pVar = typeTable.a(tVar.C);
                    } else {
                        pVar = null;
                    }
                }
                if (pVar != null) {
                    b0Var = ((j0) obj2).g(pVar);
                } else {
                    b0Var = null;
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new kt.v0(aVar, null, i10, hVar, x10, g5, g10, g11, g12, b0Var, q0.f16815a));
                arrayList = arrayList2;
                i10 = i11;
            } else {
                ca.a.t1();
                throw null;
            }
        }
        return is.u.I2(arrayList);
    }
}
