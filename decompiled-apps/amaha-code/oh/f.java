package oh;
/* compiled from: ReportAddResponse.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27473a;

    public f(boolean z10) {
        this.f27473a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && this.f27473a == ((f) obj).f27473a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f27473a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return defpackage.c.t(new StringBuilder("ReportAddResponse(isSuccess="), this.f27473a, ')');
    }
}
