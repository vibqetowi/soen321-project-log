package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifriend.common_utils.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl", f = "BillingPurchaseDelegate.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, HttpStatus.SC_REQUEST_TIMEOUT, 423, 428}, m = "trackPurchaseProductEvent", n = {"this", "billingPurchase", "this", "billingPurchase", Constants.PURCHASE_AMOUNT, "this", "billingPurchase", "shouldLogRegistrationEvent"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$trackPurchaseProductEvent$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$trackPurchaseProductEvent$1(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, Continuation<? super BillingPurchaseDelegateImpl$trackPurchaseProductEvent$1> continuation) {
        super(continuation);
        this.this$0 = billingPurchaseDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object trackPurchaseProductEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        trackPurchaseProductEvent = this.this$0.trackPurchaseProductEvent(null, this);
        return trackPurchaseProductEvent;
    }
}
