package hs;

import java.io.Serializable;
/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public final class g<T> implements Serializable {

    /* compiled from: Result.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final Throwable f19466u;

        public a(Throwable exception) {
            kotlin.jvm.internal.i.g(exception, "exception");
            this.f19466u = exception;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.i.b(this.f19466u, ((a) obj).f19466u)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f19466u.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f19466u + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f19466u;
        }
        return null;
    }
}
