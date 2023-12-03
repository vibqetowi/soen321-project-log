package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import android.text.TextUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import fd.x;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m  reason: invalid package */
/* loaded from: classes.dex */
public final class m implements ke {
    public String A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public ArrayList I;
    public String J;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7970u;

    /* renamed from: v  reason: collision with root package name */
    public String f7971v;

    /* renamed from: w  reason: collision with root package name */
    public String f7972w;

    /* renamed from: x  reason: collision with root package name */
    public long f7973x;

    /* renamed from: y  reason: collision with root package name */
    public String f7974y;

    /* renamed from: z  reason: collision with root package name */
    public String f7975z;

    public final x a() {
        if (TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.D)) {
            return null;
        }
        String str = this.f7975z;
        String str2 = this.D;
        String str3 = this.C;
        String str4 = this.G;
        String str5 = this.E;
        o.f("Must specify a non-empty providerId", str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new x(str, str2, str3, null, str4, str5, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7970u = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f7971v = i.a(jSONObject.optString("idToken", null));
            this.f7972w = i.a(jSONObject.optString("refreshToken", null));
            this.f7973x = jSONObject.optLong("expiresIn", 0L);
            i.a(jSONObject.optString("localId", null));
            this.f7974y = i.a(jSONObject.optString(SessionManager.KEY_EMAIL, null));
            i.a(jSONObject.optString("displayName", null));
            i.a(jSONObject.optString("photoUrl", null));
            this.f7975z = i.a(jSONObject.optString("providerId", null));
            this.A = i.a(jSONObject.optString("rawUserInfo", null));
            this.B = jSONObject.optBoolean("isNewUser", false);
            this.C = jSONObject.optString("oauthAccessToken", null);
            this.D = jSONObject.optString("oauthIdToken", null);
            this.F = i.a(jSONObject.optString("errorMessage", null));
            this.G = i.a(jSONObject.optString("pendingToken", null));
            this.H = i.a(jSONObject.optString("tenantId", null));
            this.I = a.f0(jSONObject.optJSONArray("mfaInfo"));
            this.J = i.a(jSONObject.optString("mfaPendingCredential", null));
            this.E = i.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw u.a("m", str, e10);
        }
    }
}
