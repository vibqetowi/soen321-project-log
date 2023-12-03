package androidx.work;
/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface s {

    /* renamed from: a  reason: collision with root package name */
    public static final a.c f3336a = new a.c();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f3337b = new a.b();

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0044a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f3338a;

            public C0044a(Throwable th2) {
                this.f3338a = th2;
            }

            public final String toString() {
                return "FAILURE (" + this.f3338a.getMessage() + ")";
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
