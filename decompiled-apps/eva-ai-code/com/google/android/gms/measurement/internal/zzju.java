package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzju implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzju(zzjy zzjyVar, ComponentName componentName) {
        this.zzb = zzjyVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz.zzo(this.zzb.zza, this.zza);
    }
}
