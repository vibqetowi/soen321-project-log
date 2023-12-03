package pd;

import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import pd.b0;
/* compiled from: AutoCrashlyticsReportEncoder.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28101a = new a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: pd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0470a implements ae.c<b0.a.AbstractC0471a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0470a f28102a = new C0470a();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28103b = ae.b.a("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28104c = ae.b.a("libraryName");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28105d = ae.b.a("buildId");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.a.AbstractC0471a abstractC0471a = (b0.a.AbstractC0471a) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28103b, abstractC0471a.a());
            dVar2.b(f28104c, abstractC0471a.c());
            dVar2.b(f28105d, abstractC0471a.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class b implements ae.c<b0.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28106a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28107b = ae.b.a("pid");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28108c = ae.b.a("processName");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28109d = ae.b.a("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28110e = ae.b.a("importance");
        public static final ae.b f = ae.b.a("pss");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f28111g = ae.b.a("rss");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f28112h = ae.b.a(ServerValues.NAME_OP_TIMESTAMP);

        /* renamed from: i  reason: collision with root package name */
        public static final ae.b f28113i = ae.b.a("traceFile");

        /* renamed from: j  reason: collision with root package name */
        public static final ae.b f28114j = ae.b.a("buildIdMappingForArch");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.a aVar = (b0.a) obj;
            ae.d dVar2 = dVar;
            dVar2.e(f28107b, aVar.c());
            dVar2.b(f28108c, aVar.d());
            dVar2.e(f28109d, aVar.f());
            dVar2.e(f28110e, aVar.b());
            dVar2.f(f, aVar.e());
            dVar2.f(f28111g, aVar.g());
            dVar2.f(f28112h, aVar.h());
            dVar2.b(f28113i, aVar.i());
            dVar2.b(f28114j, aVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class c implements ae.c<b0.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f28115a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28116b = ae.b.a("key");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28117c = ae.b.a("value");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.c cVar = (b0.c) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28116b, cVar.a());
            dVar2.b(f28117c, cVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class d implements ae.c<b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f28118a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28119b = ae.b.a("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28120c = ae.b.a("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28121d = ae.b.a("platform");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28122e = ae.b.a("installationUuid");
        public static final ae.b f = ae.b.a("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f28123g = ae.b.a("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f28124h = ae.b.a("session");

        /* renamed from: i  reason: collision with root package name */
        public static final ae.b f28125i = ae.b.a("ndkPayload");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0 b0Var = (b0) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28119b, b0Var.g());
            dVar2.b(f28120c, b0Var.c());
            dVar2.e(f28121d, b0Var.f());
            dVar2.b(f28122e, b0Var.d());
            dVar2.b(f, b0Var.a());
            dVar2.b(f28123g, b0Var.b());
            dVar2.b(f28124h, b0Var.h());
            dVar2.b(f28125i, b0Var.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class e implements ae.c<b0.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f28126a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28127b = ae.b.a("files");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28128c = ae.b.a("orgId");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.d dVar2 = (b0.d) obj;
            ae.d dVar3 = dVar;
            dVar3.b(f28127b, dVar2.a());
            dVar3.b(f28128c, dVar2.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class f implements ae.c<b0.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f28129a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28130b = ae.b.a("filename");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28131c = ae.b.a("contents");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.d.a aVar = (b0.d.a) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28130b, aVar.b());
            dVar2.b(f28131c, aVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class g implements ae.c<b0.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f28132a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28133b = ae.b.a("identifier");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28134c = ae.b.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28135d = ae.b.a("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28136e = ae.b.a("organization");
        public static final ae.b f = ae.b.a("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f28137g = ae.b.a("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f28138h = ae.b.a("developmentPlatformVersion");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.a aVar = (b0.e.a) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28133b, aVar.d());
            dVar2.b(f28134c, aVar.g());
            dVar2.b(f28135d, aVar.c());
            dVar2.b(f28136e, aVar.f());
            dVar2.b(f, aVar.e());
            dVar2.b(f28137g, aVar.a());
            dVar2.b(f28138h, aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class h implements ae.c<b0.e.a.AbstractC0472a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f28139a = new h();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28140b = ae.b.a("clsId");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            ((b0.e.a.AbstractC0472a) obj).a();
            dVar.b(f28140b, null);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class i implements ae.c<b0.e.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f28141a = new i();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28142b = ae.b.a("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28143c = ae.b.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28144d = ae.b.a("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28145e = ae.b.a("ram");
        public static final ae.b f = ae.b.a("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f28146g = ae.b.a("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f28147h = ae.b.a("state");

        /* renamed from: i  reason: collision with root package name */
        public static final ae.b f28148i = ae.b.a("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        public static final ae.b f28149j = ae.b.a("modelClass");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.c cVar = (b0.e.c) obj;
            ae.d dVar2 = dVar;
            dVar2.e(f28142b, cVar.a());
            dVar2.b(f28143c, cVar.e());
            dVar2.e(f28144d, cVar.b());
            dVar2.f(f28145e, cVar.g());
            dVar2.f(f, cVar.c());
            dVar2.a(f28146g, cVar.i());
            dVar2.e(f28147h, cVar.h());
            dVar2.b(f28148i, cVar.d());
            dVar2.b(f28149j, cVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class j implements ae.c<b0.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f28150a = new j();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28151b = ae.b.a("generator");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28152c = ae.b.a("identifier");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28153d = ae.b.a("startedAt");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28154e = ae.b.a("endedAt");
        public static final ae.b f = ae.b.a("crashed");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f28155g = ae.b.a("app");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f28156h = ae.b.a("user");

        /* renamed from: i  reason: collision with root package name */
        public static final ae.b f28157i = ae.b.a("os");

        /* renamed from: j  reason: collision with root package name */
        public static final ae.b f28158j = ae.b.a("device");

        /* renamed from: k  reason: collision with root package name */
        public static final ae.b f28159k = ae.b.a("events");

        /* renamed from: l  reason: collision with root package name */
        public static final ae.b f28160l = ae.b.a("generatorType");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e eVar = (b0.e) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28151b, eVar.e());
            dVar2.b(f28152c, eVar.g().getBytes(b0.f28231a));
            dVar2.f(f28153d, eVar.i());
            dVar2.b(f28154e, eVar.c());
            dVar2.a(f, eVar.k());
            dVar2.b(f28155g, eVar.a());
            dVar2.b(f28156h, eVar.j());
            dVar2.b(f28157i, eVar.h());
            dVar2.b(f28158j, eVar.b());
            dVar2.b(f28159k, eVar.d());
            dVar2.e(f28160l, eVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class k implements ae.c<b0.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f28161a = new k();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28162b = ae.b.a("execution");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28163c = ae.b.a("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28164d = ae.b.a("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28165e = ae.b.a("background");
        public static final ae.b f = ae.b.a("uiOrientation");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d.a aVar = (b0.e.d.a) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28162b, aVar.c());
            dVar2.b(f28163c, aVar.b());
            dVar2.b(f28164d, aVar.d());
            dVar2.b(f28165e, aVar.a());
            dVar2.e(f, aVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class l implements ae.c<b0.e.d.a.b.AbstractC0474a> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f28166a = new l();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28167b = ae.b.a("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28168c = ae.b.a("size");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28169d = ae.b.a(SessionManager.KEY_NAME);

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28170e = ae.b.a(SessionManager.KEY_UUID);

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            byte[] bArr;
            b0.e.d.a.b.AbstractC0474a abstractC0474a = (b0.e.d.a.b.AbstractC0474a) obj;
            ae.d dVar2 = dVar;
            dVar2.f(f28167b, abstractC0474a.a());
            dVar2.f(f28168c, abstractC0474a.c());
            dVar2.b(f28169d, abstractC0474a.b());
            String d10 = abstractC0474a.d();
            if (d10 != null) {
                bArr = d10.getBytes(b0.f28231a);
            } else {
                bArr = null;
            }
            dVar2.b(f28170e, bArr);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class m implements ae.c<b0.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f28171a = new m();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28172b = ae.b.a("threads");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28173c = ae.b.a("exception");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28174d = ae.b.a("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28175e = ae.b.a("signal");
        public static final ae.b f = ae.b.a("binaries");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28172b, bVar.e());
            dVar2.b(f28173c, bVar.c());
            dVar2.b(f28174d, bVar.a());
            dVar2.b(f28175e, bVar.d());
            dVar2.b(f, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class n implements ae.c<b0.e.d.a.b.AbstractC0476b> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f28176a = new n();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28177b = ae.b.a("type");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28178c = ae.b.a("reason");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28179d = ae.b.a("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28180e = ae.b.a("causedBy");
        public static final ae.b f = ae.b.a("overflowCount");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d.a.b.AbstractC0476b abstractC0476b = (b0.e.d.a.b.AbstractC0476b) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28177b, abstractC0476b.e());
            dVar2.b(f28178c, abstractC0476b.d());
            dVar2.b(f28179d, abstractC0476b.b());
            dVar2.b(f28180e, abstractC0476b.a());
            dVar2.e(f, abstractC0476b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class o implements ae.c<b0.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f28181a = new o();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28182b = ae.b.a(SessionManager.KEY_NAME);

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28183c = ae.b.a("code");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28184d = ae.b.a("address");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d.a.b.c cVar = (b0.e.d.a.b.c) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28182b, cVar.c());
            dVar2.b(f28183c, cVar.b());
            dVar2.f(f28184d, cVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class p implements ae.c<b0.e.d.a.b.AbstractC0477d> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f28185a = new p();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28186b = ae.b.a(SessionManager.KEY_NAME);

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28187c = ae.b.a("importance");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28188d = ae.b.a("frames");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d.a.b.AbstractC0477d abstractC0477d = (b0.e.d.a.b.AbstractC0477d) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28186b, abstractC0477d.c());
            dVar2.e(f28187c, abstractC0477d.b());
            dVar2.b(f28188d, abstractC0477d.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class q implements ae.c<b0.e.d.a.b.AbstractC0477d.AbstractC0478a> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f28189a = new q();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28190b = ae.b.a("pc");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28191c = ae.b.a("symbol");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28192d = ae.b.a("file");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28193e = ae.b.a("offset");
        public static final ae.b f = ae.b.a("importance");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d.a.b.AbstractC0477d.AbstractC0478a abstractC0478a = (b0.e.d.a.b.AbstractC0477d.AbstractC0478a) obj;
            ae.d dVar2 = dVar;
            dVar2.f(f28190b, abstractC0478a.d());
            dVar2.b(f28191c, abstractC0478a.e());
            dVar2.b(f28192d, abstractC0478a.a());
            dVar2.f(f28193e, abstractC0478a.c());
            dVar2.e(f, abstractC0478a.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class r implements ae.c<b0.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f28194a = new r();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28195b = ae.b.a("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28196c = ae.b.a("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28197d = ae.b.a("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28198e = ae.b.a("orientation");
        public static final ae.b f = ae.b.a("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f28199g = ae.b.a("diskUsed");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d.c cVar = (b0.e.d.c) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f28195b, cVar.a());
            dVar2.e(f28196c, cVar.b());
            dVar2.a(f28197d, cVar.f());
            dVar2.e(f28198e, cVar.d());
            dVar2.f(f, cVar.e());
            dVar2.f(f28199g, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class s implements ae.c<b0.e.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f28200a = new s();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28201b = ae.b.a(ServerValues.NAME_OP_TIMESTAMP);

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28202c = ae.b.a("type");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28203d = ae.b.a("app");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28204e = ae.b.a("device");
        public static final ae.b f = ae.b.a("log");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.d dVar2 = (b0.e.d) obj;
            ae.d dVar3 = dVar;
            dVar3.f(f28201b, dVar2.d());
            dVar3.b(f28202c, dVar2.e());
            dVar3.b(f28203d, dVar2.a());
            dVar3.b(f28204e, dVar2.b());
            dVar3.b(f, dVar2.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class t implements ae.c<b0.e.d.AbstractC0480d> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f28205a = new t();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28206b = ae.b.a("content");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            dVar.b(f28206b, ((b0.e.d.AbstractC0480d) obj).a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class u implements ae.c<b0.e.AbstractC0481e> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f28207a = new u();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28208b = ae.b.a("platform");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f28209c = ae.b.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f28210d = ae.b.a("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f28211e = ae.b.a("jailbroken");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            b0.e.AbstractC0481e abstractC0481e = (b0.e.AbstractC0481e) obj;
            ae.d dVar2 = dVar;
            dVar2.e(f28208b, abstractC0481e.b());
            dVar2.b(f28209c, abstractC0481e.c());
            dVar2.b(f28210d, abstractC0481e.a());
            dVar2.a(f28211e, abstractC0481e.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes.dex */
    public static final class v implements ae.c<b0.e.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f28212a = new v();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f28213b = ae.b.a("identifier");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            dVar.b(f28213b, ((b0.e.f) obj).a());
        }
    }

    public final void a(be.a<?> aVar) {
        d dVar = d.f28118a;
        ce.d dVar2 = (ce.d) aVar;
        dVar2.a(b0.class, dVar);
        dVar2.a(pd.b.class, dVar);
        j jVar = j.f28150a;
        dVar2.a(b0.e.class, jVar);
        dVar2.a(pd.h.class, jVar);
        g gVar = g.f28132a;
        dVar2.a(b0.e.a.class, gVar);
        dVar2.a(pd.i.class, gVar);
        h hVar = h.f28139a;
        dVar2.a(b0.e.a.AbstractC0472a.class, hVar);
        dVar2.a(pd.j.class, hVar);
        v vVar = v.f28212a;
        dVar2.a(b0.e.f.class, vVar);
        dVar2.a(w.class, vVar);
        u uVar = u.f28207a;
        dVar2.a(b0.e.AbstractC0481e.class, uVar);
        dVar2.a(pd.v.class, uVar);
        i iVar = i.f28141a;
        dVar2.a(b0.e.c.class, iVar);
        dVar2.a(pd.k.class, iVar);
        s sVar = s.f28200a;
        dVar2.a(b0.e.d.class, sVar);
        dVar2.a(pd.l.class, sVar);
        k kVar = k.f28161a;
        dVar2.a(b0.e.d.a.class, kVar);
        dVar2.a(pd.m.class, kVar);
        m mVar = m.f28171a;
        dVar2.a(b0.e.d.a.b.class, mVar);
        dVar2.a(pd.n.class, mVar);
        p pVar = p.f28185a;
        dVar2.a(b0.e.d.a.b.AbstractC0477d.class, pVar);
        dVar2.a(pd.r.class, pVar);
        q qVar = q.f28189a;
        dVar2.a(b0.e.d.a.b.AbstractC0477d.AbstractC0478a.class, qVar);
        dVar2.a(pd.s.class, qVar);
        n nVar = n.f28176a;
        dVar2.a(b0.e.d.a.b.AbstractC0476b.class, nVar);
        dVar2.a(pd.p.class, nVar);
        b bVar = b.f28106a;
        dVar2.a(b0.a.class, bVar);
        dVar2.a(pd.c.class, bVar);
        C0470a c0470a = C0470a.f28102a;
        dVar2.a(b0.a.AbstractC0471a.class, c0470a);
        dVar2.a(pd.d.class, c0470a);
        o oVar = o.f28181a;
        dVar2.a(b0.e.d.a.b.c.class, oVar);
        dVar2.a(pd.q.class, oVar);
        l lVar = l.f28166a;
        dVar2.a(b0.e.d.a.b.AbstractC0474a.class, lVar);
        dVar2.a(pd.o.class, lVar);
        c cVar = c.f28115a;
        dVar2.a(b0.c.class, cVar);
        dVar2.a(pd.e.class, cVar);
        r rVar = r.f28194a;
        dVar2.a(b0.e.d.c.class, rVar);
        dVar2.a(pd.t.class, rVar);
        t tVar = t.f28205a;
        dVar2.a(b0.e.d.AbstractC0480d.class, tVar);
        dVar2.a(pd.u.class, tVar);
        e eVar = e.f28126a;
        dVar2.a(b0.d.class, eVar);
        dVar2.a(pd.f.class, eVar);
        f fVar = f.f28129a;
        dVar2.a(b0.d.a.class, fVar);
        dVar2.a(pd.g.class, fVar);
    }
}
