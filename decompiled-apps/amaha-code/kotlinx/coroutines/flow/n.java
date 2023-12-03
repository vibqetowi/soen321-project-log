package kotlinx.coroutines.flow;
/* compiled from: Reduce.kt */
/* loaded from: classes2.dex */
public final class n<T> implements e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x<Object> f23544u;

    public n(kotlin.jvm.internal.x<Object> xVar) {
        this.f23544u = xVar;
    }

    @Override // kotlinx.coroutines.flow.e
    public final Object b(T t3, ls.d<? super hs.k> dVar) {
        boolean z10;
        kotlin.jvm.internal.x<Object> xVar = this.f23544u;
        if (xVar.f23469u == kotlin.jvm.internal.b0.K) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            xVar.f23469u = t3;
            return hs.k.f19476a;
        }
        throw new IllegalArgumentException("Flow has more than one element".toString());
    }
}
