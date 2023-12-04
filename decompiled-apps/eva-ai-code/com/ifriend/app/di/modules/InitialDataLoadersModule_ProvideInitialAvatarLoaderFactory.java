package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.InitialAvatarLoader;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialAvatarLoaderFactory implements Factory<InitialAvatarLoader> {
    private final Provider<AvatarGenerationStatusStorage> avatarGenerationStatusStorageProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final InitialDataLoadersModule module;

    public InitialDataLoadersModule_ProvideInitialAvatarLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<GenerateBotAvatarRepository> provider, Provider<AvatarGenerationStatusStorage> provider2) {
        this.module = initialDataLoadersModule;
        this.generateBotAvatarRepositoryProvider = provider;
        this.avatarGenerationStatusStorageProvider = provider2;
    }

    @Override // javax.inject.Provider
    public InitialAvatarLoader get() {
        return provideInitialAvatarLoader(this.module, this.generateBotAvatarRepositoryProvider.get(), this.avatarGenerationStatusStorageProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialAvatarLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<GenerateBotAvatarRepository> provider, Provider<AvatarGenerationStatusStorage> provider2) {
        return new InitialDataLoadersModule_ProvideInitialAvatarLoaderFactory(initialDataLoadersModule, provider, provider2);
    }

    public static InitialAvatarLoader provideInitialAvatarLoader(InitialDataLoadersModule initialDataLoadersModule, GenerateBotAvatarRepository generateBotAvatarRepository, AvatarGenerationStatusStorage avatarGenerationStatusStorage) {
        return (InitialAvatarLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialAvatarLoader(generateBotAvatarRepository, avatarGenerationStatusStorage));
    }
}
