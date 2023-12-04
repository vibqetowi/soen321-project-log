package com.ifriend.core.remote.datasources.calls;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.CallsApiService;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatCallsRemoteDataSource_Factory implements Factory<ChatCallsRemoteDataSource> {
    private final Provider<CallsApiService> apiServiceProvider;
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;

    public ChatCallsRemoteDataSource_Factory(Provider<CallsApiService> provider, Provider<AuthLocalDataSource> provider2) {
        this.apiServiceProvider = provider;
        this.authLocalDataSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatCallsRemoteDataSource get() {
        return newInstance(this.apiServiceProvider.get(), this.authLocalDataSourceProvider.get());
    }

    public static ChatCallsRemoteDataSource_Factory create(Provider<CallsApiService> provider, Provider<AuthLocalDataSource> provider2) {
        return new ChatCallsRemoteDataSource_Factory(provider, provider2);
    }

    public static ChatCallsRemoteDataSource newInstance(CallsApiService callsApiService, AuthLocalDataSource authLocalDataSource) {
        return new ChatCallsRemoteDataSource(callsApiService, authLocalDataSource);
    }
}
