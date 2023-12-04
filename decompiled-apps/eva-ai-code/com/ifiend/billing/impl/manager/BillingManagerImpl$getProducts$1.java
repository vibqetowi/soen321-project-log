package com.ifiend.billing.impl.manager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl", f = "BillingManagerImpl.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4}, l = {549, 324, 325, 324, 325}, m = "getProducts", n = {"this", "productIds", "productType", "this", "productIds", "productType", "this", "productIds", "productType", "result", "this", "productType", "result"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$getProducts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$getProducts$1(BillingManagerImpl billingManagerImpl, Continuation<? super BillingManagerImpl$getProducts$1> continuation) {
        super(continuation);
        this.this$0 = billingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getProducts(null, null, this);
    }
}
