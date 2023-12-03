package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: y  reason: collision with root package name */
    public static final b f7338y = new b();

    /* renamed from: u  reason: collision with root package name */
    public final AtomicBoolean f7339u = new AtomicBoolean();

    /* renamed from: v  reason: collision with root package name */
    public final AtomicBoolean f7340v = new AtomicBoolean();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f7341w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public boolean f7342x = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public interface a {
        void onBackgroundStateChanged(boolean z10);
    }

    public static void b(Application application) {
        b bVar = f7338y;
        synchronized (bVar) {
            if (!bVar.f7342x) {
                application.registerActivityLifecycleCallbacks(bVar);
                application.registerComponentCallbacks(bVar);
                bVar.f7342x = true;
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f7338y) {
            this.f7341w.add(aVar);
        }
    }

    public final void c(boolean z10) {
        synchronized (f7338y) {
            Iterator it = this.f7341w.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onBackgroundStateChanged(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f7339u.compareAndSet(true, false);
        this.f7340v.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f7339u.compareAndSet(true, false);
        this.f7340v.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        if (i6 == 20 && this.f7339u.compareAndSet(false, true)) {
            this.f7340v.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
