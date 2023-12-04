package com.ifiend.billing.impl.logic;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppLaunchBillingFlowImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.logic.AppLaunchBillingFlowImpl", f = "AppLaunchBillingFlowImpl.kt", i = {}, l = {16}, m = "launchBillingFlow-0E7RQCE", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppLaunchBillingFlowImpl$launchBillingFlow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppLaunchBillingFlowImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLaunchBillingFlowImpl$launchBillingFlow$1(AppLaunchBillingFlowImpl appLaunchBillingFlowImpl, Continuation<? super AppLaunchBillingFlowImpl$launchBillingFlow$1> continuation) {
        super(continuation);
        this.this$0 = appLaunchBillingFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo6781launchBillingFlow0E7RQCE = this.this$0.mo6781launchBillingFlow0E7RQCE(null, null, this);
        return mo6781launchBillingFlow0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo6781launchBillingFlow0E7RQCE : Result.m7270boximpl(mo6781launchBillingFlow0E7RQCE);
    }
}
