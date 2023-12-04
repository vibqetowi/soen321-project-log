package com.ifriend.presentation.features.chat.message;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessState;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatMessageDelegate.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B8\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0015\u0010\t\u001a\u0011\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nj\u0002`\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0019\u001a\u00020\u001aH\u0016R\u00020\u001b¢\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0096AR\u00020\u001eø\u0001\u0000¢\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016R\u00020\u001e¢\u0006\u0002\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\t\u001a\u0011\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegateImpl;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegate;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate;", "chatId", "", "chatMessageAccessDelegate", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate$Factory;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "(Ljava/lang/String;Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate$Factory;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;)V", "chatMessageAccessEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "getChatMessageAccessEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "chatMessageAccessStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessUiState;", "getChatMessageAccessStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "initChatMessageDelegate", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;)V", "requestMessageAccess", "Landroidx/lifecycle/ViewModel;", "messageId", "accessActionType", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestTextMessageAccess", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageDelegateImpl implements ChatMessageDelegate, ChatMessageAccessDelegate {
    public static final int $stable = 8;
    private final /* synthetic */ ChatMessageAccessDelegateImpl $$delegate_0;
    private final ChatClientInteractor chatClientInteractor;
    private final String chatId;
    private final ChatMessageAccessDelegate.Factory chatMessageAccessDelegate;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public Flow<ChatMessageAccessState> getChatMessageAccessEventFlow() {
        return this.$$delegate_0.getChatMessageAccessEventFlow();
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public StateFlow<ChatMessageAccessUiState> getChatMessageAccessStateFlow() {
        return this.$$delegate_0.getChatMessageAccessStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate
    public Object requestMessageAccess(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.requestMessageAccess(viewModel, str, chatMessageAccessReason, continuation);
    }

    @AssistedInject
    public ChatMessageDelegateImpl(@Assisted String chatId, ChatMessageAccessDelegate.Factory chatMessageAccessDelegate, ChatClientInteractor chatClientInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatMessageAccessDelegate, "chatMessageAccessDelegate");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        this.chatId = chatId;
        this.chatMessageAccessDelegate = chatMessageAccessDelegate;
        this.chatClientInteractor = chatClientInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.$$delegate_0 = chatMessageAccessDelegate.create(chatId);
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageDelegate
    public void initChatMessageDelegate(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatMessageDelegateImpl$initChatMessageDelegate$$inlined$collectIn$default$1(getChatMessageAccessStateFlow(), null, context_receiver_0));
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageDelegate
    public void requestTextMessageAccess(ViewModel context_receiver_0, String messageId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new ChatMessageDelegateImpl$requestTextMessageAccess$1(this.exceptionsEmitter), null, new ChatMessageDelegateImpl$requestTextMessageAccess$2(this, messageId, context_receiver_0, null), 2, null);
    }
}
