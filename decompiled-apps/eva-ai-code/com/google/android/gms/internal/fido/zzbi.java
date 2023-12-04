package com.google.android.gms.internal.fido;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
final class zzbi extends zzbk {
    final char[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbi(String str, String str2) {
        super(r4, null);
        char[] cArr;
        zzbh zzbhVar = new zzbh("base16()", "0123456789ABCDEF".toCharArray());
        this.zza = new char[512];
        cArr = zzbhVar.zzf;
        zzas.zzc(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzbhVar.zza(i >>> 4);
            this.zza[i | 256] = zzbhVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbk, com.google.android.gms.internal.fido.zzbl
    final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzas.zze(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | 256]);
        }
    }
}
