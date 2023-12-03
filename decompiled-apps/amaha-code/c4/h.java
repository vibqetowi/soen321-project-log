package c4;

import android.text.TextUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f4922a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f4923b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4924c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4925d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4926e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4927g;

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f4928a;

        public a(JSONObject jSONObject) {
            jSONObject.optString("formattedPrice");
            jSONObject.optLong("priceAmountMicros");
            jSONObject.optString("priceCurrencyCode");
            this.f4928a = jSONObject.optString("offerIdToken");
            jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f4929a;

        /* renamed from: b  reason: collision with root package name */
        public final long f4930b;

        /* renamed from: c  reason: collision with root package name */
        public final String f4931c;

        public b(JSONObject jSONObject) {
            jSONObject.optString("billingPeriod");
            this.f4931c = jSONObject.optString("priceCurrencyCode");
            this.f4929a = jSONObject.optString("formattedPrice");
            this.f4930b = jSONObject.optLong("priceAmountMicros");
            jSONObject.optInt("recurrenceMode");
            jSONObject.optInt("billingCycleCount");
        }

        public final String a() {
            return this.f4929a;
        }

        public final long b() {
            return this.f4930b;
        }

        public final String c() {
            return this.f4931c;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f4932a;

        public c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.f4932a = arrayList;
        }

        public final ArrayList a() {
            return this.f4932a;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f4933a;

        /* renamed from: b  reason: collision with root package name */
        public final c f4934b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f4935c;

        public d(JSONObject jSONObject) {
            this.f4933a = jSONObject.getString("offerIdToken");
            this.f4934b = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            if (optJSONObject != null) {
                new df.b(optJSONObject);
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    arrayList.add(optJSONArray.getString(i6));
                }
            }
            this.f4935c = arrayList;
        }

        public final ArrayList a() {
            return this.f4935c;
        }

        public final String b() {
            return this.f4933a;
        }

        public final c c() {
            return this.f4934b;
        }
    }

    public h(String str) {
        this.f4922a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4923b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f4924c = optString;
        String optString2 = jSONObject.optString("type");
        this.f4925d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f4926e = jSONObject.optString("title");
                jSONObject.optString(SessionManager.KEY_NAME);
                jSONObject.optString("description");
                this.f = jSONObject.optString("skuDetailsToken");
                if (!optString2.equals("inapp")) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                    if (optJSONArray != null) {
                        for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                            arrayList.add(new d(optJSONArray.getJSONObject(i6)));
                        }
                    }
                    this.f4927g = arrayList;
                    return;
                }
                this.f4927g = null;
                return;
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final a a() {
        JSONObject optJSONObject = this.f4923b.optJSONObject("oneTimePurchaseOfferDetails");
        if (optJSONObject != null) {
            return new a(optJSONObject);
        }
        return null;
    }

    public final String b() {
        return this.f4924c;
    }

    public final ArrayList c() {
        return this.f4927g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return TextUtils.equals(this.f4922a, ((h) obj).f4922a);
    }

    public final int hashCode() {
        return this.f4922a.hashCode();
    }

    public final String toString() {
        String obj = this.f4923b.toString();
        String valueOf = String.valueOf(this.f4927g);
        return "ProductDetails{jsonString='" + this.f4922a + "', parsedJson=" + obj + ", productId='" + this.f4924c + "', productType='" + this.f4925d + "', title='" + this.f4926e + "', productDetailsToken='" + this.f + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
