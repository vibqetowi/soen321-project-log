package com.ifriend.data.repository.chat.client;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.repository.chat.providers.ChatClientProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatClientsRepositoryImpl_Factory implements Factory<ChatClientsRepositoryImpl> {
    private final Provider<ChatClientProvider> chatProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;

    public ChatClientsRepositoryImpl_Factory(Provider<ChatClientProvider> provider, Provider<CoreExecuteCatching> provider2) {
        this.chatProvider = provider;
        this.coreExecuteCatchingProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatClientsRepositoryImpl get() {
        return newInstance(this.chatProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static ChatClientsRepositoryImpl_Factory create(Provider<ChatClientProvider> provider, Provider<CoreExecuteCatching> provider2) {
        return new ChatClientsRepositoryImpl_Factory(provider, provider2);
    }

    public static ChatClientsRepositoryImpl newInstance(ChatClientProvider chatClientProvider, CoreExecuteCatching coreExecuteCatching) {
        return new ChatClientsRepositoryImpl(chatClientProvider, coreExecuteCatching);
    }
}
