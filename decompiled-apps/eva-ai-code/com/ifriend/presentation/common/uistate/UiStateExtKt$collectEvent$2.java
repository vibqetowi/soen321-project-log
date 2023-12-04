package com.ifriend.presentation.common.uistate;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: UiStateExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"State", "Event", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.uistate.UiStateExtKt$collectEvent$2", f = "UiStateExt.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UiStateExtKt$collectEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Event, Unit> $block;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ UiStateDelegate<State, Event> $this_collectEvent;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UiStateExtKt$collectEvent$2(UiStateDelegate<State, Event> uiStateDelegate, Lifecycle lifecycle, Lifecycle.State state, Function1<? super Event, Unit> function1, Continuation<? super UiStateExtKt$collectEvent$2> continuation) {
        super(2, continuation);
        this.$this_collectEvent = uiStateDelegate;
        this.$lifecycle = lifecycle;
        this.$lifecycleState = state;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UiStateExtKt$collectEvent$2(this.$this_collectEvent, this.$lifecycle, this.$lifecycleState, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UiStateExtKt$collectEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(this.$this_collectEvent.getSingleEvents(), this.$lifecycle, this.$lifecycleState);
            final Function1<Event, Unit> function1 = this.$block;
            this.label = 1;
            if (flowWithLifecycle.collect(new FlowCollector<Event>() { // from class: com.ifriend.presentation.common.uistate.UiStateExtKt$collectEvent$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Event event, Continuation<? super Unit> continuation) {
                    function1.invoke(event);
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
