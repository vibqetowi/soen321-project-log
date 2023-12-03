package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
public final class b<T> extends c<T> {

    /* renamed from: y  reason: collision with root package name */
    public final ss.p<iv.q<? super T>, ls.d<? super hs.k>, Object> f23507y;

    /* compiled from: Builders.kt */
    @ns.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    /* loaded from: classes2.dex */
    public static final class a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public iv.q f23508u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f23509v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b<T> f23510w;

        /* renamed from: x  reason: collision with root package name */
        public int f23511x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, ls.d<? super a> dVar) {
            super(dVar);
            this.f23510w = bVar;
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f23509v = obj;
            this.f23511x |= LinearLayoutManager.INVALID_OFFSET;
            return this.f23510w.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ss.p<? super iv.q<? super T>, ? super ls.d<? super hs.k>, ? extends Object> pVar, ls.f fVar, int i6, iv.e eVar) {
        super(pVar, fVar, i6, eVar);
        this.f23507y = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // jv.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(iv.q<? super T> qVar, ls.d<? super hs.k> dVar) {
        a aVar;
        int i6;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f23511x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f23511x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f23509v;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = aVar.f23511x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        qVar = aVar.f23508u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    aVar.f23508u = qVar;
                    aVar.f23511x = 1;
                    Object invoke = this.f23512x.invoke(qVar, aVar);
                    if (invoke != aVar2) {
                        invoke = hs.k.f19476a;
                    }
                    if (invoke == aVar2) {
                        return aVar2;
                    }
                }
                if (!qVar.r()) {
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f23509v;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.f23511x;
        if (i6 == 0) {
        }
        if (!qVar.r()) {
        }
    }

    @Override // jv.e
    public final jv.e<T> d(ls.f fVar, int i6, iv.e eVar) {
        return new b(this.f23507y, fVar, i6, eVar);
    }
}
