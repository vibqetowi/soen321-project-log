package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes.dex */
public final class f extends b0.d {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.d.a> f28254a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28255b;

    public f() {
        throw null;
    }

    public f(c0 c0Var, String str) {
        this.f28254a = c0Var;
        this.f28255b = str;
    }

    @Override // pd.b0.d
    public final c0<b0.d.a> a() {
        return this.f28254a;
    }

    @Override // pd.b0.d
    public final String b() {
        return this.f28255b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d)) {
            return false;
        }
        b0.d dVar = (b0.d) obj;
        if (this.f28254a.equals(dVar.a())) {
            String str = this.f28255b;
            if (str == null) {
                if (dVar.b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f28254a.hashCode() ^ 1000003) * 1000003;
        String str = this.f28255b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f28254a);
        sb2.append(", orgId=");
        return r1.b0.b(sb2, this.f28255b, "}");
    }
}
