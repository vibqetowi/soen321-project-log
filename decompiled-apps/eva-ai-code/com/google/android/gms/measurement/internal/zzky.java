package com.google.android.gms.measurement.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzky implements zzev {
    final /* synthetic */ String zza;
    final /* synthetic */ zzlh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzky(zzlh zzlhVar, String str) {
        this.zzb = zzlhVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzev
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i, th, bArr, this.zza);
    }
}
