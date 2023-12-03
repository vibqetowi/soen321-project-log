package sf;
/* compiled from: TypeAdapter.java */
/* loaded from: classes.dex */
public final class u extends v<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f31518a;

    public u(v vVar) {
        this.f31518a = vVar;
    }

    @Override // sf.v
    public final Object a(yf.a aVar) {
        if (aVar.y0() == 9) {
            aVar.p0();
            return null;
        }
        return this.f31518a.a(aVar);
    }

    @Override // sf.v
    public final void b(yf.b bVar, Object obj) {
        if (obj == null) {
            bVar.G();
        } else {
            this.f31518a.b(bVar, obj);
        }
    }
}
