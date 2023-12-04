package com.ifriend.presentation.features.chat.photo.delegate;

import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPhotoDelegate_Factory_Impl implements ChatPhotoDelegate.Factory {
    private final ChatPhotoDelegateImpl_Factory delegateFactory;

    ChatPhotoDelegate_Factory_Impl(ChatPhotoDelegateImpl_Factory chatPhotoDelegateImpl_Factory) {
        this.delegateFactory = chatPhotoDelegateImpl_Factory;
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate.Factory
    public ChatPhotoDelegateImpl create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatPhotoDelegate.Factory> create(ChatPhotoDelegateImpl_Factory chatPhotoDelegateImpl_Factory) {
        return InstanceFactory.create(new ChatPhotoDelegate_Factory_Impl(chatPhotoDelegateImpl_Factory));
    }
}
