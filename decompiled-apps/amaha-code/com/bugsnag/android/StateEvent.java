package com.bugsnag.android;

import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Map;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: StateEvent.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0014\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/bugsnag/android/StateEvent;", "", "()V", "AddBreadcrumb", "AddFeatureFlag", "AddMetadata", "ClearFeatureFlag", "ClearFeatureFlags", "ClearMetadataSection", "ClearMetadataValue", "DeliverPending", "Install", "NotifyHandled", "NotifyUnhandled", "PauseSession", "StartSession", "UpdateContext", "UpdateInForeground", "UpdateIsLaunching", "UpdateLastRunInfo", "UpdateMemoryTrimEvent", "UpdateOrientation", "UpdateUser", "Lcom/bugsnag/android/StateEvent$Install;", "Lcom/bugsnag/android/StateEvent$DeliverPending;", "Lcom/bugsnag/android/StateEvent$AddMetadata;", "Lcom/bugsnag/android/StateEvent$ClearMetadataSection;", "Lcom/bugsnag/android/StateEvent$ClearMetadataValue;", "Lcom/bugsnag/android/StateEvent$AddBreadcrumb;", "Lcom/bugsnag/android/StateEvent$NotifyHandled;", "Lcom/bugsnag/android/StateEvent$NotifyUnhandled;", "Lcom/bugsnag/android/StateEvent$PauseSession;", "Lcom/bugsnag/android/StateEvent$StartSession;", "Lcom/bugsnag/android/StateEvent$UpdateContext;", "Lcom/bugsnag/android/StateEvent$UpdateInForeground;", "Lcom/bugsnag/android/StateEvent$UpdateLastRunInfo;", "Lcom/bugsnag/android/StateEvent$UpdateIsLaunching;", "Lcom/bugsnag/android/StateEvent$UpdateOrientation;", "Lcom/bugsnag/android/StateEvent$UpdateUser;", "Lcom/bugsnag/android/StateEvent$UpdateMemoryTrimEvent;", "Lcom/bugsnag/android/StateEvent$AddFeatureFlag;", "Lcom/bugsnag/android/StateEvent$ClearFeatureFlag;", "Lcom/bugsnag/android/StateEvent$ClearFeatureFlags;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public abstract class StateEvent {

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0002\u0010\nR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/StateEvent$AddBreadcrumb;", "Lcom/bugsnag/android/StateEvent;", "message", "", "type", "Lcom/bugsnag/android/BreadcrumbType;", ServerValues.NAME_OP_TIMESTAMP, "metadata", "", "", "(Ljava/lang/String;Lcom/bugsnag/android/BreadcrumbType;Ljava/lang/String;Ljava/util/Map;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class AddBreadcrumb extends StateEvent {
        public final String message;
        public final Map<String, Object> metadata;
        public final String timestamp;
        public final BreadcrumbType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBreadcrumb(String message, BreadcrumbType type, String timestamp, Map<String, Object> metadata) {
            super(null);
            i.h(message, "message");
            i.h(type, "type");
            i.h(timestamp, "timestamp");
            i.h(metadata, "metadata");
            this.message = message;
            this.type = type;
            this.timestamp = timestamp;
            this.metadata = metadata;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/StateEvent$AddFeatureFlag;", "Lcom/bugsnag/android/StateEvent;", SessionManager.KEY_NAME, "", "variant", "(Ljava/lang/String;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class AddFeatureFlag extends StateEvent {
        public final String name;
        public final String variant;

        public /* synthetic */ AddFeatureFlag(String str, String str2, int i6, d dVar) {
            this(str, (i6 & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFeatureFlag(String name, String str) {
            super(null);
            i.h(name, "name");
            this.name = name;
            this.variant = str;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/StateEvent$AddMetadata;", "Lcom/bugsnag/android/StateEvent;", "section", "", "key", "value", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class AddMetadata extends StateEvent {
        public final String key;
        public final String section;
        public final Object value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMetadata(String section, String str, Object obj) {
            super(null);
            i.h(section, "section");
            this.section = section;
            this.key = str;
            this.value = obj;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearFeatureFlag;", "Lcom/bugsnag/android/StateEvent;", SessionManager.KEY_NAME, "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class ClearFeatureFlag extends StateEvent {
        public final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearFeatureFlag(String name) {
            super(null);
            i.h(name, "name");
            this.name = name;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearFeatureFlags;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class ClearFeatureFlags extends StateEvent {
        public static final ClearFeatureFlags INSTANCE = new ClearFeatureFlags();

        private ClearFeatureFlags() {
            super(null);
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearMetadataSection;", "Lcom/bugsnag/android/StateEvent;", "section", "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class ClearMetadataSection extends StateEvent {
        public final String section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearMetadataSection(String section) {
            super(null);
            i.h(section, "section");
            this.section = section;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/StateEvent$ClearMetadataValue;", "Lcom/bugsnag/android/StateEvent;", "section", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class ClearMetadataValue extends StateEvent {
        public final String key;
        public final String section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearMetadataValue(String section, String str) {
            super(null);
            i.h(section, "section");
            this.section = section;
            this.key = str;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$DeliverPending;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class DeliverPending extends StateEvent {
        public static final DeliverPending INSTANCE = new DeliverPending();

        private DeliverPending() {
            super(null);
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/StateEvent$Install;", "Lcom/bugsnag/android/StateEvent;", "apiKey", "", "autoDetectNdkCrashes", "", "appVersion", "buildUuid", "releaseStage", "lastRunInfoPath", "consecutiveLaunchCrashes", "", "sendThreads", "Lcom/bugsnag/android/ThreadSendPolicy;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/bugsnag/android/ThreadSendPolicy;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Install extends StateEvent {
        public final String apiKey;
        public final String appVersion;
        public final boolean autoDetectNdkCrashes;
        public final String buildUuid;
        public final int consecutiveLaunchCrashes;
        public final String lastRunInfoPath;
        public final String releaseStage;
        public final ThreadSendPolicy sendThreads;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Install(String apiKey, boolean z10, String str, String str2, String str3, String lastRunInfoPath, int i6, ThreadSendPolicy sendThreads) {
            super(null);
            i.h(apiKey, "apiKey");
            i.h(lastRunInfoPath, "lastRunInfoPath");
            i.h(sendThreads, "sendThreads");
            this.apiKey = apiKey;
            this.autoDetectNdkCrashes = z10;
            this.appVersion = str;
            this.buildUuid = str2;
            this.releaseStage = str3;
            this.lastRunInfoPath = lastRunInfoPath;
            this.consecutiveLaunchCrashes = i6;
            this.sendThreads = sendThreads;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$NotifyHandled;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class NotifyHandled extends StateEvent {
        public static final NotifyHandled INSTANCE = new NotifyHandled();

        private NotifyHandled() {
            super(null);
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$NotifyUnhandled;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class NotifyUnhandled extends StateEvent {
        public static final NotifyUnhandled INSTANCE = new NotifyUnhandled();

        private NotifyUnhandled() {
            super(null);
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bugsnag/android/StateEvent$PauseSession;", "Lcom/bugsnag/android/StateEvent;", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class PauseSession extends StateEvent {
        public static final PauseSession INSTANCE = new PauseSession();

        private PauseSession() {
            super(null);
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/StateEvent$StartSession;", "Lcom/bugsnag/android/StateEvent;", "id", "", "startedAt", "handledCount", "", "unhandledCount", "(Ljava/lang/String;Ljava/lang/String;II)V", "getUnhandledCount", "()I", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class StartSession extends StateEvent {
        public final int handledCount;

        /* renamed from: id  reason: collision with root package name */
        public final String f5918id;
        public final String startedAt;
        private final int unhandledCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartSession(String id2, String startedAt, int i6, int i10) {
            super(null);
            i.h(id2, "id");
            i.h(startedAt, "startedAt");
            this.f5918id = id2;
            this.startedAt = startedAt;
            this.handledCount = i6;
            this.unhandledCount = i10;
        }

        public final int getUnhandledCount() {
            return this.unhandledCount;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateContext;", "Lcom/bugsnag/android/StateEvent;", "context", "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UpdateContext extends StateEvent {
        public final String context;

        public UpdateContext(String str) {
            super(null);
            this.context = str;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateInForeground;", "Lcom/bugsnag/android/StateEvent;", "inForeground", "", "contextActivity", "", "(ZLjava/lang/String;)V", "getContextActivity", "()Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UpdateInForeground extends StateEvent {
        private final String contextActivity;
        public final boolean inForeground;

        public UpdateInForeground(boolean z10, String str) {
            super(null);
            this.inForeground = z10;
            this.contextActivity = str;
        }

        public final String getContextActivity() {
            return this.contextActivity;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateIsLaunching;", "Lcom/bugsnag/android/StateEvent;", "isLaunching", "", "(Z)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UpdateIsLaunching extends StateEvent {
        public final boolean isLaunching;

        public UpdateIsLaunching(boolean z10) {
            super(null);
            this.isLaunching = z10;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateLastRunInfo;", "Lcom/bugsnag/android/StateEvent;", "consecutiveLaunchCrashes", "", "(I)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UpdateLastRunInfo extends StateEvent {
        public final int consecutiveLaunchCrashes;

        public UpdateLastRunInfo(int i6) {
            super(null);
            this.consecutiveLaunchCrashes = i6;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateMemoryTrimEvent;", "Lcom/bugsnag/android/StateEvent;", "isLowMemory", "", "memoryTrimLevel", "", "memoryTrimLevelDescription", "", "(ZLjava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UpdateMemoryTrimEvent extends StateEvent {
        public final boolean isLowMemory;
        public final Integer memoryTrimLevel;
        public final String memoryTrimLevelDescription;

        public /* synthetic */ UpdateMemoryTrimEvent(boolean z10, Integer num, String str, int i6, d dVar) {
            this(z10, (i6 & 2) != 0 ? null : num, (i6 & 4) != 0 ? "None" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateMemoryTrimEvent(boolean z10, Integer num, String memoryTrimLevelDescription) {
            super(null);
            i.h(memoryTrimLevelDescription, "memoryTrimLevelDescription");
            this.isLowMemory = z10;
            this.memoryTrimLevel = num;
            this.memoryTrimLevelDescription = memoryTrimLevelDescription;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateOrientation;", "Lcom/bugsnag/android/StateEvent;", "orientation", "", "(Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UpdateOrientation extends StateEvent {
        public final String orientation;

        public UpdateOrientation(String str) {
            super(null);
            this.orientation = str;
        }
    }

    /* compiled from: StateEvent.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/StateEvent$UpdateUser;", "Lcom/bugsnag/android/StateEvent;", "user", "Lcom/bugsnag/android/User;", "(Lcom/bugsnag/android/User;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class UpdateUser extends StateEvent {
        public final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateUser(User user) {
            super(null);
            i.h(user, "user");
            this.user = user;
        }
    }

    private StateEvent() {
    }

    public /* synthetic */ StateEvent(d dVar) {
        this();
    }
}
