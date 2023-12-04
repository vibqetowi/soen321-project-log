package com.google.android.play.core.splitinstall.testing;

import java.util.Map;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zza extends zzu {
    private Integer zza;
    private Map zzb;

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    final zzu zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzu zzb(Map map) {
        if (map != null) {
            this.zzb = map;
            return this;
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    final zzv zzc() {
        if (this.zzb == null) {
            throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
        }
        return new zzc(this.zza, this.zzb, null);
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    final Map zzd() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
