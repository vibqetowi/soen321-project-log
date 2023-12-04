package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public class zzjx extends zzjw {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjx(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzka) && zzd() == ((zzka) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzjx) {
                zzjx zzjxVar = (zzjx) obj;
                int zzk = zzk();
                int zzk2 = zzjxVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd > zzjxVar.zzd()) {
                        throw new IllegalArgumentException("Length too large: " + zzd + zzd());
                    } else if (zzd <= zzjxVar.zzd()) {
                        if (zzjxVar instanceof zzjx) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzjxVar.zza;
                            zzjxVar.zzc();
                            int i = 0;
                            int i2 = 0;
                            while (i < zzd) {
                                if (bArr[i] != bArr2[i2]) {
                                    return false;
                                }
                                i++;
                                i2++;
                            }
                            return true;
                        }
                        return zzjxVar.zzf(0, zzd).equals(zzf(0, zzd));
                    } else {
                        throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzjxVar.zzd());
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i) {
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    protected final int zze(int i, int i2, int i3) {
        return zzlj.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i, int i2) {
        int zzj = zzj(0, i2, zzd());
        return zzj == 0 ? zzka.zzb : new zzju(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzka
    public final void zzh(zzjq zzjqVar) throws IOException {
        ((zzkf) zzjqVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return zznz.zze(this.zza, 0, zzd());
    }
}
