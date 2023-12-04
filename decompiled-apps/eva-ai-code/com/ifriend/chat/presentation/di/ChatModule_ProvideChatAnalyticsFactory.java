package com.ifriend.chat.presentation.di;

import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickPlayUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiCompletedUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiPauseUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiStartPlayingUseCase;
import com.ifriend.ui.recyclerView.audio.ChatAnalytics;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatModule_ProvideChatAnalyticsFactory implements Factory<ChatAnalytics> {
    private final Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> audioClickConvertToTextMessageProvider;
    private final Provider<AnalyticsAudioAiClickConvertToTextModalUseCase> audioClickConvertToTextModalProvider;
    private final Provider<AnalyticsAudioAiClickPlayUseCase> audioClickPlayProvider;
    private final Provider<AnalyticsAudioAiCompletedUseCase> audioCompletedProvider;
    private final Provider<AnalyticsAudioAiPauseUseCase> audioPauseProvider;
    private final Provider<AnalyticsAudioAiStartPlayingUseCase> audioStartPlayingProvider;
    private final ChatModule module;

    public ChatModule_ProvideChatAnalyticsFactory(ChatModule chatModule, Provider<AnalyticsAudioAiPauseUseCase> provider, Provider<AnalyticsAudioAiClickPlayUseCase> provider2, Provider<AnalyticsAudioAiStartPlayingUseCase> provider3, Provider<AnalyticsAudioAiCompletedUseCase> provider4, Provider<AnalyticsAudioAiClickConvertToTextModalUseCase> provider5, Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> provider6) {
        this.module = chatModule;
        this.audioPauseProvider = provider;
        this.audioClickPlayProvider = provider2;
        this.audioStartPlayingProvider = provider3;
        this.audioCompletedProvider = provider4;
        this.audioClickConvertToTextModalProvider = provider5;
        this.audioClickConvertToTextMessageProvider = provider6;
    }

    @Override // javax.inject.Provider
    public ChatAnalytics get() {
        return provideChatAnalytics(this.module, this.audioPauseProvider.get(), this.audioClickPlayProvider.get(), this.audioStartPlayingProvider.get(), this.audioCompletedProvider.get(), this.audioClickConvertToTextModalProvider.get(), this.audioClickConvertToTextMessageProvider.get());
    }

    public static ChatModule_ProvideChatAnalyticsFactory create(ChatModule chatModule, Provider<AnalyticsAudioAiPauseUseCase> provider, Provider<AnalyticsAudioAiClickPlayUseCase> provider2, Provider<AnalyticsAudioAiStartPlayingUseCase> provider3, Provider<AnalyticsAudioAiCompletedUseCase> provider4, Provider<AnalyticsAudioAiClickConvertToTextModalUseCase> provider5, Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> provider6) {
        return new ChatModule_ProvideChatAnalyticsFactory(chatModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ChatAnalytics provideChatAnalytics(ChatModule chatModule, AnalyticsAudioAiPauseUseCase analyticsAudioAiPauseUseCase, AnalyticsAudioAiClickPlayUseCase analyticsAudioAiClickPlayUseCase, AnalyticsAudioAiStartPlayingUseCase analyticsAudioAiStartPlayingUseCase, AnalyticsAudioAiCompletedUseCase analyticsAudioAiCompletedUseCase, AnalyticsAudioAiClickConvertToTextModalUseCase analyticsAudioAiClickConvertToTextModalUseCase, AnalyticsAudioAiClickConvertToTextMessageUseCase analyticsAudioAiClickConvertToTextMessageUseCase) {
        return (ChatAnalytics) Preconditions.checkNotNullFromProvides(chatModule.provideChatAnalytics(analyticsAudioAiPauseUseCase, analyticsAudioAiClickPlayUseCase, analyticsAudioAiStartPlayingUseCase, analyticsAudioAiCompletedUseCase, analyticsAudioAiClickConvertToTextModalUseCase, analyticsAudioAiClickConvertToTextMessageUseCase));
    }
}
