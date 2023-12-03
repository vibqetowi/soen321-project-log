package p9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class a0 extends w9.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();
    public final double A;

    /* renamed from: u  reason: collision with root package name */
    public final double f28029u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f28030v;

    /* renamed from: w  reason: collision with root package name */
    public final int f28031w;

    /* renamed from: x  reason: collision with root package name */
    public final k9.d f28032x;

    /* renamed from: y  reason: collision with root package name */
    public final int f28033y;

    /* renamed from: z  reason: collision with root package name */
    public final k9.v f28034z;

    public a0() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f28029u == a0Var.f28029u && this.f28030v == a0Var.f28030v && this.f28031w == a0Var.f28031w && a.e(this.f28032x, a0Var.f28032x) && this.f28033y == a0Var.f28033y) {
            k9.v vVar = this.f28034z;
            if (a.e(vVar, vVar) && this.A == a0Var.A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f28029u), Boolean.valueOf(this.f28030v), Integer.valueOf(this.f28031w), this.f28032x, Integer.valueOf(this.f28033y), this.f28034z, Double.valueOf(this.A)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.q0(parcel, 2, this.f28029u);
        hc.d.o0(parcel, 3, this.f28030v);
        hc.d.s0(parcel, 4, this.f28031w);
        hc.d.w0(parcel, 5, this.f28032x, i6);
        hc.d.s0(parcel, 6, this.f28033y);
        hc.d.w0(parcel, 7, this.f28034z, i6);
        hc.d.q0(parcel, 8, this.A);
        hc.d.C0(parcel, B0);
    }

    public a0(double d10, boolean z10, int i6, k9.d dVar, int i10, k9.v vVar, double d11) {
        this.f28029u = d10;
        this.f28030v = z10;
        this.f28031w = i6;
        this.f28032x = dVar;
        this.f28033y = i10;
        this.f28034z = vVar;
        this.A = d11;
    }
}
