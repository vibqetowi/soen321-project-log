package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.if  reason: invalid class name and invalid package */
/* loaded from: classes.dex */
public final class Cif implements ke {

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f7893u;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7893u = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    this.f7893u.add(optJSONArray.getString(i6));
                }
            }
        } catch (JSONException e10) {
            throw u.a("if", str, e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        a(str);
        return this;
    }
}
