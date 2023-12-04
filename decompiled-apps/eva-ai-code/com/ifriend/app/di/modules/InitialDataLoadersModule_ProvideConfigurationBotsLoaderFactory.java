package com.ifriend.app.di.modules;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.data.initialLoaders.ChatConfigurationLoader;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideConfigurationBotsLoaderFactory implements Factory<ChatConfigurationLoader> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final InitialDataLoadersModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public InitialDataLoadersModule_ProvideConfigurationBotsLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatConfigsMemoryCachedSource> provider, Provider<UserRepository> provider2, Provider<ChatsInfoConfigurationRepository> provider3, Provider<ChatsInfoRepository> provider4, Provider<AnalyticsInteractor> provider5) {
        this.module = initialDataLoadersModule;
        this.chatConfigsMemoryCachedSourceProvider = provider;
        this.userRepositoryProvider = provider2;
        this.chatsInfoConfigurationRepositoryProvider = provider3;
        this.chatsInfoRepositoryProvider = provider4;
        this.analyticsInteractorProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ChatConfigurationLoader get() {
        return provideConfigurationBotsLoader(this.module, this.chatConfigsMemoryCachedSourceProvider.get(), this.userRepositoryProvider.get(), this.chatsInfoConfigurationRepositoryProvider.get(), this.chatsInfoRepositoryProvider.get(), this.analyticsInteractorProvider.get());
    }

    public static InitialDataLoadersModule_ProvideConfigurationBotsLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatConfigsMemoryCachedSource> provider, Provider<UserRepository> provider2, Provider<ChatsInfoConfigurationRepository> provider3, Provider<ChatsInfoRepository> provider4, Provider<AnalyticsInteractor> provider5) {
        return new InitialDataLoadersModule_ProvideConfigurationBotsLoaderFactory(initialDataLoadersModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ChatConfigurationLoader provideConfigurationBotsLoader(InitialDataLoadersModule initialDataLoadersModule, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, UserRepository userRepository, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, ChatsInfoRepository chatsInfoRepository, AnalyticsInteractor analyticsInteractor) {
        return (ChatConfigurationLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideConfigurationBotsLoader(chatConfigsMemoryCachedSource, userRepository, chatsInfoConfigurationRepository, chatsInfoRepository, analyticsInteractor));
    }
}
