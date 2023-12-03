package hs;

import java.io.Serializable;
/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class f<A, B> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final A f19464u;

    /* renamed from: v  reason: collision with root package name */
    public final B f19465v;

    public f(A a10, B b10) {
        this.f19464u = a10;
        this.f19465v = b10;
    }

    public final A a() {
        return this.f19464u;
    }

    public final B b() {
        return this.f19465v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.i.b(this.f19464u, fVar.f19464u) && kotlin.jvm.internal.i.b(this.f19465v, fVar.f19465v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        A a10 = this.f19464u;
        if (a10 == null) {
            hashCode = 0;
        } else {
            hashCode = a10.hashCode();
        }
        int i10 = hashCode * 31;
        B b10 = this.f19465v;
        if (b10 != null) {
            i6 = b10.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        return "(" + this.f19464u + ", " + this.f19465v + ')';
    }
}
