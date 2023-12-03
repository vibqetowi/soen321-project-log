package gt;

import cv.n;
import gt.b1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
/* compiled from: DescriptorVisibilities.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16800a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f16801b;

    /* renamed from: c  reason: collision with root package name */
    public static final f f16802c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f16803d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f16804e;
    public static final i f;

    /* renamed from: g  reason: collision with root package name */
    public static final j f16805g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f16806h;

    /* renamed from: i  reason: collision with root package name */
    public static final l f16807i;

    /* renamed from: j  reason: collision with root package name */
    public static final Map<q, Integer> f16808j;

    /* renamed from: k  reason: collision with root package name */
    public static final h f16809k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f16810l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f16811m;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    public static final c f16812n;

    /* renamed from: o  reason: collision with root package name */
    public static final cv.n f16813o;

    /* renamed from: p  reason: collision with root package name */
    public static final HashMap f16814p;

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class a implements qu.d {
        @Override // qu.d
        public final wu.b0 a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class b implements qu.d {
        @Override // qu.d
        public final wu.b0 a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class c implements qu.d {
        @Override // qu.d
        public final wu.b0 a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class d extends o {
        public d(b1.e eVar) {
            super(eVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                if (i6 != 2) {
                    objArr[0] = "descriptor";
                } else {
                    objArr[0] = "from";
                }
            } else {
                objArr[0] = "what";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i6 != 1 && i6 != 2) {
                objArr[2] = "hasContainingSourceFile";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [gt.j, gt.n] */
        /* JADX WARN: Type inference failed for: r5v1, types: [gt.j] */
        /* JADX WARN: Type inference failed for: r5v2, types: [gt.j] */
        /* JADX WARN: Type inference failed for: r5v4, types: [gt.j] */
        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            boolean z10;
            if (jVar != null) {
                if (iu.g.t(nVar)) {
                    if (iu.g.f(jVar) != r0.f16817a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return p.d(nVar, jVar);
                    }
                }
                if (nVar instanceof gt.i) {
                    ((gt.i) nVar).c();
                }
                while (nVar != 0) {
                    nVar = nVar.c();
                    if (nVar instanceof gt.e) {
                        if (!iu.g.l(nVar)) {
                            break;
                        }
                    }
                    if (nVar instanceof d0) {
                        break;
                    }
                }
                if (nVar == 0) {
                    return false;
                }
                while (jVar != null) {
                    if (nVar == jVar) {
                        return true;
                    }
                    if (jVar instanceof d0) {
                        if (!(nVar instanceof d0) || !nVar.e().equals(((d0) jVar).e()) || !iu.g.d(jVar).equals(iu.g.d(nVar))) {
                            return false;
                        }
                        return true;
                    }
                    jVar = jVar.c();
                }
                return false;
            }
            e(2);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class e extends o {
        public e(b1.f fVar) {
            super(fVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            gt.j i6;
            if (jVar != null) {
                if (p.f16800a.c(bVar, nVar, jVar)) {
                    if (bVar == p.f16811m) {
                        return true;
                    }
                    if (bVar != p.f16810l && (i6 = iu.g.i(nVar, gt.e.class, true)) != null && (bVar instanceof qu.f)) {
                        return ((qu.f) bVar).q().b().equals(i6.b());
                    }
                }
                return false;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class f extends o {
        public f(b1.g gVar) {
            super(gVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        objArr[0] = "what";
                    } else {
                        objArr[0] = "fromClass";
                    }
                } else {
                    objArr[0] = "whatDeclaration";
                }
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i6 != 2 && i6 != 3) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
            if (ta.v.D(r0) == false) goto L40;
         */
        @Override // gt.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            gt.e eVar;
            if (jVar != null) {
                gt.e eVar2 = (gt.e) iu.g.i(nVar, gt.e.class, true);
                boolean z10 = false;
                gt.e eVar3 = (gt.e) iu.g.i(jVar, gt.e.class, false);
                if (eVar3 == null) {
                    return false;
                }
                if (eVar2 != null && iu.g.l(eVar2) && (eVar = (gt.e) iu.g.i(eVar2, gt.e.class, true)) != null && iu.g.r(eVar3, eVar)) {
                    return true;
                }
                n v10 = iu.g.v(nVar);
                gt.e eVar4 = (gt.e) iu.g.i(v10, gt.e.class, true);
                if (eVar4 == null) {
                    return false;
                }
                if (iu.g.r(eVar3, eVar4)) {
                    if (bVar != p.f16812n) {
                        if ((v10 instanceof gt.b) && !(v10 instanceof gt.i) && bVar != p.f16811m) {
                            if (bVar != p.f16810l && bVar != null) {
                                if (bVar instanceof qu.e) {
                                    wu.b0 b10 = ((qu.e) bVar).b();
                                    if (!iu.g.s(b10, eVar3)) {
                                    }
                                } else {
                                    bVar.a();
                                    throw null;
                                }
                            }
                        }
                        z10 = true;
                    }
                    if (z10) {
                        return true;
                    }
                }
                return c(bVar, nVar, eVar3.c());
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class g extends o {
        public g(b1.b bVar) {
            super(bVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            if (jVar != null) {
                if (!iu.g.d(jVar).p0(iu.g.d(nVar))) {
                    return false;
                }
                p.f16813o.a(nVar, jVar);
                return true;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class h extends o {
        public h(b1.h hVar) {
            super(hVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            if (jVar != null) {
                return true;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class i extends o {
        public i(b1.d dVar) {
            super(dVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            if (jVar == null) {
                e(1);
                throw null;
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class j extends o {
        public j(b1.a aVar) {
            super(aVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            if (jVar == null) {
                e(1);
                throw null;
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class k extends o {
        public k(b1.c cVar) {
            super(cVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            if (jVar != null) {
                return false;
            }
            e(1);
            throw null;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* loaded from: classes2.dex */
    public static class l extends o {
        public l(b1.i iVar) {
            super(iVar);
        }

        public static /* synthetic */ void e(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gt.q
        public final boolean c(b bVar, n nVar, gt.j jVar) {
            if (jVar != null) {
                return false;
            }
            e(1);
            throw null;
        }
    }

    static {
        cv.n nVar;
        d dVar = new d(b1.e.f16772c);
        f16800a = dVar;
        e eVar = new e(b1.f.f16773c);
        f16801b = eVar;
        f fVar = new f(b1.g.f16774c);
        f16802c = fVar;
        g gVar = new g(b1.b.f16769c);
        f16803d = gVar;
        h hVar = new h(b1.h.f16775c);
        f16804e = hVar;
        i iVar = new i(b1.d.f16771c);
        f = iVar;
        j jVar = new j(b1.a.f16768c);
        f16805g = jVar;
        k kVar = new k(b1.c.f16770c);
        f16806h = kVar;
        l lVar = new l(b1.i.f16776c);
        f16807i = lVar;
        Collections.unmodifiableSet(ca.a.m1(dVar, eVar, gVar, iVar));
        HashMap hashMap = new HashMap(6);
        hashMap.put(eVar, 0);
        hashMap.put(dVar, 0);
        hashMap.put(gVar, 1);
        hashMap.put(fVar, 1);
        hashMap.put(hVar, 2);
        f16808j = Collections.unmodifiableMap(hashMap);
        f16809k = hVar;
        f16810l = new a();
        f16811m = new b();
        f16812n = new c();
        Iterator it = ServiceLoader.load(cv.n.class, cv.n.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            nVar = (cv.n) it.next();
        } else {
            nVar = n.a.f12074a;
        }
        f16813o = nVar;
        f16814p = new HashMap();
        f(dVar);
        f(eVar);
        f(fVar);
        f(gVar);
        f(hVar);
        f(iVar);
        f(jVar);
        f(kVar);
        f(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 16) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 16) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1 && i6 != 3 && i6 != 5 && i6 != 7) {
            switch (i6) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i6 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i6) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i6 == 16) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "from";
        if (i6 == 16) {
        }
        switch (i6) {
        }
        String format2 = String.format(str, objArr);
        if (i6 == 16) {
        }
    }

    public static Integer b(q qVar, q qVar2) {
        if (qVar != null) {
            if (qVar2 != null) {
                Integer a10 = qVar.a().a(qVar2.a());
                if (a10 != null) {
                    return a10;
                }
                Integer a11 = qVar2.a().a(qVar.a());
                if (a11 == null) {
                    return null;
                }
                return Integer.valueOf(-a11.intValue());
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static n c(b bVar, n nVar, gt.j jVar) {
        n c10;
        if (nVar != null) {
            if (jVar != null) {
                for (n nVar2 = (n) nVar.b(); nVar2 != null && nVar2.getVisibility() != f; nVar2 = (n) iu.g.i(nVar2, n.class, true)) {
                    if (!nVar2.getVisibility().c(bVar, nVar2, jVar)) {
                        return nVar2;
                    }
                }
                if (!(nVar instanceof kt.r0) || (c10 = c(bVar, ((kt.r0) nVar).o0(), jVar)) == null) {
                    return null;
                }
                return c10;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean d(gt.j jVar, gt.j jVar2) {
        if (jVar2 != null) {
            r0 f2 = iu.g.f(jVar2);
            if (f2 != r0.f16817a) {
                return f2.equals(iu.g.f(jVar));
            }
            return false;
        }
        a(7);
        throw null;
    }

    public static boolean e(q qVar) {
        if (qVar != null) {
            if (qVar != f16800a && qVar != f16801b) {
                return false;
            }
            return true;
        }
        a(14);
        throw null;
    }

    public static void f(o oVar) {
        f16814p.put(oVar.f16793a, oVar);
    }

    public static q g(c1 c1Var) {
        if (c1Var != null) {
            q qVar = (q) f16814p.get(c1Var);
            if (qVar != null) {
                return qVar;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + c1Var);
        }
        a(15);
        throw null;
    }
}
