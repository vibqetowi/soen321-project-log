package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
/* compiled from: Metadata.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9779a;

    /* renamed from: b  reason: collision with root package name */
    public String f9780b;

    /* renamed from: c  reason: collision with root package name */
    public String f9781c;

    /* renamed from: d  reason: collision with root package name */
    public int f9782d;

    /* renamed from: e  reason: collision with root package name */
    public int f9783e = 0;

    public u(Context context) {
        this.f9779a = context;
    }

    public static String c(sc.e eVar) {
        eVar.b();
        String str = eVar.f31434c.f31448e;
        if (str != null) {
            return str;
        }
        eVar.b();
        String str2 = eVar.f31434c.f31445b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        if (this.f9780b == null) {
            f();
        }
        return this.f9780b;
    }

    public final synchronized String b() {
        if (this.f9781c == null) {
            f();
        }
        return this.f9781c;
    }

    public final PackageInfo d(String str) {
        try {
            return this.f9779a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public final boolean e() {
        int i6;
        synchronized (this) {
            i6 = this.f9783e;
            if (i6 == 0) {
                PackageManager packageManager = this.f9779a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i6 = 0;
                } else {
                    if (!aa.g.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f9783e = 1;
                            i6 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f9783e = 2;
                        i6 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (aa.g.a()) {
                            this.f9783e = 2;
                        } else {
                            this.f9783e = 1;
                        }
                        i6 = this.f9783e;
                    }
                }
            }
        }
        if (i6 != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void f() {
        PackageInfo d10 = d(this.f9779a.getPackageName());
        if (d10 != null) {
            this.f9780b = Integer.toString(d10.versionCode);
            this.f9781c = d10.versionName;
        }
    }
}
