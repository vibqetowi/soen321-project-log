package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.models.onboarding.AiCharacter;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingBotCharacterViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotCharacterViewModel$onButtonClick$3", f = "OnboardingBotCharacterViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingBotCharacterViewModel$onButtonClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ OnboardingBotCharacterViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotCharacterViewModel$onButtonClick$3(String str, OnboardingBotCharacterViewModel onboardingBotCharacterViewModel, Continuation<? super OnboardingBotCharacterViewModel$onButtonClick$3> continuation) {
        super(2, continuation);
        this.$id = str;
        this.this$0 = onboardingBotCharacterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingBotCharacterViewModel$onButtonClick$3(this.$id, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingBotCharacterViewModel$onButtonClick$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AiCharacter aiCharacter;
        OnboardingAnalytics onboardingAnalytics;
        OnboardingAnswersRepository onboardingAnswersRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$id;
            int hashCode = str.hashCode();
            if (hashCode == 103501) {
                if (str.equals("hot")) {
                    aiCharacter = AiCharacter.hot;
                    onboardingAnalytics = this.this$0.onboardingAnalytics;
                    onboardingAnalytics.trackAiCharacter(aiCharacter);
                    onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
                    this.label = 1;
                    if (onboardingAnswersRepository.updateAiCharacter(aiCharacter, this) == coroutine_suspended) {
                    }
                }
                String str2 = this.$id;
                throw new IllegalArgumentException("Cannot find a button with id=" + str2 + "!");
            } else if (hashCode == 113860) {
                if (str.equals("shy")) {
                    aiCharacter = AiCharacter.shy;
                    onboardingAnalytics = this.this$0.onboardingAnalytics;
                    onboardingAnalytics.trackAiCharacter(aiCharacter);
                    onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
                    this.label = 1;
                    if (onboardingAnswersRepository.updateAiCharacter(aiCharacter, this) == coroutine_suspended) {
                    }
                }
                String str22 = this.$id;
                throw new IllegalArgumentException("Cannot find a button with id=" + str22 + "!");
            } else {
                if (hashCode == 109549001 && str.equals("smart")) {
                    aiCharacter = AiCharacter.smart;
                    onboardingAnalytics = this.this$0.onboardingAnalytics;
                    onboardingAnalytics.trackAiCharacter(aiCharacter);
                    onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
                    this.label = 1;
                    if (onboardingAnswersRepository.updateAiCharacter(aiCharacter, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                String str222 = this.$id;
                throw new IllegalArgumentException("Cannot find a button with id=" + str222 + "!");
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
