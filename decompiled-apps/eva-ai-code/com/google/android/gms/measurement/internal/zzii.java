package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;
import com.google.firebase.messaging.Constants;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzii implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzij zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzij zzijVar, boolean z, Uri uri, String str, String str2) {
        this.zze = zzijVar;
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[Catch: RuntimeException -> 0x019e, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x019e, blocks: (B:3:0x0011, B:32:0x00ad, B:34:0x00cd, B:37:0x00da, B:39:0x00e0, B:40:0x00f5, B:41:0x0101, B:44:0x0109, B:48:0x0131, B:50:0x014f, B:49:0x013e, B:52:0x0157, B:54:0x015d, B:56:0x0163, B:58:0x0169, B:60:0x016f, B:62:0x0178, B:64:0x0181, B:66:0x0187, B:68:0x018e, B:7:0x0042, B:9:0x0048, B:11:0x004e, B:13:0x0054, B:15:0x005a, B:17:0x0063, B:19:0x006b, B:22:0x0076, B:26:0x0082, B:27:0x0090, B:29:0x00a4), top: B:73:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109 A[Catch: RuntimeException -> 0x019e, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x019e, blocks: (B:3:0x0011, B:32:0x00ad, B:34:0x00cd, B:37:0x00da, B:39:0x00e0, B:40:0x00f5, B:41:0x0101, B:44:0x0109, B:48:0x0131, B:50:0x014f, B:49:0x013e, B:52:0x0157, B:54:0x015d, B:56:0x0163, B:58:0x0169, B:60:0x016f, B:62:0x0178, B:64:0x0181, B:66:0x0187, B:68:0x018e, B:7:0x0042, B:9:0x0048, B:11:0x004e, B:13:0x0054, B:15:0x005a, B:17:0x0063, B:19:0x006b, B:22:0x0076, B:26:0x0082, B:27:0x0090, B:29:0x00a4), top: B:73:0x0011 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle zzs;
        zzij zzijVar = this.zze;
        boolean z = this.zza;
        Uri uri = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        zzijVar.zza.zzg();
        try {
            zzlp zzv = zzijVar.zza.zzt.zzv();
            zzra.zzc();
            boolean zzs2 = zzijVar.zza.zzt.zzf().zzs(null, zzeg.zzav);
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid")) {
                    if (zzs2 && str2.contains("sfmc_id")) {
                        zzs2 = true;
                    }
                    zzv.zzt.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
                }
                zzs = zzv.zzs(Uri.parse("https://google.com/search?".concat(String.valueOf(str2))), zzs2);
                if (zzs != null) {
                    zzs.putString("_cis", "referrer");
                }
                if (z) {
                    zzlp zzv2 = zzijVar.zza.zzt.zzv();
                    zzra.zzc();
                    Bundle zzs3 = zzv2.zzs(uri, zzijVar.zza.zzt.zzf().zzs(null, zzeg.zzav));
                    if (zzs3 != null) {
                        zzs3.putString("_cis", "intent");
                        if (!zzs3.containsKey("gclid") && zzs != null && zzs.containsKey("gclid")) {
                            zzs3.putString("_cer", String.format("gclid=%s", zzs.getString("gclid")));
                        }
                        zzijVar.zza.zzG(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzs3);
                        zzijVar.zza.zzb.zza(str, zzs3);
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    zzijVar.zza.zzt.zzaA().zzc().zzb("Activity created with referrer", str2);
                    if (zzijVar.zza.zzt.zzf().zzs(null, zzeg.zzaa)) {
                        if (zzs != null) {
                            zzijVar.zza.zzG(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzs);
                            zzijVar.zza.zzb.zza(str, zzs);
                        } else {
                            zzijVar.zza.zzt.zzaA().zzc().zzb("Referrer does not contain valid parameters", str2);
                        }
                        zzijVar.zza.zzW("auto", "_ldl", null, true);
                        return;
                    } else if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                        zzijVar.zza.zzt.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
                        return;
                    } else if (TextUtils.isEmpty(str2)) {
                        return;
                    } else {
                        zzijVar.zza.zzW("auto", "_ldl", str2, true);
                        return;
                    }
                }
                return;
            }
            zzs = null;
            if (z) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            zzijVar.zza.zzt.zzaA().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
