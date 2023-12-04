package com.ifriend.presentation.features.purchases.billing.ext;

import com.ifriend.billing.api.models.BillingProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: billingproduct.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"getAmountFromProductId", "", "Lcom/ifriend/billing/api/models/BillingProduct;", "getAmountFromProductIdSafe", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingproductKt {
    public static final int getAmountFromProductId(BillingProduct billingProduct) {
        Intrinsics.checkNotNullParameter(billingProduct, "<this>");
        return Integer.parseInt((String) StringsKt.split$default((CharSequence) StringsKt.split$default((CharSequence) billingProduct.getProductId(), new String[]{".coinpack"}, false, 0, 6, (Object) null).get(1), new String[]{"."}, false, 0, 6, (Object) null).get(0));
    }

    public static final int getAmountFromProductIdSafe(BillingProduct billingProduct) {
        Intrinsics.checkNotNullParameter(billingProduct, "<this>");
        try {
            return getAmountFromProductId(billingProduct);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
