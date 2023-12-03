package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.p;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.d7;
import com.google.android.gms.internal.p000firebaseauthapi.de;
import com.google.android.gms.internal.p000firebaseauthapi.ee;
import com.google.android.gms.internal.p000firebaseauthapi.j;
import com.google.android.gms.internal.p000firebaseauthapi.ye;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.Constants;
import gd.b0;
import gd.c0;
import gd.i;
import gd.x;
import gd.y;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import n1.a;
import org.json.JSONException;
import org.json.JSONObject;
import q.d;
import q.f;
import sc.e;
import t.b;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends p implements ee {

    /* renamed from: w  reason: collision with root package name */
    public static long f9552w;

    /* renamed from: x  reason: collision with root package name */
    public static final y f9553x = y.f16453b;

    /* renamed from: u  reason: collision with root package name */
    public final ExecutorService f9554u = d7.b();

    /* renamed from: v  reason: collision with root package name */
    public boolean f9555v = false;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final void Q(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                d a10 = new d.b().a();
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                a10.a(this, uri);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        g(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final Context a() {
        return getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
        r8 = r14.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r15 >= r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r14 = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (r14 < 'A') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
        if (r14 > 'Z') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
        if (r17 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
        r8[r15] = (char) (r14 ^ ' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r14 = java.lang.String.valueOf(r8);
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri.Builder d(Intent intent, String str, String str2) {
        String str3;
        String jSONObject;
        String str4;
        boolean z10;
        Uri.Builder appendPath = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            str3 = TextUtils.join(",", stringArrayListExtra);
        } else {
            str3 = null;
        }
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str5 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str5);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str5, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        try {
            str4 = new String(MessageDigest.getInstance("SHA-256").digest(UUID.randomUUID().toString().getBytes()));
            int length = str4.length();
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                char charAt = str4.charAt(i6);
                if (charAt >= 'A' && charAt <= 'Z') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i6++;
            }
        } catch (NoSuchAlgorithmException unused2) {
            ee.f7825c.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            str4 = null;
        }
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        b0 b0Var = b0.f16395a;
        Context applicationContext = getApplicationContext();
        synchronized (b0Var) {
            o.e(str);
            o.e(uuid);
            o.e(str4);
            o.e(stringExtra4);
            SharedPreferences b10 = b0.b(applicationContext, str);
            b0.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", uuid), str4);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", uuid), action);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", uuid), stringExtra2);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", uuid), stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String c10 = c0.a(getApplicationContext(), e.f(stringExtra4).g()).c();
        if (TextUtils.isEmpty(c10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            l0(i.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
        } else if (str4 != null) {
            appendPath.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str4).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
            if (!TextUtils.isEmpty(str3)) {
                appendPath.appendQueryParameter("scopes", str3);
            }
            if (!TextUtils.isEmpty(jSONObject)) {
                appendPath.appendQueryParameter("customParameters", jSONObject);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                appendPath.appendQueryParameter("tid", stringExtra3);
                return appendPath;
            }
            return appendPath;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final String f(String str) {
        return ye.b(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final void g(Status status) {
        if (status == null) {
            k0();
        } else {
            l0(status);
        }
    }

    public final void k0() {
        f9552w = 0L;
        this.f9555v = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        boolean c10 = a.a(this).c(intent);
        y yVar = f9553x;
        if (!c10) {
            Status a10 = i.a("WEB_CONTEXT_CANCELED");
            yVar.getClass();
            y.b(this, a10);
        } else {
            yVar.a(this);
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final HttpURLConnection l(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public final void l0(Status status) {
        f9552w = 0L;
        this.f9555v = false;
        Intent intent = new Intent();
        HashMap hashMap = x.f16452a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        boolean c10 = a.a(this).c(intent);
        y yVar = f9553x;
        if (!c10) {
            Context applicationContext = getApplicationContext();
            yVar.getClass();
            y.b(applicationContext, status);
        } else {
            yVar.a(this);
        }
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            k0();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f9552w < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f9552w = currentTimeMillis;
        if (bundle != null) {
            this.f9555v = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        String lowerCase;
        e f;
        b bVar;
        f fVar;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                l0(x.a(intent.getStringExtra("firebaseError")));
            } else if (intent.hasExtra(Constants.API_COURSE_LINK) && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra(Constants.API_COURSE_LINK);
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (b0.f16395a) {
                    o.e(packageName);
                    o.e(stringExtra2);
                    SharedPreferences b10 = b0.b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", stringExtra2);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", stringExtra2);
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
                    String string = b10.getString(format, null);
                    String string2 = b10.getString(format2, null);
                    String string3 = b10.getString(format3, null);
                    String string4 = b10.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
                    String string5 = b10.getString(format4, null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    if (string != null && string2 != null && string3 != null) {
                        fVar = new f(string, string2, string3, string4, string5, 3);
                    } else {
                        fVar = null;
                    }
                }
                if (fVar == null) {
                    k0();
                }
                if (booleanExtra) {
                    stringExtra = c0.a(getApplicationContext(), e.f((String) fVar.f29108z).g()).b(stringExtra);
                }
                j jVar = new j(fVar, stringExtra);
                String str2 = (String) fVar.f29107y;
                String str3 = (String) fVar.f29105w;
                jVar.H = str2;
                if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str3) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str3) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str3)) {
                    Log.e("GenericIdpActivity", "unsupported operation: ".concat(str3));
                    k0();
                    return;
                }
                f9552w = 0L;
                this.f9555v = false;
                Intent intent2 = new Intent();
                Parcel obtain = Parcel.obtain();
                jVar.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str3);
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!a.a(this).c(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    Parcel obtain2 = Parcel.obtain();
                    jVar.writeToParcel(obtain2, 0);
                    byte[] marshall2 = obtain2.marshall();
                    obtain2.recycle();
                    if (marshall2 != null) {
                        str = Base64.encodeToString(marshall2, 10);
                    }
                    edit2.putString("verifyAssertionRequest", str);
                    edit2.putString("operation", str3);
                    edit2.putString("tenantId", str2);
                    edit2.putLong(ServerValues.NAME_OP_TIMESTAMP, System.currentTimeMillis());
                    edit2.commit();
                } else {
                    f9553x.a(this);
                }
                finish();
            } else {
                k0();
            }
        } else if (!this.f9555v) {
            String packageName2 = getPackageName();
            try {
                lowerCase = f6.b.r0(aa.a.a(this, packageName2)).toLowerCase(Locale.US);
                f = e.f(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                bVar = ye.f8261a;
                f.b();
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + e10.toString());
                g(null);
            }
            if (!bVar.containsKey(f.f31434c.f31444a)) {
                new de(packageName2, lowerCase, getIntent(), f, this).executeOnExecutor(this.f9554u, new Void[0]);
                this.f9555v = true;
                return;
            }
            f.b();
            ye.a(f.f31434c.f31444a);
            throw null;
        } else {
            k0();
        }
    }

    @Override // androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f9555v);
    }
}
