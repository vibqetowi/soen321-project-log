package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatsState;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppNavigationDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppNavigationDelegateImpl$handleNavigationEvents$2", f = "AppNavigationDelegate.kt", i = {2}, l = {30, 32, 34, 36, 40}, m = "invokeSuspend", n = {"chat"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class AppNavigationDelegateImpl$handleNavigationEvents$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    final /* synthetic */ AppEvents.Navigation $event;
    Object L$0;
    int label;
    final /* synthetic */ AppNavigationDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppNavigationDelegateImpl$handleNavigationEvents$2(AppEvents.Navigation navigation, AppNavigationDelegateImpl appNavigationDelegateImpl, AppViewModel appViewModel, Continuation<? super AppNavigationDelegateImpl$handleNavigationEvents$2> continuation) {
        super(2, continuation);
        this.$event = navigation;
        this.this$0 = appNavigationDelegateImpl;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppNavigationDelegateImpl$handleNavigationEvents$2(this.$event, this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppNavigationDelegateImpl$handleNavigationEvents$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatsInfoInteractor chatsInfoInteractor;
        ChatInfo chatInfo;
        ChatsInfoInteractor chatsInfoInteractor2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.$event, AppEvents.Navigation.BackToChatFlow.INSTANCE)) {
                chatsInfoInteractor = this.this$0.chatsInfoInteractor;
                this.label = 1;
                obj = chatsInfoInteractor.getDefaultChatInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatInfo = (ChatInfo) obj;
                if (chatInfo == null) {
                }
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            chatInfo = (ChatInfo) obj;
            if (chatInfo == null) {
                chatsInfoInteractor2 = this.this$0.chatsInfoInteractor;
                this.L$0 = chatInfo;
                this.label = 3;
                obj = chatsInfoInteractor2.getChatsState(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!Intrinsics.areEqual((ChatsState) obj, ChatsState.ChatListChats.INSTANCE)) {
                }
                return Unit.INSTANCE;
            }
            UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
            this.label = 2;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (AppViewModel.Event) AppViewModel.Event.BackToHomeFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            if (i != 2) {
                if (i == 3) {
                    chatInfo = (ChatInfo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!Intrinsics.areEqual((ChatsState) obj, ChatsState.ChatListChats.INSTANCE)) {
                        UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate2 = this.$$context_receiver_0;
                        this.L$0 = null;
                        this.label = 4;
                        if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (AppViewModel.Event) AppViewModel.Event.BackToHomeFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate3 = this.$$context_receiver_0;
                        this.L$0 = null;
                        this.label = 5;
                        if (uiStateDelegate3.sendEvent2(uiStateDelegate3, (AppViewModel.Event) new AppViewModel.Event.StartChatFeature(chatInfo.getChatId()), (Continuation<? super Unit>) this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }
}
