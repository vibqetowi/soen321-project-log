package androidx.camera.video.internal.compat;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class Api29Impl {
    private Api29Impl() {
    }

    public static void registerAudioRecordingCallback(AudioRecord audioRecord, Executor executor, AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioManager$AudioRecordingCallback);
    }

    public static void unregisterAudioRecordingCallback(AudioRecord audioRecord, AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
    }

    public static boolean isClientSilenced(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }
}
