package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideRateAndReviewUsToggleFactory implements Factory<RateAndReviewUsToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;

    public SharedTogglesModule_ProvideRateAndReviewUsToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.module = sharedTogglesModule;
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RateAndReviewUsToggle get() {
        return provideRateAndReviewUsToggle(this.module, this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static SharedTogglesModule_ProvideRateAndReviewUsToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new SharedTogglesModule_ProvideRateAndReviewUsToggleFactory(sharedTogglesModule, provider, provider2);
    }

    public static RateAndReviewUsToggle provideRateAndReviewUsToggle(SharedTogglesModule sharedTogglesModule, AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return (RateAndReviewUsToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideRateAndReviewUsToggle(appConfigLocalDataSource, coroutineScope));
    }
}
