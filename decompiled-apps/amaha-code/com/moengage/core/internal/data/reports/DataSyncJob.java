package com.moengage.core.internal.data.reports;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import hh.g;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import nd.z;
import yg.n;
/* compiled from: DataSyncJob.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/moengage/core/internal/data/reports/DataSyncJob;", "Landroid/app/job/JobService;", "Lfh/b;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DataSyncJob extends JobService implements fh.b {

    /* renamed from: u  reason: collision with root package name */
    public final String f10161u = "Core_DataSyncJob";

    /* compiled from: DataSyncJob.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" jobComplete() : Job completed. Releasing lock.", DataSyncJob.this.f10161u);
        }
    }

    /* compiled from: DataSyncJob.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" jobComplete() : ", DataSyncJob.this.f10161u);
        }
    }

    /* compiled from: DataSyncJob.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStartJob() : ", DataSyncJob.this.f10161u);
        }
    }

    /* compiled from: DataSyncJob.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStartJob() : ", DataSyncJob.this.f10161u);
        }
    }

    @Override // fh.b
    public final void a(c9.d dVar) {
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new a(), 3);
            jobFinished((JobParameters) dVar.f5133c, dVar.f5132b);
        } catch (Throwable th2) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, th2, new b());
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        String string;
        i.g(params, "params");
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new c(), 3);
            string = params.getExtras().getString("sync_type");
        } catch (Throwable th2) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, th2, new d());
        }
        if (string == null) {
            return false;
        }
        ScheduledExecutorService scheduledExecutorService = n.f38599a;
        Context applicationContext = getApplicationContext();
        i.f(applicationContext, "applicationContext");
        n.a(applicationContext, new z(params, this), string);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters params) {
        i.g(params, "params");
        return false;
    }
}
