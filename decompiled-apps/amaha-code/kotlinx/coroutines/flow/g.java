package kotlinx.coroutines.flow;
/* compiled from: Merge.kt */
@ns.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.q<e<Object>, Object, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f23518u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ e f23519v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f23520w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ss.p<Object, ls.d<Object>, Object> f23521x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(ss.p<Object, ? super ls.d<Object>, ? extends Object> pVar, ls.d<? super g> dVar) {
        super(3, dVar);
        this.f23521x = pVar;
    }

    @Override // ss.q
    public final Object invoke(e<Object> eVar, Object obj, ls.d<? super hs.k> dVar) {
        g gVar = new g(this.f23521x, dVar);
        gVar.f23519v = eVar;
        gVar.f23520w = obj;
        return gVar.invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f23518u;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.f23519v;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            eVar = this.f23519v;
            Object obj2 = this.f23520w;
            this.f23519v = eVar;
            this.f23518u = 1;
            obj = this.f23521x.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f23519v = null;
        this.f23518u = 2;
        if (eVar.b(obj, this) == aVar) {
            return aVar;
        }
        return hs.k.f19476a;
    }
}
