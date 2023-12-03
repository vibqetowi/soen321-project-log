package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class AFa1aSDK {
    public static long AFInAppEventType = 500;
    public static AFa1xSDK AFKeystoreWrapper;

    /* loaded from: classes.dex */
    public interface AFa1xSDK {
        void AFKeystoreWrapper(Activity activity);

        void AFKeystoreWrapper(Context context);
    }

    public static void AFKeystoreWrapper(Context context, AFa1xSDK aFa1xSDK, Executor executor) {
        AFKeystoreWrapper = aFa1xSDK;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(executor);
        if (context instanceof Activity) {
            anonymousClass5.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass5);
    }

    /* renamed from: com.appsflyer.internal.AFa1aSDK$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Application.ActivityLifecycleCallbacks {
        boolean AFKeystoreWrapper = true;
        boolean valueOf;
        private /* synthetic */ Executor values;

        public AnonymousClass5(Executor executor) {
            this.values = executor;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.values.execute(new Runnable() { // from class: com.appsflyer.internal.AFa1aSDK.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1sSDK.AFInAppEventParameterName();
                    Intent intent = activity.getIntent();
                    if (AFa1sSDK.valueOf(intent) != null && intent != AFa1sSDK.AFKeystoreWrapper) {
                        AFa1sSDK.AFKeystoreWrapper = intent;
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.values.execute(new Runnable() { // from class: com.appsflyer.internal.AFa1aSDK.5.2
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass5.this.AFKeystoreWrapper = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.AFa1aSDK.5.2.2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                if (anonymousClass5.valueOf && anonymousClass5.AFKeystoreWrapper) {
                                    anonymousClass5.valueOf = false;
                                    try {
                                        AFa1aSDK.AFKeystoreWrapper.AFKeystoreWrapper(applicationContext);
                                    } catch (Exception e10) {
                                        AFLogger.afErrorLog("Listener threw exception! ", e10);
                                    }
                                }
                            }
                        }, AFa1aSDK.AFInAppEventType);
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog("Background task failed with a throwable: ", th2);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.values.execute(new Runnable() { // from class: com.appsflyer.internal.AFa1aSDK.5.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (!AnonymousClass5.this.valueOf) {
                        try {
                            AFa1aSDK.AFKeystoreWrapper.AFKeystoreWrapper(activity);
                        } catch (Exception e10) {
                            AFLogger.afErrorLog("Listener thrown an exception: ", e10, true);
                        }
                    }
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    anonymousClass5.AFKeystoreWrapper = false;
                    anonymousClass5.valueOf = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
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
}
