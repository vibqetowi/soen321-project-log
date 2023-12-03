package m9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class a extends w9.a {
    public static final p9.b A = new p9.b("CastMediaOptions");
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new h();

    /* renamed from: u  reason: collision with root package name */
    public final String f24939u;

    /* renamed from: v  reason: collision with root package name */
    public final String f24940v;

    /* renamed from: w  reason: collision with root package name */
    public final x f24941w;

    /* renamed from: x  reason: collision with root package name */
    public final f f24942x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f24943y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f24944z;

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        x mVar;
        this.f24939u = str;
        this.f24940v = str2;
        if (iBinder == null) {
            mVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof x) {
                mVar = (x) queryLocalInterface;
            } else {
                mVar = new m(iBinder);
            }
        }
        this.f24941w = mVar;
        this.f24942x = fVar;
        this.f24943y = z10;
        this.f24944z = z11;
    }

    @RecentlyNullable
    public final c f0() {
        x xVar = this.f24941w;
        if (xVar != null) {
            try {
                return (c) da.b.Y1(xVar.h());
            } catch (RemoteException e10) {
                A.a("Unable to call %s on %s.", e10, "getWrappedClientObject", x.class.getSimpleName());
                return null;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        IBinder asBinder;
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f24939u);
        hc.d.x0(parcel, 3, this.f24940v);
        x xVar = this.f24941w;
        if (xVar == null) {
            asBinder = null;
        } else {
            asBinder = xVar.asBinder();
        }
        hc.d.r0(parcel, 4, asBinder);
        hc.d.w0(parcel, 5, this.f24942x, i6);
        hc.d.o0(parcel, 6, this.f24943y);
        hc.d.o0(parcel, 7, this.f24944z);
        hc.d.C0(parcel, B0);
    }
}
