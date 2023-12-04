package com.ifiend.billing.impl.manager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl", f = "BillingManagerImpl.kt", i = {0, 1, 2}, l = {204, 548, 228}, m = "startOneTimeConnection", n = {"this", "this", "result"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$startOneTimeConnection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$startOneTimeConnection$1(BillingManagerImpl billingManagerImpl, Continuation<? super BillingManagerImpl$startOneTimeConnection$1> continuation) {
        super(continuation);
        this.this$0 = billingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startOneTimeConnection;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startOneTimeConnection = this.this$0.startOneTimeConnection(this);
        return startOneTimeConnection;
    }
}
