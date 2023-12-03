package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.theinnerhour.b2b.utils.Constants;
import hs.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import ss.p;
/* compiled from: ActivityBreadcrumbCollector.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B-\u0012$\u0010\u001d\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R2\u0010\u001d\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bugsnag/android/ActivityBreadcrumbCollector;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "", "kotlin.jvm.PlatformType", "getActivityName", "lifecycleCallback", "", "hasBundle", "Lhs/k;", "leaveBreadcrumb", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Ljava/util/WeakHashMap;", "prevState", "Ljava/util/WeakHashMap;", "Lkotlin/Function2;", "", "", "cb", "Lss/p;", "<init>", "(Lss/p;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ActivityBreadcrumbCollector implements Application.ActivityLifecycleCallbacks {

    /* renamed from: cb  reason: collision with root package name */
    private final p<String, Map<String, ? extends Object>, k> f5906cb;
    private final WeakHashMap<Activity, String> prevState;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityBreadcrumbCollector(p<? super String, ? super Map<String, ? extends Object>, k> cb2) {
        i.h(cb2, "cb");
        this.f5906cb = cb2;
        this.prevState = new WeakHashMap<>();
    }

    private final String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private final void leaveBreadcrumb(Activity activity, String str, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("hasBundle", bool);
        }
        String str2 = this.prevState.get(activity);
        if (str2 != null) {
            linkedHashMap.put("previous", str2);
        }
        String activityName = getActivityName(activity);
        p<String, Map<String, ? extends Object>, k> pVar = this.f5906cb;
        pVar.invoke(activityName + '#' + str, linkedHashMap);
        this.prevState.put(activity, str);
    }

    public static /* synthetic */ void leaveBreadcrumb$default(ActivityBreadcrumbCollector activityBreadcrumbCollector, Activity activity, String str, Boolean bool, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            bool = null;
        }
        activityBreadcrumbCollector.leaveBreadcrumb(activity, str, bool);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z10;
        i.h(activity, "activity");
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        leaveBreadcrumb(activity, "onCreate()", Boolean.valueOf(z10));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        i.h(activity, "activity");
        leaveBreadcrumb$default(this, activity, "onDestroy()", null, 4, null);
        this.prevState.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        i.h(activity, "activity");
        leaveBreadcrumb$default(this, activity, "onPause()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        i.h(activity, "activity");
        leaveBreadcrumb$default(this, activity, "onResume()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        i.h(activity, "activity");
        i.h(outState, "outState");
        leaveBreadcrumb$default(this, activity, "onSaveInstanceState()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        i.h(activity, "activity");
        leaveBreadcrumb$default(this, activity, "onStart()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        i.h(activity, "activity");
        leaveBreadcrumb$default(this, activity, "onStop()", null, 4, null);
    }
}
