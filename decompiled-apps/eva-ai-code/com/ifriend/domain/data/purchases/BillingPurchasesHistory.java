package com.ifriend.domain.data.purchases;

import com.ifriend.domain.logic.purchase.PurchaseType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BillingPurchasesHistory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;", "", "getPurchasesHistoryCount", "", "type", "Lcom/ifriend/domain/logic/purchase/PurchaseType;", "(Lcom/ifriend/domain/logic/purchase/PurchaseType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePurchase", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BillingPurchasesHistory {
    Object getPurchasesHistoryCount(PurchaseType purchaseType, Continuation<? super Integer> continuation);

    Object savePurchase(PurchaseType purchaseType, Continuation<? super Unit> continuation);
}
