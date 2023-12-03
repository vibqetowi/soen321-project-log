package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class p4 implements Serializable, m4 {

    /* renamed from: u  reason: collision with root package name */
    public final Object f8548u;

    public p4(Object obj) {
        this.f8548u = obj;
    }

    @Override // com.google.android.gms.internal.measurement.m4
    public final Object a() {
        return this.f8548u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p4)) {
            return false;
        }
        Object obj2 = ((p4) obj).f8548u;
        Object obj3 = this.f8548u;
        if (obj3 != obj2 && !obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8548u});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f8548u + ")";
    }
}
