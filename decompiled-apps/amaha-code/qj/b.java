package qj;

import r1.b0;
/* compiled from: CallAction.kt */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f29612c;

    public b(a aVar, String str) {
        super(aVar.f29611b, aVar.f29610a);
        this.f29612c = str;
    }

    @Override // qj.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallAction(actionType=");
        sb2.append(this.f29610a);
        sb2.append(", payload=");
        sb2.append(this.f29611b);
        sb2.append(", number='");
        return b0.b(sb2, this.f29612c, "')");
    }
}
