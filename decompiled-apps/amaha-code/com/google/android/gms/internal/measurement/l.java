package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public class l implements o, k {

    /* renamed from: u  reason: collision with root package name */
    public final HashMap f8452u = new HashMap();

    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        l lVar = new l();
        for (Map.Entry entry : this.f8452u.entrySet()) {
            boolean z10 = entry.getValue() instanceof k;
            HashMap hashMap = lVar.f8452u;
            if (z10) {
                hashMap.put((String) entry.getKey(), (o) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((o) entry.getValue()).e());
            }
        }
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f8452u.equals(((l) obj).f8452u);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f8452u.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final boolean m(String str) {
        return this.f8452u.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return new j(this.f8452u.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final void q(String str, o oVar) {
        HashMap hashMap = this.f8452u;
        if (oVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final o r(String str) {
        HashMap hashMap = this.f8452u;
        if (hashMap.containsKey(str)) {
            return (o) hashMap.get(str);
        }
        return o.f8520d;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public o s(String str, v.c cVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new r(toString());
        }
        return sp.b.l0(this, new r(str), cVar, arrayList);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap hashMap = this.f8452u;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
