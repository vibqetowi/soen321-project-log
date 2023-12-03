package com.bugsnag.android.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Delivery;
import com.bugsnag.android.DeliveryHeadersKt;
import com.bugsnag.android.DeliveryParams;
import com.bugsnag.android.EndpointConfiguration;
import com.bugsnag.android.ErrorTypes;
import com.bugsnag.android.EventPayload;
import com.bugsnag.android.Logger;
import com.bugsnag.android.Telemetry;
import com.bugsnag.android.ThreadSendPolicy;
import com.bugsnag.android.ThrowableUtils;
import hs.d;
import is.u;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ImmutableConfig.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bd\b\u0086\b\u0018\u00002\u00020\u0001Bµ\u0002\u0012\u0006\u0010D\u001a\u00020\u000b\u0012\u0006\u0010E\u001a\u00020\t\u0012\u0006\u0010F\u001a\u00020\u0019\u0012\u0006\u0010G\u001a\u00020\t\u0012\u0006\u0010H\u001a\u00020\u001c\u0012\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00020$0\"\u0012\b\u0010N\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010O\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010P\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010Q\u001a\u0004\u0018\u00010)\u0012\b\u0010R\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010S\u001a\u00020-\u0012\u0006\u0010T\u001a\u00020/\u0012\u0006\u0010U\u001a\u00020\t\u0012\u0006\u0010V\u001a\u000202\u0012\u0006\u0010W\u001a\u000204\u0012\u0006\u0010X\u001a\u00020)\u0012\u0006\u0010Y\u001a\u00020)\u0012\u0006\u0010Z\u001a\u00020)\u0012\u0006\u0010[\u001a\u00020)\u0012\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020;0:\u0012\u0006\u0010]\u001a\u00020\t\u0012\u0006\u0010^\u001a\u00020\t\u0012\b\u0010_\u001a\u0004\u0018\u00010?\u0012\b\u0010`\u001a\u0004\u0018\u00010A\u0012\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\b\u0010\u0006\u001a\u00020\u0004H\u0001J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\tJ\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0016J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u001cHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001eHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\"HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010*\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\b*\u0010+J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010.\u001a\u00020-HÆ\u0003J\t\u00100\u001a\u00020/HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u000202HÆ\u0003J\t\u00105\u001a\u000204HÆ\u0003J\t\u00106\u001a\u00020)HÆ\u0003J\t\u00107\u001a\u00020)HÆ\u0003J\t\u00108\u001a\u00020)HÆ\u0003J\t\u00109\u001a\u00020)HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010?HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010AHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eHÆ\u0003Jø\u0002\u0010b\u001a\u00020\u00002\b\b\u0002\u0010D\u001a\u00020\u000b2\b\b\u0002\u0010E\u001a\u00020\t2\b\b\u0002\u0010F\u001a\u00020\u00192\b\b\u0002\u0010G\u001a\u00020\t2\b\b\u0002\u0010H\u001a\u00020\u001c2\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e2\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020$0\"2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010S\u001a\u00020-2\b\b\u0002\u0010T\u001a\u00020/2\b\b\u0002\u0010U\u001a\u00020\t2\b\b\u0002\u0010V\u001a\u0002022\b\b\u0002\u0010W\u001a\u0002042\b\b\u0002\u0010X\u001a\u00020)2\b\b\u0002\u0010Y\u001a\u00020)2\b\b\u0002\u0010Z\u001a\u00020)2\b\b\u0002\u0010[\u001a\u00020)2\u000e\b\u0002\u0010\\\u001a\b\u0012\u0004\u0012\u00020;0:2\b\b\u0002\u0010]\u001a\u00020\t2\b\b\u0002\u0010^\u001a\u00020\t2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010A2\u000e\b\u0002\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eHÆ\u0001¢\u0006\u0004\bb\u0010cJ\t\u0010d\u001a\u00020\u000bHÖ\u0001J\t\u0010e\u001a\u00020)HÖ\u0001J\u0013\u0010g\u001a\u00020\t2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010D\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bD\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010E\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bE\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010F\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bF\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010G\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u0010k\u001a\u0004\bq\u0010mR\u0017\u0010H\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bH\u0010r\u001a\u0004\bs\u0010tR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0006¢\u0006\f\n\u0004\bI\u0010u\u001a\u0004\bv\u0010wR\u001f\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bJ\u0010u\u001a\u0004\bx\u0010wR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0006¢\u0006\f\n\u0004\bK\u0010u\u001a\u0004\by\u0010wR\u001f\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bL\u0010z\u001a\u0004\b{\u0010|R\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020$0\"8\u0006¢\u0006\f\n\u0004\bM\u0010z\u001a\u0004\b}\u0010|R\u0019\u0010N\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bN\u0010h\u001a\u0004\b~\u0010jR\u0019\u0010O\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bO\u0010h\u001a\u0004\b\u007f\u0010jR\u001a\u0010P\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\r\n\u0004\bP\u0010h\u001a\u0005\b\u0080\u0001\u0010jR\u001b\u0010Q\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\bQ\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010+R\u001a\u0010R\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\r\n\u0004\bR\u0010h\u001a\u0005\b\u0083\u0001\u0010jR\u001a\u0010S\u001a\u00020-8\u0006¢\u0006\u000f\n\u0005\bS\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010T\u001a\u00020/8\u0006¢\u0006\u000f\n\u0005\bT\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010U\u001a\u00020\t8\u0006¢\u0006\r\n\u0004\bU\u0010k\u001a\u0005\b\u008a\u0001\u0010mR\u001a\u0010V\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\bV\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010W\u001a\u0002048\u0006¢\u0006\u000f\n\u0005\bW\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010X\u001a\u00020)8\u0006¢\u0006\u000f\n\u0005\bX\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010Y\u001a\u00020)8\u0006¢\u0006\u000f\n\u0005\bY\u0010\u0091\u0001\u001a\u0006\b\u0094\u0001\u0010\u0093\u0001R\u001a\u0010Z\u001a\u00020)8\u0006¢\u0006\u000f\n\u0005\bZ\u0010\u0091\u0001\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001R\u001a\u0010[\u001a\u00020)8\u0006¢\u0006\u000f\n\u0005\b[\u0010\u0091\u0001\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001R \u0010\\\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006¢\u0006\u000f\n\u0005\b\\\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010]\u001a\u00020\t8\u0006¢\u0006\r\n\u0004\b]\u0010k\u001a\u0005\b\u009a\u0001\u0010mR\u0018\u0010^\u001a\u00020\t8\u0006¢\u0006\r\n\u0004\b^\u0010k\u001a\u0005\b\u009b\u0001\u0010mR\u001c\u0010_\u001a\u0004\u0018\u00010?8\u0006¢\u0006\u000f\n\u0005\b_\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010`\u001a\u0004\u0018\u00010A8\u0006¢\u0006\u000f\n\u0005\b`\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001e\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0006¢\u0006\r\n\u0004\ba\u0010u\u001a\u0005\b¢\u0001\u0010w¨\u0006¥\u0001"}, d2 = {"Lcom/bugsnag/android/internal/ImmutableConfig;", "", "Lcom/bugsnag/android/EventPayload;", "payload", "Lcom/bugsnag/android/DeliveryParams;", "getErrorApiDeliveryParams", "getSessionApiDeliveryParams", "", "exc", "", "shouldDiscardError", "", "errorClass", "autoCaptured", "shouldDiscardSession", "Lcom/bugsnag/android/BreadcrumbType;", "type", "shouldDiscardBreadcrumb", "shouldDiscardByReleaseStage", "shouldDiscardByErrorClass$bugsnag_android_core_release", "(Ljava/lang/String;)Z", "shouldDiscardByErrorClass", "(Ljava/lang/Throwable;)Z", "component1", "component2", "Lcom/bugsnag/android/ErrorTypes;", "component3", "component4", "Lcom/bugsnag/android/ThreadSendPolicy;", "component5", "", "component6", "component7", "component8", "", "component9", "Lcom/bugsnag/android/Telemetry;", "component10", "component11", "component12", "component13", "", "component14", "()Ljava/lang/Integer;", "component15", "Lcom/bugsnag/android/Delivery;", "component16", "Lcom/bugsnag/android/EndpointConfiguration;", "component17", "component18", "", "component19", "Lcom/bugsnag/android/Logger;", "component20", "component21", "component22", "component23", "component24", "Lhs/d;", "Ljava/io/File;", "component25", "component26", "component27", "Landroid/content/pm/PackageInfo;", "component28", "Landroid/content/pm/ApplicationInfo;", "component29", "component30", "apiKey", "autoDetectErrors", "enabledErrorTypes", "autoTrackSessions", "sendThreads", "discardClasses", "enabledReleaseStages", "projectPackages", "enabledBreadcrumbTypes", "telemetry", "releaseStage", "buildUuid", "appVersion", "versionCode", "appType", "delivery", "endpoints", "persistUser", "launchDurationMillis", "logger", "maxBreadcrumbs", "maxPersistedEvents", "maxPersistedSessions", "maxReportedThreads", "persistenceDirectory", "sendLaunchCrashesSynchronously", "attemptDeliveryOnCrash", "packageInfo", "appInfo", "redactedKeys", "copy", "(Ljava/lang/String;ZLcom/bugsnag/android/ErrorTypes;ZLcom/bugsnag/android/ThreadSendPolicy;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/bugsnag/android/Delivery;Lcom/bugsnag/android/EndpointConfiguration;ZJLcom/bugsnag/android/Logger;IIIILhs/d;ZZLandroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Ljava/util/Collection;)Lcom/bugsnag/android/internal/ImmutableConfig;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getApiKey", "()Ljava/lang/String;", "Z", "getAutoDetectErrors", "()Z", "Lcom/bugsnag/android/ErrorTypes;", "getEnabledErrorTypes", "()Lcom/bugsnag/android/ErrorTypes;", "getAutoTrackSessions", "Lcom/bugsnag/android/ThreadSendPolicy;", "getSendThreads", "()Lcom/bugsnag/android/ThreadSendPolicy;", "Ljava/util/Collection;", "getDiscardClasses", "()Ljava/util/Collection;", "getEnabledReleaseStages", "getProjectPackages", "Ljava/util/Set;", "getEnabledBreadcrumbTypes", "()Ljava/util/Set;", "getTelemetry", "getReleaseStage", "getBuildUuid", "getAppVersion", "Ljava/lang/Integer;", "getVersionCode", "getAppType", "Lcom/bugsnag/android/Delivery;", "getDelivery", "()Lcom/bugsnag/android/Delivery;", "Lcom/bugsnag/android/EndpointConfiguration;", "getEndpoints", "()Lcom/bugsnag/android/EndpointConfiguration;", "getPersistUser", "J", "getLaunchDurationMillis", "()J", "Lcom/bugsnag/android/Logger;", "getLogger", "()Lcom/bugsnag/android/Logger;", "I", "getMaxBreadcrumbs", "()I", "getMaxPersistedEvents", "getMaxPersistedSessions", "getMaxReportedThreads", "Lhs/d;", "getPersistenceDirectory", "()Lhs/d;", "getSendLaunchCrashesSynchronously", "getAttemptDeliveryOnCrash", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "()Landroid/content/pm/PackageInfo;", "Landroid/content/pm/ApplicationInfo;", "getAppInfo", "()Landroid/content/pm/ApplicationInfo;", "getRedactedKeys", "<init>", "(Ljava/lang/String;ZLcom/bugsnag/android/ErrorTypes;ZLcom/bugsnag/android/ThreadSendPolicy;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/bugsnag/android/Delivery;Lcom/bugsnag/android/EndpointConfiguration;ZJLcom/bugsnag/android/Logger;IIIILhs/d;ZZLandroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Ljava/util/Collection;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ImmutableConfig {
    private final String apiKey;
    private final ApplicationInfo appInfo;
    private final String appType;
    private final String appVersion;
    private final boolean attemptDeliveryOnCrash;
    private final boolean autoDetectErrors;
    private final boolean autoTrackSessions;
    private final String buildUuid;
    private final Delivery delivery;
    private final Collection<String> discardClasses;
    private final Set<BreadcrumbType> enabledBreadcrumbTypes;
    private final ErrorTypes enabledErrorTypes;
    private final Collection<String> enabledReleaseStages;
    private final EndpointConfiguration endpoints;
    private final long launchDurationMillis;
    private final Logger logger;
    private final int maxBreadcrumbs;
    private final int maxPersistedEvents;
    private final int maxPersistedSessions;
    private final int maxReportedThreads;
    private final PackageInfo packageInfo;
    private final boolean persistUser;
    private final d<File> persistenceDirectory;
    private final Collection<String> projectPackages;
    private final Collection<String> redactedKeys;
    private final String releaseStage;
    private final boolean sendLaunchCrashesSynchronously;
    private final ThreadSendPolicy sendThreads;
    private final Set<Telemetry> telemetry;
    private final Integer versionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableConfig(String apiKey, boolean z10, ErrorTypes enabledErrorTypes, boolean z11, ThreadSendPolicy sendThreads, Collection<String> discardClasses, Collection<String> collection, Collection<String> projectPackages, Set<? extends BreadcrumbType> set, Set<? extends Telemetry> telemetry, String str, String str2, String str3, Integer num, String str4, Delivery delivery, EndpointConfiguration endpoints, boolean z12, long j10, Logger logger, int i6, int i10, int i11, int i12, d<? extends File> persistenceDirectory, boolean z13, boolean z14, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection<String> redactedKeys) {
        i.h(apiKey, "apiKey");
        i.h(enabledErrorTypes, "enabledErrorTypes");
        i.h(sendThreads, "sendThreads");
        i.h(discardClasses, "discardClasses");
        i.h(projectPackages, "projectPackages");
        i.h(telemetry, "telemetry");
        i.h(delivery, "delivery");
        i.h(endpoints, "endpoints");
        i.h(logger, "logger");
        i.h(persistenceDirectory, "persistenceDirectory");
        i.h(redactedKeys, "redactedKeys");
        this.apiKey = apiKey;
        this.autoDetectErrors = z10;
        this.enabledErrorTypes = enabledErrorTypes;
        this.autoTrackSessions = z11;
        this.sendThreads = sendThreads;
        this.discardClasses = discardClasses;
        this.enabledReleaseStages = collection;
        this.projectPackages = projectPackages;
        this.enabledBreadcrumbTypes = set;
        this.telemetry = telemetry;
        this.releaseStage = str;
        this.buildUuid = str2;
        this.appVersion = str3;
        this.versionCode = num;
        this.appType = str4;
        this.delivery = delivery;
        this.endpoints = endpoints;
        this.persistUser = z12;
        this.launchDurationMillis = j10;
        this.logger = logger;
        this.maxBreadcrumbs = i6;
        this.maxPersistedEvents = i10;
        this.maxPersistedSessions = i11;
        this.maxReportedThreads = i12;
        this.persistenceDirectory = persistenceDirectory;
        this.sendLaunchCrashesSynchronously = z13;
        this.attemptDeliveryOnCrash = z14;
        this.packageInfo = packageInfo;
        this.appInfo = applicationInfo;
        this.redactedKeys = redactedKeys;
    }

    public final String component1() {
        return this.apiKey;
    }

    public final Set<Telemetry> component10() {
        return this.telemetry;
    }

    public final String component11() {
        return this.releaseStage;
    }

    public final String component12() {
        return this.buildUuid;
    }

    public final String component13() {
        return this.appVersion;
    }

    public final Integer component14() {
        return this.versionCode;
    }

    public final String component15() {
        return this.appType;
    }

    public final Delivery component16() {
        return this.delivery;
    }

    public final EndpointConfiguration component17() {
        return this.endpoints;
    }

    public final boolean component18() {
        return this.persistUser;
    }

    public final long component19() {
        return this.launchDurationMillis;
    }

    public final boolean component2() {
        return this.autoDetectErrors;
    }

    public final Logger component20() {
        return this.logger;
    }

    public final int component21() {
        return this.maxBreadcrumbs;
    }

    public final int component22() {
        return this.maxPersistedEvents;
    }

    public final int component23() {
        return this.maxPersistedSessions;
    }

    public final int component24() {
        return this.maxReportedThreads;
    }

    public final d<File> component25() {
        return this.persistenceDirectory;
    }

    public final boolean component26() {
        return this.sendLaunchCrashesSynchronously;
    }

    public final boolean component27() {
        return this.attemptDeliveryOnCrash;
    }

    public final PackageInfo component28() {
        return this.packageInfo;
    }

    public final ApplicationInfo component29() {
        return this.appInfo;
    }

    public final ErrorTypes component3() {
        return this.enabledErrorTypes;
    }

    public final Collection<String> component30() {
        return this.redactedKeys;
    }

    public final boolean component4() {
        return this.autoTrackSessions;
    }

    public final ThreadSendPolicy component5() {
        return this.sendThreads;
    }

    public final Collection<String> component6() {
        return this.discardClasses;
    }

    public final Collection<String> component7() {
        return this.enabledReleaseStages;
    }

    public final Collection<String> component8() {
        return this.projectPackages;
    }

    public final Set<BreadcrumbType> component9() {
        return this.enabledBreadcrumbTypes;
    }

    public final ImmutableConfig copy(String apiKey, boolean z10, ErrorTypes enabledErrorTypes, boolean z11, ThreadSendPolicy sendThreads, Collection<String> discardClasses, Collection<String> collection, Collection<String> projectPackages, Set<? extends BreadcrumbType> set, Set<? extends Telemetry> telemetry, String str, String str2, String str3, Integer num, String str4, Delivery delivery, EndpointConfiguration endpoints, boolean z12, long j10, Logger logger, int i6, int i10, int i11, int i12, d<? extends File> persistenceDirectory, boolean z13, boolean z14, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection<String> redactedKeys) {
        i.h(apiKey, "apiKey");
        i.h(enabledErrorTypes, "enabledErrorTypes");
        i.h(sendThreads, "sendThreads");
        i.h(discardClasses, "discardClasses");
        i.h(projectPackages, "projectPackages");
        i.h(telemetry, "telemetry");
        i.h(delivery, "delivery");
        i.h(endpoints, "endpoints");
        i.h(logger, "logger");
        i.h(persistenceDirectory, "persistenceDirectory");
        i.h(redactedKeys, "redactedKeys");
        return new ImmutableConfig(apiKey, z10, enabledErrorTypes, z11, sendThreads, discardClasses, collection, projectPackages, set, telemetry, str, str2, str3, num, str4, delivery, endpoints, z12, j10, logger, i6, i10, i11, i12, persistenceDirectory, z13, z14, packageInfo, applicationInfo, redactedKeys);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImmutableConfig) {
                ImmutableConfig immutableConfig = (ImmutableConfig) obj;
                if (!i.b(this.apiKey, immutableConfig.apiKey) || this.autoDetectErrors != immutableConfig.autoDetectErrors || !i.b(this.enabledErrorTypes, immutableConfig.enabledErrorTypes) || this.autoTrackSessions != immutableConfig.autoTrackSessions || !i.b(this.sendThreads, immutableConfig.sendThreads) || !i.b(this.discardClasses, immutableConfig.discardClasses) || !i.b(this.enabledReleaseStages, immutableConfig.enabledReleaseStages) || !i.b(this.projectPackages, immutableConfig.projectPackages) || !i.b(this.enabledBreadcrumbTypes, immutableConfig.enabledBreadcrumbTypes) || !i.b(this.telemetry, immutableConfig.telemetry) || !i.b(this.releaseStage, immutableConfig.releaseStage) || !i.b(this.buildUuid, immutableConfig.buildUuid) || !i.b(this.appVersion, immutableConfig.appVersion) || !i.b(this.versionCode, immutableConfig.versionCode) || !i.b(this.appType, immutableConfig.appType) || !i.b(this.delivery, immutableConfig.delivery) || !i.b(this.endpoints, immutableConfig.endpoints) || this.persistUser != immutableConfig.persistUser || this.launchDurationMillis != immutableConfig.launchDurationMillis || !i.b(this.logger, immutableConfig.logger) || this.maxBreadcrumbs != immutableConfig.maxBreadcrumbs || this.maxPersistedEvents != immutableConfig.maxPersistedEvents || this.maxPersistedSessions != immutableConfig.maxPersistedSessions || this.maxReportedThreads != immutableConfig.maxReportedThreads || !i.b(this.persistenceDirectory, immutableConfig.persistenceDirectory) || this.sendLaunchCrashesSynchronously != immutableConfig.sendLaunchCrashesSynchronously || this.attemptDeliveryOnCrash != immutableConfig.attemptDeliveryOnCrash || !i.b(this.packageInfo, immutableConfig.packageInfo) || !i.b(this.appInfo, immutableConfig.appInfo) || !i.b(this.redactedKeys, immutableConfig.redactedKeys)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final ApplicationInfo getAppInfo() {
        return this.appInfo;
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

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final Delivery getDelivery() {
        return this.delivery;
    }

    public final Collection<String> getDiscardClasses() {
        return this.discardClasses;
    }

    public final Set<BreadcrumbType> getEnabledBreadcrumbTypes() {
        return this.enabledBreadcrumbTypes;
    }

    public final ErrorTypes getEnabledErrorTypes() {
        return this.enabledErrorTypes;
    }

    public final Collection<String> getEnabledReleaseStages() {
        return this.enabledReleaseStages;
    }

    public final EndpointConfiguration getEndpoints() {
        return this.endpoints;
    }

    public final DeliveryParams getErrorApiDeliveryParams(EventPayload payload) {
        i.h(payload, "payload");
        return new DeliveryParams(this.endpoints.getNotify(), DeliveryHeadersKt.errorApiHeaders(payload));
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

    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    public final boolean getPersistUser() {
        return this.persistUser;
    }

    public final d<File> getPersistenceDirectory() {
        return this.persistenceDirectory;
    }

    public final Collection<String> getProjectPackages() {
        return this.projectPackages;
    }

    public final Collection<String> getRedactedKeys() {
        return this.redactedKeys;
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

    public final DeliveryParams getSessionApiDeliveryParams() {
        return new DeliveryParams(this.endpoints.getSessions(), DeliveryHeadersKt.sessionApiHeaders(this.apiKey));
    }

    public final Set<Telemetry> getTelemetry() {
        return this.telemetry;
    }

    public final Integer getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        String str = this.apiKey;
        int i28 = 0;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i29 = i6 * 31;
        boolean z10 = this.autoDetectErrors;
        int i30 = 1;
        int i31 = z10;
        if (z10 != 0) {
            i31 = 1;
        }
        int i32 = (i29 + i31) * 31;
        ErrorTypes errorTypes = this.enabledErrorTypes;
        if (errorTypes != null) {
            i10 = errorTypes.hashCode();
        } else {
            i10 = 0;
        }
        int i33 = (i32 + i10) * 31;
        boolean z11 = this.autoTrackSessions;
        int i34 = z11;
        if (z11 != 0) {
            i34 = 1;
        }
        int i35 = (i33 + i34) * 31;
        ThreadSendPolicy threadSendPolicy = this.sendThreads;
        if (threadSendPolicy != null) {
            i11 = threadSendPolicy.hashCode();
        } else {
            i11 = 0;
        }
        int i36 = (i35 + i11) * 31;
        Collection<String> collection = this.discardClasses;
        if (collection != null) {
            i12 = collection.hashCode();
        } else {
            i12 = 0;
        }
        int i37 = (i36 + i12) * 31;
        Collection<String> collection2 = this.enabledReleaseStages;
        if (collection2 != null) {
            i13 = collection2.hashCode();
        } else {
            i13 = 0;
        }
        int i38 = (i37 + i13) * 31;
        Collection<String> collection3 = this.projectPackages;
        if (collection3 != null) {
            i14 = collection3.hashCode();
        } else {
            i14 = 0;
        }
        int i39 = (i38 + i14) * 31;
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        if (set != null) {
            i15 = set.hashCode();
        } else {
            i15 = 0;
        }
        int i40 = (i39 + i15) * 31;
        Set<Telemetry> set2 = this.telemetry;
        if (set2 != null) {
            i16 = set2.hashCode();
        } else {
            i16 = 0;
        }
        int i41 = (i40 + i16) * 31;
        String str2 = this.releaseStage;
        if (str2 != null) {
            i17 = str2.hashCode();
        } else {
            i17 = 0;
        }
        int i42 = (i41 + i17) * 31;
        String str3 = this.buildUuid;
        if (str3 != null) {
            i18 = str3.hashCode();
        } else {
            i18 = 0;
        }
        int i43 = (i42 + i18) * 31;
        String str4 = this.appVersion;
        if (str4 != null) {
            i19 = str4.hashCode();
        } else {
            i19 = 0;
        }
        int i44 = (i43 + i19) * 31;
        Integer num = this.versionCode;
        if (num != null) {
            i20 = num.hashCode();
        } else {
            i20 = 0;
        }
        int i45 = (i44 + i20) * 31;
        String str5 = this.appType;
        if (str5 != null) {
            i21 = str5.hashCode();
        } else {
            i21 = 0;
        }
        int i46 = (i45 + i21) * 31;
        Delivery delivery = this.delivery;
        if (delivery != null) {
            i22 = delivery.hashCode();
        } else {
            i22 = 0;
        }
        int i47 = (i46 + i22) * 31;
        EndpointConfiguration endpointConfiguration = this.endpoints;
        if (endpointConfiguration != null) {
            i23 = endpointConfiguration.hashCode();
        } else {
            i23 = 0;
        }
        int i48 = (i47 + i23) * 31;
        boolean z12 = this.persistUser;
        int i49 = z12;
        if (z12 != 0) {
            i49 = 1;
        }
        long j10 = this.launchDurationMillis;
        int i50 = (((i48 + i49) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Logger logger = this.logger;
        if (logger != null) {
            i24 = logger.hashCode();
        } else {
            i24 = 0;
        }
        int i51 = (((((((((i50 + i24) * 31) + this.maxBreadcrumbs) * 31) + this.maxPersistedEvents) * 31) + this.maxPersistedSessions) * 31) + this.maxReportedThreads) * 31;
        d<File> dVar = this.persistenceDirectory;
        if (dVar != null) {
            i25 = dVar.hashCode();
        } else {
            i25 = 0;
        }
        int i52 = (i51 + i25) * 31;
        boolean z13 = this.sendLaunchCrashesSynchronously;
        int i53 = z13;
        if (z13 != 0) {
            i53 = 1;
        }
        int i54 = (i52 + i53) * 31;
        boolean z14 = this.attemptDeliveryOnCrash;
        if (!z14) {
            i30 = z14 ? 1 : 0;
        }
        int i55 = (i54 + i30) * 31;
        PackageInfo packageInfo = this.packageInfo;
        if (packageInfo != null) {
            i26 = packageInfo.hashCode();
        } else {
            i26 = 0;
        }
        int i56 = (i55 + i26) * 31;
        ApplicationInfo applicationInfo = this.appInfo;
        if (applicationInfo != null) {
            i27 = applicationInfo.hashCode();
        } else {
            i27 = 0;
        }
        int i57 = (i56 + i27) * 31;
        Collection<String> collection4 = this.redactedKeys;
        if (collection4 != null) {
            i28 = collection4.hashCode();
        }
        return i57 + i28;
    }

    public final boolean shouldDiscardBreadcrumb(BreadcrumbType type) {
        i.h(type, "type");
        Set<BreadcrumbType> set = this.enabledBreadcrumbTypes;
        if (set != null && !set.contains(type)) {
            return true;
        }
        return false;
    }

    public final boolean shouldDiscardByErrorClass$bugsnag_android_core_release(String str) {
        return u.Z1(this.discardClasses, str);
    }

    public final boolean shouldDiscardByReleaseStage() {
        Collection<String> collection = this.enabledReleaseStages;
        if (collection != null && !u.Z1(collection, this.releaseStage)) {
            return true;
        }
        return false;
    }

    public final boolean shouldDiscardError(Throwable exc) {
        i.h(exc, "exc");
        return shouldDiscardByReleaseStage() || shouldDiscardByErrorClass$bugsnag_android_core_release(exc);
    }

    public final boolean shouldDiscardSession(boolean z10) {
        if (!shouldDiscardByReleaseStage() && (!z10 || this.autoTrackSessions)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "ImmutableConfig(apiKey=" + this.apiKey + ", autoDetectErrors=" + this.autoDetectErrors + ", enabledErrorTypes=" + this.enabledErrorTypes + ", autoTrackSessions=" + this.autoTrackSessions + ", sendThreads=" + this.sendThreads + ", discardClasses=" + this.discardClasses + ", enabledReleaseStages=" + this.enabledReleaseStages + ", projectPackages=" + this.projectPackages + ", enabledBreadcrumbTypes=" + this.enabledBreadcrumbTypes + ", telemetry=" + this.telemetry + ", releaseStage=" + this.releaseStage + ", buildUuid=" + this.buildUuid + ", appVersion=" + this.appVersion + ", versionCode=" + this.versionCode + ", appType=" + this.appType + ", delivery=" + this.delivery + ", endpoints=" + this.endpoints + ", persistUser=" + this.persistUser + ", launchDurationMillis=" + this.launchDurationMillis + ", logger=" + this.logger + ", maxBreadcrumbs=" + this.maxBreadcrumbs + ", maxPersistedEvents=" + this.maxPersistedEvents + ", maxPersistedSessions=" + this.maxPersistedSessions + ", maxReportedThreads=" + this.maxReportedThreads + ", persistenceDirectory=" + this.persistenceDirectory + ", sendLaunchCrashesSynchronously=" + this.sendLaunchCrashesSynchronously + ", attemptDeliveryOnCrash=" + this.attemptDeliveryOnCrash + ", packageInfo=" + this.packageInfo + ", appInfo=" + this.appInfo + ", redactedKeys=" + this.redactedKeys + ")";
    }

    public final boolean shouldDiscardByErrorClass$bugsnag_android_core_release(Throwable exc) {
        i.h(exc, "exc");
        List<Throwable> safeUnrollCauses = ThrowableUtils.safeUnrollCauses(exc);
        if ((safeUnrollCauses instanceof Collection) && safeUnrollCauses.isEmpty()) {
            return false;
        }
        for (Throwable th2 : safeUnrollCauses) {
            if (shouldDiscardByErrorClass$bugsnag_android_core_release(th2.getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldDiscardError(String str) {
        return shouldDiscardByReleaseStage() || shouldDiscardByErrorClass$bugsnag_android_core_release(str);
    }
}
