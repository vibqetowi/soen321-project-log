package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes.dex */
public final class v extends b0.e.AbstractC0481e {

    /* renamed from: a  reason: collision with root package name */
    public final int f28365a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28366b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28367c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28368d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.AbstractC0481e.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f28369a;

        /* renamed from: b  reason: collision with root package name */
        public String f28370b;

        /* renamed from: c  reason: collision with root package name */
        public String f28371c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f28372d;

        public final v a() {
            String str;
            if (this.f28369a == null) {
                str = " platform";
            } else {
                str = "";
            }
            if (this.f28370b == null) {
                str = str.concat(" version");
            }
            if (this.f28371c == null) {
                str = pl.a.f(str, " buildVersion");
            }
            if (this.f28372d == null) {
                str = pl.a.f(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new v(this.f28369a.intValue(), this.f28370b, this.f28371c, this.f28372d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public v(int i6, String str, String str2, boolean z10) {
        this.f28365a = i6;
        this.f28366b = str;
        this.f28367c = str2;
        this.f28368d = z10;
    }

    @Override // pd.b0.e.AbstractC0481e
    public final String a() {
        return this.f28367c;
    }

    @Override // pd.b0.e.AbstractC0481e
    public final int b() {
        return this.f28365a;
    }

    @Override // pd.b0.e.AbstractC0481e
    public final String c() {
        return this.f28366b;
    }

    @Override // pd.b0.e.AbstractC0481e
    public final boolean d() {
        return this.f28368d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.AbstractC0481e)) {
            return false;
        }
        b0.e.AbstractC0481e abstractC0481e = (b0.e.AbstractC0481e) obj;
        if (this.f28365a == abstractC0481e.b() && this.f28366b.equals(abstractC0481e.c()) && this.f28367c.equals(abstractC0481e.a()) && this.f28368d == abstractC0481e.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = (((((this.f28365a ^ 1000003) * 1000003) ^ this.f28366b.hashCode()) * 1000003) ^ this.f28367c.hashCode()) * 1000003;
        if (this.f28368d) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return hashCode ^ i6;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f28365a + ", version=" + this.f28366b + ", buildVersion=" + this.f28367c + ", jailbroken=" + this.f28368d + "}";
    }
}
