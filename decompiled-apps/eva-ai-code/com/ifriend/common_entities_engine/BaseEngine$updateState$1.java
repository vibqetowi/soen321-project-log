package com.ifriend.common_entities_engine;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseEngine.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.common_entities_engine.BaseEngine", f = "BaseEngine.kt", i = {0, 0, 1}, l = {156, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "updateState", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class BaseEngine$updateState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseEngine<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEngine$updateState$1(BaseEngine<S> baseEngine, Continuation<? super BaseEngine$updateState$1> continuation) {
        super(continuation);
        this.this$0 = baseEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateState;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateState = this.this$0.updateState(this);
        return updateState;
    }
}
