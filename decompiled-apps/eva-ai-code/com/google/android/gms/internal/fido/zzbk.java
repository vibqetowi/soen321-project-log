package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
class zzbk extends zzbl {
    final zzbh zzb;
    @CheckForNull
    final Character zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(zzbh zzbhVar, @CheckForNull Character ch) {
        this.zzb = zzbhVar;
        if (!(ch == null || !zzbhVar.zzb(ch.charValue()))) {
            throw new IllegalArgumentException(zzat.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzbk) {
            zzbk zzbkVar = (zzbk) obj;
            if (this.zzb.equals(zzbkVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzbkVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return hashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzas.zze(0, i2, bArr.length);
        while (i3 < i2) {
            zzc(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    final int zzb(int i) {
        zzbh zzbhVar = this.zzb;
        return zzbhVar.zzc * zzbn.zza(i, zzbhVar.zzd, RoundingMode.CEILING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzas.zze(i, i + i2, bArr.length);
        int i3 = 0;
        zzas.zzc(i2 <= this.zzb.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.zzb.zzb;
        while (i3 < i2 * 8) {
            zzbh zzbhVar = this.zzb;
            appendable.append(zzbhVar.zza(zzbhVar.zza & ((int) (j >>> (i5 - i3)))));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i3 += this.zzb.zzb;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(String str, String str2, @CheckForNull Character ch) {
        this(new zzbh(str, str2.toCharArray()), ch);
    }
}
