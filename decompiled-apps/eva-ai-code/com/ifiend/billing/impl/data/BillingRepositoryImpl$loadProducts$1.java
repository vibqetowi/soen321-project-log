package com.ifiend.billing.impl.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.data.BillingRepositoryImpl", f = "BillingRepositoryImpl.kt", i = {0, 1, 1, 1, 2, 2, 2}, l = {47, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "loadProducts", n = {"this", "this", "serverProducts", "ids", "this", "serverProducts", "resultInApp"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class BillingRepositoryImpl$loadProducts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepositoryImpl$loadProducts$1(BillingRepositoryImpl billingRepositoryImpl, Continuation<? super BillingRepositoryImpl$loadProducts$1> continuation) {
        super(continuation);
        this.this$0 = billingRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadProducts;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadProducts = this.this$0.loadProducts(this);
        return loadProducts;
    }
}
