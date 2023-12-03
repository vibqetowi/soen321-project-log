package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes.dex */
public final class i extends b0.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f28278a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28279b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28280c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.a.AbstractC0472a f28281d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f28282e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f28283g;

    public i(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f28278a = str;
        this.f28279b = str2;
        this.f28280c = str3;
        this.f28282e = str4;
        this.f = str5;
        this.f28283g = str6;
    }

    @Override // pd.b0.e.a
    public final String a() {
        return this.f;
    }

    @Override // pd.b0.e.a
    public final String b() {
        return this.f28283g;
    }

    @Override // pd.b0.e.a
    public final String c() {
        return this.f28280c;
    }

    @Override // pd.b0.e.a
    public final String d() {
        return this.f28278a;
    }

    @Override // pd.b0.e.a
    public final String e() {
        return this.f28282e;
    }

    public final boolean equals(Object obj) {
        String str;
        b0.e.a.AbstractC0472a abstractC0472a;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.a)) {
            return false;
        }
        b0.e.a aVar = (b0.e.a) obj;
        if (this.f28278a.equals(aVar.d()) && this.f28279b.equals(aVar.g()) && ((str = this.f28280c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((abstractC0472a = this.f28281d) != null ? abstractC0472a.equals(aVar.f()) : aVar.f() == null) && ((str2 = this.f28282e) != null ? str2.equals(aVar.e()) : aVar.e() == null) && ((str3 = this.f) != null ? str3.equals(aVar.a()) : aVar.a() == null)) {
            String str4 = this.f28283g;
            if (str4 == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // pd.b0.e.a
    public final b0.e.a.AbstractC0472a f() {
        return this.f28281d;
    }

    @Override // pd.b0.e.a
    public final String g() {
        return this.f28279b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f28278a.hashCode() ^ 1000003) * 1000003) ^ this.f28279b.hashCode()) * 1000003;
        int i6 = 0;
        String str = this.f28280c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        b0.e.a.AbstractC0472a abstractC0472a = this.f28281d;
        if (abstractC0472a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC0472a.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str2 = this.f28282e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str3 = this.f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        String str4 = this.f28283g;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i13 ^ i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f28278a);
        sb2.append(", version=");
        sb2.append(this.f28279b);
        sb2.append(", displayVersion=");
        sb2.append(this.f28280c);
        sb2.append(", organization=");
        sb2.append(this.f28281d);
        sb2.append(", installationUuid=");
        sb2.append(this.f28282e);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f);
        sb2.append(", developmentPlatformVersion=");
        return r1.b0.b(sb2, this.f28283g, "}");
    }
}
