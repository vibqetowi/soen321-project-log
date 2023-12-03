package com.bugsnag.android.internal.dag;

import android.app.ActivityManager;
import android.os.storage.StorageManager;
import com.bugsnag.android.ContextExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SystemServiceModule.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/internal/dag/SystemServiceModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "contextModule", "Lcom/bugsnag/android/internal/dag/ContextModule;", "(Lcom/bugsnag/android/internal/dag/ContextModule;)V", "activityManager", "Landroid/app/ActivityManager;", "getActivityManager", "()Landroid/app/ActivityManager;", "storageManager", "Landroid/os/storage/StorageManager;", "getStorageManager", "()Landroid/os/storage/StorageManager;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SystemServiceModule extends DependencyModule {
    private final ActivityManager activityManager;
    private final StorageManager storageManager;

    public SystemServiceModule(ContextModule contextModule) {
        i.h(contextModule, "contextModule");
        this.storageManager = ContextExtensionsKt.getStorageManagerFrom(contextModule.getCtx());
        this.activityManager = ContextExtensionsKt.getActivityManagerFrom(contextModule.getCtx());
    }

    public final ActivityManager getActivityManager() {
        return this.activityManager;
    }

    public final StorageManager getStorageManager() {
        return this.storageManager;
    }
}
