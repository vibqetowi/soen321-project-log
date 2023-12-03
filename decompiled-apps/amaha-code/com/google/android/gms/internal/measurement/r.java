package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class r implements Iterable, o {

    /* renamed from: u  reason: collision with root package name */
    public final String f8576u;

    public r(String str) {
        if (str != null) {
            this.f8576u = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        return new r(this.f8576u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f8576u.equals(((r) obj).f8576u);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        String str = this.f8576u;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        return this.f8576u;
    }

    public final int hashCode() {
        return this.f8576u.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        return Boolean.valueOf(!this.f8576u.isEmpty());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new q(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return new q(this, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e6, code lost:
        if (r2[r7].isEmpty() == false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0158  */
    @Override // com.google.android.gms.internal.measurement.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c10;
        int i6;
        o rVar;
        o oVar;
        int i10;
        double doubleValue;
        double a10;
        String g5;
        Matcher matcher;
        double d10;
        double min;
        double length;
        double min2;
        long j10;
        int i11;
        int i12;
        int i13;
        v.c cVar2;
        int i14;
        int length2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                str4 = "trim";
                if (!str4.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str5 = "charAt";
                        str6 = str3;
                        if (str.equals(str6)) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1776922004:
                        String str7 = "charAt";
                        str5 = str7;
                        if (str.equals("toString")) {
                            c10 = 14;
                            str5 = str7;
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1464939364:
                        String str8 = "charAt";
                        str5 = str8;
                        if (str.equals("toLocaleLowerCase")) {
                            c10 = '\f';
                            str5 = str8;
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1361633751:
                        String str9 = "charAt";
                        boolean equals = str.equals(str9);
                        str5 = str9;
                        if (equals) {
                            c10 = 0;
                            str5 = str9;
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            c10 = 1;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c10 = '\r';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -906336856:
                        if (str.equals("search")) {
                            c10 = 7;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c10 = 11;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c10 = 4;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -399551817:
                        if (str.equals("toUpperCase")) {
                            c10 = 15;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 3568674:
                        if (str.equals(str4)) {
                            c10 = 16;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c10 = 5;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c10 = '\b';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c10 = '\t';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c10 = '\n';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c10 = 6;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c10 = 3;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    default:
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                }
                String str10 = "undefined";
                String str11 = this.f8576u;
                switch (c10) {
                    case 0:
                        l3.j(1, str5, arrayList);
                        if (!arrayList.isEmpty()) {
                            i6 = (int) l3.a(cVar.i((o) arrayList.get(0)).f().doubleValue());
                        } else {
                            i6 = 0;
                        }
                        if (i6 >= 0 && i6 < str11.length()) {
                            rVar = new r(String.valueOf(str11.charAt(i6)));
                            return rVar;
                        }
                        return o.f8526k;
                    case 1:
                        if (!arrayList.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder(str11);
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                sb2.append(cVar.i((o) arrayList.get(i15)).g());
                            }
                            rVar = new r(sb2.toString());
                            return rVar;
                        }
                        return this;
                    case 2:
                        l3.h(1, str6, arrayList);
                        o i16 = cVar.i((o) arrayList.get(0));
                        boolean equals2 = "length".equals(i16.g());
                        oVar = o.f8524i;
                        if (!equals2) {
                            double doubleValue2 = i16.f().doubleValue();
                            if (doubleValue2 != Math.floor(doubleValue2) || (i10 = (int) doubleValue2) < 0 || i10 >= str11.length()) {
                                return o.f8525j;
                            }
                        }
                        return oVar;
                    case 3:
                        double d11 = 0.0d;
                        l3.j(2, "indexOf", arrayList);
                        if (arrayList.size() > 0) {
                            str10 = cVar.i((o) arrayList.get(0)).g();
                        }
                        String str12 = str10;
                        if (arrayList.size() >= 2) {
                            d11 = cVar.i((o) arrayList.get(1)).f().doubleValue();
                        }
                        oVar = new h(Double.valueOf(str11.indexOf(str12, (int) l3.a(d11))));
                        return oVar;
                    case 4:
                        l3.j(2, "lastIndexOf", arrayList);
                        if (arrayList.size() > 0) {
                            str10 = cVar.i((o) arrayList.get(0)).g();
                        }
                        String str13 = str10;
                        if (arrayList.size() < 2) {
                            doubleValue = Double.NaN;
                        } else {
                            doubleValue = cVar.i((o) arrayList.get(1)).f().doubleValue();
                        }
                        if (Double.isNaN(doubleValue)) {
                            a10 = Double.POSITIVE_INFINITY;
                        } else {
                            a10 = l3.a(doubleValue);
                        }
                        return new h(Double.valueOf(str11.lastIndexOf(str13, (int) a10)));
                    case 5:
                        l3.j(1, "match", arrayList);
                        if (arrayList.size() <= 0) {
                            g5 = "";
                        } else {
                            g5 = cVar.i((o) arrayList.get(0)).g();
                        }
                        Matcher matcher2 = Pattern.compile(g5).matcher(str11);
                        if (matcher2.find()) {
                            rVar = new e(Arrays.asList(new r(matcher2.group())));
                            return rVar;
                        }
                        return o.f8521e;
                    case 6:
                        l3.j(2, "replace", arrayList);
                        o oVar2 = o.f8520d;
                        if (!arrayList.isEmpty()) {
                            str10 = cVar.i((o) arrayList.get(0)).g();
                            if (arrayList.size() > 1) {
                                oVar2 = cVar.i((o) arrayList.get(1));
                            }
                        }
                        String str14 = str10;
                        int indexOf = str11.indexOf(str14);
                        if (indexOf >= 0) {
                            if (oVar2 instanceof i) {
                                oVar2 = ((i) oVar2).a(cVar, Arrays.asList(new r(str14), new h(Double.valueOf(indexOf)), this));
                            }
                            rVar = new r(defpackage.d.f(str11.substring(0, indexOf), oVar2.g(), str11.substring(str14.length() + indexOf)));
                            return rVar;
                        }
                        return this;
                    case 7:
                        l3.j(1, "search", arrayList);
                        if (!arrayList.isEmpty()) {
                            str10 = cVar.i((o) arrayList.get(0)).g();
                        }
                        if (Pattern.compile(str10).matcher(str11).find()) {
                            rVar = new h(Double.valueOf(matcher.start()));
                            return rVar;
                        }
                        return new h(Double.valueOf(-1.0d));
                    case '\b':
                        l3.j(2, "slice", arrayList);
                        if (!arrayList.isEmpty()) {
                            d10 = cVar.i((o) arrayList.get(0)).f().doubleValue();
                        } else {
                            d10 = 0.0d;
                        }
                        double a11 = l3.a(d10);
                        if (a11 < 0.0d) {
                            min = Math.max(str11.length() + a11, 0.0d);
                        } else {
                            min = Math.min(a11, str11.length());
                        }
                        int i17 = (int) min;
                        if (arrayList.size() > 1) {
                            length = cVar.i((o) arrayList.get(1)).f().doubleValue();
                        } else {
                            length = str11.length();
                        }
                        double a12 = l3.a(length);
                        if (a12 < 0.0d) {
                            min2 = Math.max(str11.length() + a12, 0.0d);
                        } else {
                            min2 = Math.min(a12, str11.length());
                        }
                        oVar = new r(str11.substring(i17, Math.max(0, ((int) min2) - i17) + i17));
                        return oVar;
                    case '\t':
                        l3.j(2, "split", arrayList);
                        if (str11.length() == 0) {
                            return new e(Arrays.asList(this));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        if (arrayList.isEmpty()) {
                            arrayList2.add(this);
                        } else {
                            String g10 = cVar.i((o) arrayList.get(0)).g();
                            if (arrayList.size() > 1) {
                                j10 = l3.d(cVar.i((o) arrayList.get(1)).f().doubleValue());
                            } else {
                                j10 = 2147483647L;
                            }
                            if (j10 == 0) {
                                return new e();
                            }
                            String[] split = str11.split(Pattern.quote(g10), ((int) j10) + 1);
                            int length3 = split.length;
                            if (g10.isEmpty() && length3 > 0) {
                                boolean isEmpty = split[0].isEmpty();
                                i12 = length3 - 1;
                                i13 = isEmpty;
                                i11 = isEmpty;
                                break;
                            } else {
                                i11 = 0;
                            }
                            i12 = length3;
                            i13 = i11;
                            if (length3 > j10) {
                                i12--;
                            }
                            while (i13 < i12) {
                                arrayList2.add(new r(split[i13]));
                                i13++;
                            }
                        }
                        return new e(arrayList2);
                    case '\n':
                        l3.j(2, "substring", arrayList);
                        if (!arrayList.isEmpty()) {
                            cVar2 = cVar;
                            i14 = (int) l3.a(cVar2.i((o) arrayList.get(0)).f().doubleValue());
                        } else {
                            cVar2 = cVar;
                            i14 = 0;
                        }
                        if (arrayList.size() > 1) {
                            length2 = (int) l3.a(cVar2.i((o) arrayList.get(1)).f().doubleValue());
                        } else {
                            length2 = str11.length();
                        }
                        int min3 = Math.min(Math.max(i14, 0), str11.length());
                        int min4 = Math.min(Math.max(length2, 0), str11.length());
                        oVar = new r(str11.substring(Math.min(min3, min4), Math.max(min3, min4)));
                        return oVar;
                    case 11:
                        l3.h(0, str2, arrayList);
                        return new r(str11.toUpperCase());
                    case '\f':
                        l3.h(0, "toLocaleLowerCase", arrayList);
                        return new r(str11.toLowerCase());
                    case '\r':
                        l3.h(0, "toLowerCase", arrayList);
                        return new r(str11.toLowerCase(Locale.ENGLISH));
                    case 14:
                        l3.h(0, "toString", arrayList);
                        return this;
                    case 15:
                        l3.h(0, "toUpperCase", arrayList);
                        return new r(str11.toUpperCase(Locale.ENGLISH));
                    case 16:
                        l3.h(0, "toUpperCase", arrayList);
                        return new r(str11.trim());
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str3 = "hasOwnProperty";
        str4 = "trim";
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
        String str102 = "undefined";
        String str112 = this.f8576u;
        switch (c10) {
        }
    }

    public final String toString() {
        return r1.b0.b(new StringBuilder("\""), this.f8576u, "\"");
    }
}
