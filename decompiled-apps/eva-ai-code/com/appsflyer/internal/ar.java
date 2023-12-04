package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.an;
import com.appsflyer.internal.dd;
import com.ifriend.analytics.AnalyticsConstants;
import io.sentry.protocol.OperatingSystem;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ar extends cm {
    public static long onInstallConversionDataLoadedNative = 0;
    private static String onResponseErrorNative = "https://%sdlsdk.%s/v1.0/android/";
    private final List<dd> onAppOpenAttribution;
    public final cl onAppOpenAttributionNative;
    private boolean onAttributionFailure;
    public int onAttributionFailureNative;
    private int onConversionDataFail;
    private int onDeepLinking;
    private final CountDownLatch onResponseNative;

    public ar(Context context, cl clVar) {
        super(null, onResponseErrorNative, Boolean.FALSE, Boolean.TRUE, null, context);
        this.onAppOpenAttribution = new ArrayList();
        this.onResponseNative = new CountDownLatch(1);
        this.onAppOpenAttributionNative = clVar;
    }

    private boolean AFKeystoreWrapper() {
        List list = (List) this.AFInAppEventType.get("referrers");
        return (list != null ? list.size() : 0) < this.onDeepLinking && !this.AFInAppEventType.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AFInAppEventParameterName(Context context) {
        HashMap hashMap;
        String[] strArr;
        this.onAttributionFailureNative++;
        StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onAttributionFailureNative);
        AFLogger.AFInAppEventParameterName(sb.toString());
        if (this.onAttributionFailureNative == 1) {
            ac AFInAppEventParameterName = ac.AFInAppEventParameterName();
            this.AFInAppEventType.put("is_first", Boolean.valueOf(ac.AFKeystoreWrapper(context)));
            Map<String, Object> map = this.AFInAppEventType;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            map.put("lang", sb2.toString());
            this.AFInAppEventType.put(OperatingSystem.TYPE, Build.VERSION.RELEASE);
            this.AFInAppEventType.put("type", Build.MODEL);
            this.AFInAppEventType.put("request_id", AFInAppEventParameterName.getAppsFlyerUID(context));
            y yVar = AFInAppEventParameterName.getLevel;
            if (yVar != null && (strArr = yVar.AFInAppEventParameterName) != null) {
                this.AFInAppEventType.put("sharing_filter", strArr);
            }
            Map<String, Object> valueOf = valueOf(ab.AFKeystoreWrapper(context, new HashMap()));
            Map<String, Object> valueOf2 = valueOf(ab.AFInAppEventType(context));
            if (valueOf != null) {
                this.AFInAppEventType.put("gaid", valueOf);
            }
            if (valueOf2 != null) {
                this.AFInAppEventType.put("oaid", valueOf2);
            }
        }
        Map<String, Object> map2 = this.AFInAppEventType;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put(AnalyticsConstants.TIMESTAMP, simpleDateFormat.format(new Date(currentTimeMillis)));
        this.AFInAppEventType.put("request_count", Integer.valueOf(this.onAttributionFailureNative));
        ArrayList arrayList = new ArrayList();
        for (dd ddVar : this.onAppOpenAttribution) {
            if (ddVar.AFInAppEventParameterName == dd.d.FINISHED) {
                hashMap = new HashMap();
                String str = (String) ddVar.AFInAppEventType.get("referrer");
                if (str != null) {
                    hashMap.put("source", (String) ddVar.AFInAppEventType.get("source"));
                    hashMap.put("value", str);
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
            this.AFInAppEventType.put("referrers", arrayList);
        }
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        String AFInAppEventParameterName2 = ac.AFInAppEventParameterName().AFInAppEventParameterName(context);
        String concat = (AFInAppEventParameterName2 == null || AFInAppEventParameterName2.trim().isEmpty()) ? "" : "-".concat(String.valueOf(AFInAppEventParameterName2));
        Uri.Builder buildUpon = Uri.parse(String.format(onResponseErrorNative, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName())).buildUpon();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append(concat);
        Uri.Builder appendPath = buildUpon.appendPath(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.AFInAppEventType.get(AnalyticsConstants.TIMESTAMP));
        sb4.append(devKey);
        AFInAppEventType(appendPath.appendQueryParameter("af_sig", ag.valueOf(sb4.toString(), devKey)).appendQueryParameter("sdk_version", ac.AFInAppEventType).build().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.ar$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[dd.d.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[dd.d.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[dd.d.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void values(dd ddVar) {
        if (AFInAppEventType(ddVar)) {
            this.onAppOpenAttribution.add(ddVar);
            this.onResponseNative.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(ddVar.getClass().getSimpleName());
            AFLogger.AFInAppEventParameterName(sb.toString());
            return;
        }
        int i = this.onConversionDataFail + 1;
        this.onConversionDataFail = i;
        if (i == this.onDeepLinking) {
            this.onResponseNative.countDown();
        }
    }

    private static boolean AFInAppEventType(dd ddVar) {
        Long l = (Long) ddVar.AFInAppEventType.get("click_ts");
        return l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    private Map<String, Object> valueOf(final g gVar) {
        Boolean bool;
        boolean z = false;
        if (gVar != null && gVar.values != null && ((bool = gVar.AFKeystoreWrapper) == null || !bool.booleanValue())) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.ar.1
                {
                    put("type", "unhashed");
                    put("value", g.this.values);
                }
            };
        }
        return null;
    }

    static /* synthetic */ void valueOf(ar arVar) {
        dd[] valueOf;
        ArrayList<dd> arrayList = new ArrayList();
        for (dd ddVar : ac.AFInAppEventParameterName().valueOf()) {
            if (ddVar != null && ddVar.AFInAppEventParameterName != dd.d.NOT_STARTED) {
                arrayList.add(ddVar);
            }
        }
        arVar.onDeepLinking = arrayList.size();
        for (final dd ddVar2 : arrayList) {
            int i = AnonymousClass2.AFInAppEventParameterName[ddVar2.AFInAppEventParameterName.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(ddVar2.AFInAppEventType.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.AFInAppEventParameterName(sb.toString());
                arVar.values(ddVar2);
            } else if (i == 2) {
                ddVar2.addObserver(new Observer() { // from class: com.appsflyer.internal.ar.5
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb2 = new StringBuilder("[DDL] ");
                        sb2.append(ddVar2.AFInAppEventType.get("source"));
                        sb2.append(" referrer collected via observer");
                        AFLogger.AFInAppEventParameterName(sb2.toString());
                        ar.this.values((dd) observable);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0171, code lost:
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ DeepLinkResult AFInAppEventType(ar arVar, Context context) throws IOException, JSONException, InterruptedException {
        DeepLink AFInAppEventParameterName;
        while (true) {
            cl clVar = arVar.onAppOpenAttributionNative;
            int i = arVar.onAttributionFailureNative;
            if (i <= 0 || i > 2) {
                AFLogger.values(new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                clVar.AFVersionDeclaration[i2] = System.currentTimeMillis();
                if (i2 == 0) {
                    if (clVar.AppsFlyer2dXConversionCallback != 0) {
                        clVar.AFKeystoreWrapper.put("from_fg", Long.valueOf(clVar.AFVersionDeclaration[i2] - clVar.AppsFlyer2dXConversionCallback));
                        clVar.valueOf.AFInAppEventParameterName("ddl", new JSONObject((Map<?, ?>) clVar.AFKeystoreWrapper).toString());
                    } else {
                        AFLogger.values("Metrics: fg ts is missing");
                    }
                }
            }
            HttpURLConnection values = new an.c(arVar).values();
            cl clVar2 = arVar.onAppOpenAttributionNative;
            int i3 = arVar.onAttributionFailureNative;
            if (i3 <= 0 || i3 > 2) {
                AFLogger.values(new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i3))));
            } else {
                int i4 = i3 - 1;
                clVar2.init[i4] = System.currentTimeMillis();
                if (clVar2.AFVersionDeclaration[i4] != 0) {
                    clVar2.AFLogger$LogLevel[i4] = clVar2.init[i4] - clVar2.AFVersionDeclaration[i4];
                    clVar2.AFKeystoreWrapper.put("net", clVar2.AFLogger$LogLevel);
                    clVar2.valueOf.AFInAppEventParameterName("ddl", new JSONObject((Map<?, ?>) clVar2.AFKeystoreWrapper).toString());
                } else {
                    StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                    sb.append(i4);
                    sb.append("] ts is missing");
                    AFLogger.values(sb.toString());
                }
            }
            if (values.getResponseCode() != 200) {
                StringBuilder sb2 = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb2.append(values.getResponseCode());
                AFLogger.AFInAppEventParameterName(sb2.toString());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
            ac.AFInAppEventParameterName();
            JSONObject jSONObject = new JSONObject(ac.AFInAppEventParameterName(values));
            arVar.onAttributionFailure = jSONObject.optBoolean("is_second_ping", true);
            if (jSONObject.optBoolean("found")) {
                AFInAppEventParameterName = DeepLink.AFInAppEventParameterName(jSONObject.optJSONObject("click_event"));
                AFInAppEventParameterName.valueOf.put("is_deferred", true);
            } else {
                AFInAppEventParameterName = null;
            }
            if (AFInAppEventParameterName != null) {
                return new DeepLinkResult(AFInAppEventParameterName, null);
            }
            if (arVar.onAttributionFailureNative > 1 || !arVar.AFKeystoreWrapper() || !arVar.onAttributionFailure) {
                break;
            }
            AFLogger.AFInAppEventParameterName("[DDL] Waiting for referrers...");
            arVar.onResponseNative.await();
            cl clVar3 = arVar.onAppOpenAttributionNative;
            long currentTimeMillis = System.currentTimeMillis();
            if (clVar3.init[0] != 0) {
                clVar3.AFKeystoreWrapper.put("rfr_wait", Long.valueOf(currentTimeMillis - clVar3.init[0]));
                clVar3.valueOf.AFInAppEventParameterName("ddl", new JSONObject((Map<?, ?>) clVar3.AFKeystoreWrapper).toString());
            } else {
                AFLogger.values("Metrics: ddlEnd[0] ts is missing");
            }
            if (arVar.onConversionDataFail != arVar.onDeepLinking) {
                arVar.AFInAppEventParameterName(context);
            } else {
                return new DeepLinkResult(null, null);
            }
        }
    }
}
