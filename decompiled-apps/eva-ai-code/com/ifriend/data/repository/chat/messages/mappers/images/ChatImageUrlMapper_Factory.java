package com.ifriend.data.repository.chat.messages.mappers.images;

import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatImageUrlMapper_Factory implements Factory<ChatImageUrlMapper> {
    private final Provider<AppConfigStorage> appConfigStorageProvider;
    private final Provider<AuthDataProvider> authProvider;

    public ChatImageUrlMapper_Factory(Provider<AppConfigStorage> provider, Provider<AuthDataProvider> provider2) {
        this.appConfigStorageProvider = provider;
        this.authProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatImageUrlMapper get() {
        return newInstance(this.appConfigStorageProvider.get(), this.authProvider.get());
    }

    public static ChatImageUrlMapper_Factory create(Provider<AppConfigStorage> provider, Provider<AuthDataProvider> provider2) {
        return new ChatImageUrlMapper_Factory(provider, provider2);
    }

    public static ChatImageUrlMapper newInstance(AppConfigStorage appConfigStorage, AuthDataProvider authDataProvider) {
        return new ChatImageUrlMapper(appConfigStorage, authDataProvider);
    }
}
