package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonUiParams;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingAskEveryDayViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingAskEveryDayViewModel$onButtonClick$3", f = "OnboardingAskEveryDayViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingAskEveryDayViewModel$onButtonClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectButtonUiParams $buttonUiParams;
    int label;
    final /* synthetic */ OnboardingAskEveryDayViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingAskEveryDayViewModel$onButtonClick$3(SelectButtonUiParams selectButtonUiParams, OnboardingAskEveryDayViewModel onboardingAskEveryDayViewModel, Continuation<? super OnboardingAskEveryDayViewModel$onButtonClick$3> continuation) {
        super(2, continuation);
        this.$buttonUiParams = selectButtonUiParams;
        this.this$0 = onboardingAskEveryDayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingAskEveryDayViewModel$onButtonClick$3(this.$buttonUiParams, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingAskEveryDayViewModel$onButtonClick$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OnboardingAnalytics onboardingAnalytics;
        OnboardingAnswersRepository onboardingAnswersRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean areEqual = Intrinsics.areEqual(this.$buttonUiParams.getId(), "yes");
            onboardingAnalytics = this.this$0.onboardingAnalytics;
            onboardingAnalytics.trackRetention(areEqual);
            onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
            this.label = 1;
            if (onboardingAnswersRepository.updateRetentions(areEqual, this) == coroutine_suspended) {
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
