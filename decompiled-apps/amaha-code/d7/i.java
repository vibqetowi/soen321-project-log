package d7;
/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final s f12236a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12237b;

    /* renamed from: c  reason: collision with root package name */
    public final a7.c<?> f12238c;

    /* renamed from: d  reason: collision with root package name */
    public final a7.e<?, byte[]> f12239d;

    /* renamed from: e  reason: collision with root package name */
    public final a7.b f12240e;

    public i(s sVar, String str, a7.c cVar, a7.e eVar, a7.b bVar) {
        this.f12236a = sVar;
        this.f12237b = str;
        this.f12238c = cVar;
        this.f12239d = eVar;
        this.f12240e = bVar;
    }

    @Override // d7.r
    public final a7.b a() {
        return this.f12240e;
    }

    @Override // d7.r
    public final a7.c<?> b() {
        return this.f12238c;
    }

    @Override // d7.r
    public final a7.e<?, byte[]> c() {
        return this.f12239d;
    }

    @Override // d7.r
    public final s d() {
        return this.f12236a;
    }

    @Override // d7.r
    public final String e() {
        return this.f12237b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f12236a.equals(rVar.d()) && this.f12237b.equals(rVar.e()) && this.f12238c.equals(rVar.b()) && this.f12239d.equals(rVar.c()) && this.f12240e.equals(rVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f12236a.hashCode() ^ 1000003) * 1000003) ^ this.f12237b.hashCode()) * 1000003) ^ this.f12238c.hashCode()) * 1000003) ^ this.f12239d.hashCode()) * 1000003) ^ this.f12240e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f12236a + ", transportName=" + this.f12237b + ", event=" + this.f12238c + ", transformer=" + this.f12239d + ", encoding=" + this.f12240e + "}";
    }
}
