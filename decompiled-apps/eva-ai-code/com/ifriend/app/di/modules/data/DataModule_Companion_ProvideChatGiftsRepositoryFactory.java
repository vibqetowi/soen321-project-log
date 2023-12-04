package com.ifriend.app.di.modules.data;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.gifts.ChatGiftsRemoteDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideChatGiftsRepositoryFactory implements Factory<ChatGiftsRepository> {
    private final Provider<AppConfigStorage> appConfigStorageProvider;
    private final Provider<ChatGiftsRemoteDataSource> chatGiftsRemoteDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;

    public DataModule_Companion_ProvideChatGiftsRepositoryFactory(Provider<ChatGiftsRemoteDataSource> provider, Provider<AppConfigStorage> provider2, Provider<CoreExecuteCatching> provider3) {
        this.chatGiftsRemoteDataSourceProvider = provider;
        this.appConfigStorageProvider = provider2;
        this.coreExecuteCatchingProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatGiftsRepository get() {
        return provideChatGiftsRepository(this.chatGiftsRemoteDataSourceProvider.get(), this.appConfigStorageProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static DataModule_Companion_ProvideChatGiftsRepositoryFactory create(Provider<ChatGiftsRemoteDataSource> provider, Provider<AppConfigStorage> provider2, Provider<CoreExecuteCatching> provider3) {
        return new DataModule_Companion_ProvideChatGiftsRepositoryFactory(provider, provider2, provider3);
    }

    public static ChatGiftsRepository provideChatGiftsRepository(ChatGiftsRemoteDataSource chatGiftsRemoteDataSource, AppConfigStorage appConfigStorage, CoreExecuteCatching coreExecuteCatching) {
        return (ChatGiftsRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideChatGiftsRepository(chatGiftsRemoteDataSource, appConfigStorage, coreExecuteCatching));
    }
}
