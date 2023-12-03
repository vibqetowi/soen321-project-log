package ih;

import r1.b0;
/* compiled from: DeviceAttribute.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20077a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20078b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20079c;

    public e(String fcmToken, String oemToken, int i6) {
        this.f20077a = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                kotlin.jvm.internal.i.g(fcmToken, "attrName");
                kotlin.jvm.internal.i.g(oemToken, "attrValue");
                this.f20078b = fcmToken;
                this.f20079c = oemToken;
                return;
            }
            kotlin.jvm.internal.i.g(fcmToken, "message");
            this.f20078b = fcmToken;
            this.f20079c = oemToken;
            return;
        }
        kotlin.jvm.internal.i.g(fcmToken, "fcmToken");
        kotlin.jvm.internal.i.g(oemToken, "oemToken");
        this.f20078b = fcmToken;
        this.f20079c = oemToken;
    }

    public final String toString() {
        switch (this.f20077a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("DeviceAttribute(name='");
                sb2.append(this.f20078b);
                sb2.append("', value='");
                return b0.b(sb2, this.f20079c, "')");
            default:
                return super.toString();
        }
    }
}
