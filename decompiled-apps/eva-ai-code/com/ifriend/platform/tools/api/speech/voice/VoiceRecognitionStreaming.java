package com.ifriend.platform.tools.api.speech.voice;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: VoiceRecognitionStreaming.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH'J\b\u0010\u000b\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;", "", "streamingRecognizeFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/platform/tools/api/speech/voice/StreamingRecognize;", "getStreamingRecognizeFlow", "()Lkotlinx/coroutines/flow/Flow;", "pauseRecognition", "", "resumeRecognition", "startRecognition", "stopRecognition", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface VoiceRecognitionStreaming {
    Flow<StreamingRecognize> getStreamingRecognizeFlow();

    void pauseRecognition();

    void resumeRecognition();

    void startRecognition();

    void stopRecognition();
}
