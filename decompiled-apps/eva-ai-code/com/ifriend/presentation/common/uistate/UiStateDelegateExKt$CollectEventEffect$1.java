package com.ifriend.presentation.common.uistate;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: UiStateDelegateEx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"State", "Event", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.uistate.UiStateDelegateExKt$CollectEventEffect$1", f = "UiStateDelegateEx.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UiStateDelegateExKt$CollectEventEffect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector<Event> $collector;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ UiStateDelegate<State, Event> $this_CollectEventEffect;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UiStateDelegateExKt$CollectEventEffect$1(UiStateDelegate<State, Event> uiStateDelegate, LifecycleOwner lifecycleOwner, Lifecycle.State state, FlowCollector<? super Event> flowCollector, Continuation<? super UiStateDelegateExKt$CollectEventEffect$1> continuation) {
        super(2, continuation);
        this.$this_CollectEventEffect = uiStateDelegate;
        this.$lifecycleOwner = lifecycleOwner;
        this.$lifecycleState = state;
        this.$collector = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UiStateDelegateExKt$CollectEventEffect$1(this.$this_CollectEventEffect, this.$lifecycleOwner, this.$lifecycleState, this.$collector, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UiStateDelegateExKt$CollectEventEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowExtKt.flowWithLifecycle(this.$this_CollectEventEffect.getSingleEvents(), this.$lifecycleOwner.getLifecycle(), this.$lifecycleState).collect(this.$collector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
