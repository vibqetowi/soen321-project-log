package com.ifriend.data.repository.experiments;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class FeatureToggleRepositoryImpl_Factory implements Factory<FeatureToggleRepositoryImpl> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;

    public FeatureToggleRepositoryImpl_Factory(Provider<AppConfigLocalDataSource> provider, Provider<DispatcherProvider> provider2) {
        this.appConfigLocalDataSourceProvider = provider;
        this.dispatcherProvider = provider2;
    }

    @Override // javax.inject.Provider
    public FeatureToggleRepositoryImpl get() {
        return newInstance(this.appConfigLocalDataSourceProvider.get(), this.dispatcherProvider.get());
    }

    public static FeatureToggleRepositoryImpl_Factory create(Provider<AppConfigLocalDataSource> provider, Provider<DispatcherProvider> provider2) {
        return new FeatureToggleRepositoryImpl_Factory(provider, provider2);
    }

    public static FeatureToggleRepositoryImpl newInstance(AppConfigLocalDataSource appConfigLocalDataSource, DispatcherProvider dispatcherProvider) {
        return new FeatureToggleRepositoryImpl(appConfigLocalDataSource, dispatcherProvider);
    }
}
