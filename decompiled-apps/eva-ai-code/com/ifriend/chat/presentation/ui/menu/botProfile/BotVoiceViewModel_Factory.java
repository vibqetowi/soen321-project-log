package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.useCases.bot.ChangeBotVoiceUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotVoiceViewModel_Factory implements Factory<BotVoiceViewModel> {
    private final Provider<AnalyticsEditBotUseCase> analyticsEditBotUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<AudioPlayer> audioPlayerProvider;
    private final Provider<ChangeBotVoiceUseCase> changeBotVoiceUseCaseProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<UserRepository> userRepositoryProvider;
    private final Provider<UserTokenProvider> userTokenProvider;

    public BotVoiceViewModel_Factory(Provider<GetBotUseCase> provider, Provider<ChangeBotVoiceUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<UserRepository> provider4, Provider<UserTokenProvider> provider5, Provider<AudioPlayer> provider6, Provider<RouterProvider> provider7, Provider<AppEventsEmitter> provider8) {
        this.getBotUseCaseProvider = provider;
        this.changeBotVoiceUseCaseProvider = provider2;
        this.analyticsEditBotUseCaseProvider = provider3;
        this.userRepositoryProvider = provider4;
        this.userTokenProvider = provider5;
        this.audioPlayerProvider = provider6;
        this.routerProvider = provider7;
        this.appEventsEmitterProvider = provider8;
    }

    @Override // javax.inject.Provider
    public BotVoiceViewModel get() {
        return newInstance(this.getBotUseCaseProvider.get(), this.changeBotVoiceUseCaseProvider.get(), this.analyticsEditBotUseCaseProvider.get(), this.userRepositoryProvider.get(), this.userTokenProvider.get(), this.audioPlayerProvider.get(), this.routerProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static BotVoiceViewModel_Factory create(Provider<GetBotUseCase> provider, Provider<ChangeBotVoiceUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<UserRepository> provider4, Provider<UserTokenProvider> provider5, Provider<AudioPlayer> provider6, Provider<RouterProvider> provider7, Provider<AppEventsEmitter> provider8) {
        return new BotVoiceViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static BotVoiceViewModel newInstance(GetBotUseCase getBotUseCase, ChangeBotVoiceUseCase changeBotVoiceUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, UserRepository userRepository, UserTokenProvider userTokenProvider, AudioPlayer audioPlayer, RouterProvider routerProvider, AppEventsEmitter appEventsEmitter) {
        return new BotVoiceViewModel(getBotUseCase, changeBotVoiceUseCase, analyticsEditBotUseCase, userRepository, userTokenProvider, audioPlayer, routerProvider, appEventsEmitter);
    }
}
