package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.InternalMetrics;
import com.bugsnag.android.internal.InternalMetricsNoop;
import com.bugsnag.android.internal.JsonHelper;
import com.bugsnag.android.internal.TrimMetrics;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.k;
import is.h0;
import is.q;
import is.u;
import is.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: EventInternal.kt */
@kotlin.Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B>\b\u0011\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010©\u0001\u001a\u00030¨\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\t\b\u0002\u0010ª\u0001\u001a\u00020N\u0012\b\b\u0002\u0010<\u001a\u00020R¢\u0006\u0006\b«\u0001\u0010¬\u0001B·\u0001\b\u0010\u0012\u0006\u0010e\u001a\u00020 \u0012\u0006\u0010J\u001a\u00020I\u0012\u000e\b\u0002\u0010{\u001a\b\u0012\u0004\u0012\u00020z0y\u0012\u000e\b\u0002\u0010V\u001a\b\u0012\u0004\u0012\u00020 0\u0010\u0012\u0010\b\u0002\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010y\u0012\b\b\u0002\u0010O\u001a\u00020N\u0012\b\b\u0002\u0010<\u001a\u00020R\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\u000e\b\u0002\u0010Y\u001a\b\u0012\u0004\u0012\u00020 0X\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0010\b\u0002\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010y\u0012\t\b\u0002\u0010\u00ad\u0001\u001a\u00020.\u0012\u0011\b\u0002\u0010®\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0010¢\u0006\u0006\b«\u0001\u0010¯\u0001J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0004J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0004J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0004J\u0006\u0010#\u001a\u00020 J\u000e\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$J\u000e\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020$J&\u0010-\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010 2\b\u0010+\u001a\u0004\u0018\u00010 2\b\u0010,\u001a\u0004\u0018\u00010 H\u0016J\b\u0010/\u001a\u00020.H\u0016J&\u00104\u001a\u00020\u000e2\u0006\u00100\u001a\u00020 2\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010201H\u0016J\"\u00104\u001a\u00020\u000e2\u0006\u00100\u001a\u00020 2\u0006\u00105\u001a\u00020 2\b\u00103\u001a\u0004\u0018\u000102H\u0016J\u0010\u00106\u001a\u00020\u000e2\u0006\u00100\u001a\u00020 H\u0016J\u0018\u00106\u001a\u00020\u000e2\u0006\u00100\u001a\u00020 2\u0006\u00105\u001a\u00020 H\u0016J\u001e\u00107\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000202\u0018\u0001012\u0006\u00100\u001a\u00020 H\u0016J\u001a\u00107\u001a\u0004\u0018\u0001022\u0006\u00100\u001a\u00020 2\u0006\u00105\u001a\u00020 H\u0016J\u0010\u00108\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020 H\u0016J\u001a\u00108\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020 2\b\u00109\u001a\u0004\u0018\u00010 H\u0016J\u0016\u0010=\u001a\u00020\u000e2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0016J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020 H\u0016J\b\u0010?\u001a\u00020\u000eH\u0016R\u0019\u0010A\u001a\u0004\u0018\u00010@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\u001bR\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b7\u0010QR\u0017\u0010<\u001a\u00020R8\u0006¢\u0006\f\n\u0004\b<\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020 0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR(\u0010Y\u001a\b\u0012\u0004\u0012\u00020 0X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010e\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010s\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR)\u0010{\u001a\b\u0012\u0004\u0012\u00020z0y8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R.\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010|\u001a\u0005\b\u0083\u0001\u0010~\"\u0006\b\u0084\u0001\u0010\u0080\u0001R.\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0086\u0001\u0010|\u001a\u0005\b\u0087\u0001\u0010~\"\u0006\b\u0088\u0001\u0010\u0080\u0001R(\u0010\u0089\u0001\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010f\u001a\u0005\b\u008a\u0001\u0010h\"\u0005\b\u008b\u0001\u0010jR(\u0010\u008c\u0001\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010f\u001a\u0005\b\u008d\u0001\u0010h\"\u0005\b\u008e\u0001\u0010jR*\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u0010\u0096\u0001\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010\u001e\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R)\u0010¤\u0001\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R3\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020 0X2\f\u00103\u001a\b\u0012\u0004\u0012\u00020 0X8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¥\u0001\u0010\\\"\u0005\b¦\u0001\u0010^¨\u0006°\u0001"}, d2 = {"Lcom/bugsnag/android/EventInternal;", "Lcom/bugsnag/android/FeatureFlagAware;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/MetadataAware;", "Lcom/bugsnag/android/UserAware;", "", "getUnhandledOverridden", "getOriginalUnhandled", "shouldDiscardClass", "Lcom/bugsnag/android/Event;", "event", "isAnr", "Lcom/bugsnag/android/JsonStream;", "parentWriter", "Lhs/k;", "toStream", "", "Lcom/bugsnag/android/ErrorType;", "getErrorTypesFromStackframes$bugsnag_android_core_release", "()Ljava/util/Set;", "getErrorTypesFromStackframes", "normalizeStackframeErrorTypes$bugsnag_android_core_release", "()V", "normalizeStackframeErrorTypes", "Lcom/bugsnag/android/SeverityReason;", "severityReason", "updateSeverityReasonInternal$bugsnag_android_core_release", "(Lcom/bugsnag/android/SeverityReason;)V", "updateSeverityReasonInternal", "Lcom/bugsnag/android/Severity;", "severity", "updateSeverityInternal", "", "reason", "updateSeverityReason", "getSeverityReasonType", "", "maxLength", "Lcom/bugsnag/android/internal/TrimMetrics;", "trimMetadataStringsTo", "byteCount", "trimBreadcrumbsBy", "id", SessionManager.KEY_EMAIL, SessionManager.KEY_NAME, "setUser", "Lcom/bugsnag/android/User;", "getUser", "section", "", "", "value", "addMetadata", "key", "clearMetadata", "getMetadata", "addFeatureFlag", "variant", "", "Lcom/bugsnag/android/FeatureFlag;", "featureFlags", "addFeatureFlags", "clearFeatureFlag", "clearFeatureFlags", "", "originalError", "Ljava/lang/Throwable;", "getOriginalError", "()Ljava/lang/Throwable;", "Lcom/bugsnag/android/SeverityReason;", "getSeverityReason$bugsnag_android_core_release", "()Lcom/bugsnag/android/SeverityReason;", "setSeverityReason$bugsnag_android_core_release", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "getLogger", "()Lcom/bugsnag/android/Logger;", "Lcom/bugsnag/android/Metadata;", "metadata", "Lcom/bugsnag/android/Metadata;", "()Lcom/bugsnag/android/Metadata;", "Lcom/bugsnag/android/FeatureFlags;", "Lcom/bugsnag/android/FeatureFlags;", "getFeatureFlags", "()Lcom/bugsnag/android/FeatureFlags;", "discardClasses", "Ljava/util/Set;", "", "projectPackages", "Ljava/util/Collection;", "getProjectPackages$bugsnag_android_core_release", "()Ljava/util/Collection;", "setProjectPackages$bugsnag_android_core_release", "(Ljava/util/Collection;)V", "Lcom/bugsnag/android/ObjectJsonStreamer;", "jsonStreamer", "Lcom/bugsnag/android/ObjectJsonStreamer;", "Lcom/bugsnag/android/Session;", "session", "Lcom/bugsnag/android/Session;", "apiKey", "Ljava/lang/String;", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "Lcom/bugsnag/android/AppWithState;", "app", "Lcom/bugsnag/android/AppWithState;", "getApp", "()Lcom/bugsnag/android/AppWithState;", "setApp", "(Lcom/bugsnag/android/AppWithState;)V", "Lcom/bugsnag/android/DeviceWithState;", "device", "Lcom/bugsnag/android/DeviceWithState;", "getDevice", "()Lcom/bugsnag/android/DeviceWithState;", "setDevice", "(Lcom/bugsnag/android/DeviceWithState;)V", "", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumbs", "Ljava/util/List;", "getBreadcrumbs", "()Ljava/util/List;", "setBreadcrumbs", "(Ljava/util/List;)V", "Lcom/bugsnag/android/Error;", "errors", "getErrors", "setErrors", "Lcom/bugsnag/android/Thread;", "threads", "getThreads", "setThreads", "groupingHash", "getGroupingHash", "setGroupingHash", "context", "getContext", "setContext", "Lcom/bugsnag/android/internal/InternalMetrics;", "internalMetrics", "Lcom/bugsnag/android/internal/InternalMetrics;", "getInternalMetrics", "()Lcom/bugsnag/android/internal/InternalMetrics;", "setInternalMetrics", "(Lcom/bugsnag/android/internal/InternalMetrics;)V", "userImpl", "Lcom/bugsnag/android/User;", "getUserImpl$bugsnag_android_core_release", "()Lcom/bugsnag/android/User;", "setUserImpl$bugsnag_android_core_release", "(Lcom/bugsnag/android/User;)V", "getSeverity", "()Lcom/bugsnag/android/Severity;", "setSeverity", "(Lcom/bugsnag/android/Severity;)V", "getUnhandled", "()Z", "setUnhandled", "(Z)V", "unhandled", "getRedactedKeys", "setRedactedKeys", "redactedKeys", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "data", "<init>", "(Ljava/lang/Throwable;Lcom/bugsnag/android/internal/ImmutableConfig;Lcom/bugsnag/android/SeverityReason;Lcom/bugsnag/android/Metadata;Lcom/bugsnag/android/FeatureFlags;)V", "user", "redactionKeys", "(Ljava/lang/String;Lcom/bugsnag/android/Logger;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Lcom/bugsnag/android/Metadata;Lcom/bugsnag/android/FeatureFlags;Ljava/lang/Throwable;Ljava/util/Collection;Lcom/bugsnag/android/SeverityReason;Ljava/util/List;Lcom/bugsnag/android/User;Ljava/util/Set;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EventInternal implements FeatureFlagAware, JsonStream.Streamable, MetadataAware, UserAware {
    private String apiKey;
    public AppWithState app;
    private List<Breadcrumb> breadcrumbs;
    private String context;
    public DeviceWithState device;
    private final Set<String> discardClasses;
    private List<Error> errors;
    private final FeatureFlags featureFlags;
    private String groupingHash;
    private InternalMetrics internalMetrics;
    private final ObjectJsonStreamer jsonStreamer;
    private final Logger logger;
    private final Metadata metadata;
    private final Throwable originalError;
    private Collection<String> projectPackages;
    public Session session;
    private SeverityReason severityReason;
    private List<Thread> threads;
    private User userImpl;

    public EventInternal(ImmutableConfig immutableConfig, SeverityReason severityReason) {
        this(null, immutableConfig, severityReason, null, null, 25, null);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String name) {
        i.h(name, "name");
        this.featureFlags.addFeatureFlag(name);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlags(Iterable<FeatureFlag> featureFlags) {
        i.h(featureFlags, "featureFlags");
        this.featureFlags.addFeatureFlags(featureFlags);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, Map<String, ? extends Object> value) {
        i.h(section, "section");
        i.h(value, "value");
        this.metadata.addMetadata(section, value);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlag(String name) {
        i.h(name, "name");
        this.featureFlags.clearFeatureFlag(name);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlags() {
        this.featureFlags.clearFeatureFlags();
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section) {
        i.h(section, "section");
        this.metadata.clearMetadata(section);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final AppWithState getApp() {
        AppWithState appWithState = this.app;
        if (appWithState != null) {
            return appWithState;
        }
        i.q("app");
        throw null;
    }

    public final List<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public final String getContext() {
        return this.context;
    }

    public final DeviceWithState getDevice() {
        DeviceWithState deviceWithState = this.device;
        if (deviceWithState != null) {
            return deviceWithState;
        }
        i.q("device");
        throw null;
    }

    public final Set<ErrorType> getErrorTypesFromStackframes$bugsnag_android_core_release() {
        List<Error> list = this.errors;
        ArrayList arrayList = new ArrayList();
        for (Error error : list) {
            ErrorType type = error.getType();
            if (type != null) {
                arrayList.add(type);
            }
        }
        Set M2 = u.M2(arrayList);
        List<Error> list2 = this.errors;
        ArrayList arrayList2 = new ArrayList(is.i.H1(list2, 10));
        for (Error error2 : list2) {
            arrayList2.add(error2.getStacktrace());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            List<Stackframe> it2 = (List) it.next();
            i.c(it2, "it");
            ArrayList arrayList4 = new ArrayList();
            for (Stackframe stackframe : it2) {
                ErrorType type2 = stackframe.getType();
                if (type2 != null) {
                    arrayList4.add(type2);
                }
            }
            q.R1(arrayList4, arrayList3);
        }
        return h0.I1(M2, arrayList3);
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    public final String getGroupingHash() {
        return this.groupingHash;
    }

    public final InternalMetrics getInternalMetrics() {
        return this.internalMetrics;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final Throwable getOriginalError() {
        return this.originalError;
    }

    public final boolean getOriginalUnhandled() {
        return this.severityReason.originalUnhandled;
    }

    public final Collection<String> getProjectPackages$bugsnag_android_core_release() {
        return this.projectPackages;
    }

    public final Collection<String> getRedactedKeys() {
        return this.jsonStreamer.getRedactedKeys();
    }

    public final Severity getSeverity() {
        Severity currentSeverity = this.severityReason.getCurrentSeverity();
        i.c(currentSeverity, "severityReason.currentSeverity");
        return currentSeverity;
    }

    public final SeverityReason getSeverityReason$bugsnag_android_core_release() {
        return this.severityReason;
    }

    public final String getSeverityReasonType() {
        String severityReasonType = this.severityReason.getSeverityReasonType();
        i.c(severityReasonType, "severityReason.severityReasonType");
        return severityReasonType;
    }

    public final List<Thread> getThreads() {
        return this.threads;
    }

    public final boolean getUnhandled() {
        return this.severityReason.getUnhandled();
    }

    public final boolean getUnhandledOverridden() {
        return this.severityReason.getUnhandledOverridden();
    }

    @Override // com.bugsnag.android.UserAware
    public User getUser() {
        return this.userImpl;
    }

    public final User getUserImpl$bugsnag_android_core_release() {
        return this.userImpl;
    }

    public final boolean isAnr(Event event) {
        String str;
        i.h(event, "event");
        List<Error> errors = event.getErrors();
        i.c(errors, "event.errors");
        if (!errors.isEmpty()) {
            Error error = errors.get(0);
            i.c(error, "error");
            str = error.getErrorClass();
        } else {
            str = null;
        }
        return i.b("ANR", str);
    }

    public final void normalizeStackframeErrorTypes$bugsnag_android_core_release() {
        if (getErrorTypesFromStackframes$bugsnag_android_core_release().size() == 1) {
            List<Error> list = this.errors;
            ArrayList arrayList = new ArrayList();
            for (Error error : list) {
                List<Stackframe> stacktrace = error.getStacktrace();
                i.c(stacktrace, "it.stacktrace");
                q.R1(stacktrace, arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Stackframe) it.next()).setType(null);
            }
        }
    }

    public final void setApiKey(String str) {
        i.h(str, "<set-?>");
        this.apiKey = str;
    }

    public final void setApp(AppWithState appWithState) {
        i.h(appWithState, "<set-?>");
        this.app = appWithState;
    }

    public final void setBreadcrumbs(List<Breadcrumb> list) {
        i.h(list, "<set-?>");
        this.breadcrumbs = list;
    }

    public final void setContext(String str) {
        this.context = str;
    }

    public final void setDevice(DeviceWithState deviceWithState) {
        i.h(deviceWithState, "<set-?>");
        this.device = deviceWithState;
    }

    public final void setErrors(List<Error> list) {
        i.h(list, "<set-?>");
        this.errors = list;
    }

    public final void setGroupingHash(String str) {
        this.groupingHash = str;
    }

    public final void setInternalMetrics(InternalMetrics internalMetrics) {
        i.h(internalMetrics, "<set-?>");
        this.internalMetrics = internalMetrics;
    }

    public final void setProjectPackages$bugsnag_android_core_release(Collection<String> collection) {
        i.h(collection, "<set-?>");
        this.projectPackages = collection;
    }

    public final void setRedactedKeys(Collection<String> value) {
        i.h(value, "value");
        this.jsonStreamer.setRedactedKeys(u.M2(value));
        this.metadata.setRedactedKeys(u.M2(value));
    }

    public final void setSeverity(Severity value) {
        i.h(value, "value");
        this.severityReason.setCurrentSeverity(value);
    }

    public final void setSeverityReason$bugsnag_android_core_release(SeverityReason severityReason) {
        i.h(severityReason, "<set-?>");
        this.severityReason = severityReason;
    }

    public final void setThreads(List<Thread> list) {
        i.h(list, "<set-?>");
        this.threads = list;
    }

    public final void setUnhandled(boolean z10) {
        this.severityReason.setUnhandled(z10);
    }

    @Override // com.bugsnag.android.UserAware
    public void setUser(String str, String str2, String str3) {
        this.userImpl = new User(str, str2, str3);
    }

    public final void setUserImpl$bugsnag_android_core_release(User user) {
        i.h(user, "<set-?>");
        this.userImpl = user;
    }

    public final boolean shouldDiscardClass() {
        if (this.errors.isEmpty()) {
            return true;
        }
        List<Error> list = this.errors;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Error error : list) {
                if (this.discardClasses.contains(error.getErrorClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream parentWriter) {
        i.h(parentWriter, "parentWriter");
        JsonStream jsonStream = new JsonStream(parentWriter, this.jsonStreamer);
        jsonStream.beginObject();
        jsonStream.name("context").value(this.context);
        jsonStream.name("metaData").value(this.metadata);
        jsonStream.name("severity").value(getSeverity());
        jsonStream.name("severityReason").value(this.severityReason);
        jsonStream.name("unhandled").value(this.severityReason.getUnhandled());
        jsonStream.name("exceptions");
        jsonStream.beginArray();
        for (Error error : this.errors) {
            jsonStream.value(error);
        }
        jsonStream.endArray();
        jsonStream.name("projectPackages");
        jsonStream.beginArray();
        for (String str : this.projectPackages) {
            jsonStream.value(str);
        }
        jsonStream.endArray();
        jsonStream.name("user").value(this.userImpl);
        JsonStream name = jsonStream.name("app");
        AppWithState appWithState = this.app;
        if (appWithState != null) {
            name.value(appWithState);
            JsonStream name2 = jsonStream.name("device");
            DeviceWithState deviceWithState = this.device;
            if (deviceWithState != null) {
                name2.value(deviceWithState);
                jsonStream.name("breadcrumbs").value(this.breadcrumbs);
                jsonStream.name("groupingHash").value(this.groupingHash);
                Map<String, Object> jsonableMap = this.internalMetrics.toJsonableMap();
                if (!jsonableMap.isEmpty()) {
                    jsonStream.name("usage");
                    jsonStream.beginObject();
                    for (Map.Entry<String, Object> entry : jsonableMap.entrySet()) {
                        jsonStream.name(entry.getKey()).value(entry.getValue());
                    }
                    jsonStream.endObject();
                }
                jsonStream.name("threads");
                jsonStream.beginArray();
                for (Thread thread : this.threads) {
                    jsonStream.value(thread);
                }
                jsonStream.endArray();
                jsonStream.name("featureFlags").value(this.featureFlags);
                Session session = this.session;
                if (session != null) {
                    Session copy = Session.copySession(session);
                    jsonStream.name("session").beginObject();
                    JsonStream name3 = jsonStream.name("id");
                    i.c(copy, "copy");
                    name3.value(copy.getId());
                    jsonStream.name("startedAt").value(copy.getStartedAt());
                    jsonStream.name("events").beginObject();
                    jsonStream.name("handled").value(copy.getHandledCount());
                    jsonStream.name("unhandled").value(copy.getUnhandledCount());
                    jsonStream.endObject();
                    jsonStream.endObject();
                }
                jsonStream.endObject();
                return;
            }
            i.q("device");
            throw null;
        }
        i.q("app");
        throw null;
    }

    public final TrimMetrics trimBreadcrumbsBy(int i6) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i6 && (!this.breadcrumbs.isEmpty())) {
            i10 += JsonHelper.INSTANCE.serialize((JsonStream.Streamable) this.breadcrumbs.remove(0)).length;
            i11++;
        }
        if (i11 != 1) {
            List<Breadcrumb> list = this.breadcrumbs;
            StringBuilder sb2 = new StringBuilder("Removed, along with ");
            sb2.append(i11 - 1);
            sb2.append(" older breadcrumbs, to reduce payload size");
            list.add(new Breadcrumb(sb2.toString(), this.logger));
        } else {
            this.breadcrumbs.add(new Breadcrumb("Removed to reduce payload size", this.logger));
        }
        return new TrimMetrics(i11, i10);
    }

    public final TrimMetrics trimMetadataStringsTo(int i6) {
        TrimMetrics trimMetadataStringsTo = this.metadata.trimMetadataStringsTo(i6);
        int itemsTrimmed = trimMetadataStringsTo.getItemsTrimmed() + 0;
        int dataTrimmed = trimMetadataStringsTo.getDataTrimmed() + 0;
        for (Breadcrumb breadcrumb : this.breadcrumbs) {
            TrimMetrics trimMetadataStringsTo$bugsnag_android_core_release = breadcrumb.impl.trimMetadataStringsTo$bugsnag_android_core_release(i6);
            itemsTrimmed += trimMetadataStringsTo$bugsnag_android_core_release.getItemsTrimmed();
            dataTrimmed += trimMetadataStringsTo$bugsnag_android_core_release.getDataTrimmed();
        }
        return new TrimMetrics(itemsTrimmed, dataTrimmed);
    }

    public final void updateSeverityInternal(Severity severity) {
        i.h(severity, "severity");
        this.severityReason = new SeverityReason(this.severityReason.getSeverityReasonType(), severity, this.severityReason.getUnhandled(), this.severityReason.getUnhandledOverridden(), this.severityReason.getAttributeValue(), this.severityReason.getAttributeKey());
    }

    public final void updateSeverityReason(String reason) {
        i.h(reason, "reason");
        this.severityReason = new SeverityReason(reason, this.severityReason.getCurrentSeverity(), this.severityReason.getUnhandled(), this.severityReason.getUnhandledOverridden(), this.severityReason.getAttributeValue(), this.severityReason.getAttributeKey());
    }

    public final void updateSeverityReasonInternal$bugsnag_android_core_release(SeverityReason severityReason) {
        i.h(severityReason, "severityReason");
        this.severityReason = severityReason;
    }

    public EventInternal(Throwable th2, ImmutableConfig immutableConfig, SeverityReason severityReason) {
        this(th2, immutableConfig, severityReason, null, null, 24, null);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String name, String str) {
        i.h(name, "name");
        this.featureFlags.addFeatureFlag(name, str);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, String key, Object obj) {
        i.h(section, "section");
        i.h(key, "key");
        this.metadata.addMetadata(section, key, obj);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        this.metadata.clearMetadata(section, key);
    }

    @Override // com.bugsnag.android.MetadataAware
    public Map<String, Object> getMetadata(String section) {
        i.h(section, "section");
        return this.metadata.getMetadata(section);
    }

    public EventInternal(Throwable th2, ImmutableConfig immutableConfig, SeverityReason severityReason, Metadata metadata) {
        this(th2, immutableConfig, severityReason, metadata, null, 16, null);
    }

    @Override // com.bugsnag.android.MetadataAware
    public Object getMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        return this.metadata.getMetadata(section, key);
    }

    public /* synthetic */ EventInternal(Throwable th2, ImmutableConfig immutableConfig, SeverityReason severityReason, Metadata metadata, FeatureFlags featureFlags, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : th2, immutableConfig, severityReason, (i6 & 8) != 0 ? new Metadata(null, 1, null) : metadata, (i6 & 16) != 0 ? new FeatureFlags(null, 1, null) : featureFlags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EventInternal(Throwable th2, ImmutableConfig config, SeverityReason severityReason, Metadata data, FeatureFlags featureFlags) {
        this(r1, r4, r5, r6, r7, data.copy(), featureFlags.copy(), th2, config.getProjectPackages(), severityReason, new ThreadState(th2, severityReason.getUnhandled(), config).getThreads(), new User(null, null, null, 7, null), u.M2(config.getRedactedKeys()));
        List createError;
        i.h(config, "config");
        i.h(severityReason, "severityReason");
        i.h(data, "data");
        i.h(featureFlags, "featureFlags");
        String apiKey = config.getApiKey();
        Logger logger = config.getLogger();
        ArrayList arrayList = new ArrayList();
        Set M2 = u.M2(config.getDiscardClasses());
        if (th2 == null) {
            createError = new ArrayList();
        } else {
            createError = Error.createError(th2, config.getProjectPackages(), config.getLogger());
            i.c(createError, "Error.createError(origin…tPackages, config.logger)");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EventInternal(String str, Logger logger, List list, Set set, List list2, Metadata metadata, FeatureFlags featureFlags, Throwable th2, Collection collection, SeverityReason severityReason, List list3, User user, Set set2, int i6, d dVar) {
        this(str, logger, r5, r6, r7, r8, r9, r10, r11, r12, (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? new ArrayList() : list3, (i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? new User(null, null, null, 7, null) : user, (i6 & 4096) != 0 ? null : set2);
        SeverityReason severityReason2;
        ArrayList arrayList = (i6 & 4) != 0 ? new ArrayList() : list;
        int i10 = i6 & 8;
        y yVar = y.f20678u;
        y yVar2 = i10 != 0 ? yVar : set;
        ArrayList arrayList2 = (i6 & 16) != 0 ? new ArrayList() : list2;
        Metadata metadata2 = (i6 & 32) != 0 ? new Metadata(null, 1, null) : metadata;
        FeatureFlags featureFlags2 = (i6 & 64) != 0 ? new FeatureFlags(null, 1, null) : featureFlags;
        Throwable th3 = (i6 & 128) != 0 ? null : th2;
        y yVar3 = (i6 & 256) != 0 ? yVar : collection;
        if ((i6 & 512) != 0) {
            SeverityReason newInstance = SeverityReason.newInstance("handledException");
            i.c(newInstance, "SeverityReason.newInstan…REASON_HANDLED_EXCEPTION)");
            severityReason2 = newInstance;
        } else {
            severityReason2 = severityReason;
        }
    }

    public EventInternal(String apiKey, Logger logger, List<Breadcrumb> breadcrumbs, Set<String> discardClasses, List<Error> errors, Metadata metadata, FeatureFlags featureFlags, Throwable th2, Collection<String> projectPackages, SeverityReason severityReason, List<Thread> threads, User user, Set<String> set) {
        i.h(apiKey, "apiKey");
        i.h(logger, "logger");
        i.h(breadcrumbs, "breadcrumbs");
        i.h(discardClasses, "discardClasses");
        i.h(errors, "errors");
        i.h(metadata, "metadata");
        i.h(featureFlags, "featureFlags");
        i.h(projectPackages, "projectPackages");
        i.h(severityReason, "severityReason");
        i.h(threads, "threads");
        i.h(user, "user");
        ObjectJsonStreamer objectJsonStreamer = new ObjectJsonStreamer();
        objectJsonStreamer.setRedactedKeys(u.M2(objectJsonStreamer.getRedactedKeys()));
        k kVar = k.f19476a;
        this.jsonStreamer = objectJsonStreamer;
        this.internalMetrics = new InternalMetricsNoop();
        this.logger = logger;
        this.apiKey = apiKey;
        this.breadcrumbs = breadcrumbs;
        this.discardClasses = discardClasses;
        this.errors = errors;
        this.metadata = metadata;
        this.featureFlags = featureFlags;
        this.originalError = th2;
        this.projectPackages = projectPackages;
        this.severityReason = severityReason;
        this.threads = threads;
        this.userImpl = user;
        if (set != null) {
            setRedactedKeys(set);
        }
    }
}
