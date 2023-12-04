package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.sentry.protocol.App;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes7.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final zzjb zzb = zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final zzja zzc = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final zzja zzd = zzja.zzi("auto", App.TYPE, "am");
    private static final zzja zze = zzja.zzh("_r", "_dbg");
    private static final zzja zzf;
    private static final zzja zzg;

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhe.zza);
        zzixVar.zza(zzhe.zzb);
        zzf = zzixVar.zzb();
        zzg = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean zza(String str, String str2, Bundle bundle) {
        char c;
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            if (zzd(str) && bundle != null) {
                zzja zzjaVar = zze;
                int size = zzjaVar.size();
                int i = 0;
                while (i < size) {
                    boolean containsKey = bundle.containsKey((String) zzjaVar.get(i));
                    i++;
                    if (containsKey) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals("fiam")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean zzb(String str, Bundle bundle) {
        if (zzc.contains(str)) {
            return false;
        }
        if (bundle != null) {
            zzja zzjaVar = zze;
            int size = zzjaVar.size();
            int i = 0;
            while (i < size) {
                boolean containsKey = bundle.containsKey((String) zzjaVar.get(i));
                i++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !zzb.contains(str);
    }

    public static boolean zzd(String str) {
        return !zzd.contains(str);
    }

    public static boolean zze(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        } else if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (zzf.contains(str2)) {
            return false;
        } else {
            zzja zzjaVar = zzg;
            int size = zzjaVar.size();
            int i = 0;
            while (i < size) {
                boolean matches = str2.matches((String) zzjaVar.get(i));
                i++;
                if (matches) {
                    return false;
                }
            }
            return true;
        }
    }
}
