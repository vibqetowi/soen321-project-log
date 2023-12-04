package com.ifriend.presentation.features.chat.message;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.exceptions.features.common.ChatSubscriptionAccessException;
import com.ifriend.domain.exceptions.features.common.InsufficientBalanceException;
import com.ifriend.domain.exceptions.features.common.SubscriptionAccessException;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessState;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatMessageBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.state.InternalStateDelegateImpl;
import com.ifriend.presentation.features.chat.common.models.MessageIdsParamsKt;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BH\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0015\u0010\u0006\u001a\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007j\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J!\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0002\u00103J!\u00104\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002R\u000205¢\u0006\u0002\u00106J-\u00107\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,2\u0006\u00108\u001a\u00020\bH\u0082@R\u000205ø\u0001\u0000¢\u0006\u0002\u00109J!\u0010:\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002R\u000205¢\u0006\u0002\u00106J!\u0010;\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002R\u000205¢\u0006\u0002\u00106J\u0011\u0010<\u001a\u000201H\u0002R\u000205¢\u0006\u0002\u0010=J!\u0010>\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002R\u000205¢\u0006\u0002\u00106J!\u0010?\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002R\u000205¢\u0006\u0002\u00106J%\u0010@\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0096@R\u000205ø\u0001\u0000¢\u0006\u0002\u0010AJ)\u0010B\u001a\u0002012\u0006\u0010C\u001a\u00020D2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJ)\u0010F\u001a\u0002012\u0006\u0010C\u001a\u00020D2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJ)\u0010G\u001a\u0002012\u0006\u0010C\u001a\u00020D2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJ\u0015\u0010H\u001a\u000201H\u0082@R\u000205ø\u0001\u0000¢\u0006\u0002\u0010IJ>\u0010J\u001a\u00020K*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010L\u001a\u00020M2!\u0010N\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00030OH\u0096\u0001J>\u0010R\u001a\u000201*\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010N\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00030OH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010SR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c*\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegateImpl;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate;", "Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessUiState;", "chatId", "", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "chatMessageAccessInteractor", "Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Ljava/lang/String;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "chatMessageAccessEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "chatMessageAccessEventFlow", "Lkotlinx/coroutines/flow/Flow;", "getChatMessageAccessEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "chatMessageAccessStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getChatMessageAccessStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "internalState", "getInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessUiState;", "internalStateFlow", "getInternalStateFlow", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lkotlinx/coroutines/flow/StateFlow;", "getBuyMessagePurchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "messageId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBuySubscriptionType", "Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "accessActionType", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "getChatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAccessState", "", "state", "(Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleChatSubscriptionAccessException", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;)V", "handleException", "throwable", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleInsufficientBalanceState", "handleSubscriptionAccessException", "hideLoading", "(Landroidx/lifecycle/ViewModel;)V", "requestAccessAfterUpdateBalance", "requestAccessAfterUpdateSubscription", "requestMessageAccess", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBuyChatSubscriptionEvent", "requestId", "Ljava/util/UUID;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBuyMessageEvent", "sendBuySubscriptionEvent", "showLoading", "(Landroidx/lifecycle/ViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "updateInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl implements ChatMessageAccessDelegate, InternalStateDelegate<ChatMessageAccessUiState> {
    public static final int $stable = 8;
    private final /* synthetic */ InternalStateDelegateImpl<ChatMessageAccessUiState> $$delegate_0;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatClientInteractor chatClientInteractor;
    private final String chatId;
    private final MutableSharedFlow<ChatMessageAccessState> chatMessageAccessEvent;
    private final ChatMessageAccessInteractor chatMessageAccessInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final PaymentResultFlow paymentResultFlow;

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Job asyncUpdateInternalState(InternalStateDelegate<ChatMessageAccessUiState> internalStateDelegate, CoroutineScope coroutineScope, Function1<? super ChatMessageAccessUiState, ? extends ChatMessageAccessUiState> transform) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateInternalState(internalStateDelegate, coroutineScope, transform);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public ChatMessageAccessUiState getInternalState(InternalStateDelegate<ChatMessageAccessUiState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalState(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public StateFlow<ChatMessageAccessUiState> getInternalStateFlow(InternalStateDelegate<ChatMessageAccessUiState> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_0.getInternalStateFlow(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Object updateInternalState(InternalStateDelegate<ChatMessageAccessUiState> internalStateDelegate, Function1<? super ChatMessageAccessUiState, ? extends ChatMessageAccessUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateInternalState(internalStateDelegate, function1, continuation);
    }

    @AssistedInject
    public ChatMessageAccessDelegateImpl(@Assisted String chatId, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatClientInteractor chatClientInteractor, ChatMessageAccessInteractor chatMessageAccessInteractor, PaymentResultFlow paymentResultFlow, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(chatMessageAccessInteractor, "chatMessageAccessInteractor");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.chatId = chatId;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatClientInteractor = chatClientInteractor;
        this.chatMessageAccessInteractor = chatMessageAccessInteractor;
        this.paymentResultFlow = paymentResultFlow;
        this.appEventsEmitter = appEventsEmitter;
        this.$$delegate_0 = new InternalStateDelegateImpl<>(null, new ChatMessageAccessUiState(false, 1, null), 1, null);
        this.chatMessageAccessEvent = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public StateFlow<ChatMessageAccessUiState> getChatMessageAccessStateFlow() {
        return getInternalStateFlow(this);
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public Flow<ChatMessageAccessState> getChatMessageAccessEventFlow() {
        return this.chatMessageAccessEvent;
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public Object requestMessageAccess(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super Unit> continuation) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatMessageAccessDelegateImpl$requestMessageAccess$2(this, viewModel, str, chatMessageAccessReason, null), null, new ChatMessageAccessDelegateImpl$requestMessageAccess$3(this, viewModel, str, chatMessageAccessReason, null), 2, null).invokeOnCompletion(new ChatMessageAccessDelegateImpl$requestMessageAccess$4(this, viewModel));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleAccessState(ChatMessageAccessState chatMessageAccessState, Continuation<? super Unit> continuation) {
        Object emit = this.chatMessageAccessEvent.emit(chatMessageAccessState, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading(ViewModel viewModel) {
        asyncUpdateInternalState(this, ViewModelKt.getViewModelScope(viewModel), ChatMessageAccessDelegateImpl$hideLoading$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showLoading(ViewModel viewModel, Continuation<? super Unit> continuation) {
        Object updateInternalState = updateInternalState(this, ChatMessageAccessDelegateImpl$showLoading$2.INSTANCE, continuation);
        return updateInternalState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateInternalState : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatMessage(String str, String str2, Continuation<? super ChatMessage> continuation) {
        ChatMessageAccessDelegateImpl$getChatMessage$1 chatMessageAccessDelegateImpl$getChatMessage$1;
        Object obj;
        int i;
        if (continuation instanceof ChatMessageAccessDelegateImpl$getChatMessage$1) {
            chatMessageAccessDelegateImpl$getChatMessage$1 = (ChatMessageAccessDelegateImpl$getChatMessage$1) continuation;
            if ((chatMessageAccessDelegateImpl$getChatMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessDelegateImpl$getChatMessage$1.label -= Integer.MIN_VALUE;
                obj = chatMessageAccessDelegateImpl$getChatMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessDelegateImpl$getChatMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientInteractor chatClientInteractor = this.chatClientInteractor;
                    chatMessageAccessDelegateImpl$getChatMessage$1.label = 1;
                    obj = chatClientInteractor.getChatMessage(str2, str, chatMessageAccessDelegateImpl$getChatMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return obj;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        chatMessageAccessDelegateImpl$getChatMessage$1 = new ChatMessageAccessDelegateImpl$getChatMessage$1(this, continuation);
        obj = chatMessageAccessDelegateImpl$getChatMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessDelegateImpl$getChatMessage$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleException(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason, Throwable th, Continuation<? super Unit> continuation) {
        if (th instanceof SubscriptionAccessException) {
            handleSubscriptionAccessException(viewModel, str, chatMessageAccessReason);
        } else if (th instanceof ChatSubscriptionAccessException) {
            handleChatSubscriptionAccessException(viewModel, str, chatMessageAccessReason);
        } else if (!(th instanceof InsufficientBalanceException)) {
            Object emit = this.exceptionsEmitter.emit(th, continuation);
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
        } else {
            handleInsufficientBalanceState(viewModel, str, chatMessageAccessReason);
        }
        return Unit.INSTANCE;
    }

    private final void handleInsufficientBalanceState(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatMessageAccessDelegateImpl$handleInsufficientBalanceState$1(this.exceptionsEmitter), null, new ChatMessageAccessDelegateImpl$handleInsufficientBalanceState$2(this, str, chatMessageAccessReason, viewModel, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendBuyMessageEvent(UUID uuid, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super Unit> continuation) {
        ChatMessageAccessDelegateImpl$sendBuyMessageEvent$1 chatMessageAccessDelegateImpl$sendBuyMessageEvent$1;
        int i;
        ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl;
        if (continuation instanceof ChatMessageAccessDelegateImpl$sendBuyMessageEvent$1) {
            chatMessageAccessDelegateImpl$sendBuyMessageEvent$1 = (ChatMessageAccessDelegateImpl$sendBuyMessageEvent$1) continuation;
            if ((chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = this.chatId;
                    chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.L$0 = this;
                    chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.L$1 = uuid;
                    chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.L$2 = chatMessageAccessReason;
                    chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.label = 1;
                    obj = getChatMessage(str, str2, chatMessageAccessDelegateImpl$sendBuyMessageEvent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessageAccessDelegateImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessageAccessReason = (ChatMessageAccessReason) chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.L$2;
                    uuid = (UUID) chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.L$1;
                    chatMessageAccessDelegateImpl = (ChatMessageAccessDelegateImpl) chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatMessageAccessDelegateImpl.appEventsEmitter.emit(new AppEvents.Billing.BuyChatMessage(new BuyChatMessageBillingUiParams(uuid, new PurchaseReason.BuyMessage(MessageIdsParamsKt.toMessageIdsParams(((ChatMessage) obj).getInfo().getIds())), PurchaseSource.CHAT, chatMessageAccessDelegateImpl.getBuySubscriptionType(chatMessageAccessReason), chatMessageAccessDelegateImpl.chatId)));
                return Unit.INSTANCE;
            }
        }
        chatMessageAccessDelegateImpl$sendBuyMessageEvent$1 = new ChatMessageAccessDelegateImpl$sendBuyMessageEvent$1(this, continuation);
        Object obj2 = chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessDelegateImpl$sendBuyMessageEvent$1.label;
        if (i != 0) {
        }
        chatMessageAccessDelegateImpl.appEventsEmitter.emit(new AppEvents.Billing.BuyChatMessage(new BuyChatMessageBillingUiParams(uuid, new PurchaseReason.BuyMessage(MessageIdsParamsKt.toMessageIdsParams(((ChatMessage) obj2).getInfo().getIds())), PurchaseSource.CHAT, chatMessageAccessDelegateImpl.getBuySubscriptionType(chatMessageAccessReason), chatMessageAccessDelegateImpl.chatId)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAccessAfterUpdateBalance(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatMessageAccessDelegateImpl$requestAccessAfterUpdateBalance$1(this.exceptionsEmitter), null, new ChatMessageAccessDelegateImpl$requestAccessAfterUpdateBalance$2(this, viewModel, str, chatMessageAccessReason, null), 2, null).invokeOnCompletion(new ChatMessageAccessDelegateImpl$requestAccessAfterUpdateBalance$3(this, viewModel));
    }

    private final void handleSubscriptionAccessException(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatMessageAccessDelegateImpl$handleSubscriptionAccessException$1(this.exceptionsEmitter), null, new ChatMessageAccessDelegateImpl$handleSubscriptionAccessException$2(this, str, chatMessageAccessReason, viewModel, null), 2, null);
    }

    private final void handleChatSubscriptionAccessException(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$1(this.exceptionsEmitter), null, new ChatMessageAccessDelegateImpl$handleChatSubscriptionAccessException$2(this, str, chatMessageAccessReason, viewModel, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAccessAfterUpdateSubscription(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatMessageAccessDelegateImpl$requestAccessAfterUpdateSubscription$1(this.exceptionsEmitter), null, new ChatMessageAccessDelegateImpl$requestAccessAfterUpdateSubscription$2(this, viewModel, str, chatMessageAccessReason, null), 2, null).invokeOnCompletion(new ChatMessageAccessDelegateImpl$requestAccessAfterUpdateSubscription$3(this, viewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendBuySubscriptionEvent(UUID uuid, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super Unit> continuation) {
        ChatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1 chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1;
        int i;
        UUID uuid2;
        UpgradeType upgradeType;
        AppEventsEmitter appEventsEmitter;
        if (continuation instanceof ChatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1) {
            chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1 = (ChatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1) continuation;
            if ((chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppEventsEmitter appEventsEmitter2 = this.appEventsEmitter;
                    UpgradeType buySubscriptionType = getBuySubscriptionType(chatMessageAccessReason);
                    chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.L$0 = uuid;
                    chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.L$1 = buySubscriptionType;
                    chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.L$2 = appEventsEmitter2;
                    chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.label = 1;
                    Object buyMessagePurchaseReason = getBuyMessagePurchaseReason(str, chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1);
                    if (buyMessagePurchaseReason == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uuid2 = uuid;
                    upgradeType = buySubscriptionType;
                    appEventsEmitter = appEventsEmitter2;
                    obj = buyMessagePurchaseReason;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    appEventsEmitter = (AppEventsEmitter) chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.L$2;
                    ResultKt.throwOnFailure(obj);
                    upgradeType = (UpgradeType) chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.L$1;
                    uuid2 = (UUID) chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.L$0;
                }
                appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(uuid2, false, upgradeType, (PurchaseReason) obj, 2, null)));
                return Unit.INSTANCE;
            }
        }
        chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1 = new ChatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1(this, continuation);
        Object obj2 = chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessDelegateImpl$sendBuySubscriptionEvent$1.label;
        if (i != 0) {
        }
        appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(uuid2, false, upgradeType, (PurchaseReason) obj2, 2, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendBuyChatSubscriptionEvent(UUID uuid, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super Unit> continuation) {
        ChatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1 chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1;
        int i;
        ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl;
        UUID uuid2;
        UpgradeType upgradeType;
        AppEventsEmitter appEventsEmitter;
        if (continuation instanceof ChatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1) {
            chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1 = (ChatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1) continuation;
            if ((chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppEventsEmitter appEventsEmitter2 = this.appEventsEmitter;
                    UpgradeType buySubscriptionType = getBuySubscriptionType(chatMessageAccessReason);
                    chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$0 = this;
                    chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$1 = uuid;
                    chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$2 = buySubscriptionType;
                    chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$3 = appEventsEmitter2;
                    chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.label = 1;
                    Object buyMessagePurchaseReason = getBuyMessagePurchaseReason(str, chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1);
                    if (buyMessagePurchaseReason == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessageAccessDelegateImpl = this;
                    uuid2 = uuid;
                    upgradeType = buySubscriptionType;
                    appEventsEmitter = appEventsEmitter2;
                    obj = buyMessagePurchaseReason;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    appEventsEmitter = (AppEventsEmitter) chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$3;
                    chatMessageAccessDelegateImpl = (ChatMessageAccessDelegateImpl) chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    upgradeType = (UpgradeType) chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$2;
                    uuid2 = (UUID) chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.L$1;
                }
                appEventsEmitter.emit(new AppEvents.Billing.BuyChatSubscription(new BuyChatSubscriptionBillingUiParams(uuid2, chatMessageAccessDelegateImpl.chatId, false, upgradeType, (PurchaseReason) obj, (PurchaseSource) null, 32, (DefaultConstructorMarker) null)));
                return Unit.INSTANCE;
            }
        }
        chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1 = new ChatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1(this, continuation);
        Object obj2 = chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1.label;
        if (i != 0) {
        }
        appEventsEmitter.emit(new AppEvents.Billing.BuyChatSubscription(new BuyChatSubscriptionBillingUiParams(uuid2, chatMessageAccessDelegateImpl.chatId, false, upgradeType, (PurchaseReason) obj2, (PurchaseSource) null, 32, (DefaultConstructorMarker) null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getBuyMessagePurchaseReason(String str, Continuation<? super PurchaseReason> continuation) {
        ChatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1 chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1;
        int i;
        if (continuation instanceof ChatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1) {
            chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1 = (ChatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1) continuation;
            if ((chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = this.chatId;
                    chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1.label = 1;
                    obj = getChatMessage(str, str2, chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return new PurchaseReason.BuyMessage(MessageIdsParamsKt.toMessageIdsParams(((ChatMessage) obj).getInfo().getIds()));
            }
        }
        chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1 = new ChatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1(this, continuation);
        Object obj2 = chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1.label;
        if (i != 0) {
        }
        return new PurchaseReason.BuyMessage(MessageIdsParamsKt.toMessageIdsParams(((ChatMessage) obj2).getInfo().getIds()));
    }

    private final UpgradeType getBuySubscriptionType(ChatMessageAccessReason chatMessageAccessReason) {
        if (Intrinsics.areEqual(chatMessageAccessReason, ChatMessageAccessReason.BuyPhoto.INSTANCE)) {
            return UpgradeType.PHOTOS;
        }
        if (Intrinsics.areEqual(chatMessageAccessReason, ChatMessageAccessReason.TextMessage.BuySextingMessage.INSTANCE)) {
            return UpgradeType.ADULT_TEXTING;
        }
        if (!Intrinsics.areEqual(chatMessageAccessReason, ChatMessageAccessReason.TextMessage.BuyRegeneratingAnswer.INSTANCE) && !Intrinsics.areEqual(chatMessageAccessReason, ChatMessageAccessReason.TextMessage.BuyMessage.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return UpgradeType.ALL;
    }
}
