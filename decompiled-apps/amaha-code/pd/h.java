package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes.dex */
public final class h extends b0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f28258a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28259b;

    /* renamed from: c  reason: collision with root package name */
    public final long f28260c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f28261d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28262e;
    public final b0.e.a f;

    /* renamed from: g  reason: collision with root package name */
    public final b0.e.f f28263g;

    /* renamed from: h  reason: collision with root package name */
    public final b0.e.AbstractC0481e f28264h;

    /* renamed from: i  reason: collision with root package name */
    public final b0.e.c f28265i;

    /* renamed from: j  reason: collision with root package name */
    public final c0<b0.e.d> f28266j;

    /* renamed from: k  reason: collision with root package name */
    public final int f28267k;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f28268a;

        /* renamed from: b  reason: collision with root package name */
        public String f28269b;

        /* renamed from: c  reason: collision with root package name */
        public Long f28270c;

        /* renamed from: d  reason: collision with root package name */
        public Long f28271d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f28272e;
        public b0.e.a f;

        /* renamed from: g  reason: collision with root package name */
        public b0.e.f f28273g;

        /* renamed from: h  reason: collision with root package name */
        public b0.e.AbstractC0481e f28274h;

        /* renamed from: i  reason: collision with root package name */
        public b0.e.c f28275i;

        /* renamed from: j  reason: collision with root package name */
        public c0<b0.e.d> f28276j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f28277k;

        public a() {
        }

        public final h a() {
            String str;
            if (this.f28268a == null) {
                str = " generator";
            } else {
                str = "";
            }
            if (this.f28269b == null) {
                str = str.concat(" identifier");
            }
            if (this.f28270c == null) {
                str = pl.a.f(str, " startedAt");
            }
            if (this.f28272e == null) {
                str = pl.a.f(str, " crashed");
            }
            if (this.f == null) {
                str = pl.a.f(str, " app");
            }
            if (this.f28277k == null) {
                str = pl.a.f(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new h(this.f28268a, this.f28269b, this.f28270c.longValue(), this.f28271d, this.f28272e.booleanValue(), this.f, this.f28273g, this.f28274h, this.f28275i, this.f28276j, this.f28277k.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public a(b0.e eVar) {
            this.f28268a = eVar.e();
            this.f28269b = eVar.g();
            this.f28270c = Long.valueOf(eVar.i());
            this.f28271d = eVar.c();
            this.f28272e = Boolean.valueOf(eVar.k());
            this.f = eVar.a();
            this.f28273g = eVar.j();
            this.f28274h = eVar.h();
            this.f28275i = eVar.b();
            this.f28276j = eVar.d();
            this.f28277k = Integer.valueOf(eVar.f());
        }
    }

    public h() {
        throw null;
    }

    public h(String str, String str2, long j10, Long l2, boolean z10, b0.e.a aVar, b0.e.f fVar, b0.e.AbstractC0481e abstractC0481e, b0.e.c cVar, c0 c0Var, int i6) {
        this.f28258a = str;
        this.f28259b = str2;
        this.f28260c = j10;
        this.f28261d = l2;
        this.f28262e = z10;
        this.f = aVar;
        this.f28263g = fVar;
        this.f28264h = abstractC0481e;
        this.f28265i = cVar;
        this.f28266j = c0Var;
        this.f28267k = i6;
    }

    @Override // pd.b0.e
    public final b0.e.a a() {
        return this.f;
    }

    @Override // pd.b0.e
    public final b0.e.c b() {
        return this.f28265i;
    }

    @Override // pd.b0.e
    public final Long c() {
        return this.f28261d;
    }

    @Override // pd.b0.e
    public final c0<b0.e.d> d() {
        return this.f28266j;
    }

    @Override // pd.b0.e
    public final String e() {
        return this.f28258a;
    }

    public final boolean equals(Object obj) {
        Long l2;
        b0.e.f fVar;
        b0.e.AbstractC0481e abstractC0481e;
        b0.e.c cVar;
        c0<b0.e.d> c0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e)) {
            return false;
        }
        b0.e eVar = (b0.e) obj;
        if (this.f28258a.equals(eVar.e()) && this.f28259b.equals(eVar.g()) && this.f28260c == eVar.i() && ((l2 = this.f28261d) != null ? l2.equals(eVar.c()) : eVar.c() == null) && this.f28262e == eVar.k() && this.f.equals(eVar.a()) && ((fVar = this.f28263g) != null ? fVar.equals(eVar.j()) : eVar.j() == null) && ((abstractC0481e = this.f28264h) != null ? abstractC0481e.equals(eVar.h()) : eVar.h() == null) && ((cVar = this.f28265i) != null ? cVar.equals(eVar.b()) : eVar.b() == null) && ((c0Var = this.f28266j) != null ? c0Var.equals(eVar.d()) : eVar.d() == null) && this.f28267k == eVar.f()) {
            return true;
        }
        return false;
    }

    @Override // pd.b0.e
    public final int f() {
        return this.f28267k;
    }

    @Override // pd.b0.e
    public final String g() {
        return this.f28259b;
    }

    @Override // pd.b0.e
    public final b0.e.AbstractC0481e h() {
        return this.f28264h;
    }

    public final int hashCode() {
        int hashCode;
        int i6;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f28260c;
        int hashCode5 = (((((this.f28258a.hashCode() ^ 1000003) * 1000003) ^ this.f28259b.hashCode()) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i10 = 0;
        Long l2 = this.f28261d;
        if (l2 == null) {
            hashCode = 0;
        } else {
            hashCode = l2.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        if (this.f28262e) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int hashCode6 = (((i11 ^ i6) * 1000003) ^ this.f.hashCode()) * 1000003;
        b0.e.f fVar = this.f28263g;
        if (fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fVar.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode2) * 1000003;
        b0.e.AbstractC0481e abstractC0481e = this.f28264h;
        if (abstractC0481e == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = abstractC0481e.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        b0.e.c cVar = this.f28265i;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c0<b0.e.d> c0Var = this.f28266j;
        if (c0Var != null) {
            i10 = c0Var.hashCode();
        }
        return ((i14 ^ i10) * 1000003) ^ this.f28267k;
    }

    @Override // pd.b0.e
    public final long i() {
        return this.f28260c;
    }

    @Override // pd.b0.e
    public final b0.e.f j() {
        return this.f28263g;
    }

    @Override // pd.b0.e
    public final boolean k() {
        return this.f28262e;
    }

    @Override // pd.b0.e
    public final a l() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f28258a);
        sb2.append(", identifier=");
        sb2.append(this.f28259b);
        sb2.append(", startedAt=");
        sb2.append(this.f28260c);
        sb2.append(", endedAt=");
        sb2.append(this.f28261d);
        sb2.append(", crashed=");
        sb2.append(this.f28262e);
        sb2.append(", app=");
        sb2.append(this.f);
        sb2.append(", user=");
        sb2.append(this.f28263g);
        sb2.append(", os=");
        sb2.append(this.f28264h);
        sb2.append(", device=");
        sb2.append(this.f28265i);
        sb2.append(", events=");
        sb2.append(this.f28266j);
        sb2.append(", generatorType=");
        return pl.a.g(sb2, this.f28267k, "}");
    }
}
