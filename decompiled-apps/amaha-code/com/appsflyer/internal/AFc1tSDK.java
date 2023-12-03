package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFc1tSDK {
    private final int AFKeystoreWrapper;

    public AFc1tSDK(int i6) {
        this.AFKeystoreWrapper = i6;
    }

    private static String values(HttpURLConnection httpURLConnection, boolean z10) {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            if (z10) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z11 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!z11) {
                                sb2.append('\n');
                            }
                            sb2.append(readLine);
                            z11 = false;
                        } else {
                            String obj = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                    } catch (Throwable th2) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFc1nSDK<String> valueOf(AFb1wSDK aFb1wSDK) {
        String str;
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        httpURLConnection = null;
        try {
            byte[] valueOf = aFb1wSDK.valueOf();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFb1wSDK.valueOf);
            sb2.append(":");
            sb2.append(aFb1wSDK.AFInAppEventType);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] valueOf2 = aFb1wSDK.valueOf();
            if (valueOf2 != null) {
                if (aFb1wSDK.AFInAppEventParameterName()) {
                    str3 = "<encrypted>";
                } else {
                    str3 = new String(valueOf2);
                }
                sb3.append("\n payload: ");
                sb3.append(str3);
            }
            for (Map.Entry<String, String> entry : aFb1wSDK.values.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb4 = new StringBuilder("HTTP: [");
            sb4.append(aFb1wSDK.hashCode());
            sb4.append("] ");
            sb4.append((Object) sb3);
            AFLogger.afDebugLog(sb4.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aFb1wSDK.AFInAppEventType).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(aFb1wSDK.valueOf);
                boolean z10 = false;
                if (aFb1wSDK.AFInAppEventType()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFb1wSDK.AFLogger()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i6 = this.AFKeystoreWrapper;
                    int i10 = aFb1wSDK.afDebugLog;
                    if (i10 != -1) {
                        i6 = i10;
                    }
                    httpURLConnection2.setConnectTimeout(i6);
                    httpURLConnection2.setReadTimeout(i6);
                    if (aFb1wSDK.AFInAppEventParameterName()) {
                        str = "application/octet-stream";
                    } else {
                        str = "application/json";
                    }
                    httpURLConnection2.addRequestProperty("Content-Type", str);
                    for (Map.Entry<String, String> entry2 : aFb1wSDK.values.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (valueOf != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(valueOf.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb5.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(valueOf);
                                bufferedOutputStream2.close();
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    if (httpURLConnection2.getResponseCode() / 100 == 2) {
                        z10 = true;
                    }
                    if (!aFb1wSDK.values()) {
                        str2 = "";
                    } else {
                        str2 = values(httpURLConnection2, z10);
                    }
                    AFc1sSDK aFc1sSDK = new AFc1sSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb6 = new StringBuilder("response code:");
                    sb6.append(httpURLConnection2.getResponseCode());
                    sb6.append(" ");
                    sb6.append(httpURLConnection2.getResponseMessage());
                    sb6.append("\n body:");
                    sb6.append(str2);
                    sb6.append("\n took ");
                    sb6.append(aFc1sSDK.AFKeystoreWrapper);
                    sb6.append("ms");
                    String obj = sb6.toString();
                    StringBuilder sb7 = new StringBuilder("HTTP: [");
                    sb7.append(aFb1wSDK.hashCode());
                    sb7.append("] ");
                    sb7.append(obj);
                    AFLogger.afDebugLog(sb7.toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    AFc1nSDK<String> aFc1nSDK = new AFc1nSDK<>(str2, httpURLConnection2.getResponseCode(), z10, hashMap, aFc1sSDK);
                    httpURLConnection2.disconnect();
                    return aFc1nSDK;
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    try {
                        AFc1sSDK aFc1sSDK2 = new AFc1sSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb8 = new StringBuilder("error: ");
                        sb8.append(e);
                        sb8.append("\n took ");
                        sb8.append(aFc1sSDK2.AFKeystoreWrapper);
                        sb8.append("ms");
                        String obj2 = sb8.toString();
                        StringBuilder sb9 = new StringBuilder("HTTP: [");
                        sb9.append(aFb1wSDK.hashCode());
                        sb9.append("] ");
                        sb9.append(obj2);
                        AFLogger.afErrorLog(sb9.toString(), e);
                        throw new HttpException(e, aFc1sSDK2);
                    } catch (Throwable th4) {
                        th = th4;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e12) {
            e = e12;
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
