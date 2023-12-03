package h3;
/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17119a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final String f17120b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.b f17121c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17122d;

    /* renamed from: e  reason: collision with root package name */
    public final g3.e f17123e;
    public final Object f;

    public i(String str, g3.b bVar, g3.b bVar2, g3.d dVar, boolean z10) {
        this.f17120b = str;
        this.f17121c = bVar;
        this.f17123e = bVar2;
        this.f = dVar;
        this.f17122d = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        switch (this.f17119a) {
            case 0:
                return new c3.n(jVar, bVar, this);
            default:
                return new c3.o(jVar, bVar, this);
        }
    }

    public final String toString() {
        switch (this.f17119a) {
            case 0:
                return "RectangleShape{position=" + this.f17123e + ", size=" + ((g3.a) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, g3.e eVar, g3.a aVar, g3.b bVar, boolean z10) {
        this.f17120b = str;
        this.f17123e = eVar;
        this.f = aVar;
        this.f17121c = bVar;
        this.f17122d = z10;
    }
}
