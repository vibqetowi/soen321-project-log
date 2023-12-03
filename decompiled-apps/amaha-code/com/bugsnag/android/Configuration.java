package com.bugsnag.android;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class Configuration implements CallbackAware, MetadataAware, UserAware, FeatureFlagAware {
    private static final int MAX_BREADCRUMBS = 500;
    private static final int MIN_BREADCRUMBS = 0;
    private static final long MIN_LAUNCH_CRASH_THRESHOLD_MS = 0;
    private static final int VALID_API_KEY_LEN = 32;
    final ConfigInternal impl;

    public Configuration(String str) {
        validateApiKey(str);
        this.impl = new ConfigInternal(str);
    }

    public static boolean isInvalidApiKey(String str) {
        if (!Intrinsics.isEmpty(str)) {
            if (str.length() != 32) {
                return true;
            }
            for (int i6 = 0; i6 < 32; i6++) {
                char charAt = str.charAt(i6);
                if (!Character.isDigit(charAt) && (charAt < 'a' || charAt > 'f')) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("No Bugsnag API Key set");
    }

    public static Configuration load(Context context) {
        return ConfigInternal.load(context);
    }

    private void logNull(String str) {
        Logger logger = getLogger();
        logger.e("Invalid null value supplied to config." + str + ", ignoring");
    }

    private void validateApiKey(String str) {
        if (isInvalidApiKey(str)) {
            DebugLogger debugLogger = DebugLogger.INSTANCE;
            debugLogger.w("Invalid configuration. apiKey should be a 32-character hexademical string, got " + str);
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String str) {
        if (str != null) {
            this.impl.addFeatureFlag(str);
        } else {
            logNull("addFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlags(Iterable<FeatureFlag> iterable) {
        if (iterable != null) {
            this.impl.addFeatureFlags(iterable);
        } else {
            logNull("addFeatureFlags");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String str, Map<String, ?> map) {
        if (str != null && map != null) {
            this.impl.addMetadata(str, map);
        } else {
            logNull("addMetadata");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnBreadcrumb(OnBreadcrumbCallback onBreadcrumbCallback) {
        if (onBreadcrumbCallback != null) {
            this.impl.addOnBreadcrumb(onBreadcrumbCallback);
        } else {
            logNull("addOnBreadcrumb");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnError(OnErrorCallback onErrorCallback) {
        if (onErrorCallback != null) {
            this.impl.addOnError(onErrorCallback);
        } else {
            logNull("addOnError");
        }
    }

    public void addOnSend(OnSendCallback onSendCallback) {
        if (onSendCallback != null) {
            this.impl.addOnSend(onSendCallback);
        } else {
            logNull("addOnSend");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnSession(OnSessionCallback onSessionCallback) {
        if (onSessionCallback != null) {
            this.impl.addOnSession(onSessionCallback);
        } else {
            logNull("addOnSession");
        }
    }

    public void addPlugin(Plugin plugin) {
        if (plugin != null) {
            this.impl.addPlugin(plugin);
        } else {
            logNull("addPlugin");
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlag(String str) {
        if (str != null) {
            this.impl.clearFeatureFlag(str);
        } else {
            logNull("clearFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlags() {
        this.impl.clearFeatureFlags();
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String str) {
        if (str != null) {
            this.impl.clearMetadata(str);
        } else {
            logNull("clearMetadata");
        }
    }

    public String getApiKey() {
        return this.impl.getApiKey();
    }

    public String getAppType() {
        return this.impl.getAppType();
    }

    public String getAppVersion() {
        return this.impl.getAppVersion();
    }

    public boolean getAutoDetectErrors() {
        return this.impl.getAutoDetectErrors();
    }

    public boolean getAutoTrackSessions() {
        return this.impl.getAutoTrackSessions();
    }

    public String getContext() {
        return this.impl.getContext();
    }

    public Delivery getDelivery() {
        return this.impl.getDelivery();
    }

    public Set<String> getDiscardClasses() {
        return this.impl.getDiscardClasses();
    }

    public Set<BreadcrumbType> getEnabledBreadcrumbTypes() {
        return this.impl.getEnabledBreadcrumbTypes();
    }

    public ErrorTypes getEnabledErrorTypes() {
        return this.impl.getEnabledErrorTypes();
    }

    public Set<String> getEnabledReleaseStages() {
        return this.impl.getEnabledReleaseStages();
    }

    public EndpointConfiguration getEndpoints() {
        return this.impl.getEndpoints();
    }

    @Deprecated
    public long getLaunchCrashThresholdMs() {
        getLogger().w("The launchCrashThresholdMs configuration option is deprecated and will be removed in a future release. Please use launchDurationMillis instead.");
        return getLaunchDurationMillis();
    }

    public long getLaunchDurationMillis() {
        return this.impl.getLaunchDurationMillis();
    }

    public Logger getLogger() {
        return this.impl.getLogger();
    }

    public int getMaxBreadcrumbs() {
        return this.impl.getMaxBreadcrumbs();
    }

    public int getMaxPersistedEvents() {
        return this.impl.getMaxPersistedEvents();
    }

    public int getMaxPersistedSessions() {
        return this.impl.getMaxPersistedSessions();
    }

    public int getMaxReportedThreads() {
        return this.impl.getMaxReportedThreads();
    }

    public int getMaxStringValueLength() {
        return this.impl.getMaxStringValueLength();
    }

    @Override // com.bugsnag.android.MetadataAware
    public Map<String, Object> getMetadata(String str) {
        if (str != null) {
            return this.impl.getMetadata(str);
        }
        logNull("getMetadata");
        return null;
    }

    public Notifier getNotifier() {
        return this.impl.getNotifier();
    }

    public boolean getPersistUser() {
        return this.impl.getPersistUser();
    }

    public File getPersistenceDirectory() {
        return this.impl.getPersistenceDirectory();
    }

    public Set<Plugin> getPlugins() {
        return this.impl.getPlugins();
    }

    public Set<String> getProjectPackages() {
        return this.impl.getProjectPackages();
    }

    public Set<String> getRedactedKeys() {
        return this.impl.getRedactedKeys();
    }

    public String getReleaseStage() {
        return this.impl.getReleaseStage();
    }

    public boolean getSendLaunchCrashesSynchronously() {
        return this.impl.getSendLaunchCrashesSynchronously();
    }

    public ThreadSendPolicy getSendThreads() {
        return this.impl.getSendThreads();
    }

    public Set<Telemetry> getTelemetry() {
        return this.impl.getTelemetry();
    }

    @Override // com.bugsnag.android.UserAware
    public User getUser() {
        return this.impl.getUser();
    }

    public Integer getVersionCode() {
        return this.impl.getVersionCode();
    }

    public boolean isAttemptDeliveryOnCrash() {
        return this.impl.getAttemptDeliveryOnCrash();
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnBreadcrumb(OnBreadcrumbCallback onBreadcrumbCallback) {
        if (onBreadcrumbCallback != null) {
            this.impl.removeOnBreadcrumb(onBreadcrumbCallback);
        } else {
            logNull("removeOnBreadcrumb");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnError(OnErrorCallback onErrorCallback) {
        if (onErrorCallback != null) {
            this.impl.removeOnError(onErrorCallback);
        } else {
            logNull("removeOnError");
        }
    }

    public void removeOnSend(OnSendCallback onSendCallback) {
        if (onSendCallback != null) {
            this.impl.removeOnSend(onSendCallback);
        } else {
            logNull("removeOnSend");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnSession(OnSessionCallback onSessionCallback) {
        if (onSessionCallback != null) {
            this.impl.removeOnSession(onSessionCallback);
        } else {
            logNull("removeOnSession");
        }
    }

    public void setApiKey(String str) {
        validateApiKey(str);
        this.impl.setApiKey(str);
    }

    public void setAppType(String str) {
        this.impl.setAppType(str);
    }

    public void setAppVersion(String str) {
        this.impl.setAppVersion(str);
    }

    public void setAttemptDeliveryOnCrash(boolean z10) {
        this.impl.setAttemptDeliveryOnCrash(z10);
    }

    public void setAutoDetectErrors(boolean z10) {
        this.impl.setAutoDetectErrors(z10);
    }

    public void setAutoTrackSessions(boolean z10) {
        this.impl.setAutoTrackSessions(z10);
    }

    public void setContext(String str) {
        this.impl.setContext(str);
    }

    public void setDelivery(Delivery delivery) {
        if (delivery != null) {
            this.impl.setDelivery(delivery);
        } else {
            logNull("delivery");
        }
    }

    public void setDiscardClasses(Set<String> set) {
        if (CollectionUtils.containsNullElements(set)) {
            logNull("discardClasses");
        } else {
            this.impl.setDiscardClasses(set);
        }
    }

    public void setEnabledBreadcrumbTypes(Set<BreadcrumbType> set) {
        this.impl.setEnabledBreadcrumbTypes(set);
    }

    public void setEnabledErrorTypes(ErrorTypes errorTypes) {
        if (errorTypes != null) {
            this.impl.setEnabledErrorTypes(errorTypes);
        } else {
            logNull("enabledErrorTypes");
        }
    }

    public void setEnabledReleaseStages(Set<String> set) {
        this.impl.setEnabledReleaseStages(set);
    }

    public void setEndpoints(EndpointConfiguration endpointConfiguration) {
        if (endpointConfiguration != null) {
            this.impl.setEndpoints(endpointConfiguration);
        } else {
            logNull("endpoints");
        }
    }

    @Deprecated
    public void setLaunchCrashThresholdMs(long j10) {
        getLogger().w("The launchCrashThresholdMs configuration option is deprecated and will be removed in a future release. Please use launchDurationMillis instead.");
        setLaunchDurationMillis(j10);
    }

    public void setLaunchDurationMillis(long j10) {
        if (j10 >= MIN_LAUNCH_CRASH_THRESHOLD_MS) {
            this.impl.setLaunchDurationMillis(j10);
            return;
        }
        Logger logger = getLogger();
        logger.e("Invalid configuration value detected. Option launchDurationMillis should be a positive long value.Supplied value is " + j10);
    }

    public void setLogger(Logger logger) {
        this.impl.setLogger(logger);
    }

    public void setMaxBreadcrumbs(int i6) {
        if (i6 >= 0 && i6 <= MAX_BREADCRUMBS) {
            this.impl.setMaxBreadcrumbs(i6);
            return;
        }
        Logger logger = getLogger();
        logger.e("Invalid configuration value detected. Option maxBreadcrumbs should be an integer between 0-500. Supplied value is " + i6);
    }

    public void setMaxPersistedEvents(int i6) {
        if (i6 >= 0) {
            this.impl.setMaxPersistedEvents(i6);
            return;
        }
        Logger logger = getLogger();
        logger.e("Invalid configuration value detected. Option maxPersistedEvents should be a positive integer.Supplied value is " + i6);
    }

    public void setMaxPersistedSessions(int i6) {
        if (i6 >= 0) {
            this.impl.setMaxPersistedSessions(i6);
            return;
        }
        Logger logger = getLogger();
        logger.e("Invalid configuration value detected. Option maxPersistedSessions should be a positive integer.Supplied value is " + i6);
    }

    public void setMaxReportedThreads(int i6) {
        if (i6 >= 0) {
            this.impl.setMaxReportedThreads(i6);
            return;
        }
        Logger logger = getLogger();
        logger.e("Invalid configuration value detected. Option maxReportedThreads should be a positive integer.Supplied value is " + i6);
    }

    public void setMaxStringValueLength(int i6) {
        if (i6 >= 0) {
            this.impl.setMaxStringValueLength(i6);
            return;
        }
        Logger logger = getLogger();
        logger.e("Invalid configuration value detected. Option maxStringValueLength should be a positive integer.Supplied value is " + i6);
    }

    public void setPersistUser(boolean z10) {
        this.impl.setPersistUser(z10);
    }

    public void setPersistenceDirectory(File file) {
        this.impl.setPersistenceDirectory(file);
    }

    public void setProjectPackages(Set<String> set) {
        if (CollectionUtils.containsNullElements(set)) {
            logNull("projectPackages");
        } else {
            this.impl.setProjectPackages(set);
        }
    }

    public void setRedactedKeys(Set<String> set) {
        if (CollectionUtils.containsNullElements(set)) {
            logNull("redactedKeys");
        } else {
            this.impl.setRedactedKeys(set);
        }
    }

    public void setReleaseStage(String str) {
        this.impl.setReleaseStage(str);
    }

    public void setSendLaunchCrashesSynchronously(boolean z10) {
        this.impl.setSendLaunchCrashesSynchronously(z10);
    }

    public void setSendThreads(ThreadSendPolicy threadSendPolicy) {
        if (threadSendPolicy != null) {
            this.impl.setSendThreads(threadSendPolicy);
        } else {
            logNull("sendThreads");
        }
    }

    public void setTelemetry(Set<Telemetry> set) {
        if (set != null) {
            this.impl.setTelemetry(set);
        } else {
            logNull("telemetry");
        }
    }

    @Override // com.bugsnag.android.UserAware
    public void setUser(String str, String str2, String str3) {
        this.impl.setUser(str, str2, str3);
    }

    public void setVersionCode(Integer num) {
        this.impl.setVersionCode(num);
    }

    public static Configuration load(Context context, String str) {
        return ConfigInternal.load(context, str);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String str, String str2) {
        if (str != null) {
            this.impl.addFeatureFlag(str, str2);
        } else {
            logNull("addFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String str, String str2, Object obj) {
        if (str != null && str2 != null) {
            this.impl.addMetadata(str, str2, obj);
        } else {
            logNull("addMetadata");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String str, String str2) {
        if (str != null && str2 != null) {
            this.impl.clearMetadata(str, str2);
        } else {
            logNull("clearMetadata");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public Object getMetadata(String str, String str2) {
        if (str != null && str2 != null) {
            return this.impl.getMetadata(str, str2);
        }
        logNull("getMetadata");
        return null;
    }
}
