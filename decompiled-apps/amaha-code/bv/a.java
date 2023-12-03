package bv;

import kotlin.jvm.internal.i;
/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f4719a;

    /* renamed from: b  reason: collision with root package name */
    public final T f4720b;

    public a(T t3, T t10) {
        this.f4719a = t3;
        this.f4720b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (i.b(this.f4719a, aVar.f4719a) && i.b(this.f4720b, aVar.f4720b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        T t3 = this.f4719a;
        if (t3 == null) {
            hashCode = 0;
        } else {
            hashCode = t3.hashCode();
        }
        int i10 = hashCode * 31;
        T t10 = this.f4720b;
        if (t10 != null) {
            i6 = t10.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f4719a + ", upper=" + this.f4720b + ')';
    }
}
