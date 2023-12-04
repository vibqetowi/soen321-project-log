package com.ifiend.billing.impl.manager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl", f = "BillingManagerImpl.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9}, l = {127, 132, 549, 143, 148, 157, 143, 148, 157, 162}, m = "acknowledgePurchases", n = {"this", BillingManagerImpl.PURCHASES_KEY, "this", "purchase", "this", "purchase", "$this$acknowledgePurchases_u24lambda_u241", "this", "purchase", "$this$acknowledgePurchases_u24lambda_u241", "this", "purchase", "$this$acknowledgePurchases_u24lambda_u241", "this", "purchase", "$this$acknowledgePurchases_u24lambda_u241", "this", "purchase", "$this$acknowledgePurchases_u24lambda_u241", "this", "purchase", "this", "purchase", "this"}, s = {"L$0", "L$1", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$2", "L$0", "L$2", "L$0"})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$acknowledgePurchases$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$acknowledgePurchases$1(BillingManagerImpl billingManagerImpl, Continuation<? super BillingManagerImpl$acknowledgePurchases$1> continuation) {
        super(continuation);
        this.this$0 = billingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object acknowledgePurchases;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        acknowledgePurchases = this.this$0.acknowledgePurchases(null, this);
        return acknowledgePurchases;
    }
}
