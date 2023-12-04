package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AnimatedAvatarOnChatToggle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideAnimatedAvatarOnChatToggleFactory implements Factory<AnimatedAvatarOnChatToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;

    public SharedTogglesModule_ProvideAnimatedAvatarOnChatToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.module = sharedTogglesModule;
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnimatedAvatarOnChatToggle get() {
        return provideAnimatedAvatarOnChatToggle(this.module, this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static SharedTogglesModule_ProvideAnimatedAvatarOnChatToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new SharedTogglesModule_ProvideAnimatedAvatarOnChatToggleFactory(sharedTogglesModule, provider, provider2);
    }

    public static AnimatedAvatarOnChatToggle provideAnimatedAvatarOnChatToggle(SharedTogglesModule sharedTogglesModule, AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return (AnimatedAvatarOnChatToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideAnimatedAvatarOnChatToggle(appConfigLocalDataSource, coroutineScope));
    }
}
