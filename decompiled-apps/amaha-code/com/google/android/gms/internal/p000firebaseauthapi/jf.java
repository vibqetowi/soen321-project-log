package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import hc.d;
import org.json.JSONException;
import org.json.JSONObject;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jf  reason: invalid package */
/* loaded from: classes.dex */
public final class jf extends a implements ke<jf> {
    public static final Parcelable.Creator<jf> CREATOR = new kf();

    /* renamed from: u  reason: collision with root package name */
    public String f7922u;

    /* renamed from: v  reason: collision with root package name */
    public String f7923v;

    /* renamed from: w  reason: collision with root package name */
    public Long f7924w;

    /* renamed from: x  reason: collision with root package name */
    public String f7925x;

    /* renamed from: y  reason: collision with root package name */
    public Long f7926y;

    public jf() {
        this.f7926y = Long.valueOf(System.currentTimeMillis());
    }

    public static jf f0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jf jfVar = new jf();
            jfVar.f7922u = jSONObject.optString("refresh_token", null);
            jfVar.f7923v = jSONObject.optString("access_token", null);
            jfVar.f7924w = Long.valueOf(jSONObject.optLong("expires_in"));
            jfVar.f7925x = jSONObject.optString("token_type", null);
            jfVar.f7926y = Long.valueOf(jSONObject.optLong("issued_at"));
            return jfVar;
        } catch (JSONException e10) {
            Log.d("jf", "Failed to read GetTokenResponse from JSONObject");
            throw new zzqx(e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7922u = i.a(jSONObject.optString("refresh_token"));
            this.f7923v = i.a(jSONObject.optString("access_token"));
            this.f7924w = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.f7925x = i.a(jSONObject.optString("token_type"));
            this.f7926y = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw u.a("jf", str, e10);
        }
    }

    public final String g0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f7922u);
            jSONObject.put("access_token", this.f7923v);
            jSONObject.put("expires_in", this.f7924w);
            jSONObject.put("token_type", this.f7925x);
            jSONObject.put("issued_at", this.f7926y);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("jf", "Failed to convert GetTokenResponse to JSON");
            throw new zzqx(e10);
        }
    }

    public final boolean h0() {
        if (System.currentTimeMillis() + 300000 < (this.f7924w.longValue() * 1000) + this.f7926y.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        long longValue;
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7922u);
        d.x0(parcel, 3, this.f7923v);
        Long l2 = this.f7924w;
        if (l2 == null) {
            longValue = 0;
        } else {
            longValue = l2.longValue();
        }
        d.v0(parcel, 4, Long.valueOf(longValue));
        d.x0(parcel, 5, this.f7925x);
        d.v0(parcel, 6, Long.valueOf(this.f7926y.longValue()));
        d.C0(parcel, B0);
    }

    public jf(String str, String str2, Long l2, String str3) {
        this(str, str2, l2, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public jf(String str, String str2, Long l2, String str3, Long l10) {
        this.f7922u = str;
        this.f7923v = str2;
        this.f7924w = l2;
        this.f7925x = str3;
        this.f7926y = l10;
    }
}
