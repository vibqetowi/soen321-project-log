package at;

import java.lang.ref.SoftReference;
/* compiled from: ReflectProperties.java */
/* loaded from: classes2.dex */
public final class n0 {

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes2.dex */
    public static class a<T> extends c<T> implements ss.a<T> {

        /* renamed from: v  reason: collision with root package name */
        public final ss.a<T> f3582v;

        /* renamed from: w  reason: collision with root package name */
        public volatile SoftReference<Object> f3583w;

        public a(T t3, ss.a<T> aVar) {
            if (aVar != null) {
                this.f3583w = null;
                this.f3582v = aVar;
                if (t3 != null) {
                    this.f3583w = new SoftReference<>(t3);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // ss.a
        public final T invoke() {
            T t3;
            SoftReference<Object> softReference = this.f3583w;
            c.a aVar = c.f3586u;
            if (softReference != null && (t3 = (T) softReference.get()) != null) {
                if (t3 == aVar) {
                    return null;
                }
                return t3;
            }
            T invoke = this.f3582v.invoke();
            if (invoke != null) {
                aVar = invoke;
            }
            this.f3583w = new SoftReference<>(aVar);
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes2.dex */
    public static class b<T> extends c<T> {

        /* renamed from: v  reason: collision with root package name */
        public final ss.a<T> f3584v;

        /* renamed from: w  reason: collision with root package name */
        public volatile Object f3585w = null;

        public b(ss.a<T> aVar) {
            this.f3584v = aVar;
        }

        public final T invoke() {
            T t3 = (T) this.f3585w;
            c.a aVar = c.f3586u;
            if (t3 != null) {
                if (t3 == aVar) {
                    return null;
                }
                return t3;
            }
            T invoke = this.f3584v.invoke();
            if (invoke != null) {
                aVar = invoke;
            }
            this.f3585w = aVar;
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes2.dex */
    public static abstract class c<T> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f3586u = new a();

        /* compiled from: ReflectProperties.java */
        /* loaded from: classes2.dex */
        public static class a {
        }
    }

    public static /* synthetic */ void a(int i6) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i6 != 1 && i6 != 2) {
            objArr[2] = "lazy";
        } else {
            objArr[2] = "lazySoft";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <T> b<T> b(ss.a<T> aVar) {
        return new b<>(aVar);
    }

    public static <T> a<T> c(ss.a<T> aVar) {
        if (aVar != null) {
            return new a<>(null, aVar);
        }
        a(2);
        throw null;
    }
}
