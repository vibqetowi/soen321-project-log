package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: Reduce.kt */
@ns.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
/* loaded from: classes2.dex */
public final class l<T> extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public ss.p f23536u;

    /* renamed from: v  reason: collision with root package name */
    public kotlin.jvm.internal.x f23537v;

    /* renamed from: w  reason: collision with root package name */
    public j f23538w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f23539x;

    /* renamed from: y  reason: collision with root package name */
    public int f23540y;

    public l(ls.d<? super l> dVar) {
        super(dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f23539x = obj;
        this.f23540y |= LinearLayoutManager.INVALID_OFFSET;
        return ta.v.t(null, null, this);
    }
}
