package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.InitialConfigurationBotsAvatarLoader;
import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialConfigurationBotsAvatarLoaderFactory implements Factory<InitialConfigurationBotsAvatarLoader> {
    private final Provider<AppImageLoaderRepository> appImageLoaderRepositoryProvider;
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final InitialDataLoadersModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public InitialDataLoadersModule_ProvideInitialConfigurationBotsAvatarLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatConfigsMemoryCachedSource> provider, Provider<UserRepository> provider2, Provider<AppImageLoaderRepository> provider3) {
        this.module = initialDataLoadersModule;
        this.chatConfigsMemoryCachedSourceProvider = provider;
        this.userRepositoryProvider = provider2;
        this.appImageLoaderRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public InitialConfigurationBotsAvatarLoader get() {
        return provideInitialConfigurationBotsAvatarLoader(this.module, this.chatConfigsMemoryCachedSourceProvider.get(), this.userRepositoryProvider.get(), this.appImageLoaderRepositoryProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialConfigurationBotsAvatarLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatConfigsMemoryCachedSource> provider, Provider<UserRepository> provider2, Provider<AppImageLoaderRepository> provider3) {
        return new InitialDataLoadersModule_ProvideInitialConfigurationBotsAvatarLoaderFactory(initialDataLoadersModule, provider, provider2, provider3);
    }

    public static InitialConfigurationBotsAvatarLoader provideInitialConfigurationBotsAvatarLoader(InitialDataLoadersModule initialDataLoadersModule, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, UserRepository userRepository, AppImageLoaderRepository appImageLoaderRepository) {
        return (InitialConfigurationBotsAvatarLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialConfigurationBotsAvatarLoader(chatConfigsMemoryCachedSource, userRepository, appImageLoaderRepository));
    }
}
