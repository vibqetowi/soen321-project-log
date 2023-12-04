package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifiend.billing.impl.manager.BillingManagerImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl", f = "BillingPurchaseDelegate.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 5}, l = {270, 274, 276, 281, 285, 287, 291}, m = "buyChatMessages", n = {"this", "purchaseReason", BillingManagerImpl.PURCHASES_KEY, "this", "purchaseReason", BillingManagerImpl.PURCHASES_KEY, "this", "purchaseReason", BillingManagerImpl.PURCHASES_KEY, "this", BillingManagerImpl.PURCHASES_KEY, "this"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$buyChatMessages$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$buyChatMessages$1(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, Continuation<? super BillingPurchaseDelegateImpl$buyChatMessages$1> continuation) {
        super(continuation);
        this.this$0 = billingPurchaseDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object buyChatMessages;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        buyChatMessages = this.this$0.buyChatMessages(null, null, this);
        return buyChatMessages;
    }
}
