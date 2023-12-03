package fd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class m extends b implements Cloneable {
    public static final Parcelable.Creator<m> CREATOR = new t();
    public final String A;

    /* renamed from: u  reason: collision with root package name */
    public final String f14959u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14960v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f14961w;

    /* renamed from: x  reason: collision with root package name */
    public final String f14962x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14963y;

    /* renamed from: z  reason: collision with root package name */
    public final String f14964z;

    public m(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11) {
        boolean z12;
        if ((z10 && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z10 && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z12 = true;
        } else {
            z12 = false;
        }
        v9.o.a("Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.", z12);
        this.f14959u = str;
        this.f14960v = str2;
        this.f14961w = z10;
        this.f14962x = str3;
        this.f14963y = z11;
        this.f14964z = str4;
        this.A = str5;
    }

    public final Object clone() {
        String str = this.f14959u;
        String str2 = this.f14960v;
        boolean z10 = this.f14961w;
        return new m(str, str2, this.f14962x, this.f14964z, this.A, z10, this.f14963y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14959u);
        hc.d.x0(parcel, 2, this.f14960v);
        hc.d.o0(parcel, 3, this.f14961w);
        hc.d.x0(parcel, 4, this.f14962x);
        hc.d.o0(parcel, 5, this.f14963y);
        hc.d.x0(parcel, 6, this.f14964z);
        hc.d.x0(parcel, 7, this.A);
        hc.d.C0(parcel, B0);
    }
}
