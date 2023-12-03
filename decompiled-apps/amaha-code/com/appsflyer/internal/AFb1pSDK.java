package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1hSDK;
import com.google.firebase.database.core.ServerValues;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1pSDK extends AFe1wSDK {
    private static String AFVersionDeclaration = "https://%sdlsdk.%s/v1.0/android/";
    public static long init;
    private final CountDownLatch AFLogger$LogLevel;
    private final ExecutorService AppsFlyer2dXConversionCallback;
    private final List<AFe1hSDK> getLevel;
    private final AFb1aSDK onAppOpenAttributionNative;
    private final AFd1bSDK onAttributionFailureNative;
    private int onConversionDataFail;
    private boolean onConversionDataSuccess;
    private final AFe1iSDK onInstallConversionDataLoadedNative;
    private final AFd1gSDK onInstallConversionFailureNative;
    private int onResponseErrorNative;
    private int onResponseNative;

    /* renamed from: com.appsflyer.internal.AFb1pSDK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFe1hSDK.AFa1zSDK.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AFe1hSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AFe1hSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFb1pSDK(Context context, AFc1zSDK aFc1zSDK) {
        super(null, AFVersionDeclaration, Boolean.FALSE, Boolean.TRUE, null, context);
        this.getLevel = new ArrayList();
        this.AFLogger$LogLevel = new CountDownLatch(1);
        this.onAttributionFailureNative = aFc1zSDK.afInfoLog();
        this.onAppOpenAttributionNative = aFc1zSDK.AFInAppEventParameterName();
        this.onInstallConversionFailureNative = aFc1zSDK.AFVersionDeclaration();
        this.onInstallConversionDataLoadedNative = aFc1zSDK.init();
        this.AppsFlyer2dXConversionCallback = aFc1zSDK.values();
    }

    public static /* synthetic */ void AFInAppEventParameterName(AFb1pSDK aFb1pSDK) {
        AFe1hSDK[] AFInAppEventType;
        ArrayList arrayList = new ArrayList();
        for (AFe1hSDK aFe1hSDK : aFb1pSDK.onInstallConversionDataLoadedNative.AFInAppEventType()) {
            if (aFe1hSDK != null && aFe1hSDK.afRDLog != AFe1hSDK.AFa1zSDK.NOT_STARTED) {
                arrayList.add(aFe1hSDK);
            }
        }
        aFb1pSDK.onConversionDataFail = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final AFe1hSDK aFe1hSDK2 = (AFe1hSDK) it.next();
            int i6 = AnonymousClass1.AFKeystoreWrapper[aFe1hSDK2.afRDLog.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    aFe1hSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFb1pSDK.2
                        @Override // java.util.Observer
                        public final void update(Observable observable, Object obj) {
                            StringBuilder sb2 = new StringBuilder("[DDL] ");
                            sb2.append(aFe1hSDK2.AFInAppEventType.get("source"));
                            sb2.append(" referrer collected via observer");
                            AFLogger.afDebugLog(sb2.toString());
                            AFb1pSDK.this.valueOf((AFe1hSDK) observable);
                        }
                    });
                }
            } else {
                StringBuilder sb2 = new StringBuilder("[DDL] ");
                sb2.append(aFe1hSDK2.AFInAppEventType.get("source"));
                sb2.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb2.toString());
                aFb1pSDK.valueOf(aFe1hSDK2);
            }
        }
    }

    private boolean afWarnLog() {
        int i6;
        List list = (List) this.values.get("referrers");
        if (list != null) {
            i6 = list.size();
        } else {
            i6 = 0;
        }
        if (i6 >= this.onConversionDataFail || this.values.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getLevel() {
        String str;
        HashMap hashMap;
        boolean z10;
        String[] strArr;
        this.onResponseErrorNative++;
        StringBuilder sb2 = new StringBuilder("[DDL] Preparing request ");
        sb2.append(this.onResponseErrorNative);
        AFLogger.afDebugLog(sb2.toString());
        if (this.onResponseErrorNative == 1) {
            AFb1xSDK AFKeystoreWrapper = AFb1xSDK.AFKeystoreWrapper();
            Map<String, Object> map = this.values;
            if (this.onAppOpenAttributionNative.values.valueOf("appsFlyerCount") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            map.put("is_first", Boolean.valueOf(z10));
            Map<String, Object> map2 = this.values;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Locale.getDefault().getLanguage());
            sb3.append("-");
            sb3.append(Locale.getDefault().getCountry());
            map2.put("lang", sb3.toString());
            this.values.put("os", Build.VERSION.RELEASE);
            this.values.put("type", Build.MODEL);
            this.values.put("request_id", AFb1uSDK.values(new WeakReference(this.onAppOpenAttributionNative.AFKeystoreWrapper.values)));
            AFa1fSDK aFa1fSDK = AFKeystoreWrapper.AFLogger;
            if (aFa1fSDK != null && (strArr = aFa1fSDK.valueOf) != null) {
                this.values.put("sharing_filter", strArr);
            }
            Map<String, Object> values = values(AFb1zSDK.AFKeystoreWrapper(this.onAppOpenAttributionNative.AFKeystoreWrapper.values, new HashMap()));
            Map<String, Object> values2 = values(AFb1zSDK.values(this.onAppOpenAttributionNative.AFKeystoreWrapper.values));
            if (values != null) {
                this.values.put("gaid", values);
            }
            if (values2 != null) {
                this.values.put("oaid", values2);
            }
        }
        Map<String, Object> map3 = this.values;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        map3.put(ServerValues.NAME_OP_TIMESTAMP, simpleDateFormat.format(new Date(currentTimeMillis)));
        this.values.put("request_count", Integer.valueOf(this.onResponseErrorNative));
        ArrayList arrayList = new ArrayList();
        for (AFe1hSDK aFe1hSDK : this.getLevel) {
            if (aFe1hSDK.afRDLog == AFe1hSDK.AFa1zSDK.FINISHED) {
                hashMap = new HashMap();
                String str2 = (String) aFe1hSDK.AFInAppEventType.get("referrer");
                if (str2 != null) {
                    hashMap.put("source", (String) aFe1hSDK.AFInAppEventType.get("source"));
                    hashMap.put("value", str2);
                    if (hashMap == null) {
                        arrayList.add(hashMap);
                    }
                }
            }
            hashMap = null;
            if (hashMap == null) {
            }
        }
        if (!arrayList.isEmpty()) {
            this.values.put("referrers", arrayList);
        }
        String str3 = this.onInstallConversionFailureNative.values;
        String packageName = this.onAppOpenAttributionNative.AFKeystoreWrapper.values.getPackageName();
        String AFInAppEventType = this.onAppOpenAttributionNative.AFInAppEventType();
        if (AFInAppEventType != null && !AFInAppEventType.trim().isEmpty()) {
            str = "-".concat(AFInAppEventType);
        } else {
            str = "";
        }
        Uri.Builder buildUpon = Uri.parse(String.format(AFVersionDeclaration, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName())).buildUpon();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(packageName);
        sb4.append(str);
        Uri.Builder appendPath = buildUpon.appendPath(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.values.get(ServerValues.NAME_OP_TIMESTAMP));
        sb5.append(str3);
        AFKeystoreWrapper(appendPath.appendQueryParameter("af_sig", AFb1tSDK.AFInAppEventType(sb5.toString(), str3)).appendQueryParameter("sdk_version", AFb1xSDK.values).build().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(AFe1hSDK aFe1hSDK) {
        if (AFInAppEventType(aFe1hSDK)) {
            this.getLevel.add(aFe1hSDK);
            this.AFLogger$LogLevel.countDown();
            AFLogger.afDebugLog("[DDL] Added non-organic ".concat(aFe1hSDK.getClass().getSimpleName()));
            return;
        }
        int i6 = this.onResponseNative + 1;
        this.onResponseNative = i6;
        if (i6 == this.onConversionDataFail) {
            this.AFLogger$LogLevel.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DeepLinkResult AFLogger() {
        DeepLinkResult.Error error;
        AFLogger.afDebugLog("[DDL] start");
        FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.AFb1pSDK.3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ DeepLinkResult call() {
                Application application = AFb1pSDK.this.valueOf;
                AFb1pSDK.AFInAppEventParameterName(AFb1pSDK.this);
                AFb1pSDK.this.getLevel();
                return AFb1pSDK.AFKeystoreWrapper(AFb1pSDK.this, application);
            }
        });
        this.AppsFlyer2dXConversionCallback.execute(futureTask);
        try {
            DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(init, TimeUnit.MILLISECONDS);
            this.onAttributionFailureNative.AFInAppEventParameterName(deepLinkResult, init);
            AFb1hSDK.AFInAppEventType(deepLinkResult);
            return deepLinkResult;
        } catch (InterruptedException e10) {
            e = e10;
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            if (!(e.getCause() instanceof IOException)) {
                error = DeepLinkResult.Error.NETWORK;
            } else {
                error = DeepLinkResult.Error.UNEXPECTED;
            }
            DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, error);
            this.onAttributionFailureNative.AFInAppEventParameterName(deepLinkResult2, init);
            AFb1hSDK.AFInAppEventType(deepLinkResult2);
            return deepLinkResult2;
        } catch (ExecutionException e11) {
            e = e11;
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            if (!(e.getCause() instanceof IOException)) {
            }
            DeepLinkResult deepLinkResult22 = new DeepLinkResult(null, error);
            this.onAttributionFailureNative.AFInAppEventParameterName(deepLinkResult22, init);
            AFb1hSDK.AFInAppEventType(deepLinkResult22);
            return deepLinkResult22;
        } catch (TimeoutException unused) {
            StringBuilder sb2 = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
            sb2.append(this.onResponseErrorNative);
            sb2.append(" attempt(s) within ");
            sb2.append(init);
            sb2.append(" milliseconds");
            AFLogger.afDebugLog(sb2.toString());
            DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
            this.onAttributionFailureNative.AFInAppEventParameterName(deepLinkResult3, init);
            AFb1hSDK.AFInAppEventType(deepLinkResult3);
            return deepLinkResult3;
        }
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFc1kSDK values() {
        return AFc1kSDK.DLSDK;
    }

    private static boolean AFInAppEventType(AFe1hSDK aFe1hSDK) {
        Long l2 = (Long) aFe1hSDK.AFInAppEventType.get("click_ts");
        return l2 != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l2.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    private Map<String, Object> values(final AFa1uSDK aFa1uSDK) {
        Boolean bool;
        boolean z10 = false;
        if (aFa1uSDK != null && aFa1uSDK.AFInAppEventParameterName != null && ((bool = aFa1uSDK.values) == null || !bool.booleanValue())) {
            z10 = true;
        }
        if (z10) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFb1pSDK.4
                {
                    put("type", "unhashed");
                    put("value", AFa1uSDK.this.AFInAppEventParameterName);
                }
            };
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ DeepLinkResult AFKeystoreWrapper(AFb1pSDK aFb1pSDK, Context context) {
        DeepLink AFInAppEventType;
        while (true) {
            AFd1bSDK aFd1bSDK = aFb1pSDK.onAttributionFailureNative;
            int i6 = aFb1pSDK.onResponseErrorNative;
            if (i6 > 0 && i6 <= 2) {
                int i10 = i6 - 1;
                aFd1bSDK.AFLogger[i10] = System.currentTimeMillis();
                if (i10 == 0) {
                    long j10 = aFd1bSDK.afRDLog;
                    if (j10 != 0) {
                        aFd1bSDK.valueOf.put("from_fg", Long.valueOf(aFd1bSDK.AFLogger[i10] - j10));
                        aFd1bSDK.AFInAppEventType.valueOf("ddl", new JSONObject(aFd1bSDK.valueOf).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                }
            } else {
                AFLogger.afErrorLog(new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i6))));
            }
            HttpURLConnection valueOf = new AFa1oSDK(aFb1pSDK).valueOf(aFb1pSDK.onInstallConversionFailureNative.values);
            AFd1bSDK aFd1bSDK2 = aFb1pSDK.onAttributionFailureNative;
            int i11 = aFb1pSDK.onResponseErrorNative;
            if (i11 > 0 && i11 <= 2) {
                int i12 = i11 - 1;
                aFd1bSDK2.afDebugLog[i12] = System.currentTimeMillis();
                long j11 = aFd1bSDK2.AFLogger[i12];
                if (j11 != 0) {
                    long[] jArr = aFd1bSDK2.afErrorLog;
                    jArr[i12] = aFd1bSDK2.afDebugLog[i12] - j11;
                    aFd1bSDK2.valueOf.put("net", jArr);
                    aFd1bSDK2.AFInAppEventType.valueOf("ddl", new JSONObject(aFd1bSDK2.valueOf).toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i12);
                    sb2.append("] ts is missing");
                    AFLogger.afInfoLog(sb2.toString());
                }
            } else {
                AFLogger.afErrorLog(new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))));
            }
            if (valueOf.getResponseCode() == 200) {
                JSONObject jSONObject = new JSONObject(AFb1xSDK.valueOf(valueOf));
                aFb1pSDK.onConversionDataSuccess = jSONObject.optBoolean("is_second_ping", true);
                if (jSONObject.optBoolean("found")) {
                    AFInAppEventType = DeepLink.AFInAppEventType(jSONObject.optJSONObject("click_event"));
                    AFInAppEventType.AFKeystoreWrapper.put("is_deferred", true);
                } else {
                    AFInAppEventType = null;
                }
                if (AFInAppEventType != null) {
                    return new DeepLinkResult(AFInAppEventType, null);
                }
                if (aFb1pSDK.onResponseErrorNative > 1 || !aFb1pSDK.afWarnLog() || !aFb1pSDK.onConversionDataSuccess) {
                    break;
                }
                AFLogger.afDebugLog("[DDL] Waiting for referrers...");
                aFb1pSDK.AFLogger$LogLevel.await();
                AFd1bSDK aFd1bSDK3 = aFb1pSDK.onAttributionFailureNative;
                long currentTimeMillis = System.currentTimeMillis();
                long j12 = aFd1bSDK3.afDebugLog[0];
                if (j12 != 0) {
                    aFd1bSDK3.valueOf.put("rfr_wait", Long.valueOf(currentTimeMillis - j12));
                    aFd1bSDK3.AFInAppEventType.valueOf("ddl", new JSONObject(aFd1bSDK3.valueOf).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (aFb1pSDK.onResponseNative == aFb1pSDK.onConversionDataFail) {
                    return new DeepLinkResult(null, null);
                }
                aFb1pSDK.getLevel();
            } else {
                StringBuilder sb3 = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb3.append(valueOf.getResponseCode());
                AFLogger.afDebugLog(sb3.toString());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
    }
}
