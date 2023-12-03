package j$.util;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public final class Optional<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final Optional f21093b = new Optional();

    /* renamed from: a  reason: collision with root package name */
    private final Object f21094a;

    private Optional() {
        this.f21094a = null;
    }

    private Optional(Object obj) {
        this.f21094a = Objects.requireNonNull(obj);
    }

    public static Optional a() {
        return f21093b;
    }

    public static Optional d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t3) {
        return t3 == null ? f21093b : new Optional<>(t3);
    }

    public final Object b() {
        Object obj = this.f21094a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f21094a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f21094a, ((Optional) obj).f21094a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f21094a);
    }

    public final String toString() {
        Object obj = this.f21094a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
