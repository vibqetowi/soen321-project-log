package com.ifriend.chat.presentation.ui.chat.message;

import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickPlayUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiCompletedUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiPauseUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiStartPlayingUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatAnalyticsImpl_Factory implements Factory<ChatAnalyticsImpl> {
    private final Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> audioClickConvertToTextMessageProvider;
    private final Provider<AnalyticsAudioAiClickConvertToTextModalUseCase> audioClickConvertToTextModalProvider;
    private final Provider<AnalyticsAudioAiClickPlayUseCase> audioClickPlayProvider;
    private final Provider<AnalyticsAudioAiCompletedUseCase> audioCompletedProvider;
    private final Provider<AnalyticsAudioAiPauseUseCase> audioPauseProvider;
    private final Provider<AnalyticsAudioAiStartPlayingUseCase> audioStartPlayingProvider;

    public ChatAnalyticsImpl_Factory(Provider<AnalyticsAudioAiPauseUseCase> provider, Provider<AnalyticsAudioAiClickPlayUseCase> provider2, Provider<AnalyticsAudioAiStartPlayingUseCase> provider3, Provider<AnalyticsAudioAiCompletedUseCase> provider4, Provider<AnalyticsAudioAiClickConvertToTextModalUseCase> provider5, Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> provider6) {
        this.audioPauseProvider = provider;
        this.audioClickPlayProvider = provider2;
        this.audioStartPlayingProvider = provider3;
        this.audioCompletedProvider = provider4;
        this.audioClickConvertToTextModalProvider = provider5;
        this.audioClickConvertToTextMessageProvider = provider6;
    }

    @Override // javax.inject.Provider
    public ChatAnalyticsImpl get() {
        return newInstance(this.audioPauseProvider.get(), this.audioClickPlayProvider.get(), this.audioStartPlayingProvider.get(), this.audioCompletedProvider.get(), this.audioClickConvertToTextModalProvider.get(), this.audioClickConvertToTextMessageProvider.get());
    }

    public static ChatAnalyticsImpl_Factory create(Provider<AnalyticsAudioAiPauseUseCase> provider, Provider<AnalyticsAudioAiClickPlayUseCase> provider2, Provider<AnalyticsAudioAiStartPlayingUseCase> provider3, Provider<AnalyticsAudioAiCompletedUseCase> provider4, Provider<AnalyticsAudioAiClickConvertToTextModalUseCase> provider5, Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> provider6) {
        return new ChatAnalyticsImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ChatAnalyticsImpl newInstance(AnalyticsAudioAiPauseUseCase analyticsAudioAiPauseUseCase, AnalyticsAudioAiClickPlayUseCase analyticsAudioAiClickPlayUseCase, AnalyticsAudioAiStartPlayingUseCase analyticsAudioAiStartPlayingUseCase, AnalyticsAudioAiCompletedUseCase analyticsAudioAiCompletedUseCase, AnalyticsAudioAiClickConvertToTextModalUseCase analyticsAudioAiClickConvertToTextModalUseCase, AnalyticsAudioAiClickConvertToTextMessageUseCase analyticsAudioAiClickConvertToTextMessageUseCase) {
        return new ChatAnalyticsImpl(analyticsAudioAiPauseUseCase, analyticsAudioAiClickPlayUseCase, analyticsAudioAiStartPlayingUseCase, analyticsAudioAiCompletedUseCase, analyticsAudioAiClickConvertToTextModalUseCase, analyticsAudioAiClickConvertToTextMessageUseCase);
    }
}
