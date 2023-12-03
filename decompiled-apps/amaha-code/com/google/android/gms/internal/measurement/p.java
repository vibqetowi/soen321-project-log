package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: u  reason: collision with root package name */
    public final String f8545u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f8546v;

    public p(String str, ArrayList arrayList) {
        this.f8545u = str;
        ArrayList arrayList2 = new ArrayList();
        this.f8546v = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f8545u;
        if (str == null ? pVar.f8545u != null : !str.equals(pVar.f8545u)) {
            return false;
        }
        return this.f8546v.equals(pVar.f8546v);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        int i6;
        String str = this.f8545u;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return this.f8546v.hashCode() + (i6 * 31);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        return this;
    }
}
