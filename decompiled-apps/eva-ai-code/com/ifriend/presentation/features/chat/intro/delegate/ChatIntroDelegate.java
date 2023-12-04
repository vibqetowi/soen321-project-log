package com.ifriend.presentation.features.chat.intro.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatIntroDelegate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&R\u00020\t¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\nR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/intro/delegate/ChatIntroDelegate;", "", "chatIntroState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "getChatIntroState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeChatIntro", "", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)V", "initChatIntroDelegate", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "showNextChatIntroCard", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatIntroDelegate {
    void closeChatIntro(ViewModel viewModel);

    StateFlow<ChatIntroUiState> getChatIntroState();

    void initChatIntroDelegate(ViewModel viewModel, String str);

    void showNextChatIntroCard(ViewModel viewModel);
}
