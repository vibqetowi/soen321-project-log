package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AnimatedBackgroundFeatureToggle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideAnimatedBackgroundFeatureToggleFactory implements Factory<AnimatedBackgroundFeatureToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;

    public SharedTogglesModule_ProvideAnimatedBackgroundFeatureToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.module = sharedTogglesModule;
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnimatedBackgroundFeatureToggle get() {
        return provideAnimatedBackgroundFeatureToggle(this.module, this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static SharedTogglesModule_ProvideAnimatedBackgroundFeatureToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new SharedTogglesModule_ProvideAnimatedBackgroundFeatureToggleFactory(sharedTogglesModule, provider, provider2);
    }

    public static AnimatedBackgroundFeatureToggle provideAnimatedBackgroundFeatureToggle(SharedTogglesModule sharedTogglesModule, AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return (AnimatedBackgroundFeatureToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideAnimatedBackgroundFeatureToggle(appConfigLocalDataSource, coroutineScope));
    }
}
