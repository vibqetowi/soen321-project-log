package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.theinnerhour.b2b.utils.SessionManager;
import hc.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e  reason: invalid package */
/* loaded from: classes.dex */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: u  reason: collision with root package name */
    public final List f7795u;

    public e() {
        this.f7795u = new ArrayList();
    }

    public static e f0(JSONArray jSONArray) {
        c cVar;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i6);
                if (jSONObject == null) {
                    cVar = new c();
                } else {
                    cVar = new c(i.a(jSONObject.optString("federatedId", null)), i.a(jSONObject.optString("displayName", null)), i.a(jSONObject.optString("photoUrl", null)), i.a(jSONObject.optString("providerId", null)), null, i.a(jSONObject.optString("phoneNumber", null)), i.a(jSONObject.optString(SessionManager.KEY_EMAIL, null)));
                }
                arrayList.add(cVar);
            }
            return new e(arrayList);
        }
        return new e(new ArrayList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.A0(parcel, 2, this.f7795u);
        d.C0(parcel, B0);
    }

    public e(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f7795u = Collections.unmodifiableList(arrayList);
        } else {
            this.f7795u = Collections.emptyList();
        }
    }
}
