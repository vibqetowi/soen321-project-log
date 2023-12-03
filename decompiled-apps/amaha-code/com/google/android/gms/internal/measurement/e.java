package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class e implements Iterable, o, k {

    /* renamed from: u  reason: collision with root package name */
    public final TreeMap f8345u;

    /* renamed from: v  reason: collision with root package name */
    public final TreeMap f8346v;

    public e() {
        this.f8345u = new TreeMap();
        this.f8346v = new TreeMap();
    }

    public final Iterator C() {
        return this.f8345u.keySet().iterator();
    }

    public final ArrayList I() {
        ArrayList arrayList = new ArrayList(t());
        for (int i6 = 0; i6 < t(); i6++) {
            arrayList.add(v(i6));
        }
        return arrayList;
    }

    public final void J(int i6) {
        TreeMap treeMap = this.f8345u;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i6 <= intValue && i6 >= 0) {
            treeMap.remove(Integer.valueOf(i6));
            if (i6 == intValue) {
                int i10 = i6 - 1;
                Integer valueOf = Integer.valueOf(i10);
                if (!treeMap.containsKey(valueOf) && i10 >= 0) {
                    treeMap.put(valueOf, o.f8520d);
                    return;
                }
                return;
            }
            while (true) {
                i6++;
                if (i6 <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i6);
                    o oVar = (o) treeMap.get(valueOf2);
                    if (oVar != null) {
                        treeMap.put(Integer.valueOf(i6 - 1), oVar);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void K(int i6, o oVar) {
        if (i6 <= 32468) {
            if (i6 >= 0) {
                TreeMap treeMap = this.f8345u;
                if (oVar == null) {
                    treeMap.remove(Integer.valueOf(i6));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i6), oVar);
                    return;
                }
            }
            throw new IndexOutOfBoundsException(defpackage.c.p("Out of bounds index: ", i6));
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean L(int i6) {
        if (i6 >= 0) {
            TreeMap treeMap = this.f8345u;
            if (i6 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i6));
            }
        }
        throw new IndexOutOfBoundsException(defpackage.c.p("Out of bounds index: ", i6));
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        e eVar = new e();
        for (Map.Entry entry : this.f8345u.entrySet()) {
            boolean z10 = entry.getValue() instanceof k;
            TreeMap treeMap = eVar.f8345u;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (o) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((o) entry.getValue()).e());
            }
        }
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (t() != eVar.t()) {
            return false;
        }
        TreeMap treeMap = this.f8345u;
        if (treeMap.isEmpty()) {
            return eVar.f8345u.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!v(intValue).equals(eVar.v(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        TreeMap treeMap = this.f8345u;
        if (treeMap.size() == 1) {
            return v(0).f();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        return z(",");
    }

    public final int hashCode() {
        return this.f8345u.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final boolean m(String str) {
        if (!"length".equals(str) && !this.f8346v.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return new c(this.f8345u.keySet().iterator(), this.f8346v.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final void q(String str, o oVar) {
        TreeMap treeMap = this.f8346v;
        if (oVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final o r(String str) {
        o oVar;
        if ("length".equals(str)) {
            return new h(Double.valueOf(t()));
        }
        if (m(str) && (oVar = (o) this.f8346v.get(str)) != null) {
            return oVar;
        }
        return o.f8520d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0837, code lost:
        if (sp.b.o0(r27, r29, (com.google.android.gms.internal.measurement.n) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).t() == t()) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v103, types: [com.google.android.gms.internal.measurement.o] */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.google.android.gms.internal.measurement.o] */
    /* JADX WARN: Type inference failed for: r0v119, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r0v127, types: [com.google.android.gms.internal.measurement.o] */
    /* JADX WARN: Type inference failed for: r0v148, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r0v150, types: [com.google.android.gms.internal.measurement.r] */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v153, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.measurement.o] */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.google.android.gms.internal.measurement.r] */
    /* JADX WARN: Type inference failed for: r0v56, types: [com.google.android.gms.internal.measurement.r] */
    /* JADX WARN: Type inference failed for: r0v68, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r0v94, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        Object obj2;
        String str6;
        String str7;
        String str8;
        char c10;
        ?? e10;
        o oVar;
        o oVar2;
        double min;
        i iVar;
        String str9 = "toString";
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str)) {
            str2 = "unshift";
            str3 = "filter";
            str4 = "join";
            str5 = "sort";
            obj = "splice";
            obj2 = "reduce";
            str6 = "some";
        } else if ("some".equals(str)) {
            str4 = "join";
            str5 = "sort";
            obj = "splice";
            obj2 = "reduce";
            str6 = "some";
            str2 = "unshift";
            str3 = "filter";
        } else {
            str5 = "sort";
            if (str5.equals(str)) {
                obj = "splice";
                obj2 = "reduce";
                str6 = "some";
                str2 = "unshift";
                str3 = "filter";
                str4 = "join";
            } else if ("splice".equals(str)) {
                obj2 = "reduce";
                str6 = "some";
                str2 = "unshift";
                str3 = "filter";
                str4 = "join";
                obj = "splice";
                str5 = str5;
            } else {
                if (!str9.equals(str)) {
                    str9 = str9;
                    str2 = "unshift";
                    if (!str2.equals(str)) {
                        return sp.b.l0(this, new r(str), cVar, arrayList);
                    }
                } else {
                    str9 = str9;
                    str2 = "unshift";
                }
                str3 = "filter";
                str4 = "join";
                obj = "splice";
                str5 = str5;
                obj2 = "reduce";
                str6 = "some";
            }
        }
        switch (str.hashCode()) {
            case -1776922004:
                str7 = str3;
                str8 = str9;
                if (str.equals(str8)) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1354795244:
                str7 = str3;
                if (str.equals("concat")) {
                    c10 = 0;
                    str8 = str9;
                    break;
                }
                str8 = str9;
                c10 = 65535;
                break;
            case -1274492040:
                str7 = str3;
                if (str.equals(str7)) {
                    c10 = 2;
                    str8 = str9;
                    break;
                }
                str8 = str9;
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals(obj2)) {
                    c10 = '\n';
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals(obj)) {
                    c10 = 17;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 3;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals(str2)) {
                    c10 = 19;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = 7;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\b';
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals(str4)) {
                    c10 = 5;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = '\t';
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals(str6)) {
                    c10 = 15;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals(str5)) {
                    c10 = 16;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c10 = 1;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = '\r';
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 14;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 11;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = '\f';
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 4;
                    str7 = str3;
                    str8 = str9;
                    break;
                }
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
            default:
                str7 = str3;
                str8 = str9;
                c10 = 65535;
                break;
        }
        s sVar = o.f8520d;
        String str10 = ",";
        String str11 = str7;
        TreeMap treeMap = this.f8345u;
        f fVar = o.f8525j;
        f fVar2 = o.f8524i;
        double d10 = 0.0d;
        switch (c10) {
            case 0:
                e10 = e();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        o i6 = cVar.i((o) it.next());
                        if (!(i6 instanceof g)) {
                            e eVar = (e) e10;
                            int t3 = eVar.t();
                            if (i6 instanceof e) {
                                e eVar2 = (e) i6;
                                Iterator C = eVar2.C();
                                while (C.hasNext()) {
                                    Integer num = (Integer) C.next();
                                    eVar.K(num.intValue() + t3, eVar2.v(num.intValue()));
                                }
                            } else {
                                eVar.K(t3, i6);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return e10;
            case 1:
                l3.h(1, "every", arrayList);
                o i10 = cVar.i((o) arrayList.get(0));
                if (i10 instanceof n) {
                    if (t() != 0) {
                        break;
                    }
                    return fVar2;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                l3.h(1, str11, arrayList);
                o i11 = cVar.i((o) arrayList.get(0));
                if (i11 instanceof n) {
                    if (treeMap.size() == 0) {
                        e10 = new e();
                        return e10;
                    }
                    o e11 = e();
                    e o02 = sp.b.o0(this, cVar, (n) i11, null, Boolean.TRUE);
                    e eVar3 = new e();
                    Iterator C2 = o02.C();
                    while (C2.hasNext()) {
                        eVar3.K(eVar3.t(), ((e) e11).v(((Integer) C2.next()).intValue()));
                    }
                    return eVar3;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                l3.h(1, "forEach", arrayList);
                o i12 = cVar.i((o) arrayList.get(0));
                if (i12 instanceof n) {
                    if (treeMap.size() != 0) {
                        sp.b.o0(this, cVar, (n) i12, null, null);
                    }
                    return sVar;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                l3.j(2, "indexOf", arrayList);
                if (!arrayList.isEmpty()) {
                    oVar = cVar.i((o) arrayList.get(0));
                } else {
                    oVar = sVar;
                }
                if (arrayList.size() > 1) {
                    double a10 = l3.a(cVar.i((o) arrayList.get(1)).f().doubleValue());
                    if (a10 >= t()) {
                        e10 = new h(Double.valueOf(-1.0d));
                        return e10;
                    } else if (a10 < 0.0d) {
                        d10 = t() + a10;
                    } else {
                        d10 = a10;
                    }
                }
                Iterator C3 = C();
                while (true) {
                    if (C3.hasNext()) {
                        int intValue = ((Integer) C3.next()).intValue();
                        double d11 = intValue;
                        if (d11 >= d10 && l3.l(v(intValue), oVar)) {
                            e10 = new h(Double.valueOf(d11));
                        }
                    } else {
                        e10 = new h(Double.valueOf(-1.0d));
                    }
                }
                return e10;
            case 5:
                l3.j(1, str4, arrayList);
                if (t() == 0) {
                    e10 = o.f8526k;
                } else {
                    if (!arrayList.isEmpty()) {
                        o i13 = cVar.i((o) arrayList.get(0));
                        if (!(i13 instanceof m) && !(i13 instanceof s)) {
                            str10 = i13.g();
                        } else {
                            str10 = "";
                        }
                    }
                    e10 = new r(z(str10));
                }
                return e10;
            case 6:
                l3.j(2, "lastIndexOf", arrayList);
                if (!arrayList.isEmpty()) {
                    oVar2 = cVar.i((o) arrayList.get(0));
                } else {
                    oVar2 = sVar;
                }
                double t10 = t() - 1;
                if (arrayList.size() > 1) {
                    o i14 = cVar.i((o) arrayList.get(1));
                    t10 = Double.isNaN(i14.f().doubleValue()) ? t() - 1 : l3.a(i14.f().doubleValue());
                    if (t10 < 0.0d) {
                        t10 += t();
                    }
                }
                if (t10 < 0.0d) {
                    e10 = new h(Double.valueOf(-1.0d));
                } else {
                    for (int min2 = (int) Math.min(t(), t10); min2 >= 0; min2--) {
                        if (L(min2) && l3.l(v(min2), oVar2)) {
                            return new h(Double.valueOf(min2));
                        }
                    }
                    e10 = new h(Double.valueOf(-1.0d));
                }
                return e10;
            case 7:
                l3.h(1, "map", arrayList);
                o i15 = cVar.i((o) arrayList.get(0));
                if (i15 instanceof n) {
                    e10 = t() == 0 ? new e() : sp.b.o0(this, cVar, (n) i15, null, null);
                    return e10;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                l3.h(0, "pop", arrayList);
                int t11 = t();
                if (t11 != 0) {
                    int i16 = t11 - 1;
                    o v10 = v(i16);
                    J(i16);
                    return v10;
                }
                return sVar;
            case '\t':
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        K(t(), cVar.i((o) it2.next()));
                    }
                }
                e10 = new h(Double.valueOf(t()));
                return e10;
            case '\n':
                e10 = sp.b.p0(this, cVar, arrayList, true);
                return e10;
            case 11:
                e10 = sp.b.p0(this, cVar, arrayList, false);
                return e10;
            case '\f':
                l3.h(0, "reverse", arrayList);
                int t12 = t();
                if (t12 != 0) {
                    for (int i17 = 0; i17 < t12 / 2; i17++) {
                        if (L(i17)) {
                            o v11 = v(i17);
                            K(i17, null);
                            int i18 = (t12 - 1) - i17;
                            if (L(i18)) {
                                K(i17, v(i18));
                            }
                            K(i18, v11);
                        }
                    }
                }
                return this;
            case '\r':
                l3.h(0, "shift", arrayList);
                if (t() != 0) {
                    o v12 = v(0);
                    J(0);
                    return v12;
                }
                return sVar;
            case 14:
                l3.j(2, "slice", arrayList);
                if (arrayList.isEmpty()) {
                    e10 = e();
                } else {
                    double t13 = t();
                    double a11 = l3.a(cVar.i((o) arrayList.get(0)).f().doubleValue());
                    if (a11 < 0.0d) {
                        min = Math.max(a11 + t13, 0.0d);
                    } else {
                        min = Math.min(a11, t13);
                    }
                    if (arrayList.size() == 2) {
                        double a12 = l3.a(cVar.i((o) arrayList.get(1)).f().doubleValue());
                        if (a12 < 0.0d) {
                            t13 = Math.max(t13 + a12, 0.0d);
                        } else {
                            t13 = Math.min(t13, a12);
                        }
                    }
                    e10 = new e();
                    for (int i19 = (int) min; i19 < t13; i19++) {
                        e10.K(e10.t(), v(i19));
                    }
                }
                return e10;
            case 15:
                l3.h(1, str6, arrayList);
                o i20 = cVar.i((o) arrayList.get(0));
                if (i20 instanceof i) {
                    if (t() != 0) {
                        i iVar2 = (i) i20;
                        Iterator C4 = C();
                        while (C4.hasNext()) {
                            int intValue2 = ((Integer) C4.next()).intValue();
                            if (L(intValue2) && iVar2.a(cVar, Arrays.asList(v(intValue2), new h(Double.valueOf(intValue2)), this)).i().booleanValue()) {
                                return fVar2;
                            }
                        }
                    }
                    return fVar;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                l3.j(1, str5, arrayList);
                if (t() >= 2) {
                    ArrayList I = I();
                    if (!arrayList.isEmpty()) {
                        o i21 = cVar.i((o) arrayList.get(0));
                        if (i21 instanceof i) {
                            iVar = (i) i21;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        iVar = null;
                    }
                    Collections.sort(I, new v(iVar, cVar));
                    treeMap.clear();
                    Iterator it3 = I.iterator();
                    int i22 = 0;
                    while (it3.hasNext()) {
                        K(i22, (o) it3.next());
                        i22++;
                    }
                }
                return this;
            case 17:
                if (arrayList.isEmpty()) {
                    e10 = new e();
                    return e10;
                }
                int a13 = (int) l3.a(cVar.i((o) arrayList.get(0)).f().doubleValue());
                if (a13 < 0) {
                    a13 = Math.max(0, t() + a13);
                } else if (a13 > t()) {
                    a13 = t();
                }
                int t14 = t();
                e eVar4 = new e();
                if (arrayList.size() > 1) {
                    int max = Math.max(0, (int) l3.a(cVar.i((o) arrayList.get(1)).f().doubleValue()));
                    if (max > 0) {
                        for (int i23 = a13; i23 < Math.min(t14, a13 + max); i23++) {
                            eVar4.K(eVar4.t(), v(a13));
                            J(a13);
                        }
                    }
                    if (arrayList.size() > 2) {
                        for (int i24 = 2; i24 < arrayList.size(); i24++) {
                            o i25 = cVar.i((o) arrayList.get(i24));
                            if (!(i25 instanceof g)) {
                                int i26 = (a13 + i24) - 2;
                                if (i26 >= 0) {
                                    if (i26 >= t()) {
                                        K(i26, i25);
                                    } else {
                                        for (int intValue3 = ((Integer) treeMap.lastKey()).intValue(); intValue3 >= i26; intValue3--) {
                                            Integer valueOf = Integer.valueOf(intValue3);
                                            o oVar3 = (o) treeMap.get(valueOf);
                                            if (oVar3 != null) {
                                                K(intValue3 + 1, oVar3);
                                                treeMap.remove(valueOf);
                                            }
                                        }
                                        K(i26, i25);
                                    }
                                } else {
                                    throw new IllegalArgumentException(defpackage.c.p("Invalid value index: ", i26));
                                }
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (a13 < t14) {
                        eVar4.K(eVar4.t(), v(a13));
                        K(a13, null);
                        a13++;
                    }
                }
                return eVar4;
            case 18:
                l3.h(0, str8, arrayList);
                e10 = new r(z(","));
                return e10;
            case 19:
                if (!arrayList.isEmpty()) {
                    e eVar5 = new e();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        o i27 = cVar.i((o) it4.next());
                        if (!(i27 instanceof g)) {
                            eVar5.K(eVar5.t(), i27);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int t15 = eVar5.t();
                    Iterator C5 = C();
                    while (C5.hasNext()) {
                        Integer num2 = (Integer) C5.next();
                        eVar5.K(num2.intValue() + t15, v(num2.intValue()));
                    }
                    treeMap.clear();
                    Iterator C6 = eVar5.C();
                    while (C6.hasNext()) {
                        Integer num3 = (Integer) C6.next();
                        K(num3.intValue(), eVar5.v(num3.intValue()));
                    }
                }
                e10 = new h(Double.valueOf(t()));
                return e10;
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final int t() {
        TreeMap treeMap = this.f8345u;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return z(",");
    }

    public final o v(int i6) {
        o oVar;
        if (i6 < t()) {
            if (L(i6) && (oVar = (o) this.f8345u.get(Integer.valueOf(i6))) != null) {
                return oVar;
            }
            return o.f8520d;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String z(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f8345u.isEmpty()) {
            for (int i6 = 0; i6 < t(); i6++) {
                o v10 = v(i6);
                sb2.append(str);
                if (!(v10 instanceof s) && !(v10 instanceof m)) {
                    sb2.append(v10.g());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public e(List list) {
        this();
        if (list != null) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                K(i6, (o) list.get(i6));
            }
        }
    }
}
