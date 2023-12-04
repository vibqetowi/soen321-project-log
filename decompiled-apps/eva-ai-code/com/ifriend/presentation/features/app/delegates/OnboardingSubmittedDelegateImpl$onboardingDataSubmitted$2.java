package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.data.offers.UserOffersRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
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
/* compiled from: OnboardingSubmittedDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$2", f = "OnboardingSubmittedDelegate.kt", i = {}, l = {30, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ OnboardingSubmittedDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$2(OnboardingSubmittedDelegateImpl onboardingSubmittedDelegateImpl, AppViewModel appViewModel, Continuation<? super OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$2> continuation) {
        super(2, continuation);
        this.this$0 = onboardingSubmittedDelegateImpl;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$2(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingSubmittedDelegateImpl$onboardingDataSubmitted$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserProfileRepository userProfileRepository;
        AppEventsEmitter appEventsEmitter;
        UserOffersRepository userOffersRepository;
        AppEventsEmitter appEventsEmitter2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            userProfileRepository = this.this$0.userProfileRepository;
            this.label = 1;
            if (userProfileRepository.setOnboardingDataSubmitted(true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                appEventsEmitter2 = this.this$0.appEventsEmitter;
                appEventsEmitter2.emit(new AppEvents.StartChatFlow(AppEvents.StartChatFlow.NavigationMode.FINISHED_ONBOARDING));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        appEventsEmitter = this.this$0.appEventsEmitter;
        appEventsEmitter.emit(AppEvents.Chat.RefreshConfiguration.INSTANCE);
        AppViewModel appViewModel = this.$$context_receiver_0;
        appViewModel.startAppChatLaunchService(appViewModel);
        userOffersRepository = this.this$0.userOffersRepository;
        this.label = 2;
        if (userOffersRepository.setShouldShowChatSubscriptionOfferAfterOnboarding(true, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        appEventsEmitter2 = this.this$0.appEventsEmitter;
        appEventsEmitter2.emit(new AppEvents.StartChatFlow(AppEvents.StartChatFlow.NavigationMode.FINISHED_ONBOARDING));
        return Unit.INSTANCE;
    }
}
