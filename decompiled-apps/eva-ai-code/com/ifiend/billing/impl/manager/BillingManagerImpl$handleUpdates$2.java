package com.ifiend.billing.impl.manager;

import com.android.billingclient.api.Purchase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BillingManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BillingManagerImpl$handleUpdates$2 extends Lambda implements Function1<Purchase, CharSequence> {
    public static final BillingManagerImpl$handleUpdates$2 INSTANCE = new BillingManagerImpl$handleUpdates$2();

    BillingManagerImpl$handleUpdates$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        String originalJson = purchase.getOriginalJson();
        Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
        return originalJson;
    }
}
