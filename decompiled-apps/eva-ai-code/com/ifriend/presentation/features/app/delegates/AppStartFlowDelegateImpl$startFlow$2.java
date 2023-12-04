package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppStartFlowDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppStartFlowDelegateImpl$startFlow$2", f = "AppStartFlowDelegate.kt", i = {}, l = {33, 37, 38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppStartFlowDelegateImpl$startFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ AppStartFlowDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStartFlowDelegateImpl$startFlow$2(AppStartFlowDelegateImpl appStartFlowDelegateImpl, AppViewModel appViewModel, Continuation<? super AppStartFlowDelegateImpl$startFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = appStartFlowDelegateImpl;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppStartFlowDelegateImpl$startFlow$2(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppStartFlowDelegateImpl$startFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UserRepository userRepository;
        UserProfileRepository userProfileRepository;
        AppEventsEmitter appEventsEmitter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            userRepository = this.this$0.userRepository;
            if (userRepository.getCurrentUser() != null) {
                userProfileRepository = this.this$0.userProfileRepository;
                this.label = 2;
                obj = userProfileRepository.isOnboardingDataSubmitted(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
                this.label = 1;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (AppViewModel.Event) AppViewModel.Event.RestartAppFlow.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                appEventsEmitter = this.this$0.appEventsEmitter;
                appEventsEmitter.emit(new AppEvents.StartChatFlow(AppEvents.StartChatFlow.NavigationMode.START_APP));
            } else {
                UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate2 = this.$$context_receiver_0;
                this.label = 3;
                if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (AppViewModel.Event) AppViewModel.Event.StartOnboardingFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
