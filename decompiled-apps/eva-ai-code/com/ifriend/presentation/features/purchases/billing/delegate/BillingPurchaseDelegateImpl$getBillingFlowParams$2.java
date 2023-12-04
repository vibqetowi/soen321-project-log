package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegateImpl$PurchaseState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$getBillingFlowParams$2 extends Lambda implements Function1<BillingPurchaseDelegateImpl.PurchaseState, BillingPurchaseDelegateImpl.PurchaseState> {
    final /* synthetic */ String $productId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$getBillingFlowParams$2(String str) {
        super(1);
        this.$productId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BillingPurchaseDelegateImpl.PurchaseState invoke(BillingPurchaseDelegateImpl.PurchaseState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.copy(this.$productId);
    }
}
