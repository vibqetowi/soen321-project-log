package jv;

import kotlinx.coroutines.internal.t;
import ta.v;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes2.dex */
public final class q<T> implements kotlinx.coroutines.flow.e<T> {

    /* renamed from: u  reason: collision with root package name */
    public final ls.f f22688u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f22689v;

    /* renamed from: w  reason: collision with root package name */
    public final a f22690w;

    /* compiled from: ChannelFlow.kt */
    @ns.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<T, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22691u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22692v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<T> f22693w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.e<? super T> eVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22693w = eVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22693w, dVar);
            aVar.f22692v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(Object obj, ls.d<? super hs.k> dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22691u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Object obj2 = this.f22692v;
                this.f22691u = 1;
                if (this.f22693w.b(obj2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    public q(kotlinx.coroutines.flow.e<? super T> eVar, ls.f fVar) {
        this.f22688u = fVar;
        this.f22689v = t.b(fVar);
        this.f22690w = new a(eVar, null);
    }

    @Override // kotlinx.coroutines.flow.e
    public final Object b(T t3, ls.d<? super hs.k> dVar) {
        Object T = v.T(this.f22688u, t3, this.f22689v, this.f22690w, dVar);
        if (T == ms.a.COROUTINE_SUSPENDED) {
            return T;
        }
        return hs.k.f19476a;
    }
}
