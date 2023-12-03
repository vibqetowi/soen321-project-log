package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a  reason: collision with root package name */
    public final String f5858a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5859b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f5860c;

    public Purchase(String str, String str2) {
        this.f5858a = str;
        this.f5859b = str2;
        this.f5860c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f5860c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    arrayList.add(optJSONArray.optString(i6));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f5860c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.f5858a, purchase.f5858a) && TextUtils.equals(this.f5859b, purchase.f5859b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5858a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5858a));
    }
}
