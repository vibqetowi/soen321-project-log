package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes.dex */
public final class d extends b0.a.AbstractC0471a {

    /* renamed from: a  reason: collision with root package name */
    public final String f28249a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28250b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28251c;

    public d(String str, String str2, String str3) {
        this.f28249a = str;
        this.f28250b = str2;
        this.f28251c = str3;
    }

    @Override // pd.b0.a.AbstractC0471a
    public final String a() {
        return this.f28249a;
    }

    @Override // pd.b0.a.AbstractC0471a
    public final String b() {
        return this.f28251c;
    }

    @Override // pd.b0.a.AbstractC0471a
    public final String c() {
        return this.f28250b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a.AbstractC0471a)) {
            return false;
        }
        b0.a.AbstractC0471a abstractC0471a = (b0.a.AbstractC0471a) obj;
        if (this.f28249a.equals(abstractC0471a.a()) && this.f28250b.equals(abstractC0471a.c()) && this.f28251c.equals(abstractC0471a.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f28249a.hashCode() ^ 1000003) * 1000003) ^ this.f28250b.hashCode()) * 1000003) ^ this.f28251c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f28249a);
        sb2.append(", libraryName=");
        sb2.append(this.f28250b);
        sb2.append(", buildId=");
        return r1.b0.b(sb2, this.f28251c, "}");
    }
}
