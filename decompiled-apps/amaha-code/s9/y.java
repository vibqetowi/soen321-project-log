package s9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import v9.j1;
import v9.k1;
import v9.l1;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class y extends w9.a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: u  reason: collision with root package name */
    public final String f31375u;

    /* renamed from: v  reason: collision with root package name */
    public final p f31376v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f31377w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f31378x;

    public y(String str, p pVar, boolean z10, boolean z11) {
        this.f31375u = str;
        this.f31376v = pVar;
        this.f31377w = z10;
        this.f31378x = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f31375u);
        p pVar = this.f31376v;
        if (pVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            pVar = null;
        }
        hc.d.r0(parcel, 2, pVar);
        hc.d.o0(parcel, 3, this.f31377w);
        hc.d.o0(parcel, 4, this.f31378x);
        hc.d.C0(parcel, B0);
    }

    public y(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f31375u = str;
        q qVar = null;
        if (iBinder != null) {
            try {
                int i6 = k1.f34916b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                da.a e10 = (queryLocalInterface instanceof l1 ? (l1) queryLocalInterface : new j1(iBinder)).e();
                byte[] bArr = e10 == null ? null : (byte[]) da.b.Y1(e10);
                if (bArr != null) {
                    qVar = new q(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e11) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e11);
            }
        }
        this.f31376v = qVar;
        this.f31377w = z10;
        this.f31378x = z11;
    }
}
