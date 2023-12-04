package com.ifiend.billing.impl.logic;

import com.ifiend.billing.impl.manager.BillingManagerImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.logic.BillingInteractorImpl", f = "BillingInteractorImpl.kt", i = {0, 1, 2, 2, 3}, l = {144, 145, 147, 150}, m = "restorePurchases", n = {"this", "this", "this", BillingManagerImpl.PURCHASES_KEY, BillingManagerImpl.PURCHASES_KEY}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class BillingInteractorImpl$restorePurchases$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingInteractorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingInteractorImpl$restorePurchases$1(BillingInteractorImpl billingInteractorImpl, Continuation<? super BillingInteractorImpl$restorePurchases$1> continuation) {
        super(continuation);
        this.this$0 = billingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.restorePurchases(this);
    }
}
