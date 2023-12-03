package i3;

import d3.a;
/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public final class a implements a.InterfaceC0183a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d3.c f19741a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f19742b;

    public a(b bVar, d3.c cVar) {
        this.f19742b = bVar;
        this.f19741a = cVar;
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        boolean z10;
        if (this.f19741a.k() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        b bVar = this.f19742b;
        if (z10 != bVar.f19761u) {
            bVar.f19761u = z10;
            bVar.f19754m.invalidateSelf();
        }
    }
}
