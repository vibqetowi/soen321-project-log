package k9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class t extends w9.a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: u  reason: collision with root package name */
    public final float f23188u;

    /* renamed from: v  reason: collision with root package name */
    public final float f23189v;

    /* renamed from: w  reason: collision with root package name */
    public final float f23190w;

    public t(float f, float f2, float f10) {
        this.f23188u = f;
        this.f23189v = f2;
        this.f23190w = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f23188u == tVar.f23188u && this.f23189v == tVar.f23189v && this.f23190w == tVar.f23190w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23188u), Float.valueOf(this.f23189v), Float.valueOf(this.f23190w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        parcel.writeInt(262146);
        parcel.writeFloat(this.f23188u);
        parcel.writeInt(262147);
        parcel.writeFloat(this.f23189v);
        parcel.writeInt(262148);
        parcel.writeFloat(this.f23190w);
        hc.d.C0(parcel, B0);
    }
}
