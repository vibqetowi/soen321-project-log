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
import is.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import lk.b;
import lk.c;
/* compiled from: CampaignAssetDownloadJobScheduler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/assetDownloader/CampaignAssetDownloadJobScheduler;", "Landroid/app/job/JobService;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CampaignAssetDownloadJobScheduler extends JobService {

    /* renamed from: u  reason: collision with root package name */
    public JobParameters f10610u;

    /* renamed from: v  reason: collision with root package name */
    public a f10611v;

    /* compiled from: CampaignAssetDownloadJobScheduler.kt */
    /* loaded from: classes2.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
            r5 = r3.getFileUrl();
            r3 = r3.getMetaInfo();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
            if (r3 == null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
            r3 = (java.lang.String) is.u.j2(0, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
            if (r3 != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
            r3 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
            r1.add(new hs.f<>(r5, r3));
         */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Void doInBackground(Void[] voidArr) {
            Void[] params = voidArr;
            i.g(params, "params");
            Context applicationContext = CampaignAssetDownloadJobScheduler.this.getApplicationContext();
            i.f(applicationContext, "applicationContext");
            c cVar = new c(applicationContext);
            try {
                if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourse() != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<f<String, String>> arrayList = cVar.f24400b;
                    ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                    Iterator<f<String, String>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().f19464u);
                    }
                    hashSet.addAll(arrayList2);
                    Iterator<OfflineAsset> it2 = ApplicationPersistence.getInstance().getCampaignAssets().iterator();
                    while (true) {
                        boolean z10 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        OfflineAsset next = it2.next();
                        if (!next.isDownloaded() && !hashSet.contains(next.getFileUrl())) {
                            String fileUrl = next.getFileUrl();
                            if (fileUrl != null && fileUrl.length() != 0) {
                                z10 = false;
                            }
                        }
                    }
                    String[] strArr = {"offer_plus", "plus", "pro", "timebound"};
                    if (arrayList.size() > 1) {
                        p.P1(arrayList, new b(strArr));
                    }
                    if (arrayList.size() > 0) {
                        cVar.c();
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
            CampaignAssetDownloadJobScheduler campaignAssetDownloadJobScheduler = CampaignAssetDownloadJobScheduler.this;
            campaignAssetDownloadJobScheduler.jobFinished(campaignAssetDownloadJobScheduler.f10610u, false);
            super.onPostExecute(r42);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        i.g(jobParameters, "jobParameters");
        this.f10610u = jobParameters;
        try {
            a aVar = new a();
            this.f10611v = aVar;
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
        a aVar = this.f10611v;
        if (aVar != null) {
            i.d(aVar);
            aVar.cancel(true);
        }
        return true;
    }
}
