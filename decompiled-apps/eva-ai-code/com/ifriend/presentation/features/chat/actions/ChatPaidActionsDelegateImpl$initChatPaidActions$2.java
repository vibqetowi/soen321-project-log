package com.ifriend.presentation.features.chat.actions;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.common.state.InternalStateDelegate;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatPaidActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$initChatPaidActions$2", f = "ChatPaidActionsDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPaidActionsDelegateImpl$initChatPaidActions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatPaidActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPaidActionsDelegateImpl$initChatPaidActions$2(ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl, String str, ChatViewModel chatViewModel, Continuation<? super ChatPaidActionsDelegateImpl$initChatPaidActions$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPaidActionsDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPaidActionsDelegateImpl$initChatPaidActions$2(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPaidActionsDelegateImpl$initChatPaidActions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsInfoInteractor chatsInfoInteractor;
        DispatcherProvider dispatcherProvider;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            Flow<ChatInfo> chatsInfoFlow = chatsInfoInteractor.getChatsInfoFlow(this.$chatId);
            dispatcherProvider = this.this$0.dispatcherProvider;
            FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(chatsInfoFlow, dispatcherProvider.background()), new AnonymousClass1(this.this$0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatPaidActionsDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chatInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$initChatPaidActions$2$1", f = "ChatPaidActionsDelegate.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$initChatPaidActions$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChatInfo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatPaidActionsDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatPaidActionsDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChatInfo chatInfo, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(chatInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatPaidActionsDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl$PaidActionsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl$initChatPaidActions$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01481 extends Lambda implements Function1<ChatPaidActionsDelegateImpl.PaidActionsUiState, ChatPaidActionsDelegateImpl.PaidActionsUiState> {
            final /* synthetic */ ChatInfo $chatInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01481(ChatInfo chatInfo) {
                super(1);
                this.$chatInfo = chatInfo;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatPaidActionsDelegateImpl.PaidActionsUiState invoke(ChatPaidActionsDelegateImpl.PaidActionsUiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return ChatPaidActionsDelegateImpl.PaidActionsUiState.copy$default(state, this.$chatInfo, false, 2, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InternalStateDelegate<ChatPaidActionsDelegateImpl.PaidActionsUiState> internalStateDelegate = this.this$0;
                this.label = 1;
                if (internalStateDelegate.updateInternalState(internalStateDelegate, new C01481((ChatInfo) this.L$0), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
