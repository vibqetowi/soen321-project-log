package ta;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class g6 extends w9.a {
    public static final Parcelable.Creator<g6> CREATOR = new h6();
    public final Double A;

    /* renamed from: u  reason: collision with root package name */
    public final int f32577u;

    /* renamed from: v  reason: collision with root package name */
    public final String f32578v;

    /* renamed from: w  reason: collision with root package name */
    public final long f32579w;

    /* renamed from: x  reason: collision with root package name */
    public final Long f32580x;

    /* renamed from: y  reason: collision with root package name */
    public final String f32581y;

    /* renamed from: z  reason: collision with root package name */
    public final String f32582z;

    public g6(int i6, String str, long j10, Long l2, Float f, String str2, String str3, Double d10) {
        this.f32577u = i6;
        this.f32578v = str;
        this.f32579w = j10;
        this.f32580x = l2;
        if (i6 == 1) {
            this.A = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.A = d10;
        }
        this.f32581y = str2;
        this.f32582z = str3;
    }

    public final Object f0() {
        Long l2 = this.f32580x;
        if (l2 != null) {
            return l2;
        }
        Double d10 = this.A;
        if (d10 != null) {
            return d10;
        }
        String str = this.f32581y;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        h6.a(this, parcel);
    }

    public g6(i6 i6Var) {
        this(i6Var.f32634d, i6Var.f32635e, i6Var.f32633c, i6Var.f32632b);
    }

    public g6(long j10, Object obj, String str, String str2) {
        v9.o.e(str);
        this.f32577u = 2;
        this.f32578v = str;
        this.f32579w = j10;
        this.f32582z = str2;
        if (obj == null) {
            this.f32580x = null;
            this.A = null;
            this.f32581y = null;
        } else if (obj instanceof Long) {
            this.f32580x = (Long) obj;
            this.A = null;
            this.f32581y = null;
        } else if (obj instanceof String) {
            this.f32580x = null;
            this.A = null;
            this.f32581y = (String) obj;
        } else if (obj instanceof Double) {
            this.f32580x = null;
            this.A = (Double) obj;
            this.f32581y = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
