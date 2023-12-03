package fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.zd;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class x extends l {
    public static final Parcelable.Creator<x> CREATOR = new y();
    public final String A;

    /* renamed from: u  reason: collision with root package name */
    public final String f14972u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14973v;

    /* renamed from: w  reason: collision with root package name */
    public final String f14974w;

    /* renamed from: x  reason: collision with root package name */
    public final com.google.android.gms.internal.p000firebaseauthapi.j f14975x;

    /* renamed from: y  reason: collision with root package name */
    public final String f14976y;

    /* renamed from: z  reason: collision with root package name */
    public final String f14977z;

    public x(String str, String str2, String str3, com.google.android.gms.internal.p000firebaseauthapi.j jVar, String str4, String str5, String str6) {
        int i6 = zd.f8295a;
        this.f14972u = str == null ? "" : str;
        this.f14973v = str2;
        this.f14974w = str3;
        this.f14975x = jVar;
        this.f14976y = str4;
        this.f14977z = str5;
        this.A = str6;
    }

    public static x g0(com.google.android.gms.internal.p000firebaseauthapi.j jVar) {
        if (jVar != null) {
            return new x(null, null, null, jVar, null, null, null);
        }
        throw new NullPointerException("Must specify a non-null webSignInCredential");
    }

    public final b f0() {
        return new x(this.f14972u, this.f14973v, this.f14974w, this.f14975x, this.f14976y, this.f14977z, this.A);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14972u);
        hc.d.x0(parcel, 2, this.f14973v);
        hc.d.x0(parcel, 3, this.f14974w);
        hc.d.w0(parcel, 4, this.f14975x, i6);
        hc.d.x0(parcel, 5, this.f14976y);
        hc.d.x0(parcel, 6, this.f14977z);
        hc.d.x0(parcel, 7, this.A);
        hc.d.C0(parcel, B0);
    }
}
