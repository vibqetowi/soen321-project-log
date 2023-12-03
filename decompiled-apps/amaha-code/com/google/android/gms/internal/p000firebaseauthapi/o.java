package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import org.json.JSONException;
import org.json.JSONObject;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o  reason: invalid package */
/* loaded from: classes.dex */
public final class o extends a implements ke<o> {
    public static final Parcelable.Creator<o> CREATOR = new p();

    /* renamed from: u  reason: collision with root package name */
    public String f8017u;

    /* renamed from: v  reason: collision with root package name */
    public String f8018v;

    /* renamed from: w  reason: collision with root package name */
    public long f8019w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8020x;

    public o() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8017u = i.a(jSONObject.optString("idToken", null));
            this.f8018v = i.a(jSONObject.optString("refreshToken", null));
            this.f8019w = jSONObject.optLong("expiresIn", 0L);
            this.f8020x = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw u.a("o", str, e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f8017u);
        d.x0(parcel, 3, this.f8018v);
        d.u0(parcel, 4, this.f8019w);
        d.o0(parcel, 5, this.f8020x);
        d.C0(parcel, B0);
    }

    public o(String str, String str2, long j10, boolean z10) {
        this.f8017u = str;
        this.f8018v = str2;
        this.f8019w = j10;
        this.f8020x = z10;
    }
}
