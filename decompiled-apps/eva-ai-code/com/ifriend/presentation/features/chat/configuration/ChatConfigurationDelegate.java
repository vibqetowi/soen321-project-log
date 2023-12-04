package com.ifriend.presentation.features.chat.configuration;

import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import dagger.assisted.AssistedFactory;
import kotlin.Metadata;
/* compiled from: ChatConfigurationDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0011\u0010\u0002\u001a\u00020\u0003H&R\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegate;", "", "initChatConfiguration", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;)V", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatConfigurationDelegate {

    /* compiled from: ChatConfigurationDelegate.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegate$Factory;", "", "create", "Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegateImpl;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatConfigurationDelegateImpl create(String str);
    }

    void initChatConfiguration(ChatViewModel chatViewModel);
}
