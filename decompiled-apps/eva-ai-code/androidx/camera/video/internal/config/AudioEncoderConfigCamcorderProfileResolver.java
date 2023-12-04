package androidx.camera.video.internal.config;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;
/* loaded from: classes.dex */
public final class AudioEncoderConfigCamcorderProfileResolver implements Supplier<AudioEncoderConfig> {
    private static final String TAG = "AudioEncCmcrdrPrflRslvr";
    private final int mAudioProfile;
    private final AudioSource.Settings mAudioSourceSettings;
    private final AudioSpec mAudioSpec;
    private final CamcorderProfileProxy mCamcorderProfile;
    private final String mMimeType;

    public AudioEncoderConfigCamcorderProfileResolver(String str, int i, AudioSpec audioSpec, AudioSource.Settings settings, CamcorderProfileProxy camcorderProfileProxy) {
        this.mMimeType = str;
        this.mAudioProfile = i;
        this.mAudioSpec = audioSpec;
        this.mAudioSourceSettings = settings;
        this.mCamcorderProfile = camcorderProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public AudioEncoderConfig get() {
        Logger.d(TAG, "Using resolved AUDIO bitrate from CamcorderProfile");
        return AudioEncoderConfig.builder().setMimeType(this.mMimeType).setProfile(this.mAudioProfile).setChannelCount(this.mAudioSourceSettings.getChannelCount()).setSampleRate(this.mAudioSourceSettings.getSampleRate()).setBitrate(AudioConfigUtil.scaleAndClampBitrate(this.mCamcorderProfile.getAudioBitRate(), this.mAudioSourceSettings.getChannelCount(), this.mCamcorderProfile.getAudioChannels(), this.mAudioSourceSettings.getSampleRate(), this.mCamcorderProfile.getAudioSampleRate(), this.mAudioSpec.getBitrate())).build();
    }
}
