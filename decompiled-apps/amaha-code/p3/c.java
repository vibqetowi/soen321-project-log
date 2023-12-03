package p3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.i;
import o3.e;
import ta.v;
import w3.j;
/* compiled from: AndroidLifecyclePlugin.kt */
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, j {

    /* renamed from: u  reason: collision with root package name */
    public u3.b f27880u;

    @Override // w3.j
    public final j.a a() {
        return j.a.Utility;
    }

    @Override // w3.j
    public final void c(u3.b bVar) {
        this.f27880u = bVar;
    }

    @Override // w3.j
    public final void g(u3.b bVar) {
        c(bVar);
        ((Application) ((e) bVar.f33766a).f27015c).registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i.g(activity, "activity");
        u3.b bVar = this.f27880u;
        if (bVar != null) {
            o3.a aVar = (o3.a) bVar;
            v.H(aVar.f33768c, aVar.f33769d, 0, new o3.c(aVar, null), 2);
            return;
        }
        i.q("amplitude");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i.g(activity, "activity");
        u3.b bVar = this.f27880u;
        if (bVar != null) {
            o3.a aVar = (o3.a) bVar;
            v.H(aVar.f33768c, aVar.f33769d, 0, new o3.b(aVar, System.currentTimeMillis(), null), 2);
            return;
        }
        i.q("amplitude");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i.g(activity, "activity");
        i.g(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        i.g(activity, "activity");
    }

    @Override // w3.j
    public final v3.a h(v3.a aVar) {
        return aVar;
    }
}
