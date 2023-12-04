package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.bot.ChangeBotNameUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.view.textfield.OnboardingTextFieldState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingBotNameViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotNameViewModel$onButtonClick$1", f = "OnboardingBotNameViewModel.kt", i = {}, l = {65, 68, 73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingBotNameViewModel$onButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ OnboardingBotNameViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotNameViewModel$onButtonClick$1(OnboardingBotNameViewModel onboardingBotNameViewModel, String str, Continuation<? super OnboardingBotNameViewModel$onButtonClick$1> continuation) {
        super(2, continuation);
        this.this$0 = onboardingBotNameViewModel;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingBotNameViewModel$onButtonClick$1(this.this$0, this.$name, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingBotNameViewModel$onButtonClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingBotNameViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/textfield/OnboardingTextFieldState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotNameViewModel$onButtonClick$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<OnboardingTextFieldState, OnboardingTextFieldState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingTextFieldState invoke(OnboardingTextFieldState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OnboardingTextFieldState.copy$default(it, null, null, null, null, null, false, true, 63, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GetBotUseCase getBotUseCase;
        DispatcherProvider dispatcherProvider;
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<OnboardingTextFieldState, Unit> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.onboardingEventsFlow;
            this.label = 3;
            if (mutableSharedFlow.emit(OnboardingStepEvent.OnStepFinished.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        getBotUseCase = this.this$0.getBotUseCase;
        Bot current = getBotUseCase.current();
        if (!Intrinsics.areEqual(this.$name, current != null ? current.getName() : null)) {
            dispatcherProvider = this.this$0.dispatchers;
            this.label = 2;
            if (BuildersKt.withContext(dispatcherProvider.background(), new AnonymousClass2(this.this$0, this.$name, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        mutableSharedFlow = this.this$0.onboardingEventsFlow;
        this.label = 3;
        if (mutableSharedFlow.emit(OnboardingStepEvent.OnStepFinished.INSTANCE, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingBotNameViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotNameViewModel$onButtonClick$1$2", f = "OnboardingBotNameViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotNameViewModel$onButtonClick$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        int label;
        final /* synthetic */ OnboardingBotNameViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(OnboardingBotNameViewModel onboardingBotNameViewModel, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = onboardingBotNameViewModel;
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OnboardingAnalytics onboardingAnalytics;
            ChangeBotNameUseCase changeBotNameUseCase;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                onboardingAnalytics = this.this$0.onboardingAnalytics;
                onboardingAnalytics.trackAiName(this.$name);
                changeBotNameUseCase = this.this$0.changeBotNameUseCase;
                this.label = 1;
                if (changeBotNameUseCase.execute(this.$name, this) == coroutine_suspended) {
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
}
