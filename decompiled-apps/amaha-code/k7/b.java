package k7;

import d7.s;
/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final long f23030a;

    /* renamed from: b  reason: collision with root package name */
    public final s f23031b;

    /* renamed from: c  reason: collision with root package name */
    public final d7.n f23032c;

    public b(long j10, s sVar, d7.n nVar) {
        this.f23030a = j10;
        if (sVar != null) {
            this.f23031b = sVar;
            if (nVar != null) {
                this.f23032c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // k7.i
    public final d7.n a() {
        return this.f23032c;
    }

    @Override // k7.i
    public final long b() {
        return this.f23030a;
    }

    @Override // k7.i
    public final s c() {
        return this.f23031b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f23030a == iVar.b() && this.f23031b.equals(iVar.c()) && this.f23032c.equals(iVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23030a;
        return this.f23032c.hashCode() ^ ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f23031b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f23030a + ", transportContext=" + this.f23031b + ", event=" + this.f23032c + "}";
    }
}
