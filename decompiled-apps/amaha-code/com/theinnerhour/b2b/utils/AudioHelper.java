package com.theinnerhour.b2b.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.work.r;
import androidx.work.u;
import androidx.work.v;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import hr.p9;
import is.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import n2.a0;
/* compiled from: AudioHelper.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0002'*\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/utils/AudioHelper;", "", "", Constants.NOTIFICATION_URL, "Lkotlin/Function1;", "Landroidx/work/u$a;", "onStatusUpdate", "Lhs/k;", "downloadAudioFile", "registerDownloadReceivers", "destroy", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "TAG", "Landroidx/lifecycle/w;", "", "kotlin.jvm.PlatformType", "progressLiveData", "Landroidx/lifecycle/w;", "getProgressLiveData", "()Landroidx/lifecycle/w;", "downloadStatusLiveData", "getDownloadStatusLiveData", "Landroidx/work/v;", "workManager", "Landroidx/work/v;", "Landroidx/lifecycle/x;", "Landroidx/work/u;", "observer", "Landroidx/lifecycle/x;", "Ljava/util/UUID;", "taskID", "Ljava/util/UUID;", "com/theinnerhour/b2b/utils/AudioHelper$downloadProgressBroadcastReceiver$1", "downloadProgressBroadcastReceiver", "Lcom/theinnerhour/b2b/utils/AudioHelper$downloadProgressBroadcastReceiver$1;", "com/theinnerhour/b2b/utils/AudioHelper$downloadServiceBroadcastReceiver$1", "downloadServiceBroadcastReceiver", "Lcom/theinnerhour/b2b/utils/AudioHelper$downloadServiceBroadcastReceiver$1;", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AudioHelper {
    private final String TAG;
    private final Context context;
    private final AudioHelper$downloadProgressBroadcastReceiver$1 downloadProgressBroadcastReceiver;
    private final AudioHelper$downloadServiceBroadcastReceiver$1 downloadServiceBroadcastReceiver;
    private final w<Integer> downloadStatusLiveData;
    private x<u> observer;
    private final w<Integer> progressLiveData;
    private UUID taskID;
    private final String url;
    private v workManager;

    /* JADX WARN: Type inference failed for: r2v5, types: [com.theinnerhour.b2b.utils.AudioHelper$downloadProgressBroadcastReceiver$1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.theinnerhour.b2b.utils.AudioHelper$downloadServiceBroadcastReceiver$1] */
    public AudioHelper(Context context, String url) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(url, "url");
        this.context = context;
        this.url = url;
        this.TAG = LogHelper.INSTANCE.makeLogTag(AudioHelper.class);
        this.progressLiveData = new w<>(0);
        this.downloadStatusLiveData = new w<>(1);
        this.downloadProgressBroadcastReceiver = new BroadcastReceiver() { // from class: com.theinnerhour.b2b.utils.AudioHelper$downloadProgressBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String str;
                boolean z10;
                kotlin.jvm.internal.i.g(context2, "context");
                kotlin.jvm.internal.i.g(intent, "intent");
                try {
                    String stringExtra = intent.getStringExtra(DownloadUtil.DOWNLOADING_FILE_URL);
                    if (stringExtra != null && stringExtra.length() != 0) {
                        z10 = false;
                        if (z10 && kotlin.jvm.internal.i.b(stringExtra, AudioHelper.this.getUrl())) {
                            AudioHelper.this.getProgressLiveData().l(Integer.valueOf(intent.getIntExtra(DownloadUtil.DOWNLOADING_IN_PROGRESS_VALUE, 0)));
                            return;
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                } catch (Exception e10) {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    str = AudioHelper.this.TAG;
                    logHelper.e(str, "error in unregistering listener", e10);
                }
            }
        };
        this.downloadServiceBroadcastReceiver = new BroadcastReceiver() { // from class: com.theinnerhour.b2b.utils.AudioHelper$downloadServiceBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                kotlin.jvm.internal.i.g(context2, "context");
                kotlin.jvm.internal.i.g(intent, "intent");
                int intExtra = intent.getIntExtra(DownloadUtil.DOWNLOAD_STATUS, 1);
                AudioHelper.this.getDownloadStatusLiveData().l(Integer.valueOf(intExtra));
                if (intExtra == 100) {
                    n1.a.a(context2).d(this);
                }
            }
        };
    }

    public static final void downloadAudioFile$lambda$1(ss.l onStatusUpdate, u uVar) {
        kotlin.jvm.internal.i.g(onStatusUpdate, "$onStatusUpdate");
        if (uVar != null) {
            u.a aVar = uVar.f3340b;
            kotlin.jvm.internal.i.f(aVar, "it.state");
            onStatusUpdate.invoke(aVar);
        }
    }

    public final void destroy() {
        UUID uuid;
        v vVar;
        androidx.lifecycle.u b10;
        if (this.observer != null && (uuid = this.taskID) != null && (vVar = this.workManager) != null && (b10 = vVar.b(uuid)) != null) {
            x<u> xVar = this.observer;
            if (xVar != null) {
                b10.j(xVar);
            } else {
                kotlin.jvm.internal.i.q("observer");
                throw null;
            }
        }
        n1.a a10 = n1.a.a(this.context);
        a10.d(this.downloadProgressBroadcastReceiver);
        a10.d(this.downloadServiceBroadcastReceiver);
    }

    public final void downloadAudioFile(String url, ss.l<? super u.a, ? extends Object> onStatusUpdate) {
        Set set;
        kotlin.jvm.internal.i.g(url, "url");
        kotlin.jvm.internal.i.g(onStatusUpdate, "onStatusUpdate");
        if (Utils.INSTANCE.getAudioFilePath(url, this.context) != null) {
            return;
        }
        HashMap<String, OfflineAsset> offlineAssetsMap = ApplicationPersistence.getInstance().getOfflineAssetsMap();
        if (offlineAssetsMap.containsKey(url)) {
            OfflineAsset offlineAsset = offlineAssetsMap.get(url);
            kotlin.jvm.internal.i.d(offlineAsset);
            if (offlineAsset.getIsDownloading()) {
                return;
            }
        }
        a0 f = a0.f();
        if (f != null) {
            this.workManager = f;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 24) {
                set = is.u.M2(linkedHashSet);
            } else {
                set = y.f20678u;
            }
            new androidx.work.c(2, false, false, false, false, -1L, -1L, set);
            HashMap hashMap = new HashMap();
            hashMap.put("download_url", url);
            androidx.work.d dVar = new androidx.work.d(hashMap);
            androidx.work.d.b(dVar);
            r.a aVar = new r.a(DownloadWorkManager.class);
            aVar.f3355b.f34738e = dVar;
            r a10 = aVar.a();
            this.observer = new p9(5, onStatusUpdate);
            v vVar = this.workManager;
            if (vVar != null) {
                vVar.a(url, Collections.singletonList(a10));
            }
            UUID uuid = a10.f3351a;
            this.taskID = uuid;
            v vVar2 = this.workManager;
            if (vVar2 != null) {
                if (uuid != null) {
                    androidx.lifecycle.u b10 = vVar2.b(uuid);
                    if (b10 != null) {
                        Context context = this.context;
                        kotlin.jvm.internal.i.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        p pVar = (p) context;
                        x<u> xVar = this.observer;
                        if (xVar != null) {
                            b10.e(pVar, xVar);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("observer");
                            throw null;
                        }
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("taskID");
                throw null;
            }
            return;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public final Context getContext() {
        return this.context;
    }

    public final w<Integer> getDownloadStatusLiveData() {
        return this.downloadStatusLiveData;
    }

    public final w<Integer> getProgressLiveData() {
        return this.progressLiveData;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void registerDownloadReceivers() {
        n1.a a10 = n1.a.a(this.context);
        a10.b(this.downloadServiceBroadcastReceiver, new IntentFilter(DownloadUtil.DOWNLOAD_SERVICE_BROADCAST));
        a10.b(this.downloadProgressBroadcastReceiver, new IntentFilter(DownloadUtil.DOWNLOAD_PROGRESS_BROADCAST));
    }
}
