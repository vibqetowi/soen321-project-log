package q5;

import android.os.Bundle;
import android.util.Log;
import h5.g0;
import h5.p;
import i5.o;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
import w5.n;
/* compiled from: AutomaticAnalyticsLogger.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f29153a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final String f29154b = f.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static final o f29155c = new o(p.a());

    /* compiled from: AutomaticAnalyticsLogger.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final BigDecimal f29156a;

        /* renamed from: b  reason: collision with root package name */
        public final Currency f29157b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f29158c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f29156a = bigDecimal;
            this.f29157b = currency;
            this.f29158c = bundle;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
        if (r12 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String skuDetails, boolean z10) {
        boolean z11;
        a aVar;
        boolean z12;
        boolean z13;
        String str2;
        boolean z14;
        kotlin.jvm.internal.i.g(skuDetails, "skuDetails");
        w5.o b10 = w5.p.b(p.b());
        boolean z15 = true;
        boolean z16 = false;
        if (b10 != null && g0.b() && b10.f36517g) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        f29153a.getClass();
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(skuDetails);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (kotlin.jvm.internal.i.b(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                kotlin.jvm.internal.i.f(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            kotlin.jvm.internal.i.f(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            aVar = new a(bigDecimal, currency, bundle);
        } catch (JSONException e10) {
            Log.e(f29154b, "Error parsing in-app subscription data.", e10);
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        if (z10) {
            n nVar = n.f36507a;
            if (n.b("app_events_if_auto_log_subs", p.b(), false)) {
                z12 = true;
                o oVar = f29155c;
                Bundle bundle2 = aVar.f29158c;
                Currency currency2 = aVar.f29157b;
                BigDecimal bigDecimal2 = aVar.f29156a;
                if (!z12) {
                    o5.f fVar = o5.f.f27154a;
                    fVar.getClass();
                    if (!b6.a.b(fVar)) {
                        try {
                            String optString2 = new JSONObject(skuDetails).optString("freeTrialPeriod");
                            if (optString2 != null) {
                                if (optString2.length() > 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                        } catch (JSONException unused) {
                        } catch (Throwable th2) {
                            b6.a.a(fVar, th2);
                        }
                        z15 = false;
                        z16 = z15;
                    }
                    if (z16) {
                        str2 = "StartTrial";
                    } else {
                        str2 = "Subscribe";
                    }
                    String str3 = str2;
                    oVar.getClass();
                    p pVar = p.f17269a;
                    if (g0.b()) {
                        i5.i iVar = oVar.f19878a;
                        iVar.getClass();
                        if (!b6.a.b(iVar)) {
                            try {
                                if (bigDecimal2 != null && currency2 != null) {
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    Bundle bundle3 = bundle2;
                                    bundle3.putString("fb_currency", currency2.getCurrencyCode());
                                    iVar.e(str3, Double.valueOf(bigDecimal2.doubleValue()), bundle3, true, c.a());
                                    return;
                                }
                                e0 e0Var = e0.f36453a;
                                return;
                            } catch (Throwable th3) {
                                b6.a.a(iVar, th3);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                oVar.getClass();
                p pVar2 = p.f17269a;
                if (g0.b()) {
                    i5.i iVar2 = oVar.f19878a;
                    iVar2.getClass();
                    if (!b6.a.b(iVar2)) {
                        try {
                            iVar2.g(bigDecimal2, currency2, bundle2);
                            return;
                        } catch (Throwable th4) {
                            b6.a.a(iVar2, th4);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        z12 = false;
        o oVar2 = f29155c;
        Bundle bundle22 = aVar.f29158c;
        Currency currency22 = aVar.f29157b;
        BigDecimal bigDecimal22 = aVar.f29156a;
        if (!z12) {
        }
    }
}
