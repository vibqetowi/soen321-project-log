package at;

import java.lang.ref.WeakReference;
/* compiled from: moduleByClassLoader.kt */
/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<ClassLoader> f3608a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3609b;

    public u0(ClassLoader classLoader) {
        this.f3608a = new WeakReference<>(classLoader);
        this.f3609b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u0) && this.f3608a.get() == ((u0) obj).f3608a.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3609b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = this.f3608a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}
