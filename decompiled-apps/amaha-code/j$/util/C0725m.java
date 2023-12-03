package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.m  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0725m {

    /* renamed from: c  reason: collision with root package name */
    private static final C0725m f21235c = new C0725m();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21236a;

    /* renamed from: b  reason: collision with root package name */
    private final double f21237b;

    private C0725m() {
        this.f21236a = false;
        this.f21237b = Double.NaN;
    }

    private C0725m(double d10) {
        this.f21236a = true;
        this.f21237b = d10;
    }

    public static C0725m a() {
        return f21235c;
    }

    public static C0725m d(double d10) {
        return new C0725m(d10);
    }

    public final double b() {
        if (this.f21236a) {
            return this.f21237b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f21236a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0725m) {
            C0725m c0725m = (C0725m) obj;
            boolean z10 = this.f21236a;
            if (z10 && c0725m.f21236a) {
                if (Double.compare(this.f21237b, c0725m.f21237b) == 0) {
                    return true;
                }
            } else if (z10 == c0725m.f21236a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f21236a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f21237b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f21236a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f21237b)) : "OptionalDouble.empty";
    }
}
