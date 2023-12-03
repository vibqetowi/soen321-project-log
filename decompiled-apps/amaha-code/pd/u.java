package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes.dex */
public final class u extends b0.e.d.AbstractC0480d {

    /* renamed from: a  reason: collision with root package name */
    public final String f28364a;

    public u(String str) {
        this.f28364a = str;
    }

    @Override // pd.b0.e.d.AbstractC0480d
    public final String a() {
        return this.f28364a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.AbstractC0480d) {
            return this.f28364a.equals(((b0.e.d.AbstractC0480d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f28364a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return r1.b0.b(new StringBuilder("Log{content="), this.f28364a, "}");
    }
}
