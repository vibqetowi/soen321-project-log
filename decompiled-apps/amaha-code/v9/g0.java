package v9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import v9.i;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class g0 extends w9.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: u  reason: collision with root package name */
    public final int f34899u;

    /* renamed from: v  reason: collision with root package name */
    public final IBinder f34900v;

    /* renamed from: w  reason: collision with root package name */
    public final s9.b f34901w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f34902x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f34903y;

    public g0(int i6, IBinder iBinder, s9.b bVar, boolean z10, boolean z11) {
        this.f34899u = i6;
        this.f34900v = iBinder;
        this.f34901w = bVar;
        this.f34902x = z10;
        this.f34903y = z11;
    }

    public final boolean equals(Object obj) {
        Object i1Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f34901w.equals(g0Var.f34901w)) {
            Object obj2 = null;
            IBinder iBinder = this.f34900v;
            if (iBinder == null) {
                i1Var = null;
            } else {
                int i6 = i.a.f34909b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    i1Var = (i) queryLocalInterface;
                } else {
                    i1Var = new i1(iBinder);
                }
            }
            IBinder iBinder2 = g0Var.f34900v;
            if (iBinder2 != null) {
                int i10 = i.a.f34909b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof i) {
                    obj2 = (i) queryLocalInterface2;
                } else {
                    obj2 = new i1(iBinder2);
                }
            }
            if (m.a(i1Var, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f34899u);
        hc.d.r0(parcel, 2, this.f34900v);
        hc.d.w0(parcel, 3, this.f34901w, i6);
        hc.d.o0(parcel, 4, this.f34902x);
        hc.d.o0(parcel, 5, this.f34903y);
        hc.d.C0(parcel, B0);
    }
}
