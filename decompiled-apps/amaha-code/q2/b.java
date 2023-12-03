package q2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.q;
import androidx.work.u;
import g.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import n2.a0;
import n2.r;
import v2.i;
import v2.l;
import v2.s;
/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: y  reason: collision with root package name */
    public static final String f29115y = q.f("SystemJobScheduler");

    /* renamed from: u  reason: collision with root package name */
    public final Context f29116u;

    /* renamed from: v  reason: collision with root package name */
    public final JobScheduler f29117v;

    /* renamed from: w  reason: collision with root package name */
    public final a0 f29118w;

    /* renamed from: x  reason: collision with root package name */
    public final a f29119x;

    public b(Context context, a0 a0Var) {
        a aVar = new a(context);
        this.f29116u = context;
        this.f29118w = a0Var;
        this.f29117v = (JobScheduler) context.getSystemService("jobscheduler");
        this.f29119x = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i6) {
        try {
            jobScheduler.cancel(i6);
        } catch (Throwable th2) {
            q.d().c(f29115y, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i6)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler, String str) {
        ArrayList f = f(context, jobScheduler);
        if (f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = f.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            l g5 = g(jobInfo);
            if (g5 != null && str.equals(g5.f34722a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            q.d().c(f29115y, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static l g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // n2.r
    public final void b(s... sVarArr) {
        int intValue;
        ArrayList e10;
        int intValue2;
        a0 a0Var = this.f29118w;
        WorkDatabase workDatabase = a0Var.f25794c;
        final x xVar = new x(workDatabase);
        for (s sVar : sVarArr) {
            workDatabase.c();
            try {
                s p10 = workDatabase.u().p(sVar.f34734a);
                String str = f29115y;
                String str2 = sVar.f34734a;
                if (p10 == null) {
                    q.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.n();
                } else if (p10.f34735b != u.a.ENQUEUED) {
                    q.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.n();
                } else {
                    l a02 = ca.a.a0(sVar);
                    i c10 = workDatabase.r().c(a02);
                    if (c10 != null) {
                        intValue = c10.f34717c;
                    } else {
                        androidx.work.b bVar = a0Var.f25793b;
                        final int i6 = bVar.f3219g;
                        final int i10 = bVar.f3220h;
                        Object m10 = ((WorkDatabase) xVar.f16143v).m(new Callable() { // from class: w2.g
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                boolean z10;
                                g.x this$0 = g.x.this;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int f = hc.d.f((WorkDatabase) this$0.f16143v, "next_job_scheduler_id");
                                int i11 = i6;
                                if (i11 <= f && f <= i10) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    ((WorkDatabase) this$0.f16143v).q().a(new v2.d("next_job_scheduler_id", Long.valueOf(i11 + 1)));
                                    f = i11;
                                }
                                return Integer.valueOf(f);
                            }
                        });
                        kotlin.jvm.internal.i.f(m10, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) m10).intValue();
                    }
                    if (c10 == null) {
                        a0Var.f25794c.r().e(new i(a02.f34722a, a02.f34723b, intValue));
                    }
                    h(sVar, intValue);
                    if (Build.VERSION.SDK_INT == 23 && (e10 = e(this.f29116u, this.f29117v, str2)) != null) {
                        int indexOf = e10.indexOf(Integer.valueOf(intValue));
                        if (indexOf >= 0) {
                            e10.remove(indexOf);
                        }
                        if (!e10.isEmpty()) {
                            intValue2 = ((Integer) e10.get(0)).intValue();
                        } else {
                            androidx.work.b bVar2 = a0Var.f25793b;
                            final int i11 = bVar2.f3219g;
                            final int i12 = bVar2.f3220h;
                            Object m11 = ((WorkDatabase) xVar.f16143v).m(new Callable() { // from class: w2.g
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    boolean z10;
                                    g.x this$0 = g.x.this;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    int f = hc.d.f((WorkDatabase) this$0.f16143v, "next_job_scheduler_id");
                                    int i112 = i11;
                                    if (i112 <= f && f <= i12) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        ((WorkDatabase) this$0.f16143v).q().a(new v2.d("next_job_scheduler_id", Long.valueOf(i112 + 1)));
                                        f = i112;
                                    }
                                    return Integer.valueOf(f);
                                }
                            });
                            kotlin.jvm.internal.i.f(m11, "workDatabase.runInTransa…            id\n        })");
                            intValue2 = ((Number) m11).intValue();
                        }
                        h(sVar, intValue2);
                    }
                    workDatabase.n();
                    workDatabase.j();
                }
                workDatabase.j();
            } catch (Throwable th2) {
                workDatabase.j();
                throw th2;
            }
        }
    }

    @Override // n2.r
    public final boolean c() {
        return true;
    }

    @Override // n2.r
    public final void d(String str) {
        Context context = this.f29116u;
        JobScheduler jobScheduler = this.f29117v;
        ArrayList e10 = e(context, jobScheduler, str);
        if (e10 != null && !e10.isEmpty()) {
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                a(jobScheduler, ((Integer) it.next()).intValue());
            }
            this.f29118w.f25794c.r().d(str);
        }
    }

    public final void h(s sVar, int i6) {
        int i10;
        JobScheduler jobScheduler = this.f29117v;
        JobInfo a10 = this.f29119x.a(sVar, i6);
        q d10 = q.d();
        StringBuilder sb2 = new StringBuilder("Scheduling work ID ");
        String str = sVar.f34734a;
        sb2.append(str);
        sb2.append("Job ID ");
        sb2.append(i6);
        String sb3 = sb2.toString();
        String str2 = f29115y;
        d10.a(str2, sb3);
        try {
            if (jobScheduler.schedule(a10) == 0) {
                q d11 = q.d();
                d11.g(str2, "Unable to schedule work ID " + str);
                if (sVar.f34749q && sVar.r == 1) {
                    sVar.f34749q = false;
                    q.d().a(str2, String.format("Scheduling a non-expedited job (work ID %s)", str));
                    h(sVar, i6);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList f = f(this.f29116u, jobScheduler);
            if (f != null) {
                i10 = f.size();
            } else {
                i10 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i10);
            a0 a0Var = this.f29118w;
            objArr[1] = Integer.valueOf(a0Var.f25794c.u().i().size());
            androidx.work.b bVar = a0Var.f25793b;
            int i11 = Build.VERSION.SDK_INT;
            int i12 = bVar.f3221i;
            if (i11 == 23) {
                i12 /= 2;
            }
            objArr[2] = Integer.valueOf(i12);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            q.d().b(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e10);
            a0Var.f25793b.getClass();
            throw illegalStateException;
        } catch (Throwable th2) {
            q d12 = q.d();
            d12.c(str2, "Unable to schedule " + sVar, th2);
        }
    }
}
