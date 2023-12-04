package com.ifriend.domain.services.initialData;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialTimeoutDataLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.services.initialData.InitialTimeoutDataLoader", f = "InitialTimeoutDataLoader.kt", i = {0, 0}, l = {57}, m = "run", n = {"this", "$this$run"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class InitialTimeoutDataLoader$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitialTimeoutDataLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialTimeoutDataLoader$run$1(InitialTimeoutDataLoader initialTimeoutDataLoader, Continuation<? super InitialTimeoutDataLoader$run$1> continuation) {
        super(continuation);
        this.this$0 = initialTimeoutDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object run;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        run = this.this$0.run(null, this);
        return run;
    }
}
