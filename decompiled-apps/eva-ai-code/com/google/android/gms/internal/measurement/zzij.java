package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzij {
    public static int zza(int i, int i2, String str) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzil.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                zza = zzil.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i;
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzd(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zzc(int i, int i2, int i3) {
        String zzd;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zzd = zzd(i, i3, "start index");
            } else {
                zzd = (i2 < 0 || i2 > i3) ? zzd(i2, i3, "end index") : zzil.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zzd);
        }
    }

    private static String zzd(int i, int i2, String str) {
        if (i < 0) {
            return zzil.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzil.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
