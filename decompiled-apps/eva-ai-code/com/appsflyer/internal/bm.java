package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class bm {
    private final int AFKeystoreWrapper;

    public bm(int i) {
        this.AFKeystoreWrapper = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final br<String> AFInAppEventType(z zVar) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        httpURLConnection = null;
        try {
            byte[] AFKeystoreWrapper = zVar.AFKeystoreWrapper();
            StringBuilder sb = new StringBuilder();
            sb.append(zVar.AFKeystoreWrapper);
            sb.append(CertificateUtil.DELIMITER);
            sb.append(zVar.values);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] AFKeystoreWrapper2 = zVar.AFKeystoreWrapper();
            if (AFKeystoreWrapper2 != null) {
                String str = zVar.AFInAppEventType() ? "<encrypted>" : new String(AFKeystoreWrapper2);
                sb2.append("\n payload: ");
                sb2.append(str);
            }
            for (Map.Entry<String, String> entry : zVar.AFInAppEventType.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb3 = new StringBuilder("HTTP: [");
            sb3.append(zVar.hashCode());
            sb3.append("] ");
            sb3.append((Object) sb2);
            AFLogger.AFInAppEventParameterName(sb3.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(zVar.values).openConnection()));
            try {
                httpURLConnection2.setRequestMethod(zVar.AFKeystoreWrapper);
                if (zVar.values()) {
                    httpURLConnection2.setUseCaches(false);
                }
                try {
                    int i = this.AFKeystoreWrapper;
                    int i2 = zVar.valueOf;
                    if (i2 != -1) {
                        i = i2;
                    }
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i);
                    httpURLConnection2.addRequestProperty("Content-Type", zVar.AFInAppEventType() ? "application/octet-stream" : HttpHeaders.Values.APPLICATION_JSON);
                    for (Map.Entry<String, String> entry2 : zVar.AFInAppEventType.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (AFKeystoreWrapper != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(AFKeystoreWrapper.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb4.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(AFKeystoreWrapper);
                                bufferedOutputStream2.close();
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                    String AFInAppEventParameterName = zVar.AFInAppEventParameterName() ? AFInAppEventParameterName(httpURLConnection2, z) : "";
                    bk bkVar = new bk(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb5 = new StringBuilder("response code:");
                    sb5.append(httpURLConnection2.getResponseCode());
                    sb5.append(" ");
                    sb5.append(httpURLConnection2.getResponseMessage());
                    sb5.append("\n body:");
                    sb5.append(AFInAppEventParameterName);
                    sb5.append("\n took ");
                    sb5.append(bkVar.AFKeystoreWrapper);
                    sb5.append("ms");
                    String obj = sb5.toString();
                    StringBuilder sb6 = new StringBuilder("HTTP: [");
                    sb6.append(zVar.hashCode());
                    sb6.append("] ");
                    sb6.append(obj);
                    AFLogger.AFInAppEventParameterName(sb6.toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    br<String> brVar = new br<>(AFInAppEventParameterName, httpURLConnection2.getResponseCode(), z, hashMap, bkVar);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return brVar;
                } catch (Exception e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    try {
                        bk bkVar2 = new bk(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb7 = new StringBuilder("error: ");
                        sb7.append(e);
                        sb7.append("\n took ");
                        sb7.append(bkVar2.AFKeystoreWrapper);
                        sb7.append("ms");
                        String obj2 = sb7.toString();
                        StringBuilder sb8 = new StringBuilder("HTTP: [");
                        sb8.append(zVar.hashCode());
                        sb8.append("] ");
                        sb8.append(obj2);
                        AFLogger.valueOf(sb8.toString(), e);
                        throw new HttpException(e, bkVar2);
                    } catch (Throwable th3) {
                        th = th3;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private static String AFInAppEventParameterName(HttpURLConnection httpURLConnection, boolean z) throws IOException {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            if (z) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z2 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!z2) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                            z2 = false;
                        } else {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                    } catch (Throwable th) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
