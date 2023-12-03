package j7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import d7.s;
import j7.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
/* compiled from: JobInfoScheduler.java */
/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21697a;

    /* renamed from: b  reason: collision with root package name */
    public final k7.d f21698b;

    /* renamed from: c  reason: collision with root package name */
    public final d f21699c;

    public c(Context context, k7.d dVar, d dVar2) {
        this.f21697a = context;
        this.f21698b = dVar;
        this.f21699c = dVar2;
    }

    @Override // j7.m
    public final void a(s sVar, int i6) {
        b(sVar, i6, false);
    }

    @Override // j7.m
    public final void b(s sVar, int i6, boolean z10) {
        boolean z11;
        Context context = this.f21697a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(n7.a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i6) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                h7.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sVar);
                return;
            }
        }
        long Y = this.f21698b.Y(sVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        a7.d d10 = sVar.d();
        d dVar = this.f21699c;
        builder.setMinimumLatency(dVar.b(d10, Y, i6));
        Set<d.b> b10 = dVar.c().get(d10).b();
        if (b10.contains(d.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b10.contains(d.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b10.contains(d.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i6);
        persistableBundle.putString("backendName", sVar.b());
        persistableBundle.putInt("priority", n7.a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(sVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sVar, Integer.valueOf(value), Long.valueOf(dVar.b(sVar.d(), Y, i6)), Long.valueOf(Y), Integer.valueOf(i6)};
        String c10 = h7.a.c("JobInfoScheduler");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
