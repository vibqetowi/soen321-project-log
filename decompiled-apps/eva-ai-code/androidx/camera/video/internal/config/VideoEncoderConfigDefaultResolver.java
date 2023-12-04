package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.core.util.Supplier;
/* loaded from: classes.dex */
public class VideoEncoderConfigDefaultResolver implements Supplier<VideoEncoderConfig> {
    private static final String TAG = "VidEncCfgDefaultRslvr";
    private static final int VIDEO_BITRATE_BASE = 14000000;
    private static final int VIDEO_FRAME_RATE_BASE = 30;
    private static final Size VIDEO_SIZE_BASE = new Size(1280, 720);
    private final String mMimeType;
    private final Size mSurfaceSize;
    private final VideoSpec mVideoSpec;

    public VideoEncoderConfigDefaultResolver(String str, VideoSpec videoSpec, Size size) {
        this.mMimeType = str;
        this.mVideoSpec = videoSpec;
        this.mSurfaceSize = size;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public VideoEncoderConfig get() {
        int resolveFrameRate = VideoConfigUtil.resolveFrameRate(this.mVideoSpec);
        Range<Integer> bitrate = this.mVideoSpec.getBitrate();
        Logger.d(TAG, "Using fallback VIDEO bitrate");
        int width = this.mSurfaceSize.getWidth();
        Size size = VIDEO_SIZE_BASE;
        return VideoEncoderConfig.builder().setMimeType(this.mMimeType).setResolution(this.mSurfaceSize).setBitrate(VideoConfigUtil.scaleAndClampBitrate(VIDEO_BITRATE_BASE, resolveFrameRate, 30, width, size.getWidth(), this.mSurfaceSize.getHeight(), size.getHeight(), bitrate)).setFrameRate(resolveFrameRate).build();
    }
}
