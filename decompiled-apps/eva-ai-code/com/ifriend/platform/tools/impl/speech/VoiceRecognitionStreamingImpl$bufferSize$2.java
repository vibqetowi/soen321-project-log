package com.ifriend.platform.tools.impl.speech;

import android.media.AudioRecord;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VoiceRecognitionStreamingImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VoiceRecognitionStreamingImpl$bufferSize$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ VoiceRecognitionStreamingImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecognitionStreamingImpl$bufferSize$2(VoiceRecognitionStreamingImpl voiceRecognitionStreamingImpl) {
        super(0);
        this.this$0 = voiceRecognitionStreamingImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int sampleRate;
        sampleRate = this.this$0.getSampleRate();
        return Integer.valueOf(AudioRecord.getMinBufferSize(sampleRate, 16, 2));
    }
}
