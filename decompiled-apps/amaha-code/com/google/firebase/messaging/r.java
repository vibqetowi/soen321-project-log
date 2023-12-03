package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
/* compiled from: GmsRpc.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final sc.e f9771a;

    /* renamed from: b  reason: collision with root package name */
    public final u f9772b;

    /* renamed from: c  reason: collision with root package name */
    public final r9.c f9773c;

    /* renamed from: d  reason: collision with root package name */
    public final re.b<mf.f> f9774d;

    /* renamed from: e  reason: collision with root package name */
    public final re.b<pe.g> f9775e;
    public final se.d f;

    public r(sc.e eVar, u uVar, re.b<mf.f> bVar, re.b<pe.g> bVar2, se.d dVar) {
        eVar.b();
        r9.c cVar = new r9.c(eVar.f31432a);
        this.f9771a = eVar;
        this.f9772b = uVar;
        this.f9773c = cVar;
        this.f9774d = bVar;
        this.f9775e = bVar2;
        this.f = dVar;
    }

    public final ya.h<String> a(ya.h<Bundle> hVar) {
        return hVar.continueWith(new oe.f(4), new am.w(8, this));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i6;
        String str3;
        int b10;
        PackageInfo d10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        sc.e eVar = this.f9771a;
        eVar.b();
        bundle.putString("gmp_app_id", eVar.f31434c.f31445b);
        u uVar = this.f9772b;
        synchronized (uVar) {
            if (uVar.f9782d == 0 && (d10 = uVar.d("com.google.android.gms")) != null) {
                uVar.f9782d = d10.versionCode;
            }
            i6 = uVar.f9782d;
        }
        bundle.putString("gmsv", Integer.toString(i6));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f9772b.a());
        bundle.putString("app_ver_name", this.f9772b.b());
        sc.e eVar2 = this.f9771a;
        eVar2.b();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(eVar2.f31433b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String a10 = ((se.g) ya.k.a(this.f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) ya.k.a(this.f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        pe.g gVar = this.f9775e.get();
        mf.f fVar = this.f9774d.get();
        if (gVar != null && fVar != null && (b10 = gVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(v.h.d(b10)));
            bundle.putString("Firebase-Client", fVar.a());
        }
    }

    public final ya.h<Bundle> c(String str, String str2, Bundle bundle) {
        int i6;
        PackageInfo packageInfo;
        try {
            b(str, str2, bundle);
            r9.c cVar = this.f9773c;
            r9.p pVar = cVar.f30612c;
            synchronized (pVar) {
                if (pVar.f30644b == 0) {
                    try {
                        packageInfo = ca.c.a(pVar.f30643a).b(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e10) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                        sb2.append("Failed to find package ");
                        sb2.append(valueOf);
                        Log.w("Metadata", sb2.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        pVar.f30644b = packageInfo.versionCode;
                    }
                }
                i6 = pVar.f30644b;
            }
            if (i6 < 12000000) {
                if (cVar.f30612c.a() != 0) {
                    return cVar.a(bundle).continueWithTask(r9.r.f30649u, new androidx.appcompat.widget.l(cVar, 19, bundle));
                }
                return ya.k.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            r9.o a10 = r9.o.a(cVar.f30611b);
            return a10.c(new r9.m(a10.b(), bundle, 1)).continueWith(r9.r.f30649u, kotlin.jvm.internal.b0.V);
        } catch (InterruptedException | ExecutionException e11) {
            return ya.k.d(e11);
        }
    }
}
