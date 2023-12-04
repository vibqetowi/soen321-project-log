package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.core.util.Supplier;
/* loaded from: classes.dex */
public class VideoEncoderConfigCamcorderProfileResolver implements Supplier<VideoEncoderConfig> {
    private static final String TAG = "VidEncCmcrdrPrflRslvr";
    private final CamcorderProfileProxy mCamcorderProfile;
    private final String mMimeType;
    private final Size mSurfaceSize;
    private final VideoSpec mVideoSpec;

    public VideoEncoderConfigCamcorderProfileResolver(String str, VideoSpec videoSpec, Size size, CamcorderProfileProxy camcorderProfileProxy) {
        this.mMimeType = str;
        this.mVideoSpec = videoSpec;
        this.mSurfaceSize = size;
        this.mCamcorderProfile = camcorderProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public VideoEncoderConfig get() {
        int resolveFrameRate = VideoConfigUtil.resolveFrameRate(this.mVideoSpec);
        Range<Integer> bitrate = this.mVideoSpec.getBitrate();
        Logger.d(TAG, "Using resolved VIDEO bitrate from CamcorderProfile");
        return VideoEncoderConfig.builder().setMimeType(this.mMimeType).setResolution(this.mSurfaceSize).setBitrate(VideoConfigUtil.scaleAndClampBitrate(this.mCamcorderProfile.getVideoBitRate(), resolveFrameRate, this.mCamcorderProfile.getVideoFrameRate(), this.mSurfaceSize.getWidth(), this.mCamcorderProfile.getVideoFrameWidth(), this.mSurfaceSize.getHeight(), this.mCamcorderProfile.getVideoFrameHeight(), bitrate)).setFrameRate(resolveFrameRate).build();
    }
}
