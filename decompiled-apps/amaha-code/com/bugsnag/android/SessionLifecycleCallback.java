package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.jvm.internal.i;
/* compiled from: SessionLifecycleCallback.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/SessionLifecycleCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "Lhs/k;", "onActivityStarted", "onActivityPostStarted", "onActivityStopped", "onActivityPostStopped", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityResumed", "onActivityPaused", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Lcom/bugsnag/android/SessionTracker;", "sessionTracker", "Lcom/bugsnag/android/SessionTracker;", "<init>", "(Lcom/bugsnag/android/SessionTracker;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SessionLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    private final SessionTracker sessionTracker;

    public SessionLifecycleCallback(SessionTracker sessionTracker) {
        i.h(sessionTracker, "sessionTracker");
        this.sessionTracker = sessionTracker;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        i.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        i.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        i.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        i.h(activity, "activity");
        this.sessionTracker.onActivityStarted(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
        i.h(activity, "activity");
        this.sessionTracker.onActivityStopped(activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        i.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        i.h(activity, "activity");
        i.h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        i.h(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            this.sessionTracker.onActivityStarted(activity.getClass().getSimpleName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        i.h(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            this.sessionTracker.onActivityStopped(activity.getClass().getSimpleName());
        }
    }
}
