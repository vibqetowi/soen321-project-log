package qj;

import r1.b0;
/* compiled from: CouponAction.kt */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f29614c;

    public d(a aVar, String str) {
        super(aVar.f29611b, aVar.f29610a);
        this.f29614c = str;
    }

    @Override // qj.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CouponAction(actionType=");
        sb2.append(this.f29610a);
        sb2.append(", payload=");
        sb2.append(this.f29611b);
        sb2.append(",, couponCode='");
        return b0.b(sb2, this.f29614c, "')");
    }
}
