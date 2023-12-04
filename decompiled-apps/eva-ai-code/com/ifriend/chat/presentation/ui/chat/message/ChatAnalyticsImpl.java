package com.ifriend.chat.presentation.ui.chat.message;

import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextModalUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickPlayUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiCompletedUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiPauseUseCase;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiStartPlayingUseCase;
import com.ifriend.ui.recyclerView.audio.ChatAnalytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J \u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/message/ChatAnalyticsImpl;", "Lcom/ifriend/ui/recyclerView/audio/ChatAnalytics;", "audioPause", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiPauseUseCase;", "audioClickPlay", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickPlayUseCase;", "audioStartPlaying", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiStartPlayingUseCase;", "audioCompleted", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiCompletedUseCase;", "audioClickConvertToTextModal", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextModalUseCase;", "audioClickConvertToTextMessage", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextMessageUseCase;", "(Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiPauseUseCase;Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickPlayUseCase;Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiStartPlayingUseCase;Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiCompletedUseCase;Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextModalUseCase;Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextMessageUseCase;)V", "", "messageId", "", "duration", "", "text", "position", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatAnalyticsImpl implements ChatAnalytics {
    public static final int $stable = 8;
    private final AnalyticsAudioAiClickConvertToTextMessageUseCase audioClickConvertToTextMessage;
    private final AnalyticsAudioAiClickConvertToTextModalUseCase audioClickConvertToTextModal;
    private final AnalyticsAudioAiClickPlayUseCase audioClickPlay;
    private final AnalyticsAudioAiCompletedUseCase audioCompleted;
    private final AnalyticsAudioAiPauseUseCase audioPause;
    private final AnalyticsAudioAiStartPlayingUseCase audioStartPlaying;

    @Inject
    public ChatAnalyticsImpl(AnalyticsAudioAiPauseUseCase audioPause, AnalyticsAudioAiClickPlayUseCase audioClickPlay, AnalyticsAudioAiStartPlayingUseCase audioStartPlaying, AnalyticsAudioAiCompletedUseCase audioCompleted, AnalyticsAudioAiClickConvertToTextModalUseCase audioClickConvertToTextModal, AnalyticsAudioAiClickConvertToTextMessageUseCase audioClickConvertToTextMessage) {
        Intrinsics.checkNotNullParameter(audioPause, "audioPause");
        Intrinsics.checkNotNullParameter(audioClickPlay, "audioClickPlay");
        Intrinsics.checkNotNullParameter(audioStartPlaying, "audioStartPlaying");
        Intrinsics.checkNotNullParameter(audioCompleted, "audioCompleted");
        Intrinsics.checkNotNullParameter(audioClickConvertToTextModal, "audioClickConvertToTextModal");
        Intrinsics.checkNotNullParameter(audioClickConvertToTextMessage, "audioClickConvertToTextMessage");
        this.audioPause = audioPause;
        this.audioClickPlay = audioClickPlay;
        this.audioStartPlaying = audioStartPlaying;
        this.audioCompleted = audioCompleted;
        this.audioClickConvertToTextModal = audioClickConvertToTextModal;
        this.audioClickConvertToTextMessage = audioClickConvertToTextMessage;
    }

    @Override // com.ifriend.ui.recyclerView.audio.ChatAnalytics
    public void audioPause(String messageId, long j, String text) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.audioPause.handle(messageId, j, text);
    }

    @Override // com.ifriend.ui.recyclerView.audio.ChatAnalytics
    public void audioClickPlay(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.audioClickPlay.handle(messageId);
    }

    @Override // com.ifriend.ui.recyclerView.audio.ChatAnalytics
    public void audioStartPlaying(String messageId, String text) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.audioStartPlaying.handle(messageId, text);
    }

    @Override // com.ifriend.ui.recyclerView.audio.ChatAnalytics
    public void audioCompleted(String messageId, long j, String text) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.audioCompleted.handle(messageId, j, text);
    }

    @Override // com.ifriend.ui.recyclerView.audio.ChatAnalytics
    public void audioClickConvertToTextModal(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.audioClickConvertToTextModal.handle(messageId);
    }

    @Override // com.ifriend.ui.recyclerView.audio.ChatAnalytics
    public void audioClickConvertToTextMessage(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.audioClickConvertToTextMessage.handle(messageId);
    }
}
