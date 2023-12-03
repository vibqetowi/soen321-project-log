package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.theinnerhour.b2b.utils.SessionManager;
import hc.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cf  reason: invalid package */
/* loaded from: classes.dex */
public final class cf extends a implements ke<cf> {
    public static final Parcelable.Creator<cf> CREATOR = new df();

    /* renamed from: u  reason: collision with root package name */
    public gf f7767u;

    public cf() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ke
    public final /* bridge */ /* synthetic */ ke e(String str) {
        gf gfVar;
        int i6;
        ef efVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("users")) {
                this.f7767u = new gf();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        if (jSONObject2 == null) {
                            efVar = new ef();
                            i6 = i10;
                        } else {
                            i6 = i10;
                            efVar = new ef(i.a(jSONObject2.optString("localId", null)), i.a(jSONObject2.optString(SessionManager.KEY_EMAIL, null)), jSONObject2.optBoolean("emailVerified", z10), i.a(jSONObject2.optString("displayName", null)), i.a(jSONObject2.optString("photoUrl", null)), e.f0(jSONObject2.optJSONArray("providerUserInfo")), i.a(jSONObject2.optString("rawPassword", null)), i.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, a.f0(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(efVar);
                        i10 = i6 + 1;
                        z10 = false;
                    }
                    gfVar = new gf(arrayList);
                    this.f7767u = gfVar;
                }
                gfVar = new gf(new ArrayList());
                this.f7767u = gfVar;
            }
            return this;
        } catch (NullPointerException e10) {
            e = e10;
            throw u.a("cf", str, e);
        } catch (JSONException e11) {
            e = e11;
            throw u.a("cf", str, e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.w0(parcel, 2, this.f7767u, i6);
        d.C0(parcel, B0);
    }

    public cf(gf gfVar) {
        gf gfVar2;
        if (gfVar == null) {
            gfVar2 = new gf();
        } else {
            gf gfVar3 = new gf();
            List list = gfVar.f7866u;
            if (list != null && !list.isEmpty()) {
                gfVar3.f7866u.addAll(list);
            }
            gfVar2 = gfVar3;
        }
        this.f7767u = gfVar2;
    }
}
