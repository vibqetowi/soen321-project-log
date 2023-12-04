package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.AudioSource;
import androidx.core.util.Supplier;
/* loaded from: classes.dex */
public final class AudioSourceSettingsCamcorderProfileResolver implements Supplier<AudioSource.Settings> {
    private static final String TAG = "AudioSrcCmcrdrPrflRslvr";
    private final AudioSpec mAudioSpec;
    private final CamcorderProfileProxy mCamcorderProfile;

    public AudioSourceSettingsCamcorderProfileResolver(AudioSpec audioSpec, CamcorderProfileProxy camcorderProfileProxy) {
        this.mAudioSpec = audioSpec;
        this.mCamcorderProfile = camcorderProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioSource.Settings get() {
        int resolveAudioSource = AudioConfigUtil.resolveAudioSource(this.mAudioSpec);
        int resolveAudioSourceFormat = AudioConfigUtil.resolveAudioSourceFormat(this.mAudioSpec);
        int channelCount = this.mAudioSpec.getChannelCount();
        Range<Integer> sampleRate = this.mAudioSpec.getSampleRate();
        int audioChannels = this.mCamcorderProfile.getAudioChannels();
        if (channelCount == -1) {
            Logger.d(TAG, "Resolved AUDIO channel count from CamcorderProfile: " + audioChannels);
            channelCount = audioChannels;
        } else {
            Logger.d(TAG, "Media spec AUDIO channel count overrides CamcorderProfile [CamcorderProfile channel count: " + audioChannels + ", Resolved Channel Count: " + channelCount + "]");
        }
        int audioSampleRate = this.mCamcorderProfile.getAudioSampleRate();
        int selectSampleRateOrNearestSupported = AudioConfigUtil.selectSampleRateOrNearestSupported(sampleRate, channelCount, resolveAudioSourceFormat, audioSampleRate);
        Logger.d(TAG, "Using resolved AUDIO sample rate or nearest supported from CamcorderProfile: " + selectSampleRateOrNearestSupported + "Hz. [CamcorderProfile sample rate: " + audioSampleRate + "Hz]");
        return AudioSource.Settings.builder().setAudioSource(resolveAudioSource).setAudioFormat(resolveAudioSourceFormat).setChannelCount(channelCount).setSampleRate(selectSampleRateOrNearestSupported).build();
    }
}
