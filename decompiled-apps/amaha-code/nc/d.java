package nc;

import java.io.Serializable;
/* compiled from: Equivalence.java */
/* loaded from: classes.dex */
public abstract class d<T> {

    /* compiled from: Equivalence.java */
    /* loaded from: classes.dex */
    public static final class a extends d<Object> implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public static final a f25991u = new a();

        private Object readResolve() {
            return f25991u;
        }

        @Override // nc.d
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // nc.d
        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* loaded from: classes.dex */
    public static final class b extends d<Object> implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public static final b f25992u = new b();

        private Object readResolve() {
            return f25992u;
        }

        @Override // nc.d
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // nc.d
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public abstract boolean a(T t3, T t10);

    public abstract int b(T t3);

    public final boolean c(T t3, T t10) {
        if (t3 == t10) {
            return true;
        }
        if (t3 != null && t10 != null) {
            return a(t3, t10);
        }
        return false;
    }
}
