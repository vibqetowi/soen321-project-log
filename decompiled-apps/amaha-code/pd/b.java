package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes.dex */
public final class b extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f28217b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28218c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28219d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28220e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f28221g;

    /* renamed from: h  reason: collision with root package name */
    public final b0.e f28222h;

    /* renamed from: i  reason: collision with root package name */
    public final b0.d f28223i;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f28224a;

        /* renamed from: b  reason: collision with root package name */
        public String f28225b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f28226c;

        /* renamed from: d  reason: collision with root package name */
        public String f28227d;

        /* renamed from: e  reason: collision with root package name */
        public String f28228e;
        public String f;

        /* renamed from: g  reason: collision with root package name */
        public b0.e f28229g;

        /* renamed from: h  reason: collision with root package name */
        public b0.d f28230h;

        public a() {
        }

        public final b a() {
            String str;
            if (this.f28224a == null) {
                str = " sdkVersion";
            } else {
                str = "";
            }
            if (this.f28225b == null) {
                str = str.concat(" gmpAppId");
            }
            if (this.f28226c == null) {
                str = pl.a.f(str, " platform");
            }
            if (this.f28227d == null) {
                str = pl.a.f(str, " installationUuid");
            }
            if (this.f28228e == null) {
                str = pl.a.f(str, " buildVersion");
            }
            if (this.f == null) {
                str = pl.a.f(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f28224a, this.f28225b, this.f28226c.intValue(), this.f28227d, this.f28228e, this.f, this.f28229g, this.f28230h);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public a(b0 b0Var) {
            this.f28224a = b0Var.g();
            this.f28225b = b0Var.c();
            this.f28226c = Integer.valueOf(b0Var.f());
            this.f28227d = b0Var.d();
            this.f28228e = b0Var.a();
            this.f = b0Var.b();
            this.f28229g = b0Var.h();
            this.f28230h = b0Var.e();
        }
    }

    public b(String str, String str2, int i6, String str3, String str4, String str5, b0.e eVar, b0.d dVar) {
        this.f28217b = str;
        this.f28218c = str2;
        this.f28219d = i6;
        this.f28220e = str3;
        this.f = str4;
        this.f28221g = str5;
        this.f28222h = eVar;
        this.f28223i = dVar;
    }

    @Override // pd.b0
    public final String a() {
        return this.f;
    }

    @Override // pd.b0
    public final String b() {
        return this.f28221g;
    }

    @Override // pd.b0
    public final String c() {
        return this.f28218c;
    }

    @Override // pd.b0
    public final String d() {
        return this.f28220e;
    }

    @Override // pd.b0
    public final b0.d e() {
        return this.f28223i;
    }

    public final boolean equals(Object obj) {
        b0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f28217b.equals(b0Var.g()) && this.f28218c.equals(b0Var.c()) && this.f28219d == b0Var.f() && this.f28220e.equals(b0Var.d()) && this.f.equals(b0Var.a()) && this.f28221g.equals(b0Var.b()) && ((eVar = this.f28222h) != null ? eVar.equals(b0Var.h()) : b0Var.h() == null)) {
            b0.d dVar = this.f28223i;
            if (dVar == null) {
                if (b0Var.e() == null) {
                    return true;
                }
            } else if (dVar.equals(b0Var.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // pd.b0
    public final int f() {
        return this.f28219d;
    }

    @Override // pd.b0
    public final String g() {
        return this.f28217b;
    }

    @Override // pd.b0
    public final b0.e h() {
        return this.f28222h;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((this.f28217b.hashCode() ^ 1000003) * 1000003) ^ this.f28218c.hashCode()) * 1000003) ^ this.f28219d) * 1000003) ^ this.f28220e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.f28221g.hashCode()) * 1000003;
        int i6 = 0;
        b0.e eVar = this.f28222h;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        b0.d dVar = this.f28223i;
        if (dVar != null) {
            i6 = dVar.hashCode();
        }
        return i10 ^ i6;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f28217b + ", gmpAppId=" + this.f28218c + ", platform=" + this.f28219d + ", installationUuid=" + this.f28220e + ", buildVersion=" + this.f + ", displayVersion=" + this.f28221g + ", session=" + this.f28222h + ", ndkPayload=" + this.f28223i + "}";
    }
}
