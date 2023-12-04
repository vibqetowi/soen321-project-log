package com.ifriend.platform.tools.impl.speech;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import com.google.api.gax.rpc.ClientStream;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.StreamingRecognitionConfig;
import com.google.cloud.speech.v1.StreamingRecognizeRequest;
import com.google.protobuf.ByteString;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.platform.tools.api.speech.voice.StreamingRecognize;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
/* compiled from: VoiceRecognitionStreamingImpl.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020!H\u0003J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\fH\u0002J\u001a\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\fH\u0002J\b\u0010)\u001a\u00020!H\u0016J\b\u0010*\u001a\u00020!H\u0017J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ifriend/platform/tools/impl/speech/VoiceRecognitionStreamingImpl;", "Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;", "externalScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "speechClient", "Lcom/google/cloud/speech/v1/SpeechClient;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/google/cloud/speech/v1/SpeechClient;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "bufferSize", "", "getBufferSize", "()I", "bufferSize$delegate", "Lkotlin/Lazy;", "clientStream", "Lcom/google/api/gax/rpc/ClientStream;", "Lcom/google/cloud/speech/v1/StreamingRecognizeRequest;", "isStreamRecognize", "", "sampleRate", "getSampleRate", "streamingRecognizeFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/platform/tools/api/speech/voice/StreamingRecognize;", "getStreamingRecognizeFlow", "()Lkotlinx/coroutines/flow/Flow;", "voiceRecorder", "Landroid/media/AudioRecord;", "getStreamingRecognizeRequest", "initVoiceRecorder", "", "pauseRecognition", "processAudioSessionId", "audioSessionId", "recognize", "data", "", "size", "resumeRecognition", "startRecognition", "startRecording", "stopRecognition", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VoiceRecognitionStreamingImpl implements VoiceRecognitionStreaming {
    private static final int AUDIO_FORMAT = 2;
    private static final int CHANNEL_CONFIG = 16;
    public static final Companion Companion = new Companion(null);
    private static final String LANGUAGE_CODE = "en-US";
    private static final int SAMPLE_RATE = 16000;
    private final AnalyticsInteractor analyticsInteractor;
    private final Lazy bufferSize$delegate;
    private ClientStream<StreamingRecognizeRequest> clientStream;
    private final DispatcherProvider dispatcherProvider;
    private final CoroutineScope externalScope;
    private boolean isStreamRecognize;
    private final SpeechClient speechClient;
    private final Flow<StreamingRecognize> streamingRecognizeFlow;
    private AudioRecord voiceRecorder;

    @Inject
    public VoiceRecognitionStreamingImpl(CoroutineScope externalScope, DispatcherProvider dispatcherProvider, SpeechClient speechClient, AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(speechClient, "speechClient");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.externalScope = externalScope;
        this.dispatcherProvider = dispatcherProvider;
        this.speechClient = speechClient;
        this.analyticsInteractor = analyticsInteractor;
        this.isStreamRecognize = true;
        this.bufferSize$delegate = LazyKt.lazy(new VoiceRecognitionStreamingImpl$bufferSize$2(this));
        this.streamingRecognizeFlow = FlowKt.shareIn(FlowKt.callbackFlow(new VoiceRecognitionStreamingImpl$streamingRecognizeFlow$1(this, null)), externalScope, SharingStarted.Companion.getLazily(), 0);
    }

    /* compiled from: VoiceRecognitionStreamingImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/platform/tools/impl/speech/VoiceRecognitionStreamingImpl$Companion;", "", "()V", "AUDIO_FORMAT", "", "CHANNEL_CONFIG", "LANGUAGE_CODE", "", "SAMPLE_RATE", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBufferSize() {
        return ((Number) this.bufferSize$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSampleRate() {
        AudioRecord audioRecord = this.voiceRecorder;
        if (audioRecord != null) {
            return audioRecord.getSampleRate();
        }
        return 16000;
    }

    @Override // com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming
    public Flow<StreamingRecognize> getStreamingRecognizeFlow() {
        return this.streamingRecognizeFlow;
    }

    @Override // com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming
    public void startRecognition() {
        if (this.voiceRecorder != null) {
            return;
        }
        startRecording();
    }

    private final void startRecording() {
        BuildersKt__Builders_commonKt.launch$default(this.externalScope, this.dispatcherProvider.background(), null, new VoiceRecognitionStreamingImpl$startRecording$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recognize(byte[] bArr, int i) {
        ClientStream<StreamingRecognizeRequest> clientStream;
        if (this.isStreamRecognize && (clientStream = this.clientStream) != null) {
            clientStream.send(StreamingRecognizeRequest.newBuilder().setAudioContent(ByteString.copyFrom(bArr, 0, i)).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StreamingRecognizeRequest getStreamingRecognizeRequest() {
        StreamingRecognizeRequest build = StreamingRecognizeRequest.newBuilder().setStreamingConfig(StreamingRecognitionConfig.newBuilder().setConfig(RecognitionConfig.newBuilder().setLanguageCode(LANGUAGE_CODE).setEncoding(RecognitionConfig.AudioEncoding.LINEAR16).setSampleRateHertz(16000).setUseEnhanced(true).build()).setInterimResults(true).setSingleUtterance(false).build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initVoiceRecorder() {
        AudioRecord audioRecord = new AudioRecord(7, getSampleRate(), 16, 2, getBufferSize());
        this.voiceRecorder = audioRecord;
        Integer valueOf = Integer.valueOf(audioRecord.getAudioSessionId());
        if (valueOf == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        processAudioSessionId(valueOf.intValue());
    }

    private final void processAudioSessionId(int i) {
        if (NoiseSuppressor.isAvailable()) {
            NoiseSuppressor.create(i).setEnabled(true);
        }
        if (AcousticEchoCanceler.isAvailable()) {
            AcousticEchoCanceler.create(i).setEnabled(true);
        }
    }

    @Override // com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming
    public void stopRecognition() {
        AudioRecord audioRecord = this.voiceRecorder;
        if (audioRecord != null) {
            audioRecord.release();
        }
        this.voiceRecorder = null;
        ClientStream<StreamingRecognizeRequest> clientStream = this.clientStream;
        if (clientStream != null) {
            clientStream.closeSend();
        }
        this.clientStream = null;
    }

    @Override // com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming
    public void resumeRecognition() {
        this.isStreamRecognize = true;
    }

    @Override // com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming
    public void pauseRecognition() {
        this.isStreamRecognize = false;
    }
}
