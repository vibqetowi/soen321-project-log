package ke;
/* compiled from: MutableDocument.java */
/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: b  reason: collision with root package name */
    public final i f23285b;

    /* renamed from: c  reason: collision with root package name */
    public int f23286c;

    /* renamed from: d  reason: collision with root package name */
    public r f23287d;

    /* renamed from: e  reason: collision with root package name */
    public r f23288e;
    public o f;

    /* renamed from: g  reason: collision with root package name */
    public int f23289g;

    public n(i iVar) {
        this.f23285b = iVar;
        this.f23288e = r.f23293v;
    }

    public static n m(i iVar) {
        r rVar = r.f23293v;
        return new n(iVar, 1, rVar, rVar, new o(), 3);
    }

    public static n n(i iVar, r rVar) {
        n nVar = new n(iVar);
        nVar.k(rVar);
        return nVar;
    }

    @Override // ke.g
    public final n a() {
        return new n(this.f23285b, this.f23286c, this.f23287d, this.f23288e, new o(this.f.b()), this.f23289g);
    }

    @Override // ke.g
    public final boolean b() {
        return v.h.b(this.f23286c, 2);
    }

    @Override // ke.g
    public final boolean c() {
        return v.h.b(this.f23289g, 2);
    }

    @Override // ke.g
    public final boolean d() {
        return v.h.b(this.f23289g, 1);
    }

    @Override // ke.g
    public final rf.s e(m mVar) {
        return o.d(mVar, this.f.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f23285b.equals(nVar.f23285b) || !this.f23287d.equals(nVar.f23287d) || !v.h.b(this.f23286c, nVar.f23286c) || !v.h.b(this.f23289g, nVar.f23289g)) {
            return false;
        }
        return this.f.equals(nVar.f);
    }

    @Override // ke.g
    public final boolean f() {
        if (!d() && !c()) {
            return false;
        }
        return true;
    }

    @Override // ke.g
    public final r g() {
        return this.f23288e;
    }

    @Override // ke.g
    public final o getData() {
        return this.f;
    }

    @Override // ke.g
    public final i getKey() {
        return this.f23285b;
    }

    @Override // ke.g
    public final boolean h() {
        return v.h.b(this.f23286c, 3);
    }

    public final int hashCode() {
        return this.f23285b.hashCode();
    }

    @Override // ke.g
    public final r i() {
        return this.f23287d;
    }

    public final void j(r rVar, o oVar) {
        this.f23287d = rVar;
        this.f23286c = 2;
        this.f = oVar;
        this.f23289g = 3;
    }

    public final void k(r rVar) {
        this.f23287d = rVar;
        this.f23286c = 3;
        this.f = new o();
        this.f23289g = 3;
    }

    public final boolean l() {
        return v.h.b(this.f23286c, 4);
    }

    public final String toString() {
        return "Document{key=" + this.f23285b + ", version=" + this.f23287d + ", readTime=" + this.f23288e + ", type=" + defpackage.e.z(this.f23286c) + ", documentState=" + defpackage.d.w(this.f23289g) + ", value=" + this.f + '}';
    }

    public n(i iVar, int i6, r rVar, r rVar2, o oVar, int i10) {
        this.f23285b = iVar;
        this.f23287d = rVar;
        this.f23288e = rVar2;
        this.f23286c = i6;
        this.f23289g = i10;
        this.f = oVar;
    }
}
