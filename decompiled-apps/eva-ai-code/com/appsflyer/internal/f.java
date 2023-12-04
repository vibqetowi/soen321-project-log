package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class f {
    static volatile boolean AFInAppEventParameterName;
    static final int AFInAppEventType = (int) TimeUnit.SECONDS.toMillis(2);
    static String[] AFKeystoreWrapper;
    static String[] AFLogger$LogLevel;
    private static f AppsFlyer2dXConversionCallback;
    public static Intent valueOf;
    public String AFVersionDeclaration;
    public Map<String, String> getLevel;
    public List<List<String>> init = new ArrayList();
    public DeepLinkListener values;

    public static f valueOf() {
        if (AppsFlyer2dXConversionCallback == null) {
            AppsFlyer2dXConversionCallback = new f();
        }
        return AppsFlyer2dXConversionCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(Map<String, Object> map, cl clVar, Intent intent, bv bvVar, Context context) {
        DeepLinkResult.Error error;
        SharedPreferences AFInAppEventType2 = ac.AFInAppEventType(context);
        if (!values(intent, context, map) && this.values != null && ac.AFInAppEventParameterName().valueOf(AFInAppEventType2, false) == 0 && !AFInAppEventType2.getBoolean("ddl_sent", false)) {
            final ar arVar = new ar(context, clVar);
            AFLogger.AFInAppEventParameterName("[DDL] start");
            FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() { // from class: com.appsflyer.internal.ar.4
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ DeepLinkResult call() throws Exception {
                    Application application = ar.this.AFKeystoreWrapper;
                    ar.valueOf(ar.this);
                    ar.this.AFInAppEventParameterName(application);
                    return ar.AFInAppEventType(ar.this, application);
                }
            });
            new Thread(futureTask).start();
            try {
                DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(ar.onInstallConversionDataLoadedNative, TimeUnit.MILLISECONDS);
                arVar.onAppOpenAttributionNative.AFInAppEventType(deepLinkResult, ar.onInstallConversionDataLoadedNative);
                ao.AFInAppEventType(deepLinkResult);
            } catch (InterruptedException e) {
                e = e;
                AFLogger.AFInAppEventParameterName("[DDL] Error occurred", e);
                if (!(e.getCause() instanceof IOException)) {
                    error = DeepLinkResult.Error.NETWORK;
                } else {
                    error = DeepLinkResult.Error.UNEXPECTED;
                }
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, error);
                arVar.onAppOpenAttributionNative.AFInAppEventType(deepLinkResult2, ar.onInstallConversionDataLoadedNative);
                ao.AFInAppEventType(deepLinkResult2);
            } catch (ExecutionException e2) {
                e = e2;
                AFLogger.AFInAppEventParameterName("[DDL] Error occurred", e);
                if (!(e.getCause() instanceof IOException)) {
                }
                DeepLinkResult deepLinkResult22 = new DeepLinkResult(null, error);
                arVar.onAppOpenAttributionNative.AFInAppEventType(deepLinkResult22, ar.onInstallConversionDataLoadedNative);
                ao.AFInAppEventType(deepLinkResult22);
            } catch (TimeoutException unused) {
                StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
                sb.append(arVar.onAttributionFailureNative);
                sb.append(" attempt(s) within ");
                sb.append(ar.onInstallConversionDataLoadedNative);
                sb.append(" milliseconds");
                AFLogger.AFInAppEventParameterName(sb.toString());
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                arVar.onAppOpenAttributionNative.AFInAppEventType(deepLinkResult3, ar.onInstallConversionDataLoadedNative);
                ao.AFInAppEventType(deepLinkResult3);
            }
        }
        bvVar.AFInAppEventType("ddl_sent", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(String str) {
        if (AFKeystoreWrapper == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(Arrays.asList(AFKeystoreWrapper));
        AFLogger.AFKeystoreWrapper(sb.toString());
        try {
            return Arrays.asList(AFKeystoreWrapper).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventType(final Context context, final Map<String, Object> map, final Uri uri) {
        if (values(uri.toString())) {
            AFInAppEventParameterName = true;
            if (k.values == null) {
                k.values = new k();
            }
            k kVar = k.values;
            if (kVar.valueOf == null) {
                kVar.valueOf = Executors.newSingleThreadScheduledExecutor(kVar.AFInAppEventType);
            }
            kVar.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.f.4
                @Override // java.lang.Runnable
                public final void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num = null;
                    String str = null;
                    int i = 0;
                    while (i < 5) {
                        Map<String, Object> AFInAppEventType2 = AFInAppEventType(Uri.parse(obj));
                        String str2 = (String) AFInAppEventType2.get("res");
                        Integer num2 = (Integer) AFInAppEventType2.get("status");
                        String str3 = (String) AFInAppEventType2.get("error");
                        if (str2 == null || !f.values(str2)) {
                            str = str3;
                            obj = str2;
                            num = num2;
                            break;
                        }
                        if (i < 4) {
                            arrayList.add(str2);
                        }
                        i++;
                        str = str3;
                        obj = str2;
                        num = num2;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("res", obj != null ? obj : "");
                    hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
                    if (str != null) {
                        hashMap.put("error", str);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put("redirects", arrayList);
                    }
                    hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        map.put("af_deeplink_r", hashMap);
                        map.put("af_deeplink", uri.toString());
                    }
                    ac.AFInAppEventParameterName().AFInAppEventType(context, map, obj != null ? Uri.parse(obj) : uri);
                    f.AFInAppEventParameterName = false;
                }

                private static Map<String, Object> AFInAppEventType(Uri uri2) {
                    HashMap hashMap = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri2.toString());
                        AFLogger.AFInAppEventParameterName(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri2.toString()).openConnection()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(f.AFInAppEventType);
                        httpURLConnection.setConnectTimeout(f.AFInAppEventType);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.5.4");
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put("status", Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.AFInAppEventParameterName("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        AFLogger.valueOf(th.getMessage(), th);
                    }
                    return hashMap;
                }
            });
        } else {
            ac.AFInAppEventParameterName().AFInAppEventType(context, map, uri);
        }
        valueOf = null;
    }

    private Uri AFInAppEventParameterName(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri AFKeystoreWrapper(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean values(Intent intent, Context context, Map<String, Object> map) {
        String string;
        Uri AFInAppEventParameterName2;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = valueOf;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        Bundle extras = intent.getExtras();
        List<List<String>> list = this.init;
        if (list != null && !list.isEmpty() && extras != null) {
            Iterator<List<String>> it = this.init.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<String> next = it.next();
                if (next != null) {
                    Iterator<String> it2 = next.iterator();
                    if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                        AFInAppEventParameterName2 = AFInAppEventParameterName(string, it2);
                        continue;
                        if (AFInAppEventParameterName2 != null) {
                            StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                            sb.append(next.toString());
                            AFLogger.AFInAppEventParameterName(sb.toString());
                            ac.AFInAppEventType(map).put("payloadKey", this.init);
                            uri = AFInAppEventParameterName2;
                            break;
                        }
                    }
                }
                AFInAppEventParameterName2 = null;
                continue;
                if (AFInAppEventParameterName2 != null) {
                }
            }
        }
        if (data != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                AFInAppEventType(context, map, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.values(sb2.toString());
            return false;
        } else if (data2 != null) {
            if (!valueOf.hasExtra("af_consumed")) {
                valueOf.putExtra("af_consumed", System.currentTimeMillis());
                AFInAppEventType(context, map, data2);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.values(sb3.toString());
            return false;
        } else if (uri != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                AFInAppEventType(context, map, uri);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
            sb4.append(uri.toString());
            sb4.append(" w/af_consumed");
            AFLogger.values(sb4.toString());
            return false;
        } else {
            AFLogger.AFInAppEventParameterName("No deep link detected");
            return false;
        }
    }
}
