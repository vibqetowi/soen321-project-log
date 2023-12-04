package com.ifriend.domain.logic.chat;

import com.ifriend.domain.data.chat.ChatClientsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatClientInteractor_Factory implements Factory<ChatClientInteractor> {
    private final Provider<ChatClientsRepository> chatsRepositoryProvider;

    public ChatClientInteractor_Factory(Provider<ChatClientsRepository> provider) {
        this.chatsRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatClientInteractor get() {
        return newInstance(this.chatsRepositoryProvider.get());
    }

    public static ChatClientInteractor_Factory create(Provider<ChatClientsRepository> provider) {
        return new ChatClientInteractor_Factory(provider);
    }

    public static ChatClientInteractor newInstance(ChatClientsRepository chatClientsRepository) {
        return new ChatClientInteractor(chatClientsRepository);
    }
}
