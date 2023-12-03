package he;
/* compiled from: ListenerRegistrationImpl.java */
/* loaded from: classes.dex */
public final class t implements fe.o {

    /* renamed from: a  reason: collision with root package name */
    public final n f17565a;

    /* renamed from: b  reason: collision with root package name */
    public final z f17566b;

    /* renamed from: c  reason: collision with root package name */
    public final d<h0> f17567c;

    public t(n nVar, z zVar, d<h0> dVar) {
        this.f17565a = nVar;
        this.f17566b = zVar;
        this.f17567c = dVar;
    }

    @Override // fe.o
    public final void remove() {
        this.f17567c.f17469c = true;
        n nVar = this.f17565a;
        z zVar = this.f17566b;
        synchronized (nVar.f17552d.f27381a) {
        }
        nVar.f17552d.b(new m(nVar, zVar, 1));
    }
}
