package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
/* loaded from: classes2.dex */
public abstract class an implements Runnable {
    protected static String AFInAppEventType = null;
    private static String AFKeystoreWrapper = null;
    private static int AFLogger$LogLevel = 0;
    private static long init = 0;
    private static char onAppOpenAttributionNative = 0;
    private static int onAttributionFailureNative = 1;
    private static int onInstallConversionDataLoadedNative;
    public String AFInAppEventParameterName;
    private final Context getLevel;
    public final String valueOf;
    private final ac values;
    public final String AppsFlyer2dXConversionCallback = UUID.randomUUID().toString();
    public final Map<String, Object> AFVersionDeclaration = AFInAppEventParameterName();

    static void AFKeystoreWrapper() {
        init = 5852232774877074978L;
        onAppOpenAttributionNative = (char) 0;
        AFLogger$LogLevel = 0;
    }

    protected abstract void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    protected abstract void valueOf();

    protected abstract void valueOf(String str);

    protected abstract String values();

    static {
        AFKeystoreWrapper();
        AFKeystoreWrapper = "v2";
        StringBuilder sb = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb.append(AFKeystoreWrapper);
        AFInAppEventType = sb.toString();
        int i = onAttributionFailureNative + 25;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
    }

    public an(ac acVar, Context context, String str) {
        this.values = acVar;
        this.getLevel = context;
        this.valueOf = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = onAttributionFailureNative + 23;
        onInstallConversionDataLoadedNative = i % 128;
        char c2 = i % 2 != 0 ? '4' : '\n';
        AFInAppEventType();
        if (c2 != '\n') {
            int i2 = 65 / 0;
        }
        int i3 = onAttributionFailureNative + 125;
        onInstallConversionDataLoadedNative = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventType() {
        String str;
        Throwable th;
        String str2 = "";
        String values = values();
        AFLogger.AFKeystoreWrapper("oneLinkUrl: ".concat(String.valueOf(values)));
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(values).openConnection()));
            httpsURLConnection.setRequestProperty("content-type", HttpHeaders.Values.APPLICATION_JSON);
            httpsURLConnection.setReadTimeout(3000);
            httpsURLConnection.setConnectTimeout(3000);
            httpsURLConnection.setRequestMethod(this.valueOf);
            AFInAppEventParameterName(httpsURLConnection);
            int responseCode = httpsURLConnection.getResponseCode();
            str = ac.AFInAppEventParameterName(httpsURLConnection);
            try {
                if ((responseCode == 200 ? 'Q' : 'K') == 'K') {
                    StringBuilder sb = new StringBuilder("Response code = ");
                    sb.append(responseCode);
                    sb.append(" content = ");
                    sb.append(str);
                    str2 = sb.toString();
                } else {
                    int i = onAttributionFailureNative + 43;
                    onInstallConversionDataLoadedNative = i % 128;
                    if (i % 2 != 0) {
                        AFLogger.values("Status 200 ok");
                        throw null;
                    }
                    AFLogger.values("Status 200 ok");
                }
            } catch (Throwable th2) {
                th = th2;
                AFLogger.valueOf("Error while calling ".concat(String.valueOf(values)), th);
                StringBuilder sb2 = new StringBuilder("Error while calling ");
                sb2.append(values);
                sb2.append(" stacktrace: ");
                sb2.append(th.toString());
                str2 = sb2.toString();
                if ((!TextUtils.isEmpty(str2) ? (char) 4 : (char) 26) != 26) {
                }
            }
        } catch (Throwable th3) {
            str = "";
            th = th3;
        }
        if ((!TextUtils.isEmpty(str2) ? (char) 4 : (char) 26) != 26) {
            AFLogger.AppsFlyer2dXConversionCallback("Connection error: ".concat(String.valueOf(str2)));
            valueOf();
            return;
        }
        int i2 = onAttributionFailureNative + 77;
        onInstallConversionDataLoadedNative = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.values("Connection call succeeded: ".concat(String.valueOf(str)));
        valueOf(str);
    }

    /* loaded from: classes2.dex */
    public static class c implements Runnable {
        private final cm AFKeystoreWrapper;

        public c() {
        }

        public c(cm cmVar) {
            this.AFKeystoreWrapper = cmVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0184  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public HttpURLConnection values() {
            HttpURLConnection httpURLConnection;
            URL url;
            String str = this.AFKeystoreWrapper.onDeepLinkingNative;
            String jSONObject = n.AFInAppEventType(this.AFKeystoreWrapper.values()).toString();
            boolean AFLogger$LogLevel = this.AFKeystoreWrapper.AFLogger$LogLevel();
            boolean AppsFlyer2dXConversionCallback = this.AFKeystoreWrapper.AppsFlyer2dXConversionCallback();
            boolean level = this.AFKeystoreWrapper.getLevel();
            boolean AFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType();
            String str2 = "";
            byte[] bytes = jSONObject.getBytes();
            HttpURLConnection httpURLConnection2 = null;
            if (AFLogger$LogLevel) {
                return null;
            }
            boolean z = true;
            try {
                url = new URL(str);
                if (level) {
                    ak.AFInAppEventType().AFInAppEventType(url.toString(), jSONObject);
                    int length = jSONObject.getBytes("UTF-8").length;
                    StringBuilder sb = new StringBuilder("call = ");
                    sb.append(url);
                    sb.append("; size = ");
                    sb.append(length);
                    sb.append(" byte");
                    sb.append(length > 1 ? "s" : "");
                    sb.append("; body = ");
                    sb.append(jSONObject);
                    ai.AFKeystoreWrapper(sb.toString());
                }
                TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", AFInAppEventType ? "application/octet-stream" : HttpHeaders.Values.APPLICATION_JSON);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                if (AFInAppEventType) {
                    bytes = (byte[]) ((Class) e.AFInAppEventParameterName(24 - (ViewConfiguration.getTapTimeout() >> 16), 23 - Process.getGidForName(""), (char) (ViewConfiguration.getPressedStateDuration() >> 16))).getDeclaredMethod("values", byte[].class).invoke(((Class) e.AFInAppEventParameterName((ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AFInAppEventParameterName", String.class).invoke(null, this.AFKeystoreWrapper.AFVersionDeclaration), bytes);
                }
                outputStream.write(bytes);
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (AppsFlyer2dXConversionCallback) {
                    ac.AFInAppEventParameterName();
                    str2 = ac.AFInAppEventParameterName(httpURLConnection);
                }
                if (level) {
                    ak.AFInAppEventType().values(url.toString(), responseCode, str2);
                }
                if (responseCode == 200) {
                    AFLogger.values("Status 200 ok");
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                AFLogger.valueOf("Error while calling ".concat(String.valueOf(str)), th);
                httpURLConnection = httpURLConnection2;
                StringBuilder sb2 = new StringBuilder("Connection ");
                sb2.append(!z ? "error" : "call succeeded");
                sb2.append(": ");
                sb2.append(str2);
                AFLogger.values(sb2.toString());
                return httpURLConnection;
            }
            StringBuilder sb22 = new StringBuilder("Connection ");
            sb22.append(!z ? "error" : "call succeeded");
            sb22.append(": ");
            sb22.append(str2);
            AFLogger.values(sb22.toString());
            return httpURLConnection;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection values = values();
            if (values != null) {
                values.disconnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, AFKeystoreWrapper);
        String AFInAppEventParameterName = ag.AFInAppEventParameterName((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getDevKey());
        sb.append(this.AppsFlyer2dXConversionCallback);
        sb.append(AFKeystoreWrapper);
        httpsURLConnection.setRequestProperty(AFKeystoreWrapper("ዺ力\ufffb쬣\ua83bጵ삸瑃뜂ᣫ\ud9f4\uef35", "뾎숵\udf77⒗", "嘢쥲亳儷", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), ag.valueOf(AFInAppEventParameterName, sb.toString()));
        int i = onInstallConversionDataLoadedNative + 41;
        onAttributionFailureNative = i % 128;
        int i2 = i % 2;
    }

    private Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.5.4");
        hashMap.put("counter", Integer.valueOf(this.values.valueOf(ac.AFInAppEventType(this.getLevel), false)));
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        hashMap.put(AFKeystoreWrapper("粞Რ䥕穷작", "\ue724\uecbcẨ⋾", "嘢쥲亳儷", (-1460880153) - TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 65054)).intern(), Build.BRAND);
        hashMap.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        try {
            hashMap.put("app_version_name", this.getLevel.getPackageManager().getPackageInfo(this.getLevel.getPackageName(), 0).versionName);
            int i = onInstallConversionDataLoadedNative + 95;
            onAttributionFailureNative = i % 128;
            int i2 = i % 2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("app_id", this.getLevel.getPackageName());
        hashMap.put("platformextension", new al().AFInAppEventType());
        int i3 = onAttributionFailureNative + 69;
        onInstallConversionDataLoadedNative = i3 % 128;
        int i4 = i3 % 2;
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str, String str2, String str3, int i, char c2) {
        char[] cArr;
        String str4;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (dp.valueOf) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr2.clone();
            cArr7[0] = (char) (c2 ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr6.length;
            char[] cArr9 = new char[length];
            dp.AFInAppEventParameterName = 0;
            while (dp.AFInAppEventParameterName < length) {
                int i2 = (dp.AFInAppEventParameterName + 2) % 4;
                int i3 = (dp.AFInAppEventParameterName + 3) % 4;
                dp.AFInAppEventType = (char) (((cArr7[dp.AFInAppEventParameterName % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = dp.AFInAppEventType;
                cArr9[dp.AFInAppEventParameterName] = (char) ((((cArr7[i3] ^ cArr6[dp.AFInAppEventParameterName]) ^ init) ^ AFLogger$LogLevel) ^ onAppOpenAttributionNative);
                dp.AFInAppEventParameterName++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
