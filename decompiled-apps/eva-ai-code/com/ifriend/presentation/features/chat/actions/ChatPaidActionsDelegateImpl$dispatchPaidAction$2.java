package com.ifriend.presentation.features.chat.actions;

import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatPaidActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$dispatchPaidAction$2", f = "ChatPaidActionsDelegate.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPaidActionsDelegateImpl$dispatchPaidAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    final /* synthetic */ ChatAction.PaidAction $action;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatPaidActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPaidActionsDelegateImpl$dispatchPaidAction$2(ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl, ChatAction.PaidAction paidAction, ChatViewModel chatViewModel, String str, Continuation<? super ChatPaidActionsDelegateImpl$dispatchPaidAction$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPaidActionsDelegateImpl;
        this.$action = paidAction;
        this.$$context_receiver_0 = chatViewModel;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPaidActionsDelegateImpl$dispatchPaidAction$2(this.this$0, this.$action, this.$$context_receiver_0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPaidActionsDelegateImpl$dispatchPaidAction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InternalStateDelegate<ChatPaidActionsDelegateImpl.PaidActionsUiState> internalStateDelegate = this.this$0;
            boolean isAvailableChatting = internalStateDelegate.getInternalState(internalStateDelegate).isAvailableChatting();
            if (isAvailableChatting) {
                ChatAction.PaidAction paidAction = this.$action;
                if (paidAction instanceof ChatAction.PaidAction.TopicClick) {
                    ChatViewModel chatViewModel = this.$$context_receiver_0;
                    chatViewModel.chatTopicClick(chatViewModel, ((ChatAction.PaidAction.TopicClick) paidAction).getAction(), this.$chatId);
                } else if (paidAction instanceof ChatAction.PaidAction.SendTextMessage) {
                    ChatViewModel chatViewModel2 = this.$$context_receiver_0;
                    chatViewModel2.sendInputMessage(chatViewModel2);
                } else if (paidAction instanceof ChatAction.PaidAction.StartRecording) {
                    ChatViewModel chatViewModel3 = this.$$context_receiver_0;
                    chatViewModel3.startAudioRecording(chatViewModel3);
                } else if (paidAction instanceof ChatAction.PaidAction.SendImageClick) {
                    UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
                    this.label = 1;
                    if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatViewModel.Event) ChatViewModel.Event.OpenTakePhotoAlert.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (!isAvailableChatting) {
                CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this.$$context_receiver_0), null, null, new AnonymousClass1(this.this$0, this.$chatId, null), 3, null);
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatPaidActionsDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$dispatchPaidAction$2$1", f = "ChatPaidActionsDelegate.kt", i = {}, l = {ModuleDescriptor.MODULE_VERSION, 105}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$dispatchPaidAction$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        int label;
        final /* synthetic */ ChatPaidActionsDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatPaidActionsDelegateImpl;
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChatsInfoInteractor chatsInfoInteractor;
            FlowObserverEmitter flowObserverEmitter;
            AppEventsEmitter appEventsEmitter;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                chatsInfoInteractor = this.this$0.chatsInfoInteractor;
                this.label = 1;
                obj = chatsInfoInteractor.getChatInfo(this.$chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (ChatoptionsKt.isSubscriptionPaymentOptions((ChatInfo) obj)) {
                appEventsEmitter = this.this$0.appEventsEmitter;
                appEventsEmitter.emit(new AppEvents.Billing.BuyChatSubscription(new BuyChatSubscriptionBillingUiParams((UUID) null, this.$chatId, false, UpgradeType.ALL, (PurchaseReason) PurchaseReason.Purchase.INSTANCE, (PurchaseSource) null, 33, (DefaultConstructorMarker) null)));
            } else {
                flowObserverEmitter = this.this$0.exceptionsEmitter;
                this.label = 2;
                if (flowObserverEmitter.emit(new IllegalAccessException(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
