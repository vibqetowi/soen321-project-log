package androidx.camera.video.internal.config;

import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.video.internal.config.AutoValue_MimeInfo;
import androidx.camera.video.internal.encoder.EncoderConfig;
/* loaded from: classes.dex */
public abstract class MimeInfo {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract MimeInfo build();

        public abstract Builder setCompatibleCamcorderProfile(CamcorderProfileProxy camcorderProfileProxy);

        abstract Builder setMimeType(String str);

        public abstract Builder setProfile(int i);
    }

    public abstract CamcorderProfileProxy getCompatibleCamcorderProfile();

    public abstract String getMimeType();

    public abstract int getProfile();

    public static Builder builder(String str) {
        return new AutoValue_MimeInfo.Builder().setMimeType(str).setProfile(EncoderConfig.CODEC_PROFILE_NONE);
    }
}
