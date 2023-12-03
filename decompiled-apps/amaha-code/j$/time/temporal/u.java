package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class u implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a  reason: collision with root package name */
    private final long f21015a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21016b;

    /* renamed from: c  reason: collision with root package name */
    private final long f21017c;

    /* renamed from: d  reason: collision with root package name */
    private final long f21018d;

    private u(long j10, long j11, long j12, long j13) {
        this.f21015a = j10;
        this.f21016b = j11;
        this.f21017c = j12;
        this.f21018d = j13;
    }

    private String c(long j10, p pVar) {
        if (pVar == null) {
            return "Invalid value (valid values " + this + "): " + j10;
        }
        return "Invalid value for " + pVar + " (valid values " + this + "): " + j10;
    }

    public static u j(long j10, long j11) {
        if (j10 <= j11) {
            return new u(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static u k(long j10, long j11, long j12) {
        if (j10 <= 1) {
            if (j11 <= j12) {
                if (1 <= j12) {
                    return new u(j10, 1L, j11, j12);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public static u l(long j10, long j11) {
        return k(1L, j10, j11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j10 = this.f21015a;
        long j11 = this.f21016b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.f21017c;
        long j13 = this.f21018d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j10, p pVar) {
        if (h() && i(j10)) {
            return (int) j10;
        }
        throw new j$.time.d(c(j10, pVar));
    }

    public final void b(long j10, p pVar) {
        if (!i(j10)) {
            throw new j$.time.d(c(j10, pVar));
        }
    }

    public final long d() {
        return this.f21018d;
    }

    public final long e() {
        return this.f21015a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f21015a == uVar.f21015a && this.f21016b == uVar.f21016b && this.f21017c == uVar.f21017c && this.f21018d == uVar.f21018d;
        }
        return false;
    }

    public final long f() {
        return this.f21017c;
    }

    public final boolean g() {
        return this.f21015a == this.f21016b && this.f21017c == this.f21018d;
    }

    public final boolean h() {
        return this.f21015a >= -2147483648L && this.f21018d <= 2147483647L;
    }

    public final int hashCode() {
        long j10 = this.f21016b;
        long j11 = this.f21015a + (j10 << 16) + (j10 >> 48);
        long j12 = this.f21017c;
        long j13 = j11 + (j12 << 32) + (j12 >> 32);
        long j14 = this.f21018d;
        long j15 = j13 + (j14 << 48) + (j14 >> 16);
        return (int) ((j15 >>> 32) ^ j15);
    }

    public final boolean i(long j10) {
        return j10 >= this.f21015a && j10 <= this.f21018d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f21015a;
        sb2.append(j10);
        long j11 = this.f21016b;
        if (j10 != j11) {
            sb2.append('/');
            sb2.append(j11);
        }
        sb2.append(" - ");
        long j12 = this.f21017c;
        sb2.append(j12);
        long j13 = this.f21018d;
        if (j12 != j13) {
            sb2.append('/');
            sb2.append(j13);
        }
        return sb2.toString();
    }
}
