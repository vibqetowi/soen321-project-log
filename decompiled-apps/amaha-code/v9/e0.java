package v9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class e0 extends w9.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: u  reason: collision with root package name */
    public final int f34887u;

    /* renamed from: v  reason: collision with root package name */
    public final Account f34888v;

    /* renamed from: w  reason: collision with root package name */
    public final int f34889w;

    /* renamed from: x  reason: collision with root package name */
    public final GoogleSignInAccount f34890x;

    public e0(int i6, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f34887u = i6;
        this.f34888v = account;
        this.f34889w = i10;
        this.f34890x = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f34887u);
        hc.d.w0(parcel, 2, this.f34888v, i6);
        hc.d.s0(parcel, 3, this.f34889w);
        hc.d.w0(parcel, 4, this.f34890x, i6);
        hc.d.C0(parcel, B0);
    }
}
