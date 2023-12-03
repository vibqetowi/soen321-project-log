package hs;

import java.io.Serializable;
/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class j<A, B, C> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final A f19473u;

    /* renamed from: v  reason: collision with root package name */
    public final B f19474v;

    /* renamed from: w  reason: collision with root package name */
    public final C f19475w;

    public j(A a10, B b10, C c10) {
        this.f19473u = a10;
        this.f19474v = b10;
        this.f19475w = c10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (kotlin.jvm.internal.i.b(this.f19473u, jVar.f19473u) && kotlin.jvm.internal.i.b(this.f19474v, jVar.f19474v) && kotlin.jvm.internal.i.b(this.f19475w, jVar.f19475w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i6 = 0;
        A a10 = this.f19473u;
        if (a10 == null) {
            hashCode = 0;
        } else {
            hashCode = a10.hashCode();
        }
        int i10 = hashCode * 31;
        B b10 = this.f19474v;
        if (b10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b10.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        C c10 = this.f19475w;
        if (c10 != null) {
            i6 = c10.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        return "(" + this.f19473u + ", " + this.f19474v + ", " + this.f19475w + ')';
    }
}
