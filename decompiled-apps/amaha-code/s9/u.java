package s9;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import da.a;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class u extends w9.a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* renamed from: u  reason: collision with root package name */
    public final String f31366u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f31367v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f31368w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f31369x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f31370y;

    public u(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f31366u = str;
        this.f31367v = z10;
        this.f31368w = z11;
        this.f31369x = (Context) da.b.Y1(a.AbstractBinderC0186a.X1(iBinder));
        this.f31370y = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f31366u);
        hc.d.o0(parcel, 2, this.f31367v);
        hc.d.o0(parcel, 3, this.f31368w);
        hc.d.r0(parcel, 4, new da.b(this.f31369x));
        hc.d.o0(parcel, 5, this.f31370y);
        hc.d.C0(parcel, B0);
    }
}
