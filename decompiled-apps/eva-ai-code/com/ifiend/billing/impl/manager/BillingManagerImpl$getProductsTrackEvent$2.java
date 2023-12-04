package com.ifiend.billing.impl.manager;

import com.android.billingclient.api.ProductDetails;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BillingManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "product", "Lcom/android/billingclient/api/ProductDetails;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BillingManagerImpl$getProductsTrackEvent$2 extends Lambda implements Function1<ProductDetails, CharSequence> {
    public static final BillingManagerImpl$getProductsTrackEvent$2 INSTANCE = new BillingManagerImpl$getProductsTrackEvent$2();

    BillingManagerImpl$getProductsTrackEvent$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(ProductDetails product) {
        Intrinsics.checkNotNullParameter(product, "product");
        String productDetails = product.toString();
        Intrinsics.checkNotNullExpressionValue(productDetails, "toString(...)");
        return productDetails;
    }
}
