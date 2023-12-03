package vi;

import com.moengage.core.internal.exception.NetworkRequestDisabledException;
import com.moengage.core.internal.exception.NetworkRequestFailedException;
import is.w;
import is.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mi.c0;
import mi.i1;
import org.json.JSONObject;
/* compiled from: InAppRepository.kt */
/* loaded from: classes.dex */
public final class o implements wi.a, xi.k {

    /* renamed from: a  reason: collision with root package name */
    public final wi.a f35208a;

    /* renamed from: b  reason: collision with root package name */
    public final xi.k f35209b;

    /* renamed from: c  reason: collision with root package name */
    public final ih.p f35210c;

    /* renamed from: d  reason: collision with root package name */
    public final String f35211d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f35212e;

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" fetchTestCampaignPayload() : Fetching in-app test campaign payload.", o.this.f35211d);
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" fetchTestCampaignPayload() : ", o.this.f35211d);
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getCampaignsForEvent() : ", o.this.f35211d);
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f35217v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10) {
            super(0);
            this.f35217v = z10;
        }

        @Override // ss.a
        public final String invoke() {
            return o.this.f35211d + " isModuleEnabled() : " + this.f35217v;
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateCache() : Updating cache", o.this.f35211d);
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f35220v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f35220v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return o.this.f35211d + " updateCampaignStateForControlGroup() : Updating campaign state for id: " + this.f35220v;
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" uploadStats() : ", o.this.f35211d);
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" uploadStats() : Not pending batches", o.this.f35211d);
        }
    }

    /* compiled from: InAppRepository.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" uploadStats() : ", o.this.f35211d);
        }
    }

    public o(wi.b bVar, xi.l lVar, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f35208a = bVar;
        this.f35209b = lVar;
        this.f35210c = sdkInstance;
        this.f35211d = "InApp_6.5.0_InAppRepository";
        this.f35212e = new Object();
    }

    @Override // wi.a
    public final void A(List<pi.c> newCampaigns) {
        kotlin.jvm.internal.i.g(newCampaigns, "newCampaigns");
        this.f35208a.A(newCampaigns);
    }

    @Override // wi.a
    public final long B() {
        return this.f35208a.B();
    }

    public final void C(ih.h hVar, boolean z10) {
        ih.p pVar = this.f35210c;
        hh.g.b(pVar.f20105d, 0, new k(this), 3);
        if (F()) {
            ih.m v10 = this.f35209b.v(new oh.a(l(), hVar, z10));
            boolean z11 = v10 instanceof ih.n;
            hh.g gVar = pVar.f20105d;
            if (!z11) {
                if (v10 instanceof ih.o) {
                    T t3 = ((ih.o) v10).f20101a;
                    if (t3 != 0) {
                        ti.c cVar = (ti.c) t3;
                        hh.g.b(gVar, 0, new m(this, cVar), 3);
                        hh.g.b(gVar, 0, new n(this, cVar), 3);
                        c(sp.b.n());
                        A(cVar.f33037a);
                        long j10 = cVar.f33038b;
                        if (j10 > 0) {
                            z(j10);
                        }
                        long j11 = cVar.f33039c;
                        if (j11 >= 0) {
                            y(j11);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.moengage.inapp.internal.model.network.MetaResponse");
                }
                return;
            }
            hh.g.b(gVar, 0, new l(this), 3);
            throw new NetworkRequestFailedException("Meta API failed.");
        }
        throw new NetworkRequestDisabledException();
    }

    public final ih.m D(String campaignId, ih.h hVar) {
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        ih.p pVar = this.f35210c;
        hh.g.b(pVar.f20105d, 0, new a(), 3);
        try {
            if (!F()) {
                return null;
            }
            return this.f35209b.k(new ti.b(l(), campaignId, null, null, null, null, hVar));
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b());
            return null;
        }
    }

    public final List<si.e> E(String eventName) {
        w wVar = w.f20676u;
        kotlin.jvm.internal.i.g(eventName, "eventName");
        try {
            ArrayList k10 = df.b.k(this.f35208a.w());
            if (k10.isEmpty()) {
                return wVar;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = k10.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                si.g gVar = ((si.e) next).f31592d.f31578h;
                kotlin.jvm.internal.i.d(gVar);
                if (kotlin.jvm.internal.i.b(eventName, gVar.f31596a.f31597a)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            this.f35210c.f20105d.a(1, e10, new c());
            return wVar;
        }
    }

    public final boolean F() {
        boolean z10;
        boolean z11 = a().f20107a;
        ih.p pVar = this.f35210c;
        if (z11) {
            th.a aVar = pVar.f20104c;
            if (aVar.f33010a && aVar.f33011b.f25749u) {
                z10 = true;
                hh.g.b(pVar.f20105d, 0, new d(z10), 3);
                return z10;
            }
        }
        z10 = false;
        hh.g.b(pVar.f20105d, 0, new d(z10), 3);
        return z10;
    }

    public final void G(ti.a aVar, ti.b bVar) {
        aj.a aVar2 = bVar.f33034k;
        boolean z10 = aVar.f33029c;
        ih.p pVar = this.f35210c;
        if (z10 && aVar2 != null) {
            i1.f25206a.getClass();
            c0 c10 = i1.c(pVar);
            kotlin.jvm.internal.i.f(aVar2, "request.campaignContext");
            c10.b(aVar2, sp.b.m(), "DLV_MAND_PARM_MIS");
            return;
        }
        int i6 = aVar.f33027a;
        if (i6 == 410) {
            String str = aVar.f33028b;
            String str2 = bVar.f33030g;
            kotlin.jvm.internal.i.f(str2, "request.campaignId");
            try {
                hh.g.b(pVar.f20105d, 0, new r(this, str2), 3);
                if (!gv.n.B0(str) && kotlin.jvm.internal.i.b("E001", new JSONObject(str).optString("code", ""))) {
                    I(str2);
                }
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new s(this));
            }
        }
        if (i6 != 409 && i6 != 200 && aVar2 != null) {
            i1.f25206a.getClass();
            c0 c11 = i1.c(pVar);
            kotlin.jvm.internal.i.f(aVar2, "request.campaignContext");
            c11.b(aVar2, sp.b.m(), "DLV_API_FLR");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H() {
        ih.p pVar = this.f35210c;
        hh.g.b(pVar.f20105d, 0, new e(), 3);
        i1.f25206a.getClass();
        vi.a a10 = i1.a(pVar);
        a10.f35169a = df.b.k(h());
        y yVar = y.f20678u;
        try {
            ArrayList k10 = df.b.k(w());
            if (!k10.isEmpty()) {
                HashSet hashSet = new HashSet(k10.size());
                Iterator it = k10.iterator();
                while (it.hasNext()) {
                    si.g gVar = ((si.e) it.next()).f31592d.f31578h;
                    kotlin.jvm.internal.i.d(gVar);
                    hashSet.add(gVar.f31596a.f31597a);
                }
                yVar = hashSet;
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new p(this));
        }
        a10.f35170b = yVar;
        df.b.k(p());
        a10.getClass();
    }

    public final void I(String str) {
        hh.g.b(this.f35210c.f20105d, 0, new f(str), 3);
        pi.c g5 = g(str);
        if (g5 == null) {
            return;
        }
        this.f35208a.t(new f8.g(g5.f.f14907b + 1, sp.b.n(), g5.f.f14909d), str);
        H();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #1 {Exception -> 0x0079, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x0020, B:9:0x0022, B:19:0x0041, B:31:0x0073, B:10:0x0023, B:12:0x0029, B:18:0x0035, B:21:0x0043, B:22:0x0047, B:24:0x004d, B:30:0x0071, B:27:0x0068), top: B:40:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z10;
        boolean z11;
        try {
            hh.g.b(this.f35210c.f20105d, 0, new g(), 3);
            if (F() && this.f35210c.f20104c.f33016h.f20083a) {
                synchronized (this.f35212e) {
                    do {
                        List m10 = m();
                        if (m10 != null && !m10.isEmpty()) {
                            z10 = false;
                            if (!z10) {
                                hh.g.b(this.f35210c.f20105d, 0, new h(), 3);
                                return;
                            }
                            Iterator it = m10.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    pi.p pVar = (pi.p) it.next();
                                    if (this.f35209b.e(new oh.c(l(), pVar)) instanceof ih.n) {
                                        z11 = false;
                                        continue;
                                        break;
                                    }
                                    this.f35208a.r(pVar);
                                } else {
                                    z11 = true;
                                    continue;
                                    break;
                                }
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    } while (z11);
                    hs.k kVar = hs.k.f19476a;
                }
            }
        } catch (Exception e10) {
            this.f35210c.f20105d.a(1, e10, new i());
        }
    }

    @Override // wi.a
    public final ih.q a() {
        return this.f35208a.a();
    }

    @Override // wi.a
    public final void b() {
        this.f35208a.b();
    }

    @Override // wi.a
    public final void c(long j10) {
        this.f35208a.c(j10);
    }

    @Override // xi.k
    public final ih.m d(ti.b bVar) {
        return this.f35209b.d(bVar);
    }

    @Override // xi.k
    public final ih.m e(oh.c cVar) {
        return this.f35209b.e(cVar);
    }

    @Override // wi.a
    public final List<pi.c> f() {
        return this.f35208a.f();
    }

    @Override // wi.a
    public final pi.c g(String campaignId) {
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        return this.f35208a.g(campaignId);
    }

    @Override // wi.a
    public final List<pi.c> h() {
        return this.f35208a.h();
    }

    @Override // wi.a
    public final int i() {
        return this.f35208a.i();
    }

    @Override // wi.a
    public final long j(pi.p pVar) {
        return this.f35208a.j(pVar);
    }

    @Override // xi.k
    public final ih.m k(ti.b bVar) {
        return this.f35209b.k(bVar);
    }

    @Override // wi.a
    public final jg.d l() {
        return this.f35208a.l();
    }

    @Override // wi.a
    public final List m() {
        return this.f35208a.m();
    }

    @Override // wi.a
    public final void n(long j10) {
        this.f35208a.n(j10);
    }

    @Override // wi.a
    public final void o(long j10) {
        this.f35208a.o(j10);
    }

    @Override // wi.a
    public final List<pi.c> p() {
        return this.f35208a.p();
    }

    @Override // wi.a
    public final long q() {
        return this.f35208a.q();
    }

    @Override // wi.a
    public final int r(pi.p pVar) {
        return this.f35208a.r(pVar);
    }

    @Override // wi.a
    public final long s() {
        return this.f35208a.s();
    }

    @Override // wi.a
    public final int t(f8.g gVar, String str) {
        return this.f35208a.t(gVar, str);
    }

    @Override // wi.a
    public final void u() {
        this.f35208a.u();
    }

    @Override // xi.k
    public final ih.m v(oh.a aVar) {
        return this.f35209b.v(aVar);
    }

    @Override // wi.a
    public final List<pi.c> w() {
        return this.f35208a.w();
    }

    @Override // wi.a
    public final pi.j x() {
        return this.f35208a.x();
    }

    @Override // wi.a
    public final void y(long j10) {
        this.f35208a.y(j10);
    }

    @Override // wi.a
    public final void z(long j10) {
        this.f35208a.z(j10);
    }
}
