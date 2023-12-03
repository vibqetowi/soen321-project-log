package com.theinnerhour.b2b.utils;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.p;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: DownloadWorkManager.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/theinnerhour/b2b/utils/DownloadWorkManager;", "Landroidx/work/Worker;", "Landroidx/work/p$a;", "doWork", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DownloadWorkManager extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorkManager(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public p.a doWork() {
        String str;
        Object obj = getInputData().f3236a.get("download_url");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        ArrayList<OfflineAsset> offlineAssets = ApplicationPersistence.getInstance().getOfflineAssets();
        HashMap<String, OfflineAsset> offlineAssetsMap = ApplicationPersistence.getInstance().getOfflineAssetsMap();
        if (str != null && !offlineAssetsMap.containsKey(str)) {
            offlineAssets.add(new OfflineAsset(Constants.COURSE_ALL_ID, "audio", str));
        }
        ApplicationPersistence.getInstance().setOfflineAssets(offlineAssets);
        if (new DownloadUtil(getApplicationContext()).downloadFileFromUrl(str)) {
            return new p.a.c();
        }
        return new p.a.C0043a();
    }
}
