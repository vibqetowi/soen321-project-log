package com.ifriend.app.di.modules;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
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
import com.ifriend.data.toggle.ChatGiftsStoreToggle;
import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.ChatsRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.services.initialData.TimeoutDataLoaderBuilder;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InitialDataLoadersModule.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J \u0010%\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H\u0007Jp\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0007J\u0010\u0010?\u001a\u0002072\u0006\u0010@\u001a\u00020AH\u0007J\u0010\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DH\u0007J\u0018\u0010E\u001a\u00020>2\u0006\u0010F\u001a\u00020G2\u0006\u0010C\u001a\u00020DH\u0007J\u0010\u0010H\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006I"}, d2 = {"Lcom/ifriend/app/di/modules/InitialDataLoadersModule;", "", "()V", "provideChatGiftsLoader", "Lcom/ifriend/data/initialLoaders/ChatGiftsLoader;", "chatGiftsRepository", "Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatGiftsStoreToggle", "Lcom/ifriend/data/toggle/ChatGiftsStoreToggle;", "provideConfigurationBotsLoader", "Lcom/ifriend/data/initialLoaders/ChatConfigurationLoader;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "provideDiaryLoader", "Lcom/ifriend/data/initialLoaders/DiaryLoader;", "diaryFeatureToggle", "Lcom/ifriend/data/toggle/DiaryFeatureToggle;", "diaryRepository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "provideInitialAvatarLoader", "Lcom/ifriend/data/initialLoaders/InitialAvatarLoader;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "avatarGenerationStatusStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatusStorage;", "provideInitialBotLoader", "Lcom/ifriend/data/initialLoaders/InitialBotLoader;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "provideInitialConfigurationBotsAvatarLoader", "Lcom/ifriend/data/initialLoaders/InitialConfigurationBotsAvatarLoader;", "appImageLoaderRepository", "Lcom/ifriend/domain/data/AppImageLoaderRepository;", "provideInitialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "userLoader", "Lcom/ifriend/data/initialLoaders/InitialUserLoader;", "botLoader", "tagsLoader", "Lcom/ifriend/data/initialLoaders/InitialTagsLoader;", "diaryLoader", "chatGiftsLoader", "levelInfoLoader", "Lcom/ifriend/data/initialLoaders/InitialLevelInfoLoader;", "avatarLoader", "configurationBotsAvatarLoader", "chatConfigurationLoader", "appConfigLoader", "Lcom/ifriend/data/initialLoaders/AppConfigLoader;", "userConfigLoader", "Lcom/ifriend/data/initialLoaders/InitialUserConfigLoader;", "provideInitialLevelInfoLoader", "levelsRepository", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "provideInitialTagsLoader", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "provideInitialUserConfigLoader", "chatsRepository", "Lcom/ifriend/domain/data/chat/ChatsRepository;", "provideInitialUserLoader", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule {
    @Provides
    @Singleton
    public final InitialDataLoader provideInitialDataLoader(CoroutineDispatchers dispatchers, Logger logger, InitialUserLoader userLoader, InitialBotLoader botLoader, InitialTagsLoader tagsLoader, DiaryLoader diaryLoader, ChatGiftsLoader chatGiftsLoader, InitialLevelInfoLoader levelInfoLoader, InitialAvatarLoader avatarLoader, InitialConfigurationBotsAvatarLoader configurationBotsAvatarLoader, ChatConfigurationLoader chatConfigurationLoader, AppConfigLoader appConfigLoader, InitialUserConfigLoader userConfigLoader) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(userLoader, "userLoader");
        Intrinsics.checkNotNullParameter(botLoader, "botLoader");
        Intrinsics.checkNotNullParameter(tagsLoader, "tagsLoader");
        Intrinsics.checkNotNullParameter(diaryLoader, "diaryLoader");
        Intrinsics.checkNotNullParameter(chatGiftsLoader, "chatGiftsLoader");
        Intrinsics.checkNotNullParameter(levelInfoLoader, "levelInfoLoader");
        Intrinsics.checkNotNullParameter(avatarLoader, "avatarLoader");
        Intrinsics.checkNotNullParameter(configurationBotsAvatarLoader, "configurationBotsAvatarLoader");
        Intrinsics.checkNotNullParameter(chatConfigurationLoader, "chatConfigurationLoader");
        Intrinsics.checkNotNullParameter(appConfigLoader, "appConfigLoader");
        Intrinsics.checkNotNullParameter(userConfigLoader, "userConfigLoader");
        return TimeoutDataLoaderBuilder.Companion.timeoutBlockingSection(dispatchers, logger, new InitialDataLoadersModule$provideInitialDataLoader$1(avatarLoader, configurationBotsAvatarLoader, userLoader, botLoader, tagsLoader, appConfigLoader, userConfigLoader, levelInfoLoader, diaryLoader, chatConfigurationLoader, chatGiftsLoader));
    }

    @Provides
    @Singleton
    public final InitialUserLoader provideInitialUserLoader(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new InitialUserLoader(userRepository);
    }

    @Provides
    @Singleton
    public final InitialBotLoader provideInitialBotLoader(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        return new InitialBotLoader(botRepository);
    }

    @Provides
    @Singleton
    public final InitialTagsLoader provideInitialTagsLoader(TagsProvider tagsProvider) {
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        return new InitialTagsLoader(tagsProvider);
    }

    @Provides
    @Singleton
    public final DiaryLoader provideDiaryLoader(DiaryFeatureToggle diaryFeatureToggle, DiaryRepository diaryRepository, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(diaryFeatureToggle, "diaryFeatureToggle");
        Intrinsics.checkNotNullParameter(diaryRepository, "diaryRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new DiaryLoader(diaryFeatureToggle, diaryRepository, userRepository);
    }

    @Provides
    @Singleton
    public final ChatConfigurationLoader provideConfigurationBotsLoader(ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, UserRepository userRepository, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, ChatsInfoRepository chatsInfoRepository, AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        return new ChatConfigurationLoader(chatConfigsMemoryCachedSource, userRepository, chatsInfoConfigurationRepository, chatsInfoRepository, analyticsInteractor);
    }

    @Provides
    @Singleton
    public final ChatGiftsLoader provideChatGiftsLoader(ChatGiftsRepository chatGiftsRepository, UserRepository userRepository, ChatGiftsStoreToggle chatGiftsStoreToggle) {
        Intrinsics.checkNotNullParameter(chatGiftsRepository, "chatGiftsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatGiftsStoreToggle, "chatGiftsStoreToggle");
        return new ChatGiftsLoader(chatGiftsRepository, userRepository, chatGiftsStoreToggle);
    }

    @Provides
    @Singleton
    public final InitialAvatarLoader provideInitialAvatarLoader(GenerateBotAvatarRepository generateBotAvatarRepository, AvatarGenerationStatusStorage avatarGenerationStatusStorage) {
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(avatarGenerationStatusStorage, "avatarGenerationStatusStorage");
        return new InitialAvatarLoader(generateBotAvatarRepository, avatarGenerationStatusStorage);
    }

    @Provides
    @Singleton
    public final InitialLevelInfoLoader provideInitialLevelInfoLoader(LevelsRepository levelsRepository) {
        Intrinsics.checkNotNullParameter(levelsRepository, "levelsRepository");
        return new InitialLevelInfoLoader(levelsRepository);
    }

    @Provides
    @Singleton
    public final InitialUserConfigLoader provideInitialUserConfigLoader(ChatsRepository chatsRepository, TagsProvider tagsProvider) {
        Intrinsics.checkNotNullParameter(chatsRepository, "chatsRepository");
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        return new InitialUserConfigLoader(chatsRepository, tagsProvider);
    }

    @Provides
    @Singleton
    public final InitialConfigurationBotsAvatarLoader provideInitialConfigurationBotsAvatarLoader(ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, UserRepository userRepository, AppImageLoaderRepository appImageLoaderRepository) {
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appImageLoaderRepository, "appImageLoaderRepository");
        return new InitialConfigurationBotsAvatarLoader(chatConfigsMemoryCachedSource, userRepository, appImageLoaderRepository);
    }
}
