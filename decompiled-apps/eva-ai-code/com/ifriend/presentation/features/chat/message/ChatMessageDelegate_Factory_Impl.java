package com.ifriend.presentation.features.chat.message;

import com.ifriend.presentation.features.chat.message.ChatMessageDelegate;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageDelegate_Factory_Impl implements ChatMessageDelegate.Factory {
    private final ChatMessageDelegateImpl_Factory delegateFactory;

    ChatMessageDelegate_Factory_Impl(ChatMessageDelegateImpl_Factory chatMessageDelegateImpl_Factory) {
        this.delegateFactory = chatMessageDelegateImpl_Factory;
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageDelegate.Factory
    public ChatMessageDelegateImpl create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatMessageDelegate.Factory> create(ChatMessageDelegateImpl_Factory chatMessageDelegateImpl_Factory) {
        return InstanceFactory.create(new ChatMessageDelegate_Factory_Impl(chatMessageDelegateImpl_Factory));
    }
}
