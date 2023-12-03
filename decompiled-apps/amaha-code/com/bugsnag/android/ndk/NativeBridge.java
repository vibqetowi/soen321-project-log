package com.bugsnag.android.ndk;

import android.os.Build;
import com.bugsnag.android.Logger;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.StateObserver;
import com.bugsnag.android.internal.TaskType;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.a;
import gv.e;
import gv.r;
import hs.k;
import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: NativeBridge.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bi\u0010jJI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0086 J)\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0086 J\u0011\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0086 J)\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0086 J!\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0086 J!\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001fH\u0086 J!\u0010!\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\bH\u0086 J!\u0010\"\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0086 J\t\u0010#\u001a\u00020\rH\u0086 J\t\u0010$\u001a\u00020\rH\u0086 J\u0011\u0010%\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0002H\u0086 J\u0019\u0010&\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0086 J\t\u0010'\u001a\u00020\rH\u0086 J\u0011\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0002H\u0086 J\u0019\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0002H\u0086 J\u0011\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020\bH\u0086 J\u0011\u0010/\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 J\u0011\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020\u0002H\u0086 J\u0011\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0002H\u0086 J\u0011\u00104\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0002H\u0086 J\u0011\u00105\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0002H\u0086 J\t\u00107\u001a\u000206H\u0086 J\u0019\u00109\u001a\u00020\r2\u0006\u00102\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0002H\u0086 J\u001b\u0010;\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0002H\u0086 J\u0011\u0010<\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0002H\u0086 J\t\u0010=\u001a\u00020\rH\u0086 J\t\u0010>\u001a\u00020\rH\u0086 J\u001d\u0010A\u001a\u00020\r2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060?H\u0086 J\u0011\u0010C\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0002H\u0086 J\u0011\u0010D\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0002H\u0086 J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010?H\u0086 J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010?H\u0086 J\u0011\u0010H\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u0002H\u0086 J\u0011\u0010J\u001a\u00020\r2\u0006\u0010I\u001a\u00020\bH\u0086 J\u0010\u0010M\u001a\u00020\r2\u0006\u0010L\u001a\u00020KH\u0016J,\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190?2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190?H\u0002J\u0012\u0010P\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010Q\u001a\u00020\rH\u0002J\u0010\u0010T\u001a\u00020\r2\u0006\u0010S\u001a\u00020RH\u0002J\u0010\u0010V\u001a\u00020\r2\u0006\u0010S\u001a\u00020UH\u0002J\u0010\u0010X\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\u0002H\u0002R\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010h¨\u0006k"}, d2 = {"Lcom/bugsnag/android/ndk/NativeBridge;", "Lcom/bugsnag/android/internal/StateObserver;", "", "apiKey", "reportingDirectory", "lastRunInfoPath", "", "consecutiveLaunchCrashes", "", "autoDetectNdkCrashes", "apiLevel", "is32bit", "threadSendPolicy", "Lhs/k;", "install", "sessionID", "key", "handledCount", "unhandledCount", "startedSession", "filePath", "deliverReportAtPath", SessionManager.KEY_NAME, "type", ServerValues.NAME_OP_TIMESTAMP, "", "metadata", "addBreadcrumb", "tab", "value", "addMetadataString", "", "addMetadataDouble", "addMetadataBoolean", "addMetadataOpaque", "addHandledEvent", "addUnhandledEvent", "clearMetadataTab", "removeMetadata", "pausedSession", "context", "updateContext", "inForeground", "activityName", "updateInForeground", "isLaunching", "updateIsLaunching", "updateLastRunInfo", "orientation", "updateOrientation", "newValue", "updateUserId", "updateUserEmail", "updateUserName", "", "getSignalUnwindStackFunction", "memoryTrimLevelDescription", "updateLowMemory", "variant", "addFeatureFlag", "clearFeatureFlag", "clearFeatureFlags", "refreshSymbolTable", "", "counts", "initCallbackCounts", "callback", "notifyAddCallback", "notifyRemoveCallback", "getCurrentCallbackSetCounts", "getCurrentNativeApiCallUsage", "data", "setStaticJsonData", "enabled", "setInternalMetricsEnabled", "Lcom/bugsnag/android/StateEvent;", "event", "onStateChange", "makeSafeMetadata", "msg", "isInvalidMessage", "deliverPendingReports", "Lcom/bugsnag/android/StateEvent$Install;", "arg", "handleInstallMessage", "Lcom/bugsnag/android/StateEvent$AddMetadata;", "handleAddMetadata", "text", "makeSafe", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "installed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/io/File;", "reportDirectory", "Ljava/io/File;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "bgTaskService", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "()Z", "<init>", "(Lcom/bugsnag/android/internal/BackgroundTaskService;)V", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class NativeBridge implements StateObserver {
    private final BackgroundTaskService bgTaskService;
    private final AtomicBoolean installed;
    private final ReentrantLock lock;
    private final Logger logger;
    private final File reportDirectory;

    public NativeBridge(BackgroundTaskService bgTaskService) {
        i.h(bgTaskService, "bgTaskService");
        this.bgTaskService = bgTaskService;
        this.lock = new ReentrantLock();
        this.installed = new AtomicBoolean(false);
        File nativeReportPath = NativeInterface.getNativeReportPath();
        i.c(nativeReportPath, "NativeInterface.getNativeReportPath()");
        this.reportDirectory = nativeReportPath;
        Logger logger = NativeInterface.getLogger();
        i.c(logger, "NativeInterface.getLogger()");
        this.logger = logger;
    }

    private final void deliverPendingReports() {
        final e eVar = new e(".*\\.crash$");
        this.lock.lock();
        try {
            try {
                File file = this.reportDirectory;
                if (file.exists()) {
                    File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bugsnag.android.ndk.NativeBridge$deliverPendingReports$fileList$1
                        @Override // java.io.FileFilter
                        public final boolean accept(File it) {
                            e eVar2 = e.this;
                            i.c(it, "it");
                            String name = it.getName();
                            i.c(name, "it.name");
                            return eVar2.a(name);
                        }
                    });
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            i.c(file2, "file");
                            String absolutePath = file2.getAbsolutePath();
                            i.c(absolutePath, "file.absolutePath");
                            deliverReportAtPath(absolutePath);
                        }
                    }
                } else {
                    this.logger.w("Payload directory does not exist, cannot read pending reports");
                }
            } catch (Exception e10) {
                this.logger.w("Failed to parse/write pending reports: " + e10);
            }
        } finally {
            this.lock.unlock();
        }
    }

    private final void handleAddMetadata(StateEvent.AddMetadata addMetadata) {
        if (addMetadata.key != null) {
            Object makeSafe = OpaqueValue.Companion.makeSafe(addMetadata.value);
            if (makeSafe instanceof String) {
                String str = addMetadata.section;
                String str2 = addMetadata.key;
                if (str2 != null) {
                    addMetadataString(str, str2, makeSafe((String) makeSafe));
                } else {
                    i.o();
                    throw null;
                }
            } else if (makeSafe instanceof Boolean) {
                String str3 = addMetadata.section;
                String str4 = addMetadata.key;
                if (str4 != null) {
                    addMetadataBoolean(str3, str4, ((Boolean) makeSafe).booleanValue());
                } else {
                    i.o();
                    throw null;
                }
            } else if (makeSafe instanceof Number) {
                String str5 = addMetadata.section;
                String str6 = addMetadata.key;
                if (str6 != null) {
                    addMetadataDouble(str5, str6, ((Number) makeSafe).doubleValue());
                } else {
                    i.o();
                    throw null;
                }
            } else if (makeSafe instanceof OpaqueValue) {
                String str7 = addMetadata.section;
                String str8 = addMetadata.key;
                if (str8 != null) {
                    addMetadataOpaque(str7, str8, ((OpaqueValue) makeSafe).getJson());
                } else {
                    i.o();
                    throw null;
                }
            }
        }
    }

    private final void handleInstallMessage(StateEvent.Install install) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.installed.get()) {
                Logger logger = this.logger;
                logger.w("Received duplicate setup message with arg: " + install);
            } else {
                File file = this.reportDirectory;
                String reportPath = new File(file, UUID.randomUUID() + ".crash").getAbsolutePath();
                String makeSafe = makeSafe(install.apiKey);
                i.c(reportPath, "reportPath");
                install(makeSafe, reportPath, makeSafe(install.lastRunInfoPath), install.consecutiveLaunchCrashes, install.autoDetectNdkCrashes, Build.VERSION.SDK_INT, is32bit(), install.sendThreads.ordinal());
                this.installed.set(true);
            }
            k kVar = k.f19476a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final boolean is32bit() {
        String[] cpuAbi = NativeInterface.getCpuAbi();
        i.c(cpuAbi, "NativeInterface.getCpuAbi()");
        int length = cpuAbi.length;
        boolean z10 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            String it = cpuAbi[i6];
            i.c(it, "it");
            if (r.J0(it, "64")) {
                z10 = true;
                break;
            }
            i6++;
        }
        return !z10;
    }

    private final boolean isInvalidMessage(Object obj) {
        if (obj == null || !(obj instanceof StateEvent)) {
            return true;
        }
        if (!this.installed.get() && !(obj instanceof StateEvent.Install)) {
            Logger logger = this.logger;
            logger.w("Received message before INSTALL: " + obj);
            return true;
        }
        return false;
    }

    private final String makeSafe(String str) {
        Charset defaultCharset = Charset.defaultCharset();
        i.c(defaultCharset, "Charset.defaultCharset()");
        if (str != null) {
            byte[] bytes = str.getBytes(defaultCharset);
            i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            return new String(bytes, a.f16927b);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final Map<String, Object> makeSafeMetadata(Map<String, ? extends Object> map) {
        if (map.isEmpty()) {
            return map;
        }
        return new NativeBridge$makeSafeMetadata$1(map);
    }

    public final native void addBreadcrumb(String str, String str2, String str3, Object obj);

    public final native void addFeatureFlag(String str, String str2);

    public final native void addHandledEvent();

    public final native void addMetadataBoolean(String str, String str2, boolean z10);

    public final native void addMetadataDouble(String str, String str2, double d10);

    public final native void addMetadataOpaque(String str, String str2, String str3);

    public final native void addMetadataString(String str, String str2, String str3);

    public final native void addUnhandledEvent();

    public final native void clearFeatureFlag(String str);

    public final native void clearFeatureFlags();

    public final native void clearMetadataTab(String str);

    public final native void deliverReportAtPath(String str);

    public final native Map<String, Integer> getCurrentCallbackSetCounts();

    public final native Map<String, Boolean> getCurrentNativeApiCallUsage();

    public final native long getSignalUnwindStackFunction();

    public final native void initCallbackCounts(Map<String, Integer> map);

    public final native void install(String str, String str2, String str3, int i6, boolean z10, int i10, boolean z11, int i11);

    public final native void notifyAddCallback(String str);

    public final native void notifyRemoveCallback(String str);

    @Override // com.bugsnag.android.internal.StateObserver
    public void onStateChange(StateEvent event) {
        String str;
        i.h(event, "event");
        if (isInvalidMessage(event)) {
            return;
        }
        if (event instanceof StateEvent.Install) {
            handleInstallMessage((StateEvent.Install) event);
        } else if (i.b(event, StateEvent.DeliverPending.INSTANCE)) {
            deliverPendingReports();
        } else if (event instanceof StateEvent.AddMetadata) {
            handleAddMetadata((StateEvent.AddMetadata) event);
        } else if (event instanceof StateEvent.ClearMetadataSection) {
            clearMetadataTab(makeSafe(((StateEvent.ClearMetadataSection) event).section));
        } else {
            String str2 = "";
            if (event instanceof StateEvent.ClearMetadataValue) {
                StateEvent.ClearMetadataValue clearMetadataValue = (StateEvent.ClearMetadataValue) event;
                String makeSafe = makeSafe(clearMetadataValue.section);
                String str3 = clearMetadataValue.key;
                if (str3 != null) {
                    str2 = str3;
                }
                removeMetadata(makeSafe, makeSafe(str2));
            } else if (event instanceof StateEvent.AddBreadcrumb) {
                StateEvent.AddBreadcrumb addBreadcrumb = (StateEvent.AddBreadcrumb) event;
                addBreadcrumb(makeSafe(addBreadcrumb.message), makeSafe(addBreadcrumb.type.toString()), makeSafe(addBreadcrumb.timestamp), makeSafeMetadata(addBreadcrumb.metadata));
            } else if (i.b(event, StateEvent.NotifyHandled.INSTANCE)) {
                addHandledEvent();
            } else if (i.b(event, StateEvent.NotifyUnhandled.INSTANCE)) {
                addUnhandledEvent();
            } else if (i.b(event, StateEvent.PauseSession.INSTANCE)) {
                pausedSession();
            } else if (event instanceof StateEvent.StartSession) {
                StateEvent.StartSession startSession = (StateEvent.StartSession) event;
                startedSession(makeSafe(startSession.f5918id), makeSafe(startSession.startedAt), startSession.handledCount, startSession.getUnhandledCount());
            } else if (event instanceof StateEvent.UpdateContext) {
                String str4 = ((StateEvent.UpdateContext) event).context;
                if (str4 != null) {
                    str2 = str4;
                }
                updateContext(makeSafe(str2));
            } else if (event instanceof StateEvent.UpdateInForeground) {
                StateEvent.UpdateInForeground updateInForeground = (StateEvent.UpdateInForeground) event;
                boolean z10 = updateInForeground.inForeground;
                String contextActivity = updateInForeground.getContextActivity();
                if (contextActivity != null) {
                    str2 = contextActivity;
                }
                updateInForeground(z10, makeSafe(str2));
            } else if (event instanceof StateEvent.UpdateLastRunInfo) {
                updateLastRunInfo(((StateEvent.UpdateLastRunInfo) event).consecutiveLaunchCrashes);
            } else if (event instanceof StateEvent.UpdateIsLaunching) {
                StateEvent.UpdateIsLaunching updateIsLaunching = (StateEvent.UpdateIsLaunching) event;
                updateIsLaunching(updateIsLaunching.isLaunching);
                if (!updateIsLaunching.isLaunching) {
                    BackgroundTaskService backgroundTaskService = this.bgTaskService;
                    TaskType taskType = TaskType.DEFAULT;
                    final NativeBridge$onStateChange$1 nativeBridge$onStateChange$1 = new NativeBridge$onStateChange$1(this);
                    backgroundTaskService.submitTask(taskType, new Runnable() { // from class: com.bugsnag.android.ndk.NativeBridge$sam$java_lang_Runnable$0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            i.c(ss.a.this.invoke(), "invoke(...)");
                        }
                    });
                }
            } else if (event instanceof StateEvent.UpdateOrientation) {
                String str5 = ((StateEvent.UpdateOrientation) event).orientation;
                if (str5 != null) {
                    str2 = str5;
                }
                updateOrientation(str2);
            } else if (event instanceof StateEvent.UpdateUser) {
                StateEvent.UpdateUser updateUser = (StateEvent.UpdateUser) event;
                String id2 = updateUser.user.getId();
                if (id2 == null) {
                    id2 = "";
                }
                updateUserId(makeSafe(id2));
                String name = updateUser.user.getName();
                if (name == null) {
                    name = "";
                }
                updateUserName(makeSafe(name));
                String email = updateUser.user.getEmail();
                if (email != null) {
                    str2 = email;
                }
                updateUserEmail(makeSafe(str2));
            } else if (event instanceof StateEvent.UpdateMemoryTrimEvent) {
                StateEvent.UpdateMemoryTrimEvent updateMemoryTrimEvent = (StateEvent.UpdateMemoryTrimEvent) event;
                updateLowMemory(updateMemoryTrimEvent.isLowMemory, updateMemoryTrimEvent.memoryTrimLevelDescription);
            } else if (event instanceof StateEvent.AddFeatureFlag) {
                StateEvent.AddFeatureFlag addFeatureFlag = (StateEvent.AddFeatureFlag) event;
                String makeSafe2 = makeSafe(addFeatureFlag.name);
                String str6 = addFeatureFlag.variant;
                if (str6 != null) {
                    str = makeSafe(str6);
                } else {
                    str = null;
                }
                addFeatureFlag(makeSafe2, str);
            } else if (event instanceof StateEvent.ClearFeatureFlag) {
                clearFeatureFlag(makeSafe(((StateEvent.ClearFeatureFlag) event).name));
            } else if (event instanceof StateEvent.ClearFeatureFlags) {
                clearFeatureFlags();
            }
        }
    }

    public final native void pausedSession();

    public final native void refreshSymbolTable();

    public final native void removeMetadata(String str, String str2);

    public final native void setInternalMetricsEnabled(boolean z10);

    public final native void setStaticJsonData(String str);

    public final native void startedSession(String str, String str2, int i6, int i10);

    public final native void updateContext(String str);

    public final native void updateInForeground(boolean z10, String str);

    public final native void updateIsLaunching(boolean z10);

    public final native void updateLastRunInfo(int i6);

    public final native void updateLowMemory(boolean z10, String str);

    public final native void updateOrientation(String str);

    public final native void updateUserEmail(String str);

    public final native void updateUserId(String str);

    public final native void updateUserName(String str);
}
