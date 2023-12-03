package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hc.d;
import i9.g;
import v9.o;
import w9.a;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
    @Deprecated

    /* renamed from: u  reason: collision with root package name */
    public final String f7236u;

    /* renamed from: v  reason: collision with root package name */
    public final GoogleSignInAccount f7237v;
    @Deprecated

    /* renamed from: w  reason: collision with root package name */
    public final String f7238w;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f7237v = googleSignInAccount;
        o.f("8.3 and 8.4 SDKs require non-null email", str);
        this.f7236u = str;
        o.f("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f7238w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 4, this.f7236u);
        d.w0(parcel, 7, this.f7237v, i6);
        d.x0(parcel, 8, this.f7238w);
        d.C0(parcel, B0);
    }
}
