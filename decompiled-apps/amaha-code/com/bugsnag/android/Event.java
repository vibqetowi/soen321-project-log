package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.InternalMetrics;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class Event implements JsonStream.Streamable, MetadataAware, UserAware, FeatureFlagAware {
    private final EventInternal impl;
    private final Logger logger;

    public Event(Throwable th2, ImmutableConfig immutableConfig, SeverityReason severityReason, Logger logger) {
        this(th2, immutableConfig, severityReason, new Metadata(), new FeatureFlags(), logger);
    }

    private void logNull(String str) {
        Logger logger = this.logger;
        logger.e("Invalid null value supplied to config." + str + ", ignoring");
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

    public AppWithState getApp() {
        return this.impl.getApp();
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return this.impl.getBreadcrumbs();
    }

    public String getContext() {
        return this.impl.getContext();
    }

    public DeviceWithState getDevice() {
        return this.impl.getDevice();
    }

    public List<Error> getErrors() {
        return this.impl.getErrors();
    }

    public List<FeatureFlag> getFeatureFlags() {
        return this.impl.getFeatureFlags().toList();
    }

    public String getGroupingHash() {
        return this.impl.getGroupingHash();
    }

    public EventInternal getImpl() {
        return this.impl;
    }

    @Override // com.bugsnag.android.MetadataAware
    public Map<String, Object> getMetadata(String str) {
        if (str != null) {
            return this.impl.getMetadata(str);
        }
        logNull("getMetadata");
        return null;
    }

    public Throwable getOriginalError() {
        return this.impl.getOriginalError();
    }

    public Session getSession() {
        return this.impl.session;
    }

    public Severity getSeverity() {
        return this.impl.getSeverity();
    }

    public List<Thread> getThreads() {
        return this.impl.getThreads();
    }

    @Override // com.bugsnag.android.UserAware
    public User getUser() {
        return this.impl.getUser();
    }

    public boolean isUnhandled() {
        return this.impl.getUnhandled();
    }

    public void setApiKey(String str) {
        if (str != null) {
            this.impl.setApiKey(str);
        } else {
            logNull("apiKey");
        }
    }

    public void setApp(AppWithState appWithState) {
        this.impl.setApp(appWithState);
    }

    public void setBreadcrumbs(List<Breadcrumb> list) {
        this.impl.setBreadcrumbs(list);
    }

    public void setContext(String str) {
        this.impl.setContext(str);
    }

    public void setDevice(DeviceWithState deviceWithState) {
        this.impl.setDevice(deviceWithState);
    }

    public void setGroupingHash(String str) {
        this.impl.setGroupingHash(str);
    }

    public void setInternalMetrics(InternalMetrics internalMetrics) {
        this.impl.setInternalMetrics(internalMetrics);
    }

    public void setRedactedKeys(Collection<String> collection) {
        this.impl.setRedactedKeys(collection);
    }

    public void setSession(Session session) {
        this.impl.session = session;
    }

    public void setSeverity(Severity severity) {
        if (severity != null) {
            this.impl.setSeverity(severity);
        } else {
            logNull("severity");
        }
    }

    public void setUnhandled(boolean z10) {
        this.impl.setUnhandled(z10);
    }

    @Override // com.bugsnag.android.UserAware
    public void setUser(String str, String str2, String str3) {
        this.impl.setUser(str, str2, str3);
    }

    public boolean shouldDiscardClass() {
        return this.impl.shouldDiscardClass();
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream jsonStream) {
        this.impl.toStream(jsonStream);
    }

    public void updateSeverityInternal(Severity severity) {
        this.impl.updateSeverityInternal(severity);
    }

    public void updateSeverityReason(String str) {
        this.impl.updateSeverityReason(str);
    }

    public Event(Throwable th2, ImmutableConfig immutableConfig, SeverityReason severityReason, Metadata metadata, FeatureFlags featureFlags, Logger logger) {
        this(new EventInternal(th2, immutableConfig, severityReason, metadata, featureFlags), logger);
    }

    public Event(EventInternal eventInternal, Logger logger) {
        this.impl = eventInternal;
        this.logger = logger;
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
