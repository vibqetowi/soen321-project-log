package je;
/* compiled from: TargetData.java */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final he.d0 f21796a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21797b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21798c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f21799d;

    /* renamed from: e  reason: collision with root package name */
    public final ke.r f21800e;
    public final ke.r f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.protobuf.h f21801g;

    public b1(he.d0 d0Var, int i6, long j10, a0 a0Var, ke.r rVar, ke.r rVar2, com.google.protobuf.h hVar) {
        d0Var.getClass();
        this.f21796a = d0Var;
        this.f21797b = i6;
        this.f21798c = j10;
        this.f = rVar2;
        this.f21799d = a0Var;
        rVar.getClass();
        this.f21800e = rVar;
        hVar.getClass();
        this.f21801g = hVar;
    }

    public final b1 a(com.google.protobuf.h hVar, ke.r rVar) {
        return new b1(this.f21796a, this.f21797b, this.f21798c, this.f21799d, rVar, this.f, hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f21796a.equals(b1Var.f21796a) && this.f21797b == b1Var.f21797b && this.f21798c == b1Var.f21798c && this.f21799d.equals(b1Var.f21799d) && this.f21800e.equals(b1Var.f21800e) && this.f.equals(b1Var.f) && this.f21801g.equals(b1Var.f21801g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f21799d.hashCode();
        int hashCode2 = this.f21800e.hashCode();
        int hashCode3 = this.f.hashCode();
        return this.f21801g.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f21796a.hashCode() * 31) + this.f21797b) * 31) + ((int) this.f21798c)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetData{target=" + this.f21796a + ", targetId=" + this.f21797b + ", sequenceNumber=" + this.f21798c + ", purpose=" + this.f21799d + ", snapshotVersion=" + this.f21800e + ", lastLimboFreeSnapshotVersion=" + this.f + ", resumeToken=" + this.f21801g + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b1(he.d0 d0Var, int i6, long j10, a0 a0Var) {
        this(d0Var, i6, j10, a0Var, r7, r7, ne.e0.f26212t);
        ke.r rVar = ke.r.f23293v;
    }
}
