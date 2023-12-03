package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes.dex */
public final class c extends b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f28232a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28233b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28234c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28235d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28236e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f28237g;

    /* renamed from: h  reason: collision with root package name */
    public final String f28238h;

    /* renamed from: i  reason: collision with root package name */
    public final c0<b0.a.AbstractC0471a> f28239i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.a.b {

        /* renamed from: a  reason: collision with root package name */
        public Integer f28240a;

        /* renamed from: b  reason: collision with root package name */
        public String f28241b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f28242c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f28243d;

        /* renamed from: e  reason: collision with root package name */
        public Long f28244e;
        public Long f;

        /* renamed from: g  reason: collision with root package name */
        public Long f28245g;

        /* renamed from: h  reason: collision with root package name */
        public String f28246h;

        /* renamed from: i  reason: collision with root package name */
        public c0<b0.a.AbstractC0471a> f28247i;

        public final c a() {
            String str;
            if (this.f28240a == null) {
                str = " pid";
            } else {
                str = "";
            }
            if (this.f28241b == null) {
                str = str.concat(" processName");
            }
            if (this.f28242c == null) {
                str = pl.a.f(str, " reasonCode");
            }
            if (this.f28243d == null) {
                str = pl.a.f(str, " importance");
            }
            if (this.f28244e == null) {
                str = pl.a.f(str, " pss");
            }
            if (this.f == null) {
                str = pl.a.f(str, " rss");
            }
            if (this.f28245g == null) {
                str = pl.a.f(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f28240a.intValue(), this.f28241b, this.f28242c.intValue(), this.f28243d.intValue(), this.f28244e.longValue(), this.f.longValue(), this.f28245g.longValue(), this.f28246h, this.f28247i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public c() {
        throw null;
    }

    public c(int i6, String str, int i10, int i11, long j10, long j11, long j12, String str2, c0 c0Var) {
        this.f28232a = i6;
        this.f28233b = str;
        this.f28234c = i10;
        this.f28235d = i11;
        this.f28236e = j10;
        this.f = j11;
        this.f28237g = j12;
        this.f28238h = str2;
        this.f28239i = c0Var;
    }

    @Override // pd.b0.a
    public final c0<b0.a.AbstractC0471a> a() {
        return this.f28239i;
    }

    @Override // pd.b0.a
    public final int b() {
        return this.f28235d;
    }

    @Override // pd.b0.a
    public final int c() {
        return this.f28232a;
    }

    @Override // pd.b0.a
    public final String d() {
        return this.f28233b;
    }

    @Override // pd.b0.a
    public final long e() {
        return this.f28236e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a)) {
            return false;
        }
        b0.a aVar = (b0.a) obj;
        if (this.f28232a == aVar.c() && this.f28233b.equals(aVar.d()) && this.f28234c == aVar.f() && this.f28235d == aVar.b() && this.f28236e == aVar.e() && this.f == aVar.g() && this.f28237g == aVar.h() && ((str = this.f28238h) != null ? str.equals(aVar.i()) : aVar.i() == null)) {
            c0<b0.a.AbstractC0471a> c0Var = this.f28239i;
            if (c0Var == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (c0Var.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // pd.b0.a
    public final int f() {
        return this.f28234c;
    }

    @Override // pd.b0.a
    public final long g() {
        return this.f;
    }

    @Override // pd.b0.a
    public final long h() {
        return this.f28237g;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f28236e;
        long j11 = this.f;
        long j12 = this.f28237g;
        int hashCode2 = (((((((((((((this.f28232a ^ 1000003) * 1000003) ^ this.f28233b.hashCode()) * 1000003) ^ this.f28234c) * 1000003) ^ this.f28235d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i6 = 0;
        String str = this.f28238h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        c0<b0.a.AbstractC0471a> c0Var = this.f28239i;
        if (c0Var != null) {
            i6 = c0Var.hashCode();
        }
        return i10 ^ i6;
    }

    @Override // pd.b0.a
    public final String i() {
        return this.f28238h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f28232a + ", processName=" + this.f28233b + ", reasonCode=" + this.f28234c + ", importance=" + this.f28235d + ", pss=" + this.f28236e + ", rss=" + this.f + ", timestamp=" + this.f28237g + ", traceFile=" + this.f28238h + ", buildIdMappingForArch=" + this.f28239i + "}";
    }
}
