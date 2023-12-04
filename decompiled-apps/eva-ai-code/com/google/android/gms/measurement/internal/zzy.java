package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzy {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(String str, int i) {
        this.zzb = str;
        this.zzc = i;
    }

    private static Boolean zzd(String str, int i, boolean z, String str2, List list, String str3, zzet zzetVar) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzetVar != null) {
                        zzetVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static Boolean zze(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzer zzerVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzerVar);
        if (zzerVar.zzg()) {
            if (zzerVar.zzm() != 1) {
                if (zzerVar.zzm() == 5) {
                    if (!zzerVar.zzk() || !zzerVar.zzj()) {
                        return null;
                    }
                } else if (!zzerVar.zzh()) {
                    return null;
                }
                int zzm = zzerVar.zzm();
                if (zzerVar.zzm() == 5) {
                    if (zzlj.zzy(zzerVar.zze()) && zzlj.zzy(zzerVar.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzerVar.zze());
                            bigDecimal4 = new BigDecimal(zzerVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!zzlj.zzy(zzerVar.zzc())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(zzerVar.zzc());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (zzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = zzm - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                } else if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                } else if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                            r2 = false;
                        }
                        return Boolean.valueOf(r2);
                    }
                    return null;
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (d == 0.0d) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                    }
                    if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                        r2 = false;
                    }
                    return Boolean.valueOf(r2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zzf(String str, com.google.android.gms.internal.measurement.zzey zzeyVar, zzet zzetVar) {
        String zzd;
        List list;
        Preconditions.checkNotNull(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int zzj = zzeyVar.zzj();
        boolean zzf = zzeyVar.zzf();
        if (zzf || zzj == 2 || zzj == 7) {
            zzd = zzeyVar.zzd();
        } else {
            zzd = zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        }
        String str2 = zzd;
        if (zzeyVar.zza() == 0) {
            list = null;
        } else {
            List<String> zze = zzeyVar.zze();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zze.size());
                for (String str3 : zze) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                zze = Collections.unmodifiableList(arrayList);
            }
            list = zze;
        }
        return zzd(str, zzj, zzf, str2, list, zzj == 2 ? str2 : null, zzetVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zzg(double d, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(d), zzerVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zzh(long j, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(j), zzerVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zzi(String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (zzlj.zzy(str)) {
            try {
                return zze(new BigDecimal(str), zzerVar, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zzj(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzc();
}
