package com.ifiend.billing.impl.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.data.BillingRepositoryImpl", f = "BillingRepositoryImpl.kt", i = {0, 0, 1, 1}, l = {145, 150, 152}, m = "getReceipt", n = {"this", "purchase", "this", "purchase"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class BillingRepositoryImpl$getReceipt$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepositoryImpl$getReceipt$1(BillingRepositoryImpl billingRepositoryImpl, Continuation<? super BillingRepositoryImpl$getReceipt$1> continuation) {
        super(continuation);
        this.this$0 = billingRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object receipt;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        receipt = this.this$0.getReceipt(null, this);
        return receipt;
    }
}
