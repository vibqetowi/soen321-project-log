package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import d7.j;
import d7.s;
import d7.w;
import g.v;
import j7.e;
import n7.a;
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f6153u = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i6 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        w.b(getApplicationContext());
        j.a a10 = s.a();
        a10.b(string);
        a10.c(a.b(i6));
        if (string2 != null) {
            a10.f12245b = Base64.decode(string2, 0);
        }
        j7.j jVar = w.a().f12271d;
        j a11 = a10.a();
        v vVar = new v(this, 27, jobParameters);
        jVar.getClass();
        jVar.f21728e.execute(new e(jVar, a11, i10, vVar, 0));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
