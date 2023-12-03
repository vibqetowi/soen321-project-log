package com.theinnerhour.b2b.utils;

import com.appsflyer.R;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.model.SkuModel;
import gv.r;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PaymentUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/utils/PaymentUtils;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getPriceDifferenceForPromo", "basePrice", "", "introPrice", "currency", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "getSubscriptionPeriod", "sku", "getSubscriptionType", "isSkuInPurchaseList", "", "slug", "mapSkuToObject", "Lcom/theinnerhour/b2b/model/SkuModel;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class PaymentUtils {
    public static final PaymentUtils INSTANCE;
    private static final String TAG;

    static {
        PaymentUtils paymentUtils = new PaymentUtils();
        INSTANCE = paymentUtils;
        TAG = LogHelper.INSTANCE.makeLogTag(paymentUtils.getClass());
    }

    private PaymentUtils() {
    }

    public final String getPriceDifferenceForPromo(Long l2, Long l10, String str) {
        if (l2 != null && l10 != null && str != null) {
            return str + ((l2.longValue() - l10.longValue()) / 1000000);
        }
        return "";
    }

    public final String getSubscriptionPeriod(String sku) {
        kotlin.jvm.internal.i.g(sku, "sku");
        return mapSkuToObject(sku).getSubscriptionPeriod();
    }

    public final String getSubscriptionType(String sku) {
        kotlin.jvm.internal.i.g(sku, "sku");
        return mapSkuToObject(sku).getSubscriptionType();
    }

    public final String getTAG() {
        return TAG;
    }

    public final boolean isSkuInPurchaseList(String slug) {
        String str;
        kotlin.jvm.internal.i.g(slug, "slug");
        if (gv.n.B0(pn.a.a("purchase_history"))) {
            return false;
        }
        Iterator it = r.a1(slug, new String[]{"&"}, 0, 6).iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (r.J0(str2, "offer")) {
                str = gv.n.F0(str2, "offer=", "");
                break;
            }
        }
        Object c10 = new sf.i().c(pn.a.a("purchase_history"), new TypeToken<ArrayList<String>>() { // from class: com.theinnerhour.b2b.utils.PaymentUtils$isSkuInPurchaseList$type$1
        }.getType());
        kotlin.jvm.internal.i.e(c10, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        return ((ArrayList) c10).contains(str);
    }

    public final SkuModel mapSkuToObject(String sku) {
        kotlin.jvm.internal.i.g(sku, "sku");
        String str = "";
        SkuModel skuModel = new SkuModel("", "", "");
        try {
            List a12 = r.a1(sku, new String[]{"_"}, 0, 6);
            String str2 = (String) u.j2(1, a12);
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) u.j2(2, a12);
            if (str3 == null) {
                str3 = "";
            }
            String str4 = (String) u.j2(3, a12);
            if (str4 != null) {
                str = gv.n.F0(str4, "discount", "");
            }
            return new SkuModel(str2, str3, str);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, e10);
            return skuModel;
        }
    }
}
