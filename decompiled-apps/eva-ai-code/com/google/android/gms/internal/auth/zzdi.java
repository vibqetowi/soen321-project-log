package com.google.android.gms.internal.auth;

import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzdi extends zzdh {
    private final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdi(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzdi) {
            return this.zza.equals(((zzdi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return true;
    }
}
