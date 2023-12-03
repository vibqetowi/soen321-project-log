package kf;

import java.util.NoSuchElementException;
/* compiled from: Optional.java */
/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f23312a;

    public e() {
        this.f23312a = null;
    }

    public final T a() {
        T t3 = this.f23312a;
        if (t3 != null) {
            return t3;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        if (this.f23312a != null) {
            return true;
        }
        return false;
    }

    public e(T t3) {
        if (t3 != null) {
            this.f23312a = t3;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
