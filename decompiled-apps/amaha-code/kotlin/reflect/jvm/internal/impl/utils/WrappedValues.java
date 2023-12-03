package kotlin.reflect.jvm.internal.impl.utils;
/* loaded from: classes2.dex */
public final class WrappedValues {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23477a = new a();

    /* loaded from: classes2.dex */
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f23478a;

        public b(Throwable th2) {
            this.f23478a = th2;
        }

        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            if (i6 != 1) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i6 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i6 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i6 != 1) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public final String toString() {
            return this.f23478a.toString();
        }
    }

    public static void a(Object obj) {
        if (obj instanceof b) {
            Throwable th2 = ((b) obj).f23478a;
            if (th2 != null) {
                throw th2;
            }
            b.a(1);
            throw null;
        }
    }
}
