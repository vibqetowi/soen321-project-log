package uh;

import com.moengage.core.internal.exception.NetworkRequestDisabledException;
import com.moengage.core.internal.exception.NetworkRequestFailedException;
import ih.f;
import ih.m;
import ih.n;
import ih.o;
import ih.p;
import ih.q;
import ih.r;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import qg.w;
import s1.s;
import wh.g;
import wh.h;
/* compiled from: CoreRepository.kt */
/* loaded from: classes.dex */
public final class b implements vh.c, g {

    /* renamed from: a  reason: collision with root package name */
    public final g f34155a;

    /* renamed from: b  reason: collision with root package name */
    public final vh.c f34156b;

    /* renamed from: c  reason: collision with root package name */
    public final p f34157c;

    /* renamed from: d  reason: collision with root package name */
    public final String f34158d;

    /* compiled from: CoreRepository.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" syncConfig() : SDK disabled.", b.this.f34158d);
        }
    }

    /* compiled from: CoreRepository.kt */
    /* renamed from: uh.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0572b extends k implements ss.a<String> {
        public C0572b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" syncConfig() : Syncing config", b.this.f34158d);
        }
    }

    /* compiled from: CoreRepository.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" syncDeviceInfo() : Syncing device info", b.this.f34158d);
        }
    }

    /* compiled from: CoreRepository.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" syncLogs() : Syncing logs.", b.this.f34158d);
        }
    }

    /* compiled from: CoreRepository.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" syncLogs() : ", b.this.f34158d);
        }
    }

    public b(h hVar, vh.d dVar, p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        this.f34155a = hVar;
        this.f34156b = dVar;
        this.f34157c = sdkInstance;
        this.f34158d = "Core_CoreRepository";
    }

    @Override // vh.c
    public final void A(int i6) {
        this.f34156b.A(i6);
    }

    @Override // vh.c
    public final ih.e B(String attributeName) {
        i.g(attributeName, "attributeName");
        return this.f34156b.B(attributeName);
    }

    @Override // vh.c
    public final JSONObject C(ih.g devicePreferences, ih.e pushTokens, p sdkInstance) {
        i.g(devicePreferences, "devicePreferences");
        i.g(pushTokens, "pushTokens");
        i.g(sdkInstance, "sdkInstance");
        return this.f34156b.C(devicePreferences, pushTokens, sdkInstance);
    }

    @Override // vh.c
    public final long D() {
        return this.f34156b.D();
    }

    @Override // vh.c
    public final f E() {
        return this.f34156b.E();
    }

    @Override // vh.c
    public final jg.d F() {
        return this.f34156b.F();
    }

    @Override // vh.c
    public final boolean G() {
        return this.f34156b.G();
    }

    @Override // vh.c
    public final mh.a H(String attributeName) {
        i.g(attributeName, "attributeName");
        return this.f34156b.H(attributeName);
    }

    @Override // vh.c
    public final boolean I() {
        return this.f34156b.I();
    }

    @Override // vh.c
    public final long J(mh.d dVar) {
        return this.f34156b.J(dVar);
    }

    @Override // vh.c
    public final qh.a K() {
        return this.f34156b.K();
    }

    @Override // vh.c
    public final String L() {
        return this.f34156b.L();
    }

    @Override // vh.c
    public final void M(long j10) {
        this.f34156b.M(j10);
    }

    @Override // vh.c
    public final String N() {
        return this.f34156b.N();
    }

    @Override // vh.c
    public final void O() {
        this.f34156b.O();
    }

    @Override // vh.c
    public final void P(boolean z10) {
        this.f34156b.P(z10);
    }

    @Override // vh.c
    public final ih.g Q() {
        return this.f34156b.Q();
    }

    @Override // vh.c
    public final int R(mh.b batchEntity) {
        i.g(batchEntity, "batchEntity");
        return this.f34156b.R(batchEntity);
    }

    @Override // vh.c
    public final void S(HashSet screenNames) {
        i.g(screenNames, "screenNames");
        this.f34156b.S(screenNames);
    }

    @Override // vh.c
    public final String T() {
        return this.f34156b.T();
    }

    @Override // vh.c
    public final Set<String> U() {
        return this.f34156b.U();
    }

    @Override // vh.c
    public final void V(String gaid) {
        i.g(gaid, "gaid");
        this.f34156b.V(gaid);
    }

    @Override // vh.c
    public final List W() {
        return this.f34156b.W();
    }

    @Override // vh.c
    public final void X(ih.e eVar) {
        this.f34156b.X(eVar);
    }

    @Override // vh.c
    public final boolean Y() {
        return this.f34156b.Y();
    }

    @Override // vh.c
    public final boolean Z() {
        return this.f34156b.Z();
    }

    @Override // vh.c
    public final q a() {
        return this.f34156b.a();
    }

    @Override // vh.c
    public final void a0() {
        this.f34156b.a0();
    }

    @Override // vh.c
    public final void b() {
        this.f34156b.b();
    }

    @Override // vh.c
    public final void b0(mh.a aVar) {
        this.f34156b.b0(aVar);
    }

    @Override // vh.c
    public final void c(String str) {
        this.f34156b.c(str);
    }

    @Override // vh.c
    public final void c0(jh.b session) {
        i.g(session, "session");
        this.f34156b.c0(session);
    }

    @Override // vh.c
    public final boolean d() {
        return this.f34156b.d();
    }

    @Override // vh.c
    public final long d0(mh.c cVar) {
        return this.f34156b.d0(cVar);
    }

    @Override // wh.g
    public final boolean e(oh.b bVar) {
        return this.f34155a.e(bVar);
    }

    @Override // vh.c
    public final ih.e e0() {
        return this.f34156b.e0();
    }

    @Override // vh.c
    public final long f() {
        return this.f34156b.f();
    }

    @Override // wh.g
    public final m f0(oh.a aVar) {
        return this.f34155a.f0(aVar);
    }

    @Override // vh.c
    public final void g(boolean z10) {
        this.f34156b.g(z10);
    }

    @Override // vh.c
    public final String g0() {
        return this.f34156b.g0();
    }

    @Override // vh.c
    public final jh.b h() {
        return this.f34156b.h();
    }

    public final boolean h0() {
        if (this.f34157c.f20104c.f33010a && d()) {
            return true;
        }
        return false;
    }

    @Override // vh.c
    public final void i(String configurationString) {
        i.g(configurationString, "configurationString");
        this.f34156b.i(configurationString);
    }

    public final boolean i0() {
        boolean d10 = d();
        p pVar = this.f34157c;
        if (!d10) {
            hh.g.b(pVar.f20105d, 0, new a(), 3);
            return false;
        }
        hh.g.b(pVar.f20105d, 0, new C0572b(), 3);
        jg.d F = F();
        pVar.f20103b.getClass();
        w.f29578a.getClass();
        m f02 = this.f34155a.f0(new oh.a(F, w.c(pVar).f573b));
        if (f02 instanceof o) {
            T t3 = ((o) f02).f20101a;
            if (t3 != 0) {
                i(((ih.c) t3).f20052a);
                s(System.currentTimeMillis());
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.model.ConfigApiData");
        } else if (f02 instanceof n) {
            return false;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // vh.c
    public final void j() {
        this.f34156b.j();
    }

    public final c9.d j0() {
        if (h0()) {
            p pVar = this.f34157c;
            hh.g.b(pVar.f20105d, 0, new c(), 3);
            String m10 = di.b.m();
            String m11 = sp.b.m();
            ih.e e0 = e0();
            ih.g Q = Q();
            jg.d F = F();
            StringBuilder d10 = v.g.d(m10, m11);
            d10.append(n());
            String c10 = di.n.c(d10.toString());
            i.f(c10, "getSha1ForString(\n      …CurrentUserId()\n        )");
            JSONObject p10 = p(pVar);
            w.f29578a.getClass();
            return new c9.d(this.f34155a.e(new oh.b(F, c10, new s(p10, new v.c(Q, m10, m11, w.c(pVar).f573b), C(Q, e0, pVar)))), new r(!gv.n.B0(e0.f20078b), !gv.n.B0(e0.f20079c)));
        }
        throw new NetworkRequestDisabledException();
    }

    @Override // vh.c
    public final int k() {
        return this.f34156b.k();
    }

    public final void k0(List<nh.a> list) {
        p pVar = this.f34157c;
        try {
            if (h0()) {
                hh.g.b(pVar.f20105d, 0, new d(), 3);
                this.f34155a.q(new oh.c(F(), list));
                return;
            }
            throw new NetworkRequestDisabledException();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new e());
        }
    }

    @Override // vh.c
    public final void l(List<mh.c> list) {
        this.f34156b.l(list);
    }

    public final void l0(JSONObject batchDataJson, String str) {
        i.g(batchDataJson, "batchDataJson");
        if (h0()) {
            p pVar = this.f34157c;
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new uh.c(this, str), 3);
            jg.d F = F();
            oh.d dVar = new oh.d(batchDataJson, C(Q(), e0(), pVar));
            if (G()) {
                if ((60 * 60 * 1000) + D() > System.currentTimeMillis()) {
                    z10 = true;
                }
            }
            if (this.f34155a.z(new oh.e(F, str, dVar, z10)).f27473a) {
                return;
            }
            throw new NetworkRequestFailedException("Report could not be synced.");
        }
        throw new NetworkRequestDisabledException();
    }

    @Override // vh.c
    public final void m(int i6) {
        this.f34156b.m(i6);
    }

    @Override // vh.c
    public final String n() {
        return this.f34156b.n();
    }

    @Override // vh.c
    public final long o(mh.b bVar) {
        return this.f34156b.o(bVar);
    }

    @Override // vh.c
    public final JSONObject p(p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        return this.f34156b.p(sdkInstance);
    }

    @Override // wh.g
    public final void q(oh.c cVar) {
        this.f34155a.q(cVar);
    }

    @Override // vh.c
    public final void r() {
        this.f34156b.r();
    }

    @Override // vh.c
    public final void s(long j10) {
        this.f34156b.s(j10);
    }

    @Override // vh.c
    public final void t(mh.a aVar) {
        this.f34156b.t(aVar);
    }

    @Override // vh.c
    public final void u() {
        this.f34156b.u();
    }

    @Override // vh.c
    public final int v() {
        return this.f34156b.v();
    }

    @Override // vh.c
    public final List w() {
        return this.f34156b.w();
    }

    @Override // vh.c
    public final int x(mh.b bVar) {
        return this.f34156b.x(bVar);
    }

    @Override // vh.c
    public final void y() {
        this.f34156b.y();
    }

    @Override // wh.g
    public final oh.f z(oh.e eVar) {
        return this.f34155a.z(eVar);
    }
}
