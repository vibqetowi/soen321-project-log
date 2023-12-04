package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.AudioSource;
import androidx.core.util.Supplier;
/* loaded from: classes.dex */
public final class AudioSourceSettingsDefaultResolver implements Supplier<AudioSource.Settings> {
    private static final String TAG = "DefAudioSrcResolver";
    private final AudioSpec mAudioSpec;

    public AudioSourceSettingsDefaultResolver(AudioSpec audioSpec) {
        this.mAudioSpec = audioSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioSource.Settings get() {
        int selectSampleRateOrNearestSupported;
        int resolveAudioSource = AudioConfigUtil.resolveAudioSource(this.mAudioSpec);
        int resolveAudioSourceFormat = AudioConfigUtil.resolveAudioSourceFormat(this.mAudioSpec);
        int channelCount = this.mAudioSpec.getChannelCount();
        if (channelCount == -1) {
            Logger.d(TAG, "Using fallback AUDIO channel count: 1");
            channelCount = 1;
        } else {
            Logger.d(TAG, "Using supplied AUDIO channel count: " + channelCount);
        }
        Range<Integer> sampleRate = this.mAudioSpec.getSampleRate();
        if (AudioSpec.SAMPLE_RATE_RANGE_AUTO.equals(sampleRate)) {
            Logger.d(TAG, "Using fallback AUDIO sample rate: 44100Hz");
            selectSampleRateOrNearestSupported = 44100;
        } else {
            selectSampleRateOrNearestSupported = AudioConfigUtil.selectSampleRateOrNearestSupported(sampleRate, channelCount, resolveAudioSourceFormat, sampleRate.getUpper().intValue());
            Logger.d(TAG, "Using AUDIO sample rate resolved from AudioSpec: " + selectSampleRateOrNearestSupported + "Hz");
        }
        return AudioSource.Settings.builder().setAudioSource(resolveAudioSource).setAudioFormat(resolveAudioSourceFormat).setChannelCount(channelCount).setSampleRate(selectSampleRateOrNearestSupported).build();
    }
}
