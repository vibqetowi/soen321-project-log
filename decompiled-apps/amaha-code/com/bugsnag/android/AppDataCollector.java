package com.bugsnag.android;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import com.bugsnag.android.internal.ImmutableConfig;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.g;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: AppDataCollector.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;BC\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b9\u0010:J\u001e\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H\u0002J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0003J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010!\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0016\u0010#\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0016\u0010$\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/bugsnag/android/AppDataCollector;", "", "", "", "map", "Lhs/k;", "populateRuntimeMemoryMetadata", "", "isBackgroundWorkRestricted", "()Ljava/lang/Boolean;", "getAppName", "findProcessName", "Lcom/bugsnag/android/App;", "generateApp", "Lcom/bugsnag/android/AppWithState;", "generateAppWithState", "getAppDataMetadata", "binaryArch", "setBinaryArch", "inForeground", "", "calculateDurationInForeground$bugsnag_android_core_release", "(Ljava/lang/Boolean;)Ljava/lang/Long;", "calculateDurationInForeground", "codeBundleId", "Ljava/lang/String;", "getCodeBundleId", "()Ljava/lang/String;", "setCodeBundleId", "(Ljava/lang/String;)V", "packageName", "bgWorkRestricted", "Ljava/lang/Boolean;", "appName", "processName", "releaseStage", "versionName", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/content/pm/PackageManager;", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "Lcom/bugsnag/android/SessionTracker;", "sessionTracker", "Lcom/bugsnag/android/SessionTracker;", "Landroid/app/ActivityManager;", "activityManager", "Landroid/app/ActivityManager;", "Lcom/bugsnag/android/LaunchCrashTracker;", "launchCrashTracker", "Lcom/bugsnag/android/LaunchCrashTracker;", "Lcom/bugsnag/android/MemoryTrimState;", "memoryTrimState", "Lcom/bugsnag/android/MemoryTrimState;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;Landroid/content/pm/PackageManager;Lcom/bugsnag/android/internal/ImmutableConfig;Lcom/bugsnag/android/SessionTracker;Landroid/app/ActivityManager;Lcom/bugsnag/android/LaunchCrashTracker;Lcom/bugsnag/android/MemoryTrimState;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class AppDataCollector {
    public static final Companion Companion = new Companion(null);
    private static final long startTimeMs = SystemClock.elapsedRealtime();
    private final ActivityManager activityManager;
    private final String appName;
    private final Boolean bgWorkRestricted;
    private String binaryArch;
    private String codeBundleId;
    private final ImmutableConfig config;
    private final LaunchCrashTracker launchCrashTracker;
    private final MemoryTrimState memoryTrimState;
    private final PackageManager packageManager;
    private final String packageName;
    private final String processName;
    private final String releaseStage;
    private final SessionTracker sessionTracker;
    private final String versionName;

    /* compiled from: AppDataCollector.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/AppDataCollector$Companion;", "", "()V", "startTimeMs", "", "getStartTimeMs$bugsnag_android_core_release", "()J", "getDurationMs", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final long getDurationMs() {
            return SystemClock.elapsedRealtime() - getStartTimeMs$bugsnag_android_core_release();
        }

        public final long getStartTimeMs$bugsnag_android_core_release() {
            return AppDataCollector.startTimeMs;
        }
    }

    public AppDataCollector(Context appContext, PackageManager packageManager, ImmutableConfig config, SessionTracker sessionTracker, ActivityManager activityManager, LaunchCrashTracker launchCrashTracker, MemoryTrimState memoryTrimState) {
        i.h(appContext, "appContext");
        i.h(config, "config");
        i.h(sessionTracker, "sessionTracker");
        i.h(launchCrashTracker, "launchCrashTracker");
        i.h(memoryTrimState, "memoryTrimState");
        this.packageManager = packageManager;
        this.config = config;
        this.sessionTracker = sessionTracker;
        this.activityManager = activityManager;
        this.launchCrashTracker = launchCrashTracker;
        this.memoryTrimState = memoryTrimState;
        String packageName = appContext.getPackageName();
        i.c(packageName, "appContext.packageName");
        this.packageName = packageName;
        this.bgWorkRestricted = isBackgroundWorkRestricted();
        this.appName = getAppName();
        this.processName = findProcessName();
        this.releaseStage = config.getReleaseStage();
        String appVersion = config.getAppVersion();
        if (appVersion == null) {
            PackageInfo packageInfo = config.getPackageInfo();
            if (packageInfo != null) {
                appVersion = packageInfo.versionName;
            } else {
                appVersion = null;
            }
        }
        this.versionName = appVersion;
    }

    public static /* synthetic */ Long calculateDurationInForeground$bugsnag_android_core_release$default(AppDataCollector appDataCollector, Boolean bool, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bool = appDataCollector.sessionTracker.isInForeground();
        }
        return appDataCollector.calculateDurationInForeground$bugsnag_android_core_release(bool);
    }

    private final String findProcessName() {
        Object j10;
        Object obj = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = Application.getProcessName();
            } else {
                Object invoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
                if (invoke != null) {
                    j10 = (String) invoke;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            }
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (!(j10 instanceof g.a)) {
            obj = j10;
        }
        return (String) obj;
    }

    private final String getAppName() {
        ApplicationInfo appInfo = this.config.getAppInfo();
        PackageManager packageManager = this.packageManager;
        if (packageManager != null && appInfo != null) {
            return packageManager.getApplicationLabel(appInfo).toString();
        }
        return null;
    }

    private final Boolean isBackgroundWorkRestricted() {
        boolean isBackgroundRestricted;
        ActivityManager activityManager = this.activityManager;
        if (activityManager != null && Build.VERSION.SDK_INT >= 28) {
            isBackgroundRestricted = activityManager.isBackgroundRestricted();
            if (!isBackgroundRestricted) {
                return null;
            }
            return Boolean.TRUE;
        }
        return null;
    }

    private final void populateRuntimeMemoryMetadata(Map<String, Object> map) {
        Runtime runtime = Runtime.getRuntime();
        long j10 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        map.put("memoryUsage", Long.valueOf(j10 - freeMemory));
        map.put("totalMemory", Long.valueOf(j10));
        map.put("freeMemory", Long.valueOf(freeMemory));
        map.put("memoryLimit", Long.valueOf(runtime.maxMemory()));
    }

    public final Long calculateDurationInForeground$bugsnag_android_core_release(Boolean bool) {
        long j10;
        if (bool == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long lastEnteredForegroundMs = this.sessionTracker.getLastEnteredForegroundMs();
        if (bool.booleanValue() && lastEnteredForegroundMs != 0) {
            j10 = elapsedRealtime - lastEnteredForegroundMs;
        } else {
            j10 = 0;
        }
        if (j10 > 0) {
            return Long.valueOf(j10);
        }
        return 0L;
    }

    public final App generateApp() {
        return new App(this.config, this.binaryArch, this.packageName, this.releaseStage, this.versionName, this.codeBundleId);
    }

    public final AppWithState generateAppWithState() {
        Boolean isInForeground = this.sessionTracker.isInForeground();
        return new AppWithState(this.config, this.binaryArch, this.packageName, this.releaseStage, this.versionName, this.codeBundleId, Long.valueOf(Companion.getDurationMs()), calculateDurationInForeground$bugsnag_android_core_release(isInForeground), isInForeground, Boolean.valueOf(this.launchCrashTracker.isLaunching()));
    }

    public final Map<String, Object> getAppDataMetadata() {
        HashMap hashMap = new HashMap();
        hashMap.put(SessionManager.KEY_NAME, this.appName);
        hashMap.put("activeScreen", this.sessionTracker.getContextActivity());
        hashMap.put("lowMemory", Boolean.valueOf(this.memoryTrimState.isLowMemory()));
        hashMap.put("memoryTrimLevel", this.memoryTrimState.getTrimLevelDescription());
        populateRuntimeMemoryMetadata(hashMap);
        Boolean bool = this.bgWorkRestricted;
        if (bool != null) {
            bool.booleanValue();
            hashMap.put("backgroundWorkRestricted", this.bgWorkRestricted);
        }
        String str = this.processName;
        if (str != null) {
            hashMap.put("processName", str);
        }
        return hashMap;
    }

    public final String getCodeBundleId() {
        return this.codeBundleId;
    }

    public final void setBinaryArch(String binaryArch) {
        i.h(binaryArch, "binaryArch");
        this.binaryArch = binaryArch;
    }

    public final void setCodeBundleId(String str) {
        this.codeBundleId = str;
    }
}
