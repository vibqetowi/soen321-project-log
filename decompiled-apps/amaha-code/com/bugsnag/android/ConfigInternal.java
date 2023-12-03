package com.bugsnag.android;

import android.content.Context;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.f;
import is.e0;
import is.k;
import is.u;
import is.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ConfigInternal.kt */
@kotlin.Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ò\u0001B\u0011\u0012\u0007\u0010Ë\u0001\u001a\u00020\u0016¢\u0006\u0005\bÑ\u0001\u0010DJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012J&\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016J\"\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u001a\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010%\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020(H\u0016J&\u0010,\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u00162\b\u0010+\u001a\u0004\u0018\u00010\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-J\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0018J\u0018\u00103\u001a\u00020\u00162\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u000101H\u0002R\u0016\u00104\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010L\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010@\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010d\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010X\u001a\u0004\be\u0010Z\"\u0004\bf\u0010\\R\"\u0010g\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010X\u001a\u0004\bh\u0010Z\"\u0004\bi\u0010\\R\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010q\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010X\u001a\u0004\br\u0010Z\"\u0004\bs\u0010\\R$\u0010t\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010@\u001a\u0004\bu\u0010B\"\u0004\bv\u0010DR.\u0010x\u001a\u0004\u0018\u00010w2\b\u0010\u001a\u001a\u0004\u0018\u00010w8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R)\u0010\u008c\u0001\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R)\u0010\u0092\u0001\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u008d\u0001\u001a\u0006\b\u0093\u0001\u0010\u008f\u0001\"\u0006\b\u0094\u0001\u0010\u0091\u0001R)\u0010\u0095\u0001\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u008d\u0001\u001a\u0006\b\u0096\u0001\u0010\u008f\u0001\"\u0006\b\u0097\u0001\u0010\u0091\u0001R)\u0010\u0098\u0001\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u008d\u0001\u001a\u0006\b\u0099\u0001\u0010\u008f\u0001\"\u0006\b\u009a\u0001\u0010\u0091\u0001R)\u0010\u009b\u0001\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u008d\u0001\u001a\u0006\b\u009c\u0001\u0010\u008f\u0001\"\u0006\b\u009d\u0001\u0010\u0091\u0001R(\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010@\u001a\u0005\b\u009f\u0001\u0010B\"\u0005\b \u0001\u0010DR0\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160¡\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R2\u0010¨\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010¡\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010£\u0001\u001a\u0006\b©\u0001\u0010¥\u0001\"\u0006\bª\u0001\u0010§\u0001R3\u0010¬\u0001\u001a\f\u0012\u0005\u0012\u00030«\u0001\u0018\u00010¡\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010£\u0001\u001a\u0006\b\u00ad\u0001\u0010¥\u0001\"\u0006\b®\u0001\u0010§\u0001R1\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010¡\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010£\u0001\u001a\u0006\b±\u0001\u0010¥\u0001\"\u0006\b²\u0001\u0010§\u0001R0\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160¡\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010£\u0001\u001a\u0006\b´\u0001\u0010¥\u0001\"\u0006\bµ\u0001\u0010§\u0001R,\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R&\u0010½\u0001\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010X\u001a\u0005\b¾\u0001\u0010Z\"\u0005\b¿\u0001\u0010\\R\u001d\u0010Á\u0001\u001a\u00030À\u00018\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R1\u0010Ç\u0001\u001a\u0014\u0012\u0004\u0012\u00020-0Å\u0001j\t\u0012\u0004\u0012\u00020-`Æ\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R&\u0010Ë\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bË\u0001\u0010@\u001a\u0005\bÌ\u0001\u0010B\"\u0005\bÍ\u0001\u0010DR7\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160¡\u00012\r\u0010\u001a\u001a\t\u0012\u0004\u0012\u00020\u00160¡\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0001\u0010¥\u0001\"\u0006\bÏ\u0001\u0010§\u0001¨\u0006Ó\u0001"}, d2 = {"Lcom/bugsnag/android/ConfigInternal;", "Lcom/bugsnag/android/CallbackAware;", "Lcom/bugsnag/android/MetadataAware;", "Lcom/bugsnag/android/UserAware;", "Lcom/bugsnag/android/FeatureFlagAware;", "Lcom/bugsnag/android/OnErrorCallback;", "onError", "Lhs/k;", "addOnError", "removeOnError", "Lcom/bugsnag/android/OnBreadcrumbCallback;", "onBreadcrumb", "addOnBreadcrumb", "removeOnBreadcrumb", "Lcom/bugsnag/android/OnSessionCallback;", "onSession", "addOnSession", "removeOnSession", "Lcom/bugsnag/android/OnSendCallback;", "onSend", "addOnSend", "removeOnSend", "", "section", "", "", "value", "addMetadata", "key", "clearMetadata", "getMetadata", SessionManager.KEY_NAME, "addFeatureFlag", "variant", "", "Lcom/bugsnag/android/FeatureFlag;", "featureFlags", "addFeatureFlags", "clearFeatureFlag", "clearFeatureFlags", "Lcom/bugsnag/android/User;", "getUser", "id", SessionManager.KEY_EMAIL, "setUser", "Lcom/bugsnag/android/Plugin;", "plugin", "addPlugin", "getConfigDifferences", "", "coll", "toCommaSeparated", "user", "Lcom/bugsnag/android/User;", "Lcom/bugsnag/android/CallbackState;", "callbackState", "Lcom/bugsnag/android/CallbackState;", "Lcom/bugsnag/android/MetadataState;", "metadataState", "Lcom/bugsnag/android/MetadataState;", "Lcom/bugsnag/android/FeatureFlagState;", "featureFlagState", "Lcom/bugsnag/android/FeatureFlagState;", "appVersion", "Ljava/lang/String;", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "", "versionCode", "Ljava/lang/Integer;", "getVersionCode", "()Ljava/lang/Integer;", "setVersionCode", "(Ljava/lang/Integer;)V", "releaseStage", "getReleaseStage", "setReleaseStage", "Lcom/bugsnag/android/ThreadSendPolicy;", "sendThreads", "Lcom/bugsnag/android/ThreadSendPolicy;", "getSendThreads", "()Lcom/bugsnag/android/ThreadSendPolicy;", "setSendThreads", "(Lcom/bugsnag/android/ThreadSendPolicy;)V", "", "persistUser", "Z", "getPersistUser", "()Z", "setPersistUser", "(Z)V", "", "launchDurationMillis", "J", "getLaunchDurationMillis", "()J", "setLaunchDurationMillis", "(J)V", "autoTrackSessions", "getAutoTrackSessions", "setAutoTrackSessions", "sendLaunchCrashesSynchronously", "getSendLaunchCrashesSynchronously", "setSendLaunchCrashesSynchronously", "Lcom/bugsnag/android/ErrorTypes;", "enabledErrorTypes", "Lcom/bugsnag/android/ErrorTypes;", "getEnabledErrorTypes", "()Lcom/bugsnag/android/ErrorTypes;", "setEnabledErrorTypes", "(Lcom/bugsnag/android/ErrorTypes;)V", "autoDetectErrors", "getAutoDetectErrors", "setAutoDetectErrors", "appType", "getAppType", "setAppType", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "getLogger", "()Lcom/bugsnag/android/Logger;", "setLogger", "(Lcom/bugsnag/android/Logger;)V", "Lcom/bugsnag/android/Delivery;", "delivery", "Lcom/bugsnag/android/Delivery;", "getDelivery", "()Lcom/bugsnag/android/Delivery;", "setDelivery", "(Lcom/bugsnag/android/Delivery;)V", "Lcom/bugsnag/android/EndpointConfiguration;", "endpoints", "Lcom/bugsnag/android/EndpointConfiguration;", "getEndpoints", "()Lcom/bugsnag/android/EndpointConfiguration;", "setEndpoints", "(Lcom/bugsnag/android/EndpointConfiguration;)V", "maxBreadcrumbs", "I", "getMaxBreadcrumbs", "()I", "setMaxBreadcrumbs", "(I)V", "maxPersistedEvents", "getMaxPersistedEvents", "setMaxPersistedEvents", "maxPersistedSessions", "getMaxPersistedSessions", "setMaxPersistedSessions", "maxReportedThreads", "getMaxReportedThreads", "setMaxReportedThreads", "maxStringValueLength", "getMaxStringValueLength", "setMaxStringValueLength", "context", "getContext", "setContext", "", "discardClasses", "Ljava/util/Set;", "getDiscardClasses", "()Ljava/util/Set;", "setDiscardClasses", "(Ljava/util/Set;)V", "enabledReleaseStages", "getEnabledReleaseStages", "setEnabledReleaseStages", "Lcom/bugsnag/android/BreadcrumbType;", "enabledBreadcrumbTypes", "getEnabledBreadcrumbTypes", "setEnabledBreadcrumbTypes", "Lcom/bugsnag/android/Telemetry;", "telemetry", "getTelemetry", "setTelemetry", "projectPackages", "getProjectPackages", "setProjectPackages", "Ljava/io/File;", "persistenceDirectory", "Ljava/io/File;", "getPersistenceDirectory", "()Ljava/io/File;", "setPersistenceDirectory", "(Ljava/io/File;)V", "attemptDeliveryOnCrash", "getAttemptDeliveryOnCrash", "setAttemptDeliveryOnCrash", "Lcom/bugsnag/android/Notifier;", "notifier", "Lcom/bugsnag/android/Notifier;", "getNotifier", "()Lcom/bugsnag/android/Notifier;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "plugins", "Ljava/util/HashSet;", "getPlugins", "()Ljava/util/HashSet;", "apiKey", "getApiKey", "setApiKey", "getRedactedKeys", "setRedactedKeys", "redactedKeys", "<init>", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ConfigInternal implements CallbackAware, MetadataAware, UserAware, FeatureFlagAware {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_LAUNCH_CRASH_THRESHOLD_MS = 5000;
    private static final int DEFAULT_MAX_BREADCRUMBS = 100;
    private static final int DEFAULT_MAX_PERSISTED_EVENTS = 32;
    private static final int DEFAULT_MAX_PERSISTED_SESSIONS = 128;
    private static final int DEFAULT_MAX_REPORTED_THREADS = 200;
    private static final int DEFAULT_MAX_STRING_VALUE_LENGTH = 10000;
    private String apiKey;
    private String appType;
    private String appVersion;
    private boolean attemptDeliveryOnCrash;
    private boolean autoDetectErrors;
    private boolean autoTrackSessions;
    public final CallbackState callbackState;
    private String context;
    private Delivery delivery;
    private Set<String> discardClasses;
    private Set<? extends BreadcrumbType> enabledBreadcrumbTypes;
    private ErrorTypes enabledErrorTypes;
    private Set<String> enabledReleaseStages;
    private EndpointConfiguration endpoints;
    public final FeatureFlagState featureFlagState;
    private long launchDurationMillis;
    private Logger logger;
    private int maxBreadcrumbs;
    private int maxPersistedEvents;
    private int maxPersistedSessions;
    private int maxReportedThreads;
    private int maxStringValueLength;
    public final MetadataState metadataState;
    private final Notifier notifier;
    private boolean persistUser;
    private File persistenceDirectory;
    private final HashSet<Plugin> plugins;
    private Set<String> projectPackages;
    private String releaseStage;
    private boolean sendLaunchCrashesSynchronously;
    private ThreadSendPolicy sendThreads;
    private Set<? extends Telemetry> telemetry;
    private User user;
    private Integer versionCode;

    /* compiled from: ConfigInternal.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/ConfigInternal$Companion;", "", "()V", "DEFAULT_LAUNCH_CRASH_THRESHOLD_MS", "", "DEFAULT_MAX_BREADCRUMBS", "", "DEFAULT_MAX_PERSISTED_EVENTS", "DEFAULT_MAX_PERSISTED_SESSIONS", "DEFAULT_MAX_REPORTED_THREADS", "DEFAULT_MAX_STRING_VALUE_LENGTH", "load", "Lcom/bugsnag/android/Configuration;", "context", "Landroid/content/Context;", "apiKey", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final Configuration load(Context context) {
            i.h(context, "context");
            return load(context, null);
        }

        public final Configuration load(Context context, String str) {
            i.h(context, "context");
            return new ManifestConfigLoader().load(context, str);
        }
    }

    public ConfigInternal(String apiKey) {
        i.h(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.user = new User(null, null, null, 7, null);
        this.callbackState = new CallbackState(null, null, null, null, 15, null);
        this.metadataState = new MetadataState(null, 1, null);
        this.featureFlagState = new FeatureFlagState(null, 1, null);
        this.versionCode = 0;
        this.sendThreads = ThreadSendPolicy.ALWAYS;
        this.launchDurationMillis = DEFAULT_LAUNCH_CRASH_THRESHOLD_MS;
        this.autoTrackSessions = true;
        this.sendLaunchCrashesSynchronously = true;
        this.enabledErrorTypes = new ErrorTypes(false, false, false, false, 15, null);
        this.autoDetectErrors = true;
        this.appType = "android";
        this.logger = DebugLogger.INSTANCE;
        this.endpoints = new EndpointConfiguration(null, null, 3, null);
        this.maxBreadcrumbs = 100;
        this.maxPersistedEvents = 32;
        this.maxPersistedSessions = DEFAULT_MAX_PERSISTED_SESSIONS;
        this.maxReportedThreads = 200;
        this.maxStringValueLength = 10000;
        y yVar = y.f20678u;
        this.discardClasses = yVar;
        EnumSet of2 = EnumSet.of(Telemetry.INTERNAL_ERRORS, Telemetry.USAGE);
        i.c(of2, "EnumSet.of(Telemetry.INT…_ERRORS, Telemetry.USAGE)");
        this.telemetry = of2;
        this.projectPackages = yVar;
        this.notifier = new Notifier(null, null, null, 7, null);
        this.plugins = new HashSet<>();
    }

    public static final Configuration load(Context context) {
        return Companion.load(context);
    }

    private final String toCommaSeparated(Collection<? extends Object> collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(is.i.H1(collection, 10));
            for (Object obj : collection) {
                arrayList.add(obj.toString());
            }
            return u.m2(u.C2(arrayList), ",", null, null, null, 62);
        }
        return "";
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String name) {
        i.h(name, "name");
        this.featureFlagState.addFeatureFlag(name);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlags(Iterable<FeatureFlag> featureFlags) {
        i.h(featureFlags, "featureFlags");
        this.featureFlagState.addFeatureFlags(featureFlags);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, Map<String, ? extends Object> value) {
        i.h(section, "section");
        i.h(value, "value");
        this.metadataState.addMetadata(section, value);
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnBreadcrumb(OnBreadcrumbCallback onBreadcrumb) {
        i.h(onBreadcrumb, "onBreadcrumb");
        this.callbackState.addOnBreadcrumb(onBreadcrumb);
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnError(OnErrorCallback onError) {
        i.h(onError, "onError");
        this.callbackState.addOnError(onError);
    }

    public final void addOnSend(OnSendCallback onSend) {
        i.h(onSend, "onSend");
        this.callbackState.addOnSend(onSend);
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnSession(OnSessionCallback onSession) {
        i.h(onSession, "onSession");
        this.callbackState.addOnSession(onSession);
    }

    public final void addPlugin(Plugin plugin) {
        i.h(plugin, "plugin");
        this.plugins.add(plugin);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlag(String name) {
        i.h(name, "name");
        this.featureFlagState.clearFeatureFlag(name);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlags() {
        this.featureFlagState.clearFeatureFlags();
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section) {
        i.h(section, "section");
        this.metadataState.clearMetadata(section);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final boolean getAttemptDeliveryOnCrash() {
        return this.attemptDeliveryOnCrash;
    }

    public final boolean getAutoDetectErrors() {
        return this.autoDetectErrors;
    }

    public final boolean getAutoTrackSessions() {
        return this.autoTrackSessions;
    }

    public final Map<String, Object> getConfigDifferences() {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        f fVar5;
        f fVar6;
        f fVar7;
        f fVar8;
        f fVar9;
        f fVar10;
        f fVar11;
        f fVar12;
        f fVar13;
        f fVar14;
        String str;
        String str2;
        String str3;
        String str4;
        ConfigInternal configInternal = new ConfigInternal("");
        f[] fVarArr = new f[15];
        f fVar15 = null;
        if (this.plugins.size() > 0) {
            fVar = new f("pluginCount", Integer.valueOf(this.plugins.size()));
        } else {
            fVar = null;
        }
        fVarArr[0] = fVar;
        boolean z10 = this.autoDetectErrors;
        if (z10 != configInternal.autoDetectErrors) {
            fVar2 = new f("autoDetectErrors", Boolean.valueOf(z10));
        } else {
            fVar2 = null;
        }
        fVarArr[1] = fVar2;
        boolean z11 = this.autoTrackSessions;
        if (z11 != configInternal.autoTrackSessions) {
            fVar3 = new f("autoTrackSessions", Boolean.valueOf(z11));
        } else {
            fVar3 = null;
        }
        fVarArr[2] = fVar3;
        if (this.discardClasses.size() > 0) {
            fVar4 = new f("discardClassesCount", Integer.valueOf(this.discardClasses.size()));
        } else {
            fVar4 = null;
        }
        fVarArr[3] = fVar4;
        if (!i.b(this.enabledBreadcrumbTypes, configInternal.enabledBreadcrumbTypes)) {
            fVar5 = new f("enabledBreadcrumbTypes", toCommaSeparated(this.enabledBreadcrumbTypes));
        } else {
            fVar5 = null;
        }
        fVarArr[4] = fVar5;
        if (!i.b(this.enabledErrorTypes, configInternal.enabledErrorTypes)) {
            String[] strArr = new String[4];
            if (this.enabledErrorTypes.getAnrs()) {
                str = "anrs";
            } else {
                str = null;
            }
            strArr[0] = str;
            if (this.enabledErrorTypes.getNdkCrashes()) {
                str2 = "ndkCrashes";
            } else {
                str2 = null;
            }
            strArr[1] = str2;
            if (this.enabledErrorTypes.getUnhandledExceptions()) {
                str3 = "unhandledExceptions";
            } else {
                str3 = null;
            }
            strArr[2] = str3;
            if (this.enabledErrorTypes.getUnhandledRejections()) {
                str4 = "unhandledRejections";
            } else {
                str4 = null;
            }
            strArr[3] = str4;
            fVar6 = new f("enabledErrorTypes", toCommaSeparated(k.R1(strArr)));
        } else {
            fVar6 = null;
        }
        fVarArr[5] = fVar6;
        long j10 = this.launchDurationMillis;
        if (j10 != 0) {
            fVar7 = new f("launchDurationMillis", Long.valueOf(j10));
        } else {
            fVar7 = null;
        }
        fVarArr[6] = fVar7;
        if (!i.b(this.logger, NoopLogger.INSTANCE)) {
            fVar8 = new f("logger", Boolean.TRUE);
        } else {
            fVar8 = null;
        }
        fVarArr[7] = fVar8;
        int i6 = this.maxBreadcrumbs;
        if (i6 != configInternal.maxBreadcrumbs) {
            fVar9 = new f("maxBreadcrumbs", Integer.valueOf(i6));
        } else {
            fVar9 = null;
        }
        fVarArr[8] = fVar9;
        int i10 = this.maxPersistedEvents;
        if (i10 != configInternal.maxPersistedEvents) {
            fVar10 = new f("maxPersistedEvents", Integer.valueOf(i10));
        } else {
            fVar10 = null;
        }
        fVarArr[9] = fVar10;
        int i11 = this.maxPersistedSessions;
        if (i11 != configInternal.maxPersistedSessions) {
            fVar11 = new f("maxPersistedSessions", Integer.valueOf(i11));
        } else {
            fVar11 = null;
        }
        fVarArr[10] = fVar11;
        int i12 = this.maxReportedThreads;
        if (i12 != configInternal.maxReportedThreads) {
            fVar12 = new f("maxReportedThreads", Integer.valueOf(i12));
        } else {
            fVar12 = null;
        }
        fVarArr[11] = fVar12;
        if (this.persistenceDirectory != null) {
            fVar13 = new f("persistenceDirectorySet", Boolean.TRUE);
        } else {
            fVar13 = null;
        }
        fVarArr[12] = fVar13;
        ThreadSendPolicy threadSendPolicy = this.sendThreads;
        if (threadSendPolicy != configInternal.sendThreads) {
            fVar14 = new f("sendThreads", threadSendPolicy);
        } else {
            fVar14 = null;
        }
        fVarArr[13] = fVar14;
        boolean z12 = this.attemptDeliveryOnCrash;
        if (z12 != configInternal.attemptDeliveryOnCrash) {
            fVar15 = new f("attemptDeliveryOnCrash", Boolean.valueOf(z12));
        }
        fVarArr[14] = fVar15;
        return e0.w0(k.R1(fVarArr));
    }

    public final String getContext() {
        return this.context;
    }

    public final Delivery getDelivery() {
        return this.delivery;
    }

    public final Set<String> getDiscardClasses() {
        return this.discardClasses;
    }

    public final Set<BreadcrumbType> getEnabledBreadcrumbTypes() {
        return this.enabledBreadcrumbTypes;
    }

    public final ErrorTypes getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    public final Set<String> getEnabledReleaseStages() {
        return this.enabledReleaseStages;
    }

    public final EndpointConfiguration getEndpoints() {
        return this.endpoints;
    }

    public final long getLaunchDurationMillis() {
        return this.launchDurationMillis;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public final int getMaxPersistedEvents() {
        return this.maxPersistedEvents;
    }

    public final int getMaxPersistedSessions() {
        return this.maxPersistedSessions;
    }

    public final int getMaxReportedThreads() {
        return this.maxReportedThreads;
    }

    public final int getMaxStringValueLength() {
        return this.maxStringValueLength;
    }

    @Override // com.bugsnag.android.MetadataAware
    public Map<String, Object> getMetadata(String section) {
        i.h(section, "section");
        return this.metadataState.getMetadata(section);
    }

    public final Notifier getNotifier() {
        return this.notifier;
    }

    public final boolean getPersistUser() {
        return this.persistUser;
    }

    public final File getPersistenceDirectory() {
        return this.persistenceDirectory;
    }

    public final HashSet<Plugin> getPlugins() {
        return this.plugins;
    }

    public final Set<String> getProjectPackages() {
        return this.projectPackages;
    }

    public final Set<String> getRedactedKeys() {
        return this.metadataState.getMetadata().getRedactedKeys();
    }

    public final String getReleaseStage() {
        return this.releaseStage;
    }

    public final boolean getSendLaunchCrashesSynchronously() {
        return this.sendLaunchCrashesSynchronously;
    }

    public final ThreadSendPolicy getSendThreads() {
        return this.sendThreads;
    }

    public final Set<Telemetry> getTelemetry() {
        return this.telemetry;
    }

    @Override // com.bugsnag.android.UserAware
    public User getUser() {
        return this.user;
    }

    public final Integer getVersionCode() {
        return this.versionCode;
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnBreadcrumb(OnBreadcrumbCallback onBreadcrumb) {
        i.h(onBreadcrumb, "onBreadcrumb");
        this.callbackState.removeOnBreadcrumb(onBreadcrumb);
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnError(OnErrorCallback onError) {
        i.h(onError, "onError");
        this.callbackState.removeOnError(onError);
    }

    public final void removeOnSend(OnSendCallback onSend) {
        i.h(onSend, "onSend");
        this.callbackState.removeOnSend(onSend);
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnSession(OnSessionCallback onSession) {
        i.h(onSession, "onSession");
        this.callbackState.removeOnSession(onSession);
    }

    public final void setApiKey(String str) {
        i.h(str, "<set-?>");
        this.apiKey = str;
    }

    public final void setAppType(String str) {
        this.appType = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAttemptDeliveryOnCrash(boolean z10) {
        this.attemptDeliveryOnCrash = z10;
    }

    public final void setAutoDetectErrors(boolean z10) {
        this.autoDetectErrors = z10;
    }

    public final void setAutoTrackSessions(boolean z10) {
        this.autoTrackSessions = z10;
    }

    public final void setContext(String str) {
        this.context = str;
    }

    public final void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public final void setDiscardClasses(Set<String> set) {
        i.h(set, "<set-?>");
        this.discardClasses = set;
    }

    public final void setEnabledBreadcrumbTypes(Set<? extends BreadcrumbType> set) {
        this.enabledBreadcrumbTypes = set;
    }

    public final void setEnabledErrorTypes(ErrorTypes errorTypes) {
        i.h(errorTypes, "<set-?>");
        this.enabledErrorTypes = errorTypes;
    }

    public final void setEnabledReleaseStages(Set<String> set) {
        this.enabledReleaseStages = set;
    }

    public final void setEndpoints(EndpointConfiguration endpointConfiguration) {
        i.h(endpointConfiguration, "<set-?>");
        this.endpoints = endpointConfiguration;
    }

    public final void setLaunchDurationMillis(long j10) {
        this.launchDurationMillis = j10;
    }

    public final void setLogger(Logger logger) {
        if (logger == null) {
            logger = NoopLogger.INSTANCE;
        }
        this.logger = logger;
    }

    public final void setMaxBreadcrumbs(int i6) {
        this.maxBreadcrumbs = i6;
    }

    public final void setMaxPersistedEvents(int i6) {
        this.maxPersistedEvents = i6;
    }

    public final void setMaxPersistedSessions(int i6) {
        this.maxPersistedSessions = i6;
    }

    public final void setMaxReportedThreads(int i6) {
        this.maxReportedThreads = i6;
    }

    public final void setMaxStringValueLength(int i6) {
        this.maxStringValueLength = i6;
    }

    public final void setPersistUser(boolean z10) {
        this.persistUser = z10;
    }

    public final void setPersistenceDirectory(File file) {
        this.persistenceDirectory = file;
    }

    public final void setProjectPackages(Set<String> set) {
        i.h(set, "<set-?>");
        this.projectPackages = set;
    }

    public final void setRedactedKeys(Set<String> value) {
        i.h(value, "value");
        this.metadataState.getMetadata().setRedactedKeys(value);
    }

    public final void setReleaseStage(String str) {
        this.releaseStage = str;
    }

    public final void setSendLaunchCrashesSynchronously(boolean z10) {
        this.sendLaunchCrashesSynchronously = z10;
    }

    public final void setSendThreads(ThreadSendPolicy threadSendPolicy) {
        i.h(threadSendPolicy, "<set-?>");
        this.sendThreads = threadSendPolicy;
    }

    public final void setTelemetry(Set<? extends Telemetry> set) {
        i.h(set, "<set-?>");
        this.telemetry = set;
    }

    @Override // com.bugsnag.android.UserAware
    public void setUser(String str, String str2, String str3) {
        this.user = new User(str, str2, str3);
    }

    public final void setVersionCode(Integer num) {
        this.versionCode = num;
    }

    public static final Configuration load(Context context, String str) {
        return Companion.load(context, str);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String name, String str) {
        i.h(name, "name");
        this.featureFlagState.addFeatureFlag(name, str);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String section, String key, Object obj) {
        i.h(section, "section");
        i.h(key, "key");
        this.metadataState.addMetadata(section, key, obj);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        this.metadataState.clearMetadata(section, key);
    }

    @Override // com.bugsnag.android.MetadataAware
    public Object getMetadata(String section, String key) {
        i.h(section, "section");
        i.h(key, "key");
        return this.metadataState.getMetadata(section, key);
    }
}
