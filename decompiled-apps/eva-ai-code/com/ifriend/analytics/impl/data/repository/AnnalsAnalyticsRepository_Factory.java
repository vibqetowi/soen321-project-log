package com.ifriend.analytics.impl.data.repository;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.AnnalsApiService;
import com.ifriend.core.tools.api.DispatcherProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AnnalsAnalyticsRepository_Factory implements Factory<AnnalsAnalyticsRepository> {
    private final Provider<AnnalsApiService> annalsApiProvider;
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<Boolean> isDebuggableProvider;

    public AnnalsAnalyticsRepository_Factory(Provider<DispatcherProvider> provider, Provider<CoroutineScope> provider2, Provider<AnnalsApiService> provider3, Provider<AuthLocalDataSource> provider4, Provider<Boolean> provider5) {
        this.dispatcherProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.annalsApiProvider = provider3;
        this.authLocalDataSourceProvider = provider4;
        this.isDebuggableProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AnnalsAnalyticsRepository get() {
        return newInstance(this.dispatcherProvider.get(), this.coroutineScopeProvider.get(), this.annalsApiProvider.get(), this.authLocalDataSourceProvider.get(), this.isDebuggableProvider.get().booleanValue());
    }

    public static AnnalsAnalyticsRepository_Factory create(Provider<DispatcherProvider> provider, Provider<CoroutineScope> provider2, Provider<AnnalsApiService> provider3, Provider<AuthLocalDataSource> provider4, Provider<Boolean> provider5) {
        return new AnnalsAnalyticsRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static AnnalsAnalyticsRepository newInstance(DispatcherProvider dispatcherProvider, CoroutineScope coroutineScope, AnnalsApiService annalsApiService, AuthLocalDataSource authLocalDataSource, boolean z) {
        return new AnnalsAnalyticsRepository(dispatcherProvider, coroutineScope, annalsApiService, authLocalDataSource, z);
    }
}
