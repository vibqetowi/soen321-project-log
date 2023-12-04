package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;
/* loaded from: classes3.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {
    public AudioAttributesImplApi26() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        int volumeControlStream;
        volumeControlStream = this.mAudioAttributes.getVolumeControlStream();
        return volumeControlStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Builder extends AudioAttributesImplApi21.Builder {
        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(Object aa) {
            super(aa);
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.mFwkBuilder.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public Builder setUsage(int usage) {
            this.mFwkBuilder.setUsage(usage);
            return this;
        }
    }
}
