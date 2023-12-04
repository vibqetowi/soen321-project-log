package com.ifiend.billing.impl.logic;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.logic.BillingInteractorImpl", f = "BillingInteractorImpl.kt", i = {0, 1}, l = {76, 78}, m = "startBillingConnection-IoAF18A", n = {"this", "result"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
public final class BillingInteractorImpl$startBillingConnection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingInteractorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingInteractorImpl$startBillingConnection$1(BillingInteractorImpl billingInteractorImpl, Continuation<? super BillingInteractorImpl$startBillingConnection$1> continuation) {
        super(continuation);
        this.this$0 = billingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo6782startBillingConnectionIoAF18A = this.this$0.mo6782startBillingConnectionIoAF18A(this);
        return mo6782startBillingConnectionIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo6782startBillingConnectionIoAF18A : Result.m7270boximpl(mo6782startBillingConnectionIoAF18A);
    }
}
