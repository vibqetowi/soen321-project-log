package kotlinx.coroutines;

import ls.e;
import ls.f;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class y {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<ls.f, f.b, ls.f> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f23715u = new a();

        public a() {
            super(2);
        }

        @Override // ss.p
        public final ls.f invoke(ls.f fVar, f.b bVar) {
            ls.f fVar2 = fVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof x) {
                return fVar2.h(((x) bVar2).h0());
            }
            return fVar2.h(bVar2);
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.p<ls.f, f.b, ls.f> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ls.f> f23716u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f23717v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.x<ls.f> xVar, boolean z10) {
            super(2);
            this.f23716u = xVar;
            this.f23717v = z10;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, ls.f] */
        @Override // ss.p
        public final ls.f invoke(ls.f fVar, f.b bVar) {
            ls.f fVar2 = fVar;
            f.b bVar2 = bVar;
            if (!(bVar2 instanceof x)) {
                return fVar2.h(bVar2);
            }
            kotlin.jvm.internal.x<ls.f> xVar = this.f23716u;
            if (xVar.f23469u.e(bVar2.getKey()) == null) {
                x xVar2 = (x) bVar2;
                if (this.f23717v) {
                    xVar2 = xVar2.h0();
                }
                return fVar2.h(xVar2);
            }
            xVar.f23469u = xVar.f23469u.o(bVar2.getKey());
            return fVar2.h(((x) bVar2).y0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final ls.f a(ls.f fVar, ls.f fVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        z zVar = z.f23719u;
        boolean booleanValue = ((Boolean) fVar.s(bool, zVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar2.s(bool, zVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fVar.h(fVar2);
        }
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f23469u = fVar2;
        ls.g gVar = ls.g.f24521u;
        ls.f fVar3 = (ls.f) fVar.s(gVar, new b(xVar, z10));
        if (booleanValue2) {
            xVar.f23469u = ((ls.f) xVar.f23469u).s(gVar, a.f23715u);
        }
        return fVar3.h((ls.f) xVar.f23469u);
    }

    public static final ls.f b(d0 d0Var, ls.f fVar) {
        ls.f a10 = a(d0Var.f0(), fVar, true);
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        if (a10 != cVar && a10.e(e.a.f24519u) == null) {
            return a10.h(cVar);
        }
        return a10;
    }

    public static final w1<?> c(ls.d<?> dVar, ls.f fVar, Object obj) {
        boolean z10;
        w1<?> w1Var = null;
        if (!(dVar instanceof ns.d)) {
            return null;
        }
        if (fVar.e(x1.f23714u) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        ns.d dVar2 = (ns.d) dVar;
        while (true) {
            if (!(dVar2 instanceof l0) && (dVar2 = dVar2.getCallerFrame()) != null) {
                if (dVar2 instanceof w1) {
                    w1Var = (w1) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (w1Var != null) {
            w1Var.f23712x.set(new hs.f<>(fVar, obj));
        }
        return w1Var;
    }
}
