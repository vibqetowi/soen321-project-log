package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.util.Calendar;
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
/* compiled from: OnboardingUserBirthDateViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserBirthDateViewModel$onButtonClick$1", f = "OnboardingUserBirthDateViewModel.kt", i = {}, l = {SSL.SSL_PROTOCOL_TLS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingUserBirthDateViewModel$onButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $year;
    int label;
    final /* synthetic */ OnboardingUserBirthDateViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUserBirthDateViewModel$onButtonClick$1(int i, OnboardingUserBirthDateViewModel onboardingUserBirthDateViewModel, Continuation<? super OnboardingUserBirthDateViewModel$onButtonClick$1> continuation) {
        super(2, continuation);
        this.$year = i;
        this.this$0 = onboardingUserBirthDateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingUserBirthDateViewModel$onButtonClick$1(this.$year, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingUserBirthDateViewModel$onButtonClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OnboardingAnalytics onboardingAnalytics;
        ChangeUserAgeUseCase changeUserAgeUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = Calendar.getInstance().get(1) - this.$year;
            Birthday fromAge = Birthday.Companion.fromAge(i2);
            onboardingAnalytics = this.this$0.onboardingAnalytics;
            onboardingAnalytics.trackUserAge(i2);
            changeUserAgeUseCase = this.this$0.changeUserAgeUseCase;
            this.label = 1;
            if (changeUserAgeUseCase.change(fromAge, this) == coroutine_suspended) {
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
