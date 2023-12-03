package r1;

import java.util.Collection;
import r1.g;
import r1.l;
/* compiled from: MediaRouteProvider.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g.b.InterfaceC0515b f30276u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f30277v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Collection f30278w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ g.b f30279x;

    public h(g.b bVar, l.d.b bVar2, e eVar, Collection collection) {
        this.f30279x = bVar;
        this.f30276u = bVar2;
        this.f30277v = eVar;
        this.f30278w = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((l.d.b) this.f30276u).a(this.f30279x, this.f30277v, this.f30278w);
    }
}
