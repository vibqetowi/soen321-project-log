package com.ifriend.app.di.modules.data.core;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.interceptors.AuthorizationInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InterceptorsModule_ProvidesAuthorizationInterceptorFactory implements Factory<AuthorizationInterceptor> {
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;
    private final InterceptorsModule module;

    public InterceptorsModule_ProvidesAuthorizationInterceptorFactory(InterceptorsModule interceptorsModule, Provider<AuthLocalDataSource> provider) {
        this.module = interceptorsModule;
        this.authLocalDataSourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public AuthorizationInterceptor get() {
        return providesAuthorizationInterceptor(this.module, this.authLocalDataSourceProvider.get());
    }

    public static InterceptorsModule_ProvidesAuthorizationInterceptorFactory create(InterceptorsModule interceptorsModule, Provider<AuthLocalDataSource> provider) {
        return new InterceptorsModule_ProvidesAuthorizationInterceptorFactory(interceptorsModule, provider);
    }

    public static AuthorizationInterceptor providesAuthorizationInterceptor(InterceptorsModule interceptorsModule, AuthLocalDataSource authLocalDataSource) {
        return (AuthorizationInterceptor) Preconditions.checkNotNullFromProvides(interceptorsModule.providesAuthorizationInterceptor(authLocalDataSource));
    }
}
