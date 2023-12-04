package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.AudioEncoderConfig;
/* loaded from: classes.dex */
final class AutoValue_AudioEncoderConfig extends AudioEncoderConfig {
    private final int bitrate;
    private final int channelCount;
    private final String mimeType;
    private final int profile;
    private final int sampleRate;

    private AutoValue_AudioEncoderConfig(String str, int i, int i2, int i3, int i4) {
        this.mimeType = str;
        this.profile = i;
        this.bitrate = i2;
        this.sampleRate = i3;
        this.channelCount = i4;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.profile;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getSampleRate() {
        return this.sampleRate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getChannelCount() {
        return this.channelCount;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.mimeType + ", profile=" + this.profile + ", bitrate=" + this.bitrate + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioEncoderConfig) {
            AudioEncoderConfig audioEncoderConfig = (AudioEncoderConfig) obj;
            return this.mimeType.equals(audioEncoderConfig.getMimeType()) && this.profile == audioEncoderConfig.getProfile() && this.bitrate == audioEncoderConfig.getBitrate() && this.sampleRate == audioEncoderConfig.getSampleRate() && this.channelCount == audioEncoderConfig.getChannelCount();
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.bitrate) * 1000003) ^ this.sampleRate) * 1000003) ^ this.channelCount;
    }

    /* loaded from: classes.dex */
    static final class Builder extends AudioEncoderConfig.Builder {
        private Integer bitrate;
        private Integer channelCount;
        private String mimeType;
        private Integer profile;
        private Integer sampleRate;

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setProfile(int i) {
            this.profile = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setBitrate(int i) {
            this.bitrate = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setSampleRate(int i) {
            this.sampleRate = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        AudioEncoderConfig autoBuild() {
            String str = this.mimeType == null ? " mimeType" : "";
            if (this.profile == null) {
                str = str + " profile";
            }
            if (this.bitrate == null) {
                str = str + " bitrate";
            }
            if (this.sampleRate == null) {
                str = str + " sampleRate";
            }
            if (this.channelCount == null) {
                str = str + " channelCount";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_AudioEncoderConfig(this.mimeType, this.profile.intValue(), this.bitrate.intValue(), this.sampleRate.intValue(), this.channelCount.intValue());
        }
    }
}
