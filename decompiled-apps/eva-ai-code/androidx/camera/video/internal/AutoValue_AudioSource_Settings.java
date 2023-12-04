package androidx.camera.video.internal;

import androidx.camera.video.internal.AudioSource;
/* loaded from: classes.dex */
final class AutoValue_AudioSource_Settings extends AudioSource.Settings {
    private final int audioFormat;
    private final int audioSource;
    private final int channelCount;
    private final int sampleRate;

    private AutoValue_AudioSource_Settings(int i, int i2, int i3, int i4) {
        this.audioSource = i;
        this.sampleRate = i2;
        this.channelCount = i3;
        this.audioFormat = i4;
    }

    @Override // androidx.camera.video.internal.AudioSource.Settings
    public int getAudioSource() {
        return this.audioSource;
    }

    @Override // androidx.camera.video.internal.AudioSource.Settings
    public int getSampleRate() {
        return this.sampleRate;
    }

    @Override // androidx.camera.video.internal.AudioSource.Settings
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.AudioSource.Settings
    public int getAudioFormat() {
        return this.audioFormat;
    }

    public String toString() {
        return "Settings{audioSource=" + this.audioSource + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", audioFormat=" + this.audioFormat + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSource.Settings) {
            AudioSource.Settings settings = (AudioSource.Settings) obj;
            return this.audioSource == settings.getAudioSource() && this.sampleRate == settings.getSampleRate() && this.channelCount == settings.getChannelCount() && this.audioFormat == settings.getAudioFormat();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.audioSource ^ 1000003) * 1000003) ^ this.sampleRate) * 1000003) ^ this.channelCount) * 1000003) ^ this.audioFormat;
    }

    @Override // androidx.camera.video.internal.AudioSource.Settings
    public AudioSource.Settings.Builder toBuilder() {
        return new Builder(this);
    }

    /* loaded from: classes.dex */
    static final class Builder extends AudioSource.Settings.Builder {
        private Integer audioFormat;
        private Integer audioSource;
        private Integer channelCount;
        private Integer sampleRate;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        private Builder(AudioSource.Settings settings) {
            this.audioSource = Integer.valueOf(settings.getAudioSource());
            this.sampleRate = Integer.valueOf(settings.getSampleRate());
            this.channelCount = Integer.valueOf(settings.getChannelCount());
            this.audioFormat = Integer.valueOf(settings.getAudioFormat());
        }

        @Override // androidx.camera.video.internal.AudioSource.Settings.Builder
        public AudioSource.Settings.Builder setAudioSource(int i) {
            this.audioSource = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.AudioSource.Settings.Builder
        public AudioSource.Settings.Builder setSampleRate(int i) {
            this.sampleRate = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.AudioSource.Settings.Builder
        public AudioSource.Settings.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.AudioSource.Settings.Builder
        public AudioSource.Settings.Builder setAudioFormat(int i) {
            this.audioFormat = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.AudioSource.Settings.Builder
        AudioSource.Settings autoBuild() {
            String str = this.audioSource == null ? " audioSource" : "";
            if (this.sampleRate == null) {
                str = str + " sampleRate";
            }
            if (this.channelCount == null) {
                str = str + " channelCount";
            }
            if (this.audioFormat == null) {
                str = str + " audioFormat";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_AudioSource_Settings(this.audioSource.intValue(), this.sampleRate.intValue(), this.channelCount.intValue(), this.audioFormat.intValue());
        }
    }
}
