package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t  reason: invalid package */
/* loaded from: classes.dex */
public final class t implements ke {

    /* renamed from: u  reason: collision with root package name */
    public String f8138u;

    /* renamed from: v  reason: collision with root package name */
    public String f8139v;

    /* renamed from: w  reason: collision with root package name */
    public long f8140w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8141x;

    /* renamed from: y  reason: collision with root package name */
    public String f8142y;

    /* renamed from: z  reason: collision with root package name */
    public String f8143z;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f8138u = i.a(jSONObject.optString("idToken", null));
            this.f8139v = i.a(jSONObject.optString("refreshToken", null));
            this.f8140w = jSONObject.optLong("expiresIn", 0L);
            i.a(jSONObject.optString("localId", null));
            this.f8141x = jSONObject.optBoolean("isNewUser", false);
            this.f8142y = i.a(jSONObject.optString("temporaryProof", null));
            this.f8143z = i.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw u.a("t", str, e10);
        }
    }
}
