package qj;
/* compiled from: SnoozeAction.kt */
/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: c  reason: collision with root package name */
    public final int f29626c;

    public k(a aVar, int i6) {
        super(aVar.f29611b, aVar.f29610a);
        this.f29626c = i6;
    }

    @Override // qj.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnoozeAction(actionType=");
        sb2.append(this.f29610a);
        sb2.append(", payload=");
        sb2.append(this.f29611b);
        sb2.append(", hoursAfterClick=");
        return defpackage.c.s(sb2, this.f29626c, ')');
    }
}
