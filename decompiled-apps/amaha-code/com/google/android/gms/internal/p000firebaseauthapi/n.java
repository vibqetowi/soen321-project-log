package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n  reason: invalid package */
/* loaded from: classes.dex */
public final class n implements je {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f7991u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7992v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7993w;

    public n(String str) {
        this.f7991u = 1;
        this.f7992v = "refresh_token";
        o.e(str);
        this.f7993w = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.je
    public final String S() {
        int i6 = this.f7991u;
        String str = this.f7993w;
        String str2 = this.f7992v;
        switch (i6) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str2);
                jSONObject.put("returnSecureToken", true);
                if (str != null) {
                    jSONObject.put("tenantId", str);
                }
                return jSONObject.toString();
            default:
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("grantType", str2);
                jSONObject2.put("refreshToken", str);
                return jSONObject2.toString();
        }
    }

    public n(String str, String str2) {
        this.f7991u = 0;
        o.e(str);
        this.f7992v = str;
        this.f7993w = str2;
    }
}
