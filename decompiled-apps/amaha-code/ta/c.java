package ta;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class c extends w9.a {
    public static final Parcelable.Creator<c> CREATOR = new d();
    public final s A;
    public long B;
    public s C;
    public final long D;
    public final s E;

    /* renamed from: u  reason: collision with root package name */
    public String f32491u;

    /* renamed from: v  reason: collision with root package name */
    public String f32492v;

    /* renamed from: w  reason: collision with root package name */
    public g6 f32493w;

    /* renamed from: x  reason: collision with root package name */
    public long f32494x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f32495y;

    /* renamed from: z  reason: collision with root package name */
    public String f32496z;

    public c(c cVar) {
        v9.o.h(cVar);
        this.f32491u = cVar.f32491u;
        this.f32492v = cVar.f32492v;
        this.f32493w = cVar.f32493w;
        this.f32494x = cVar.f32494x;
        this.f32495y = cVar.f32495y;
        this.f32496z = cVar.f32496z;
        this.A = cVar.A;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = cVar.D;
        this.E = cVar.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f32491u);
        hc.d.x0(parcel, 3, this.f32492v);
        hc.d.w0(parcel, 4, this.f32493w, i6);
        hc.d.u0(parcel, 5, this.f32494x);
        hc.d.o0(parcel, 6, this.f32495y);
        hc.d.x0(parcel, 7, this.f32496z);
        hc.d.w0(parcel, 8, this.A, i6);
        hc.d.u0(parcel, 9, this.B);
        hc.d.w0(parcel, 10, this.C, i6);
        hc.d.u0(parcel, 11, this.D);
        hc.d.w0(parcel, 12, this.E, i6);
        hc.d.C0(parcel, B0);
    }

    public c(String str, String str2, g6 g6Var, long j10, boolean z10, String str3, s sVar, long j11, s sVar2, long j12, s sVar3) {
        this.f32491u = str;
        this.f32492v = str2;
        this.f32493w = g6Var;
        this.f32494x = j10;
        this.f32495y = z10;
        this.f32496z = str3;
        this.A = sVar;
        this.B = j11;
        this.C = sVar2;
        this.D = j12;
        this.E = sVar3;
    }
}
