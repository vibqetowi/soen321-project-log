package com.ifriend.presentation.features.chat.actions;

import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionState;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.state.InternalStateDelegateImpl;
import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatPaidActionsDelegate.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00012B>\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0015\u0010\b\u001a\u0011\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tj\u0002`\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u00020\u001b¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u00020\u001b¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J>\u0010'\u001a\u00020(*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010)\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00030,H\u0096\u0001J>\u00100\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00030,H\u0096Aø\u0001\u0000¢\u0006\u0002\u00101R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0011\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tj\u0002`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016*\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl;", "Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegate;", "Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl$PaidActionsUiState;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatSubscriptionInteractor", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "internalState", "getInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl$PaidActionsUiState;", "internalStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getInternalStateFlow", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lkotlinx/coroutines/flow/StateFlow;", "dispatchPaidAction", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "chatId", "", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;Ljava/lang/String;)V", "initChatPaidActions", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Ljava/lang/String;)V", "isAvailableChatting", "", "subscriptionState", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "updateInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaidActionsUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPaidActionsDelegateImpl implements ChatPaidActionsDelegate, InternalStateDelegate<PaidActionsUiState> {
    public static final int $stable = 8;
    private final /* synthetic */ InternalStateDelegateImpl<PaidActionsUiState> $$delegate_0;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatSubscriptionInteractor chatSubscriptionInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Job asyncUpdateInternalState(InternalStateDelegate<PaidActionsUiState> internalStateDelegate, CoroutineScope coroutineScope, Function1<? super PaidActionsUiState, ? extends PaidActionsUiState> transform) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateInternalState(internalStateDelegate, coroutineScope, transform);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public PaidActionsUiState getInternalState(InternalStateDelegate<PaidActionsUiState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalState(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public StateFlow<PaidActionsUiState> getInternalStateFlow(InternalStateDelegate<PaidActionsUiState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalStateFlow(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Object updateInternalState(InternalStateDelegate<PaidActionsUiState> internalStateDelegate, Function1<? super PaidActionsUiState, ? extends PaidActionsUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateInternalState(internalStateDelegate, function1, continuation);
    }

    @Inject
    public ChatPaidActionsDelegateImpl(ChatsInfoInteractor chatsInfoInteractor, DispatcherProvider dispatcherProvider, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatSubscriptionInteractor chatSubscriptionInteractor, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatSubscriptionInteractor, "chatSubscriptionInteractor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.dispatcherProvider = dispatcherProvider;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatSubscriptionInteractor = chatSubscriptionInteractor;
        this.appEventsEmitter = appEventsEmitter;
        this.$$delegate_0 = new InternalStateDelegateImpl<>(null, new PaidActionsUiState(null, false, 3, null), 1, null);
    }

    /* compiled from: ChatPaidActionsDelegate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl$PaidActionsUiState;", "", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "isAvailableChatting", "", "(Lcom/ifriend/domain/logic/chat/models/ChatInfo;Z)V", "getChatInfo", "()Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PaidActionsUiState {
        public static final int $stable = 8;
        private final ChatInfo chatInfo;
        private final boolean isAvailableChatting;

        public PaidActionsUiState() {
            this(null, false, 3, null);
        }

        public static /* synthetic */ PaidActionsUiState copy$default(PaidActionsUiState paidActionsUiState, ChatInfo chatInfo, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                chatInfo = paidActionsUiState.chatInfo;
            }
            if ((i & 2) != 0) {
                z = paidActionsUiState.isAvailableChatting;
            }
            return paidActionsUiState.copy(chatInfo, z);
        }

        public final ChatInfo component1() {
            return this.chatInfo;
        }

        public final boolean component2() {
            return this.isAvailableChatting;
        }

        public final PaidActionsUiState copy(ChatInfo chatInfo, boolean z) {
            return new PaidActionsUiState(chatInfo, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaidActionsUiState) {
                PaidActionsUiState paidActionsUiState = (PaidActionsUiState) obj;
                return Intrinsics.areEqual(this.chatInfo, paidActionsUiState.chatInfo) && this.isAvailableChatting == paidActionsUiState.isAvailableChatting;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            ChatInfo chatInfo = this.chatInfo;
            int hashCode = (chatInfo == null ? 0 : chatInfo.hashCode()) * 31;
            boolean z = this.isAvailableChatting;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            ChatInfo chatInfo = this.chatInfo;
            boolean z = this.isAvailableChatting;
            return "PaidActionsUiState(chatInfo=" + chatInfo + ", isAvailableChatting=" + z + ")";
        }

        public PaidActionsUiState(ChatInfo chatInfo, boolean z) {
            this.chatInfo = chatInfo;
            this.isAvailableChatting = z;
        }

        public /* synthetic */ PaidActionsUiState(ChatInfo chatInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : chatInfo, (i & 2) != 0 ? true : z);
        }

        public final ChatInfo getChatInfo() {
            return this.chatInfo;
        }

        public final boolean isAvailableChatting() {
            return this.isAvailableChatting;
        }
    }

    @Override // com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegate
    public void initChatPaidActions(ChatViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        ChatViewModel chatViewModel = context_receiver_0;
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatViewModel), new ChatPaidActionsDelegateImpl$initChatPaidActions$1(this.exceptionsEmitter), null, new ChatPaidActionsDelegateImpl$initChatPaidActions$2(this, chatId, context_receiver_0, null), 2, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatViewModel), new ChatPaidActionsDelegateImpl$initChatPaidActions$3(this.exceptionsEmitter), null, new ChatPaidActionsDelegateImpl$initChatPaidActions$4(this, chatId, context_receiver_0, null), 2, null);
    }

    @Override // com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegate
    public void dispatchPaidAction(ChatViewModel context_receiver_0, ChatAction.PaidAction action, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new ChatPaidActionsDelegateImpl$dispatchPaidAction$1(this.exceptionsEmitter), null, new ChatPaidActionsDelegateImpl$dispatchPaidAction$2(this, action, context_receiver_0, chatId, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAvailableChatting(ChatSubscriptionState chatSubscriptionState) {
        if (Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.TrialPeriod.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.SubscriptionActivated.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.TrialPeriodFinished.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.SubscriptionUnactivated.INSTANCE)) {
            return false;
        }
        if (Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.Empty.INSTANCE)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
