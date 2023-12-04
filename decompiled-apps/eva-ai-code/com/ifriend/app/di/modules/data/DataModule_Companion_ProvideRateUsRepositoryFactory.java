package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.RateUsApi;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.RateUsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideRateUsRepositoryFactory implements Factory<RateUsRepository> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<RateUsApi> rateUsApiProvider;

    public DataModule_Companion_ProvideRateUsRepositoryFactory(Provider<AuthDataProvider> provider, Provider<RateUsApi> provider2) {
        this.authDataProvider = provider;
        this.rateUsApiProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RateUsRepository get() {
        return provideRateUsRepository(this.authDataProvider.get(), this.rateUsApiProvider.get());
    }

    public static DataModule_Companion_ProvideRateUsRepositoryFactory create(Provider<AuthDataProvider> provider, Provider<RateUsApi> provider2) {
        return new DataModule_Companion_ProvideRateUsRepositoryFactory(provider, provider2);
    }

    public static RateUsRepository provideRateUsRepository(AuthDataProvider authDataProvider, RateUsApi rateUsApi) {
        return (RateUsRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideRateUsRepository(authDataProvider, rateUsApi));
    }
}
