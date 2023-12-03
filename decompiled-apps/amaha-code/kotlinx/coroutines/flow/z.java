package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: Share.kt */
@ns.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
/* loaded from: classes2.dex */
public final class z extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public a0 f23570u;

    /* renamed from: v  reason: collision with root package name */
    public jv.l f23571v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f23572w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ a0<Object> f23573x;

    /* renamed from: y  reason: collision with root package name */
    public int f23574y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0<Object> a0Var, ls.d<? super z> dVar) {
        super(dVar);
        this.f23573x = a0Var;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f23572w = obj;
        this.f23574y |= LinearLayoutManager.INVALID_OFFSET;
        return this.f23573x.a(this);
    }
}
