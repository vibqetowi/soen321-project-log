package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zab implements zah {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ Bundle zab;
    final /* synthetic */ Bundle zac;
    final /* synthetic */ DeferredLifecycleHelper zad;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zad = deferredLifecycleHelper;
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.zad.zaa;
        lifecycleDelegate2.onInflate(this.zaa, this.zab, this.zac);
    }
}
