package kotlinx.coroutines;
/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23708a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<Throwable, hs.k> f23709b;

    public v(ss.l lVar, Object obj) {
        this.f23708a = obj;
        this.f23709b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (kotlin.jvm.internal.i.b(this.f23708a, vVar.f23708a) && kotlin.jvm.internal.i.b(this.f23709b, vVar.f23709b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f23708a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f23709b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f23708a + ", onCancellation=" + this.f23709b + ')';
    }
}
