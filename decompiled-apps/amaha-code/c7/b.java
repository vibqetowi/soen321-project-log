package c7;
/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4992a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class a implements ae.c<c7.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4993a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f4994b = ae.b.a("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f4995c = ae.b.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f4996d = ae.b.a("hardware");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f4997e = ae.b.a("device");
        public static final ae.b f = ae.b.a("product");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f4998g = ae.b.a("osBuild");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f4999h = ae.b.a("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        public static final ae.b f5000i = ae.b.a("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        public static final ae.b f5001j = ae.b.a("locale");

        /* renamed from: k  reason: collision with root package name */
        public static final ae.b f5002k = ae.b.a("country");

        /* renamed from: l  reason: collision with root package name */
        public static final ae.b f5003l = ae.b.a("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        public static final ae.b f5004m = ae.b.a("applicationBuild");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            c7.a aVar = (c7.a) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f4994b, aVar.l());
            dVar2.b(f4995c, aVar.i());
            dVar2.b(f4996d, aVar.e());
            dVar2.b(f4997e, aVar.c());
            dVar2.b(f, aVar.k());
            dVar2.b(f4998g, aVar.j());
            dVar2.b(f4999h, aVar.g());
            dVar2.b(f5000i, aVar.d());
            dVar2.b(f5001j, aVar.f());
            dVar2.b(f5002k, aVar.b());
            dVar2.b(f5003l, aVar.h());
            dVar2.b(f5004m, aVar.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: c7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0105b implements ae.c<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0105b f5005a = new C0105b();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f5006b = ae.b.a("logRequest");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            dVar.b(f5006b, ((j) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class c implements ae.c<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f5007a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f5008b = ae.b.a("clientType");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f5009c = ae.b.a("androidClientInfo");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            k kVar = (k) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f5008b, kVar.b());
            dVar2.b(f5009c, kVar.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class d implements ae.c<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f5010a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f5011b = ae.b.a("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f5012c = ae.b.a("eventCode");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f5013d = ae.b.a("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f5014e = ae.b.a("sourceExtension");
        public static final ae.b f = ae.b.a("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f5015g = ae.b.a("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f5016h = ae.b.a("networkConnectionInfo");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            l lVar = (l) obj;
            ae.d dVar2 = dVar;
            dVar2.f(f5011b, lVar.b());
            dVar2.b(f5012c, lVar.a());
            dVar2.f(f5013d, lVar.c());
            dVar2.b(f5014e, lVar.e());
            dVar2.b(f, lVar.f());
            dVar2.f(f5015g, lVar.g());
            dVar2.b(f5016h, lVar.d());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class e implements ae.c<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f5017a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f5018b = ae.b.a("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f5019c = ae.b.a("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        public static final ae.b f5020d = ae.b.a("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final ae.b f5021e = ae.b.a("logSource");
        public static final ae.b f = ae.b.a("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        public static final ae.b f5022g = ae.b.a("logEvent");

        /* renamed from: h  reason: collision with root package name */
        public static final ae.b f5023h = ae.b.a("qosTier");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            m mVar = (m) obj;
            ae.d dVar2 = dVar;
            dVar2.f(f5018b, mVar.f());
            dVar2.f(f5019c, mVar.g());
            dVar2.b(f5020d, mVar.a());
            dVar2.b(f5021e, mVar.c());
            dVar2.b(f, mVar.d());
            dVar2.b(f5022g, mVar.b());
            dVar2.b(f5023h, mVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class f implements ae.c<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f5024a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final ae.b f5025b = ae.b.a("networkType");

        /* renamed from: c  reason: collision with root package name */
        public static final ae.b f5026c = ae.b.a("mobileSubtype");

        @Override // ae.a
        public final void a(Object obj, ae.d dVar) {
            o oVar = (o) obj;
            ae.d dVar2 = dVar;
            dVar2.b(f5025b, oVar.b());
            dVar2.b(f5026c, oVar.a());
        }
    }

    public final void a(be.a<?> aVar) {
        C0105b c0105b = C0105b.f5005a;
        ce.d dVar = (ce.d) aVar;
        dVar.a(j.class, c0105b);
        dVar.a(c7.d.class, c0105b);
        e eVar = e.f5017a;
        dVar.a(m.class, eVar);
        dVar.a(g.class, eVar);
        c cVar = c.f5007a;
        dVar.a(k.class, cVar);
        dVar.a(c7.e.class, cVar);
        a aVar2 = a.f4993a;
        dVar.a(c7.a.class, aVar2);
        dVar.a(c7.c.class, aVar2);
        d dVar2 = d.f5010a;
        dVar.a(l.class, dVar2);
        dVar.a(c7.f.class, dVar2);
        f fVar = f.f5024a;
        dVar.a(o.class, fVar);
        dVar.a(i.class, fVar);
    }
}
