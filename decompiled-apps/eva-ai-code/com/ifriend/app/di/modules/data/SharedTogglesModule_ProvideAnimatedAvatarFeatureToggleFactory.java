package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideAnimatedAvatarFeatureToggleFactory implements Factory<AnimatedAvatarFeatureToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;

    public SharedTogglesModule_ProvideAnimatedAvatarFeatureToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.module = sharedTogglesModule;
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnimatedAvatarFeatureToggle get() {
        return provideAnimatedAvatarFeatureToggle(this.module, this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static SharedTogglesModule_ProvideAnimatedAvatarFeatureToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new SharedTogglesModule_ProvideAnimatedAvatarFeatureToggleFactory(sharedTogglesModule, provider, provider2);
    }

    public static AnimatedAvatarFeatureToggle provideAnimatedAvatarFeatureToggle(SharedTogglesModule sharedTogglesModule, AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return (AnimatedAvatarFeatureToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideAnimatedAvatarFeatureToggle(appConfigLocalDataSource, coroutineScope));
    }
}
