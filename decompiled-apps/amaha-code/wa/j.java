package wa;

import android.os.Parcel;
import android.os.Parcelable;
import v9.e0;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class j extends w9.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: u  reason: collision with root package name */
    public final int f36660u;

    /* renamed from: v  reason: collision with root package name */
    public final e0 f36661v;

    public j(int i6, e0 e0Var) {
        this.f36660u = i6;
        this.f36661v = e0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f36660u);
        hc.d.w0(parcel, 2, this.f36661v, i6);
        hc.d.C0(parcel, B0);
    }
}
