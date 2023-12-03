package he;

import android.content.Context;
import he.f;
import he.u;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import je.z0;
/* compiled from: FirestoreClient.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final e9.c f17549a;

    /* renamed from: b  reason: collision with root package name */
    public final com.android.volley.toolbox.a f17550b;

    /* renamed from: c  reason: collision with root package name */
    public final com.android.volley.toolbox.a f17551c;

    /* renamed from: d  reason: collision with root package name */
    public final oe.a f17552d;

    /* renamed from: e  reason: collision with root package name */
    public final ne.q f17553e;
    public je.k f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f17554g;

    /* renamed from: h  reason: collision with root package name */
    public j f17555h;

    /* renamed from: i  reason: collision with root package name */
    public z0 f17556i;

    public n(Context context, e9.c cVar, com.google.firebase.firestore.c cVar2, com.android.volley.toolbox.a aVar, com.android.volley.toolbox.a aVar2, oe.a aVar3, ne.q qVar) {
        this.f17549a = cVar;
        this.f17550b = aVar;
        this.f17551c = aVar2;
        this.f17552d = aVar3;
        this.f17553e = qVar;
        ne.t.m((ke.f) cVar.f13869c).h();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        ya.i iVar = new ya.i();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar3.b(new u5.f(this, iVar, context, cVar2, 2));
        aVar.q(new k7.m(this, atomicBoolean, iVar, aVar3));
        aVar2.q(new d9.p(23));
    }

    public final void a(Context context, ge.e eVar, com.google.firebase.firestore.c cVar) {
        u uVar;
        kc.f.A(1, "FirestoreClient", "Initializing. user=%s", eVar.f16468a);
        ne.g gVar = new ne.g(context, this.f17549a, this.f17550b, this.f17551c, this.f17553e, this.f17552d);
        oe.a aVar = this.f17552d;
        f.a aVar2 = new f.a(context, aVar, this.f17549a, gVar, eVar, cVar);
        if (cVar.f9632c) {
            uVar = new b0();
        } else {
            uVar = new u();
        }
        androidx.work.k e10 = uVar.e(aVar2);
        uVar.f17482a = e10;
        e10.B();
        androidx.work.k kVar = uVar.f17482a;
        ca.a.v0(kVar, "persistence not initialized yet", new Object[0]);
        uVar.f17483b = new je.k(kVar, new je.z(), eVar);
        uVar.f = new ne.e(context);
        u.a aVar3 = new u.a();
        je.k a10 = uVar.a();
        ne.e eVar2 = uVar.f;
        ca.a.v0(eVar2, "connectivityMonitor not initialized yet", new Object[0]);
        uVar.f17485d = new ne.x(aVar3, a10, gVar, aVar, eVar2);
        je.k a11 = uVar.a();
        ne.x xVar = uVar.f17485d;
        ca.a.v0(xVar, "remoteStore not initialized yet", new Object[0]);
        uVar.f17484c = new c0(a11, xVar, eVar, 100);
        uVar.f17486e = new j(uVar.b());
        je.k kVar2 = uVar.f17483b;
        kVar2.f21846a.q().run();
        je.j jVar = new je.j(kVar2, 0);
        androidx.work.k kVar3 = kVar2.f21846a;
        kVar3.A("Start IndexManager", jVar);
        kVar3.A("Start MutationQueue", new je.j(kVar2, 1));
        uVar.f17485d.a();
        uVar.f17488h = uVar.c(aVar2);
        uVar.f17487g = uVar.d(aVar2);
        ca.a.v0(uVar.f17482a, "persistence not initialized yet", new Object[0]);
        this.f17556i = uVar.f17488h;
        this.f = uVar.a();
        ca.a.v0(uVar.f17485d, "remoteStore not initialized yet", new Object[0]);
        this.f17554g = uVar.b();
        j jVar2 = uVar.f17486e;
        ca.a.v0(jVar2, "eventManager not initialized yet", new Object[0]);
        this.f17555h = jVar2;
        je.e eVar3 = uVar.f17487g;
        z0 z0Var = this.f17556i;
        if (z0Var != null) {
            z0Var.start();
        }
        if (eVar3 != null) {
            eVar3.f21809a.start();
        }
    }

    public final ya.v b(List list) {
        synchronized (this.f17552d.f27381a) {
        }
        ya.i iVar = new ya.i();
        this.f17552d.b(new androidx.emoji2.text.g(12, this, list, iVar));
        return iVar.f38392a;
    }
}
