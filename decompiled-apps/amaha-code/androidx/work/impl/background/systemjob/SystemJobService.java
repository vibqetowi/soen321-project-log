package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.appcompat.widget.l;
import androidx.work.WorkerParameters;
import androidx.work.q;
import java.util.Arrays;
import java.util.HashMap;
import n2.a0;
import n2.c;
import n2.t;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: x  reason: collision with root package name */
    public static final String f3291x = q.f("SystemJobService");

    /* renamed from: u  reason: collision with root package name */
    public a0 f3292u;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap f3293v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public final l f3294w = new l(2);

    /* loaded from: classes.dex */
    public static class a {
        public static String[] a(JobParameters jobParameters) {
            String[] triggeredContentAuthorities;
            triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
            return triggeredContentAuthorities;
        }

        public static Uri[] b(JobParameters jobParameters) {
            Uri[] triggeredContentUris;
            triggeredContentUris = jobParameters.getTriggeredContentUris();
            return triggeredContentUris;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Network a(JobParameters jobParameters) {
            Network network;
            network = jobParameters.getNetwork();
            return network;
        }
    }

    public static v2.l b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new v2.l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // n2.c
    public final void a(v2.l lVar, boolean z10) {
        JobParameters jobParameters;
        q d10 = q.d();
        String str = f3291x;
        d10.a(str, lVar.f34722a + " executed on JobScheduler");
        synchronized (this.f3293v) {
            jobParameters = (JobParameters) this.f3293v.remove(lVar);
        }
        this.f3294w.u(lVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            a0 e10 = a0.e(getApplicationContext());
            this.f3292u = e10;
            e10.f.b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                q.d().g(f3291x, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a0 a0Var = this.f3292u;
        if (a0Var != null) {
            a0Var.f.g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.f3292u == null) {
            q.d().a(f3291x, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        v2.l b10 = b(jobParameters);
        if (b10 == null) {
            q.d().b(f3291x, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f3293v) {
            if (this.f3293v.containsKey(b10)) {
                q d10 = q.d();
                String str = f3291x;
                d10.a(str, "Job is already being executed by SystemJobService: " + b10);
                return false;
            }
            q d11 = q.d();
            String str2 = f3291x;
            d11.a(str2, "onStartJob for " + b10);
            this.f3293v.put(b10, jobParameters);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f3210b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f3209a = Arrays.asList(a.a(jobParameters));
                }
                if (i6 >= 28) {
                    aVar.f3211c = b.a(jobParameters);
                }
            } else {
                aVar = null;
            }
            this.f3292u.j(this.f3294w.x(b10), aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f3292u == null) {
            q.d().a(f3291x, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        v2.l b10 = b(jobParameters);
        if (b10 == null) {
            q.d().b(f3291x, "WorkSpec id not found!");
            return false;
        }
        q d10 = q.d();
        String str = f3291x;
        d10.a(str, "onStopJob for " + b10);
        synchronized (this.f3293v) {
            this.f3293v.remove(b10);
        }
        t u10 = this.f3294w.u(b10);
        if (u10 != null) {
            this.f3292u.k(u10);
        }
        return !this.f3292u.f.e(b10.f34722a);
    }
}
