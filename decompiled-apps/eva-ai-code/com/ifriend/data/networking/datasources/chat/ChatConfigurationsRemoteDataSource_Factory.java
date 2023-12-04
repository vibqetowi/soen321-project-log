package com.ifriend.data.networking.datasources.chat;

import com.ifriend.data.networking.api.configuration.ChatConfigurationsApi;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatConfigurationsRemoteDataSource_Factory implements Factory<ChatConfigurationsRemoteDataSource> {
    private final Provider<ChatConfigurationsApi> apiProvider;

    public ChatConfigurationsRemoteDataSource_Factory(Provider<ChatConfigurationsApi> provider) {
        this.apiProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatConfigurationsRemoteDataSource get() {
        return newInstance(this.apiProvider.get());
    }

    public static ChatConfigurationsRemoteDataSource_Factory create(Provider<ChatConfigurationsApi> provider) {
        return new ChatConfigurationsRemoteDataSource_Factory(provider);
    }

    public static ChatConfigurationsRemoteDataSource newInstance(ChatConfigurationsApi chatConfigurationsApi) {
        return new ChatConfigurationsRemoteDataSource(chatConfigurationsApi);
    }
}
