package com.ifriend.presentation.features.chat.message;

import androidx.lifecycle.ViewModel;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessState;
import dagger.assisted.AssistedFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0014J%\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H¦@R\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate;", "", "chatMessageAccessEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "getChatMessageAccessEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "chatMessageAccessStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessUiState;", "getChatMessageAccessStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "requestMessageAccess", "", "Landroidx/lifecycle/ViewModel;", "messageId", "", "accessActionType", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessageAccessDelegate {

    /* compiled from: ChatMessageAccessDelegate.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegate$Factory;", "", "create", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessDelegateImpl;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatMessageAccessDelegateImpl create(String str);
    }

    Flow<ChatMessageAccessState> getChatMessageAccessEventFlow();

    StateFlow<ChatMessageAccessUiState> getChatMessageAccessStateFlow();

    Object requestMessageAccess(ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super Unit> continuation);
}
