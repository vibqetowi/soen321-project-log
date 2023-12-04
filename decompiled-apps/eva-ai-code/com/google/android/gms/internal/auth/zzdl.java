package com.google.android.gms.internal.auth;

import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzdl implements zzdj {
    @CheckForNull
    volatile zzdj zza;
    volatile boolean zzb;
    @CheckForNull
    Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdl(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.zzc + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzdj zzdjVar = this.zza;
                    zzdjVar.getClass();
                    Object zza = zzdjVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
