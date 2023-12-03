package ih;
/* compiled from: DeviceIdentifierPreference.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20080a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20081b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20082c;

    public f(boolean z10, boolean z11, boolean z12) {
        this.f20080a = z10;
        this.f20081b = z11;
        this.f20082c = z12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IdentifierTrackingPreference(isAndroidIdTrackingEnabled=");
        sb2.append(this.f20080a);
        sb2.append(", isAdIdTrackingEnabled=");
        return defpackage.c.t(sb2, this.f20081b, ')');
    }
}
