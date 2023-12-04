package com.ifriend.presentation.common.state;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"UiState", "State", "Event", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateKt$collectInternalState$1", f = "CombinedStateDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateKt$collectInternalState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<State, Continuation<? super Unit>, Object> $collector;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ CoroutineStart $start;
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_collectInternalState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombinedStateDelegateKt$collectInternalState$1(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, CoroutineStart coroutineStart, Function2<? super State, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super CombinedStateDelegateKt$collectInternalState$1> continuation) {
        super(2, continuation);
        this.$this_collectInternalState = combinedStateDelegate;
        this.$coroutineScope = coroutineScope;
        this.$start = coroutineStart;
        this.$collector = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CombinedStateDelegateKt$collectInternalState$1(this.$this_collectInternalState, this.$coroutineScope, this.$start, this.$collector, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CombinedStateDelegateKt$collectInternalState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InternalStateDelegate internalStateDelegate = this.$this_collectInternalState;
        BuildersKt.launch(this.$coroutineScope, EmptyCoroutineContext.INSTANCE, this.$start, new CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1(internalStateDelegate.getInternalStateFlow(internalStateDelegate), this.$collector, null));
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        InternalStateDelegate internalStateDelegate = this.$this_collectInternalState;
        BuildersKt.launch(this.$coroutineScope, EmptyCoroutineContext.INSTANCE, this.$start, new CombinedStateDelegateKt$collectInternalState$1$invokeSuspend$$inlined$collectIn$default$1(internalStateDelegate.getInternalStateFlow(internalStateDelegate), this.$collector, null));
        return Unit.INSTANCE;
    }
}
