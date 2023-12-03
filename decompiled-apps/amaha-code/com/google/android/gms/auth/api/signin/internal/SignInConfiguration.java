package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hc.d;
import j9.r;
import v9.o;
import w9.a;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new r();

    /* renamed from: u  reason: collision with root package name */
    public final String f7239u;

    /* renamed from: v  reason: collision with root package name */
    public final GoogleSignInOptions f7240v;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        o.e(str);
        this.f7239u = str;
        this.f7240v = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f7239u.equals(signInConfiguration.f7239u)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f7240v;
            GoogleSignInOptions googleSignInOptions2 = this.f7240v;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 1 * 31;
        int i10 = 0;
        String str = this.f7239u;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i6 + hashCode) * 31;
        GoogleSignInOptions googleSignInOptions = this.f7240v;
        if (googleSignInOptions != null) {
            i10 = googleSignInOptions.hashCode();
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7239u);
        d.w0(parcel, 5, this.f7240v, i6);
        d.C0(parcel, B0);
    }
}
