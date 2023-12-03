package com.appsflyer.internal;

import android.graphics.Color;
import android.net.TrafficStats;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
@Deprecated
/* loaded from: classes.dex */
public final class AFa1oSDK {
    private final AFe1wSDK AFInAppEventParameterName;

    /* loaded from: classes.dex */
    public interface AFa1zSDK {
        void AFKeystoreWrapper(String str, String str2, String str3);

        void values(String str);
    }

    public AFa1oSDK() {
    }

    public AFa1oSDK(AFe1wSDK aFe1wSDK) {
        this.AFInAppEventParameterName = aFe1wSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection valueOf(String str) {
        HttpURLConnection httpURLConnection;
        String str2;
        URL url;
        String str3;
        String str4;
        AFe1wSDK aFe1wSDK = this.AFInAppEventParameterName;
        String str5 = aFe1wSDK.afErrorLog;
        String jSONObject = AFa1pSDK.values(aFe1wSDK.AFInAppEventParameterName()).toString();
        boolean afRDLog = this.AFInAppEventParameterName.afRDLog();
        boolean init = this.AFInAppEventParameterName.init();
        boolean AFVersionDeclaration = this.AFInAppEventParameterName.AFVersionDeclaration();
        boolean AFKeystoreWrapper = this.AFInAppEventParameterName.AFKeystoreWrapper();
        String str6 = "";
        byte[] bytes = jSONObject.getBytes();
        HttpURLConnection httpURLConnection2 = null;
        if (afRDLog) {
            return null;
        }
        boolean z10 = true;
        try {
            url = new URL(str5);
            if (AFVersionDeclaration) {
                AFb1qSDK.AFInAppEventParameterName().valueOf(url.toString(), jSONObject);
                int length = jSONObject.getBytes("UTF-8").length;
                StringBuilder sb2 = new StringBuilder("call = ");
                sb2.append(url);
                sb2.append("; size = ");
                sb2.append(length);
                sb2.append(" byte");
                if (length <= 1) {
                    str4 = "";
                } else {
                    str4 = "s";
                }
                sb2.append(str4);
                sb2.append("; body = ");
                sb2.append(jSONObject);
                AFb1rSDK.valueOf(sb2.toString());
            }
            TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            if (AFKeystoreWrapper) {
                str3 = "application/octet-stream";
            } else {
                str3 = "application/json";
            }
            httpURLConnection.setRequestProperty("Content-Type", str3);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (AFKeystoreWrapper) {
                bytes = (byte[]) ((Class) AFa1vSDK.values(View.MeasureSpec.makeMeasureSpec(0, 0) + 31, (char) Color.alpha(0), View.combineMeasuredStates(0, 0) + 31)).getDeclaredMethod("AFInAppEventType", byte[].class).invoke(((Class) AFa1vSDK.values(30 - TextUtils.lastIndexOf("", '0', 0), (char) Color.red(0), (Process.myPid() >> 22) + 31)).getMethod("AFInAppEventParameterName", String.class).invoke(null, str), bytes);
            }
            outputStream.write(bytes);
            outputStream.close();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (init) {
                str6 = AFb1xSDK.valueOf(httpURLConnection);
            }
            if (AFVersionDeclaration) {
                AFb1qSDK.AFInAppEventParameterName().AFKeystoreWrapper(url.toString(), responseCode, str6);
            }
            if (responseCode == 200) {
                AFLogger.afInfoLog("Status 200 ok");
                z10 = false;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(str5)), th);
            httpURLConnection = httpURLConnection2;
            StringBuilder sb3 = new StringBuilder("Connection ");
            if (!z10) {
            }
            sb3.append(str2);
            sb3.append(": ");
            sb3.append(str6);
            AFLogger.afInfoLog(sb3.toString());
            return httpURLConnection;
        }
        StringBuilder sb32 = new StringBuilder("Connection ");
        if (!z10) {
            str2 = "error";
        } else {
            str2 = "call succeeded";
        }
        sb32.append(str2);
        sb32.append(": ");
        sb32.append(str6);
        AFLogger.afInfoLog(sb32.toString());
        return httpURLConnection;
    }
}
