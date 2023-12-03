package d9;

import android.os.Bundle;
/* compiled from: VideoSize.java */
/* loaded from: classes.dex */
public final class q implements com.google.android.exoplayer2.f {

    /* renamed from: y  reason: collision with root package name */
    public static final q f12712y = new q(1.0f, 0, 0, 0);

    /* renamed from: u  reason: collision with root package name */
    public final int f12713u;

    /* renamed from: v  reason: collision with root package name */
    public final int f12714v;

    /* renamed from: w  reason: collision with root package name */
    public final int f12715w;

    /* renamed from: x  reason: collision with root package name */
    public final float f12716x;

    public q(float f, int i6, int i10, int i11) {
        this.f12713u = i6;
        this.f12714v = i10;
        this.f12715w = i11;
        this.f12716x = f;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.f12713u);
        bundle.putInt(b(1), this.f12714v);
        bundle.putInt(b(2), this.f12715w);
        bundle.putFloat(b(3), this.f12716x);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f12713u == qVar.f12713u && this.f12714v == qVar.f12714v && this.f12715w == qVar.f12715w && this.f12716x == qVar.f12716x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f12716x) + ((((((217 + this.f12713u) * 31) + this.f12714v) * 31) + this.f12715w) * 31);
    }
}
