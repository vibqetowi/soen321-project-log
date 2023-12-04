package com.ifriend.chat.presentation.ui.rateApp;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ifriend.ui.base.mvvm.BaseEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: CoroutineUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/ui/utils/CoroutineUtilsKt$launchWithLifecycle$$inlined$launchWithLifecycle$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.utils.CoroutineUtilsKt$launchWithLifecycle$1", f = "CoroutineUtils.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RateAppFragment$onViewCreated$$inlined$launchWithLifecycle$default$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $action;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ Flow $this_launchWithLifecycle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppFragment$onViewCreated$$inlined$launchWithLifecycle$default$2(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_launchWithLifecycle = flow;
        this.$lifecycleOwner = lifecycleOwner;
        this.$minActiveState = state;
        this.$action = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RateAppFragment$onViewCreated$$inlined$launchWithLifecycle$default$2(this.$this_launchWithLifecycle, this.$lifecycleOwner, this.$minActiveState, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RateAppFragment$onViewCreated$$inlined$launchWithLifecycle$default$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(this.$this_launchWithLifecycle, this.$lifecycleOwner.getLifecycle(), this.$minActiveState);
            final Function2 function2 = this.$action;
            this.label = 1;
            if (flowWithLifecycle.collect(new FlowCollector<BaseEvent>() { // from class: com.ifriend.chat.presentation.ui.rateApp.RateAppFragment$onViewCreated$$inlined$launchWithLifecycle$default$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(BaseEvent baseEvent, Continuation<? super Unit> continuation) {
                    Object invoke = Function2.this.invoke(baseEvent, continuation);
                    return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
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
