package com.ifriend.infrastructure.connectivity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InternetConnectionImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.infrastructure.connectivity.InternetConnectionImpl", f = "InternetConnectionImpl.kt", i = {}, l = {193}, m = "getLastKnowConnectivityState", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InternetConnectionImpl$getLastKnowConnectivityState$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InternetConnectionImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetConnectionImpl$getLastKnowConnectivityState$1(InternetConnectionImpl internetConnectionImpl, Continuation<? super InternetConnectionImpl$getLastKnowConnectivityState$1> continuation) {
        super(continuation);
        this.this$0 = internetConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getLastKnowConnectivityState(this);
    }
}
