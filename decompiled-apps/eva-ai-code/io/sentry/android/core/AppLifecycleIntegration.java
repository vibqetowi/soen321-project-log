package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.MainThreadChecker;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes4.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {
    private final IHandler handler;
    private SentryAndroidOptions options;
    LifecycleWatcher watcher;

    public AppLifecycleIntegration() {
        this(new MainLooperHandler());
    }

    AppLifecycleIntegration(IHandler iHandler) {
        this.handler = iHandler;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007e -> B:20:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008b -> B:20:0x0096). Please submit an issue!!! */
    @Override // io.sentry.Integration
    public void register(final IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "enableSessionTracking enabled: %s", Boolean.valueOf(this.options.isEnableAutoSessionTracking()));
        this.options.getLogger().log(SentryLevel.DEBUG, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.options.isEnableAppLifecycleBreadcrumbs()));
        if (this.options.isEnableAutoSessionTracking() || this.options.isEnableAppLifecycleBreadcrumbs()) {
            try {
                Class.forName("androidx.lifecycle.DefaultLifecycleObserver");
                Class.forName("androidx.lifecycle.ProcessLifecycleOwner");
                if (MainThreadChecker.isMainThread()) {
                    m7258lambda$register$0$iosentryandroidcoreAppLifecycleIntegration(iHub);
                    sentryOptions = sentryOptions;
                } else {
                    this.handler.post(new Runnable() { // from class: io.sentry.android.core.AppLifecycleIntegration$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLifecycleIntegration.this.m7258lambda$register$0$iosentryandroidcoreAppLifecycleIntegration(iHub);
                        }
                    });
                    sentryOptions = sentryOptions;
                }
            } catch (ClassNotFoundException e) {
                ILogger logger = sentryOptions.getLogger();
                logger.log(SentryLevel.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e);
                sentryOptions = logger;
            } catch (IllegalStateException e2) {
                ILogger logger2 = sentryOptions.getLogger();
                logger2.log(SentryLevel.ERROR, "AppLifecycleIntegration could not be installed", e2);
                sentryOptions = logger2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addObserver */
    public void m7258lambda$register$0$iosentryandroidcoreAppLifecycleIntegration(IHub iHub) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.watcher = new LifecycleWatcher(iHub, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.options.isEnableAutoSessionTracking(), this.options.isEnableAppLifecycleBreadcrumbs());
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this.watcher);
        this.options.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeObserver */
    public void m7257lambda$close$1$iosentryandroidcoreAppLifecycleIntegration() {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this.watcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.watcher != null) {
            if (MainThreadChecker.isMainThread()) {
                m7257lambda$close$1$iosentryandroidcoreAppLifecycleIntegration();
            } else {
                this.handler.post(new Runnable() { // from class: io.sentry.android.core.AppLifecycleIntegration$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLifecycleIntegration.this.m7257lambda$close$1$iosentryandroidcoreAppLifecycleIntegration();
                    }
                });
            }
            this.watcher = null;
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
    }
}
