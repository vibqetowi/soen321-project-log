package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class GenerateBotAvatarErrorViewModel_Factory implements Factory<GenerateBotAvatarErrorViewModel> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;

    public GenerateBotAvatarErrorViewModel_Factory(Provider<CoroutineScope> provider, Provider<GenerateBotAvatarRepository> provider2, Provider<GenerateBotAvatarScreenFactory> provider3, Provider<Logger> provider4, Provider<RouterProvider> provider5, Provider<CoroutineDispatchers> provider6) {
        this.coroutineScopeProvider = provider;
        this.generateBotAvatarRepositoryProvider = provider2;
        this.generateBotAvatarScreenFactoryProvider = provider3;
        this.loggerProvider = provider4;
        this.routerProvider = provider5;
        this.dispatchersProvider = provider6;
    }

    @Override // javax.inject.Provider
    public GenerateBotAvatarErrorViewModel get() {
        return newInstance(this.coroutineScopeProvider.get(), this.generateBotAvatarRepositoryProvider.get(), this.generateBotAvatarScreenFactoryProvider.get(), this.loggerProvider.get(), this.routerProvider.get(), this.dispatchersProvider.get());
    }

    public static GenerateBotAvatarErrorViewModel_Factory create(Provider<CoroutineScope> provider, Provider<GenerateBotAvatarRepository> provider2, Provider<GenerateBotAvatarScreenFactory> provider3, Provider<Logger> provider4, Provider<RouterProvider> provider5, Provider<CoroutineDispatchers> provider6) {
        return new GenerateBotAvatarErrorViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static GenerateBotAvatarErrorViewModel newInstance(CoroutineScope coroutineScope, GenerateBotAvatarRepository generateBotAvatarRepository, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, Logger logger, RouterProvider routerProvider, CoroutineDispatchers coroutineDispatchers) {
        return new GenerateBotAvatarErrorViewModel(coroutineScope, generateBotAvatarRepository, generateBotAvatarScreenFactory, logger, routerProvider, coroutineDispatchers);
    }
}
