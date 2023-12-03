package com.theinnerhour.b2b.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.AsyncTask;
import com.theinnerhour.b2b.utils.DownloadUtil;
import com.theinnerhour.b2b.utils.LogHelper;
/* loaded from: classes2.dex */
public class DownloadJobScheduler extends JobService {
    DownloadAsync downloadAsync;
    JobParameters jobParameters;

    /* loaded from: classes2.dex */
    public class DownloadAsync extends AsyncTask<Void, Void, Void> {
        private DownloadAsync() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            DownloadUtil downloadUtil = new DownloadUtil(DownloadJobScheduler.this.getApplicationContext());
            downloadUtil.downloadPendingFiles();
            downloadUtil.downloadFiles();
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r42) {
            DownloadJobScheduler downloadJobScheduler = DownloadJobScheduler.this;
            downloadJobScheduler.jobFinished(downloadJobScheduler.jobParameters, false);
            super.onPostExecute((DownloadAsync) r42);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        this.jobParameters = jobParameters;
        try {
            DownloadAsync downloadAsync = new DownloadAsync();
            this.downloadAsync = downloadAsync;
            downloadAsync.execute(new Void[0]);
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        DownloadAsync downloadAsync = this.downloadAsync;
        if (downloadAsync != null) {
            downloadAsync.cancel(true);
        }
        return true;
    }
}
