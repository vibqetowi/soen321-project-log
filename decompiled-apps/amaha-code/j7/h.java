package j7;

import d7.s;
import id.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l7.a;
import n2.n;
import pd.d0;
import re.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements a.InterfaceC0377a, f.c, a.InterfaceC0519a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f21716u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f21717v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f21718w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f21719x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f21720y;

    public /* synthetic */ h(j jVar, Iterable iterable, s sVar, long j10) {
        this.f21716u = 0;
        this.f21718w = jVar;
        this.f21719x = iterable;
        this.f21720y = sVar;
        this.f21717v = j10;
    }

    @Override // id.f.c
    public final ScheduledFuture a(f.a aVar) {
        int i6 = this.f21716u;
        long j10 = this.f21717v;
        Object obj = this.f21720y;
        Object obj2 = this.f21719x;
        Object obj3 = this.f21718w;
        switch (i6) {
            case 1:
                id.e eVar = (id.e) obj3;
                eVar.getClass();
                n nVar = new n(1, eVar, (Callable) obj2, aVar);
                return eVar.f19975v.schedule(nVar, j10, (TimeUnit) obj);
            default:
                id.e eVar2 = (id.e) obj3;
                eVar2.getClass();
                id.c cVar = new id.c(eVar2, (Runnable) obj2, aVar, 2);
                return eVar2.f19975v.schedule(cVar, j10, (TimeUnit) obj);
        }
    }

    @Override // l7.a.InterfaceC0377a
    public final Object g() {
        j jVar = (j) this.f21718w;
        k7.d dVar = jVar.f21726c;
        dVar.z0((Iterable) this.f21719x);
        dVar.m0(jVar.f21729g.a() + this.f21717v, (s) this.f21720y);
        return null;
    }

    @Override // re.a.InterfaceC0519a
    public final void i(re.b bVar) {
        ((kd.a) bVar.get()).c((String) this.f21718w, (String) this.f21719x, this.f21717v, (d0) this.f21720y);
    }

    public /* synthetic */ h(Object obj, Object obj2, long j10, Object obj3, int i6) {
        this.f21716u = i6;
        this.f21718w = obj;
        this.f21719x = obj2;
        this.f21717v = j10;
        this.f21720y = obj3;
    }
}
