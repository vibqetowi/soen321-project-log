package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m.c f2227u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t0.b f2228v;

    public l(m.c cVar, t0.b bVar) {
        this.f2227u = cVar;
        this.f2228v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2227u.a();
        if (y.P(2)) {
            Log.v("FragmentManager", "Transition for operation " + this.f2228v + "has completed");
        }
    }
}
