package com.ifriend.data.repository.chat.info;

import com.ifriend.data.mappers.ChatNotificationsMapper;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatNotificationsRepositoryImpl_Factory implements Factory<ChatNotificationsRepositoryImpl> {
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<ChatNotificationsMapper> mapperProvider;

    public ChatNotificationsRepositoryImpl_Factory(Provider<ChatNotificationsMapper> provider, Provider<CoroutineDispatchers> provider2, Provider<ChatsInfoRepository> provider3) {
        this.mapperProvider = provider;
        this.dispatchersProvider = provider2;
        this.chatsInfoRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatNotificationsRepositoryImpl get() {
        return newInstance(this.mapperProvider.get(), this.dispatchersProvider.get(), this.chatsInfoRepositoryProvider.get());
    }

    public static ChatNotificationsRepositoryImpl_Factory create(Provider<ChatNotificationsMapper> provider, Provider<CoroutineDispatchers> provider2, Provider<ChatsInfoRepository> provider3) {
        return new ChatNotificationsRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ChatNotificationsRepositoryImpl newInstance(ChatNotificationsMapper chatNotificationsMapper, CoroutineDispatchers coroutineDispatchers, ChatsInfoRepository chatsInfoRepository) {
        return new ChatNotificationsRepositoryImpl(chatNotificationsMapper, coroutineDispatchers, chatsInfoRepository);
    }
}
