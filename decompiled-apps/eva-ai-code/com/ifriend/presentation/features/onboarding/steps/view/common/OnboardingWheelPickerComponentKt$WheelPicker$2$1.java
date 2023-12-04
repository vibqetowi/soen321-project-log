package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingWheelPickerComponentKt$WheelPicker$2$1", f = "OnboardingWheelPickerComponent.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingWheelPickerComponentKt$WheelPicker$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isScrollInProgress;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<Integer, Integer> $onScrollFinished;
    final /* synthetic */ LazyListSnapperLayoutInfo $snapperLayoutInfo;
    final /* synthetic */ int $startIndex;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingWheelPickerComponentKt$WheelPicker$2$1(boolean z, Function1<? super Integer, Integer> function1, LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo, int i, LazyListState lazyListState, Continuation<? super OnboardingWheelPickerComponentKt$WheelPicker$2$1> continuation) {
        super(2, continuation);
        this.$isScrollInProgress = z;
        this.$onScrollFinished = function1;
        this.$snapperLayoutInfo = lazyListSnapperLayoutInfo;
        this.$startIndex = i;
        this.$lazyListState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingWheelPickerComponentKt$WheelPicker$2$1(this.$isScrollInProgress, this.$onScrollFinished, this.$snapperLayoutInfo, this.$startIndex, this.$lazyListState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingWheelPickerComponentKt$WheelPicker$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer calculateSnappedItemIndex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$isScrollInProgress) {
                Function1<Integer, Integer> function1 = this.$onScrollFinished;
                calculateSnappedItemIndex = OnboardingWheelPickerComponentKt.calculateSnappedItemIndex(this.$snapperLayoutInfo);
                Integer invoke = function1.invoke(Boxing.boxInt(calculateSnappedItemIndex != null ? calculateSnappedItemIndex.intValue() : this.$startIndex));
                if (invoke != null) {
                    LazyListState lazyListState = this.$lazyListState;
                    int intValue = invoke.intValue();
                    this.label = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, intValue, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
