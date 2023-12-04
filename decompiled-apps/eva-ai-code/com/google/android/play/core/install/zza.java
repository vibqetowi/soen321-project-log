package com.google.android.play.core.install;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zza extends InstallState {
    private final int zza;
    private final long zzb;
    private final long zzc;
    private final int zzd;
    private final String zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(int i, long j, long j2, int i2, String str) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.zze = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.zza == installState.installStatus() && this.zzb == installState.bytesDownloaded() && this.zzc == installState.totalBytesToDownload() && this.zzd == installState.installErrorCode() && this.zze.equals(installState.packageName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zzb;
        long j2 = this.zzc;
        return ((((((((this.zza ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.zzd) * 1000003) ^ this.zze.hashCode();
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int installErrorCode() {
        return this.zzd;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int installStatus() {
        return this.zza;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.zze;
    }

    public final String toString() {
        int i = this.zza;
        long j = this.zzb;
        long j2 = this.zzc;
        int i2 = this.zzd;
        String str = this.zze;
        return "InstallState{installStatus=" + i + ", bytesDownloaded=" + j + ", totalBytesToDownload=" + j2 + ", installErrorCode=" + i2 + ", packageName=" + str + "}";
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.zzc;
    }
}
