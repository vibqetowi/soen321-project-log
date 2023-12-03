package gt;
/* compiled from: Visibilities.kt */
/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static final js.b f16767a;

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final a f16768c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final b f16769c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class c extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final c f16770c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class d extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final d f16771c = new d();

        public d() {
            super("local", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class e extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final e f16772c = new e();

        public e() {
            super("private", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class f extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final f f16773c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // gt.c1
        public final String b() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class g extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final g f16774c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class h extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final h f16775c = new h();

        public h() {
            super("public", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* loaded from: classes2.dex */
    public static final class i extends c1 {

        /* renamed from: c  reason: collision with root package name */
        public static final i f16776c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        js.b bVar = new js.b();
        bVar.put(f.f16773c, 0);
        bVar.put(e.f16772c, 0);
        bVar.put(b.f16769c, 1);
        bVar.put(g.f16774c, 1);
        bVar.put(h.f16775c, 2);
        bVar.b();
        bVar.F = true;
        f16767a = bVar;
    }
}
