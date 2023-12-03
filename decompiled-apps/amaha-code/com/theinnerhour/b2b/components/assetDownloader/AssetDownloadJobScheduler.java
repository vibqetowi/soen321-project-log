package com.theinnerhour.b2b.components.assetDownloader;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: AssetDownloadJobScheduler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/assetDownloader/AssetDownloadJobScheduler;", "Landroid/app/job/JobService;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AssetDownloadJobScheduler extends JobService {

    /* renamed from: u  reason: collision with root package name */
    public JobParameters f10607u;

    /* renamed from: v  reason: collision with root package name */
    public a f10608v;

    /* compiled from: AssetDownloadJobScheduler.kt */
    /* loaded from: classes2.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            ArrayList<f<String, String>> arrayList;
            boolean z10;
            Void[] params = voidArr;
            i.g(params, "params");
            Context applicationContext = AssetDownloadJobScheduler.this.getApplicationContext();
            i.f(applicationContext, "applicationContext");
            lk.a aVar = new lk.a(applicationContext);
            try {
                if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourse() != null) {
                    Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getCourseAssets().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        arrayList = aVar.f24396b;
                        if (!hasNext) {
                            break;
                        }
                        OfflineAsset next = it.next();
                        Iterator<f<String, String>> it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (i.b(it2.next().f19464u, next.getFileUrl())) {
                                    z10 = true;
                                    break;
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (!next.isDownloaded() && !z10) {
                            arrayList.add(new f<>(next.getFileUrl(), next.getMetaInfo().get(0)));
                        }
                    }
                    if (arrayList.size() > 0) {
                        aVar.c();
                        return null;
                    }
                    Intent intent = new Intent("com.theinnerhour.b2b.allAssetDownloadBroadcast");
                    intent.putExtra("asset_download_status", R.styleable.AppCompatTheme_switchStyle);
                    n1.a.a(MyApplication.V.a()).c(intent);
                    return null;
                }
                return null;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r42) {
            AssetDownloadJobScheduler assetDownloadJobScheduler = AssetDownloadJobScheduler.this;
            assetDownloadJobScheduler.jobFinished(assetDownloadJobScheduler.f10607u, false);
            super.onPostExecute(r42);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        i.g(jobParameters, "jobParameters");
        this.f10607u = jobParameters;
        try {
            a aVar = new a();
            this.f10608v = aVar;
            aVar.execute(new Void[0]);
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        i.g(jobParameters, "jobParameters");
        a aVar = this.f10608v;
        if (aVar != null) {
            i.d(aVar);
            aVar.cancel(true);
        }
        return true;
    }
}
