package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzs {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallInfoProvider");
    private final Context zzb;
    private final String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(Context context) {
        this.zzb = context;
        this.zzc = context.getPackageName();
    }

    public zzs(Context context, String str) {
        this.zzb = context;
        this.zzc = str;
    }

    public static String zzb(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String str) {
        return str.startsWith("config.");
    }

    public static boolean zzf(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set zzg(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : zzi(packageInfo)) {
            if (!zzf(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private final PackageInfo zzh() {
        try {
            return this.zzb.getPackageManager().getPackageInfo(this.zzc, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            zza.zzb("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    private static final Set zzi(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                zza.zza("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove(TtmlNode.RUBY_BASE);
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            zza.zza("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            zza.zza("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        zzq zza2 = zzr.zza();
        if (zza2 != null) {
            hashSet.addAll(zza2.zza());
        }
        return hashSet;
    }

    public final zzk zza(Bundle bundle) {
        if (bundle == null) {
            zza.zze("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            zza.zze("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            zzk zza2 = zzbg.zza(this.zzb.getResources().getXml(i), new zzi());
            if (zza2 == null) {
                zza.zze("Can't parse languages metadata.", new Object[0]);
            }
            return zza2;
        } catch (Resources.NotFoundException unused) {
            zza.zze("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set zzc() {
        PackageInfo zzh = zzh();
        if (zzh == null || zzh.applicationInfo == null) {
            return new HashSet();
        }
        return zzg(zzh);
    }

    public final Set zzd() {
        PackageInfo zzh = zzh();
        HashSet hashSet = null;
        if (zzh != null && zzh.applicationInfo != null) {
            zzk zza2 = zza(zzh.applicationInfo.metaData);
            if (zza2 == null) {
                return null;
            }
            hashSet = new HashSet();
            Set zzi = zzi(zzh);
            zzi.add("");
            Set zzg = zzg(zzh);
            zzg.add("");
            for (Map.Entry entry : zza2.zza(zzg).entrySet()) {
                if (zzi.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
