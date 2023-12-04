package com.ifriend.domain.services.audio.recording;

import com.ifriend.domain.services.audio.recording.AudioRecorderState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AudioRecorderState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, d2 = {"isRecording", "", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", "(Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;)Z", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioRecorderStateKt {
    public static final boolean isRecording(AudioRecorderState audioRecorderState) {
        Intrinsics.checkNotNullParameter(audioRecorderState, "<this>");
        return audioRecorderState instanceof AudioRecorderState.Recording;
    }
}
