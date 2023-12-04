package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzf extends zze {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        if (!zze()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzt.zzB();
        this.zza = true;
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzd();
        this.zzt.zzB();
        this.zza = true;
    }

    protected void zzd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze() {
        return this.zza;
    }

    protected abstract boolean zzf();
}
