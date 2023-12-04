package com.ifriend.presentation.features.purchases.billing.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl", f = "BillingPurchaseDelegate.kt", i = {0}, l = {398, 402}, m = "restoreBillingPurchases", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$restoreBillingPurchases$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$restoreBillingPurchases$1(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, Continuation<? super BillingPurchaseDelegateImpl$restoreBillingPurchases$1> continuation) {
        super(continuation);
        this.this$0 = billingPurchaseDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.restoreBillingPurchases(this);
    }
}
