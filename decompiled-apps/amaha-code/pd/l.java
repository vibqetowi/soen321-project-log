package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes.dex */
public final class l extends b0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f28300a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28301b;

    /* renamed from: c  reason: collision with root package name */
    public final b0.e.d.a f28302c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.c f28303d;

    /* renamed from: e  reason: collision with root package name */
    public final b0.e.d.AbstractC0480d f28304e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f28305a;

        /* renamed from: b  reason: collision with root package name */
        public String f28306b;

        /* renamed from: c  reason: collision with root package name */
        public b0.e.d.a f28307c;

        /* renamed from: d  reason: collision with root package name */
        public b0.e.d.c f28308d;

        /* renamed from: e  reason: collision with root package name */
        public b0.e.d.AbstractC0480d f28309e;

        public a() {
        }

        public final l a() {
            String str;
            if (this.f28305a == null) {
                str = " timestamp";
            } else {
                str = "";
            }
            if (this.f28306b == null) {
                str = str.concat(" type");
            }
            if (this.f28307c == null) {
                str = pl.a.f(str, " app");
            }
            if (this.f28308d == null) {
                str = pl.a.f(str, " device");
            }
            if (str.isEmpty()) {
                return new l(this.f28305a.longValue(), this.f28306b, this.f28307c, this.f28308d, this.f28309e);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public a(b0.e.d dVar) {
            this.f28305a = Long.valueOf(dVar.d());
            this.f28306b = dVar.e();
            this.f28307c = dVar.a();
            this.f28308d = dVar.b();
            this.f28309e = dVar.c();
        }
    }

    public l(long j10, String str, b0.e.d.a aVar, b0.e.d.c cVar, b0.e.d.AbstractC0480d abstractC0480d) {
        this.f28300a = j10;
        this.f28301b = str;
        this.f28302c = aVar;
        this.f28303d = cVar;
        this.f28304e = abstractC0480d;
    }

    @Override // pd.b0.e.d
    public final b0.e.d.a a() {
        return this.f28302c;
    }

    @Override // pd.b0.e.d
    public final b0.e.d.c b() {
        return this.f28303d;
    }

    @Override // pd.b0.e.d
    public final b0.e.d.AbstractC0480d c() {
        return this.f28304e;
    }

    @Override // pd.b0.e.d
    public final long d() {
        return this.f28300a;
    }

    @Override // pd.b0.e.d
    public final String e() {
        return this.f28301b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d)) {
            return false;
        }
        b0.e.d dVar = (b0.e.d) obj;
        if (this.f28300a == dVar.d() && this.f28301b.equals(dVar.e()) && this.f28302c.equals(dVar.a()) && this.f28303d.equals(dVar.b())) {
            b0.e.d.AbstractC0480d abstractC0480d = this.f28304e;
            if (abstractC0480d == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (abstractC0480d.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f28300a;
        int hashCode2 = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f28301b.hashCode()) * 1000003) ^ this.f28302c.hashCode()) * 1000003) ^ this.f28303d.hashCode()) * 1000003;
        b0.e.d.AbstractC0480d abstractC0480d = this.f28304e;
        if (abstractC0480d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0480d.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f28300a + ", type=" + this.f28301b + ", app=" + this.f28302c + ", device=" + this.f28303d + ", log=" + this.f28304e + "}";
    }
}
