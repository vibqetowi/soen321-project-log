package pd;

import pd.d0;
/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes.dex */
public final class y extends d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f28377a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28378b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28379c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28380d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28381e;
    public final kd.c f;

    public y(String str, String str2, String str3, String str4, int i6, kd.c cVar) {
        if (str != null) {
            this.f28377a = str;
            if (str2 != null) {
                this.f28378b = str2;
                if (str3 != null) {
                    this.f28379c = str3;
                    if (str4 != null) {
                        this.f28380d = str4;
                        this.f28381e = i6;
                        if (cVar != null) {
                            this.f = cVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // pd.d0.a
    public final String a() {
        return this.f28377a;
    }

    @Override // pd.d0.a
    public final int b() {
        return this.f28381e;
    }

    @Override // pd.d0.a
    public final kd.c c() {
        return this.f;
    }

    @Override // pd.d0.a
    public final String d() {
        return this.f28380d;
    }

    @Override // pd.d0.a
    public final String e() {
        return this.f28378b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.a)) {
            return false;
        }
        d0.a aVar = (d0.a) obj;
        if (this.f28377a.equals(aVar.a()) && this.f28378b.equals(aVar.e()) && this.f28379c.equals(aVar.f()) && this.f28380d.equals(aVar.d()) && this.f28381e == aVar.b() && this.f.equals(aVar.c())) {
            return true;
        }
        return false;
    }

    @Override // pd.d0.a
    public final String f() {
        return this.f28379c;
    }

    public final int hashCode() {
        return ((((((((((this.f28377a.hashCode() ^ 1000003) * 1000003) ^ this.f28378b.hashCode()) * 1000003) ^ this.f28379c.hashCode()) * 1000003) ^ this.f28380d.hashCode()) * 1000003) ^ this.f28381e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f28377a + ", versionCode=" + this.f28378b + ", versionName=" + this.f28379c + ", installUuid=" + this.f28380d + ", deliveryMechanism=" + this.f28381e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
