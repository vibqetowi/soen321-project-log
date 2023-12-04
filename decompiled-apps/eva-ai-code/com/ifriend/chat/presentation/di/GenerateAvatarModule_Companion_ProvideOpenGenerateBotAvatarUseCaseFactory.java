package com.ifriend.chat.presentation.di;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.avatarGeneration.OpenGenerateBotAvatarUseCase;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GenerateAvatarModule_Companion_ProvideOpenGenerateBotAvatarUseCaseFactory implements Factory<OpenGenerateBotAvatarUseCase> {
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;

    public GenerateAvatarModule_Companion_ProvideOpenGenerateBotAvatarUseCaseFactory(Provider<GenerateBotAvatarRepository> provider, Provider<RouterProvider> provider2, Provider<GenerateBotAvatarScreenFactory> provider3, Provider<Logger> provider4) {
        this.generateBotAvatarRepositoryProvider = provider;
        this.routerProvider = provider2;
        this.generateBotAvatarScreenFactoryProvider = provider3;
        this.loggerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public OpenGenerateBotAvatarUseCase get() {
        return provideOpenGenerateBotAvatarUseCase(this.generateBotAvatarRepositoryProvider.get(), this.routerProvider.get(), this.generateBotAvatarScreenFactoryProvider.get(), this.loggerProvider.get());
    }

    public static GenerateAvatarModule_Companion_ProvideOpenGenerateBotAvatarUseCaseFactory create(Provider<GenerateBotAvatarRepository> provider, Provider<RouterProvider> provider2, Provider<GenerateBotAvatarScreenFactory> provider3, Provider<Logger> provider4) {
        return new GenerateAvatarModule_Companion_ProvideOpenGenerateBotAvatarUseCaseFactory(provider, provider2, provider3, provider4);
    }

    public static OpenGenerateBotAvatarUseCase provideOpenGenerateBotAvatarUseCase(GenerateBotAvatarRepository generateBotAvatarRepository, RouterProvider routerProvider, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, Logger logger) {
        return (OpenGenerateBotAvatarUseCase) Preconditions.checkNotNullFromProvides(GenerateAvatarModule.Companion.provideOpenGenerateBotAvatarUseCase(generateBotAvatarRepository, routerProvider, generateBotAvatarScreenFactory, logger));
    }
}
