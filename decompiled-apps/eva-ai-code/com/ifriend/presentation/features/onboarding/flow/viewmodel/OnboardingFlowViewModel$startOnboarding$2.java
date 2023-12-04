package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import com.google.zxing.pdf417.PDF417Common;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import com.ifriend.domain.onboarding.model.OnboardingStep;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingFlowViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$startOnboarding$2", f = "OnboardingFlowViewModel.kt", i = {2}, l = {PDF417Common.MAX_ROWS_IN_BARCODE, 93, 95, 101}, m = "invokeSuspend", n = {"steps"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class OnboardingFlowViewModel$startOnboarding$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ OnboardingFlowViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFlowViewModel$startOnboarding$2(OnboardingFlowViewModel onboardingFlowViewModel, Continuation<? super OnboardingFlowViewModel$startOnboarding$2> continuation) {
        super(2, continuation);
        this.this$0 = onboardingFlowViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingFlowViewModel$startOnboarding$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingFlowViewModel$startOnboarding$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OnboardingInteractor onboardingInteractor;
        Set set;
        AppEventsEmitter appEventsEmitter;
        UiStateDelegate<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.Event> uiStateDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.Event> uiStateDelegate2 = this.this$0;
            this.label = 1;
            if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) this.L$0;
                ResultKt.throwOnFailure(obj);
                uiStateDelegate = this.this$0;
                this.L$0 = null;
                this.label = 4;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass3(set), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            set = (Set) obj;
            if (!set.isEmpty()) {
                appEventsEmitter = this.this$0.appEventsEmitter;
                appEventsEmitter.emit(AppEvents.OnboardingSubmitted.INSTANCE);
                return Unit.INSTANCE;
            }
            InternalStateDelegate<OnboardingFlowViewModel.InternalState> internalStateDelegate = this.this$0;
            this.L$0 = set;
            this.label = 3;
            if (internalStateDelegate.updateInternalState(internalStateDelegate, new AnonymousClass2(set), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            uiStateDelegate = this.this$0;
            this.L$0 = null;
            this.label = 4;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass3(set), this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        onboardingInteractor = this.this$0.interactor;
        this.label = 2;
        obj = onboardingInteractor.getOnboardingSteps(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        set = (Set) obj;
        if (!set.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$startOnboarding$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingFlowViewModel.UiState invoke(OnboardingFlowViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return OnboardingFlowViewModel.UiState.copy$default(state, true, false, null, null, false, 30, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$InternalState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$startOnboarding$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<OnboardingFlowViewModel.InternalState, OnboardingFlowViewModel.InternalState> {
        final /* synthetic */ Set<OnboardingStep> $steps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Set<? extends OnboardingStep> set) {
            super(1);
            this.$steps = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingFlowViewModel.InternalState invoke(OnboardingFlowViewModel.InternalState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return state.copy(CollectionsKt.toList(this.$steps), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingFlowViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$startOnboarding$2$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.UiState> {
        final /* synthetic */ Set<OnboardingStep> $steps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Set<? extends OnboardingStep> set) {
            super(1);
            this.$steps = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingFlowViewModel.UiState invoke(OnboardingFlowViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return OnboardingFlowViewModel.UiState.copy$default(state, false, false, null, (OnboardingStep) CollectionsKt.first(this.$steps), false, 23, null);
        }
    }
}
