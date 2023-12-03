package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class s implements o {
    @Override // com.google.android.gms.internal.measurement.o
    public final o e() {
        return o.f8520d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof s;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String g() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean i() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
