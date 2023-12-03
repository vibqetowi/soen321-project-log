package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class g implements o {

    /* renamed from: u  reason: collision with root package name */
    public final o f8387u;

    /* renamed from: v  reason: collision with root package name */
    public final String f8388v;

    public g(String str) {
        this.f8387u = o.f8520d;
        this.f8388v = str;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        return new g(this.f8388v, this.f8387u.e());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f8388v.equals(gVar.f8388v) && this.f8387u.equals(gVar.f8387u)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.f8387u.hashCode() + (this.f8388v.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public g(String str, o oVar) {
        this.f8387u = oVar;
        this.f8388v = str;
    }

    public g() {
        throw null;
    }
}
