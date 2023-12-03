package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: TopicsSyncTask.java */
/* loaded from: classes.dex */
public final class i0 implements Runnable {
    public static Boolean A;
    public static Boolean B;

    /* renamed from: z  reason: collision with root package name */
    public static final Object f9731z = new Object();

    /* renamed from: u  reason: collision with root package name */
    public final Context f9732u;

    /* renamed from: v  reason: collision with root package name */
    public final u f9733v;

    /* renamed from: w  reason: collision with root package name */
    public final PowerManager.WakeLock f9734w;

    /* renamed from: x  reason: collision with root package name */
    public final h0 f9735x;

    /* renamed from: y  reason: collision with root package name */
    public final long f9736y;

    /* compiled from: TopicsSyncTask.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public i0 f9737a;

        public a(i0 i0Var) {
            this.f9737a = i0Var;
        }

        public final void a() {
            boolean z10;
            if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            i0.this.f9732u.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:11:0x000f, B:13:0x0018, B:15:0x001e, B:21:0x002a, B:22:0x0031), top: B:28:0x0001 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized void onReceive(Context context, Intent intent) {
            boolean z10;
            i0 i0Var = this.f9737a;
            if (i0Var == null) {
                return;
            }
            if (!i0Var.d()) {
                return;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                z10 = false;
                if (z10) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                i0 i0Var2 = this.f9737a;
                i0Var2.f9735x.f.schedule(i0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f9737a = null;
            }
            z10 = true;
            if (z10) {
            }
            i0 i0Var22 = this.f9737a;
            i0Var22.f9735x.f.schedule(i0Var22, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f9737a = null;
        }
    }

    public i0(h0 h0Var, Context context, u uVar, long j10) {
        this.f9735x = h0Var;
        this.f9732u = context;
        this.f9736y = j10;
        this.f9733v = uVar;
        this.f9734w = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f9731z) {
            Boolean bool = B;
            if (bool == null) {
                booleanValue = b("android.permission.ACCESS_NETWORK_STATE", bool, context);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            B = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean b(String str, Boolean bool, Context context) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f9731z) {
            Boolean bool = A;
            if (bool == null) {
                booleanValue = b("android.permission.WAKE_LOCK", bool, context);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            A = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9732u.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var = this.f9735x;
        Context context = this.f9732u;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f9734w;
        if (c10) {
            wakeLock.acquire(f.f9705a);
        }
        try {
            try {
                synchronized (h0Var) {
                    h0Var.f9728g = true;
                }
            } catch (Throwable th2) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            h0Var.f(false);
            if (!c(context)) {
                return;
            }
        }
        if (!this.f9733v.e()) {
            h0Var.f(false);
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } else if (a(context) && !d()) {
            new a(this).a();
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } else {
            if (h0Var.g()) {
                h0Var.f(false);
            } else {
                h0Var.h(this.f9736y);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused4) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        }
    }
}
