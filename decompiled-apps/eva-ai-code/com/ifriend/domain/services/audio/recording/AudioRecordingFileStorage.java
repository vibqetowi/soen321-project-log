package com.ifriend.domain.services.audio.recording;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AudioRecordingFileStorage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecordingFileStorage;", "", "clear", "", "deleteLastFile", "generateFilePath", "", "getLastFilePath", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AudioRecordingFileStorage {
    boolean clear();

    boolean deleteLastFile();

    String generateFilePath();

    String getLastFilePath();
}
