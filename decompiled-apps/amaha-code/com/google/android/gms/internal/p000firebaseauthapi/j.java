package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import hc.d;
import org.json.JSONObject;
import q.f;
import r1.b0;
import v9.o;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j  reason: invalid package */
/* loaded from: classes.dex */
public final class j extends a implements je {
    public static final Parcelable.Creator<j> CREATOR = new k();
    public final String A;
    public final String B;
    public final boolean C;
    public boolean D;
    public final String E;
    public final String F;
    public final String G;
    public String H;
    public boolean I;
    public final String J;

    /* renamed from: u  reason: collision with root package name */
    public final String f7894u;

    /* renamed from: v  reason: collision with root package name */
    public String f7895v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7896w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7897x;

    /* renamed from: y  reason: collision with root package name */
    public final String f7898y;

    /* renamed from: z  reason: collision with root package name */
    public final String f7899z;

    public j() {
        this.C = true;
        this.D = true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.je
    public final String S() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.D);
        jSONObject.put("returnSecureToken", this.C);
        String str = this.f7895v;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.A;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.H;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.J;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        String str5 = this.F;
        if (!TextUtils.isEmpty(str5)) {
            jSONObject.put("sessionId", str5);
        }
        String str6 = this.G;
        if (!TextUtils.isEmpty(str6)) {
            jSONObject.put("requestUri", str6);
        } else {
            String str7 = this.f7894u;
            if (str7 != null) {
                jSONObject.put("requestUri", str7);
            }
        }
        jSONObject.put("returnIdpCredential", this.I);
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7894u);
        d.x0(parcel, 3, this.f7895v);
        d.x0(parcel, 4, this.f7896w);
        d.x0(parcel, 5, this.f7897x);
        d.x0(parcel, 6, this.f7898y);
        d.x0(parcel, 7, this.f7899z);
        d.x0(parcel, 8, this.A);
        d.x0(parcel, 9, this.B);
        d.o0(parcel, 10, this.C);
        d.o0(parcel, 11, this.D);
        d.x0(parcel, 12, this.E);
        d.x0(parcel, 13, this.F);
        d.x0(parcel, 14, this.G);
        d.x0(parcel, 15, this.H);
        d.o0(parcel, 16, this.I);
        d.x0(parcel, 17, this.J);
        d.C0(parcel, B0);
    }

    public j(f fVar, String str) {
        o.h(fVar);
        String str2 = (String) fVar.f29104v;
        o.e(str2);
        this.F = str2;
        o.e(str);
        this.G = str;
        String str3 = (String) fVar.f29106x;
        o.e(str3);
        this.f7898y = str3;
        this.C = true;
        this.A = "providerId=".concat(String.valueOf(str3));
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f7894u = "http://localhost";
        this.f7896w = str;
        this.f7897x = str2;
        this.B = str4;
        this.E = str5;
        this.H = str6;
        this.J = str7;
        this.C = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str5)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        o.e(str3);
        this.f7898y = str3;
        this.f7899z = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append("id_token=");
            sb2.append(str);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append("access_token=");
            sb2.append(str2);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(null)) {
            sb2.append("identifier=null&");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb2.append("oauth_token_secret=");
            sb2.append(str4);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb2.append("code=");
            sb2.append(str5);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str8)) {
            sb2.append("nonce=");
            sb2.append(str8);
            sb2.append("&");
        }
        this.A = b0.b(sb2, "providerId=", str3);
        this.D = true;
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.f7894u = str;
        this.f7895v = str2;
        this.f7896w = str3;
        this.f7897x = str4;
        this.f7898y = str5;
        this.f7899z = str6;
        this.A = str7;
        this.B = str8;
        this.C = z10;
        this.D = z11;
        this.E = str9;
        this.F = str10;
        this.G = str11;
        this.H = str12;
        this.I = z12;
        this.J = str13;
    }
}
