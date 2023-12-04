package io.sentry.android.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import androidx.core.app.NotificationCompat;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.Integration;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import io.sentry.TransactionFinishedCallback;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes4.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    static final String APP_START_COLD = "app.start.cold";
    static final String APP_START_WARM = "app.start.warm";
    static final String UI_LOAD_OP = "ui.load";
    private final ActivityFramesTracker activityFramesTracker;
    private ISpan appStartSpan;
    private final Application application;
    private boolean foregroundImportance;
    private IHub hub;
    private boolean isAllActivityCallbacksAvailable;
    private SentryAndroidOptions options;
    private boolean performanceEnabled = false;
    private boolean firstActivityCreated = false;
    private boolean firstActivityResumed = false;
    private final WeakHashMap<Activity, ITransaction> activitiesWithOngoingTransactions = new WeakHashMap<>();

    private String getAppStartDesc(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    private String getAppStartOp(boolean z) {
        return z ? APP_START_COLD : APP_START_WARM;
    }

    public ActivityLifecycleIntegration(Application application, IBuildInfoProvider iBuildInfoProvider, ActivityFramesTracker activityFramesTracker) {
        this.foregroundImportance = false;
        Application application2 = (Application) Objects.requireNonNull(application, "Application is required");
        this.application = application2;
        Objects.requireNonNull(iBuildInfoProvider, "BuildInfoProvider is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker, "ActivityFramesTracker is required");
        if (iBuildInfoProvider.getSdkInfoVersion() >= 29) {
            this.isAllActivityCallbacksAvailable = true;
        }
        this.foregroundImportance = isForegroundImportance(application2);
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required");
        this.options.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.options.isEnableActivityLifecycleBreadcrumbs()));
        this.performanceEnabled = isPerformanceEnabled(this.options);
        if (this.options.isEnableActivityLifecycleBreadcrumbs() || this.performanceEnabled) {
            this.application.registerActivityLifecycleCallbacks(this);
            this.options.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        }
    }

    private boolean isPerformanceEnabled(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.activityFramesTracker.stop();
    }

    private void addBreadcrumb(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null || this.hub == null || !sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            return;
        }
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType(NotificationCompat.CATEGORY_NAVIGATION);
        breadcrumb.setData("state", str);
        breadcrumb.setData("screen", getActivityName(activity));
        breadcrumb.setCategory("ui.lifecycle");
        breadcrumb.setLevel(SentryLevel.INFO);
        this.hub.addBreadcrumb(breadcrumb);
    }

    private String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private void stopPreviousTransactions() {
        for (Map.Entry<Activity, ITransaction> entry : this.activitiesWithOngoingTransactions.entrySet()) {
            finishTransaction(entry.getValue());
        }
    }

    private void startTracing(final Activity activity) {
        final ITransaction startTransaction;
        if (!this.performanceEnabled || isRunningTransaction(activity) || this.hub == null) {
            return;
        }
        stopPreviousTransactions();
        String activityName = getActivityName(activity);
        Date appStartTime = this.foregroundImportance ? AppStartState.getInstance().getAppStartTime() : null;
        Boolean isColdStart = AppStartState.getInstance().isColdStart();
        if (this.firstActivityCreated || appStartTime == null || isColdStart == null) {
            startTransaction = this.hub.startTransaction(activityName, UI_LOAD_OP, null, true, new TransactionFinishedCallback() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1
                @Override // io.sentry.TransactionFinishedCallback
                public final void execute(ITransaction iTransaction) {
                    ActivityLifecycleIntegration.this.m7253x4339eaa7(activity, iTransaction);
                }
            });
        } else {
            startTransaction = this.hub.startTransaction(activityName, UI_LOAD_OP, appStartTime, true, new TransactionFinishedCallback() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda2
                @Override // io.sentry.TransactionFinishedCallback
                public final void execute(ITransaction iTransaction) {
                    ActivityLifecycleIntegration.this.m7254xd0749c28(activity, iTransaction);
                }
            });
            this.appStartSpan = startTransaction.startChild(getAppStartOp(isColdStart.booleanValue()), getAppStartDesc(isColdStart.booleanValue()), appStartTime);
        }
        this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda3
            @Override // io.sentry.ScopeCallback
            public final void run(Scope scope) {
                ActivityLifecycleIntegration.this.m7255x5daf4da9(startTransaction, scope);
            }
        });
        this.activitiesWithOngoingTransactions.put(activity, startTransaction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$startTracing$0$io-sentry-android-core-ActivityLifecycleIntegration  reason: not valid java name */
    public /* synthetic */ void m7253x4339eaa7(Activity activity, ITransaction iTransaction) {
        this.activityFramesTracker.setMetrics(activity, iTransaction.getEventId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$startTracing$1$io-sentry-android-core-ActivityLifecycleIntegration  reason: not valid java name */
    public /* synthetic */ void m7254xd0749c28(Activity activity, ITransaction iTransaction) {
        this.activityFramesTracker.setMetrics(activity, iTransaction.getEventId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: applyScope */
    public void m7255x5daf4da9(final Scope scope, final ITransaction iTransaction) {
        scope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda0
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction2) {
                ActivityLifecycleIntegration.this.m7252xd15ba770(scope, iTransaction, iTransaction2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$applyScope$3$io-sentry-android-core-ActivityLifecycleIntegration  reason: not valid java name */
    public /* synthetic */ void m7252xd15ba770(Scope scope, ITransaction iTransaction, ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            scope.setTransaction(iTransaction);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
        }
    }

    private boolean isRunningTransaction(Activity activity) {
        return this.activitiesWithOngoingTransactions.containsKey(activity);
    }

    private void stopTracing(Activity activity, boolean z) {
        if (this.performanceEnabled && z) {
            finishTransaction(this.activitiesWithOngoingTransactions.get(activity));
        }
    }

    private void finishTransaction(ITransaction iTransaction) {
        if (iTransaction == null || iTransaction.isFinished()) {
            return;
        }
        SpanStatus status = iTransaction.getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        iTransaction.finish(status);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        setColdStart(bundle);
        addBreadcrumb(activity, "created");
        startTracing(activity);
        this.firstActivityCreated = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        this.activityFramesTracker.addActivity(activity);
        addBreadcrumb(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        ISpan iSpan;
        if (!this.firstActivityResumed) {
            if (this.foregroundImportance) {
                AppStartState.getInstance().setAppStartEnd();
            } else {
                SentryAndroidOptions sentryAndroidOptions2 = this.options;
                if (sentryAndroidOptions2 != null) {
                    sentryAndroidOptions2.getLogger().log(SentryLevel.DEBUG, "App Start won't be reported because Process wasn't of foregroundImportance.", new Object[0]);
                }
            }
            if (this.performanceEnabled && (iSpan = this.appStartSpan) != null) {
                iSpan.finish();
            }
            this.firstActivityResumed = true;
        }
        addBreadcrumb(activity, "resumed");
        if (!this.isAllActivityCallbacksAvailable && (sentryAndroidOptions = this.options) != null) {
            stopTracing(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPostResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        if (this.isAllActivityCallbacksAvailable && (sentryAndroidOptions = this.options) != null) {
            stopTracing(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        addBreadcrumb(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        addBreadcrumb(activity, "stopped");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        addBreadcrumb(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        addBreadcrumb(activity, "destroyed");
        ISpan iSpan = this.appStartSpan;
        if (iSpan != null && !iSpan.isFinished()) {
            this.appStartSpan.finish(SpanStatus.CANCELLED);
        }
        stopTracing(activity, true);
        this.appStartSpan = null;
        if (this.performanceEnabled) {
            this.activitiesWithOngoingTransactions.remove(activity);
        }
    }

    WeakHashMap<Activity, ITransaction> getActivitiesWithOngoingTransactions() {
        return this.activitiesWithOngoingTransactions;
    }

    ISpan getAppStartSpan() {
        return this.appStartSpan;
    }

    private void setColdStart(Bundle bundle) {
        if (this.firstActivityCreated) {
            return;
        }
        AppStartState.getInstance().setColdStart(bundle == null);
    }

    private boolean isForegroundImportance(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager) || (runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses()) == null) {
                return false;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
