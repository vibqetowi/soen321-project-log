package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class AudioEncoderConfig implements EncoderConfig {
    public abstract int getBitrate();

    public abstract int getChannelCount();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    public abstract int getSampleRate();

    public static Builder builder() {
        return new AutoValue_AudioEncoderConfig.Builder().setProfile(EncoderConfig.CODEC_PROFILE_NONE);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public MediaFormat toMediaFormat() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(getMimeType(), getSampleRate(), getChannelCount());
        createAudioFormat.setInteger("bitrate", getBitrate());
        if (getProfile() != CODEC_PROFILE_NONE) {
            if (getMimeType().equals(MimeTypes.AUDIO_AAC)) {
                createAudioFormat.setInteger("aac-profile", getProfile());
            } else {
                createAudioFormat.setInteger(Scopes.PROFILE, getProfile());
            }
        }
        return createAudioFormat;
    }

    /* loaded from: classes.dex */
    public static abstract class Builder {
        abstract AudioEncoderConfig autoBuild();

        public abstract Builder setBitrate(int i);

        public abstract Builder setChannelCount(int i);

        public abstract Builder setMimeType(String str);

        public abstract Builder setProfile(int i);

        public abstract Builder setSampleRate(int i);

        public AudioEncoderConfig build() {
            AudioEncoderConfig autoBuild = autoBuild();
            if (Objects.equals(autoBuild.getMimeType(), MimeTypes.AUDIO_AAC) && autoBuild.getProfile() == EncoderConfig.CODEC_PROFILE_NONE) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return autoBuild;
        }
    }
}
