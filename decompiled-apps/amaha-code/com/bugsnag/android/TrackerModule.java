package com.bugsnag.android;

import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.ConfigModule;
import com.bugsnag.android.internal.dag.DependencyModule;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.jvm.internal.i;
/* compiled from: TrackerModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/TrackerModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "configModule", "Lcom/bugsnag/android/internal/dag/ConfigModule;", "storageModule", "Lcom/bugsnag/android/StorageModule;", SessionManager.KEY_CLIENT, "Lcom/bugsnag/android/Client;", "bgTaskService", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "callbackState", "Lcom/bugsnag/android/CallbackState;", "(Lcom/bugsnag/android/internal/dag/ConfigModule;Lcom/bugsnag/android/StorageModule;Lcom/bugsnag/android/Client;Lcom/bugsnag/android/internal/BackgroundTaskService;Lcom/bugsnag/android/CallbackState;)V", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "launchCrashTracker", "Lcom/bugsnag/android/LaunchCrashTracker;", "getLaunchCrashTracker", "()Lcom/bugsnag/android/LaunchCrashTracker;", "sessionTracker", "Lcom/bugsnag/android/SessionTracker;", "getSessionTracker", "()Lcom/bugsnag/android/SessionTracker;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class TrackerModule extends DependencyModule {
    private final ImmutableConfig config;
    private final LaunchCrashTracker launchCrashTracker;
    private final SessionTracker sessionTracker;

    public TrackerModule(ConfigModule configModule, StorageModule storageModule, Client client, BackgroundTaskService bgTaskService, CallbackState callbackState) {
        i.h(configModule, "configModule");
        i.h(storageModule, "storageModule");
        i.h(client, "client");
        i.h(bgTaskService, "bgTaskService");
        i.h(callbackState, "callbackState");
        ImmutableConfig config = configModule.getConfig();
        this.config = config;
        this.launchCrashTracker = new LaunchCrashTracker(config, null, 2, null);
        this.sessionTracker = new SessionTracker(config, callbackState, client, storageModule.getSessionStore(), config.getLogger(), bgTaskService);
    }

    public final LaunchCrashTracker getLaunchCrashTracker() {
        return this.launchCrashTracker;
    }

    public final SessionTracker getSessionTracker() {
        return this.sessionTracker;
    }
}
