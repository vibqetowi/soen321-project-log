package is;
/* compiled from: IndexedValue.kt */
/* loaded from: classes2.dex */
public final class z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f20679a;

    /* renamed from: b  reason: collision with root package name */
    public final T f20680b;

    public z(int i6, T t3) {
        this.f20679a = i6;
        this.f20680b = t3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f20679a == zVar.f20679a && kotlin.jvm.internal.i.b(this.f20680b, zVar.f20680b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = this.f20679a * 31;
        T t3 = this.f20680b;
        if (t3 == null) {
            hashCode = 0;
        } else {
            hashCode = t3.hashCode();
        }
        return i6 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f20679a + ", value=" + this.f20680b + ')';
    }
}
