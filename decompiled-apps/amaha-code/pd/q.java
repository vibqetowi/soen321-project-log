package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes.dex */
public final class q extends b0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f28338a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28339b;

    /* renamed from: c  reason: collision with root package name */
    public final long f28340c;

    public q(String str, String str2, long j10) {
        this.f28338a = str;
        this.f28339b = str2;
        this.f28340c = j10;
    }

    @Override // pd.b0.e.d.a.b.c
    public final long a() {
        return this.f28340c;
    }

    @Override // pd.b0.e.d.a.b.c
    public final String b() {
        return this.f28339b;
    }

    @Override // pd.b0.e.d.a.b.c
    public final String c() {
        return this.f28338a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.c)) {
            return false;
        }
        b0.e.d.a.b.c cVar = (b0.e.d.a.b.c) obj;
        if (this.f28338a.equals(cVar.c()) && this.f28339b.equals(cVar.b()) && this.f28340c == cVar.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28340c;
        return ((((this.f28338a.hashCode() ^ 1000003) * 1000003) ^ this.f28339b.hashCode()) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "Signal{name=" + this.f28338a + ", code=" + this.f28339b + ", address=" + this.f28340c + "}";
    }
}
