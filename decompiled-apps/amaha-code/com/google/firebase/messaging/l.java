package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: FcmLifecycleCallbacks.java */
/* loaded from: classes.dex */
public final class l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u  reason: collision with root package name */
    public final Set<Intent> f9749u = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Intent intent) {
        Bundle bundle;
        boolean equals;
        Bundle extras;
        try {
            extras = intent.getExtras();
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
        }
        if (extras != null) {
            bundle = extras.getBundle("gcm.n.analytics_data");
            if (bundle != null) {
                equals = false;
            } else {
                equals = "1".equals(bundle.getString("google.c.a.e"));
            }
            if (!equals) {
                if (bundle != null) {
                    if ("1".equals(bundle.getString("google.c.a.tc"))) {
                        wc.a aVar = (wc.a) sc.e.e().c(wc.a.class);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        if (aVar != null) {
                            String string = bundle.getString("google.c.a.c_id");
                            aVar.h(string);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("source", "Firebase");
                            bundle2.putString("medium", "notification");
                            bundle2.putString("campaign", string);
                            aVar.b("fcm", "_cmp", bundle2);
                        } else {
                            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                    }
                }
                t.a(bundle, "_no");
                return;
            }
            return;
        }
        bundle = null;
        if (bundle != null) {
        }
        if (!equals) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.f9749u.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new ne.u(this, 5, intent));
            } else {
                a(intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f9749u.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
