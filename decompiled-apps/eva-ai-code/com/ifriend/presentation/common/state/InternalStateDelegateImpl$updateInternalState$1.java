package com.ifriend.presentation.common.state;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InternalStateDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.common.state.InternalStateDelegateImpl", f = "InternalStateDelegate.kt", i = {0, 0, 0}, l = {80}, m = "updateInternalState", n = {"this", "transform", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class InternalStateDelegateImpl$updateInternalState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InternalStateDelegateImpl<State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalStateDelegateImpl$updateInternalState$1(InternalStateDelegateImpl<State> internalStateDelegateImpl, Continuation<? super InternalStateDelegateImpl$updateInternalState$1> continuation) {
        super(continuation);
        this.this$0 = internalStateDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateInternalState(null, null, this);
    }
}
