package jv;
/* compiled from: ChannelFlow.kt */
@ns.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements ss.p<kotlinx.coroutines.flow.e<Object>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22649u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f22650v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g<Object, Object> f22651w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<Object, Object> gVar, ls.d<? super f> dVar) {
        super(2, dVar);
        this.f22651w = gVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        f fVar = new f(this.f22651w, dVar);
        fVar.f22650v = obj;
        return fVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<Object> eVar, ls.d<? super hs.k> dVar) {
        return ((f) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22649u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            this.f22649u = 1;
            if (this.f22651w.f((kotlinx.coroutines.flow.e) this.f22650v, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
