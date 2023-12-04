package com.ifriend.presentation.features.chat.panel.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
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
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$chatCallUi$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {294, 295, 298, 300}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$chatCallUi$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$chatCallUi$2(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, String str, ViewModel viewModel, Continuation<? super ChatPanelActionsDelegateImpl$chatCallUi$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPanelActionsDelegateImpl$chatCallUi$2(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPanelActionsDelegateImpl$chatCallUi$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatPanelActionsDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$chatCallUi$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatTopicsUiState, ChatTopicsUiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatTopicsUiState invoke(ChatTopicsUiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatTopicsUiState.copy$default(state, null, false, null, false, false, false, 61, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object showHideCallLoading;
        ChatCallAnalytics chatCallAnalytics;
        ChatCallsInteractor chatCallsInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                chatCallAnalytics = this.this$0.chatCallAnalytics;
                chatCallAnalytics.trackCallButtonClick();
                chatCallsInteractor = this.this$0.chatCallsInteractor;
                this.label = 3;
                obj = chatCallsInteractor.isAvailableCall(this.$chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    this.this$0.showUpdateSubscription(this.$$context_receiver_0, this.$chatId);
                } else {
                    UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate2 = this.this$0;
                    this.label = 4;
                    if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (ChatPanelActionsEvent) new ChatPanelActionsEvent.StartCall(this.$chatId), (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        showHideCallLoading = this.this$0.showHideCallLoading(true, this);
        if (showHideCallLoading == coroutine_suspended) {
            return coroutine_suspended;
        }
        chatCallAnalytics = this.this$0.chatCallAnalytics;
        chatCallAnalytics.trackCallButtonClick();
        chatCallsInteractor = this.this$0.chatCallsInteractor;
        this.label = 3;
        obj = chatCallsInteractor.isAvailableCall(this.$chatId, this);
        if (obj == coroutine_suspended) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }
}
