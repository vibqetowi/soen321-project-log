package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.models.onboarding.AiVoice;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
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
/* compiled from: OnboardingBotVoiceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotVoiceViewModel$onButtonClick$3", f = "OnboardingBotVoiceViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingBotVoiceViewModel$onButtonClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ OnboardingBotVoiceViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotVoiceViewModel$onButtonClick$3(String str, OnboardingBotVoiceViewModel onboardingBotVoiceViewModel, Continuation<? super OnboardingBotVoiceViewModel$onButtonClick$3> continuation) {
        super(2, continuation);
        this.$id = str;
        this.this$0 = onboardingBotVoiceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingBotVoiceViewModel$onButtonClick$3(this.$id, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingBotVoiceViewModel$onButtonClick$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AiVoice aiVoice;
        OnboardingAnalytics onboardingAnalytics;
        OnboardingAnswersRepository onboardingAnswersRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$id;
            if (Intrinsics.areEqual(str, OnboardingBotVoiceViewModel.SPICY_BUTTON_ID)) {
                aiVoice = AiVoice.sexual;
            } else if (!Intrinsics.areEqual(str, OnboardingBotVoiceViewModel.FORMAL_BUTTON_ID)) {
                String str2 = this.$id;
                throw new IllegalArgumentException("Cannot find a button with id=" + str2 + "!");
            } else {
                aiVoice = AiVoice.formal;
            }
            onboardingAnalytics = this.this$0.onboardingAnalytics;
            onboardingAnalytics.trackAiVoice(aiVoice);
            onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
            this.label = 1;
            if (onboardingAnswersRepository.updateAiVoice(aiVoice, this) == coroutine_suspended) {
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
