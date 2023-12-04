package androidx.camera.video;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class AudioStats {
    public static final int AUDIO_STATE_ACTIVE = 0;
    public static final int AUDIO_STATE_DISABLED = 1;
    public static final int AUDIO_STATE_ENCODER_ERROR = 3;
    public static final int AUDIO_STATE_SOURCE_SILENCED = 2;
    private static final Set<Integer> ERROR_STATES = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3)));

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AudioState {
    }

    public abstract int getAudioState();

    public abstract Throwable getErrorCause();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioStats of(int i, Throwable th) {
        return new AutoValue_AudioStats(i, th);
    }

    public boolean hasAudio() {
        return getAudioState() == 0;
    }

    public boolean hasError() {
        return ERROR_STATES.contains(Integer.valueOf(getAudioState()));
    }
}
