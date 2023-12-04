package io.sentry.android.core;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes4.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {
    private final ICurrentDateProvider currentDateProvider;
    private final boolean enableAppLifecycleBreadcrumbs;
    private final boolean enableSessionTracking;
    private final IHub hub;
    private final AtomicLong lastUpdatedSession;
    private final AtomicBoolean runningSession;
    private final long sessionIntervalMillis;
    private final Timer timer;
    private TimerTask timerTask;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleWatcher(IHub iHub, long j, boolean z, boolean z2) {
        this(iHub, j, z, z2, CurrentDateProvider.getInstance());
    }

    LifecycleWatcher(IHub iHub, long j, boolean z, boolean z2, ICurrentDateProvider iCurrentDateProvider) {
        this.lastUpdatedSession = new AtomicLong(0L);
        this.timer = new Timer(true);
        this.runningSession = new AtomicBoolean();
        this.sessionIntervalMillis = j;
        this.enableSessionTracking = z;
        this.enableAppLifecycleBreadcrumbs = z2;
        this.hub = iHub;
        this.currentDateProvider = iCurrentDateProvider;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        startSession();
        addAppBreadcrumb(DownloadService.KEY_FOREGROUND);
    }

    private void startSession() {
        if (this.enableSessionTracking) {
            cancelTask();
            long currentTimeMillis = this.currentDateProvider.getCurrentTimeMillis();
            long j = this.lastUpdatedSession.get();
            if (j == 0 || j + this.sessionIntervalMillis <= currentTimeMillis) {
                addSessionBreadcrumb(TtmlNode.START);
                this.hub.startSession();
                this.runningSession.set(true);
            }
            this.lastUpdatedSession.set(currentTimeMillis);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        if (this.enableSessionTracking) {
            this.lastUpdatedSession.set(this.currentDateProvider.getCurrentTimeMillis());
            scheduleEndSession();
        }
        addAppBreadcrumb("background");
    }

    private void scheduleEndSession() {
        cancelTask();
        TimerTask timerTask = new TimerTask() { // from class: io.sentry.android.core.LifecycleWatcher.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                LifecycleWatcher.this.addSessionBreadcrumb(TtmlNode.END);
                LifecycleWatcher.this.hub.endSession();
                LifecycleWatcher.this.runningSession.set(false);
            }
        };
        this.timerTask = timerTask;
        this.timer.schedule(timerTask, this.sessionIntervalMillis);
    }

    private void cancelTask() {
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.timerTask = null;
        }
    }

    private void addAppBreadcrumb(String str) {
        if (this.enableAppLifecycleBreadcrumbs) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType(NotificationCompat.CATEGORY_NAVIGATION);
            breadcrumb.setData("state", str);
            breadcrumb.setCategory("app.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            this.hub.addBreadcrumb(breadcrumb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionBreadcrumb(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE);
        breadcrumb.setData("state", str);
        breadcrumb.setCategory("app.lifecycle");
        breadcrumb.setLevel(SentryLevel.INFO);
        this.hub.addBreadcrumb(breadcrumb);
    }

    AtomicBoolean isRunningSession() {
        return this.runningSession;
    }

    TimerTask getTimerTask() {
        return this.timerTask;
    }
}
