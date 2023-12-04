package com.ifiend.billing.impl.logic.repository;

import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
/* compiled from: BillingRepository.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifiend/billing/impl/logic/repository/BillingRepository;", "", "confirmPurchase", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "(Lcom/android/billingclient/api/Purchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProducts", "", "Lcom/ifriend/billing/api/models/BillingProduct;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "product", "Lcom/android/billingclient/api/ProductDetails;", "productType", "Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "(Lcom/android/billingclient/api/ProductDetails;Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProduct", "productId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchases", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BillingRepository {
    Object confirmPurchase(Purchase purchase, Continuation<? super Boolean> continuation);

    Object fetchProducts(Continuation<? super List<BillingProduct>> continuation);

    Object getBillingFlowParams(ProductDetails productDetails, BillingPurchaseProductType billingPurchaseProductType, Continuation<? super BillingFlowParams> continuation);

    Object getProduct(String str, Continuation<? super BillingProduct> continuation);

    Object getPurchases(Continuation<? super List<? extends Purchase>> continuation);
}
