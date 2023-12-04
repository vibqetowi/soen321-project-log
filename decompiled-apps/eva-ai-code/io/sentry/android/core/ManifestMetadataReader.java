package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: classes4.dex */
final class ManifestMetadataReader {
    static final String ANR_ENABLE = "io.sentry.anr.enable";
    static final String ANR_REPORT_DEBUG = "io.sentry.anr.report-debug";
    static final String ANR_TIMEOUT_INTERVAL_MILLIS = "io.sentry.anr.timeout-interval-millis";
    static final String ATTACH_THREADS = "io.sentry.attach-threads";
    static final String AUTO_INIT = "io.sentry.auto-init";
    static final String AUTO_SESSION_TRACKING_ENABLE = "io.sentry.auto-session-tracking.enable";
    static final String BREADCRUMBS_ACTIVITY_LIFECYCLE_ENABLE = "io.sentry.breadcrumbs.activity-lifecycle";
    static final String BREADCRUMBS_APP_COMPONENTS_ENABLE = "io.sentry.breadcrumbs.app-components";
    static final String BREADCRUMBS_APP_LIFECYCLE_ENABLE = "io.sentry.breadcrumbs.app-lifecycle";
    static final String BREADCRUMBS_SYSTEM_EVENTS_ENABLE = "io.sentry.breadcrumbs.system-events";
    static final String BREADCRUMBS_USER_INTERACTION_ENABLE = "io.sentry.breadcrumbs.user-interaction";
    static final String DEBUG = "io.sentry.debug";
    static final String DEBUG_LEVEL = "io.sentry.debug.level";
    static final String DSN = "io.sentry.dsn";
    static final String ENVIRONMENT = "io.sentry.environment";
    static final String NDK_ENABLE = "io.sentry.ndk.enable";
    static final String NDK_SCOPE_SYNC_ENABLE = "io.sentry.ndk.scope-sync.enable";
    static final String PROGUARD_UUID = "io.sentry.proguard-uuid";
    static final String RELEASE = "io.sentry.release";
    static final String SAMPLE_RATE = "io.sentry.sample-rate";
    static final String SESSION_TRACKING_ENABLE = "io.sentry.session-tracking.enable";
    static final String SESSION_TRACKING_TIMEOUT_INTERVAL_MILLIS = "io.sentry.session-tracking.timeout-interval-millis";
    static final String TRACES_ACTIVITY_AUTO_FINISH_ENABLE = "io.sentry.traces.activity.auto-finish.enable";
    static final String TRACES_ACTIVITY_ENABLE = "io.sentry.traces.activity.enable";
    static final String TRACES_SAMPLE_RATE = "io.sentry.traces.sample-rate";
    static final String TRACE_SAMPLING = "io.sentry.traces.trace-sampling";
    static final String TRACING_ORIGINS = "io.sentry.traces.tracing-origins";
    static final String UNCAUGHT_EXCEPTION_HANDLER_ENABLE = "io.sentry.uncaught-exception-handler.enable";

    private ManifestMetadataReader() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void applyMetadata(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String readString;
        Objects.requireNonNull(context, "The application context is required.");
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle metadata = getMetadata(context);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (metadata != null) {
                sentryAndroidOptions.setDebug(Boolean.valueOf(readBool(metadata, logger, DEBUG, sentryAndroidOptions.isDebug())));
                if (sentryAndroidOptions.isDebug() && (readString = readString(metadata, logger, DEBUG_LEVEL, sentryAndroidOptions.getDiagnosticLevel().name().toLowerCase(Locale.ROOT))) != null) {
                    sentryAndroidOptions.setDiagnosticLevel(SentryLevel.valueOf(readString.toUpperCase(Locale.ROOT)));
                }
                sentryAndroidOptions.setAnrEnabled(readBool(metadata, logger, ANR_ENABLE, sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(readBool(metadata, logger, AUTO_SESSION_TRACKING_ENABLE, readBool(metadata, logger, SESSION_TRACKING_ENABLE, sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double readDouble = readDouble(metadata, logger, SAMPLE_RATE);
                    if (readDouble.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(readDouble);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(readBool(metadata, logger, ANR_REPORT_DEBUG, sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(readLong(metadata, logger, ANR_TIMEOUT_INTERVAL_MILLIS, sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                String readString2 = readString(metadata, logger, DSN, sentryAndroidOptions.getDsn());
                if (readString2 == null) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                } else if (readString2.isEmpty()) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "DSN is empty, disabling sentry-android", new Object[0]);
                }
                sentryAndroidOptions.setDsn(readString2);
                sentryAndroidOptions.setEnableNdk(readBool(metadata, logger, NDK_ENABLE, sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(readBool(metadata, logger, NDK_SCOPE_SYNC_ENABLE, sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(readString(metadata, logger, RELEASE, sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(readString(metadata, logger, ENVIRONMENT, sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(readLong(metadata, logger, SESSION_TRACKING_TIMEOUT_INTERVAL_MILLIS, sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_ACTIVITY_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_SYSTEM_EVENTS_ENABLE, sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_COMPONENTS_ENABLE, sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_USER_INTERACTION_ENABLE, sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(Boolean.valueOf(readBool(metadata, logger, UNCAUGHT_EXCEPTION_HANDLER_ENABLE, sentryAndroidOptions.isEnableUncaughtExceptionHandler())));
                sentryAndroidOptions.setAttachThreads(readBool(metadata, logger, ATTACH_THREADS, sentryAndroidOptions.isAttachThreads()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    Double readDouble2 = readDouble(metadata, logger, TRACES_SAMPLE_RATE);
                    if (readDouble2.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(readDouble2);
                    }
                }
                sentryAndroidOptions.setTraceSampling(readBool(metadata, logger, TRACE_SAMPLING, sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(readBool(metadata, logger, TRACES_ACTIVITY_ENABLE, sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(readBool(metadata, logger, TRACES_ACTIVITY_AUTO_FINISH_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                List<String> readList = readList(metadata, logger, TRACING_ORIGINS);
                if (readList != null) {
                    for (String str : readList) {
                        sentryAndroidOptions.addTracingOrigin(str);
                    }
                }
                sentryAndroidOptions.setProguardUuid(readString(metadata, logger, PROGUARD_UUID, sentryAndroidOptions.getProguardUuid()));
            }
            sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    private static boolean readBool(Bundle bundle, ILogger iLogger, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    private static String readString(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, string);
        return string;
    }

    private static List<String> readList(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static Double readDouble(Bundle bundle, ILogger iLogger, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    private static long readLong(Bundle bundle, ILogger iLogger, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, Long.valueOf(j2));
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isAutoInit(Context context, ILogger iLogger) {
        Objects.requireNonNull(context, "The application context is required.");
        try {
            Bundle metadata = getMetadata(context);
            r0 = metadata != null ? readBool(metadata, iLogger, AUTO_INIT, true) : true;
            iLogger.log(SentryLevel.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        return r0;
    }

    private static Bundle getMetadata(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
    }
}
