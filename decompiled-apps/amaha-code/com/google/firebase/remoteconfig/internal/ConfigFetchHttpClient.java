package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.a;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import of.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f9807h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Context f9808a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9809b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9810c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9811d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9812e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9813g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        String str4;
        this.f9808a = context;
        this.f9809b = str;
        this.f9810c = str2;
        Matcher matcher = f9807h.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.f9811d = str4;
        this.f9812e = str3;
        this.f = j10;
        this.f9813g = j11;
    }

    public static JSONObject c(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f9809b);
            Context context = this.f9808a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i6 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i6));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(h0.a.a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "21.2.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l2 != null) {
                long longValue = l2.longValue();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(longValue)));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f9811d, this.f9812e)).openConnection();
        } catch (IOException e10) {
            throw new FirebaseRemoteConfigException(e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[LOOP:0: B:12:0x0095->B:14:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[Catch: JSONException -> 0x0169, IOException | JSONException -> 0x016b, all -> 0x0174, TRY_LEAVE, TryCatch #6 {all -> 0x0174, blocks: (B:15:0x00b1, B:17:0x00cd, B:51:0x015f, B:52:0x0168, B:56:0x016c, B:57:0x0173), top: B:76:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f A[Catch: JSONException -> 0x0169, IOException | JSONException -> 0x016b, all -> 0x0174, TRY_ENTER, TryCatch #6 {all -> 0x0174, blocks: (B:15:0x00b1, B:17:0x00cd, B:51:0x015f, B:52:0x0168, B:56:0x016c, B:57:0x0173), top: B:76:0x0099 }] */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a.C0162a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l2, Date date) {
        String str4;
        int responseCode;
        boolean z10;
        JSONObject jSONObject;
        JSONArray jSONArray;
        byte[] a10;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f9813g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f9810c);
        Context context = this.f9808a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        JSONObject jSONObject2 = null;
        try {
            a10 = aa.a.a(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e10);
        }
        if (a10 == null) {
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
            str4 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str4);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                try {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                } finally {
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                }
            }
            try {
                d(httpURLConnection, a(str, str2, map, l2).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject c10 = c(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused2) {
                    }
                    try {
                        z10 = !c10.get("state").equals("NO_CHANGE");
                    } catch (JSONException unused3) {
                        z10 = true;
                    }
                    if (!z10) {
                        return new a.C0162a(1, null, null);
                    }
                    try {
                        Date date2 = c.f;
                        JSONObject jSONObject3 = new JSONObject();
                        Date date3 = c.f;
                        JSONArray jSONArray2 = new JSONArray();
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject = c10.getJSONObject("entries");
                        } catch (JSONException unused4) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            try {
                                jSONObject3 = new JSONObject(jSONObject.toString());
                            } catch (JSONException unused5) {
                            }
                        }
                        try {
                            jSONArray = c10.getJSONArray("experimentDescriptions");
                        } catch (JSONException unused6) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            try {
                                jSONArray2 = new JSONArray(jSONArray.toString());
                            } catch (JSONException unused7) {
                            }
                        }
                        try {
                            jSONObject2 = c10.getJSONObject("personalizationMetadata");
                        } catch (JSONException unused8) {
                        }
                        if (jSONObject2 != null) {
                            try {
                                jSONObject4 = new JSONObject(jSONObject2.toString());
                            } catch (JSONException unused9) {
                            }
                        }
                        return new a.C0162a(0, new c(jSONObject3, date, jSONArray2, jSONObject4), headerField);
                    } catch (JSONException e11) {
                        throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e11);
                    }
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } catch (IOException | JSONException e12) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e12);
            }
        }
        str4 = f6.b.r0(a10);
        httpURLConnection.setRequestProperty("X-Android-Cert", str4);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        while (r11.hasNext()) {
        }
        d(httpURLConnection, a(str, str2, map, l2).toString().getBytes("utf-8"));
        httpURLConnection.connect();
        responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
        }
    }
}
