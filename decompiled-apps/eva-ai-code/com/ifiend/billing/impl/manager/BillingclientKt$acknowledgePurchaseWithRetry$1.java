package com.ifiend.billing.impl.manager;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: billingclient.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingclientKt", f = "billingclient.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, 58}, m = "acknowledgePurchaseWithRetry", n = {"$this$acknowledgePurchaseWithRetry", "purchaseToken", "maxRetries", "retryDelayMillis", "errorResponseCode", "retryAttempt", "$this$acknowledgePurchaseWithRetry", "purchaseToken", "result", "maxRetries", "retryDelayMillis", "errorResponseCode", "retryAttempt"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2"})
/* loaded from: classes6.dex */
public final class BillingclientKt$acknowledgePurchaseWithRetry$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BillingclientKt$acknowledgePurchaseWithRetry$1(Continuation<? super BillingclientKt$acknowledgePurchaseWithRetry$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BillingclientKt.acknowledgePurchaseWithRetry(null, null, 0, 0L, 0, this);
    }
}
