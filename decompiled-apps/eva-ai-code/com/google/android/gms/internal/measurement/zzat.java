package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        String str = this.zza;
        return "\"" + str + "\"";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c;
        String str6;
        String str7;
        String str8;
        String str9;
        zzat zzatVar;
        int i;
        double doubleValue;
        String str10;
        zzat zzatVar2;
        Matcher matcher;
        double min;
        double min2;
        int i2;
        int i3;
        zzg zzgVar2;
        int i4;
        int length;
        String str11;
        String str12;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str)) {
            str2 = "toLocaleUpperCase";
            str3 = "toUpperCase";
        } else {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                str4 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        String str13 = "charAt";
                        String str14 = str4;
                        str5 = "toString";
                        boolean equals = str.equals(str14);
                        str6 = str14;
                        str11 = str13;
                        if (equals) {
                            c = 2;
                            str7 = str14;
                            str8 = str13;
                            break;
                        }
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -1776922004:
                        String str15 = "charAt";
                        str5 = "toString";
                        if (str.equals(str5)) {
                            c = 14;
                            str7 = str4;
                            str8 = str15;
                            break;
                        } else {
                            str6 = str4;
                            str11 = str15;
                            c = 65535;
                            str7 = str6;
                            str8 = str11;
                            break;
                        }
                    case -1464939364:
                        String str16 = "charAt";
                        str12 = str16;
                        if (str.equals("toLocaleLowerCase")) {
                            c = '\f';
                            str9 = str16;
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -1361633751:
                        String str17 = "charAt";
                        boolean equals2 = str.equals(str17);
                        str12 = str17;
                        if (equals2) {
                            str7 = str4;
                            str5 = "toString";
                            c = 0;
                            str8 = str17;
                            break;
                        }
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str8 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            c = 1;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c = '\r';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -906336856:
                        if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                            c = 7;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c = 11;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c = 4;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case -399551817:
                        if (str.equals(str3)) {
                            c = 15;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case 3568674:
                        if (str.equals("trim")) {
                            c = 16;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c = 5;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c = '\b';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c = '\t';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c = '\n';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c = 6;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c = 3;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                    default:
                        str12 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str11 = str12;
                        c = 65535;
                        str7 = str6;
                        str8 = str11;
                        break;
                }
                String str18 = str7;
                String str19 = str8;
                switch (c) {
                    case 0:
                        zzh.zzj(str19, 1, list);
                        int zza = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                        String str20 = this.zza;
                        if (zza < 0 || zza >= str20.length()) {
                            return zzap.zzm;
                        }
                        return new zzat(String.valueOf(str20.charAt(zza)));
                    case 1:
                        zzatVar = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb = new StringBuilder(zzatVar.zza);
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                sb.append(zzgVar.zzb((zzap) list.get(i5)).zzi());
                            }
                            return new zzat(sb.toString());
                        }
                        return zzatVar;
                    case 2:
                        zzh.zzh(str18, 1, list);
                        String str21 = this.zza;
                        zzap zzb = zzgVar.zzb((zzap) list.get(0));
                        if (SessionDescription.ATTR_LENGTH.equals(zzb.zzi())) {
                            return zzaf.zzk;
                        }
                        double doubleValue2 = zzb.zzh().doubleValue();
                        return (doubleValue2 != Math.floor(doubleValue2) || (i = (int) doubleValue2) < 0 || i >= str21.length()) ? zzaf.zzl : zzaf.zzk;
                    case 3:
                        zzh.zzj("indexOf", 2, list);
                        return new zzah(Double.valueOf(this.zza.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() < 2 ? 0.0d : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()))));
                    case 4:
                        zzh.zzj("lastIndexOf", 2, list);
                        String str22 = this.zza;
                        String zzi = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                        return new zzah(Double.valueOf(str22.lastIndexOf(zzi, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(doubleValue)))));
                    case 5:
                        zzh.zzj("match", 1, list);
                        Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                        return matcher2.find() ? new zzae(Arrays.asList(new zzat(matcher2.group()))) : zzap.zzg;
                    case 6:
                        zzatVar = this;
                        zzh.zzj("replace", 2, list);
                        zzap zzapVar = zzap.zzf;
                        if (!list.isEmpty()) {
                            str10 = zzgVar.zzb((zzap) list.get(0)).zzi();
                            if (list.size() > 1) {
                                zzapVar = zzgVar.zzb((zzap) list.get(1));
                            }
                        }
                        String str23 = str10;
                        String str24 = zzatVar.zza;
                        int indexOf = str24.indexOf(str23);
                        if (indexOf >= 0) {
                            if (zzapVar instanceof zzai) {
                                zzapVar = ((zzai) zzapVar).zza(zzgVar, Arrays.asList(new zzat(str23), new zzah(Double.valueOf(indexOf)), zzatVar));
                            }
                            zzatVar2 = new zzat(str24.substring(0, indexOf) + zzapVar.zzi() + str24.substring(indexOf + str23.length()));
                            return zzatVar2;
                        }
                        return zzatVar;
                    case 7:
                        zzh.zzj(FirebaseAnalytics.Event.SEARCH, 1, list);
                        if (Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza).find()) {
                            return new zzah(Double.valueOf(matcher.start()));
                        }
                        return new zzah(Double.valueOf(-1.0d));
                    case '\b':
                        zzh.zzj("slice", 2, list);
                        String str25 = this.zza;
                        double zza2 = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                        if (zza2 < 0.0d) {
                            min = Math.max(str25.length() + zza2, 0.0d);
                        } else {
                            min = Math.min(zza2, str25.length());
                        }
                        double zza3 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str25.length());
                        if (zza3 < 0.0d) {
                            min2 = Math.max(str25.length() + zza3, 0.0d);
                        } else {
                            min2 = Math.min(zza3, str25.length());
                        }
                        int i6 = (int) min;
                        return new zzat(str25.substring(i6, Math.max(0, ((int) min2) - i6) + i6));
                    case '\t':
                        zzh.zzj("split", 2, list);
                        String str26 = this.zza;
                        if (str26.length() == 0) {
                            return new zzae(Arrays.asList(this));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (list.isEmpty()) {
                            arrayList.add(this);
                        } else {
                            String zzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                            long zzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                            if (zzd == 0) {
                                return new zzae();
                            }
                            String[] split = str26.split(Pattern.quote(zzi2), ((int) zzd) + 1);
                            int length2 = split.length;
                            if (!zzi2.isEmpty() || length2 <= 0) {
                                i2 = length2;
                                i3 = 0;
                            } else {
                                boolean isEmpty = split[0].isEmpty();
                                i2 = length2 - 1;
                                i3 = isEmpty;
                                if (!split[i2].isEmpty()) {
                                    i2 = length2;
                                    i3 = isEmpty;
                                }
                            }
                            if (length2 > zzd) {
                                i2--;
                            }
                            while (i3 < i2) {
                                arrayList.add(new zzat(split[i3]));
                                i3++;
                            }
                        }
                        return new zzae(arrayList);
                    case '\n':
                        zzh.zzj("substring", 2, list);
                        String str27 = this.zza;
                        if (list.isEmpty()) {
                            zzgVar2 = zzgVar;
                            i4 = 0;
                        } else {
                            zzgVar2 = zzgVar;
                            i4 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                        }
                        if (list.size() > 1) {
                            length = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue());
                        } else {
                            length = str27.length();
                        }
                        int min3 = Math.min(Math.max(i4, 0), str27.length());
                        int min4 = Math.min(Math.max(length, 0), str27.length());
                        zzatVar2 = new zzat(str27.substring(Math.min(min3, min4), Math.max(min3, min4)));
                        return zzatVar2;
                    case 11:
                        zzh.zzh(str2, 0, list);
                        return new zzat(this.zza.toUpperCase());
                    case '\f':
                        zzh.zzh("toLocaleLowerCase", 0, list);
                        return new zzat(this.zza.toLowerCase());
                    case '\r':
                        zzh.zzh("toLowerCase", 0, list);
                        return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
                    case 14:
                        zzatVar = this;
                        zzh.zzh(str5, 0, list);
                        return zzatVar;
                    case 15:
                        zzh.zzh(str3, 0, list);
                        return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
                    case 16:
                        zzh.zzh(str3, 0, list);
                        return new zzat(this.zza.trim());
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str4 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        String str182 = str7;
        String str192 = str8;
        switch (c) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
