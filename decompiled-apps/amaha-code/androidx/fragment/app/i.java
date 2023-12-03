package androidx.fragment.app;

import androidx.fragment.app.t0;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t0.b f2214u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t0.b f2215v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f2216w;

    public i(t0.b bVar, t0.b bVar2, boolean z10, t.b bVar3) {
        this.f2214u = bVar;
        this.f2215v = bVar2;
        this.f2216w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.f2214u.f2287c;
        Fragment fragment2 = this.f2215v.f2287c;
        k0 k0Var = i0.f2217a;
        if (this.f2216w) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }
}
