package com.ifriend.data.repository.chat.subscription;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.mappers.subscription.ChatSubscriptionBenefitsMapper;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSubscriptionRepositoryImpl_Factory implements Factory<ChatSubscriptionRepositoryImpl> {
    private final Provider<ChatSubscriptionBenefitsMapper> chatSubscriptionBenefitsMapperProvider;
    private final Provider<ChatsRemoteDataSource> chatsRemoteDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;

    public ChatSubscriptionRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<ChatsRemoteDataSource> provider2, Provider<ChatSubscriptionBenefitsMapper> provider3) {
        this.coreExecuteCatchingProvider = provider;
        this.chatsRemoteDataSourceProvider = provider2;
        this.chatSubscriptionBenefitsMapperProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatSubscriptionRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.chatsRemoteDataSourceProvider.get(), this.chatSubscriptionBenefitsMapperProvider.get());
    }

    public static ChatSubscriptionRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<ChatsRemoteDataSource> provider2, Provider<ChatSubscriptionBenefitsMapper> provider3) {
        return new ChatSubscriptionRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ChatSubscriptionRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, ChatsRemoteDataSource chatsRemoteDataSource, ChatSubscriptionBenefitsMapper chatSubscriptionBenefitsMapper) {
        return new ChatSubscriptionRepositoryImpl(coreExecuteCatching, chatsRemoteDataSource, chatSubscriptionBenefitsMapper);
    }
}
