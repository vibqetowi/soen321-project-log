package r1;

import java.util.ArrayList;
import java.util.Collection;
import r1.g;
import r1.l;
/* compiled from: MediaRouteProvider.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g.b.InterfaceC0515b f30280u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f30281v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Collection f30282w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ g.b f30283x;

    public i(g.b bVar, g.b.InterfaceC0515b interfaceC0515b, e eVar, ArrayList arrayList) {
        this.f30283x = bVar;
        this.f30280u = interfaceC0515b;
        this.f30281v = eVar;
        this.f30282w = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((l.d.b) this.f30280u).a(this.f30283x, this.f30281v, this.f30282w);
    }
}
