package com.ifriend.billing.api.logic;

import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.Purchase;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.billing.api.models.BillingProductFilter;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.billing.api.models.BillingPurchasesResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
/* compiled from: BillingInteractor.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0015\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lcom/ifriend/billing/api/logic/BillingInteractor;", "", "billingProductUpdatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/billing/api/models/BillingPurchasesResult;", "getBillingProductUpdatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "getAppProducts", "", "Lcom/ifriend/billing/api/models/BillingProduct;", "productType", "Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "(Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "productId", "", "(Ljava/lang/String;Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProduct", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "filter", "Lcom/ifriend/billing/api/models/BillingProductFilter;", "(Lcom/ifriend/billing/api/models/BillingProductFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restorePurchases", "Lcom/android/billingclient/api/Purchase;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startBillingConnection", "Lkotlin/Result;", "", "startBillingConnection-IoAF18A", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BillingInteractor {
    Object getAppProducts(BillingPurchaseProductType billingPurchaseProductType, Continuation<? super List<BillingProduct>> continuation);

    Object getBillingFlowParams(String str, BillingPurchaseProductType billingPurchaseProductType, Continuation<? super BillingFlowParams> continuation);

    Flow<BillingPurchasesResult> getBillingProductUpdatesFlow();

    Object getProduct(String str, Continuation<? super BillingProduct> continuation);

    Object getProducts(BillingProductFilter billingProductFilter, Continuation<? super List<BillingProduct>> continuation);

    Object restorePurchases(Continuation<? super List<? extends Purchase>> continuation);

    /* renamed from: startBillingConnection-IoAF18A */
    Object mo6782startBillingConnectionIoAF18A(Continuation<? super Result<Unit>> continuation);
}
