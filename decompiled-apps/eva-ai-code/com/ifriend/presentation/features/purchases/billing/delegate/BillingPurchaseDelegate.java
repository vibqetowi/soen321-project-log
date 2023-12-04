package com.ifriend.presentation.features.purchases.billing.delegate;

import androidx.lifecycle.ViewModel;
import com.android.billingclient.api.BillingFlowParams;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.billing.api.models.RestorePurchasesResult;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import dagger.assisted.AssistedFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0012H&R\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate;", "", "billingPurchaseFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/purchases/billing/models/ProductPurchaseEvent;", "getBillingPurchaseFlow", "()Lkotlinx/coroutines/flow/Flow;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseProduct", "Lcom/ifriend/billing/api/models/BillingProduct;", "getPurchaseProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initPurchasesProductUpdates", "", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)V", "restoreBillingPurchases", "Lcom/ifriend/billing/api/models/RestorePurchasesResult;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BillingPurchaseDelegate {

    /* compiled from: BillingPurchaseDelegate.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;", "", "create", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegateImpl;", "billingPurchaseProductType", "Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        BillingPurchaseDelegateImpl create(BillingPurchaseProductType billingPurchaseProductType, PurchaseReason purchaseReason, PurchaseSource purchaseSource, String str);
    }

    Object getBillingFlowParams(String str, Continuation<? super BillingFlowParams> continuation);

    Flow<ProductPurchaseEvent> getBillingPurchaseFlow();

    Object getPurchaseProduct(String str, Continuation<? super BillingProduct> continuation);

    Object getPurchaseProducts(Continuation<? super List<BillingProduct>> continuation) throws Throwable;

    void initPurchasesProductUpdates(ViewModel viewModel);

    Object restoreBillingPurchases(Continuation<? super RestorePurchasesResult> continuation);
}
