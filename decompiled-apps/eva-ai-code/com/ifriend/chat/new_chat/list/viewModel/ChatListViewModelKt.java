package com.ifriend.chat.new_chat.list.viewModel;

import com.ifriend.domain.newChat.chat.ChatClient;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
/* compiled from: ChatListViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"removePresentationSystems", "", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void removePresentationSystems(ChatClient chatClient) {
        chatClient.expandWithSystemsChain(CollectionsKt.emptyList());
    }
}
