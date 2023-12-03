package c7;
/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f5059a;

    public h(long j10) {
        this.f5059a = j10;
    }

    @Override // c7.n
    public final long b() {
        return this.f5059a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && this.f5059a == ((n) obj).b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5059a;
        return 1000003 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f5059a + "}";
    }
}
