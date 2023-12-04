package com.ifriend.presentation.features.chat.message;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import dagger.assisted.AssistedFactory;
import kotlin.Metadata;
/* compiled from: ChatMessageDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0011\u0010\u0002\u001a\u00020\u0003H&R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&R\u00020\u0007¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegate;", "", "initChatMessageDelegate", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;)V", "requestTextMessageAccess", "Landroidx/lifecycle/ViewModel;", "messageId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessageDelegate {

    /* compiled from: ChatMessageDelegate.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegate$Factory;", "", "create", "Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegateImpl;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatMessageDelegateImpl create(String str);
    }

    void initChatMessageDelegate(ChatViewModel chatViewModel);

    void requestTextMessageAccess(ViewModel viewModel, String str);
}
