package com.ifiend.billing.impl.manager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl", f = "BillingManagerImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4}, l = {426, 548, 460, 463, 468}, m = "connectToBillingClientWithRetry", n = {"this", "maxRetries", "delayInMillisForRetry", "retries", "isConnected", "this", "maxRetries", "delayInMillisForRetry", "retries", "this", "maxRetries", "delayInMillisForRetry", "retries", "isConnected", "this", "maxRetries", "delayInMillisForRetry", "retries", "isConnected", "isConnected"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "L$0", "I$0", "J$0", "I$1", "L$0", "I$0", "J$0", "I$1", "I$2", "L$0", "I$0", "J$0", "I$1", "I$2", "I$0"})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$connectToBillingClientWithRetry$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$connectToBillingClientWithRetry$1(BillingManagerImpl billingManagerImpl, Continuation<? super BillingManagerImpl$connectToBillingClientWithRetry$1> continuation) {
        super(continuation);
        this.this$0 = billingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object connectToBillingClientWithRetry;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        connectToBillingClientWithRetry = this.this$0.connectToBillingClientWithRetry(0, 0L, this);
        return connectToBillingClientWithRetry;
    }
}
