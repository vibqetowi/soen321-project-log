package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r  reason: invalid package */
/* loaded from: classes.dex */
public final class r implements ke {

    /* renamed from: u  reason: collision with root package name */
    public String f8096u;

    /* renamed from: v  reason: collision with root package name */
    public String f8097v;

    /* renamed from: w  reason: collision with root package name */
    public long f8098w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f8099x;

    /* renamed from: y  reason: collision with root package name */
    public String f8100y;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            i.a(jSONObject.optString("localId", null));
            i.a(jSONObject.optString(SessionManager.KEY_EMAIL, null));
            i.a(jSONObject.optString("displayName", null));
            this.f8096u = i.a(jSONObject.optString("idToken", null));
            i.a(jSONObject.optString("photoUrl", null));
            this.f8097v = i.a(jSONObject.optString("refreshToken", null));
            this.f8098w = jSONObject.optLong("expiresIn", 0L);
            this.f8099x = a.f0(jSONObject.optJSONArray("mfaInfo"));
            this.f8100y = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw u.a("r", str, e10);
        }
    }
}
