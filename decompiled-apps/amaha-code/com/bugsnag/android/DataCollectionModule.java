package com.bugsnag.android;

import android.content.Context;
import android.os.Environment;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.ConfigModule;
import com.bugsnag.android.internal.dag.ContextModule;
import com.bugsnag.android.internal.dag.DependencyModule;
import com.bugsnag.android.internal.dag.SystemServiceModule;
import hs.d;
import java.io.File;
import kotlin.jvm.internal.i;
/* compiled from: DataCollectionModule.kt */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00100\u001a\u0004\u0018\u00010.\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lcom/bugsnag/android/DataCollectionModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Lcom/bugsnag/android/internal/ImmutableConfig;", "cfg", "Lcom/bugsnag/android/internal/ImmutableConfig;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "Lcom/bugsnag/android/DeviceBuildInfo;", "deviceBuildInfo", "Lcom/bugsnag/android/DeviceBuildInfo;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "dataDir", "Ljava/io/File;", "Lcom/bugsnag/android/AppDataCollector;", "appDataCollector$delegate", "Lhs/d;", "getAppDataCollector", "()Lcom/bugsnag/android/AppDataCollector;", "appDataCollector", "Lcom/bugsnag/android/RootDetector;", "rootDetector$delegate", "getRootDetector", "()Lcom/bugsnag/android/RootDetector;", "rootDetector", "Lcom/bugsnag/android/DeviceDataCollector;", "deviceDataCollector$delegate", "getDeviceDataCollector", "()Lcom/bugsnag/android/DeviceDataCollector;", "deviceDataCollector", "Lcom/bugsnag/android/internal/dag/ContextModule;", "contextModule", "Lcom/bugsnag/android/internal/dag/ConfigModule;", "configModule", "Lcom/bugsnag/android/internal/dag/SystemServiceModule;", "systemServiceModule", "Lcom/bugsnag/android/TrackerModule;", "trackerModule", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "bgTaskService", "Lcom/bugsnag/android/Connectivity;", "connectivity", "", "deviceId", "internalDeviceId", "Lcom/bugsnag/android/MemoryTrimState;", "memoryTrimState", "<init>", "(Lcom/bugsnag/android/internal/dag/ContextModule;Lcom/bugsnag/android/internal/dag/ConfigModule;Lcom/bugsnag/android/internal/dag/SystemServiceModule;Lcom/bugsnag/android/TrackerModule;Lcom/bugsnag/android/internal/BackgroundTaskService;Lcom/bugsnag/android/Connectivity;Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/MemoryTrimState;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DataCollectionModule extends DependencyModule {
    private final d appDataCollector$delegate;
    private final ImmutableConfig cfg;
    private final Context ctx;
    private final File dataDir;
    private final DeviceBuildInfo deviceBuildInfo;
    private final d deviceDataCollector$delegate;
    private final Logger logger;
    private final d rootDetector$delegate;

    public DataCollectionModule(ContextModule contextModule, ConfigModule configModule, SystemServiceModule systemServiceModule, TrackerModule trackerModule, BackgroundTaskService bgTaskService, Connectivity connectivity, String str, String str2, MemoryTrimState memoryTrimState) {
        i.h(contextModule, "contextModule");
        i.h(configModule, "configModule");
        i.h(systemServiceModule, "systemServiceModule");
        i.h(trackerModule, "trackerModule");
        i.h(bgTaskService, "bgTaskService");
        i.h(connectivity, "connectivity");
        i.h(memoryTrimState, "memoryTrimState");
        this.ctx = contextModule.getCtx();
        ImmutableConfig config = configModule.getConfig();
        this.cfg = config;
        this.logger = config.getLogger();
        this.deviceBuildInfo = DeviceBuildInfo.Companion.defaultInfo();
        this.dataDir = Environment.getDataDirectory();
        this.appDataCollector$delegate = future(new DataCollectionModule$appDataCollector$2(this, trackerModule, systemServiceModule, memoryTrimState));
        this.rootDetector$delegate = future(new DataCollectionModule$rootDetector$2(this));
        this.deviceDataCollector$delegate = future(new DataCollectionModule$deviceDataCollector$2(this, connectivity, str, str2, bgTaskService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RootDetector getRootDetector() {
        return (RootDetector) this.rootDetector$delegate.getValue();
    }

    public final AppDataCollector getAppDataCollector() {
        return (AppDataCollector) this.appDataCollector$delegate.getValue();
    }

    public final DeviceDataCollector getDeviceDataCollector() {
        return (DeviceDataCollector) this.deviceDataCollector$delegate.getValue();
    }
}
