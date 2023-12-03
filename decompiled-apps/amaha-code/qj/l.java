package qj;

import r1.b0;
/* compiled from: TrackAction.kt */
/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f29627c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29628d;

    /* renamed from: e  reason: collision with root package name */
    public final String f29629e;

    public l(a aVar, String str, String str2, String str3) {
        super(aVar.f29611b, aVar.f29610a);
        this.f29627c = str;
        this.f29628d = str2;
        this.f29629e = str3;
    }

    @Override // qj.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackAction(actionType=");
        sb2.append(this.f29610a);
        sb2.append(", payload=");
        sb2.append(this.f29611b);
        sb2.append(", trackType='");
        sb2.append(this.f29627c);
        sb2.append("', value=");
        sb2.append((Object) this.f29628d);
        sb2.append(", name='");
        return b0.b(sb2, this.f29629e, "')");
    }
}
