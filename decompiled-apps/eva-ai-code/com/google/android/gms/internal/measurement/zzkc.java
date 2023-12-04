package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkc extends zzke {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkc(byte[] bArr, int i, int i2, boolean z, zzkb zzkbVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzll {
        int i2 = this.zze;
        this.zze = 0;
        int i3 = this.zzc + this.zzd;
        this.zzc = i3;
        if (i3 > 0) {
            this.zzd = i3;
            this.zzc = i3 - i3;
        } else {
            this.zzd = 0;
        }
        return i2;
    }
}
