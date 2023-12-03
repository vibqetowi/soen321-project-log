package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes.dex */
public final class r extends b0.e.d.a.b.AbstractC0477d {

    /* renamed from: a  reason: collision with root package name */
    public final String f28341a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28342b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.e.d.a.b.AbstractC0477d.AbstractC0478a> f28343c;

    public r() {
        throw null;
    }

    public r(String str, int i6, c0 c0Var) {
        this.f28341a = str;
        this.f28342b = i6;
        this.f28343c = c0Var;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d
    public final c0<b0.e.d.a.b.AbstractC0477d.AbstractC0478a> a() {
        return this.f28343c;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d
    public final int b() {
        return this.f28342b;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0477d
    public final String c() {
        return this.f28341a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0477d)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0477d abstractC0477d = (b0.e.d.a.b.AbstractC0477d) obj;
        if (this.f28341a.equals(abstractC0477d.c()) && this.f28342b == abstractC0477d.b() && this.f28343c.equals(abstractC0477d.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f28341a.hashCode() ^ 1000003) * 1000003) ^ this.f28342b) * 1000003) ^ this.f28343c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f28341a + ", importance=" + this.f28342b + ", frames=" + this.f28343c + "}";
    }
}
