package com.google.android.play.core.splitinstall.internal;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzo extends zzp {
    private final int zza;
    private final long zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            zzp zzpVar = (zzp) obj;
            if (this.zza == zzpVar.zza() && this.zzb == zzpVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        long j = this.zzb;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.zza;
        long j = this.zzb;
        return "EventRecord{eventType=" + i + ", eventTimestamp=" + j + "}";
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final long zzb() {
        return this.zzb;
    }
}
