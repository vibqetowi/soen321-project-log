package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzcq {
    static volatile zzdh zza = zzdh.zzc();
    private static final Object zzb = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(1:20)(8:33|(1:35)(1:41)|36|(2:38|(1:40))|27|28|29|30)|21|22|23|24|(1:26)|27|28|29|30) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        } else if (zza.zzb()) {
            return ((Boolean) zza.zza()).booleanValue();
        } else {
            synchronized (zzb) {
                if (zza.zzb()) {
                    return ((Boolean) zza.zza()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    zza = zzdh.zzd(Boolean.valueOf(z));
                    return ((Boolean) zza.zza()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
                    z = true;
                }
                zza = zzdh.zzd(Boolean.valueOf(z));
                return ((Boolean) zza.zza()).booleanValue();
            }
        }
    }
}
