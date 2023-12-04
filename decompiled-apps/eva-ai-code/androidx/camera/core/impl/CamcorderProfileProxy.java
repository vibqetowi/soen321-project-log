package androidx.camera.core.impl;

import android.media.CamcorderProfile;
import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes.dex */
public abstract class CamcorderProfileProxy {
    public static int CODEC_PROFILE_NONE = -1;

    public abstract int getAudioBitRate();

    public abstract int getAudioChannels();

    public abstract int getAudioCodec();

    public abstract int getAudioSampleRate();

    public abstract int getDuration();

    public abstract int getFileFormat();

    public abstract int getQuality();

    public abstract int getVideoBitRate();

    public abstract int getVideoCodec();

    public abstract int getVideoFrameHeight();

    public abstract int getVideoFrameRate();

    public abstract int getVideoFrameWidth();

    public static CamcorderProfileProxy create(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        return new AutoValue_CamcorderProfileProxy(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
    }

    public static CamcorderProfileProxy fromCamcorderProfile(CamcorderProfile camcorderProfile) {
        return new AutoValue_CamcorderProfileProxy(camcorderProfile.duration, camcorderProfile.quality, camcorderProfile.fileFormat, camcorderProfile.videoCodec, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, camcorderProfile.audioCodec, camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels);
    }

    public String getVideoCodecMimeType() {
        int videoCodec = getVideoCodec();
        if (videoCodec != 1) {
            if (videoCodec != 2) {
                if (videoCodec != 3) {
                    if (videoCodec != 4) {
                        if (videoCodec != 5) {
                            return null;
                        }
                        return MimeTypes.VIDEO_H265;
                    }
                    return MimeTypes.VIDEO_VP8;
                }
                return MimeTypes.VIDEO_MP4V;
            }
            return MimeTypes.VIDEO_H264;
        }
        return MimeTypes.VIDEO_H263;
    }

    public String getAudioCodecMimeType() {
        switch (getAudioCodec()) {
            case 1:
                return MimeTypes.AUDIO_AMR_NB;
            case 2:
                return MimeTypes.AUDIO_AMR_WB;
            case 3:
            case 4:
            case 5:
                return MimeTypes.AUDIO_AAC;
            case 6:
                return MimeTypes.AUDIO_VORBIS;
            case 7:
                return MimeTypes.AUDIO_OPUS;
            default:
                return null;
        }
    }

    public int getRequiredAudioProfile() {
        int audioCodec = getAudioCodec();
        if (audioCodec != 3) {
            if (audioCodec != 4) {
                if (audioCodec != 5) {
                    return CODEC_PROFILE_NONE;
                }
                return 39;
            }
            return 5;
        }
        return 2;
    }
}
