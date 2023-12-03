package ih;
/* compiled from: TokenState.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20108a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20109b;

    public r(boolean z10, boolean z11) {
        this.f20108a = z10;
        this.f20109b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f20108a == rVar.f20108a && this.f20109b == rVar.f20109b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i6 = 1;
        boolean z10 = this.f20108a;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = i10 * 31;
        boolean z11 = this.f20109b;
        if (!z11) {
            i6 = z11 ? 1 : 0;
        }
        return i11 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenState(hasSentFcmToken=");
        sb2.append(this.f20108a);
        sb2.append(", hasSentSecondaryToken=");
        return defpackage.c.t(sb2, this.f20109b, ')');
    }
}
