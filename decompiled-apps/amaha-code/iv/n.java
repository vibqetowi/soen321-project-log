package iv;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlinx.coroutines.c1;
/* compiled from: Produce.kt */
/* loaded from: classes2.dex */
public final class n {

    /* compiled from: Produce.kt */
    @ns.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* loaded from: classes2.dex */
    public static final class a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public q f20756u;

        /* renamed from: v  reason: collision with root package name */
        public ss.a f20757v;

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f20758w;

        /* renamed from: x  reason: collision with root package name */
        public int f20759x;

        public a(ls.d<? super a> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f20758w = obj;
            this.f20759x |= LinearLayoutManager.INVALID_OFFSET;
            return n.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<hs.k> f20760u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.k kVar) {
            super(1);
            this.f20760u = kVar;
        }

        @Override // ss.l
        public final hs.k invoke(Throwable th2) {
            hs.k kVar = hs.k.f19476a;
            this.f20760u.resumeWith(kVar);
            return kVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q<?> qVar, ss.a<hs.k> aVar, ls.d<? super hs.k> dVar) {
        a aVar2;
        int i6;
        boolean z10;
        try {
            if (dVar instanceof a) {
                aVar2 = (a) dVar;
                int i10 = aVar2.f20759x;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar2.f20759x = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar2.f20758w;
                    ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
                    i6 = aVar2.f20759x;
                    if (i6 == 0) {
                        if (i6 == 1) {
                            aVar = aVar2.f20757v;
                            sp.b.d0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        if (aVar2.getContext().e(c1.b.f23496u) == qVar) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            aVar2.f20756u = qVar;
                            aVar2.f20757v = aVar;
                            aVar2.f20759x = 1;
                            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(aVar2));
                            kVar.u();
                            qVar.n(new b(kVar));
                            if (kVar.s() == aVar3) {
                                return aVar3;
                            }
                        } else {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                        }
                    }
                    aVar.invoke();
                    return hs.k.f19476a;
                }
            }
            if (i6 == 0) {
            }
            aVar.invoke();
            return hs.k.f19476a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
        aVar2 = new a(dVar);
        Object obj2 = aVar2.f20758w;
        ms.a aVar32 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar2.f20759x;
    }
}
