package com.ifriend.presentation.features.chat.configuration;

import com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatConfigurationDelegate_Factory_Impl implements ChatConfigurationDelegate.Factory {
    private final ChatConfigurationDelegateImpl_Factory delegateFactory;

    ChatConfigurationDelegate_Factory_Impl(ChatConfigurationDelegateImpl_Factory chatConfigurationDelegateImpl_Factory) {
        this.delegateFactory = chatConfigurationDelegateImpl_Factory;
    }

    @Override // com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate.Factory
    public ChatConfigurationDelegateImpl create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatConfigurationDelegate.Factory> create(ChatConfigurationDelegateImpl_Factory chatConfigurationDelegateImpl_Factory) {
        return InstanceFactory.create(new ChatConfigurationDelegate_Factory_Impl(chatConfigurationDelegateImpl_Factory));
    }
}
