package e7;
/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final int f13812a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13813b;

    public b(int i6, long j10) {
        if (i6 != 0) {
            this.f13812a = i6;
            this.f13813b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // e7.g
    public final long a() {
        return this.f13813b;
    }

    @Override // e7.g
    public final int b() {
        return this.f13812a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (v.h.b(this.f13812a, gVar.b()) && this.f13813b == gVar.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f13813b;
        return ((v.h.d(this.f13812a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + defpackage.d.u(this.f13812a) + ", nextRequestWaitMillis=" + this.f13813b + "}";
    }
}
