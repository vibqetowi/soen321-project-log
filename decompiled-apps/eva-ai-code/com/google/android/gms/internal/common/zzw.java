package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzw(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar;
        boolean z;
        zzoVar = zzxVar.zza;
        this.zzc = zzoVar;
        z = zzxVar.zzb;
        this.zzd = z;
        this.zzf = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3 = r5.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r5.zzb.length();
        r5.zze = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 <= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5.zzb.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.zzf = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r5.zzb.subSequence(r0, r1).toString();
     */
    @Override // com.google.android.gms.internal.common.zzj
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i = this.zze;
        while (true) {
            int i2 = this.zze;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i2);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zze = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zze = zzc;
            }
            if (zzc == i) {
                int i3 = zzc + 1;
                this.zze = i3;
                if (i3 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i < zzd) {
                    this.zzb.charAt(i);
                }
                if (i < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                if (!this.zzd || i != zzd) {
                    break;
                }
                i = this.zze;
            }
        }
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
