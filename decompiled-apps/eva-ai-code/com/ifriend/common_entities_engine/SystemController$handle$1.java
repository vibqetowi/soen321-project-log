package com.ifriend.common_entities_engine;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.common_entities_engine.SystemController", f = "SystemController.kt", i = {}, l = {27}, m = "handle", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SystemController$handle$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SystemController<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemController$handle$1(SystemController<S> systemController, Continuation<? super SystemController$handle$1> continuation) {
        super(continuation);
        this.this$0 = systemController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handle(null, null, this);
    }
}
