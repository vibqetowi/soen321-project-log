package ke;

import ke.l;
/* compiled from: AutoValue_FieldIndex_IndexState.java */
/* loaded from: classes.dex */
public final class c extends l.b {

    /* renamed from: a  reason: collision with root package name */
    public final long f23264a;

    /* renamed from: b  reason: collision with root package name */
    public final l.a f23265b;

    public c(long j10, b bVar) {
        this.f23264a = j10;
        if (bVar != null) {
            this.f23265b = bVar;
            return;
        }
        throw new NullPointerException("Null offset");
    }

    @Override // ke.l.b
    public final l.a a() {
        return this.f23265b;
    }

    @Override // ke.l.b
    public final long b() {
        return this.f23264a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l.b)) {
            return false;
        }
        l.b bVar = (l.b) obj;
        if (this.f23264a == bVar.b() && this.f23265b.equals(bVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23264a;
        return this.f23265b.hashCode() ^ ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.f23264a + ", offset=" + this.f23265b + "}";
    }
}
