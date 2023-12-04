package com.google.android.play.core.appupdate;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzab {
    private zzi zza;

    private zzab() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzab(zzaa zzaaVar) {
    }

    public final zzab zzb(zzi zziVar) {
        this.zza = zziVar;
        return this;
    }

    public final zza zza() {
        zzi zziVar = this.zza;
        if (zziVar != null) {
            return new zzz(zziVar, null);
        }
        throw new IllegalStateException(String.valueOf(zzi.class.getCanonicalName()).concat(" must be set"));
    }
}
