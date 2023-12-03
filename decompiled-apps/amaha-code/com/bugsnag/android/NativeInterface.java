package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.JsonHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();
    private static Client client;

    public static void addMetadata(String str, String str2, Object obj) {
        getClient().addMetadata(str, str2, obj);
    }

    public static void clearMetadata(String str, String str2) {
        if (str2 == null) {
            getClient().clearMetadata(str);
        } else {
            getClient().clearMetadata(str, str2);
        }
    }

    private static Event createEmptyEvent() {
        Client client2 = getClient();
        return new Event(new EventInternal(null, client2.getConfig(), SeverityReason.newInstance("handledException"), client2.getMetadataState().getMetadata().copy()), client2.getLogger());
    }

    public static Event createEvent(Throwable th2, Client client2, SeverityReason severityReason) {
        return new Event(th2, client2.getConfig(), severityReason, client2.getMetadataState().getMetadata(), client2.getFeatureFlagState().getFeatureFlags(), client2.logger);
    }

    private static void deepMerge(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if ((value instanceof Map) && (obj instanceof Map)) {
                deepMerge((Map) value, (Map) obj);
            } else if ((value instanceof Collection) && (obj instanceof Collection)) {
                ((Collection) obj).addAll((Collection) value);
            } else {
                map2.put(key, value);
            }
        }
    }

    public static void deliverReport(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, boolean z10) {
        String str2;
        if (bArr3 != null) {
            JsonHelper jsonHelper = JsonHelper.INSTANCE;
            Map<? super String, ? extends Object> deserialize = jsonHelper.deserialize(new ByteArrayInputStream(bArr2));
            deepMerge(jsonHelper.deserialize(new ByteArrayInputStream(bArr3)), deserialize);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            jsonHelper.serialize(deserialize, byteArrayOutputStream);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        String str3 = new String(bArr2, UTF8Charset);
        if (bArr == null) {
            str2 = null;
        } else {
            str2 = new String(bArr, UTF8Charset);
        }
        Client client2 = getClient();
        ImmutableConfig config = client2.getConfig();
        if (str2 == null || str2.length() == 0 || !config.shouldDiscardByReleaseStage()) {
            EventStore eventStore = client2.getEventStore();
            String ndkFilename = eventStore.getNdkFilename(str3, str);
            if (z10) {
                ndkFilename = ndkFilename.replace(".json", "startupcrash.json");
            }
            eventStore.enqueueContentForDelivery(str3, ndkFilename);
        }
    }

    public static Map<String, Object> getApp() {
        HashMap hashMap = new HashMap();
        AppDataCollector appDataCollector = getClient().getAppDataCollector();
        AppWithState generateAppWithState = appDataCollector.generateAppWithState();
        hashMap.put("version", generateAppWithState.getVersion());
        hashMap.put("releaseStage", generateAppWithState.getReleaseStage());
        hashMap.put("id", generateAppWithState.getId());
        hashMap.put("type", generateAppWithState.getType());
        hashMap.put("buildUUID", generateAppWithState.getBuildUuid());
        hashMap.put("duration", generateAppWithState.getDuration());
        hashMap.put("durationInForeground", generateAppWithState.getDurationInForeground());
        hashMap.put("versionCode", generateAppWithState.getVersionCode());
        hashMap.put("inForeground", generateAppWithState.getInForeground());
        hashMap.put("isLaunching", generateAppWithState.isLaunching());
        hashMap.put("binaryArch", generateAppWithState.getBinaryArch());
        hashMap.putAll(appDataCollector.getAppDataMetadata());
        return hashMap;
    }

    public static String getAppVersion() {
        return getClient().getConfig().getAppVersion();
    }

    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().getBreadcrumbs();
    }

    private static Client getClient() {
        Client client2 = client;
        if (client2 != null) {
            return client2;
        }
        return Bugsnag.getClient();
    }

    public static String getContext() {
        return getClient().getContext();
    }

    public static String[] getCpuAbi() {
        return getClient().getDeviceDataCollector().getCpuAbi();
    }

    public static Session getCurrentSession() {
        return getClient().sessionTracker.getCurrentSession();
    }

    public static Map<String, Object> getDevice() {
        DeviceDataCollector deviceDataCollector = getClient().getDeviceDataCollector();
        HashMap hashMap = new HashMap(deviceDataCollector.getDeviceMetadata());
        DeviceWithState generateDeviceWithState = deviceDataCollector.generateDeviceWithState(new Date().getTime());
        hashMap.put("freeDisk", generateDeviceWithState.getFreeDisk());
        hashMap.put("freeMemory", generateDeviceWithState.getFreeMemory());
        hashMap.put("orientation", generateDeviceWithState.getOrientation());
        hashMap.put("time", generateDeviceWithState.getTime());
        hashMap.put("cpuAbi", generateDeviceWithState.getCpuAbi());
        hashMap.put("jailbroken", generateDeviceWithState.getJailbroken());
        hashMap.put("id", generateDeviceWithState.getId());
        hashMap.put("locale", generateDeviceWithState.getLocale());
        hashMap.put("manufacturer", generateDeviceWithState.getManufacturer());
        hashMap.put("model", generateDeviceWithState.getModel());
        hashMap.put("osName", generateDeviceWithState.getOsName());
        hashMap.put("osVersion", generateDeviceWithState.getOsVersion());
        hashMap.put("runtimeVersions", generateDeviceWithState.getRuntimeVersions());
        hashMap.put("totalMemory", generateDeviceWithState.getTotalMemory());
        return hashMap;
    }

    public static Collection<String> getEnabledReleaseStages() {
        return getClient().getConfig().getEnabledReleaseStages();
    }

    public static String getEndpoint() {
        return getClient().getConfig().getEndpoints().getNotify();
    }

    public static LastRunInfo getLastRunInfo() {
        return getClient().getLastRunInfo();
    }

    public static Logger getLogger() {
        return getClient().getConfig().getLogger();
    }

    public static Map<String, Object> getMetadata() {
        return getClient().getMetadata();
    }

    public static File getNativeReportPath() {
        return getNativeReportPath(getPersistenceDirectory());
    }

    private static File getPersistenceDirectory() {
        return getClient().getConfig().getPersistenceDirectory().getValue();
    }

    public static String getReleaseStage() {
        return getClient().getConfig().getReleaseStage();
    }

    public static String getSessionEndpoint() {
        return getClient().getConfig().getEndpoints().getSessions();
    }

    public static Map<String, String> getUser() {
        HashMap hashMap = new HashMap();
        User user = getClient().getUser();
        hashMap.put("id", user.getId());
        hashMap.put(SessionManager.KEY_NAME, user.getName());
        hashMap.put(SessionManager.KEY_EMAIL, user.getEmail());
        return hashMap;
    }

    public static boolean isDiscardErrorClass(String str) {
        return getClient().getConfig().getDiscardClasses().contains(str);
    }

    public static void leaveBreadcrumb(String str, BreadcrumbType breadcrumbType) {
        if (str == null) {
            return;
        }
        getClient().leaveBreadcrumb(str, new HashMap(), breadcrumbType);
    }

    public static void markLaunchCompleted() {
        getClient().markLaunchCompleted();
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (bArr == null || bArr2 == null || stackTraceElementArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, stackTraceElementArr);
    }

    public static void pauseSession() {
        getClient().pauseSession();
    }

    public static void registerSession(long j10, String str, int i6, int i10) {
        Date date;
        Client client2 = getClient();
        User user = client2.getUser();
        if (j10 > 0) {
            date = new Date(j10);
        } else {
            date = null;
        }
        client2.getSessionTracker().registerExistingSession(date, str, user, i6, i10);
    }

    public static boolean resumeSession() {
        return getClient().resumeSession();
    }

    public static void setAutoDetectAnrs(boolean z10) {
        getClient().setAutoDetectAnrs(z10);
    }

    public static void setAutoNotify(boolean z10) {
        getClient().setAutoNotify(z10);
    }

    public static void setBinaryArch(String str) {
        getClient().setBinaryArch(str);
    }

    public static void setClient(Client client2) {
        client = client2;
    }

    public static void setContext(String str) {
        getClient().setContext(str);
    }

    public static void setUser(String str, String str2, String str3) {
        getClient().setUser(str, str2, str3);
    }

    public static void startSession() {
        getClient().startSession();
    }

    public static void addMetadata(String str, Map<String, ?> map) {
        getClient().addMetadata(str, map);
    }

    private static File getNativeReportPath(File file) {
        return new File(file, "bugsnag-native");
    }

    public static void leaveBreadcrumb(byte[] bArr, BreadcrumbType breadcrumbType) {
        if (bArr == null) {
            return;
        }
        getClient().leaveBreadcrumb(new String(bArr, UTF8Charset), new HashMap(), breadcrumbType);
    }

    public static void setUser(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        setUser(bArr == null ? null : new String(bArr, UTF8Charset), bArr2 == null ? null : new String(bArr2, UTF8Charset), bArr3 != null ? new String(bArr3, UTF8Charset) : null);
    }

    public static void leaveBreadcrumb(String str, String str2, Map<String, Object> map) {
        getClient().leaveBreadcrumb(str, map, BreadcrumbType.valueOf(str2.toUpperCase(Locale.US)));
    }

    public static void notify(final String str, final String str2, final Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (getClient().getConfig().shouldDiscardError(str)) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException();
        runtimeException.setStackTrace(stackTraceElementArr);
        getClient().notify(runtimeException, new OnErrorCallback() { // from class: com.bugsnag.android.NativeInterface.1
            @Override // com.bugsnag.android.OnErrorCallback
            public boolean onError(Event event) {
                event.updateSeverityInternal(Severity.this);
                List<Error> errors = event.getErrors();
                Error error = event.getErrors().get(0);
                if (!errors.isEmpty()) {
                    error.setErrorClass(str);
                    error.setErrorMessage(str2);
                    for (Error error2 : errors) {
                        error2.setType(ErrorType.C);
                    }
                    return true;
                }
                return true;
            }
        });
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        if (bArr == null || bArr2 == null || nativeStackframeArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, nativeStackframeArr);
    }

    public static void notify(String str, String str2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        Client client2 = getClient();
        if (client2.getConfig().shouldDiscardError(str)) {
            return;
        }
        Event createEmptyEvent = createEmptyEvent();
        createEmptyEvent.updateSeverityInternal(severity);
        ArrayList arrayList = new ArrayList(nativeStackframeArr.length);
        for (NativeStackframe nativeStackframe : nativeStackframeArr) {
            arrayList.add(new Stackframe(nativeStackframe));
        }
        createEmptyEvent.getErrors().add(new Error(new ErrorInternal(str, str2, new Stacktrace(arrayList), ErrorType.C), client2.getLogger()));
        getClient().populateAndNotifyAndroidEvent(createEmptyEvent, null);
    }
}
