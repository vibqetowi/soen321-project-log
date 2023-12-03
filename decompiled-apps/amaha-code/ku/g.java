package ku;

import gt.a0;
import wu.b0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f23941a;

    public g(T t3) {
        this.f23941a = t3;
    }

    public abstract b0 a(a0 a0Var);

    public T b() {
        return this.f23941a;
    }

    public final boolean equals(Object obj) {
        g gVar;
        if (this != obj) {
            T b10 = b();
            Object obj2 = null;
            if (obj instanceof g) {
                gVar = (g) obj;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                obj2 = gVar.b();
            }
            if (!kotlin.jvm.internal.i.b(b10, obj2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        T b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
