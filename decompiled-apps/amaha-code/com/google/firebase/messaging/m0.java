package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes.dex */
public final class m0 implements ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    public final Context f9754u;

    /* renamed from: v  reason: collision with root package name */
    public final Intent f9755v;

    /* renamed from: w  reason: collision with root package name */
    public final ScheduledExecutorService f9756w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayDeque f9757x;

    /* renamed from: y  reason: collision with root package name */
    public l0 f9758y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9759z;

    /* compiled from: WithinAppServiceConnection.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f9760a;

        /* renamed from: b  reason: collision with root package name */
        public final ya.i<Void> f9761b = new ya.i<>();

        public a(Intent intent) {
            this.f9760a = intent;
        }
    }

    public m0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ba.a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f9757x = new ArrayDeque();
        this.f9759z = false;
        Context applicationContext = context.getApplicationContext();
        this.f9754u = applicationContext;
        this.f9755v = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f9756w = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f9757x.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            l0 l0Var = this.f9758y;
            if (l0Var != null && l0Var.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f9758y.a((a) this.f9757x.poll());
            } else {
                c();
                return;
            }
        }
    }

    public final synchronized ya.v b(Intent intent) {
        a aVar;
        boolean z10;
        long j10;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f9756w;
        if ((aVar.f9760a.getFlags() & 268435456) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        je.o oVar = new je.o(9, aVar);
        if (z10) {
            j10 = k0.f9746a;
        } else {
            j10 = 9000;
        }
        aVar.f9761b.f38392a.addOnCompleteListener(scheduledExecutorService, new j0(2, scheduledExecutorService.schedule(oVar, j10, TimeUnit.MILLISECONDS)));
        this.f9757x.add(aVar);
        a();
        return aVar.f9761b.f38392a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f9759z);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f9759z) {
            return;
        }
        this.f9759z = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (z9.a.b().a(this.f9754u, this.f9755v, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f9759z = false;
        while (true) {
            ArrayDeque arrayDeque = this.f9757x;
            if (!arrayDeque.isEmpty()) {
                ((a) arrayDeque.poll()).f9761b.d(null);
            } else {
                return;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f9759z = false;
        if (!(iBinder instanceof l0)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f9757x;
                if (!arrayDeque.isEmpty()) {
                    ((a) arrayDeque.poll()).f9761b.d(null);
                } else {
                    return;
                }
            }
        } else {
            this.f9758y = (l0) iBinder;
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
