package com.google.android.gms.internal.auth;

import java.io.Serializable;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzdk implements Serializable, zzdj {
    final zzdj zza;
    volatile transient boolean zzb;
    @CheckForNull
    transient Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdk(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.zzb) {
            obj = "<supplier that returned " + this.zzc + ">";
        } else {
            obj = this.zza;
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
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
