package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzef;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes7.dex */
final class zzc implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzef zzefVar;
        zzefVar = this.zza.zzb;
        return zzefVar.zzh();
    }
}
