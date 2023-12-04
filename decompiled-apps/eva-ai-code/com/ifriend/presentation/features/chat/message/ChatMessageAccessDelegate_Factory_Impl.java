package com.ifriend.presentation.features.chat.message;

import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegate_Factory_Impl implements ChatMessageAccessDelegate.Factory {
    private final ChatMessageAccessDelegateImpl_Factory delegateFactory;

    ChatMessageAccessDelegate_Factory_Impl(ChatMessageAccessDelegateImpl_Factory chatMessageAccessDelegateImpl_Factory) {
        this.delegateFactory = chatMessageAccessDelegateImpl_Factory;
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate.Factory
    public ChatMessageAccessDelegateImpl create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatMessageAccessDelegate.Factory> create(ChatMessageAccessDelegateImpl_Factory chatMessageAccessDelegateImpl_Factory) {
        return InstanceFactory.create(new ChatMessageAccessDelegate_Factory_Impl(chatMessageAccessDelegateImpl_Factory));
    }
}
