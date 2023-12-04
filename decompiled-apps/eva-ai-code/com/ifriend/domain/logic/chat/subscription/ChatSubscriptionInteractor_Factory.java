package com.ifriend.domain.logic.chat.subscription;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSubscriptionInteractor_Factory implements Factory<ChatSubscriptionInteractor> {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatSubscriptionRepository> chatSubscriptionRepositoryProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;

    public ChatSubscriptionInteractor_Factory(Provider<ChatsInfoRepository> provider, Provider<ChatClientInteractor> provider2, Provider<ChatSubscriptionRepository> provider3) {
        this.chatsInfoRepositoryProvider = provider;
        this.chatClientInteractorProvider = provider2;
        this.chatSubscriptionRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatSubscriptionInteractor get() {
        return newInstance(this.chatsInfoRepositoryProvider.get(), this.chatClientInteractorProvider.get(), this.chatSubscriptionRepositoryProvider.get());
    }

    public static ChatSubscriptionInteractor_Factory create(Provider<ChatsInfoRepository> provider, Provider<ChatClientInteractor> provider2, Provider<ChatSubscriptionRepository> provider3) {
        return new ChatSubscriptionInteractor_Factory(provider, provider2, provider3);
    }

    public static ChatSubscriptionInteractor newInstance(ChatsInfoRepository chatsInfoRepository, ChatClientInteractor chatClientInteractor, ChatSubscriptionRepository chatSubscriptionRepository) {
        return new ChatSubscriptionInteractor(chatsInfoRepository, chatClientInteractor, chatSubscriptionRepository);
    }
}
