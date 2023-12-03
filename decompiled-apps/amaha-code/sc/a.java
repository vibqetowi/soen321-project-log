package sc;
/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    public final long f31417a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31418b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31419c;

    public a(long j10, long j11, long j12) {
        this.f31417a = j10;
        this.f31418b = j11;
        this.f31419c = j12;
    }

    @Override // sc.g
    public final long a() {
        return this.f31418b;
    }

    @Override // sc.g
    public final long b() {
        return this.f31417a;
    }

    @Override // sc.g
    public final long c() {
        return this.f31419c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f31417a == gVar.b() && this.f31418b == gVar.a() && this.f31419c == gVar.c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f31417a;
        long j11 = this.f31418b;
        long j12 = this.f31419c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f31417a + ", elapsedRealtime=" + this.f31418b + ", uptimeMillis=" + this.f31419c + "}";
    }
}
