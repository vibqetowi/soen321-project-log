package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
/* loaded from: classes2.dex */
public final class AudioAttributes implements Bundleable {
    private static final int FIELD_ALLOWED_CAPTURE_POLICY = 3;
    private static final int FIELD_CONTENT_TYPE = 0;
    private static final int FIELD_FLAGS = 1;
    private static final int FIELD_SPATIALIZATION_BEHAVIOR = 4;
    private static final int FIELD_USAGE = 2;
    public final int allowedCapturePolicy;
    private AudioAttributesV21 audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int spatializationBehavior;
    public final int usage;
    public static final AudioAttributes DEFAULT = new Builder().build();
    public static final Bundleable.Creator<AudioAttributes> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.audio.AudioAttributes$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return AudioAttributes.lambda$static$0(bundle);
        }
    };

    /* loaded from: classes2.dex */
    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(AudioAttributes audioAttributes) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(audioAttributes.contentType).setFlags(audioAttributes.flags).setUsage(audioAttributes.usage);
            if (Util.SDK_INT >= 29) {
                Api29.setAllowedCapturePolicy(usage, audioAttributes.allowedCapturePolicy);
            }
            if (Util.SDK_INT >= 32) {
                Api32.setSpatializationBehavior(usage, audioAttributes.spatializationBehavior);
            }
            this.audioAttributes = usage.build();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;
        private int allowedCapturePolicy = 1;
        private int spatializationBehavior = 0;

        public Builder setContentType(int i) {
            this.contentType = i;
            return this;
        }

        public Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public Builder setUsage(int i) {
            this.usage = i;
            return this;
        }

        public Builder setAllowedCapturePolicy(int i) {
            this.allowedCapturePolicy = i;
            return this;
        }

        public Builder setSpatializationBehavior(int i) {
            this.spatializationBehavior = i;
            return this;
        }

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy, this.spatializationBehavior);
        }
    }

    private AudioAttributes(int i, int i2, int i3, int i4, int i5) {
        this.contentType = i;
        this.flags = i2;
        this.usage = i3;
        this.allowedCapturePolicy = i4;
        this.spatializationBehavior = i5;
    }

    public AudioAttributesV21 getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            this.audioAttributesV21 = new AudioAttributesV21();
        }
        return this.audioAttributesV21;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy && this.spatializationBehavior == audioAttributes.spatializationBehavior;
    }

    public int hashCode() {
        return ((((((((527 + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy) * 31) + this.spatializationBehavior;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), this.contentType);
        bundle.putInt(keyForField(1), this.flags);
        bundle.putInt(keyForField(2), this.usage);
        bundle.putInt(keyForField(3), this.allowedCapturePolicy);
        bundle.putInt(keyForField(4), this.spatializationBehavior);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AudioAttributes lambda$static$0(Bundle bundle) {
        Builder builder = new Builder();
        if (bundle.containsKey(keyForField(0))) {
            builder.setContentType(bundle.getInt(keyForField(0)));
        }
        if (bundle.containsKey(keyForField(1))) {
            builder.setFlags(bundle.getInt(keyForField(1)));
        }
        if (bundle.containsKey(keyForField(2))) {
            builder.setUsage(bundle.getInt(keyForField(2)));
        }
        if (bundle.containsKey(keyForField(3))) {
            builder.setAllowedCapturePolicy(bundle.getInt(keyForField(3)));
        }
        if (bundle.containsKey(keyForField(4))) {
            builder.setSpatializationBehavior(bundle.getInt(keyForField(4)));
        }
        return builder.build();
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    /* loaded from: classes2.dex */
    private static final class Api29 {
        private Api29() {
        }

        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* loaded from: classes2.dex */
    private static final class Api32 {
        private Api32() {
        }

        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }
}
