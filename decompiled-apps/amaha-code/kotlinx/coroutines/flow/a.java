package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: Flow.kt */
/* loaded from: classes2.dex */
public abstract class a<T> implements d<T> {

    /* compiled from: Flow.kt */
    @ns.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0361a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public jv.l f23503u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f23504v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a<T> f23505w;

        /* renamed from: x  reason: collision with root package name */
        public int f23506x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0361a(a<T> aVar, ls.d<? super C0361a> dVar) {
            super(dVar);
            this.f23505w = aVar;
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f23504v = obj;
            this.f23506x |= LinearLayoutManager.INVALID_OFFSET;
            return this.f23505w.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e<? super T> eVar, ls.d<? super hs.k> dVar) {
        C0361a c0361a;
        int i6;
        Throwable th2;
        jv.l lVar;
        if (dVar instanceof C0361a) {
            c0361a = (C0361a) dVar;
            int i10 = c0361a.f23506x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c0361a.f23506x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c0361a.f23504v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = c0361a.f23506x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        lVar = c0361a.f23503u;
                        try {
                            sp.b.d0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            lVar.releaseIntercepted();
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    jv.l lVar2 = new jv.l(eVar, c0361a.getContext());
                    try {
                        c0361a.f23503u = lVar2;
                        c0361a.f23506x = 1;
                        Object invoke = ((r) this).f23546u.invoke(lVar2, c0361a);
                        if (invoke != aVar) {
                            invoke = hs.k.f19476a;
                        }
                        if (invoke == aVar) {
                            return aVar;
                        }
                        lVar = lVar2;
                    } catch (Throwable th4) {
                        th2 = th4;
                        lVar = lVar2;
                        lVar.releaseIntercepted();
                        throw th2;
                    }
                }
                lVar.releaseIntercepted();
                return hs.k.f19476a;
            }
        }
        c0361a = new C0361a(this, dVar);
        Object obj2 = c0361a.f23504v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = c0361a.f23506x;
        if (i6 == 0) {
        }
        lVar.releaseIntercepted();
        return hs.k.f19476a;
    }
}
