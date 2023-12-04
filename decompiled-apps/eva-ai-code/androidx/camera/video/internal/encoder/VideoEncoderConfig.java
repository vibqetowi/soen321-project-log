package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import com.google.android.gms.common.Scopes;
/* loaded from: classes.dex */
public abstract class VideoEncoderConfig implements EncoderConfig {
    private static final int VIDEO_COLOR_FORMAT_DEFAULT = 2130708361;
    private static final int VIDEO_INTRA_FRAME_INTERVAL_DEFAULT = 1;

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract VideoEncoderConfig build();

        public abstract Builder setBitrate(int i);

        public abstract Builder setColorFormat(int i);

        public abstract Builder setFrameRate(int i);

        public abstract Builder setIFrameInterval(int i);

        public abstract Builder setMimeType(String str);

        public abstract Builder setProfile(int i);

        public abstract Builder setResolution(Size size);
    }

    public abstract int getBitrate();

    public abstract int getColorFormat();

    public abstract int getFrameRate();

    public abstract int getIFrameInterval();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    public abstract Size getResolution();

    public static Builder builder() {
        return new AutoValue_VideoEncoderConfig.Builder().setProfile(EncoderConfig.CODEC_PROFILE_NONE).setIFrameInterval(1).setColorFormat(VIDEO_COLOR_FORMAT_DEFAULT);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public MediaFormat toMediaFormat() {
        Size resolution = getResolution();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(getMimeType(), resolution.getWidth(), resolution.getHeight());
        createVideoFormat.setInteger("color-format", getColorFormat());
        createVideoFormat.setInteger("bitrate", getBitrate());
        createVideoFormat.setInteger("frame-rate", getFrameRate());
        createVideoFormat.setInteger("i-frame-interval", getIFrameInterval());
        if (getProfile() != EncoderConfig.CODEC_PROFILE_NONE) {
            createVideoFormat.setInteger(Scopes.PROFILE, getProfile());
        }
        return createVideoFormat;
    }
}
