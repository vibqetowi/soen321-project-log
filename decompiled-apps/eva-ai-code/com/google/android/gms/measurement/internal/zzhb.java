package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import org.apache.commons.codec.language.Soundex;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhb {
    public static final zzhb zza = new zzhb(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzhb(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(zzha.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzha.AD_STORAGE, (zzha) bool);
        enumMap.put((EnumMap) zzha.ANALYTICS_STORAGE, (zzha) bool2);
        this.zzc = i;
    }

    public static zzhb zzb(Bundle bundle, int i) {
        zzha[] values;
        if (bundle == null) {
            return new zzhb(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            enumMap.put((EnumMap) zzhaVar, (zzha) zzp(bundle.getString(zzhaVar.zzd)));
        }
        return new zzhb(enumMap, i);
    }

    public static zzhb zzc(String str, int i) {
        EnumMap enumMap = new EnumMap(zzha.class);
        if (str != null) {
            int i2 = 0;
            while (true) {
                int length = zzha.zzc.length;
                if (i2 >= 2) {
                    break;
                }
                zzha zzhaVar = zzha.zzc[i2];
                int i3 = i2 + 2;
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) zzhaVar, (zzha) bool);
                }
                i2++;
            }
        }
        return new zzhb(enumMap, i);
    }

    public static String zzh(Bundle bundle) {
        zzha[] values;
        String string;
        for (zzha zzhaVar : zzha.values()) {
            if (bundle.containsKey(zzhaVar.zzd) && (string = bundle.getString(zzhaVar.zzd)) != null && zzp(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzk(int i, int i2) {
        return i <= i2;
    }

    static final int zzo(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzp(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        zzha[] values;
        if (obj instanceof zzhb) {
            zzhb zzhbVar = (zzhb) obj;
            for (zzha zzhaVar : zzha.values()) {
                if (zzo((Boolean) this.zzb.get(zzhaVar)) != zzo((Boolean) zzhbVar.zzb.get(zzhaVar))) {
                    return false;
                }
            }
            return this.zzc == zzhbVar.zzc;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc * 17;
        for (Boolean bool : this.zzb.values()) {
            i = (i * 31) + zzo(bool);
        }
        return i;
    }

    public final String toString() {
        zzha[] values;
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.zzc);
        for (zzha zzhaVar : zzha.values()) {
            sb.append(", ");
            sb.append(zzhaVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzhb zzd(zzhb zzhbVar) {
        zzha[] values;
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, 100);
    }

    public final zzhb zze(zzhb zzhbVar) {
        zzha[] values;
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                bool = (Boolean) zzhbVar.zzb.get(zzhaVar);
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, this.zzc);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzha.AD_STORAGE);
    }

    public final Boolean zzg() {
        return (Boolean) this.zzb.get(zzha.ANALYTICS_STORAGE);
    }

    public final String zzi() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        zzha[] zzhaVarArr = zzha.zzc;
        int length = zzhaVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVarArr[i]);
            if (bool == null) {
                c = Soundex.SILENT_MARKER;
            } else {
                c = bool.booleanValue() ? '1' : '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final boolean zzj(zzha zzhaVar) {
        Boolean bool = (Boolean) this.zzb.get(zzhaVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzl() {
        for (Boolean bool : this.zzb.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzm(zzhb zzhbVar) {
        return zzn(zzhbVar, (zzha[]) this.zzb.keySet().toArray(new zzha[0]));
    }

    public final boolean zzn(zzhb zzhbVar, zzha... zzhaVarArr) {
        for (zzha zzhaVar : zzhaVarArr) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            if (bool == Boolean.FALSE && bool2 != Boolean.FALSE) {
                return true;
            }
        }
        return false;
    }

    public zzhb(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzha.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }
}
