package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
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
/* compiled from: OnboardingUserGenderViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserGenderViewModel$onButtonClick$3", f = "OnboardingUserGenderViewModel.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingUserGenderViewModel$onButtonClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ OnboardingUserGenderViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUserGenderViewModel$onButtonClick$3(String str, OnboardingUserGenderViewModel onboardingUserGenderViewModel, Continuation<? super OnboardingUserGenderViewModel$onButtonClick$3> continuation) {
        super(2, continuation);
        this.$id = str;
        this.this$0 = onboardingUserGenderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingUserGenderViewModel$onButtonClick$3(this.$id, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingUserGenderViewModel$onButtonClick$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserRepository userRepository;
        OnboardingAnalytics onboardingAnalytics;
        ChangeUserGenderUseCase changeUserGenderUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Gender valueOf = Gender.valueOf(this.$id);
            userRepository = this.this$0.userRepository;
            User currentUser = userRepository.getCurrentUser();
            if (valueOf != (currentUser != null ? currentUser.getGender() : null)) {
                onboardingAnalytics = this.this$0.onboardingAnalytics;
                onboardingAnalytics.trackUserGender(valueOf);
                changeUserGenderUseCase = this.this$0.changeUserGenderUseCase;
                this.label = 1;
                if (changeUserGenderUseCase.change(valueOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
