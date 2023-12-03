package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes.dex */
public final class e extends b0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f28252a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28253b;

    public e(String str, String str2) {
        this.f28252a = str;
        this.f28253b = str2;
    }

    @Override // pd.b0.c
    public final String a() {
        return this.f28252a;
    }

    @Override // pd.b0.c
    public final String b() {
        return this.f28253b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.c)) {
            return false;
        }
        b0.c cVar = (b0.c) obj;
        if (this.f28252a.equals(cVar.a()) && this.f28253b.equals(cVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28252a.hashCode() ^ 1000003) * 1000003) ^ this.f28253b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f28252a);
        sb2.append(", value=");
        return r1.b0.b(sb2, this.f28253b, "}");
    }
}
