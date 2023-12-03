package oh;

import kotlin.jvm.internal.i;
/* compiled from: ReportAddRequest.kt */
/* loaded from: classes.dex */
public final class e extends jg.d {

    /* renamed from: g  reason: collision with root package name */
    public final jg.d f27469g;

    /* renamed from: h  reason: collision with root package name */
    public final String f27470h;

    /* renamed from: i  reason: collision with root package name */
    public final d f27471i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f27472j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jg.d baseRequest, String str, d dVar, boolean z10) {
        super(baseRequest);
        i.g(baseRequest, "baseRequest");
        this.f27469g = baseRequest;
        this.f27470h = str;
        this.f27471i = dVar;
        this.f27472j = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (i.b(this.f27469g, eVar.f27469g) && i.b(this.f27470h, eVar.f27470h) && i.b(this.f27471i, eVar.f27471i) && this.f27472j == eVar.f27472j) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f27471i.hashCode() + pl.a.c(this.f27470h, this.f27469g.hashCode() * 31, 31)) * 31;
        boolean z10 = this.f27472j;
        int i6 = z10;
        if (z10 != 0) {
            i6 = 1;
        }
        return hashCode + i6;
    }

    @Override // jg.d
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportAddRequest(baseRequest=");
        sb2.append(this.f27469g);
        sb2.append(", requestId=");
        sb2.append(this.f27470h);
        sb2.append(", reportAddPayload=");
        sb2.append(this.f27471i);
        sb2.append(", shouldSendRequestToTestServer=");
        return defpackage.c.t(sb2, this.f27472j, ')');
    }
}
