package uj;
/* compiled from: ProgressbarProperties.kt */
/* loaded from: classes.dex */
public final class l extends di.l {

    /* renamed from: c  reason: collision with root package name */
    public final long f34209c;

    /* renamed from: d  reason: collision with root package name */
    public final long f34210d;

    public l(long j10, long j11, di.l lVar) {
        super(lVar);
        this.f34209c = j10;
        this.f34210d = j11;
    }

    @Override // di.l
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressbarProperties(duration=");
        sb2.append(this.f34209c);
        sb2.append(", expiry=");
        sb2.append(this.f34210d);
        sb2.append(", widgetProperties=");
        return v.g.c(sb2, super.toString(), ')');
    }
}
