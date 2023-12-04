package com.ifriend.data.repository.user;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.UserApiService;
import com.ifriend.data.common.CoreExecuteCatching;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserBalanceRepositoryImpl_Factory implements Factory<UserBalanceRepositoryImpl> {
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<UserApiService> userApiServiceProvider;

    public UserBalanceRepositoryImpl_Factory(Provider<UserApiService> provider, Provider<CoreExecuteCatching> provider2, Provider<AuthLocalDataSource> provider3) {
        this.userApiServiceProvider = provider;
        this.coreExecuteCatchingProvider = provider2;
        this.authLocalDataSourceProvider = provider3;
    }

    @Override // javax.inject.Provider
    public UserBalanceRepositoryImpl get() {
        return newInstance(this.userApiServiceProvider.get(), this.coreExecuteCatchingProvider.get(), this.authLocalDataSourceProvider.get());
    }

    public static UserBalanceRepositoryImpl_Factory create(Provider<UserApiService> provider, Provider<CoreExecuteCatching> provider2, Provider<AuthLocalDataSource> provider3) {
        return new UserBalanceRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static UserBalanceRepositoryImpl newInstance(UserApiService userApiService, CoreExecuteCatching coreExecuteCatching, AuthLocalDataSource authLocalDataSource) {
        return new UserBalanceRepositoryImpl(userApiService, coreExecuteCatching, authLocalDataSource);
    }
}
