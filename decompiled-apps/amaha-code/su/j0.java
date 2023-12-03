package su;

import au.p;
import com.theinnerhour.b2b.utils.Constants;
import gt.u0;
import gt.v0;
import ht.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import wu.d1;
import wu.f1;
import wu.k1;
import wu.m0;
import wu.n0;
import wu.n1;
import wu.o;
import wu.v0;
import wu.x0;
/* compiled from: TypeDeserializer.kt */
/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final j7.k f32029a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f32030b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32031c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32032d;

    /* renamed from: e  reason: collision with root package name */
    public final vu.h f32033e;
    public final vu.h f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Integer, v0> f32034g;

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<Integer, gt.g> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final gt.g invoke(Integer num) {
            int intValue = num.intValue();
            j7.k kVar = j0.this.f32029a;
            fu.b w10 = ta.v.w((cu.c) kVar.f21733v, intValue);
            if (w10.f15920c) {
                return ((l) kVar.f21732u).b(w10);
            }
            return gt.t.b(((l) kVar.f21732u).f32045b, w10);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<List<? extends ht.c>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ j0 f32036u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ au.p f32037v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(au.p pVar, j0 j0Var) {
            super(0);
            this.f32036u = j0Var;
            this.f32037v = pVar;
        }

        @Override // ss.a
        public final List<? extends ht.c> invoke() {
            j7.k kVar = this.f32036u.f32029a;
            return ((l) kVar.f21732u).f32048e.h(this.f32037v, (cu.c) kVar.f21733v);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Integer, gt.g> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final gt.g invoke(Integer num) {
            int intValue = num.intValue();
            j7.k kVar = j0.this.f32029a;
            fu.b w10 = ta.v.w((cu.c) kVar.f21733v, intValue);
            if (!w10.f15920c) {
                gt.a0 a0Var = ((l) kVar.f21732u).f32045b;
                kotlin.jvm.internal.i.g(a0Var, "<this>");
                gt.g b10 = gt.t.b(a0Var, w10);
                if (b10 instanceof u0) {
                    return (u0) b10;
                }
            }
            return null;
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.f implements ss.l<fu.b, fu.b> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f32039u = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return kotlin.jvm.internal.y.a(fu.b.class);
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // ss.l
        public final fu.b invoke(fu.b bVar) {
            fu.b p02 = bVar;
            kotlin.jvm.internal.i.g(p02, "p0");
            return p02.g();
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<au.p, au.p> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final au.p invoke(au.p pVar) {
            au.p it = pVar;
            kotlin.jvm.internal.i.g(it, "it");
            return ca.a.b1(it, (cu.e) j0.this.f32029a.f21735x);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<au.p, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final f f32041u = new f();

        public f() {
            super(1);
        }

        @Override // ss.l
        public final Integer invoke(au.p pVar) {
            au.p it = pVar;
            kotlin.jvm.internal.i.g(it, "it");
            return Integer.valueOf(it.f3808x.size());
        }
    }

    public j0(j7.k c10, j0 j0Var, List<au.r> list, String debugName, String str) {
        Map<Integer, v0> linkedHashMap;
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(debugName, "debugName");
        this.f32029a = c10;
        this.f32030b = j0Var;
        this.f32031c = debugName;
        this.f32032d = str;
        this.f32033e = c10.c().b(new a());
        this.f = c10.c().b(new c());
        if (list.isEmpty()) {
            linkedHashMap = is.x.f20677u;
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i6 = 0;
            for (au.r rVar : list) {
                linkedHashMap.put(Integer.valueOf(rVar.f3840x), new uu.n(this.f32029a, rVar, i6));
                i6++;
            }
        }
        this.f32034g = linkedHashMap;
    }

    public static wu.i0 a(wu.i0 i0Var, wu.b0 b0Var) {
        dt.j F = hc.d.F(i0Var);
        ht.h annotations = i0Var.getAnnotations();
        wu.b0 o02 = ca.a.o0(i0Var);
        List e0 = ca.a.e0(i0Var);
        List<d1> c22 = is.u.c2(ca.a.t0(i0Var));
        ArrayList arrayList = new ArrayList(is.i.H1(c22, 10));
        for (d1 d1Var : c22) {
            arrayList.add(d1Var.a());
        }
        return ca.a.N(F, annotations, o02, e0, arrayList, b0Var, true).S0(i0Var.P0());
    }

    public static final ArrayList e(au.p pVar, j0 j0Var) {
        Iterable iterable;
        List<p.b> argumentList = pVar.f3808x;
        kotlin.jvm.internal.i.f(argumentList, "argumentList");
        au.p b1 = ca.a.b1(pVar, (cu.e) j0Var.f32029a.f21735x);
        if (b1 != null) {
            iterable = e(b1, j0Var);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = is.w.f20676u;
        }
        return is.u.u2(iterable, argumentList);
    }

    public static wu.v0 f(List list, ht.h hVar, x0 x0Var, gt.j jVar) {
        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((wu.u0) it.next()).a(hVar));
        }
        ArrayList O1 = is.i.O1(arrayList);
        wu.v0.f37300v.getClass();
        return v0.a.c(O1);
    }

    public static final gt.e h(j0 j0Var, au.p pVar, int i6) {
        fu.b w10 = ta.v.w((cu.c) j0Var.f32029a.f21733v, i6);
        ArrayList J0 = fv.t.J0(fv.t.G0(fv.k.x0(new e(), pVar), f.f32041u));
        int z02 = fv.t.z0(fv.k.x0(d.f32039u, w10));
        while (J0.size() < z02) {
            J0.add(0);
        }
        return ((l) j0Var.f32029a.f21732u).f32054l.a(w10, J0);
    }

    public final List<gt.v0> b() {
        return is.u.I2(this.f32034g.values());
    }

    public final gt.v0 c(int i6) {
        gt.v0 v0Var = this.f32034g.get(Integer.valueOf(i6));
        if (v0Var == null) {
            j0 j0Var = this.f32030b;
            if (j0Var != null) {
                return j0Var.c(i6);
            }
            return null;
        }
        return v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0401 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wu.i0 d(au.p proto, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        x0 d10;
        gt.g gVar;
        Object obj;
        wu.i0 f2;
        au.p pVar;
        wu.i0 f10;
        et.c cVar;
        boolean z15;
        d1 d1Var;
        wu.b0 a10;
        fu.c cVar2;
        fu.c cVar3;
        int size;
        int i6;
        boolean z16;
        ht.h iVar;
        boolean z17;
        n1 n1Var;
        boolean z18;
        boolean z19;
        au.p pVar2;
        zu.k f1Var;
        zu.k f1Var2;
        kotlin.jvm.internal.i.g(proto, "proto");
        boolean q10 = proto.q();
        j7.k kVar = this.f32029a;
        boolean z20 = true;
        if (q10) {
            if (ta.v.w((cu.c) kVar.f21733v, proto.C).f15920c) {
                ((l) kVar.f21732u).f32049g.a();
            }
        } else {
            if ((proto.f3807w & 128) == 128) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && ta.v.w((cu.c) kVar.f21733v, proto.F).f15920c) {
                ((l) kVar.f21732u).f32049g.a();
            }
        }
        if (proto.q()) {
            gVar = (gt.g) this.f32033e.invoke(Integer.valueOf(proto.C));
            if (gVar == null) {
                gVar = h(this, proto, proto.C);
            }
        } else {
            int i10 = proto.f3807w;
            if ((i10 & 32) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                gVar = c(proto.D);
                if (gVar == null) {
                    yu.i iVar2 = yu.i.f39090a;
                    d10 = yu.i.d(yu.h.I, String.valueOf(proto.D), this.f32032d);
                }
            } else {
                if ((i10 & 64) == 64) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    String string = ((cu.c) kVar.f21733v).getString(proto.E);
                    Iterator<T> it = b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (kotlin.jvm.internal.i.b(((gt.v0) obj).getName().f(), string)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    gt.v0 v0Var = (gt.v0) obj;
                    if (v0Var == null) {
                        yu.i iVar3 = yu.i.f39090a;
                        d10 = yu.i.d(yu.h.J, string, ((gt.j) kVar.f21734w).toString());
                    } else {
                        gVar = v0Var;
                    }
                } else {
                    if ((i10 & 128) == 128) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        gVar = (gt.g) this.f.invoke(Integer.valueOf(proto.F));
                        if (gVar == null) {
                            gVar = h(this, proto, proto.F);
                        }
                    } else {
                        yu.i iVar4 = yu.i.f39090a;
                        d10 = yu.i.d(yu.h.L, new String[0]);
                    }
                }
            }
            if (!yu.i.f(d10.a())) {
                yu.i iVar5 = yu.i.f39090a;
                return yu.i.e(yu.h.Q, is.w.f20676u, d10, (String[]) Arrays.copyOf(new String[]{d10.toString()}, 1));
            }
            uu.a aVar = new uu.a(kVar.c(), new b(proto, this));
            wu.v0 f11 = f(((l) kVar.f21732u).f32060s, aVar, d10, (gt.j) kVar.f21734w);
            ArrayList e10 = e(proto, this);
            ArrayList arrayList = new ArrayList(is.i.H1(e10, 10));
            Iterator it2 = e10.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    p.b bVar = (p.b) next;
                    List<gt.v0> parameters = d10.getParameters();
                    kotlin.jvm.internal.i.f(parameters, "constructor.parameters");
                    gt.v0 v0Var2 = (gt.v0) is.u.j2(i11, parameters);
                    p.b.c cVar4 = bVar.f3813w;
                    if (cVar4 == p.b.c.STAR) {
                        if (v0Var2 == null) {
                            f1Var2 = new m0(((l) kVar.f21732u).f32045b.o());
                        } else {
                            f1Var = new n0(v0Var2);
                            f1Var2 = f1Var;
                        }
                    } else {
                        kotlin.jvm.internal.i.f(cVar4, "typeArgumentProto.projection");
                        int ordinal = cVar4.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar4);
                                }
                                n1Var = n1.INVARIANT;
                            } else {
                                n1Var = n1.OUT_VARIANCE;
                            }
                        } else {
                            n1Var = n1.IN_VARIANCE;
                        }
                        cu.e typeTable = (cu.e) kVar.f21735x;
                        kotlin.jvm.internal.i.g(typeTable, "typeTable");
                        int i13 = bVar.f3812v;
                        if ((i13 & 2) == 2) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            pVar2 = bVar.f3814x;
                        } else {
                            if ((i13 & 4) == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                pVar2 = typeTable.a(bVar.f3815y);
                            } else {
                                pVar2 = null;
                            }
                        }
                        if (pVar2 == null) {
                            f1Var2 = new f1(yu.i.c(yu.h.V, bVar.toString()));
                        } else {
                            f1Var = new f1(g(pVar2), n1Var);
                            f1Var2 = f1Var;
                        }
                    }
                    arrayList.add(f1Var2);
                    i11 = i12;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
            List I2 = is.u.I2(arrayList);
            gt.g a11 = d10.a();
            if (z10 && (a11 instanceof u0)) {
                int i14 = wu.c0.f37213a;
                wu.i0 b10 = wu.c0.b((u0) a11, I2);
                List<wu.u0> list = ((l) kVar.f21732u).f32060s;
                ArrayList s22 = is.u.s2(aVar, b10.getAnnotations());
                if (s22.isEmpty()) {
                    iVar = h.a.f19495a;
                } else {
                    iVar = new ht.i(s22);
                }
                wu.v0 f12 = f(list, iVar, d10, (gt.j) kVar.f21734w);
                if (!k1.g(b10) && !proto.f3809y) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                f2 = b10.S0(z17).U0(f12);
            } else if (ri.e.g(cu.b.f12019a, proto.K, "SUSPEND_TYPE.get(proto.flags)")) {
                boolean z21 = proto.f3809y;
                int size2 = d10.getParameters().size() - I2.size();
                if (size2 != 0) {
                    if (size2 == 1 && (size = I2.size() - 1) >= 0) {
                        x0 l2 = d10.o().w(size).l();
                        kotlin.jvm.internal.i.f(l2, "functionTypeConstructor.…on(arity).typeConstructor");
                        f10 = wu.c0.f(f11, l2, I2, z21, null);
                        if (f10 != null) {
                            yu.i iVar6 = yu.i.f39090a;
                            f2 = yu.i.e(yu.h.K, I2, d10, new String[0]);
                        } else {
                            f2 = f10;
                        }
                    }
                    f10 = null;
                    if (f10 != null) {
                    }
                } else {
                    f10 = wu.c0.f(f11, d10, I2, z21, null);
                    gt.g a12 = f10.O0().a();
                    if (a12 != null) {
                        cVar = ca.a.i0(a12);
                    } else {
                        cVar = null;
                    }
                    if (cVar == et.c.f14549x) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15 && (d1Var = (d1) is.u.p2(ca.a.t0(f10))) != null && (a10 = d1Var.a()) != null) {
                        gt.g a13 = a10.O0().a();
                        if (a13 != null) {
                            cVar2 = mu.a.g(a13);
                        } else {
                            cVar2 = null;
                        }
                        if (a10.M0().size() == 1 && (kotlin.jvm.internal.i.b(cVar2, dt.n.f13386e) || kotlin.jvm.internal.i.b(cVar2, k0.f32043a))) {
                            wu.b0 a14 = ((d1) is.u.y2(a10.M0())).a();
                            kotlin.jvm.internal.i.f(a14, "continuationArgumentType.arguments.single().type");
                            gt.j jVar = (gt.j) kVar.f21734w;
                            if (!(jVar instanceof gt.a)) {
                                jVar = null;
                            }
                            gt.a aVar2 = (gt.a) jVar;
                            if (aVar2 != null) {
                                cVar3 = mu.a.c(aVar2);
                            } else {
                                cVar3 = null;
                            }
                            f10 = kotlin.jvm.internal.i.b(cVar3, i0.f32022a) ? a(f10, a14) : a(f10, a14);
                        }
                        if (f10 != null) {
                        }
                    }
                    f10 = null;
                    if (f10 != null) {
                    }
                }
            } else {
                f2 = wu.c0.f(f11, d10, I2, proto.f3809y, null);
                if (ri.e.g(cu.b.f12020b, proto.K, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)")) {
                    wu.o a15 = o.a.a(f2, false);
                    if (a15 != null) {
                        f2 = a15;
                    } else {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + f2 + '\'').toString());
                    }
                }
                pVar = null;
                cu.e typeTable2 = (cu.e) kVar.f21735x;
                kotlin.jvm.internal.i.g(typeTable2, "typeTable");
                i6 = proto.f3807w;
                if ((i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 1024) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    pVar = proto.I;
                } else {
                    if ((i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 2048) {
                        z20 = false;
                    }
                    if (z20) {
                        pVar = typeTable2.a(proto.J);
                    }
                }
                if (pVar != null) {
                    f2 = kotlin.jvm.internal.h.m0(f2, d(pVar, false));
                }
                if (!proto.q()) {
                    return ((l) kVar.f21732u).r.a(ta.v.w((cu.c) kVar.f21733v, proto.C), f2);
                }
                return f2;
            }
            pVar = null;
            cu.e typeTable22 = (cu.e) kVar.f21735x;
            kotlin.jvm.internal.i.g(typeTable22, "typeTable");
            i6 = proto.f3807w;
            if ((i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 1024) {
            }
            if (!z16) {
            }
            if (pVar != null) {
            }
            if (!proto.q()) {
            }
        }
        d10 = gVar.l();
        kotlin.jvm.internal.i.f(d10, "classifier.typeConstructor");
        if (!yu.i.f(d10.a())) {
        }
    }

    public final wu.b0 g(au.p proto) {
        boolean z10;
        boolean z11;
        au.p pVar;
        kotlin.jvm.internal.i.g(proto, "proto");
        boolean z12 = false;
        if ((proto.f3807w & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j7.k kVar = this.f32029a;
            String string = ((cu.c) kVar.f21733v).getString(proto.f3810z);
            wu.i0 d10 = d(proto, true);
            cu.e typeTable = (cu.e) kVar.f21735x;
            kotlin.jvm.internal.i.g(typeTable, "typeTable");
            int i6 = proto.f3807w;
            if ((i6 & 4) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                pVar = proto.A;
            } else {
                if ((i6 & 8) == 8) {
                    z12 = true;
                }
                if (z12) {
                    pVar = typeTable.a(proto.B);
                } else {
                    pVar = null;
                }
            }
            kotlin.jvm.internal.i.d(pVar);
            return ((l) kVar.f21732u).f32052j.b(proto, string, d10, d(pVar, true));
        }
        return d(proto, true);
    }

    public final String toString() {
        j0 j0Var;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32031c);
        if (this.f32030b == null) {
            str = "";
        } else {
            str = ". Child of " + j0Var.f32031c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
