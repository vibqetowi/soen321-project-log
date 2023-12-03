package com.bugsnag.android;

import android.content.Context;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.DependencyModule;
import hs.d;
import kotlin.jvm.internal.i;
/* compiled from: StorageModule.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010'¨\u00061"}, d2 = {"Lcom/bugsnag/android/StorageModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "Lcom/bugsnag/android/SharedPrefMigrator;", "sharedPrefMigrator$delegate", "Lhs/d;", "getSharedPrefMigrator", "()Lcom/bugsnag/android/SharedPrefMigrator;", "sharedPrefMigrator", "Lcom/bugsnag/android/DeviceIdStore;", "deviceIdStore$delegate", "getDeviceIdStore", "()Lcom/bugsnag/android/DeviceIdStore;", "deviceIdStore", "", "deviceId$delegate", "getDeviceId", "()Ljava/lang/String;", "deviceId", "internalDeviceId$delegate", "getInternalDeviceId", "internalDeviceId", "Lcom/bugsnag/android/UserStore;", "userStore$delegate", "getUserStore", "()Lcom/bugsnag/android/UserStore;", "userStore", "Lcom/bugsnag/android/LastRunInfoStore;", "lastRunInfoStore$delegate", "getLastRunInfoStore", "()Lcom/bugsnag/android/LastRunInfoStore;", "lastRunInfoStore", "Lcom/bugsnag/android/SessionStore;", "sessionStore$delegate", "getSessionStore", "()Lcom/bugsnag/android/SessionStore;", "sessionStore", "Lcom/bugsnag/android/LastRunInfo;", "lastRunInfo$delegate", "getLastRunInfo", "()Lcom/bugsnag/android/LastRunInfo;", "lastRunInfo", "Landroid/content/Context;", "appContext", "Lcom/bugsnag/android/internal/ImmutableConfig;", "immutableConfig", "Lcom/bugsnag/android/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcom/bugsnag/android/internal/ImmutableConfig;Lcom/bugsnag/android/Logger;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StorageModule extends DependencyModule {
    private final d deviceId$delegate;
    private final d deviceIdStore$delegate;
    private final d internalDeviceId$delegate;
    private final d lastRunInfo$delegate;
    private final d lastRunInfoStore$delegate;
    private final d sessionStore$delegate;
    private final d sharedPrefMigrator$delegate;
    private final d userStore$delegate;

    public StorageModule(Context appContext, ImmutableConfig immutableConfig, Logger logger) {
        i.h(appContext, "appContext");
        i.h(immutableConfig, "immutableConfig");
        i.h(logger, "logger");
        this.sharedPrefMigrator$delegate = future(new StorageModule$sharedPrefMigrator$2(appContext));
        this.deviceIdStore$delegate = future(new StorageModule$deviceIdStore$2(this, appContext, logger));
        this.deviceId$delegate = future(new StorageModule$deviceId$2(this));
        this.internalDeviceId$delegate = future(new StorageModule$internalDeviceId$2(this));
        this.userStore$delegate = future(new StorageModule$userStore$2(this, immutableConfig, logger));
        this.lastRunInfoStore$delegate = future(new StorageModule$lastRunInfoStore$2(immutableConfig));
        this.sessionStore$delegate = future(new StorageModule$sessionStore$2(immutableConfig, logger));
        this.lastRunInfo$delegate = future(new StorageModule$lastRunInfo$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceIdStore getDeviceIdStore() {
        return (DeviceIdStore) this.deviceIdStore$delegate.getValue();
    }

    public final String getDeviceId() {
        return (String) this.deviceId$delegate.getValue();
    }

    public final String getInternalDeviceId() {
        return (String) this.internalDeviceId$delegate.getValue();
    }

    public final LastRunInfo getLastRunInfo() {
        return (LastRunInfo) this.lastRunInfo$delegate.getValue();
    }

    public final LastRunInfoStore getLastRunInfoStore() {
        return (LastRunInfoStore) this.lastRunInfoStore$delegate.getValue();
    }

    public final SessionStore getSessionStore() {
        return (SessionStore) this.sessionStore$delegate.getValue();
    }

    public final SharedPrefMigrator getSharedPrefMigrator() {
        return (SharedPrefMigrator) this.sharedPrefMigrator$delegate.getValue();
    }

    public final UserStore getUserStore() {
        return (UserStore) this.userStore$delegate.getValue();
    }
}
