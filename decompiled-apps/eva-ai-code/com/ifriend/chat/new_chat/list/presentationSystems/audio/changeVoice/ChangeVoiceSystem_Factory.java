package com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice;

import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiShowModalUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.temp.ChangeVoiceScreenFactory;
import com.ifriend.ui.base.modalMessage.ChooseVoicePopupDelegate;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeVoiceSystem_Factory implements Factory<ChangeVoiceSystem> {
    private final Provider<AnalyticsAudioAiShowModalUseCase> analyticsProvider;
    private final Provider<ChatAudioMessageFacade> audioMessageFacadeProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<AudioPlayer> playerProvider;
    private final Provider<ChooseVoicePopupDelegate> popupDelegateProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ChangeVoiceScreenFactory> screenFactoryProvider;

    public ChangeVoiceSystem_Factory(Provider<AudioPlayer> provider, Provider<ChatAudioMessageFacade> provider2, Provider<AnalyticsAudioAiShowModalUseCase> provider3, Provider<ChooseVoicePopupDelegate> provider4, Provider<ChangeVoiceScreenFactory> provider5, Provider<RouterProvider> provider6, Provider<GetBotUseCase> provider7) {
        this.playerProvider = provider;
        this.audioMessageFacadeProvider = provider2;
        this.analyticsProvider = provider3;
        this.popupDelegateProvider = provider4;
        this.screenFactoryProvider = provider5;
        this.routerProvider = provider6;
        this.getBotUseCaseProvider = provider7;
    }

    @Override // javax.inject.Provider
    public ChangeVoiceSystem get() {
        return newInstance(this.playerProvider.get(), this.audioMessageFacadeProvider.get(), this.analyticsProvider.get(), this.popupDelegateProvider.get(), this.screenFactoryProvider.get(), this.routerProvider.get(), this.getBotUseCaseProvider.get());
    }

    public static ChangeVoiceSystem_Factory create(Provider<AudioPlayer> provider, Provider<ChatAudioMessageFacade> provider2, Provider<AnalyticsAudioAiShowModalUseCase> provider3, Provider<ChooseVoicePopupDelegate> provider4, Provider<ChangeVoiceScreenFactory> provider5, Provider<RouterProvider> provider6, Provider<GetBotUseCase> provider7) {
        return new ChangeVoiceSystem_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static ChangeVoiceSystem newInstance(AudioPlayer audioPlayer, ChatAudioMessageFacade chatAudioMessageFacade, AnalyticsAudioAiShowModalUseCase analyticsAudioAiShowModalUseCase, ChooseVoicePopupDelegate chooseVoicePopupDelegate, ChangeVoiceScreenFactory changeVoiceScreenFactory, RouterProvider routerProvider, GetBotUseCase getBotUseCase) {
        return new ChangeVoiceSystem(audioPlayer, chatAudioMessageFacade, analyticsAudioAiShowModalUseCase, chooseVoicePopupDelegate, changeVoiceScreenFactory, routerProvider, getBotUseCase);
    }
}
