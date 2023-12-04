package com.ifiend.billing.impl.logic;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.ifiend.billing.impl.manager.BillingManagerImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.logic.BillingInteractorImpl", f = "BillingInteractorImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5}, l = {159, 174, 178, 180, PsExtractor.AUDIO_STREAM, 208}, m = "confirmPurchases", n = {"this", BillingManagerImpl.PURCHASES_KEY, "delayMillis", "this", BillingManagerImpl.PURCHASES_KEY, "results", "purchase", "delayMillis", "index$iv", "this", BillingManagerImpl.PURCHASES_KEY, "results", "purchase", "delayMillis", "index$iv", "this", BillingManagerImpl.PURCHASES_KEY, "results", "purchase", "delayMillis", "index$iv", "this", BillingManagerImpl.PURCHASES_KEY, "results", "delayMillis", "index$iv", "isSuccessful"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "L$4", "J$0", "I$0", "L$0", "L$1", "L$2", "L$4", "J$0", "I$0", "L$0", "L$1", "L$2", "L$4", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "I$0"})
/* loaded from: classes6.dex */
public final class BillingInteractorImpl$confirmPurchases$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingInteractorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingInteractorImpl$confirmPurchases$1(BillingInteractorImpl billingInteractorImpl, Continuation<? super BillingInteractorImpl$confirmPurchases$1> continuation) {
        super(continuation);
        this.this$0 = billingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object confirmPurchases;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmPurchases = this.this$0.confirmPurchases(null, 0L, this);
        return confirmPurchases;
    }
}
