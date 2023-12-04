package com.ifiend.billing.impl.data;

import com.google.zxing.pdf417.PDF417Common;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.data.BillingRepositoryImpl", f = "BillingRepositoryImpl.kt", i = {0, 0, 1, 1, 2}, l = {83, 85, PDF417Common.MAX_ROWS_IN_BARCODE}, m = "getProduct", n = {"this", "productId", "this", "productId", "productId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class BillingRepositoryImpl$getProduct$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepositoryImpl$getProduct$1(BillingRepositoryImpl billingRepositoryImpl, Continuation<? super BillingRepositoryImpl$getProduct$1> continuation) {
        super(continuation);
        this.this$0 = billingRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getProduct(null, this);
    }
}
