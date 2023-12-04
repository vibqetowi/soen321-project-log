package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgx extends zzgw {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgx(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    protected void zzaC() {
    }

    protected abstract boolean zzf();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzv() {
        if (!zzy()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzt.zzB();
        this.zza = true;
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaC();
        this.zzt.zzB();
        this.zza = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzy() {
        return this.zza;
    }
}
