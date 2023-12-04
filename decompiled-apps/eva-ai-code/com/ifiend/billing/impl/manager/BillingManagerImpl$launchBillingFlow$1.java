package com.ifiend.billing.impl.manager;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl", f = "BillingManagerImpl.kt", i = {0, 0, 0, 1, 1, 1}, l = {272, 275, 277, 286}, m = "launchBillingFlow-0E7RQCE", n = {"this", "activity", NativeProtocol.WEB_DIALOG_PARAMS, "this", "activity", NativeProtocol.WEB_DIALOG_PARAMS}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$launchBillingFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$launchBillingFlow$1(BillingManagerImpl billingManagerImpl, Continuation<? super BillingManagerImpl$launchBillingFlow$1> continuation) {
        super(continuation);
        this.this$0 = billingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo6783launchBillingFlow0E7RQCE = this.this$0.mo6783launchBillingFlow0E7RQCE(null, null, this);
        return mo6783launchBillingFlow0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo6783launchBillingFlow0E7RQCE : Result.m7270boximpl(mo6783launchBillingFlow0E7RQCE);
    }
}
