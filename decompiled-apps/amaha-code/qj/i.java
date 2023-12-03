package qj;
/* compiled from: RemindLaterAction.kt */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: c  reason: collision with root package name */
    public final int f29623c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29624d;

    public i(a aVar, int i6, int i10) {
        super(aVar.f29611b, aVar.f29610a);
        this.f29623c = i6;
        this.f29624d = i10;
    }

    @Override // qj.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemindLaterAction(actionType=");
        sb2.append(this.f29610a);
        sb2.append(", payload=");
        sb2.append(this.f29611b);
        sb2.append(", remindAfterHours=");
        sb2.append(this.f29623c);
        sb2.append(", remindTomorrowAt=");
        return defpackage.c.s(sb2, this.f29624d, ')');
    }
}
