package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.onboarding.model.OnboardingStep;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: flow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1", f = "OnboardingFlowViewModel.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ OnboardingFlowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1(Flow flow, Continuation continuation, OnboardingFlowViewModel onboardingFlowViewModel) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = onboardingFlowViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$this_collectIn.collect(new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* compiled from: flow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ OnboardingFlowViewModel this$0;

        /* compiled from: flow.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1$1", f = "OnboardingFlowViewModel.kt", i = {0, 0, 1}, l = {38, 39}, m = "emit", n = {"this", "step", "this"}, s = {"L$0", "L$1", "L$0"})
        /* renamed from: com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel$observeEvents$$inlined$collectIn$default$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01641 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C01641(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(OnboardingFlowViewModel onboardingFlowViewModel) {
            this.this$0 = onboardingFlowViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C01641 c01641;
            Object coroutine_suspended;
            int i;
            Unit unit;
            AnonymousClass1<T> anonymousClass1;
            OnboardingStep onboardingStep;
            OnboardingFlowViewModel onboardingFlowViewModel;
            AppEventsEmitter appEventsEmitter;
            if (continuation instanceof C01641) {
                c01641 = (C01641) continuation;
                if ((c01641.label & Integer.MIN_VALUE) != 0) {
                    c01641.label -= Integer.MIN_VALUE;
                    Object obj = c01641.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c01641.label;
                    unit = null;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (Intrinsics.areEqual((OnboardingStepEvent) t, OnboardingStepEvent.OnStepFinished.INSTANCE)) {
                            InternalStateDelegate<OnboardingFlowViewModel.InternalState> internalStateDelegate = this.this$0;
                            OnboardingStep nextStep = internalStateDelegate.getInternalState(internalStateDelegate).getNextStep();
                            if (nextStep != null) {
                                InternalStateDelegate<OnboardingFlowViewModel.InternalState> internalStateDelegate2 = this.this$0;
                                c01641.L$0 = this;
                                c01641.L$1 = nextStep;
                                c01641.label = 1;
                                if (internalStateDelegate2.updateInternalState(internalStateDelegate2, OnboardingFlowViewModel$observeEvents$1$1$1.INSTANCE, c01641) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                onboardingStep = nextStep;
                                anonymousClass1 = this;
                            } else {
                                anonymousClass1 = this;
                                if (unit == null) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        anonymousClass1 = (AnonymousClass1) c01641.L$0;
                        ResultKt.throwOnFailure(obj);
                        unit = Unit.INSTANCE;
                        if (unit == null) {
                            appEventsEmitter = anonymousClass1.this$0.appEventsEmitter;
                            appEventsEmitter.emit(AppEvents.OnboardingSubmitted.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        onboardingStep = (OnboardingStep) c01641.L$1;
                        anonymousClass1 = (AnonymousClass1) c01641.L$0;
                    }
                    onboardingFlowViewModel = anonymousClass1.this$0;
                    c01641.L$0 = anonymousClass1;
                    c01641.L$1 = null;
                    c01641.label = 2;
                    if (onboardingFlowViewModel.sendEvent((UiStateDelegate<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.Event>) onboardingFlowViewModel, (OnboardingFlowViewModel.Event) new OnboardingFlowViewModel.Event.NavigateToStep(onboardingStep), (Continuation<? super Unit>) c01641) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    unit = Unit.INSTANCE;
                    if (unit == null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            c01641 = new C01641(continuation);
            Object obj2 = c01641.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c01641.label;
            unit = null;
            if (i != 0) {
            }
            onboardingFlowViewModel = anonymousClass1.this$0;
            c01641.L$0 = anonymousClass1;
            c01641.L$1 = null;
            c01641.label = 2;
            if (onboardingFlowViewModel.sendEvent((UiStateDelegate<OnboardingFlowViewModel.UiState, OnboardingFlowViewModel.Event>) onboardingFlowViewModel, (OnboardingFlowViewModel.Event) new OnboardingFlowViewModel.Event.NavigateToStep(onboardingStep), (Continuation<? super Unit>) c01641) == coroutine_suspended) {
            }
            unit = Unit.INSTANCE;
            if (unit == null) {
            }
            return Unit.INSTANCE;
        }
    }
}
