package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.ConfirmEmailFeatureToggle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideConfirmEmailFeatureToggleFactory implements Factory<ConfirmEmailFeatureToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;

    public SharedTogglesModule_ProvideConfirmEmailFeatureToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.module = sharedTogglesModule;
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ConfirmEmailFeatureToggle get() {
        return provideConfirmEmailFeatureToggle(this.module, this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static SharedTogglesModule_ProvideConfirmEmailFeatureToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new SharedTogglesModule_ProvideConfirmEmailFeatureToggleFactory(sharedTogglesModule, provider, provider2);
    }

    public static ConfirmEmailFeatureToggle provideConfirmEmailFeatureToggle(SharedTogglesModule sharedTogglesModule, AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return (ConfirmEmailFeatureToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideConfirmEmailFeatureToggle(appConfigLocalDataSource, coroutineScope));
    }
}
