package androidx.lifecycle;

import androidx.lifecycle.j;
import kotlin.Metadata;
/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/n;", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends k implements n {

    /* renamed from: u  reason: collision with root package name */
    public final j f2353u;

    /* renamed from: v  reason: collision with root package name */
    public final ls.f f2354v;

    public LifecycleCoroutineScopeImpl(j jVar, ls.f coroutineContext) {
        kotlin.jvm.internal.i.g(coroutineContext, "coroutineContext");
        this.f2353u = jVar;
        this.f2354v = coroutineContext;
        if (jVar.b() == j.c.DESTROYED) {
            sp.b.d(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        j jVar = this.f2353u;
        if (jVar.b().compareTo(j.c.DESTROYED) <= 0) {
            jVar.c(this);
            sp.b.d(this.f2354v, null);
        }
    }

    @Override // kotlinx.coroutines.d0
    public final ls.f f0() {
        return this.f2354v;
    }
}
