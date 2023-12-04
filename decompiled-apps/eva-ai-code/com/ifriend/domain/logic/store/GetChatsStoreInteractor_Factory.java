package com.ifriend.domain.logic.store;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.guide.UserGuideRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GetChatsStoreInteractor_Factory implements Factory<GetChatsStoreInteractor> {
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<UserGuideRepository> userGuideRepositoryProvider;

    public GetChatsStoreInteractor_Factory(Provider<ChatsInfoRepository> provider, Provider<ChatConfigsMemoryCachedSource> provider2, Provider<UserGuideRepository> provider3) {
        this.chatsInfoRepositoryProvider = provider;
        this.chatConfigsMemoryCachedSourceProvider = provider2;
        this.userGuideRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public GetChatsStoreInteractor get() {
        return newInstance(this.chatsInfoRepositoryProvider.get(), this.chatConfigsMemoryCachedSourceProvider.get(), this.userGuideRepositoryProvider.get());
    }

    public static GetChatsStoreInteractor_Factory create(Provider<ChatsInfoRepository> provider, Provider<ChatConfigsMemoryCachedSource> provider2, Provider<UserGuideRepository> provider3) {
        return new GetChatsStoreInteractor_Factory(provider, provider2, provider3);
    }

    public static GetChatsStoreInteractor newInstance(ChatsInfoRepository chatsInfoRepository, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, UserGuideRepository userGuideRepository) {
        return new GetChatsStoreInteractor(chatsInfoRepository, chatConfigsMemoryCachedSource, userGuideRepository);
    }
}
