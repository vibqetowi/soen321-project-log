package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zao(zap zapVar, zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zaa.zaa) {
            ConnectionResult zab = this.zab.zab();
            if (zab.hasResolution()) {
                this.zaa.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(this.zaa.getActivity(), (PendingIntent) Preconditions.checkNotNull(zab.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            zap zapVar = this.zaa;
            if (zapVar.zac.getErrorResolutionIntent(zapVar.getActivity(), zab.getErrorCode(), null) != null) {
                zap zapVar2 = this.zaa;
                zapVar2.zac.zag(zapVar2.getActivity(), this.zaa.mLifecycleFragment, zab.getErrorCode(), 2, this.zaa);
            } else if (zab.getErrorCode() == 18) {
                zap zapVar3 = this.zaa;
                Dialog zab2 = zapVar3.zac.zab(zapVar3.getActivity(), this.zaa);
                zap zapVar4 = this.zaa;
                zapVar4.zac.zac(zapVar4.getActivity().getApplicationContext(), new zan(this, zab2));
            } else {
                this.zaa.zaa(zab, this.zab.zaa());
            }
        }
    }
}
