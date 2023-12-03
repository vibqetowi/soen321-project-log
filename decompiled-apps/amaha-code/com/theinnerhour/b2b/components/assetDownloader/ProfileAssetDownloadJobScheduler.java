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
import is.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import lk.e;
/* compiled from: ProfileAssetDownloadJobScheduler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/assetDownloader/ProfileAssetDownloadJobScheduler;", "Landroid/app/job/JobService;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileAssetDownloadJobScheduler extends JobService {

    /* renamed from: u  reason: collision with root package name */
    public JobParameters f10616u;

    /* renamed from: v  reason: collision with root package name */
    public a f10617v;

    /* compiled from: ProfileAssetDownloadJobScheduler.kt */
    /* loaded from: classes2.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            boolean z10;
            Void[] params = voidArr;
            i.g(params, "params");
            Context applicationContext = ProfileAssetDownloadJobScheduler.this.getApplicationContext();
            i.f(applicationContext, "applicationContext");
            e eVar = new e(applicationContext);
            try {
                if (FirebasePersistence.getInstance().getUser() != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<f<String, String>> arrayList = eVar.f24405b;
                    ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                    Iterator<f<String, String>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().f19464u);
                    }
                    hashSet.addAll(arrayList2);
                    Iterator<OfflineAsset> it2 = ApplicationPersistence.getInstance().getProfileAssets().iterator();
                    while (it2.hasNext()) {
                        OfflineAsset next = it2.next();
                        if (!next.isDownloaded() && !hashSet.contains(next.getFileUrl())) {
                            String fileUrl = next.getFileUrl();
                            if (fileUrl != null && fileUrl.length() != 0) {
                                z10 = false;
                                if (!z10 && !i.b(next.getFileUrl(), "https:")) {
                                    String fileUrl2 = next.getFileUrl();
                                    ArrayList<String> metaInfo = next.getMetaInfo();
                                    arrayList.add(new f<>(fileUrl2, (metaInfo != null || (r3 = (String) u.j2(0, metaInfo)) == null) ? "" : ""));
                                }
                            }
                            z10 = true;
                            if (!z10) {
                                String fileUrl22 = next.getFileUrl();
                                ArrayList<String> metaInfo2 = next.getMetaInfo();
                                arrayList.add(new f<>(fileUrl22, (metaInfo2 != null || (r3 = (String) u.j2(0, metaInfo2)) == null) ? "" : ""));
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        eVar.c();
                        return null;
                    }
                    Intent intent = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
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
            ProfileAssetDownloadJobScheduler profileAssetDownloadJobScheduler = ProfileAssetDownloadJobScheduler.this;
            profileAssetDownloadJobScheduler.jobFinished(profileAssetDownloadJobScheduler.f10616u, false);
            super.onPostExecute(r42);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        i.g(jobParameters, "jobParameters");
        this.f10616u = jobParameters;
        try {
            a aVar = new a();
            this.f10617v = aVar;
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
        a aVar = this.f10617v;
        if (aVar != null) {
            i.d(aVar);
            aVar.cancel(true);
        }
        return true;
    }
}
