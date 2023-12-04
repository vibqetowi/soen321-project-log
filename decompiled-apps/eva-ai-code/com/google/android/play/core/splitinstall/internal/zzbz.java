package com.google.android.play.core.splitinstall.internal;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzbz implements zzcb, zzby {
    private static final Object zza = new Object();
    private volatile zzcb zzb;
    private volatile Object zzc = zza;

    private zzbz(zzcb zzcbVar) {
        this.zzb = zzcbVar;
    }

    public static zzby zzb(zzcb zzcbVar) {
        if (zzcbVar instanceof zzby) {
            return (zzby) zzcbVar;
        }
        return new zzbz(zzcbVar);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final Object zza() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zza();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }

    public static zzcb zzc(zzcb zzcbVar) {
        zzcbVar.getClass();
        return zzcbVar instanceof zzbz ? zzcbVar : new zzbz(zzcbVar);
    }
}
