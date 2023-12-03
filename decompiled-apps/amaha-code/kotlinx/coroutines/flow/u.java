package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlinx.coroutines.c1;
/* compiled from: SharedFlow.kt */
@ns.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
/* loaded from: classes2.dex */
public final class u extends ns.c {
    public int A;

    /* renamed from: u  reason: collision with root package name */
    public t f23554u;

    /* renamed from: v  reason: collision with root package name */
    public e f23555v;

    /* renamed from: w  reason: collision with root package name */
    public v f23556w;

    /* renamed from: x  reason: collision with root package name */
    public c1 f23557x;

    /* renamed from: y  reason: collision with root package name */
    public /* synthetic */ Object f23558y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ t<Object> f23559z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t<Object> tVar, ls.d<? super u> dVar) {
        super(dVar);
        this.f23559z = tVar;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f23558y = obj;
        this.A |= LinearLayoutManager.INVALID_OFFSET;
        t.i(this.f23559z, null, this);
        return ms.a.COROUTINE_SUSPENDED;
    }
}
