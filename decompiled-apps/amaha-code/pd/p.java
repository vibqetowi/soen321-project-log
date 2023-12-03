package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes.dex */
public final class p extends b0.e.d.a.b.AbstractC0476b {

    /* renamed from: a  reason: collision with root package name */
    public final String f28333a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28334b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.e.d.a.b.AbstractC0477d.AbstractC0478a> f28335c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.AbstractC0476b f28336d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28337e;

    public p() {
        throw null;
    }

    public p(String str, String str2, c0 c0Var, b0.e.d.a.b.AbstractC0476b abstractC0476b, int i6) {
        this.f28333a = str;
        this.f28334b = str2;
        this.f28335c = c0Var;
        this.f28336d = abstractC0476b;
        this.f28337e = i6;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0476b
    public final b0.e.d.a.b.AbstractC0476b a() {
        return this.f28336d;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0476b
    public final c0<b0.e.d.a.b.AbstractC0477d.AbstractC0478a> b() {
        return this.f28335c;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0476b
    public final int c() {
        return this.f28337e;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0476b
    public final String d() {
        return this.f28334b;
    }

    @Override // pd.b0.e.d.a.b.AbstractC0476b
    public final String e() {
        return this.f28333a;
    }

    public final boolean equals(Object obj) {
        String str;
        b0.e.d.a.b.AbstractC0476b abstractC0476b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0476b)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0476b abstractC0476b2 = (b0.e.d.a.b.AbstractC0476b) obj;
        if (this.f28333a.equals(abstractC0476b2.e()) && ((str = this.f28334b) != null ? str.equals(abstractC0476b2.d()) : abstractC0476b2.d() == null) && this.f28335c.equals(abstractC0476b2.b()) && ((abstractC0476b = this.f28336d) != null ? abstractC0476b.equals(abstractC0476b2.a()) : abstractC0476b2.a() == null) && this.f28337e == abstractC0476b2.c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f28333a.hashCode() ^ 1000003) * 1000003;
        int i6 = 0;
        String str = this.f28334b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f28335c.hashCode()) * 1000003;
        b0.e.d.a.b.AbstractC0476b abstractC0476b = this.f28336d;
        if (abstractC0476b != null) {
            i6 = abstractC0476b.hashCode();
        }
        return ((hashCode3 ^ i6) * 1000003) ^ this.f28337e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f28333a);
        sb2.append(", reason=");
        sb2.append(this.f28334b);
        sb2.append(", frames=");
        sb2.append(this.f28335c);
        sb2.append(", causedBy=");
        sb2.append(this.f28336d);
        sb2.append(", overflowCount=");
        return pl.a.g(sb2, this.f28337e, "}");
    }
}
