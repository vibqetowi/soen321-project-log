package com.bugsnag.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import gv.r;
import is.u;
import is.y;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ManifestConfigLoader.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J0\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ#\u0010\u0012\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/ManifestConfigLoader;", "", "Lcom/bugsnag/android/Configuration;", "config", "Landroid/os/Bundle;", "data", "Lhs/k;", "loadDetectionConfig", "loadEndpointsConfig", "loadAppConfig", "", "key", "", "default", "getStrArray", "Landroid/content/Context;", "ctx", "userSuppliedApiKey", "load", "load$bugsnag_android_core_release", "(Landroid/os/Bundle;Ljava/lang/String;)Lcom/bugsnag/android/Configuration;", "<init>", "()V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ManifestConfigLoader {
    private static final String API_KEY = "com.bugsnag.android.API_KEY";
    private static final String APP_TYPE = "com.bugsnag.android.APP_TYPE";
    private static final String APP_VERSION = "com.bugsnag.android.APP_VERSION";
    private static final String ATTEMPT_DELIVERY_ON_CRASH = "com.bugsnag.android.ATTEMPT_DELIVERY_ON_CRASH";
    private static final String AUTO_DETECT_ERRORS = "com.bugsnag.android.AUTO_DETECT_ERRORS";
    private static final String AUTO_TRACK_SESSIONS = "com.bugsnag.android.AUTO_TRACK_SESSIONS";
    private static final String BUGSNAG_NS = "com.bugsnag.android";
    public static final String BUILD_UUID = "com.bugsnag.android.BUILD_UUID";
    public static final Companion Companion = new Companion(null);
    private static final String DISCARD_CLASSES = "com.bugsnag.android.DISCARD_CLASSES";
    private static final String ENABLED_RELEASE_STAGES = "com.bugsnag.android.ENABLED_RELEASE_STAGES";
    private static final String ENDPOINT_NOTIFY = "com.bugsnag.android.ENDPOINT_NOTIFY";
    private static final String ENDPOINT_SESSIONS = "com.bugsnag.android.ENDPOINT_SESSIONS";
    private static final String LAUNCH_CRASH_THRESHOLD_MS = "com.bugsnag.android.LAUNCH_CRASH_THRESHOLD_MS";
    private static final String LAUNCH_DURATION_MILLIS = "com.bugsnag.android.LAUNCH_DURATION_MILLIS";
    private static final String MAX_BREADCRUMBS = "com.bugsnag.android.MAX_BREADCRUMBS";
    private static final String MAX_PERSISTED_EVENTS = "com.bugsnag.android.MAX_PERSISTED_EVENTS";
    private static final String MAX_PERSISTED_SESSIONS = "com.bugsnag.android.MAX_PERSISTED_SESSIONS";
    private static final String MAX_REPORTED_THREADS = "com.bugsnag.android.MAX_REPORTED_THREADS";
    private static final String PERSIST_USER = "com.bugsnag.android.PERSIST_USER";
    private static final String PROJECT_PACKAGES = "com.bugsnag.android.PROJECT_PACKAGES";
    private static final String REDACTED_KEYS = "com.bugsnag.android.REDACTED_KEYS";
    private static final String RELEASE_STAGE = "com.bugsnag.android.RELEASE_STAGE";
    private static final String SEND_LAUNCH_CRASHES_SYNCHRONOUSLY = "com.bugsnag.android.SEND_LAUNCH_CRASHES_SYNCHRONOUSLY";
    private static final String SEND_THREADS = "com.bugsnag.android.SEND_THREADS";
    private static final String VERSION_CODE = "com.bugsnag.android.VERSION_CODE";

    /* compiled from: ManifestConfigLoader.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/ManifestConfigLoader$Companion;", "", "()V", "API_KEY", "", "APP_TYPE", "APP_VERSION", "ATTEMPT_DELIVERY_ON_CRASH", "AUTO_DETECT_ERRORS", "AUTO_TRACK_SESSIONS", "BUGSNAG_NS", "BUILD_UUID", "DISCARD_CLASSES", "ENABLED_RELEASE_STAGES", "ENDPOINT_NOTIFY", "ENDPOINT_SESSIONS", "LAUNCH_CRASH_THRESHOLD_MS", "LAUNCH_DURATION_MILLIS", "MAX_BREADCRUMBS", "MAX_PERSISTED_EVENTS", "MAX_PERSISTED_SESSIONS", "MAX_REPORTED_THREADS", "PERSIST_USER", "PROJECT_PACKAGES", "REDACTED_KEYS", "RELEASE_STAGE", "SEND_LAUNCH_CRASHES_SYNCHRONOUSLY", "SEND_THREADS", "VERSION_CODE", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    private final Set<String> getStrArray(Bundle bundle, String str, Set<String> set) {
        List list;
        String string = bundle.getString(str);
        if (string != null) {
            list = r.a1(string, new String[]{","}, 0, 6);
        } else {
            list = null;
        }
        if (list != null) {
            return u.M2(list);
        }
        return set;
    }

    private final void loadAppConfig(Configuration configuration, Bundle bundle) {
        configuration.setReleaseStage(bundle.getString(RELEASE_STAGE, configuration.getReleaseStage()));
        configuration.setAppVersion(bundle.getString(APP_VERSION, configuration.getAppVersion()));
        configuration.setAppType(bundle.getString(APP_TYPE, configuration.getAppType()));
        if (bundle.containsKey(VERSION_CODE)) {
            configuration.setVersionCode(Integer.valueOf(bundle.getInt(VERSION_CODE)));
        }
        if (bundle.containsKey(ENABLED_RELEASE_STAGES)) {
            configuration.setEnabledReleaseStages(getStrArray(bundle, ENABLED_RELEASE_STAGES, configuration.getEnabledReleaseStages()));
        }
        Set<String> strArray = getStrArray(bundle, DISCARD_CLASSES, configuration.getDiscardClasses());
        Set<String> set = y.f20678u;
        if (strArray == null) {
            strArray = set;
        }
        configuration.setDiscardClasses(strArray);
        Set<String> strArray2 = getStrArray(bundle, PROJECT_PACKAGES, set);
        if (strArray2 == null) {
            strArray2 = set;
        }
        configuration.setProjectPackages(strArray2);
        Set<String> strArray3 = getStrArray(bundle, REDACTED_KEYS, configuration.getRedactedKeys());
        if (strArray3 != null) {
            set = strArray3;
        }
        configuration.setRedactedKeys(set);
    }

    private final void loadDetectionConfig(Configuration configuration, Bundle bundle) {
        configuration.setAutoTrackSessions(bundle.getBoolean(AUTO_TRACK_SESSIONS, configuration.getAutoTrackSessions()));
        configuration.setAutoDetectErrors(bundle.getBoolean(AUTO_DETECT_ERRORS, configuration.getAutoDetectErrors()));
        configuration.setPersistUser(bundle.getBoolean(PERSIST_USER, configuration.getPersistUser()));
        String string = bundle.getString(SEND_THREADS);
        if (string != null) {
            configuration.setSendThreads(ThreadSendPolicy.Companion.fromString(string));
        }
    }

    private final void loadEndpointsConfig(Configuration configuration, Bundle bundle) {
        if (bundle.containsKey(ENDPOINT_NOTIFY)) {
            String endpoint = bundle.getString(ENDPOINT_NOTIFY, configuration.getEndpoints().getNotify());
            String sessionEndpoint = bundle.getString(ENDPOINT_SESSIONS, configuration.getEndpoints().getSessions());
            i.c(endpoint, "endpoint");
            i.c(sessionEndpoint, "sessionEndpoint");
            configuration.setEndpoints(new EndpointConfiguration(endpoint, sessionEndpoint));
        }
    }

    public final Configuration load(Context ctx, String str) {
        i.h(ctx, "ctx");
        try {
            ApplicationInfo applicationInfo = ctx.getPackageManager().getApplicationInfo(ctx.getPackageName(), 128);
            i.c(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            return load$bugsnag_android_core_release(applicationInfo.metaData, str);
        } catch (Exception e10) {
            throw new IllegalStateException("Bugsnag is unable to read config from manifest.", e10);
        }
    }

    public final Configuration load$bugsnag_android_core_release(Bundle bundle, String str) {
        if (str == null) {
            if (bundle != null) {
                str = bundle.getString(API_KEY);
            } else {
                str = null;
            }
        }
        if (str != null) {
            Configuration configuration = new Configuration(str);
            if (bundle != null) {
                loadDetectionConfig(configuration, bundle);
                loadEndpointsConfig(configuration, bundle);
                loadAppConfig(configuration, bundle);
                configuration.setMaxBreadcrumbs(bundle.getInt(MAX_BREADCRUMBS, configuration.getMaxBreadcrumbs()));
                configuration.setMaxPersistedEvents(bundle.getInt(MAX_PERSISTED_EVENTS, configuration.getMaxPersistedEvents()));
                configuration.setMaxPersistedSessions(bundle.getInt(MAX_PERSISTED_SESSIONS, configuration.getMaxPersistedSessions()));
                configuration.setMaxReportedThreads(bundle.getInt(MAX_REPORTED_THREADS, configuration.getMaxReportedThreads()));
                configuration.setLaunchDurationMillis(bundle.getInt(LAUNCH_CRASH_THRESHOLD_MS, (int) configuration.getLaunchDurationMillis()));
                configuration.setLaunchDurationMillis(bundle.getInt(LAUNCH_DURATION_MILLIS, (int) configuration.getLaunchDurationMillis()));
                configuration.setSendLaunchCrashesSynchronously(bundle.getBoolean(SEND_LAUNCH_CRASHES_SYNCHRONOUSLY, configuration.getSendLaunchCrashesSynchronously()));
                configuration.setAttemptDeliveryOnCrash(bundle.getBoolean(ATTEMPT_DELIVERY_ON_CRASH, configuration.isAttemptDeliveryOnCrash()));
            }
            return configuration;
        }
        throw new IllegalArgumentException("No Bugsnag API key set");
    }
}
