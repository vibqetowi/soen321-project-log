package pt;
/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: d  reason: collision with root package name */
    public static final x f28961d = new x(h0.STRICT, 6);

    /* renamed from: a  reason: collision with root package name */
    public final h0 f28962a;

    /* renamed from: b  reason: collision with root package name */
    public final hs.c f28963b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f28964c;

    public x(h0 h0Var, hs.c cVar, h0 reportLevelAfter) {
        kotlin.jvm.internal.i.g(reportLevelAfter, "reportLevelAfter");
        this.f28962a = h0Var;
        this.f28963b = cVar;
        this.f28964c = reportLevelAfter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f28962a == xVar.f28962a && kotlin.jvm.internal.i.b(this.f28963b, xVar.f28963b) && this.f28964c == xVar.f28964c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f28962a.hashCode() * 31;
        hs.c cVar = this.f28963b;
        if (cVar == null) {
            i6 = 0;
        } else {
            i6 = cVar.f19463x;
        }
        return this.f28964c.hashCode() + ((hashCode + i6) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f28962a + ", sinceVersion=" + this.f28963b + ", reportLevelAfter=" + this.f28964c + ')';
    }

    public x(h0 h0Var, int i6) {
        this(h0Var, (i6 & 2) != 0 ? new hs.c(0, 0) : null, (i6 & 4) != 0 ? h0Var : null);
    }
}
