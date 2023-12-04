package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;
/* loaded from: classes.dex */
public final class AudioEncoderConfigDefaultResolver implements Supplier<AudioEncoderConfig> {
    private static final int AUDIO_BITRATE_BASE = 156000;
    private static final int AUDIO_CHANNEL_COUNT_BASE = 2;
    private static final int AUDIO_SAMPLE_RATE_BASE = 48000;
    private static final String TAG = "AudioEncCfgDefaultRslvr";
    private final int mAudioProfile;
    private final AudioSource.Settings mAudioSourceSettings;
    private final AudioSpec mAudioSpec;
    private final String mMimeType;

    public AudioEncoderConfigDefaultResolver(String str, int i, AudioSpec audioSpec, AudioSource.Settings settings) {
        this.mMimeType = str;
        this.mAudioProfile = i;
        this.mAudioSpec = audioSpec;
        this.mAudioSourceSettings = settings;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioEncoderConfig get() {
        Range<Integer> bitrate = this.mAudioSpec.getBitrate();
        Logger.d(TAG, "Using fallback AUDIO bitrate");
        return AudioEncoderConfig.builder().setMimeType(this.mMimeType).setProfile(this.mAudioProfile).setChannelCount(this.mAudioSourceSettings.getChannelCount()).setSampleRate(this.mAudioSourceSettings.getSampleRate()).setBitrate(AudioConfigUtil.scaleAndClampBitrate(AUDIO_BITRATE_BASE, this.mAudioSourceSettings.getChannelCount(), 2, this.mAudioSourceSettings.getSampleRate(), 48000, bitrate)).build();
    }
}
