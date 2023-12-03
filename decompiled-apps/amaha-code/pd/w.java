package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes.dex */
public final class w extends b0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f28373a;

    public w(String str) {
        this.f28373a = str;
    }

    @Override // pd.b0.e.f
    public final String a() {
        return this.f28373a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.f) {
            return this.f28373a.equals(((b0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f28373a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return r1.b0.b(new StringBuilder("User{identifier="), this.f28373a, "}");
    }
}
