package com.bugsnag.android.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ca.a;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Configuration;
import com.bugsnag.android.Connectivity;
import com.bugsnag.android.DebugLogger;
import com.bugsnag.android.DefaultDelivery;
import com.bugsnag.android.Delivery;
import com.bugsnag.android.EndpointConfiguration;
import com.bugsnag.android.ErrorTypes;
import com.bugsnag.android.Logger;
import com.bugsnag.android.ManifestConfigLoader;
import com.bugsnag.android.NoopLogger;
import com.bugsnag.android.Telemetry;
import com.bugsnag.android.ThreadSendPolicy;
import hs.d;
import hs.g;
import is.u;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: ImmutableConfig.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aD\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001\u001a \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u001a\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\"\u0014\u0010\u0014\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/Configuration;", "config", "", "buildUuid", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/ApplicationInfo;", "appInfo", "Lhs/d;", "Ljava/io/File;", "persistenceDir", "Lcom/bugsnag/android/internal/ImmutableConfig;", "convertToImmutableConfig", "Landroid/content/Context;", "appContext", "configuration", "Lcom/bugsnag/android/Connectivity;", "connectivity", "sanitiseConfiguration", "populateBuildUuid", "RELEASE_STAGE_DEVELOPMENT", "Ljava/lang/String;", "RELEASE_STAGE_PRODUCTION", "bugsnag-android-core_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ImmutableConfigKt {
    public static final String RELEASE_STAGE_DEVELOPMENT = "development";
    public static final String RELEASE_STAGE_PRODUCTION = "production";

    public static final ImmutableConfig convertToImmutableConfig(Configuration configuration) {
        return convertToImmutableConfig$default(configuration, null, null, null, null, 30, null);
    }

    public static /* synthetic */ ImmutableConfig convertToImmutableConfig$default(Configuration configuration, String str, PackageInfo packageInfo, ApplicationInfo applicationInfo, d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str = null;
        }
        if ((i6 & 4) != 0) {
            packageInfo = null;
        }
        if ((i6 & 8) != 0) {
            applicationInfo = null;
        }
        if ((i6 & 16) != 0) {
            dVar = b.O(new ImmutableConfigKt$convertToImmutableConfig$1(configuration));
        }
        return convertToImmutableConfig(configuration, str, packageInfo, applicationInfo, dVar);
    }

    private static final String populateBuildUuid(ApplicationInfo applicationInfo) {
        Bundle bundle;
        if (applicationInfo != null) {
            bundle = applicationInfo.metaData;
        } else {
            bundle = null;
        }
        if (bundle == null || !bundle.containsKey(ManifestConfigLoader.BUILD_UUID)) {
            return null;
        }
        String string = bundle.getString(ManifestConfigLoader.BUILD_UUID);
        if (string == null) {
            return String.valueOf(bundle.getInt(ManifestConfigLoader.BUILD_UUID));
        }
        return string;
    }

    public static final ImmutableConfig sanitiseConfiguration(Context appContext, Configuration configuration, Connectivity connectivity) {
        Object j10;
        Object j11;
        Integer num;
        Integer versionCode;
        String str;
        i.h(appContext, "appContext");
        i.h(configuration, "configuration");
        i.h(connectivity, "connectivity");
        String packageName = appContext.getPackageName();
        PackageManager packageManager = appContext.getPackageManager();
        try {
            j10 = packageManager.getPackageInfo(packageName, 0);
        } catch (Throwable th2) {
            j10 = b.j(th2);
        }
        if (j10 instanceof g.a) {
            j10 = null;
        }
        PackageInfo packageInfo = (PackageInfo) j10;
        try {
            j11 = packageManager.getApplicationInfo(packageName, 128);
        } catch (Throwable th3) {
            j11 = b.j(th3);
        }
        if (j11 instanceof g.a) {
            j11 = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) j11;
        if (configuration.getReleaseStage() == null) {
            if (applicationInfo != null && (applicationInfo.flags & 2) != 0) {
                str = RELEASE_STAGE_DEVELOPMENT;
            } else {
                str = RELEASE_STAGE_PRODUCTION;
            }
            configuration.setReleaseStage(str);
        }
        if (configuration.getLogger() == null || i.b(configuration.getLogger(), DebugLogger.INSTANCE)) {
            if (!i.b(RELEASE_STAGE_PRODUCTION, configuration.getReleaseStage())) {
                configuration.setLogger(DebugLogger.INSTANCE);
            } else {
                configuration.setLogger(NoopLogger.INSTANCE);
            }
        }
        if (configuration.getVersionCode() == null || ((versionCode = configuration.getVersionCode()) != null && versionCode.intValue() == 0)) {
            if (packageInfo != null) {
                num = Integer.valueOf(packageInfo.versionCode);
            } else {
                num = null;
            }
            configuration.setVersionCode(num);
        }
        if (configuration.getProjectPackages().isEmpty()) {
            i.c(packageName, "packageName");
            configuration.setProjectPackages(a.l1(packageName));
        }
        String populateBuildUuid = populateBuildUuid(applicationInfo);
        if (configuration.getDelivery() == null) {
            String apiKey = configuration.getApiKey();
            i.c(apiKey, "configuration.apiKey");
            int maxStringValueLength = configuration.getMaxStringValueLength();
            Logger logger = configuration.getLogger();
            if (logger != null) {
                configuration.setDelivery(new DefaultDelivery(connectivity, apiKey, maxStringValueLength, logger));
            } else {
                i.o();
                throw null;
            }
        }
        return convertToImmutableConfig(configuration, populateBuildUuid, packageInfo, applicationInfo, b.O(new ImmutableConfigKt$sanitiseConfiguration$1(configuration, appContext)));
    }

    public static final ImmutableConfig convertToImmutableConfig(Configuration configuration, String str) {
        return convertToImmutableConfig$default(configuration, str, null, null, null, 28, null);
    }

    public static final ImmutableConfig convertToImmutableConfig(Configuration configuration, String str, PackageInfo packageInfo) {
        return convertToImmutableConfig$default(configuration, str, packageInfo, null, null, 24, null);
    }

    public static final ImmutableConfig convertToImmutableConfig(Configuration configuration, String str, PackageInfo packageInfo, ApplicationInfo applicationInfo) {
        return convertToImmutableConfig$default(configuration, str, packageInfo, applicationInfo, null, 16, null);
    }

    public static final ImmutableConfig convertToImmutableConfig(Configuration config, String str, PackageInfo packageInfo, ApplicationInfo applicationInfo, d<? extends File> persistenceDir) {
        i.h(config, "config");
        i.h(persistenceDir, "persistenceDir");
        ErrorTypes copy$bugsnag_android_core_release = config.getAutoDetectErrors() ? config.getEnabledErrorTypes().copy$bugsnag_android_core_release() : new ErrorTypes(false);
        String apiKey = config.getApiKey();
        i.c(apiKey, "config.apiKey");
        boolean autoDetectErrors = config.getAutoDetectErrors();
        boolean autoTrackSessions = config.getAutoTrackSessions();
        ThreadSendPolicy sendThreads = config.getSendThreads();
        i.c(sendThreads, "config.sendThreads");
        Set<String> discardClasses = config.getDiscardClasses();
        i.c(discardClasses, "config.discardClasses");
        Set M2 = u.M2(discardClasses);
        Set<String> enabledReleaseStages = config.getEnabledReleaseStages();
        Set M22 = enabledReleaseStages != null ? u.M2(enabledReleaseStages) : null;
        Set<String> projectPackages = config.getProjectPackages();
        i.c(projectPackages, "config.projectPackages");
        Set M23 = u.M2(projectPackages);
        String releaseStage = config.getReleaseStage();
        String appVersion = config.getAppVersion();
        Integer versionCode = config.getVersionCode();
        String appType = config.getAppType();
        Delivery delivery = config.getDelivery();
        i.c(delivery, "config.delivery");
        EndpointConfiguration endpoints = config.getEndpoints();
        i.c(endpoints, "config.endpoints");
        boolean persistUser = config.getPersistUser();
        long launchDurationMillis = config.getLaunchDurationMillis();
        Logger logger = config.getLogger();
        if (logger != null) {
            i.c(logger, "config.logger!!");
            int maxBreadcrumbs = config.getMaxBreadcrumbs();
            int maxPersistedEvents = config.getMaxPersistedEvents();
            int maxPersistedSessions = config.getMaxPersistedSessions();
            int maxReportedThreads = config.getMaxReportedThreads();
            Set<BreadcrumbType> enabledBreadcrumbTypes = config.getEnabledBreadcrumbTypes();
            Set M24 = enabledBreadcrumbTypes != null ? u.M2(enabledBreadcrumbTypes) : null;
            Set<Telemetry> telemetry = config.getTelemetry();
            i.c(telemetry, "config.telemetry");
            Set M25 = u.M2(telemetry);
            boolean sendLaunchCrashesSynchronously = config.getSendLaunchCrashesSynchronously();
            boolean isAttemptDeliveryOnCrash = config.isAttemptDeliveryOnCrash();
            Set<String> redactedKeys = config.getRedactedKeys();
            i.c(redactedKeys, "config.redactedKeys");
            return new ImmutableConfig(apiKey, autoDetectErrors, copy$bugsnag_android_core_release, autoTrackSessions, sendThreads, M2, M22, M23, M24, M25, releaseStage, str, appVersion, versionCode, appType, delivery, endpoints, persistUser, launchDurationMillis, logger, maxBreadcrumbs, maxPersistedEvents, maxPersistedSessions, maxReportedThreads, persistenceDir, sendLaunchCrashesSynchronously, isAttemptDeliveryOnCrash, packageInfo, applicationInfo, u.M2(redactedKeys));
        }
        i.o();
        throw null;
    }
}
