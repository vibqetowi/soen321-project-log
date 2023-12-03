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
import android.util.Log;
import androidx.fragment.app.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.d7;
import com.google.android.gms.internal.p000firebaseauthapi.de;
import com.google.android.gms.internal.p000firebaseauthapi.ee;
import com.google.android.gms.internal.p000firebaseauthapi.ye;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.Constants;
import f6.b;
import gd.b0;
import gd.c0;
import gd.i;
import gd.x;
import gd.y;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import n1.a;
import q.d;
import sc.e;
import tr.r;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public class RecaptchaActivity extends p implements ee {

    /* renamed from: v  reason: collision with root package name */
    public static final ExecutorService f9556v = d7.b();

    /* renamed from: w  reason: collision with root package name */
    public static long f9557w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final y f9558x = y.f16453b;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9559u = false;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final void Q(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                d a10 = new d.b().a();
                Intent intent = a10.f29097a;
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                a10.a(this, uri);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.putExtra("com.android.browser.application_id", str);
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            startActivity(intent2);
            return;
        }
        Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        g(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final Context a() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final Uri.Builder d(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        e f = e.f(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f);
        b0 b0Var = b0.f16395a;
        Context applicationContext = getApplicationContext();
        synchronized (b0Var) {
            o.e(str);
            o.e(uuid);
            SharedPreferences b10 = b0.b(applicationContext, str);
            b0.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", uuid), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", uuid), stringExtra3);
            edit.apply();
        }
        String c10 = c0.a(getApplicationContext(), f.g()).c();
        String str3 = null;
        if (TextUtils.isEmpty(c10)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            l0(i.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        firebaseAuth.d();
        if (!TextUtils.isEmpty(null)) {
            firebaseAuth.d();
        } else {
            str3 = r.z();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
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
        f9557w = 0L;
        this.f9559u = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).c(intent);
        f9558x.a(this);
        finish();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ee
    public final HttpURLConnection l(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            ee.f7825c.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void l0(Status status) {
        f9557w = 0L;
        this.f9559u = false;
        Intent intent = new Intent();
        HashMap hashMap = x.f16452a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).c(intent);
        f9558x.a(this);
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            k0();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f9557w < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f9557w = currentTimeMillis;
        if (bundle != null) {
            this.f9559u = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                l0(x.a(intent.getStringExtra("firebaseError")));
            } else if (intent.hasExtra(Constants.API_COURSE_LINK) && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra(Constants.API_COURSE_LINK);
                b0 b0Var = b0.f16395a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (b0Var) {
                    o.e(packageName);
                    o.e(stringExtra2);
                    SharedPreferences b10 = b0.b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
                    String string2 = b10.getString(format, null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
                    string = b10.getString(format2, null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str = string;
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                    l0(i.a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = c0.a(getApplicationContext(), e.f(str).g()).b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f9557w = 0L;
                this.f9559u = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!a.a(this).c(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong(ServerValues.NAME_OP_TIMESTAMP, System.currentTimeMillis());
                    edit2.commit();
                } else {
                    f9558x.a(this);
                }
                finish();
            } else {
                k0();
            }
        } else if (!this.f9559u) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                new de(packageName2, b.r0(aa.a.a(this, packageName2)).toLowerCase(Locale.US), intent3, e.f(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f9556v, new Void[0]);
            } catch (PackageManager.NameNotFoundException e10) {
                String obj = e10.toString();
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + " " + obj);
                g(null);
            }
            this.f9559u = true;
        } else {
            k0();
        }
    }

    @Override // androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f9559u);
    }
}
