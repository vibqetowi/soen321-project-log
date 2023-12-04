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
/* loaded from: classes2.dex */
public final class ah {
    public static e AFInAppEventParameterName = null;
    public static long valueOf = 500;

    /* loaded from: classes2.dex */
    public interface e {
        void valueOf(Activity activity);

        void valueOf(Context context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.ah$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass4 implements Application.ActivityLifecycleCallbacks {
        boolean AFInAppEventParameterName = true;
        private /* synthetic */ Executor AFKeystoreWrapper;
        boolean valueOf;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        AnonymousClass4(Executor executor) {
            this.AFKeystoreWrapper = executor;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.ah.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!AnonymousClass4.this.valueOf) {
                        try {
                            ah.AFInAppEventParameterName.valueOf(activity);
                        } catch (Exception e) {
                            AFLogger.AFInAppEventParameterName("Listener thrown an exception: ", e);
                        }
                    }
                    AnonymousClass4.this.AFInAppEventParameterName = false;
                    AnonymousClass4.this.valueOf = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.ah.4.5
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass4.this.AFInAppEventParameterName = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.ah.4.5.5
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                if (AnonymousClass4.this.valueOf && AnonymousClass4.this.AFInAppEventParameterName) {
                                    AnonymousClass4.this.valueOf = false;
                                    try {
                                        ah.AFInAppEventParameterName.valueOf(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.valueOf("Listener threw exception! ", e);
                                    }
                                }
                            }
                        }, ah.valueOf);
                    } catch (Throwable th) {
                        AFLogger.valueOf("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.ah.4.3
                @Override // java.lang.Runnable
                public final void run() {
                    f.valueOf();
                    Intent intent = activity.getIntent();
                    if (f.AFKeystoreWrapper(intent) == null || intent == f.valueOf) {
                        return;
                    }
                    f.valueOf = intent;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFKeystoreWrapper(Context context, e eVar, Executor executor) {
        AFInAppEventParameterName = eVar;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(executor);
        if (context instanceof Activity) {
            anonymousClass4.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass4);
    }
}
