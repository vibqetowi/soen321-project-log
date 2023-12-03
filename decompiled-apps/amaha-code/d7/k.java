package d7;

import android.content.Context;
import d7.o;
import java.util.concurrent.Executor;
import k7.f;
import k7.g;
import k7.h;
import m7.b;
import m7.c;
/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: u  reason: collision with root package name */
    public gs.a<Executor> f12247u = f7.a.a(o.a.f12255a);

    /* renamed from: v  reason: collision with root package name */
    public f7.c f12248v;

    /* renamed from: w  reason: collision with root package name */
    public gs.a f12249w;

    /* renamed from: x  reason: collision with root package name */
    public e7.j f12250x;

    /* renamed from: y  reason: collision with root package name */
    public gs.a<k7.o> f12251y;

    /* renamed from: z  reason: collision with root package name */
    public gs.a<w> f12252z;

    public k(Context context) {
        if (context != null) {
            f7.c cVar = new f7.c(context);
            this.f12248v = cVar;
            m7.b bVar = b.a.f24921a;
            m7.c cVar2 = c.a.f24922a;
            this.f12249w = f7.a.a(new androidx.appcompat.widget.l(cVar, 11, new e7.j(cVar, bVar, cVar2, 0)));
            f7.c cVar3 = this.f12248v;
            this.f12250x = new e7.j(cVar3, f.a.f23034a, g.a.f23035a, 1);
            gs.a<k7.o> a10 = f7.a.a(new y(bVar, cVar2, h.a.f23036a, this.f12250x, f7.a.a(new i7.d(cVar3, 1)), 2));
            this.f12251y = a10;
            i7.d dVar = new i7.d(bVar, 0);
            f7.c cVar4 = this.f12248v;
            i7.e eVar = new i7.e(cVar4, a10, dVar, cVar2, 0);
            gs.a<Executor> aVar = this.f12247u;
            gs.a aVar2 = this.f12249w;
            this.f12252z = f7.a.a(new y(bVar, cVar2, new y(aVar, aVar2, eVar, a10, a10, 1), new j7.k(cVar4, aVar2, a10, eVar, aVar, a10, bVar, cVar2, a10), new i7.e(aVar, a10, eVar, a10, 1), 0));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
