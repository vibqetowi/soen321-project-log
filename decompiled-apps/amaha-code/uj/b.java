package uj;
/* compiled from: ChronometerProperties.kt */
/* loaded from: classes.dex */
public final class b extends di.l {

    /* renamed from: c  reason: collision with root package name */
    public final long f34187c;

    /* renamed from: d  reason: collision with root package name */
    public final long f34188d;

    /* renamed from: e  reason: collision with root package name */
    public final String f34189e;

    public b(long j10, long j11, String str, di.l lVar) {
        super(lVar);
        this.f34187c = j10;
        this.f34188d = j11;
        this.f34189e = str;
    }

    @Override // di.l
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChronometerProperties(duration='");
        sb2.append(this.f34187c);
        sb2.append("', expiry=");
        sb2.append(this.f34188d);
        sb2.append(", format=");
        sb2.append(this.f34189e);
        sb2.append(", widgetProperties=");
        return v.g.c(sb2, super.toString(), ')');
    }
}
