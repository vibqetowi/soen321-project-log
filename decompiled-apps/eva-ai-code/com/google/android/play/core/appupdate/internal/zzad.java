package com.google.android.play.core.appupdate.internal;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzad implements zzaf {
    private static final Object zza = new Object();
    private volatile zzaf zzb;
    private volatile Object zzc = zza;

    private zzad(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public static zzaf zzb(zzaf zzafVar) {
        zzafVar.getClass();
        return zzafVar instanceof zzad ? zzafVar : new zzad(zzafVar);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
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
}
