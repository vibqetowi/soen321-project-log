package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.TaskType;
import com.theinnerhour.b2b.utils.Constants;
import gv.n;
import gv.r;
import hs.g;
import is.e0;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: DeviceDataCollector.kt */
@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010\\\u001a\u00020[\u0012\b\u0010M\u001a\u0004\u0018\u00010\t\u0012\b\u0010N\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0002J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0017H\u0002J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0014J\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0014H\u0007J\u0011\u0010(\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0005H\u0000¢\u0006\u0004\b*\u0010+J\u0016\u0010/\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tR\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010C\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010;R\u0016\u0010N\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010;R\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006a"}, d2 = {"Lcom/bugsnag/android/DeviceDataCollector;", "", "", "checkIsRooted", "isEmulator", "", "getScreenDensityDpi", "()Ljava/lang/Integer;", "", "", "into", "Lhs/k;", "populateBatteryInfo", "getLocationStatus", "isLocationEnabled", "getNetworkAccess", "", "getScreenDensity", "()Ljava/lang/Float;", "getScreenResolution", "", "calculateFreeMemory", "()Ljava/lang/Long;", "Ljava/util/concurrent/Future;", "retrieveTotalDeviceMemory", "calculateTotalMemory", "Lcom/bugsnag/android/Device;", "generateDevice", "now", "Lcom/bugsnag/android/DeviceWithState;", "generateDeviceWithState", "generateInternalDeviceWithState", "", "getDeviceMetadata", "", "getCpuAbi", "()[Ljava/lang/String;", "calculateFreeDisk", "getOrientationAsString$bugsnag_android_core_release", "()Ljava/lang/String;", "getOrientationAsString", "newOrientation", "updateOrientation$bugsnag_android_core_release", "(I)Z", "updateOrientation", "key", "value", "addRuntimeVersionInfo", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "displayMetrics", "Landroid/util/DisplayMetrics;", "emulator", "Z", "screenDensity", "Ljava/lang/Float;", "dpi", "Ljava/lang/Integer;", "screenResolution", "Ljava/lang/String;", "locale", "cpuAbi", "[Ljava/lang/String;", "runtimeVersions", "Ljava/util/Map;", "rootedFuture", "Ljava/util/concurrent/Future;", "totalMemoryFuture", "Ljava/util/concurrent/atomic/AtomicInteger;", "orientation", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lcom/bugsnag/android/Connectivity;", "connectivity", "Lcom/bugsnag/android/Connectivity;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "deviceId", "internalDeviceId", "Lcom/bugsnag/android/DeviceBuildInfo;", "buildInfo", "Lcom/bugsnag/android/DeviceBuildInfo;", "Ljava/io/File;", "dataDirectory", "Ljava/io/File;", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "bgTaskService", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "Landroid/content/res/Resources;", "resources", "Lcom/bugsnag/android/RootDetector;", "rootDetector", "<init>", "(Lcom/bugsnag/android/Connectivity;Landroid/content/Context;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/DeviceBuildInfo;Ljava/io/File;Lcom/bugsnag/android/RootDetector;Lcom/bugsnag/android/internal/BackgroundTaskService;Lcom/bugsnag/android/Logger;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeviceDataCollector {
    private final Context appContext;
    private final BackgroundTaskService bgTaskService;
    private final DeviceBuildInfo buildInfo;
    private final Connectivity connectivity;
    private final String[] cpuAbi;
    private final File dataDirectory;
    private final String deviceId;
    private final DisplayMetrics displayMetrics;
    private final Integer dpi;
    private final boolean emulator;
    private final String internalDeviceId;
    private final String locale;
    private final Logger logger;
    private AtomicInteger orientation;
    private final Future<Boolean> rootedFuture;
    private Map<String, Object> runtimeVersions;
    private final Float screenDensity;
    private final String screenResolution;
    private final Future<Long> totalMemoryFuture;

    public DeviceDataCollector(Connectivity connectivity, Context appContext, Resources resources, String str, String str2, DeviceBuildInfo buildInfo, File dataDirectory, final RootDetector rootDetector, BackgroundTaskService bgTaskService, Logger logger) {
        Future<Boolean> future;
        i.h(connectivity, "connectivity");
        i.h(appContext, "appContext");
        i.h(resources, "resources");
        i.h(buildInfo, "buildInfo");
        i.h(dataDirectory, "dataDirectory");
        i.h(rootDetector, "rootDetector");
        i.h(bgTaskService, "bgTaskService");
        i.h(logger, "logger");
        this.connectivity = connectivity;
        this.appContext = appContext;
        this.deviceId = str;
        this.internalDeviceId = str2;
        this.buildInfo = buildInfo;
        this.dataDirectory = dataDirectory;
        this.bgTaskService = bgTaskService;
        this.logger = logger;
        this.displayMetrics = resources.getDisplayMetrics();
        this.emulator = isEmulator();
        this.screenDensity = getScreenDensity();
        this.dpi = getScreenDensityDpi();
        this.screenResolution = getScreenResolution();
        String locale = Locale.getDefault().toString();
        i.c(locale, "Locale.getDefault().toString()");
        this.locale = locale;
        this.cpuAbi = getCpuAbi();
        this.totalMemoryFuture = retrieveTotalDeviceMemory();
        this.orientation = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer apiLevel = buildInfo.getApiLevel();
        if (apiLevel != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(apiLevel.intValue()));
        }
        String osBuild = buildInfo.getOsBuild();
        if (osBuild != null) {
            linkedHashMap.put("osBuild", osBuild);
        }
        this.runtimeVersions = linkedHashMap;
        try {
            future = bgTaskService.submitTask(TaskType.IO, new Callable<Boolean>() { // from class: com.bugsnag.android.DeviceDataCollector.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public final Boolean call() {
                    return Boolean.valueOf(RootDetector.this.isRooted());
                }
            });
        } catch (RejectedExecutionException e10) {
            this.logger.w("Failed to perform root detection checks", e10);
            future = null;
        }
        this.rootedFuture = future;
    }

    private final Long calculateFreeMemory() {
        Long l2;
        Object j10;
        ActivityManager activityManagerFrom = ContextExtensionsKt.getActivityManagerFrom(this.appContext);
        Object obj = null;
        if (activityManagerFrom != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerFrom.getMemoryInfo(memoryInfo);
            l2 = Long.valueOf(memoryInfo.availMem);
        } else {
            l2 = null;
        }
        if (l2 != null) {
            return l2;
        }
        try {
            j10 = (Long) Process.class.getDeclaredMethod("getFreeMemory", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (!(j10 instanceof g.a)) {
            obj = j10;
        }
        return (Long) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long calculateTotalMemory() {
        Long l2;
        Object j10;
        ActivityManager activityManagerFrom = ContextExtensionsKt.getActivityManagerFrom(this.appContext);
        Object obj = null;
        if (activityManagerFrom != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManagerFrom.getMemoryInfo(memoryInfo);
            l2 = Long.valueOf(memoryInfo.totalMem);
        } else {
            l2 = null;
        }
        if (l2 != null) {
            return l2;
        }
        try {
            j10 = (Long) Process.class.getDeclaredMethod("getTotalMemory", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (!(j10 instanceof g.a)) {
            obj = j10;
        }
        return (Long) obj;
    }

    private final boolean checkIsRooted() {
        try {
            Future<Boolean> future = this.rootedFuture;
            if (future == null) {
                return false;
            }
            Boolean bool = future.get();
            i.c(bool, "rootedFuture.get()");
            if (!bool.booleanValue()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final String getLocationStatus() {
        try {
            if (isLocationEnabled()) {
                return "allowed";
            }
            return "disallowed";
        } catch (Exception unused) {
            this.logger.w("Could not get locationStatus");
            return null;
        }
    }

    private final String getNetworkAccess() {
        return this.connectivity.retrieveNetworkAccessState();
    }

    private final Float getScreenDensity() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            return Float.valueOf(displayMetrics.density);
        }
        return null;
    }

    private final Integer getScreenDensityDpi() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            return Integer.valueOf(displayMetrics.densityDpi);
        }
        return null;
    }

    private final String getScreenResolution() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            DisplayMetrics displayMetrics2 = this.displayMetrics;
            int min = Math.min(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(max);
            sb2.append('x');
            sb2.append(min);
            return sb2.toString();
        }
        return null;
    }

    private final boolean isEmulator() {
        String fingerprint = this.buildInfo.getFingerprint();
        if (fingerprint != null && (n.H0(fingerprint, "unknown") || r.J0(fingerprint, Constants.COURSE_GENERIC) || r.J0(fingerprint, "vbox"))) {
            return true;
        }
        return false;
    }

    private final boolean isLocationEnabled() {
        boolean z10;
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT >= 31) {
            LocationManager locationManager = ContextExtensionsKt.getLocationManager(this.appContext);
            if (locationManager != null) {
                isLocationEnabled = locationManager.isLocationEnabled();
                if (!isLocationEnabled) {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            String string = Settings.Secure.getString(this.appContext.getContentResolver(), "location_providers_allowed");
            if (string == null) {
                return false;
            }
            if (string.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    private final void populateBatteryInfo(Map<String, Object> map) {
        boolean z10;
        try {
            Intent registerReceiverSafe = ContextExtensionsKt.registerReceiverSafe(this.appContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), this.logger);
            if (registerReceiverSafe != null) {
                int intExtra = registerReceiverSafe.getIntExtra("level", -1);
                int intExtra2 = registerReceiverSafe.getIntExtra("scale", -1);
                if (intExtra != -1 || intExtra2 != -1) {
                    map.put("batteryLevel", Float.valueOf(intExtra / intExtra2));
                }
                int intExtra3 = registerReceiverSafe.getIntExtra("status", -1);
                if (intExtra3 != 2 && intExtra3 != 5) {
                    z10 = false;
                    map.put("charging", Boolean.valueOf(z10));
                }
                z10 = true;
                map.put("charging", Boolean.valueOf(z10));
            }
        } catch (Exception unused) {
            this.logger.w("Could not get battery status");
        }
    }

    private final Future<Long> retrieveTotalDeviceMemory() {
        try {
            return this.bgTaskService.submitTask(TaskType.DEFAULT, new Callable<Long>() { // from class: com.bugsnag.android.DeviceDataCollector$retrieveTotalDeviceMemory$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public final Long call() {
                    Long calculateTotalMemory;
                    calculateTotalMemory = DeviceDataCollector.this.calculateTotalMemory();
                    return calculateTotalMemory;
                }
            });
        } catch (RejectedExecutionException e10) {
            this.logger.w("Failed to lookup available device memory", e10);
            return null;
        }
    }

    public final void addRuntimeVersionInfo(String key, String value) {
        i.h(key, "key");
        i.h(value, "value");
        LinkedHashMap z02 = e0.z0(this.runtimeVersions);
        z02.put(key, value);
        this.runtimeVersions = z02;
    }

    public final long calculateFreeDisk() {
        Object j10;
        try {
            j10 = (Long) this.bgTaskService.submitTask(TaskType.IO, new Callable<Long>() { // from class: com.bugsnag.android.DeviceDataCollector$calculateFreeDisk$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public final Long call() {
                    File file;
                    file = DeviceDataCollector.this.dataDirectory;
                    return Long.valueOf(file.getUsableSpace());
                }
            }).get();
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (j10 instanceof g.a) {
            j10 = 0L;
        }
        return ((Number) j10).longValue();
    }

    public final Device generateDevice() {
        Object j10;
        DeviceBuildInfo deviceBuildInfo = this.buildInfo;
        String[] strArr = this.cpuAbi;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        String str = this.deviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        Object obj = null;
        if (future != null) {
            try {
                j10 = (Long) future.get();
            } catch (Throwable th2) {
                j10 = b.j(th2);
            }
        } else {
            j10 = null;
        }
        if (!(j10 instanceof g.a)) {
            obj = j10;
        }
        return new Device(deviceBuildInfo, strArr, valueOf, str, str2, (Long) obj, e0.z0(this.runtimeVersions));
    }

    public final DeviceWithState generateDeviceWithState(long j10) {
        Object j11;
        DeviceBuildInfo deviceBuildInfo = this.buildInfo;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        String str = this.deviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        Object obj = null;
        if (future != null) {
            try {
                j11 = (Long) future.get();
            } catch (Throwable th2) {
                j11 = b.j(th2);
            }
        } else {
            j11 = null;
        }
        if (!(j11 instanceof g.a)) {
            obj = j11;
        }
        return new DeviceWithState(deviceBuildInfo, valueOf, str, str2, (Long) obj, e0.z0(this.runtimeVersions), Long.valueOf(calculateFreeDisk()), calculateFreeMemory(), getOrientationAsString$bugsnag_android_core_release(), new Date(j10));
    }

    public final DeviceWithState generateInternalDeviceWithState(long j10) {
        Object j11;
        DeviceBuildInfo deviceBuildInfo = this.buildInfo;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        String str = this.internalDeviceId;
        String str2 = this.locale;
        Future<Long> future = this.totalMemoryFuture;
        Object obj = null;
        if (future != null) {
            try {
                j11 = (Long) future.get();
            } catch (Throwable th2) {
                j11 = b.j(th2);
            }
        } else {
            j11 = null;
        }
        if (!(j11 instanceof g.a)) {
            obj = j11;
        }
        return new DeviceWithState(deviceBuildInfo, valueOf, str, str2, (Long) obj, e0.z0(this.runtimeVersions), Long.valueOf(calculateFreeDisk()), calculateFreeMemory(), getOrientationAsString$bugsnag_android_core_release(), new Date(j10));
    }

    public final String[] getCpuAbi() {
        String[] cpuAbis = this.buildInfo.getCpuAbis();
        if (cpuAbis == null) {
            return new String[0];
        }
        return cpuAbis;
    }

    public final Map<String, Object> getDeviceMetadata() {
        HashMap hashMap = new HashMap();
        populateBatteryInfo(hashMap);
        hashMap.put("locationStatus", getLocationStatus());
        hashMap.put("networkAccess", getNetworkAccess());
        hashMap.put("brand", this.buildInfo.getBrand());
        hashMap.put("screenDensity", this.screenDensity);
        hashMap.put("dpi", this.dpi);
        hashMap.put("emulator", Boolean.valueOf(this.emulator));
        hashMap.put("screenResolution", this.screenResolution);
        return hashMap;
    }

    public final String getOrientationAsString$bugsnag_android_core_release() {
        int i6 = this.orientation.get();
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return "landscape";
        }
        return "portrait";
    }

    public final boolean updateOrientation$bugsnag_android_core_release(int i6) {
        if (this.orientation.getAndSet(i6) != i6) {
            return true;
        }
        return false;
    }
}
