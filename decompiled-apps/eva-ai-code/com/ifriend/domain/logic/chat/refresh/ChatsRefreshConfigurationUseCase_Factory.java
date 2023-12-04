package com.ifriend.domain.logic.chat.refresh;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsRefreshConfigurationUseCase_Factory implements Factory<ChatsRefreshConfigurationUseCase> {
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<ChatSubscriptionRepository> chatSubscriptionRepositoryProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatsRefreshConfigurationUseCase_Factory(Provider<ChatConfigsMemoryCachedSource> provider, Provider<ChatsInfoRepository> provider2, Provider<UserRepository> provider3, Provider<ChatSubscriptionRepository> provider4) {
        this.chatConfigsMemoryCachedSourceProvider = provider;
        this.chatsInfoRepositoryProvider = provider2;
        this.userRepositoryProvider = provider3;
        this.chatSubscriptionRepositoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ChatsRefreshConfigurationUseCase get() {
        return newInstance(this.chatConfigsMemoryCachedSourceProvider.get(), this.chatsInfoRepositoryProvider.get(), this.userRepositoryProvider.get(), this.chatSubscriptionRepositoryProvider.get());
    }

    public static ChatsRefreshConfigurationUseCase_Factory create(Provider<ChatConfigsMemoryCachedSource> provider, Provider<ChatsInfoRepository> provider2, Provider<UserRepository> provider3, Provider<ChatSubscriptionRepository> provider4) {
        return new ChatsRefreshConfigurationUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static ChatsRefreshConfigurationUseCase newInstance(ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, ChatsInfoRepository chatsInfoRepository, UserRepository userRepository, ChatSubscriptionRepository chatSubscriptionRepository) {
        return new ChatsRefreshConfigurationUseCase(chatConfigsMemoryCachedSource, chatsInfoRepository, userRepository, chatSubscriptionRepository);
    }
}
