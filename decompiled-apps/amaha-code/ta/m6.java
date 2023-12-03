package ta;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class m6 extends w9.a {
    public static final Parcelable.Creator<m6> CREATOR = new n6();
    public final String A;
    public final boolean B;
    public final boolean C;
    public final long D;
    public final String E;
    @Deprecated
    public final long F;
    public final long G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final String K;
    public final Boolean L;
    public final long M;
    public final List N;
    public final String O;
    public final String P;
    public final String Q;
    public final String R;

    /* renamed from: u  reason: collision with root package name */
    public final String f32748u;

    /* renamed from: v  reason: collision with root package name */
    public final String f32749v;

    /* renamed from: w  reason: collision with root package name */
    public final String f32750w;

    /* renamed from: x  reason: collision with root package name */
    public final String f32751x;

    /* renamed from: y  reason: collision with root package name */
    public final long f32752y;

    /* renamed from: z  reason: collision with root package name */
    public final long f32753z;

    public m6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i6, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10) {
        v9.o.e(str);
        this.f32748u = str;
        this.f32749v = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f32750w = str3;
        this.D = j10;
        this.f32751x = str4;
        this.f32752y = j11;
        this.f32753z = j12;
        this.A = str5;
        this.B = z10;
        this.C = z11;
        this.E = str6;
        this.F = 0L;
        this.G = j13;
        this.H = i6;
        this.I = z12;
        this.J = z13;
        this.K = str7;
        this.L = bool;
        this.M = j14;
        this.N = list;
        this.O = null;
        this.P = str8;
        this.Q = str9;
        this.R = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f32748u);
        hc.d.x0(parcel, 3, this.f32749v);
        hc.d.x0(parcel, 4, this.f32750w);
        hc.d.x0(parcel, 5, this.f32751x);
        hc.d.u0(parcel, 6, this.f32752y);
        hc.d.u0(parcel, 7, this.f32753z);
        hc.d.x0(parcel, 8, this.A);
        hc.d.o0(parcel, 9, this.B);
        hc.d.o0(parcel, 10, this.C);
        hc.d.u0(parcel, 11, this.D);
        hc.d.x0(parcel, 12, this.E);
        hc.d.u0(parcel, 13, this.F);
        hc.d.u0(parcel, 14, this.G);
        hc.d.s0(parcel, 15, this.H);
        hc.d.o0(parcel, 16, this.I);
        hc.d.o0(parcel, 18, this.J);
        hc.d.x0(parcel, 19, this.K);
        Boolean bool = this.L;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        hc.d.u0(parcel, 22, this.M);
        hc.d.y0(parcel, 23, this.N);
        hc.d.x0(parcel, 24, this.O);
        hc.d.x0(parcel, 25, this.P);
        hc.d.x0(parcel, 26, this.Q);
        hc.d.x0(parcel, 27, this.R);
        hc.d.C0(parcel, B0);
    }

    public m6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i6, boolean z12, boolean z13, String str7, Boolean bool, long j15, ArrayList arrayList, String str8, String str9, String str10, String str11) {
        this.f32748u = str;
        this.f32749v = str2;
        this.f32750w = str3;
        this.D = j12;
        this.f32751x = str4;
        this.f32752y = j10;
        this.f32753z = j11;
        this.A = str5;
        this.B = z10;
        this.C = z11;
        this.E = str6;
        this.F = j13;
        this.G = j14;
        this.H = i6;
        this.I = z12;
        this.J = z13;
        this.K = str7;
        this.L = bool;
        this.M = j15;
        this.N = arrayList;
        this.O = str8;
        this.P = str9;
        this.Q = str10;
        this.R = str11;
    }
}
