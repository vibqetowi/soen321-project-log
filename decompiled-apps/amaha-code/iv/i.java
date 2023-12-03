package iv;
/* compiled from: Channel.kt */
/* loaded from: classes2.dex */
public final class i<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f20745b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Object f20746a;

    /* compiled from: Channel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f20747a;

        public a(Throwable th2) {
            this.f20747a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.i.b(this.f20747a, ((a) obj).f20747a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f20747a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // iv.i.b
        public final String toString() {
            return "Closed(" + this.f20747a + ')';
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: classes2.dex */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (!kotlin.jvm.internal.i.b(this.f20746a, ((i) obj).f20746a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f20746a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f20746a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
