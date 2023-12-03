package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class f implements o {

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8373u;

    public f(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f8373u = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        return new f(Boolean.valueOf(this.f8373u));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && this.f8373u == ((f) obj).f8373u) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        double d10;
        if (true != this.f8373u) {
            d10 = 0.0d;
        } else {
            d10 = 1.0d;
        }
        return Double.valueOf(d10);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        return Boolean.toString(this.f8373u);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f8373u).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        return Boolean.valueOf(this.f8373u);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z10 = this.f8373u;
        if (equals) {
            return new r(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(z10), str));
    }

    public final String toString() {
        return String.valueOf(this.f8373u);
    }
}
