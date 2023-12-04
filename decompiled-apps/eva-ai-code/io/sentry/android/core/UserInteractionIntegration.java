package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.gestures.NoOpWindowCallback;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.android.core.internal.gestures.SentryWindowCallback;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
/* loaded from: classes4.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    private final Application application;
    private IHub hub;
    private final boolean isAndroidXAvailable;
    private final boolean isAndroidXScrollViewAvailable;
    private SentryAndroidOptions options;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public UserInteractionIntegration(Application application, LoadClass loadClass) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
        this.isAndroidXAvailable = loadClass.isClassAvailable("androidx.core.view.GestureDetectorCompat", this.options);
        this.isAndroidXScrollViewAvailable = loadClass.isClassAvailable("androidx.core.view.ScrollingView", this.options);
    }

    private void startTracking(Window window, Context context) {
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
            }
        } else if (this.hub == null || this.options == null) {
        } else {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new NoOpWindowCallback();
            }
            window.setCallback(new SentryWindowCallback(callback, context, new SentryGestureListener(new WeakReference(window), this.hub, this.options, this.isAndroidXScrollViewAvailable), this.options));
        }
    }

    private void stopTracking(Window window) {
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof SentryWindowCallback) {
            SentryWindowCallback sentryWindowCallback = (SentryWindowCallback) callback;
            if (sentryWindowCallback.getDelegate() instanceof NoOpWindowCallback) {
                window.setCallback(null);
            } else {
                window.setCallback(sentryWindowCallback.getDelegate());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        startTracking(activity.getWindow(), activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        stopTracking(activity.getWindow());
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required");
        this.options.getLogger().log(SentryLevel.DEBUG, "UserInteractionIntegration enabled: %s", Boolean.valueOf(this.options.isEnableUserInteractionBreadcrumbs()));
        if (this.options.isEnableUserInteractionBreadcrumbs()) {
            if (this.isAndroidXAvailable) {
                this.application.registerActivityLifecycleCallbacks(this);
                this.options.getLogger().log(SentryLevel.DEBUG, "UserInteractionIntegration installed.", new Object[0]);
                return;
            }
            sentryOptions.getLogger().log(SentryLevel.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }
}
