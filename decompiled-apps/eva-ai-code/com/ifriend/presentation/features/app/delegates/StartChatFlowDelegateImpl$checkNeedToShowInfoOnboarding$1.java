package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
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
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartChatFlowDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl$checkNeedToShowInfoOnboarding$1", f = "StartChatFlowDelegate.kt", i = {}, l = {85, 86, 87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class StartChatFlowDelegateImpl$checkNeedToShowInfoOnboarding$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ StartChatFlowDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartChatFlowDelegateImpl$checkNeedToShowInfoOnboarding$1(StartChatFlowDelegateImpl startChatFlowDelegateImpl, AppViewModel appViewModel, Continuation<? super StartChatFlowDelegateImpl$checkNeedToShowInfoOnboarding$1> continuation) {
        super(2, continuation);
        this.this$0 = startChatFlowDelegateImpl;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StartChatFlowDelegateImpl$checkNeedToShowInfoOnboarding$1(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StartChatFlowDelegateImpl$checkNeedToShowInfoOnboarding$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InfoOnboardingSlideUseCase infoOnboardingSlideUseCase;
        UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            infoOnboardingSlideUseCase = this.this$0.infoOnboardingSlideUseCase;
            this.label = 1;
            obj = infoOnboardingSlideUseCase.isNeedToShowInfoOnboarding(this);
            if (obj == coroutine_suspended) {
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
            uiStateDelegate = this.$$context_receiver_0;
            this.label = 3;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (AppViewModel.Event) AppViewModel.Event.GoToInfoOnboarding.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.label = 2;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            uiStateDelegate = this.$$context_receiver_0;
            this.label = 3;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (AppViewModel.Event) AppViewModel.Event.GoToInfoOnboarding.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
            }
        }
        return Unit.INSTANCE;
    }
}
