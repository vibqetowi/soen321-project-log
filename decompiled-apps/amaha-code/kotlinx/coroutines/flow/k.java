package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: Reduce.kt */
@ns.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
/* loaded from: classes2.dex */
public final class k<T> extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public kotlin.jvm.internal.x f23532u;

    /* renamed from: v  reason: collision with root package name */
    public i f23533v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f23534w;

    /* renamed from: x  reason: collision with root package name */
    public int f23535x;

    public k(ls.d<? super k> dVar) {
        super(dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f23534w = obj;
        this.f23535x |= LinearLayoutManager.INVALID_OFFSET;
        return ta.v.s(null, this);
    }
}
