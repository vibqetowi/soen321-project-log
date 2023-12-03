package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.StateObserver;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: LaunchCrashTracker.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/LaunchCrashTracker;", "Lcom/bugsnag/android/BaseObservable;", "Lhs/k;", "markLaunchCompleted", "", "isLaunching", "Ljava/util/concurrent/atomic/AtomicBoolean;", "launching", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "<init>", "(Lcom/bugsnag/android/internal/ImmutableConfig;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class LaunchCrashTracker extends BaseObservable {
    private final ScheduledThreadPoolExecutor executor;
    private final AtomicBoolean launching;
    private final Logger logger;

    public LaunchCrashTracker(ImmutableConfig immutableConfig) {
        this(immutableConfig, null, 2, null);
    }

    public final boolean isLaunching() {
        return this.launching.get();
    }

    public final void markLaunchCompleted() {
        this.executor.shutdown();
        this.launching.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.UpdateIsLaunching updateIsLaunching = new StateEvent.UpdateIsLaunching(false);
            for (StateObserver stateObserver : getObservers$bugsnag_android_core_release()) {
                stateObserver.onStateChange(updateIsLaunching);
            }
        }
        this.logger.d("App launch period marked as complete");
    }

    public /* synthetic */ LaunchCrashTracker(ImmutableConfig immutableConfig, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, int i6, d dVar) {
        this(immutableConfig, (i6 & 2) != 0 ? new ScheduledThreadPoolExecutor(1) : scheduledThreadPoolExecutor);
    }

    public LaunchCrashTracker(ImmutableConfig config, ScheduledThreadPoolExecutor executor) {
        i.h(config, "config");
        i.h(executor, "executor");
        this.executor = executor;
        this.launching = new AtomicBoolean(true);
        this.logger = config.getLogger();
        long launchDurationMillis = config.getLaunchDurationMillis();
        if (launchDurationMillis > 0) {
            executor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                executor.schedule(new Runnable() { // from class: com.bugsnag.android.LaunchCrashTracker.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        LaunchCrashTracker.this.markLaunchCompleted();
                    }
                }, launchDurationMillis, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                this.logger.w("Failed to schedule timer for LaunchCrashTracker", e10);
            }
        }
    }
}
