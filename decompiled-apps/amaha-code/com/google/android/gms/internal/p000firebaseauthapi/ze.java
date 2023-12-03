package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ze  reason: invalid package */
/* loaded from: classes.dex */
public final class ze implements ke {

    /* renamed from: u  reason: collision with root package name */
    public String f8296u;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f8296u = jSONObject.getString("message");
        } catch (NullPointerException | JSONException e10) {
            String message = e10.getMessage();
            Log.e("com.google.android.gms.internal.firebase-auth-api.ze", "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new zzvg(b.m("Failed to parse error for string [", str, "]"), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        a(str);
        return this;
    }
}
