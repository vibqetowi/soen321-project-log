package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g  reason: invalid package */
/* loaded from: classes.dex */
public final class g implements ke {

    /* renamed from: u  reason: collision with root package name */
    public e f7856u;

    /* renamed from: v  reason: collision with root package name */
    public String f7857v;

    /* renamed from: w  reason: collision with root package name */
    public String f7858w;

    /* renamed from: x  reason: collision with root package name */
    public long f7859x;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            i.a(jSONObject.optString(SessionManager.KEY_EMAIL, null));
            i.a(jSONObject.optString("passwordHash", null));
            jSONObject.optBoolean("emailVerified", false);
            i.a(jSONObject.optString("displayName", null));
            i.a(jSONObject.optString("photoUrl", null));
            this.f7856u = e.f0(jSONObject.optJSONArray("providerUserInfo"));
            this.f7857v = i.a(jSONObject.optString("idToken", null));
            this.f7858w = i.a(jSONObject.optString("refreshToken", null));
            this.f7859x = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw u.a("g", str, e10);
        }
    }
}
