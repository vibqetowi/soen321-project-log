package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.work.n;
import k9.d0;
import ta.d6;
import ta.p5;
import ta.q5;
import ta.w2;
import ta.y3;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements p5 {

    /* renamed from: u  reason: collision with root package name */
    public q5 f8739u;

    @Override // ta.p5
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final q5 c() {
        if (this.f8739u == null) {
            this.f8739u = new q5(this);
        }
        return this.f8739u;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        q5 c10 = c();
        w2 w2Var = y3.s(c10.f32832a, null, null).C;
        y3.k(w2Var);
        String string = jobParameters.getExtras().getString("action");
        w2Var.H.c(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            d0 d0Var = new d0(12, c10, w2Var, jobParameters);
            d6 N = d6.N(c10.f32832a);
            N.a().p(new n(20, N, d0Var));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().b(intent);
        return true;
    }

    @Override // ta.p5
    public final boolean u(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // ta.p5
    public final void a(Intent intent) {
    }
}
