package com.google.android.play.core.splitcompat;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzp implements com.google.android.play.core.splitinstall.zzq {
    final /* synthetic */ SplitCompat zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(SplitCompat splitCompat) {
        this.zza = splitCompat;
    }

    @Override // com.google.android.play.core.splitinstall.zzq
    public final Set zza() {
        Set zzf;
        zzf = this.zza.zzf();
        return zzf;
    }
}
