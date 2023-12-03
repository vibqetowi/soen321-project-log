package kotlin.jvm.internal;
/* compiled from: PackageReference.kt */
/* loaded from: classes2.dex */
public final class o implements b {

    /* renamed from: u  reason: collision with root package name */
    public final Class<?> f23465u;

    public o(Class<?> jClass, String str) {
        i.g(jClass, "jClass");
        this.f23465u = jClass;
    }

    @Override // kotlin.jvm.internal.b
    public final Class<?> e() {
        return this.f23465u;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (i.b(this.f23465u, ((o) obj).f23465u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23465u.hashCode();
    }

    public final String toString() {
        return this.f23465u.toString() + " (Kotlin reflection is not available)";
    }
}
