package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0727o {

    /* renamed from: c  reason: collision with root package name */
    private static final C0727o f21241c = new C0727o();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21242a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21243b;

    private C0727o() {
        this.f21242a = false;
        this.f21243b = 0L;
    }

    private C0727o(long j10) {
        this.f21242a = true;
        this.f21243b = j10;
    }

    public static C0727o a() {
        return f21241c;
    }

    public static C0727o d(long j10) {
        return new C0727o(j10);
    }

    public final long b() {
        if (this.f21242a) {
            return this.f21243b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f21242a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0727o) {
            C0727o c0727o = (C0727o) obj;
            boolean z10 = this.f21242a;
            if (z10 && c0727o.f21242a) {
                if (this.f21243b == c0727o.f21243b) {
                    return true;
                }
            } else if (z10 == c0727o.f21242a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f21242a) {
            long j10 = this.f21243b;
            return (int) (j10 ^ (j10 >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f21242a ? String.format("OptionalLong[%s]", Long.valueOf(this.f21243b)) : "OptionalLong.empty";
    }
}
