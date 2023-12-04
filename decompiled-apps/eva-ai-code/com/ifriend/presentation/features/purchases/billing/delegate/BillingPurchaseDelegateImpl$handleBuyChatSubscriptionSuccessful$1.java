package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifiend.billing.impl.manager.BillingManagerImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl", f = "BillingPurchaseDelegate.kt", i = {0, 0}, l = {297, 308}, m = "handleBuyChatSubscriptionSuccessful", n = {"this", BillingManagerImpl.PURCHASES_KEY}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, Continuation<? super BillingPurchaseDelegateImpl$handleBuyChatSubscriptionSuccessful$1> continuation) {
        super(continuation);
        this.this$0 = billingPurchaseDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleBuyChatSubscriptionSuccessful;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleBuyChatSubscriptionSuccessful = this.this$0.handleBuyChatSubscriptionSuccessful(null, this);
        return handleBuyChatSubscriptionSuccessful;
    }
}
