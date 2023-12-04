package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.initialLoaders.AppConfigLoader;
import com.ifriend.data.initialLoaders.ChatConfigurationLoader;
import com.ifriend.data.initialLoaders.ChatGiftsLoader;
import com.ifriend.data.initialLoaders.DiaryLoader;
import com.ifriend.data.initialLoaders.InitialAvatarLoader;
import com.ifriend.data.initialLoaders.InitialBotLoader;
import com.ifriend.data.initialLoaders.InitialConfigurationBotsAvatarLoader;
import com.ifriend.data.initialLoaders.InitialLevelInfoLoader;
import com.ifriend.data.initialLoaders.InitialTagsLoader;
import com.ifriend.data.initialLoaders.InitialUserConfigLoader;
import com.ifriend.data.initialLoaders.InitialUserLoader;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialDataLoaderFactory implements Factory<InitialDataLoader> {
    private final Provider<AppConfigLoader> appConfigLoaderProvider;
    private final Provider<InitialAvatarLoader> avatarLoaderProvider;
    private final Provider<InitialBotLoader> botLoaderProvider;
    private final Provider<ChatConfigurationLoader> chatConfigurationLoaderProvider;
    private final Provider<ChatGiftsLoader> chatGiftsLoaderProvider;
    private final Provider<InitialConfigurationBotsAvatarLoader> configurationBotsAvatarLoaderProvider;
    private final Provider<DiaryLoader> diaryLoaderProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<InitialLevelInfoLoader> levelInfoLoaderProvider;
    private final Provider<Logger> loggerProvider;
    private final InitialDataLoadersModule module;
    private final Provider<InitialTagsLoader> tagsLoaderProvider;
    private final Provider<InitialUserConfigLoader> userConfigLoaderProvider;
    private final Provider<InitialUserLoader> userLoaderProvider;

    public InitialDataLoadersModule_ProvideInitialDataLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<CoroutineDispatchers> provider, Provider<Logger> provider2, Provider<InitialUserLoader> provider3, Provider<InitialBotLoader> provider4, Provider<InitialTagsLoader> provider5, Provider<DiaryLoader> provider6, Provider<ChatGiftsLoader> provider7, Provider<InitialLevelInfoLoader> provider8, Provider<InitialAvatarLoader> provider9, Provider<InitialConfigurationBotsAvatarLoader> provider10, Provider<ChatConfigurationLoader> provider11, Provider<AppConfigLoader> provider12, Provider<InitialUserConfigLoader> provider13) {
        this.module = initialDataLoadersModule;
        this.dispatchersProvider = provider;
        this.loggerProvider = provider2;
        this.userLoaderProvider = provider3;
        this.botLoaderProvider = provider4;
        this.tagsLoaderProvider = provider5;
        this.diaryLoaderProvider = provider6;
        this.chatGiftsLoaderProvider = provider7;
        this.levelInfoLoaderProvider = provider8;
        this.avatarLoaderProvider = provider9;
        this.configurationBotsAvatarLoaderProvider = provider10;
        this.chatConfigurationLoaderProvider = provider11;
        this.appConfigLoaderProvider = provider12;
        this.userConfigLoaderProvider = provider13;
    }

    @Override // javax.inject.Provider
    public InitialDataLoader get() {
        return provideInitialDataLoader(this.module, this.dispatchersProvider.get(), this.loggerProvider.get(), this.userLoaderProvider.get(), this.botLoaderProvider.get(), this.tagsLoaderProvider.get(), this.diaryLoaderProvider.get(), this.chatGiftsLoaderProvider.get(), this.levelInfoLoaderProvider.get(), this.avatarLoaderProvider.get(), this.configurationBotsAvatarLoaderProvider.get(), this.chatConfigurationLoaderProvider.get(), this.appConfigLoaderProvider.get(), this.userConfigLoaderProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialDataLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<CoroutineDispatchers> provider, Provider<Logger> provider2, Provider<InitialUserLoader> provider3, Provider<InitialBotLoader> provider4, Provider<InitialTagsLoader> provider5, Provider<DiaryLoader> provider6, Provider<ChatGiftsLoader> provider7, Provider<InitialLevelInfoLoader> provider8, Provider<InitialAvatarLoader> provider9, Provider<InitialConfigurationBotsAvatarLoader> provider10, Provider<ChatConfigurationLoader> provider11, Provider<AppConfigLoader> provider12, Provider<InitialUserConfigLoader> provider13) {
        return new InitialDataLoadersModule_ProvideInitialDataLoaderFactory(initialDataLoadersModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static InitialDataLoader provideInitialDataLoader(InitialDataLoadersModule initialDataLoadersModule, CoroutineDispatchers coroutineDispatchers, Logger logger, InitialUserLoader initialUserLoader, InitialBotLoader initialBotLoader, InitialTagsLoader initialTagsLoader, DiaryLoader diaryLoader, ChatGiftsLoader chatGiftsLoader, InitialLevelInfoLoader initialLevelInfoLoader, InitialAvatarLoader initialAvatarLoader, InitialConfigurationBotsAvatarLoader initialConfigurationBotsAvatarLoader, ChatConfigurationLoader chatConfigurationLoader, AppConfigLoader appConfigLoader, InitialUserConfigLoader initialUserConfigLoader) {
        return (InitialDataLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialDataLoader(coroutineDispatchers, logger, initialUserLoader, initialBotLoader, initialTagsLoader, diaryLoader, chatGiftsLoader, initialLevelInfoLoader, initialAvatarLoader, initialConfigurationBotsAvatarLoader, chatConfigurationLoader, appConfigLoader, initialUserConfigLoader));
    }
}
