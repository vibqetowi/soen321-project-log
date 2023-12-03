package ih;
/* compiled from: SdkStatus.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20107a;

    public q(boolean z10) {
        this.f20107a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && this.f20107a == ((q) obj).f20107a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f20107a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return defpackage.c.t(new StringBuilder("SdkStatus(isEnabled="), this.f20107a, ')');
    }
}
