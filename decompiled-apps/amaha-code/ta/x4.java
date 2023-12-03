package ta;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class x4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final URL f32944u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ y4 f32945v;

    /* renamed from: w  reason: collision with root package name */
    public final x3 f32946w;

    public x4(y4 y4Var, String str, URL url, x3 x3Var) {
        this.f32945v = y4Var;
        v9.o.e(str);
        this.f32944u = url;
        this.f32946w = x3Var;
    }

    public final void a(final int i6, final IOException iOException, final byte[] bArr, final Map map) {
        w3 w3Var = this.f32945v.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new Runnable() { // from class: ta.v4
            @Override // java.lang.Runnable
            public final void run() {
                y3 y3Var = x4.this.f32946w.f32943u;
                k6 k6Var = y3Var.F;
                int i10 = i6;
                Exception exc = iOException;
                w2 w2Var = y3Var.C;
                if (i10 != 200 && i10 != 204) {
                    if (i10 == 304) {
                        i10 = 304;
                    }
                    y3.k(w2Var);
                    w2Var.C.d("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), exc);
                }
                if (exc == null) {
                    j3 j3Var = y3Var.B;
                    y3.i(j3Var);
                    j3Var.L.a(true);
                    byte[] bArr2 = bArr;
                    if (bArr2 != null && bArr2.length != 0) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            String optString = jSONObject.optString("deeplink", "");
                            String optString2 = jSONObject.optString("gclid", "");
                            double optDouble = jSONObject.optDouble(ServerValues.NAME_OP_TIMESTAMP, 0.0d);
                            if (TextUtils.isEmpty(optString)) {
                                y3.k(w2Var);
                                w2Var.G.b("Deferred Deep Link is empty.");
                            } else {
                                y3.i(k6Var);
                                y3 y3Var2 = k6Var.f32943u;
                                if (!TextUtils.isEmpty(optString)) {
                                    Context context = y3Var2.f32953u;
                                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("gclid", optString2);
                                        bundle.putString("_cis", "ddp");
                                        y3Var.J.o("auto", "_cmp", bundle);
                                        if (!TextUtils.isEmpty(optString)) {
                                            try {
                                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                                edit.putString("deeplink", optString);
                                                edit.putLong(ServerValues.NAME_OP_TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                                if (edit.commit()) {
                                                    context.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                                }
                                            } catch (RuntimeException e10) {
                                                w2 w2Var2 = y3Var2.C;
                                                y3.k(w2Var2);
                                                w2Var2.f32925z.c(e10, "Failed to persist Deferred Deep Link. exception");
                                            }
                                        }
                                    }
                                }
                                y3.k(w2Var);
                                w2Var.C.d("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                            }
                            return;
                        } catch (JSONException e11) {
                            y3.k(w2Var);
                            w2Var.f32925z.c(e11, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    y3.k(w2Var);
                    w2Var.G.b("Deferred Deep Link response empty.");
                    return;
                }
                y3.k(w2Var);
                w2Var.C.d("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), exc);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map;
        Map map2;
        InputStream inputStream;
        y4 y4Var = this.f32945v;
        w3 w3Var = y4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.l();
        y3 y3Var = y4Var.f32943u;
        int i6 = 0;
        try {
            URLConnection openConnection = this.f32944u.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDefaultUseCaches(false);
                y3Var.getClass();
                ?? r42 = 60000;
                ?? r43 = 60000;
                httpURLConnection.setConnectTimeout(60000);
                y3Var.getClass();
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                    while (true) {
                                        int read = inputStream.read(bArr);
                                        if (read > 0) {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                        } else {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            a(responseCode, null, byteArray, headerFields);
                                            return;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            r43 = 0;
                            IOException iOException = e;
                            i6 = responseCode;
                            e = iOException;
                            map2 = r43;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i6, e, null, map2);
                        } catch (Throwable th4) {
                            th = th4;
                            r42 = 0;
                            Throwable th5 = th;
                            i6 = responseCode;
                            th = th5;
                            map = r42;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i6, null, null, map);
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        IOException iOException2 = e;
                        i6 = responseCode;
                        e = iOException2;
                        map2 = r43;
                        if (httpURLConnection != null) {
                        }
                        a(i6, e, null, map2);
                    } catch (Throwable th6) {
                        th = th6;
                        Throwable th52 = th;
                        i6 = responseCode;
                        th = th52;
                        map = r42;
                        if (httpURLConnection != null) {
                        }
                        a(i6, null, null, map);
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                    map2 = null;
                    if (httpURLConnection != null) {
                    }
                    a(i6, e, null, map2);
                } catch (Throwable th7) {
                    th = th7;
                    map = null;
                    if (httpURLConnection != null) {
                    }
                    a(i6, null, null, map);
                    throw th;
                }
            } else {
                throw new IOException("Failed to obtain HTTP connection");
            }
        } catch (IOException e13) {
            e = e13;
            httpURLConnection = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
        }
    }
}
