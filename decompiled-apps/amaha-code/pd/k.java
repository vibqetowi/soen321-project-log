package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes.dex */
public final class k extends b0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f28284a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28285b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28286c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28287d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28288e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28289g;

    /* renamed from: h  reason: collision with root package name */
    public final String f28290h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28291i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f28292a;

        /* renamed from: b  reason: collision with root package name */
        public String f28293b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f28294c;

        /* renamed from: d  reason: collision with root package name */
        public Long f28295d;

        /* renamed from: e  reason: collision with root package name */
        public Long f28296e;
        public Boolean f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f28297g;

        /* renamed from: h  reason: collision with root package name */
        public String f28298h;

        /* renamed from: i  reason: collision with root package name */
        public String f28299i;

        public final k a() {
            String str;
            if (this.f28292a == null) {
                str = " arch";
            } else {
                str = "";
            }
            if (this.f28293b == null) {
                str = str.concat(" model");
            }
            if (this.f28294c == null) {
                str = pl.a.f(str, " cores");
            }
            if (this.f28295d == null) {
                str = pl.a.f(str, " ram");
            }
            if (this.f28296e == null) {
                str = pl.a.f(str, " diskSpace");
            }
            if (this.f == null) {
                str = pl.a.f(str, " simulator");
            }
            if (this.f28297g == null) {
                str = pl.a.f(str, " state");
            }
            if (this.f28298h == null) {
                str = pl.a.f(str, " manufacturer");
            }
            if (this.f28299i == null) {
                str = pl.a.f(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new k(this.f28292a.intValue(), this.f28293b, this.f28294c.intValue(), this.f28295d.longValue(), this.f28296e.longValue(), this.f.booleanValue(), this.f28297g.intValue(), this.f28298h, this.f28299i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public k(int i6, String str, int i10, long j10, long j11, boolean z10, int i11, String str2, String str3) {
        this.f28284a = i6;
        this.f28285b = str;
        this.f28286c = i10;
        this.f28287d = j10;
        this.f28288e = j11;
        this.f = z10;
        this.f28289g = i11;
        this.f28290h = str2;
        this.f28291i = str3;
    }

    @Override // pd.b0.e.c
    public final int a() {
        return this.f28284a;
    }

    @Override // pd.b0.e.c
    public final int b() {
        return this.f28286c;
    }

    @Override // pd.b0.e.c
    public final long c() {
        return this.f28288e;
    }

    @Override // pd.b0.e.c
    public final String d() {
        return this.f28290h;
    }

    @Override // pd.b0.e.c
    public final String e() {
        return this.f28285b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.c)) {
            return false;
        }
        b0.e.c cVar = (b0.e.c) obj;
        if (this.f28284a == cVar.a() && this.f28285b.equals(cVar.e()) && this.f28286c == cVar.b() && this.f28287d == cVar.g() && this.f28288e == cVar.c() && this.f == cVar.i() && this.f28289g == cVar.h() && this.f28290h.equals(cVar.d()) && this.f28291i.equals(cVar.f())) {
            return true;
        }
        return false;
    }

    @Override // pd.b0.e.c
    public final String f() {
        return this.f28291i;
    }

    @Override // pd.b0.e.c
    public final long g() {
        return this.f28287d;
    }

    @Override // pd.b0.e.c
    public final int h() {
        return this.f28289g;
    }

    public final int hashCode() {
        int i6;
        long j10 = this.f28287d;
        long j11 = this.f28288e;
        int hashCode = (((((((((this.f28284a ^ 1000003) * 1000003) ^ this.f28285b.hashCode()) * 1000003) ^ this.f28286c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return ((((((hashCode ^ i6) * 1000003) ^ this.f28289g) * 1000003) ^ this.f28290h.hashCode()) * 1000003) ^ this.f28291i.hashCode();
    }

    @Override // pd.b0.e.c
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f28284a);
        sb2.append(", model=");
        sb2.append(this.f28285b);
        sb2.append(", cores=");
        sb2.append(this.f28286c);
        sb2.append(", ram=");
        sb2.append(this.f28287d);
        sb2.append(", diskSpace=");
        sb2.append(this.f28288e);
        sb2.append(", simulator=");
        sb2.append(this.f);
        sb2.append(", state=");
        sb2.append(this.f28289g);
        sb2.append(", manufacturer=");
        sb2.append(this.f28290h);
        sb2.append(", modelClass=");
        return r1.b0.b(sb2, this.f28291i, "}");
    }
}
