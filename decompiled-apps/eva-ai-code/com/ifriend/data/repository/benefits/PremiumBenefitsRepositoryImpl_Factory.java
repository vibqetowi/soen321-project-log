package com.ifriend.data.repository.benefits;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PremiumBenefitsRepositoryImpl_Factory implements Factory<PremiumBenefitsRepositoryImpl> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public PremiumBenefitsRepositoryImpl_Factory(Provider<AppConfigLocalDataSource> provider, Provider<ResourceProvider> provider2) {
        this.appConfigLocalDataSourceProvider = provider;
        this.resourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PremiumBenefitsRepositoryImpl get() {
        return newInstance(this.appConfigLocalDataSourceProvider.get(), this.resourceProvider.get());
    }

    public static PremiumBenefitsRepositoryImpl_Factory create(Provider<AppConfigLocalDataSource> provider, Provider<ResourceProvider> provider2) {
        return new PremiumBenefitsRepositoryImpl_Factory(provider, provider2);
    }

    public static PremiumBenefitsRepositoryImpl newInstance(AppConfigLocalDataSource appConfigLocalDataSource, ResourceProvider resourceProvider) {
        return new PremiumBenefitsRepositoryImpl(appConfigLocalDataSource, resourceProvider);
    }
}
