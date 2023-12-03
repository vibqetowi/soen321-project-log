package o5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import h5.p;
/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            p.c().execute(new i5.b(5));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            if (kotlin.jvm.internal.i.b(c.f27123e, Boolean.TRUE) && kotlin.jvm.internal.i.b(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                p.c().execute(new i5.b(6));
            }
        } catch (Exception unused) {
        }
    }
}
