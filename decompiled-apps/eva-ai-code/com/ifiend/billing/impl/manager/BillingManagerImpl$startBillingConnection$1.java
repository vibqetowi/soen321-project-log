package com.ifiend.billing.impl.manager;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl", f = "BillingManagerImpl.kt", i = {0}, l = {255}, m = "startBillingConnection-IoAF18A", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$startBillingConnection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$startBillingConnection$1(BillingManagerImpl billingManagerImpl, Continuation<? super BillingManagerImpl$startBillingConnection$1> continuation) {
        super(continuation);
        this.this$0 = billingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo6784startBillingConnectionIoAF18A = this.this$0.mo6784startBillingConnectionIoAF18A(this);
        return mo6784startBillingConnectionIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo6784startBillingConnectionIoAF18A : Result.m7270boximpl(mo6784startBillingConnectionIoAF18A);
    }
}
