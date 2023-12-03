package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.n  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0726n {

    /* renamed from: c  reason: collision with root package name */
    private static final C0726n f21238c = new C0726n();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21239a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21240b;

    private C0726n() {
        this.f21239a = false;
        this.f21240b = 0;
    }

    private C0726n(int i6) {
        this.f21239a = true;
        this.f21240b = i6;
    }

    public static C0726n a() {
        return f21238c;
    }

    public static C0726n d(int i6) {
        return new C0726n(i6);
    }

    public final int b() {
        if (this.f21239a) {
            return this.f21240b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f21239a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0726n) {
            C0726n c0726n = (C0726n) obj;
            boolean z10 = this.f21239a;
            if (z10 && c0726n.f21239a) {
                if (this.f21240b == c0726n.f21240b) {
                    return true;
                }
            } else if (z10 == c0726n.f21239a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f21239a) {
            return this.f21240b;
        }
        return 0;
    }

    public final String toString() {
        return this.f21239a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f21240b)) : "OptionalInt.empty";
    }
}
