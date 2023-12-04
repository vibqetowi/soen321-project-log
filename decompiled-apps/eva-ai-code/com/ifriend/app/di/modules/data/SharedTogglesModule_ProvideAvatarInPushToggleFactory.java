package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AvatarInPushToggle;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideAvatarInPushToggleFactory implements Factory<AvatarInPushToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;
    private final Provider<Preferences> preferencesProvider;

    public SharedTogglesModule_ProvideAvatarInPushToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2, Provider<Preferences> provider3) {
        this.module = sharedTogglesModule;
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.preferencesProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AvatarInPushToggle get() {
        return provideAvatarInPushToggle(this.module, this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get(), this.preferencesProvider.get());
    }

    public static SharedTogglesModule_ProvideAvatarInPushToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2, Provider<Preferences> provider3) {
        return new SharedTogglesModule_ProvideAvatarInPushToggleFactory(sharedTogglesModule, provider, provider2, provider3);
    }

    public static AvatarInPushToggle provideAvatarInPushToggle(SharedTogglesModule sharedTogglesModule, AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope, Preferences preferences) {
        return (AvatarInPushToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideAvatarInPushToggle(appConfigLocalDataSource, coroutineScope, preferences));
    }
}
