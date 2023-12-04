package com.ifriend.ui.utils;

import androidx.exifinterface.media.ExifInterface;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: CoroutineUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.utils.CoroutineUtilsKt$launchWithLifecycle$1", f = "CoroutineUtils.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CoroutineUtilsKt$launchWithLifecycle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ Flow<T> $this_launchWithLifecycle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineUtilsKt$launchWithLifecycle$1(Flow<? extends T> flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super CoroutineUtilsKt$launchWithLifecycle$1> continuation) {
        super(2, continuation);
        this.$this_launchWithLifecycle = flow;
        this.$lifecycleOwner = lifecycleOwner;
        this.$minActiveState = state;
        this.$action = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoroutineUtilsKt$launchWithLifecycle$1(this.$this_launchWithLifecycle, this.$lifecycleOwner, this.$minActiveState, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoroutineUtilsKt$launchWithLifecycle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(this.$this_launchWithLifecycle, this.$lifecycleOwner.getLifecycle(), this.$minActiveState);
            Intrinsics.needClassReification();
            final Function2<T, Continuation<? super Unit>, Object> function2 = this.$action;
            this.label = 1;
            if (flowWithLifecycle.collect(new FlowCollector<T>() { // from class: com.ifriend.ui.utils.CoroutineUtilsKt$launchWithLifecycle$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    Object invoke = function2.invoke(t, continuation);
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
