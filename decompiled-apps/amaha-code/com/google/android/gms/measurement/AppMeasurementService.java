package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.work.n;
import j1.a;
import ta.d4;
import ta.d6;
import ta.p5;
import ta.q5;
import ta.w2;
import ta.y3;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements p5 {

    /* renamed from: u  reason: collision with root package name */
    public q5 f8741u;

    @Override // ta.p5
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a.f21647u;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray2 = a.f21647u;
            synchronized (sparseArray2) {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            }
        }
    }

    @Override // ta.p5
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final q5 c() {
        if (this.f8741u == null) {
            this.f8741u = new q5(this);
        }
        return this.f8741u;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        q5 c10 = c();
        if (intent == null) {
            c10.c().f32925z.b("onBind called with null intent");
        } else {
            c10.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new d4(d6.N(c10.f32832a));
            }
            c10.c().C.c(action, "onBind received unknown action");
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        w2 w2Var = y3.s(c().f32832a, null, null).C;
        y3.k(w2Var);
        w2Var.H.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        w2 w2Var = y3.s(c().f32832a, null, null).C;
        y3.k(w2Var);
        w2Var.H.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().a(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i6, final int i10) {
        final q5 c10 = c();
        final w2 w2Var = y3.s(c10.f32832a, null, null).C;
        y3.k(w2Var);
        if (intent == null) {
            w2Var.C.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        w2Var.H.d("Local AppMeasurementService called. startId, action", Integer.valueOf(i10), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Runnable runnable = new Runnable() { // from class: ta.o5
                @Override // java.lang.Runnable
                public final void run() {
                    q5 q5Var = q5.this;
                    p5 p5Var = (p5) q5Var.f32832a;
                    int i11 = i10;
                    if (p5Var.u(i11)) {
                        w2Var.H.c(Integer.valueOf(i11), "Local AppMeasurementService processed last upload request. StartId");
                        q5Var.c().H.b("Completed wakeful intent.");
                        p5Var.a(intent);
                    }
                }
            };
            d6 N = d6.N(c10.f32832a);
            N.a().p(new n(20, N, runnable));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().b(intent);
        return true;
    }

    @Override // ta.p5
    public final boolean u(int i6) {
        return stopSelfResult(i6);
    }
}
