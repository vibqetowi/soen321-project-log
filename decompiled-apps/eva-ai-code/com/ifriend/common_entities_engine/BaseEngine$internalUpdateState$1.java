package com.ifriend.common_entities_engine;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseEngine.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.common_entities_engine.BaseEngine", f = "BaseEngine.kt", i = {0, 0, 0}, l = {99}, m = "internalUpdateState", n = {"this", "state", "system"}, s = {"L$0", "L$1", "L$3"})
/* loaded from: classes6.dex */
public final class BaseEngine$internalUpdateState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseEngine<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEngine$internalUpdateState$1(BaseEngine<S> baseEngine, Continuation<? super BaseEngine$internalUpdateState$1> continuation) {
        super(continuation);
        this.this$0 = baseEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object internalUpdateState;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        internalUpdateState = this.this$0.internalUpdateState(this);
        return internalUpdateState;
    }
}
