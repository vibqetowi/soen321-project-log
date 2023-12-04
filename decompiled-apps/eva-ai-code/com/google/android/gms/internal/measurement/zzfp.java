package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfp extends zzlb implements zzmj {
    private static final zzfp zza;
    private int zzd;
    private int zze;
    private zzgi zzf;
    private zzgi zzg;
    private boolean zzh;

    static {
        zzfp zzfpVar = new zzfp();
        zza = zzfpVar;
        zzlb.zzbO(zzfp.class, zzfpVar);
    }

    private zzfp() {
    }

    public static zzfo zzb() {
        return (zzfo) zza.zzbA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzfp zzfpVar, int i) {
        zzfpVar.zzd |= 1;
        zzfpVar.zze = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzfp zzfpVar, zzgi zzgiVar) {
        zzgiVar.getClass();
        zzfpVar.zzf = zzgiVar;
        zzfpVar.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzfp zzfpVar, zzgi zzgiVar) {
        zzfpVar.zzg = zzgiVar;
        zzfpVar.zzd |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfp zzfpVar, boolean z) {
        zzfpVar.zzd |= 8;
        zzfpVar.zzh = z;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgi zzd() {
        zzgi zzgiVar = this.zzf;
        return zzgiVar == null ? zzgi.zzg() : zzgiVar;
    }

    public final zzgi zze() {
        zzgi zzgiVar = this.zzg;
        return zzgiVar == null ? zzgi.zzg() : zzgiVar;
    }

    public final boolean zzj() {
        return this.zzh;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfo(null);
                }
                return new zzfp();
            }
            return zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean zzm() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zzd & 4) != 0;
    }
}
