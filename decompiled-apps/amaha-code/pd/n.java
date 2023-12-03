package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes.dex */
public final class n extends b0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.e.d.a.b.AbstractC0477d> f28320a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.e.d.a.b.AbstractC0476b f28321b;

    /* renamed from: c  reason: collision with root package name */
    public final b0.a f28322c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.c f28323d;

    /* renamed from: e  reason: collision with root package name */
    public final c0<b0.e.d.a.b.AbstractC0474a> f28324e;

    public n() {
        throw null;
    }

    public n(c0 c0Var, b0.e.d.a.b.AbstractC0476b abstractC0476b, b0.a aVar, b0.e.d.a.b.c cVar, c0 c0Var2) {
        this.f28320a = c0Var;
        this.f28321b = abstractC0476b;
        this.f28322c = aVar;
        this.f28323d = cVar;
        this.f28324e = c0Var2;
    }

    @Override // pd.b0.e.d.a.b
    public final b0.a a() {
        return this.f28322c;
    }

    @Override // pd.b0.e.d.a.b
    public final c0<b0.e.d.a.b.AbstractC0474a> b() {
        return this.f28324e;
    }

    @Override // pd.b0.e.d.a.b
    public final b0.e.d.a.b.AbstractC0476b c() {
        return this.f28321b;
    }

    @Override // pd.b0.e.d.a.b
    public final b0.e.d.a.b.c d() {
        return this.f28323d;
    }

    @Override // pd.b0.e.d.a.b
    public final c0<b0.e.d.a.b.AbstractC0477d> e() {
        return this.f28320a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b)) {
            return false;
        }
        b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
        c0<b0.e.d.a.b.AbstractC0477d> c0Var = this.f28320a;
        if (c0Var != null ? c0Var.equals(bVar.e()) : bVar.e() == null) {
            b0.e.d.a.b.AbstractC0476b abstractC0476b = this.f28321b;
            if (abstractC0476b != null ? abstractC0476b.equals(bVar.c()) : bVar.c() == null) {
                b0.a aVar = this.f28322c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f28323d.equals(bVar.d()) && this.f28324e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i6 = 0;
        c0<b0.e.d.a.b.AbstractC0477d> c0Var = this.f28320a;
        if (c0Var == null) {
            hashCode = 0;
        } else {
            hashCode = c0Var.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        b0.e.d.a.b.AbstractC0476b abstractC0476b = this.f28321b;
        if (abstractC0476b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC0476b.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        b0.a aVar = this.f28322c;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return ((((i6 ^ i11) * 1000003) ^ this.f28323d.hashCode()) * 1000003) ^ this.f28324e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f28320a + ", exception=" + this.f28321b + ", appExitInfo=" + this.f28322c + ", signal=" + this.f28323d + ", binaries=" + this.f28324e + "}";
    }
}
