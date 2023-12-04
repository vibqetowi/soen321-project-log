package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.avatarGeneration.OpenGenerateBotAvatarUseCase;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotProfileViewModel_Factory implements Factory<BotProfileViewModel> {
    private final Provider<AnimatedAvatarFeatureToggle> animatedAvatarFeatureToggleProvider;
    private final Provider<AvatarAnimationEnabledStorage> avatarAnimationEnabledStorageProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<FeatureToggleRepository> featureToggleRepositoryProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<GetLevelInfoUseCase> getLevelInfoUseCaseProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MediaPlayerPlaybackControllerGenerator> mediaPlayerPlaybackControllerGeneratorProvider;
    private final Provider<OpenGenerateBotAvatarUseCase> openGenerateAvatarUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public BotProfileViewModel_Factory(Provider<Logger> provider, Provider<GetBotUseCase> provider2, Provider<GetUserUseCase> provider3, Provider<RouterProvider> provider4, Provider<AvatarAnimationEnabledStorage> provider5, Provider<FeatureToggleRepository> provider6, Provider<AnimatedAvatarFeatureToggle> provider7, Provider<GenerateBotAvatarRepository> provider8, Provider<OpenGenerateBotAvatarUseCase> provider9, Provider<MediaPlayerPlaybackControllerGenerator> provider10, Provider<GetLevelInfoUseCase> provider11, Provider<Context> provider12, Provider<CoroutineDispatchers> provider13) {
        this.loggerProvider = provider;
        this.getBotUseCaseProvider = provider2;
        this.getUserUseCaseProvider = provider3;
        this.routerProvider = provider4;
        this.avatarAnimationEnabledStorageProvider = provider5;
        this.featureToggleRepositoryProvider = provider6;
        this.animatedAvatarFeatureToggleProvider = provider7;
        this.generateBotAvatarRepositoryProvider = provider8;
        this.openGenerateAvatarUseCaseProvider = provider9;
        this.mediaPlayerPlaybackControllerGeneratorProvider = provider10;
        this.getLevelInfoUseCaseProvider = provider11;
        this.contextProvider = provider12;
        this.dispatchersProvider = provider13;
    }

    @Override // javax.inject.Provider
    public BotProfileViewModel get() {
        return newInstance(this.loggerProvider.get(), this.getBotUseCaseProvider.get(), this.getUserUseCaseProvider.get(), this.routerProvider.get(), this.avatarAnimationEnabledStorageProvider.get(), this.featureToggleRepositoryProvider.get(), this.animatedAvatarFeatureToggleProvider.get(), this.generateBotAvatarRepositoryProvider.get(), this.openGenerateAvatarUseCaseProvider.get(), this.mediaPlayerPlaybackControllerGeneratorProvider.get(), this.getLevelInfoUseCaseProvider.get(), this.contextProvider.get(), this.dispatchersProvider.get());
    }

    public static BotProfileViewModel_Factory create(Provider<Logger> provider, Provider<GetBotUseCase> provider2, Provider<GetUserUseCase> provider3, Provider<RouterProvider> provider4, Provider<AvatarAnimationEnabledStorage> provider5, Provider<FeatureToggleRepository> provider6, Provider<AnimatedAvatarFeatureToggle> provider7, Provider<GenerateBotAvatarRepository> provider8, Provider<OpenGenerateBotAvatarUseCase> provider9, Provider<MediaPlayerPlaybackControllerGenerator> provider10, Provider<GetLevelInfoUseCase> provider11, Provider<Context> provider12, Provider<CoroutineDispatchers> provider13) {
        return new BotProfileViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static BotProfileViewModel newInstance(Logger logger, GetBotUseCase getBotUseCase, GetUserUseCase getUserUseCase, RouterProvider routerProvider, AvatarAnimationEnabledStorage avatarAnimationEnabledStorage, FeatureToggleRepository featureToggleRepository, AnimatedAvatarFeatureToggle animatedAvatarFeatureToggle, GenerateBotAvatarRepository generateBotAvatarRepository, OpenGenerateBotAvatarUseCase openGenerateBotAvatarUseCase, MediaPlayerPlaybackControllerGenerator mediaPlayerPlaybackControllerGenerator, GetLevelInfoUseCase getLevelInfoUseCase, Context context, CoroutineDispatchers coroutineDispatchers) {
        return new BotProfileViewModel(logger, getBotUseCase, getUserUseCase, routerProvider, avatarAnimationEnabledStorage, featureToggleRepository, animatedAvatarFeatureToggle, generateBotAvatarRepository, openGenerateBotAvatarUseCase, mediaPlayerPlaybackControllerGenerator, getLevelInfoUseCase, context, coroutineDispatchers);
    }
}
