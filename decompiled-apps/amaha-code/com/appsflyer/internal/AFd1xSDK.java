package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class AFd1xSDK extends AFc1lSDK<Map<String, Object>> {
    private static final int AFLogger = (int) TimeUnit.SECONDS.toMillis(2);
    private final Context afDebugLog;
    private final Uri afErrorLog;
    private final Map<String, Object> afInfoLog;
    private final List<String> afRDLog;

    public AFd1xSDK(Context context, Map<String, Object> map, Uri uri, List<String> list) {
        super(AFc1kSDK.RESOLVE_ESP, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, "ResolveEsp");
        this.afDebugLog = context;
        this.afInfoLog = map;
        this.afErrorLog = uri;
        this.afRDLog = list;
    }

    private boolean valueOf(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder g5 = d.g("Validate if link ", str, " belongs to ESP domains: ");
        g5.append(this.afRDLog);
        AFLogger.afRDLog(g5.toString());
        try {
            return this.afRDLog.contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final AFc1jSDK AFInAppEventType() {
        String str;
        int i6;
        Uri uri;
        if (!valueOf(this.afErrorLog.toString())) {
            AFb1xSDK.AFKeystoreWrapper().AFInAppEventType(this.afDebugLog, this.afInfoLog, this.afErrorLog);
            return AFc1jSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.afErrorLog.toString();
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        String str2 = null;
        int i10 = 0;
        while (i10 < 5) {
            Map<String, Object> values = values(Uri.parse(obj));
            String str3 = (String) values.get("res");
            Integer num2 = (Integer) values.get("status");
            String str4 = (String) values.get("error");
            if (str3 != null && valueOf(str3)) {
                if (i10 < 4) {
                    arrayList.add(str3);
                }
                i10++;
                str2 = str4;
                obj = str3;
                num = num2;
            } else {
                str2 = str4;
                obj = str3;
                num = num2;
                break;
            }
        }
        HashMap hashMap = new HashMap();
        if (obj != null) {
            str = obj;
        } else {
            str = "";
        }
        hashMap.put("res", str);
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = -1;
        }
        hashMap.put("status", Integer.valueOf(i6));
        if (str2 != null) {
            hashMap.put("error", str2);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.afInfoLog) {
            this.afInfoLog.put("af_deeplink_r", hashMap);
            this.afInfoLog.put("af_deeplink", this.afErrorLog.toString());
        }
        AFb1xSDK AFKeystoreWrapper = AFb1xSDK.AFKeystoreWrapper();
        Context context = this.afDebugLog;
        Map<String, Object> map = this.afInfoLog;
        if (obj != null) {
            uri = Uri.parse(obj);
        } else {
            uri = this.afErrorLog;
        }
        AFKeystoreWrapper.AFInAppEventType(context, map, uri);
        return AFc1jSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final long values() {
        return 60000L;
    }

    private static Map<String, Object> values(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i6 = AFLogger;
            httpURLConnection.setReadTimeout(i6);
            httpURLConnection.setConnectTimeout(i6);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.9.1");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th2) {
            hashMap.put("error", th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
        return hashMap;
    }
}
