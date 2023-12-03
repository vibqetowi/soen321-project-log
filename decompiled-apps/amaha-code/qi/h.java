package qi;

import r1.b0;
/* compiled from: SmsAction.java */
/* loaded from: classes.dex */
public final class h extends bj.a {

    /* renamed from: b  reason: collision with root package name */
    public final String f29601b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29602c;

    public h(int i6, String str, String str2) {
        super(i6);
        this.f29601b = str;
        this.f29602c = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SmsAction{phoneNumber='");
        sb2.append(this.f29601b);
        sb2.append("', message='");
        return b0.b(sb2, this.f29602c, "'}");
    }
}
