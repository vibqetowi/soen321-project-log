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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: SyncTask.java */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final long f9694u;

    /* renamed from: v  reason: collision with root package name */
    public final PowerManager.WakeLock f9695v;

    /* renamed from: w  reason: collision with root package name */
    public final FirebaseMessaging f9696w;

    /* compiled from: SyncTask.java */
    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public d0 f9697a;

        public a(d0 d0Var) {
            this.f9697a = d0Var;
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
            this.f9697a.f9696w.f9647d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z10;
            d0 d0Var = this.f9697a;
            if (d0Var == null || !d0Var.a()) {
                return;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            d0 d0Var2 = this.f9697a;
            d0Var2.f9696w.getClass();
            FirebaseMessaging.b(d0Var2, 0L);
            this.f9697a.f9696w.f9647d.unregisterReceiver(this);
            this.f9697a = null;
        }
    }

    public d0(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ba.a("firebase-iid-executor"));
        this.f9696w = firebaseMessaging;
        this.f9694u = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f9647d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f9695v = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9696w.f9647d.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        boolean z10 = true;
        try {
            if (this.f9696w.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a10 = a0.a();
        FirebaseMessaging firebaseMessaging = this.f9696w;
        boolean c10 = a10.c(firebaseMessaging.f9647d);
        PowerManager.WakeLock wakeLock = this.f9695v;
        if (c10) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f9653k = true;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.g(false);
                if (!a0.a().c(firebaseMessaging.f9647d)) {
                    return;
                }
            }
            if (!firebaseMessaging.f9652j.e()) {
                firebaseMessaging.g(false);
                if (a0.a().c(firebaseMessaging.f9647d)) {
                    wakeLock.release();
                }
            } else if (a0.a().b(firebaseMessaging.f9647d) && !a()) {
                new a(this).a();
                if (a0.a().c(firebaseMessaging.f9647d)) {
                    wakeLock.release();
                }
            } else {
                if (b()) {
                    firebaseMessaging.g(false);
                } else {
                    firebaseMessaging.i(this.f9694u);
                }
                if (!a0.a().c(firebaseMessaging.f9647d)) {
                    return;
                }
                wakeLock.release();
            }
        } catch (Throwable th2) {
            if (a0.a().c(firebaseMessaging.f9647d)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
