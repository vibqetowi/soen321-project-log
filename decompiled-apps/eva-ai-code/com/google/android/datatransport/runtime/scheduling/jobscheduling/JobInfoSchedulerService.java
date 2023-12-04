package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import org.apache.commons.logging.LogFactory;
/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(AppLinks.KEY_NAME_EXTRAS);
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(getApplicationContext());
        TransportContext.Builder priority = TransportContext.builder().setBackendName(string).setPriority(PriorityMapping.valueOf(i));
        if (string2 != null) {
            priority.setExtras(Base64.decode(string2, 0));
        }
        TransportRuntime.getInstance().getUploader().upload(priority.build(), i2, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m6471x1ff6a938(jobParameters);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onStartJob$0$com-google-android-datatransport-runtime-scheduling-jobscheduling-JobInfoSchedulerService  reason: not valid java name */
    public /* synthetic */ void m6471x1ff6a938(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}
