package com.google.android.gms.internal.p000firebaseauthapi;

import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bf  reason: invalid package */
/* loaded from: classes.dex */
public final class bf implements ke {

    /* renamed from: u  reason: collision with root package name */
    public String f7734u;

    /* renamed from: v  reason: collision with root package name */
    public String f7735v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7736w;

    /* renamed from: x  reason: collision with root package name */
    public long f7737x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f7738y;

    /* renamed from: z  reason: collision with root package name */
    public String f7739z;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString(SessionManager.KEY_EMAIL, null);
            this.f7734u = jSONObject.optString("idToken", null);
            this.f7735v = jSONObject.optString("refreshToken", null);
            this.f7736w = jSONObject.optBoolean("isNewUser", false);
            this.f7737x = jSONObject.optLong("expiresIn", 0L);
            this.f7738y = a.f0(jSONObject.optJSONArray("mfaInfo"));
            this.f7739z = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw u.a("bf", str, e10);
        }
    }
}
