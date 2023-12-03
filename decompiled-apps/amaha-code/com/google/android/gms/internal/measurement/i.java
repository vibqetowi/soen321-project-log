package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public abstract class i implements o, k {

    /* renamed from: u  reason: collision with root package name */
    public final String f8419u;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap f8420v = new HashMap();

    public i(String str) {
        this.f8419u = str;
    }

    public abstract o a(v.c cVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.f8419u;
        if (str == null) {
            return false;
        }
        return str.equals(iVar.f8419u);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        return this.f8419u;
    }

    public final int hashCode() {
        String str = this.f8419u;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final boolean m(String str) {
        return this.f8420v.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return new j(this.f8420v.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final void q(String str, o oVar) {
        HashMap hashMap = this.f8420v;
        if (oVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final o r(String str) {
        HashMap hashMap = this.f8420v;
        if (hashMap.containsKey(str)) {
            return (o) hashMap.get(str);
        }
        return o.f8520d;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new r(this.f8419u);
        }
        return sp.b.l0(this, new r(str), cVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public o e() {
        return this;
    }
}
