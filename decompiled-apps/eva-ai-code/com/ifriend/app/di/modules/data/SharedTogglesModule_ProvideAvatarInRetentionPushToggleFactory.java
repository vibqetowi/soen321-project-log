package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AvatarInRetentionPushToggle;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideAvatarInRetentionPushToggleFactory implements Factory<AvatarInRetentionPushToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;
    private final Provider<Preferences> preferencesProvider;

    public SharedTogglesModule_ProvideAvatarInRetentionPushToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2, Provider<Preferences> provider3) {
        this.module = sharedTogglesModule;
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.preferencesProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AvatarInRetentionPushToggle get() {
        return provideAvatarInRetentionPushToggle(this.module, this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get(), this.preferencesProvider.get());
    }

    public static SharedTogglesModule_ProvideAvatarInRetentionPushToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2, Provider<Preferences> provider3) {
        return new SharedTogglesModule_ProvideAvatarInRetentionPushToggleFactory(sharedTogglesModule, provider, provider2, provider3);
    }

    public static AvatarInRetentionPushToggle provideAvatarInRetentionPushToggle(SharedTogglesModule sharedTogglesModule, AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope, Preferences preferences) {
        return (AvatarInRetentionPushToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideAvatarInRetentionPushToggle(appConfigLocalDataSource, coroutineScope, preferences));
    }
}
