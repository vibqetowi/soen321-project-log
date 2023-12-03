package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import gd.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import sc.e;
import v9.o;
import y9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.de  reason: invalid package */
/* loaded from: classes.dex */
public final class de extends AsyncTask {

    /* renamed from: g  reason: collision with root package name */
    public static final a f7789g = new a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a  reason: collision with root package name */
    public final String f7790a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7791b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f7792c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri.Builder f7793d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7794e;
    public final e f;

    public de(String str, String str2, Intent intent, e eVar, ee eeVar) {
        o.e(str);
        this.f7790a = str;
        this.f = eVar;
        o.e(str2);
        o.h(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        o.e(stringExtra);
        Uri.Builder buildUpon = Uri.parse(eeVar.f(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        o.h(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f7791b = buildUpon.build().toString();
        this.f7792c = new WeakReference(eeVar);
        this.f7793d = eeVar.d(intent, str, str2);
        this.f7794e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(ce ceVar) {
        String str;
        String str2;
        Uri.Builder builder;
        ee eeVar = (ee) this.f7792c.get();
        if (ceVar != null) {
            str = ceVar.f7765a;
            str2 = ceVar.f7766b;
        } else {
            str = null;
            str2 = null;
        }
        if (eeVar == null) {
            f7789g.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.f7793d) != null) {
            builder.authority(str);
            eeVar.Q(builder.build(), this.f7790a);
        } else {
            eeVar.g(i.a(str2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd A[Catch: zzvg -> 0x00fc, NullPointerException -> 0x0111, IOException -> 0x0126, TryCatch #1 {IOException -> 0x0126, blocks: (B:6:0x0017, B:19:0x009c, B:20:0x00bc, B:21:0x00d7, B:23:0x00dd, B:25:0x00eb, B:27:0x00f3, B:17:0x0086), top: B:39:0x0017 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        HttpURLConnection l2;
        int responseCode;
        String str;
        a aVar = f7789g;
        Void[] voidArr = (Void[]) objArr;
        String str2 = this.f7794e;
        if (!TextUtils.isEmpty(str2)) {
            ce ceVar = new ce();
            ceVar.f7765a = str2;
            return ceVar;
        }
        try {
            try {
                URL url = new URL(this.f7791b);
                ee eeVar = (ee) this.f7792c.get();
                l2 = eeVar.l(url);
                l2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
                l2.setConnectTimeout(60000);
                new ne(eeVar.a(), this.f, String.format("X%s", Integer.toString(le.a().f7969a))).a(l2);
                responseCode = l2.getResponseCode();
            } catch (IOException e10) {
                aVar.c("IOException occurred: ".concat(String.valueOf(e10.getMessage())), new Object[0]);
            }
        } catch (zzvg e11) {
            aVar.c("ConversionException encountered: ".concat(String.valueOf(e11.getMessage())), new Object[0]);
        } catch (NullPointerException e12) {
            aVar.c("Null pointer encountered: ".concat(String.valueOf(e12.getMessage())), new Object[0]);
        }
        if (responseCode != 200) {
            try {
            } catch (IOException e13) {
                Log.w(aVar.f38388a, aVar.d("Error parsing error message from response body in getErrorMessageFromBody. ".concat(e13.toString()), new Object[0]));
            }
            if (l2.getResponseCode() >= 400) {
                InputStream errorStream = l2.getErrorStream();
                if (errorStream == null) {
                    str = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
                } else {
                    str = (String) ie.a(new String(b(errorStream)), String.class);
                }
                aVar.c(String.format("Error getting project config. Failed with %s %s", str, Integer.valueOf(responseCode)), new Object[0]);
                ce ceVar2 = new ce();
                ceVar2.f7766b = str;
                return ceVar2;
            }
            str = null;
            aVar.c(String.format("Error getting project config. Failed with %s %s", str, Integer.valueOf(responseCode)), new Object[0]);
            ce ceVar22 = new ce();
            ceVar22.f7766b = str;
            return ceVar22;
        }
        Cif cif = new Cif();
        cif.a(new String(b(l2.getInputStream())));
        Iterator it = cif.f7893u.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.endsWith("firebaseapp.com") || str3.endsWith("web.app")) {
                ce ceVar3 = new ce();
                ceVar3.f7765a = str3;
                return ceVar3;
            }
            while (it.hasNext()) {
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(Object obj) {
        ce ceVar = (ce) obj;
        onPostExecute(null);
    }
}
