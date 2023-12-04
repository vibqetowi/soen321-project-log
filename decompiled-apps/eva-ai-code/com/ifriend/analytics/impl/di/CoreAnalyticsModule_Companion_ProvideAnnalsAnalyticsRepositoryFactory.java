package com.ifriend.analytics.impl.di;

import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.AnnalsApiService;
import com.ifriend.core.tools.api.DispatcherProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class CoreAnalyticsModule_Companion_ProvideAnnalsAnalyticsRepositoryFactory implements Factory<AnalyticsRepository> {
    private final Provider<AnnalsApiService> annalsApiProvider;
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;

    public CoreAnalyticsModule_Companion_ProvideAnnalsAnalyticsRepositoryFactory(Provider<DispatcherProvider> provider, Provider<CoroutineScope> provider2, Provider<AnnalsApiService> provider3, Provider<AuthLocalDataSource> provider4) {
        this.dispatcherProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.annalsApiProvider = provider3;
        this.authLocalDataSourceProvider = provider4;
    }

    @Override // javax.inject.Provider
    public AnalyticsRepository get() {
        return provideAnnalsAnalyticsRepository(this.dispatcherProvider.get(), this.coroutineScopeProvider.get(), this.annalsApiProvider.get(), this.authLocalDataSourceProvider.get());
    }

    public static CoreAnalyticsModule_Companion_ProvideAnnalsAnalyticsRepositoryFactory create(Provider<DispatcherProvider> provider, Provider<CoroutineScope> provider2, Provider<AnnalsApiService> provider3, Provider<AuthLocalDataSource> provider4) {
        return new CoreAnalyticsModule_Companion_ProvideAnnalsAnalyticsRepositoryFactory(provider, provider2, provider3, provider4);
    }

    public static AnalyticsRepository provideAnnalsAnalyticsRepository(DispatcherProvider dispatcherProvider, CoroutineScope coroutineScope, AnnalsApiService annalsApiService, AuthLocalDataSource authLocalDataSource) {
        return (AnalyticsRepository) Preconditions.checkNotNullFromProvides(CoreAnalyticsModule.Companion.provideAnnalsAnalyticsRepository(dispatcherProvider, coroutineScope, annalsApiService, authLocalDataSource));
    }
}
