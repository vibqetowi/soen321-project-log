package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zacy implements Runnable {
    final /* synthetic */ Result zaa;
    final /* synthetic */ zada zab;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zacy(zada zadaVar, Result result) {
        this.zab = zadaVar;
        this.zaa = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zacz zaczVar;
        zacz zaczVar2;
        WeakReference weakReference;
        GoogleApiClient googleApiClient;
        WeakReference weakReference2;
        ResultTransform resultTransform;
        zacz zaczVar3;
        zacz zaczVar4;
        WeakReference weakReference3;
        try {
            try {
                BasePendingResult.zaa.set(true);
                resultTransform = this.zab.zaa;
                PendingResult onSuccess = ((ResultTransform) Preconditions.checkNotNull(resultTransform)).onSuccess(this.zaa);
                zada zadaVar = this.zab;
                zaczVar3 = zadaVar.zah;
                zaczVar4 = zadaVar.zah;
                zaczVar3.sendMessage(zaczVar4.obtainMessage(0, onSuccess));
                BasePendingResult.zaa.set(false);
                zada zadaVar2 = this.zab;
                zada.zan(this.zaa);
                weakReference3 = this.zab.zag;
                googleApiClient = (GoogleApiClient) weakReference3.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e) {
                zada zadaVar3 = this.zab;
                zaczVar = zadaVar3.zah;
                zaczVar2 = zadaVar3.zah;
                zaczVar.sendMessage(zaczVar2.obtainMessage(1, e));
                BasePendingResult.zaa.set(false);
                zada zadaVar4 = this.zab;
                zada.zan(this.zaa);
                weakReference = this.zab.zag;
                googleApiClient = (GoogleApiClient) weakReference.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.zab);
        } catch (Throwable th) {
            BasePendingResult.zaa.set(false);
            zada zadaVar5 = this.zab;
            zada.zan(this.zaa);
            weakReference2 = this.zab.zag;
            GoogleApiClient googleApiClient2 = (GoogleApiClient) weakReference2.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.zab);
            }
            throw th;
        }
    }
}
