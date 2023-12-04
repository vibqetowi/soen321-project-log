package com.ifriend.domain.services.audio.recording;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AudioRecordingStateProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecordingStateProvider;", "", "current", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", "stateFlow", "Lkotlinx/coroutines/flow/Flow;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AudioRecordingStateProvider {
    AudioRecorderState current();

    Flow<AudioRecorderState> stateFlow();
}
