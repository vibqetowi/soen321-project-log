package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.security.CertificateUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeq implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzet zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeq(zzet zzetVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzetVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzfi zzm = this.zzf.zzt.zzm();
        if (zzm.zzy()) {
            zzet zzetVar = this.zzf;
            c = zzetVar.zza;
            if (c == 0) {
                if (zzetVar.zzt.zzf().zzy()) {
                    zzet zzetVar2 = this.zzf;
                    zzetVar2.zzt.zzay();
                    zzetVar2.zza = 'C';
                } else {
                    zzet zzetVar3 = this.zzf;
                    zzetVar3.zzt.zzay();
                    zzetVar3.zza = 'c';
                }
            }
            zzet zzetVar4 = this.zzf;
            j = zzetVar4.zzb;
            if (j < 0) {
                zzetVar4.zzt.zzf().zzh();
                zzetVar4.zzb = 79000L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzet zzetVar5 = this.zzf;
            c2 = zzetVar5.zza;
            j2 = zzetVar5.zzb;
            String str = ExifInterface.GPS_MEASUREMENT_2D + charAt + c2 + j2 + CertificateUtil.DELIMITER + zzet.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            if (str.length() > 1024) {
                str = this.zzb.substring(0, 1024);
            }
            zzfg zzfgVar = zzm.zzb;
            if (zzfgVar != null) {
                zzfgVar.zzb(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzr(), "Persisted config not initialized. Not logging error/warn");
    }
}
