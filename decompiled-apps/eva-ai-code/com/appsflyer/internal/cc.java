package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class cc implements Runnable {
    private static String valueOf = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> values = Arrays.asList("googleplay", "playstore", "googleplaystore");
    final ScheduledExecutorService AFInAppEventParameterName;
    private final Application AFInAppEventType;
    private final String AFKeystoreWrapper;
    private final ac AFLogger$LogLevel;
    private final int AFVersionDeclaration;
    private final AtomicInteger AppsFlyer2dXConversionCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cc(ac acVar, Application application, String str) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFInAppEventParameterName = k.values.AFKeystoreWrapper();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = acVar;
        this.AFInAppEventType = application;
        this.AFKeystoreWrapper = str;
        this.AFVersionDeclaration = 0;
    }

    private cc(cc ccVar) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFInAppEventParameterName = k.values.AFKeystoreWrapper();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = ccVar.AFLogger$LogLevel;
        this.AFInAppEventType = ccVar.AFInAppEventType;
        this.AFKeystoreWrapper = ccVar.AFKeystoreWrapper;
        this.AFVersionDeclaration = ccVar.AFVersionDeclaration + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void values(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.AFInAppEventParameterName(sb.toString());
        ac.AFKeystoreWrapper.onConversionDataSuccess(map);
    }

    public static void AFInAppEventParameterName(String str) {
        if (ac.AFKeystoreWrapper != null) {
            AFLogger.AFInAppEventParameterName("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            ac.AFKeystoreWrapper.onConversionDataFail(str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:17|18|(2:20|(10:22|23|24|25|26|(5:62|63|(3:65|66|67)(1:107)|68|(13:70|(1:72)|(1:76)|77|78|(2:80|(1:82)(1:83))|84|(1:86)|87|88|(1:90)(1:105)|91|(2:93|(5:95|96|(1:98)|100|101))))(4:29|(3:58|59|(2:61|34))|33|34)|35|(1:37)|38|39)(1:112))|113|23|24|25|26|(0)|62|63|(0)(0)|68|(0)|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02a9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02ab, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ac, code lost:
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ae, code lost:
        r6 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0165 A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #4 {all -> 0x02ab, blocks: (B:26:0x00fd, B:42:0x0157, B:44:0x0165), top: B:116:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176 A[Catch: all -> 0x02a9, TryCatch #3 {all -> 0x02a9, blocks: (B:46:0x016b, B:48:0x017d, B:50:0x01ad, B:52:0x01bb, B:54:0x01d6, B:56:0x01dc, B:57:0x01e9, B:60:0x01f3, B:62:0x01f9, B:63:0x020d, B:64:0x021f, B:66:0x0225, B:67:0x0238, B:70:0x024a, B:72:0x0255, B:74:0x0259, B:76:0x0261, B:78:0x0277, B:82:0x0284, B:81:0x027f, B:71:0x0250, B:47:0x0176), top: B:114:0x0163, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad A[Catch: all -> 0x02a9, TryCatch #3 {all -> 0x02a9, blocks: (B:46:0x016b, B:48:0x017d, B:50:0x01ad, B:52:0x01bb, B:54:0x01d6, B:56:0x01dc, B:57:0x01e9, B:60:0x01f3, B:62:0x01f9, B:63:0x020d, B:64:0x021f, B:66:0x0225, B:67:0x0238, B:70:0x024a, B:72:0x0255, B:74:0x0259, B:76:0x0261, B:78:0x0277, B:82:0x0284, B:81:0x027f, B:71:0x0250, B:47:0x0176), top: B:114:0x0163, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b6 A[Catch: all -> 0x02e8, TryCatch #2 {all -> 0x02e8, blocks: (B:92:0x02b2, B:94:0x02b6, B:96:0x02cc, B:95:0x02c5), top: B:112:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c5 A[Catch: all -> 0x02e8, TryCatch #2 {all -> 0x02e8, blocks: (B:92:0x02b2, B:94:0x02b6, B:96:0x02cc, B:95:0x02c5), top: B:112:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02da A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Application application;
        String str;
        cl level;
        int responseCode;
        String AFInAppEventParameterName;
        HttpURLConnection httpURLConnection;
        String str2 = this.AFKeystoreWrapper;
        if (str2 == null || str2.length() == 0) {
            AFLogger.AFInAppEventParameterName("[GCD-E05] AppsFlyer dev key is missing");
            AFInAppEventParameterName("AppsFlyer dev key is missing");
        } else if (this.AFLogger$LogLevel.isStopped()) {
            AFLogger.AFInAppEventParameterName("[GCD-E03] 'isStopTracking' enabled");
            AFInAppEventParameterName("'isStopTracking' enabled");
        } else {
            this.AppsFlyer2dXConversionCallback.incrementAndGet();
            HttpURLConnection httpURLConnection2 = null;
            try {
                application = this.AFInAppEventType;
            } catch (Throwable th) {
                th = th;
            }
            if (application == null) {
                AFLogger.AFInAppEventParameterName("[GCD-E06] Context null");
                AFInAppEventParameterName("Context null");
                this.AppsFlyer2dXConversionCallback.decrementAndGet();
                return;
            }
            ac acVar = this.AFLogger$LogLevel;
            String AFInAppEventParameterName2 = acVar.AFInAppEventParameterName(application, acVar.AFInAppEventParameterName(application));
            if (AFInAppEventParameterName2 != null) {
                if (!values.contains(AFInAppEventParameterName2.toLowerCase())) {
                    str = "-".concat(String.valueOf(AFInAppEventParameterName2));
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()));
                    sb.append(this.AFInAppEventType.getPackageName());
                    sb.append(str);
                    sb.append("?devkey=");
                    sb.append(this.AFKeystoreWrapper);
                    sb.append("&device_id=");
                    sb.append(af.valueOf(new WeakReference(this.AFInAppEventType)));
                    String obj = sb.toString();
                    ak.AFInAppEventType().AFInAppEventType(obj, "");
                    ai.AFKeystoreWrapper("[GCD-B01] URL: ".concat(String.valueOf(obj)));
                    level = this.AFLogger$LogLevel.values().getLevel();
                    level.getLevel = System.currentTimeMillis();
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(obj).openConnection()));
                    httpURLConnection3.setRequestMethod("GET");
                    httpURLConnection3.setConnectTimeout(10000);
                    httpURLConnection3.setRequestProperty("Connection", "close");
                    httpURLConnection3.connect();
                    responseCode = httpURLConnection3.getResponseCode();
                    AFInAppEventParameterName = ac.AFInAppEventParameterName(httpURLConnection3);
                    ak.AFInAppEventType().values(obj, responseCode, AFInAppEventParameterName);
                    if (responseCode != 200 || responseCode == 404) {
                        int i = this.AFVersionDeclaration;
                        long currentTimeMillis = System.currentTimeMillis();
                        HttpURLConnection httpURLConnection4 = 0;
                        if (level.getLevel == 0) {
                            httpURLConnection4 = httpURLConnection3;
                            level.values.put("net", Long.valueOf(currentTimeMillis - level.getLevel));
                        } else {
                            httpURLConnection4 = httpURLConnection3;
                            AFLogger.values("Metrics: gcdStart ts is missing");
                        }
                        level.values.put("retries", Integer.valueOf(i));
                        level.valueOf.AFInAppEventParameterName("gcd", new JSONObject((Map<?, ?>) level.values).toString());
                        ai.AFKeystoreWrapper("Attribution data: ".concat(String.valueOf(AFInAppEventParameterName)));
                        httpURLConnection = httpURLConnection4;
                        if (AFInAppEventParameterName.length() > 0) {
                            Map<String, Object> values2 = cg.values(AFInAppEventParameterName);
                            Boolean bool = (Boolean) values2.get("iscache");
                            if (responseCode == 404) {
                                values2.remove("error_reason");
                                values2.remove("status_code");
                                values2.put("af_status", "Organic");
                                values2.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.AFLogger$LogLevel.AFInAppEventType(this.AFInAppEventType, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (values2.containsKey("af_siteid")) {
                                if (values2.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb2.append(values2.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.AFInAppEventParameterName(sb2.toString());
                                } else {
                                    AFLogger.AFInAppEventParameterName(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", values2.get("af_siteid")));
                                }
                            }
                            if (values2.containsKey("af_siteid")) {
                                StringBuilder sb3 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb3.append(values2.get(AFInAppEventParameterName.AF_CHANNEL));
                                AFLogger.AFInAppEventParameterName(sb3.toString());
                            }
                            values2.put("is_first_launch", Boolean.FALSE);
                            String jSONObject = new JSONObject((Map<?, ?>) values2).toString();
                            if (jSONObject != null) {
                                ac.valueOf(this.AFInAppEventType, "attributionId", jSONObject);
                            } else {
                                ac.valueOf(this.AFInAppEventType, "attributionId", AFInAppEventParameterName);
                            }
                            httpURLConnection = httpURLConnection4;
                            if (ac.AFKeystoreWrapper != null) {
                                httpURLConnection = httpURLConnection4;
                                if (this.AppsFlyer2dXConversionCallback.intValue() <= 1) {
                                    try {
                                        Map<String, Object> AFInAppEventParameterName3 = cg.AFInAppEventParameterName(this.AFInAppEventType);
                                        if (!ac.AFInAppEventType(this.AFInAppEventType).getBoolean("sixtyDayConversionData", false)) {
                                            AFInAppEventParameterName3.put("is_first_launch", Boolean.TRUE);
                                        }
                                        values2 = AFInAppEventParameterName3;
                                    } catch (ce e) {
                                        AFLogger.valueOf("Exception while trying to fetch attribution data. ", e);
                                    }
                                    StringBuilder sb4 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
                                    sb4.append(values2.toString());
                                    AFLogger.AFInAppEventParameterName(sb4.toString());
                                    ac.AFKeystoreWrapper.onConversionDataSuccess(values2);
                                    httpURLConnection = httpURLConnection4;
                                }
                            }
                        }
                    } else {
                        if (responseCode == 403 || responseCode >= 500) {
                            try {
                                if (this.AFVersionDeclaration < 2) {
                                    cc ccVar = new cc(this);
                                    ac.valueOf(ccVar.AFInAppEventParameterName, ccVar, 10L, TimeUnit.MILLISECONDS);
                                    httpURLConnection = httpURLConnection3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                httpURLConnection2 = httpURLConnection3;
                                try {
                                    if (this.AFVersionDeclaration >= 2) {
                                        cc ccVar2 = new cc(this);
                                        ac.valueOf(ccVar2.AFInAppEventParameterName, ccVar2, 10L, TimeUnit.MILLISECONDS);
                                    } else {
                                        AFInAppEventParameterName(th.getMessage());
                                    }
                                    AFLogger.valueOf(th.getMessage(), th);
                                    this.AFInAppEventParameterName.shutdown();
                                    AFLogger.AFInAppEventParameterName("[GCD-A03] Server retrieving attempt finished");
                                } finally {
                                    this.AppsFlyer2dXConversionCallback.decrementAndGet();
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                }
                            }
                        }
                        AFInAppEventParameterName("Error connection to server: ".concat(String.valueOf(responseCode)));
                        httpURLConnection = httpURLConnection3;
                    }
                    this.AppsFlyer2dXConversionCallback.decrementAndGet();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.AFInAppEventParameterName.shutdown();
                    AFLogger.AFInAppEventParameterName("[GCD-A03] Server retrieving attempt finished");
                }
                AFLogger.AppsFlyer2dXConversionCallback(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFInAppEventParameterName2));
            }
            str = "";
            StringBuilder sb5 = new StringBuilder();
            sb5.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()));
            sb5.append(this.AFInAppEventType.getPackageName());
            sb5.append(str);
            sb5.append("?devkey=");
            sb5.append(this.AFKeystoreWrapper);
            sb5.append("&device_id=");
            sb5.append(af.valueOf(new WeakReference(this.AFInAppEventType)));
            String obj2 = sb5.toString();
            ak.AFInAppEventType().AFInAppEventType(obj2, "");
            ai.AFKeystoreWrapper("[GCD-B01] URL: ".concat(String.valueOf(obj2)));
            level = this.AFLogger$LogLevel.values().getLevel();
            level.getLevel = System.currentTimeMillis();
            HttpURLConnection httpURLConnection32 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(obj2).openConnection()));
            httpURLConnection32.setRequestMethod("GET");
            httpURLConnection32.setConnectTimeout(10000);
            httpURLConnection32.setRequestProperty("Connection", "close");
            httpURLConnection32.connect();
            responseCode = httpURLConnection32.getResponseCode();
            AFInAppEventParameterName = ac.AFInAppEventParameterName(httpURLConnection32);
            ak.AFInAppEventType().values(obj2, responseCode, AFInAppEventParameterName);
            if (responseCode != 200) {
            }
            int i2 = this.AFVersionDeclaration;
            long currentTimeMillis2 = System.currentTimeMillis();
            HttpURLConnection httpURLConnection42 = 0;
            if (level.getLevel == 0) {
            }
            level.values.put("retries", Integer.valueOf(i2));
            level.valueOf.AFInAppEventParameterName("gcd", new JSONObject((Map<?, ?>) level.values).toString());
            ai.AFKeystoreWrapper("Attribution data: ".concat(String.valueOf(AFInAppEventParameterName)));
            httpURLConnection = httpURLConnection42;
            if (AFInAppEventParameterName.length() > 0) {
            }
            this.AppsFlyer2dXConversionCallback.decrementAndGet();
            if (httpURLConnection != null) {
            }
            this.AFInAppEventParameterName.shutdown();
            AFLogger.AFInAppEventParameterName("[GCD-A03] Server retrieving attempt finished");
        }
    }
}
