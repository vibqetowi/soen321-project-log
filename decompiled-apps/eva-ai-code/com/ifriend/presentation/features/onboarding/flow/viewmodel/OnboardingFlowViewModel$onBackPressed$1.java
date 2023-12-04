package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingFlowViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$onBackPressed$1", f = "OnboardingFlowViewModel.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingFlowViewModel$onBackPressed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OnboardingFlowViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFlowViewModel$onBackPressed$1(OnboardingFlowViewModel onboardingFlowViewModel, Continuation<? super OnboardingFlowViewModel$onBackPressed$1> continuation) {
        super(2, continuation);
        this.this$0 = onboardingFlowViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingFlowViewModel$onBackPressed$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingFlowViewModel$onBackPressed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OnboardingFlowViewModel onboardingFlowViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InternalStateDelegate<OnboardingFlowViewModel.InternalState> internalStateDelegate = this.this$0;
            if (internalStateDelegate.getInternalState(internalStateDelegate).getPreviousStep() != null) {
                InternalStateDelegate<OnboardingFlowViewModel.InternalState> internalStateDelegate2 = this.this$0;
                this.label = 1;
                if (internalStateDelegate2.updateInternalState(internalStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                onboardingFlowViewModel = this.this$0;
                this.label = 2;
                if (onboardingFlowViewModel.sendEvent((UiStateDelegate<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.Event>) onboardingFlowViewModel, (OnboardingFlowViewModel.Event) OnboardingFlowViewModel.Event.NavigateUp.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                }
            } else {
                this.this$0.leaveFeature();
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            onboardingFlowViewModel = this.this$0;
            this.label = 2;
            if (onboardingFlowViewModel.sendEvent((UiStateDelegate<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.Event>) onboardingFlowViewModel, (OnboardingFlowViewModel.Event) OnboardingFlowViewModel.Event.NavigateUp.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$onBackPressed$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<OnboardingFlowViewModel.InternalState, OnboardingFlowViewModel.InternalState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, OnboardingFlowViewModel.InternalState.class, "moveToPrevStep", "moveToPrevStep()Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$InternalState;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingFlowViewModel.InternalState invoke(OnboardingFlowViewModel.InternalState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.moveToPrevStep();
        }
    }
}
