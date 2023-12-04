package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.zxing.pdf417.PDF417Common;
import com.ifriend.internal_notifications.notification.HandlingStrategy;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.logging.LogFactory;
/* loaded from: classes2.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private int currentHeight;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private VideoFrameMetadataListener frameMetadataListener;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastBufferPresentationTimeUs;
    private long lastRenderRealtimeUs;
    private final int maxDroppedFramesToNotify;
    private boolean mayRenderFirstFrameAfterEnableIfNotStarted;
    private PlaceholderSurface placeholderSurface;
    private boolean renderedFirstFrameAfterEnable;
    private boolean renderedFirstFrameAfterReset;
    private VideoSize reportedVideoSize;
    private int scalingMode;
    private Surface surface;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private int videoFrameProcessingOffsetCount;

    private static boolean isBufferLate(long j) {
        return j < -30000;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < -500000;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return TAG;
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j) {
        this(context, mediaCodecSelector, j, null, null, 0);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, j, false, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i, float f) {
        super(2, factory, mediaCodecSelector, z, f);
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(applicationContext);
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.scalingMode = 1;
        this.tunnelingAudioSessionId = 0;
        clearReportedVideoSize();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return RendererCapabilities.CC.create(0);
        }
        boolean z2 = format.drmInitData != null;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(mediaCodecSelector, format, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return RendererCapabilities.CC.create(1);
        }
        if (!supportsFormatDrm(format)) {
            return RendererCapabilities.CC.create(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean isFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!isFormatSupported) {
            for (int i2 = 1; i2 < decoderInfos.size(); i2++) {
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i2);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    z = false;
                    isFormatSupported = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
            }
        }
        z = true;
        int i3 = isFormatSupported ? 4 : 3;
        int i4 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        int i5 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (isFormatSupported) {
            List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(mediaCodecSelector, format, z2, true);
            if (!decoderInfos2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo3 = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i = 32;
                }
            }
        }
        return RendererCapabilities.CC.create(i3, i4, i, i5, i6);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(mediaCodecSelector, format, z, this.tunneling), format);
    }

    private static List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        String str = format.sampleMimeType;
        if (str == null) {
            return ImmutableList.of();
        }
        List<MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(str, z, z2);
        String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType == null) {
            return ImmutableList.copyOf((Collection) decoderInfos);
        }
        return ImmutableList.builder().addAll((Iterable) decoderInfos).addAll((Iterable) mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z, z2)).build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().tunneling;
        Assertions.checkState((z3 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z3) {
            this.tunneling = z3;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        this.mayRenderFirstFrameAfterEnableIfNotStarted = z2;
        this.renderedFirstFrameAfterEnable = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        super.onPositionReset(j, z);
        clearRenderedFirstFrame();
        this.frameReleaseHelper.onPositionReset();
        this.lastBufferPresentationTimeUs = C.TIME_UNSET;
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && (this.renderedFirstFrameAfterReset || (((placeholderSurface = this.placeholderSurface) != null && this.surface == placeholderSurface) || getCodec() == null || this.tunneling))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        } else if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
                return true;
            }
            this.joiningDeadlineMs = C.TIME_UNSET;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderRealtimeUs = SystemClock.elapsedRealtime() * 1000;
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        this.frameReleaseHelper.onStarted();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        this.frameReleaseHelper.onStopped();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
        try {
            super.onReset();
        } finally {
            if (this.placeholderSurface != null) {
                releasePlaceholderSurface();
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            setOutput(obj);
        } else if (i == 7) {
            this.frameMetadataListener = (VideoFrameMetadataListener) obj;
        } else if (i == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.tunnelingAudioSessionId != intValue) {
                this.tunnelingAudioSessionId = intValue;
                if (this.tunneling) {
                    releaseCodec();
                }
            }
        } else if (i != 4) {
            if (i == 5) {
                this.frameReleaseHelper.setChangeFrameRateStrategy(((Integer) obj).intValue());
            } else {
                super.handleMessage(i, obj);
            }
        } else {
            this.scalingMode = ((Integer) obj).intValue();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.video.MediaCodecVideoRenderer] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void setOutput(Object obj) throws ExoPlaybackException {
        PlaceholderSurface placeholderSurface = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface2 = this.placeholderSurface;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUsePlaceholderSurface(codecInfo)) {
                    placeholderSurface = PlaceholderSurface.newInstanceV17(this.context, codecInfo.secure);
                    this.placeholderSurface = placeholderSurface;
                }
            }
        }
        if (this.surface != placeholderSurface) {
            this.surface = placeholderSurface;
            this.frameReleaseHelper.onSurfaceChanged(placeholderSurface);
            this.haveReportedFirstFrameRenderedForCurrentSurface = false;
            int state = getState();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                if (Util.SDK_INT >= 23 && placeholderSurface != null && !this.codecNeedsSetOutputSurfaceWorkaround) {
                    setOutputSurfaceV23(codec, placeholderSurface);
                } else {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                }
            }
            if (placeholderSurface != null && placeholderSurface != this.placeholderSurface) {
                maybeRenotifyVideoSizeChanged();
                clearRenderedFirstFrame();
                if (state == 2) {
                    setJoiningDeadlineMs();
                    return;
                }
                return;
            }
            clearReportedVideoSize();
            clearRenderedFirstFrame();
        } else if (placeholderSurface == null || placeholderSurface == this.placeholderSurface) {
        } else {
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return this.surface != null || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean getCodecNeedsEosPropagation() {
        return this.tunneling && Util.SDK_INT < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        if (this.surface == null) {
            if (!shouldUsePlaceholderSurface(mediaCodecInfo)) {
                throw new IllegalStateException();
            }
            if (this.placeholderSurface == null) {
                this.placeholderSurface = PlaceholderSurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.surface = this.placeholderSurface;
        }
        return MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, this.surface, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = canReuseCodec.discardReasons;
        if (format2.width > this.codecMaxValues.width || format2.height > this.codecMaxValues.height) {
            i |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > this.codecMaxValues.inputSize) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : canReuseCodec.result, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.buffersInCodecCount = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
        super.setPlaybackSpeed(f, f2);
        this.frameReleaseHelper.onPlaybackSpeed(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
        if (r3.equals(com.google.android.exoplayer2.util.MimeTypes.VIDEO_AV1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i;
        int intValue;
        int i2 = format.width;
        int i3 = format.height;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        String str = format.sampleMimeType;
        char c = 1;
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
            Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
            str = (codecProfileAndLevel == null || !((intValue = ((Integer) codecProfileAndLevel.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264;
        }
        str.hashCode();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(MimeTypes.VIDEO_H263)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals(MimeTypes.VIDEO_VP8)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 5:
                i = i2 * i3;
                i4 = 2;
                break;
            case 2:
            case 6:
                i = i2 * i3;
                break;
            case 4:
                if (!"BRAVIA 4K 2015".equals(Util.MODEL) && (!"Amazon".equals(Util.MANUFACTURER) || (!"KFSOWI".equals(Util.MODEL) && (!"AFTS".equals(Util.MODEL) || !mediaCodecInfo.secure)))) {
                    i = Util.ceilDivide(i2, 16) * Util.ceilDivide(i3, 16) * 16 * 16;
                    i4 = 2;
                    break;
                } else {
                    return -1;
                }
            default:
                return -1;
        }
        return (i * 3) / (i4 * 2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.frameRate;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        if (Util.SDK_INT < 23 || !this.tunneling) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23((MediaCodecAdapter) Assertions.checkNotNull(getCodec()));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecError(Exception exc) {
        Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged(formatHolder.format, onInputFormatChanged);
        return onInputFormatChanged;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (!this.tunneling) {
            this.buffersInCodecCount++;
        }
        if (Util.SDK_INT >= 23 || !this.tunneling) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            this.currentWidth = format.width;
            this.currentHeight = format.height;
        } else {
            Assertions.checkNotNull(mediaFormat);
            boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            if (z) {
                integer = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
            } else {
                integer = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            }
            this.currentWidth = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
            } else {
                integer2 = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            }
            this.currentHeight = integer2;
        }
        this.currentPixelWidthHeightRatio = format.pixelWidthHeightRatio;
        if (Util.SDK_INT >= 21) {
            if (format.rotationDegrees == 90 || format.rotationDegrees == 270) {
                int i = this.currentWidth;
                this.currentWidth = this.currentHeight;
                this.currentHeight = i;
                this.currentPixelWidthHeightRatio = 1.0f / this.currentPixelWidthHeightRatio;
            }
        } else {
            this.currentUnappliedRotationDegrees = format.rotationDegrees;
        }
        this.frameReleaseHelper.onFormatChanged(format.frameRate);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    setHdr10PlusInfoV29(getCodec(), bArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        boolean z3;
        long j4;
        Assertions.checkNotNull(mediaCodecAdapter);
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j;
        }
        if (j3 != this.lastBufferPresentationTimeUs) {
            this.frameReleaseHelper.onNextFrame(j3);
            this.lastBufferPresentationTimeUs = j3;
        }
        long outputStreamOffsetUs = getOutputStreamOffsetUs();
        long j5 = j3 - outputStreamOffsetUs;
        if (z && !z2) {
            skipOutputBuffer(mediaCodecAdapter, i, j5);
            return true;
        }
        double playbackSpeed = getPlaybackSpeed();
        boolean z4 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j6 = (long) ((j3 - j) / playbackSpeed);
        if (z4) {
            j6 -= elapsedRealtime - j2;
        }
        if (this.surface == this.placeholderSurface) {
            if (isBufferLate(j6)) {
                skipOutputBuffer(mediaCodecAdapter, i, j5);
                updateVideoFrameProcessingOffsetCounters(j6);
                return true;
            }
            return false;
        }
        long j7 = elapsedRealtime - this.lastRenderRealtimeUs;
        if (this.renderedFirstFrameAfterEnable ? this.renderedFirstFrameAfterReset : !(z4 || this.mayRenderFirstFrameAfterEnableIfNotStarted)) {
            j4 = j7;
            z3 = false;
        } else {
            z3 = true;
            j4 = j7;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET && j >= outputStreamOffsetUs && (z3 || (z4 && shouldForceRenderOutputBuffer(j6, j4)))) {
            long nanoTime = System.nanoTime();
            notifyFrameMetadataListener(j5, nanoTime, format);
            if (Util.SDK_INT >= 21) {
                renderOutputBufferV21(mediaCodecAdapter, i, j5, nanoTime);
            } else {
                renderOutputBuffer(mediaCodecAdapter, i, j5);
            }
            updateVideoFrameProcessingOffsetCounters(j6);
            return true;
        }
        if (z4 && j != this.initialPositionUs) {
            long nanoTime2 = System.nanoTime();
            long adjustReleaseTime = this.frameReleaseHelper.adjustReleaseTime((j6 * 1000) + nanoTime2);
            long j8 = (adjustReleaseTime - nanoTime2) / 1000;
            boolean z5 = this.joiningDeadlineMs != C.TIME_UNSET;
            if (shouldDropBuffersToKeyframe(j8, j2, z2) && maybeDropBuffersToKeyframe(j, z5)) {
                return false;
            }
            if (shouldDropOutputBuffer(j8, j2, z2)) {
                if (z5) {
                    skipOutputBuffer(mediaCodecAdapter, i, j5);
                } else {
                    dropOutputBuffer(mediaCodecAdapter, i, j5);
                }
                updateVideoFrameProcessingOffsetCounters(j8);
                return true;
            } else if (Util.SDK_INT >= 21) {
                if (j8 < 50000) {
                    notifyFrameMetadataListener(j5, adjustReleaseTime, format);
                    renderOutputBufferV21(mediaCodecAdapter, i, j5, adjustReleaseTime);
                    updateVideoFrameProcessingOffsetCounters(j8);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - HandlingStrategy.DEFAULT_TTL) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                notifyFrameMetadataListener(j5, adjustReleaseTime, format);
                renderOutputBuffer(mediaCodecAdapter, i, j5);
                updateVideoFrameProcessingOffsetCounters(j8);
                return true;
            }
        }
        return false;
    }

    private void notifyFrameMetadataListener(long j, long j2, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, getCodecOutputMediaFormat());
        }
    }

    protected void onProcessedTunneledBuffer(long j) throws ExoPlaybackException {
        updateOutputFormatForTime(j);
        maybeNotifyVideoSizeChanged();
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j) {
        super.onProcessedOutputBuffer(j);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        clearRenderedFirstFrame();
    }

    protected boolean shouldDropOutputBuffer(long j, long j2, boolean z) {
        return isBufferLate(j) && !z;
    }

    protected boolean shouldDropBuffersToKeyframe(long j, long j2, boolean z) {
        return isBufferVeryLate(j) && !z;
    }

    protected boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return isBufferLate(j) && j2 > 100000;
    }

    protected void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    protected void dropOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    protected boolean maybeDropBuffersToKeyframe(long j, boolean z) throws ExoPlaybackException {
        int skipSource = skipSource(j);
        if (skipSource == 0) {
            return false;
        }
        if (z) {
            this.decoderCounters.skippedInputBufferCount += skipSource;
            this.decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(skipSource, this.buffersInCodecCount);
        }
        flushOrReinitializeCodec();
        return true;
    }

    protected void updateDroppedBufferCounters(int i, int i2) {
        this.decoderCounters.droppedInputBufferCount += i;
        int i3 = i + i2;
        this.decoderCounters.droppedBufferCount += i3;
        this.droppedFrames += i3;
        this.consecutiveDroppedFrameCount += i3;
        this.decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(this.consecutiveDroppedFrameCount, this.decoderCounters.maxConsecutiveDroppedBufferCount);
        int i4 = this.maxDroppedFramesToNotify;
        if (i4 <= 0 || this.droppedFrames < i4) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    protected void updateVideoFrameProcessingOffsetCounters(long j) {
        this.decoderCounters.addVideoFrameProcessingOffset(j);
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount++;
    }

    protected void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, true);
        TraceUtil.endSection();
        this.lastRenderRealtimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    protected void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, j2);
        TraceUtil.endSection();
        this.lastRenderRealtimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    private boolean shouldUsePlaceholderSurface(MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 23 && !this.tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name) && (!mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported(this.context));
    }

    private void releasePlaceholderSurface() {
        Surface surface = this.surface;
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (surface == placeholderSurface) {
            this.surface = null;
        }
        placeholderSurface.release();
        this.placeholderSurface = null;
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    private void clearRenderedFirstFrame() {
        MediaCodecAdapter codec;
        this.renderedFirstFrameAfterReset = false;
        if (Util.SDK_INT < 23 || !this.tunneling || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
    }

    void maybeNotifyRenderedFirstFrame() {
        this.renderedFirstFrameAfterEnable = true;
        if (this.renderedFirstFrameAfterReset) {
            return;
        }
        this.renderedFirstFrameAfterReset = true;
        this.eventDispatcher.renderedFirstFrame(this.surface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.haveReportedFirstFrameRenderedForCurrentSurface) {
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void clearReportedVideoSize() {
        this.reportedVideoSize = null;
    }

    private void maybeNotifyVideoSizeChanged() {
        if (this.currentWidth == -1 && this.currentHeight == -1) {
            return;
        }
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null && videoSize.width == this.currentWidth && this.reportedVideoSize.height == this.currentHeight && this.reportedVideoSize.unappliedRotationDegrees == this.currentUnappliedRotationDegrees && this.reportedVideoSize.pixelWidthHeightRatio == this.currentPixelWidthHeightRatio) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(this.currentWidth, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
        this.reportedVideoSize = videoSize2;
        this.eventDispatcher.videoSizeChanged(videoSize2);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i = this.videoFrameProcessingOffsetCount;
        if (i != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private static void setHdr10PlusInfoV29(MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    protected void setOutputSurfaceV23(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    private static void configureTunnelingV21(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    protected MediaFormat getMediaFormat(Format format, String str, CodecMaxValues codecMaxValues, float f, boolean z, int i) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, format.width);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            configureTunnelingV21(mediaFormat, i);
        }
        return mediaFormat;
    }

    protected CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize;
        int i = format.width;
        int i2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new CodecMaxValues(i, i2, maxInputSize);
        }
        int length = formatArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            Format format2 = formatArr[i3];
            if (format.colorInfo != null && format2.colorInfo == null) {
                format2 = format2.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                z |= format2.width == -1 || format2.height == -1;
                i = Math.max(i, format2.width);
                i2 = Math.max(i2, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i = Math.max(i, codecMaxSize.x);
                i2 = Math.max(i2, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(i).setHeight(i2).build()));
                Log.w(TAG, "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new CodecMaxValues(i, i2, maxInputSize);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th, mediaCodecInfo, this.surface);
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int[] iArr;
        boolean z = format.height > format.width;
        int i = z ? format.height : format.width;
        int i2 = z ? format.width : format.height;
        float f = i2 / i;
        for (int i3 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i5, i3);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, format.frameRate)) {
                    return alignVideoSizeV21;
                }
            } else {
                try {
                    int ceilDivide = Util.ceilDivide(i3, 16) * 16;
                    int ceilDivide2 = Util.ceilDivide(i4, 16) * 16;
                    if (ceilDivide * ceilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                        int i6 = z ? ceilDivide2 : ceilDivide;
                        if (!z) {
                            ceilDivide = ceilDivide2;
                        }
                        return new Point(i6, ceilDivide);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    protected static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize != -1) {
            int size = format.initializationData.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += format.initializationData.get(i2).length;
            }
            return format.maxInputSize + i;
        }
        return getCodecMaxInputSize(mediaCodecInfo, format);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(Util.MANUFACTURER);
    }

    protected boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    protected Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.inputSize = i3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x07d9, code lost:
        if (r0.equals("PGN528") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0847, code lost:
        if (r0.equals("AFTN") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        boolean z;
        char c = 7;
        char c2 = 2;
        if (Util.SDK_INT <= 28) {
            String str = Util.DEVICE;
            str.hashCode();
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -760312546:
                    if (str.equals("aquaman")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            switch (z) {
                case false:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                    return true;
            }
        }
        if (Util.SDK_INT > 27 || !"HWEML".equals(Util.DEVICE)) {
            if (Util.SDK_INT <= 26) {
                String str2 = Util.DEVICE;
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (str2.equals("GIONEE_SWW1609")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2144781185:
                        if (str2.equals("GIONEE_SWW1627")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2144781160:
                        if (str2.equals("GIONEE_SWW1631")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2097309513:
                        if (str2.equals("K50a40")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2022874474:
                        if (str2.equals("CP8676_I02")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1978993182:
                        if (str2.equals("NX541J")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1978990237:
                        if (str2.equals("NX573J")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1936688988:
                        break;
                    case -1936688066:
                        if (str2.equals("PGN610")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1936688065:
                        if (str2.equals("PGN611")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1931988508:
                        if (str2.equals("AquaPowerM")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1885099851:
                        if (str2.equals("RAIJIN")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1696512866:
                        if (str2.equals("XT1663")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1680025915:
                        if (str2.equals("ComioS1")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1615810839:
                        if (str2.equals("Phantom6")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1600724499:
                        if (str2.equals("pacificrim")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1554255044:
                        if (str2.equals("vernee_M5")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1481772737:
                        if (str2.equals("panell_dl")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1481772730:
                        if (str2.equals("panell_ds")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1481772729:
                        if (str2.equals("panell_dt")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1320080169:
                        if (str2.equals("GiONEE_GBL7319")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1217592143:
                        if (str2.equals("BRAVIA_ATV2")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1180384755:
                        if (str2.equals("iris60")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1139198265:
                        if (str2.equals("Slate_Pro")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052835013:
                        if (str2.equals("namath")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case -993250464:
                        if (str2.equals("A10-70F")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -993250458:
                        if (str2.equals("A10-70L")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -965403638:
                        if (str2.equals("s905x018")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case -958336948:
                        if (str2.equals("ELUGA_Ray_X")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879245230:
                        if (str2.equals("tcl_eu")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case -842500323:
                        if (str2.equals("nicklaus_f")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -821392978:
                        if (str2.equals("A7000-a")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -797483286:
                        if (str2.equals("SVP-DTV15")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -794946968:
                        if (str2.equals("watson")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case -788334647:
                        if (str2.equals("whyred")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case -782144577:
                        if (str2.equals("OnePlus5T")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case -575125681:
                        if (str2.equals("GiONEE_CBL7513")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case -521118391:
                        if (str2.equals("GIONEE_GBL7360")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case -430914369:
                        if (str2.equals("Pixi4-7_3G")) {
                            c = Typography.amp;
                            break;
                        }
                        c = 65535;
                        break;
                    case -290434366:
                        if (str2.equals("taido_row")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case -282781963:
                        if (str2.equals("BLACK-1X")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case -277133239:
                        if (str2.equals("Z12_PRO")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case -173639913:
                        if (str2.equals("ELUGA_A3_Pro")) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case -56598463:
                        if (str2.equals("woods_fn")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2126:
                        if (str2.equals("C1")) {
                            c = ',';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2564:
                        if (str2.equals("Q5")) {
                            c = Soundex.SILENT_MARKER;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2715:
                        if (str2.equals("V1")) {
                            c = ClassUtils.PACKAGE_SEPARATOR_CHAR;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2719:
                        if (str2.equals("V5")) {
                            c = '/';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3091:
                        if (str2.equals("b5")) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3483:
                        if (str2.equals("mh")) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    case 73405:
                        if (str2.equals("JGZ")) {
                            c = '2';
                            break;
                        }
                        c = 65535;
                        break;
                    case 75537:
                        if (str2.equals("M04")) {
                            c = '3';
                            break;
                        }
                        c = 65535;
                        break;
                    case 75739:
                        if (str2.equals("M5c")) {
                            c = '4';
                            break;
                        }
                        c = 65535;
                        break;
                    case 76779:
                        if (str2.equals("MX6")) {
                            c = '5';
                            break;
                        }
                        c = 65535;
                        break;
                    case 78669:
                        if (str2.equals("P85")) {
                            c = '6';
                            break;
                        }
                        c = 65535;
                        break;
                    case 79305:
                        if (str2.equals("PLE")) {
                            c = '7';
                            break;
                        }
                        c = 65535;
                        break;
                    case 80618:
                        if (str2.equals("QX1")) {
                            c = '8';
                            break;
                        }
                        c = 65535;
                        break;
                    case 88274:
                        if (str2.equals("Z80")) {
                            c = '9';
                            break;
                        }
                        c = 65535;
                        break;
                    case 98846:
                        if (str2.equals("cv1")) {
                            c = AbstractJsonLexerKt.COLON;
                            break;
                        }
                        c = 65535;
                        break;
                    case 98848:
                        if (str2.equals("cv3")) {
                            c = ';';
                            break;
                        }
                        c = 65535;
                        break;
                    case 99329:
                        if (str2.equals("deb")) {
                            c = Typography.less;
                            break;
                        }
                        c = 65535;
                        break;
                    case 101481:
                        if (str2.equals("flo")) {
                            c = '=';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1513190:
                        if (str2.equals("1601")) {
                            c = Typography.greater;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1514184:
                        if (str2.equals("1713")) {
                            c = '?';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1514185:
                        if (str2.equals("1714")) {
                            c = '@';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2133089:
                        if (str2.equals("F01H")) {
                            c = 'A';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2133091:
                        if (str2.equals("F01J")) {
                            c = 'B';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2133120:
                        if (str2.equals("F02H")) {
                            c = 'C';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2133151:
                        if (str2.equals("F03H")) {
                            c = 'D';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2133182:
                        if (str2.equals("F04H")) {
                            c = 'E';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2133184:
                        if (str2.equals("F04J")) {
                            c = 'F';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2436959:
                        if (str2.equals("P681")) {
                            c = 'G';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2463773:
                        if (str2.equals("Q350")) {
                            c = 'H';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2464648:
                        if (str2.equals("Q427")) {
                            c = 'I';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2689555:
                        if (str2.equals("XE2X")) {
                            c = 'J';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3154429:
                        if (str2.equals("fugu")) {
                            c = 'K';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3284551:
                        if (str2.equals("kate")) {
                            c = 'L';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3351335:
                        if (str2.equals("mido")) {
                            c = 'M';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3386211:
                        if (str2.equals("p212")) {
                            c = 'N';
                            break;
                        }
                        c = 65535;
                        break;
                    case 41325051:
                        if (str2.equals("MEIZU_M5")) {
                            c = 'O';
                            break;
                        }
                        c = 65535;
                        break;
                    case 51349633:
                        if (str2.equals("601LV")) {
                            c = 'P';
                            break;
                        }
                        c = 65535;
                        break;
                    case 51350594:
                        if (str2.equals("602LV")) {
                            c = 'Q';
                            break;
                        }
                        c = 65535;
                        break;
                    case 55178625:
                        if (str2.equals("Aura_Note_2")) {
                            c = 'R';
                            break;
                        }
                        c = 65535;
                        break;
                    case 61542055:
                        if (str2.equals("A1601")) {
                            c = 'S';
                            break;
                        }
                        c = 65535;
                        break;
                    case 65355429:
                        if (str2.equals("E5643")) {
                            c = 'T';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66214468:
                        if (str2.equals("F3111")) {
                            c = 'U';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66214470:
                        if (str2.equals("F3113")) {
                            c = 'V';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66214473:
                        if (str2.equals("F3116")) {
                            c = 'W';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66215429:
                        if (str2.equals("F3211")) {
                            c = 'X';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66215431:
                        if (str2.equals("F3213")) {
                            c = 'Y';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66215433:
                        if (str2.equals("F3215")) {
                            c = 'Z';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66216390:
                        if (str2.equals("F3311")) {
                            c = AbstractJsonLexerKt.BEGIN_LIST;
                            break;
                        }
                        c = 65535;
                        break;
                    case 76402249:
                        if (str2.equals("PRO7S")) {
                            c = '\\';
                            break;
                        }
                        c = 65535;
                        break;
                    case 76404105:
                        if (str2.equals("Q4260")) {
                            c = AbstractJsonLexerKt.END_LIST;
                            break;
                        }
                        c = 65535;
                        break;
                    case 76404911:
                        if (str2.equals("Q4310")) {
                            c = '^';
                            break;
                        }
                        c = 65535;
                        break;
                    case 80963634:
                        if (str2.equals("V23GB")) {
                            c = '_';
                            break;
                        }
                        c = 65535;
                        break;
                    case 82882791:
                        if (str2.equals("X3_HK")) {
                            c = '`';
                            break;
                        }
                        c = 65535;
                        break;
                    case 98715550:
                        if (str2.equals("i9031")) {
                            c = 'a';
                            break;
                        }
                        c = 65535;
                        break;
                    case 101370885:
                        if (str2.equals("l5460")) {
                            c = 'b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 102844228:
                        if (str2.equals("le_x6")) {
                            c = 'c';
                            break;
                        }
                        c = 65535;
                        break;
                    case 165221241:
                        if (str2.equals("A2016a40")) {
                            c = 'd';
                            break;
                        }
                        c = 65535;
                        break;
                    case 182191441:
                        if (str2.equals("CPY83_I00")) {
                            c = 'e';
                            break;
                        }
                        c = 65535;
                        break;
                    case 245388979:
                        if (str2.equals("marino_f")) {
                            c = 'f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 287431619:
                        if (str2.equals("griffin")) {
                            c = 'g';
                            break;
                        }
                        c = 65535;
                        break;
                    case 307593612:
                        if (str2.equals("A7010a48")) {
                            c = 'h';
                            break;
                        }
                        c = 65535;
                        break;
                    case 308517133:
                        if (str2.equals("A7020a48")) {
                            c = 'i';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316215098:
                        if (str2.equals("TB3-730F")) {
                            c = 'j';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316215116:
                        if (str2.equals("TB3-730X")) {
                            c = 'k';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316246811:
                        if (str2.equals("TB3-850F")) {
                            c = 'l';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316246818:
                        if (str2.equals("TB3-850M")) {
                            c = 'm';
                            break;
                        }
                        c = 65535;
                        break;
                    case 407160593:
                        if (str2.equals("Pixi5-10_4G")) {
                            c = 'n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 507412548:
                        if (str2.equals("QM16XE_U")) {
                            c = 'o';
                            break;
                        }
                        c = 65535;
                        break;
                    case 793982701:
                        if (str2.equals("GIONEE_WBL5708")) {
                            c = 'p';
                            break;
                        }
                        c = 65535;
                        break;
                    case 794038622:
                        if (str2.equals("GIONEE_WBL7365")) {
                            c = 'q';
                            break;
                        }
                        c = 65535;
                        break;
                    case 794040393:
                        if (str2.equals("GIONEE_WBL7519")) {
                            c = 'r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 835649806:
                        if (str2.equals("manning")) {
                            c = 's';
                            break;
                        }
                        c = 65535;
                        break;
                    case 917340916:
                        if (str2.equals("A7000plus")) {
                            c = 't';
                            break;
                        }
                        c = 65535;
                        break;
                    case 958008161:
                        if (str2.equals("j2xlteins")) {
                            c = AbstractJsonLexerKt.UNICODE_ESC;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1060579533:
                        if (str2.equals("panell_d")) {
                            c = 'v';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1150207623:
                        if (str2.equals("LS-5017")) {
                            c = 'w';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1176899427:
                        if (str2.equals("itel_S41")) {
                            c = 'x';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1280332038:
                        if (str2.equals("hwALE-H")) {
                            c = 'y';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1306947716:
                        if (str2.equals("EverStar_S")) {
                            c = 'z';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1349174697:
                        if (str2.equals("htc_e56ml_dtul")) {
                            c = AbstractJsonLexerKt.BEGIN_OBJ;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1522194893:
                        if (str2.equals("woods_f")) {
                            c = '|';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1691543273:
                        if (str2.equals("CPH1609")) {
                            c = AbstractJsonLexerKt.END_OBJ;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1691544261:
                        if (str2.equals("CPH1715")) {
                            c = '~';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1709443163:
                        if (str2.equals("iball8735_9806")) {
                            c = Ascii.MAX;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1865889110:
                        if (str2.equals("santoni")) {
                            c = 128;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1906253259:
                        if (str2.equals("PB2-670M")) {
                            c = 129;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1977196784:
                        if (str2.equals("Infinix-X572")) {
                            c = 130;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2006372676:
                        if (str2.equals("BRAVIA_ATV3_4K")) {
                            c = 131;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2019281702:
                        if (str2.equals("DM-01K")) {
                            c = 132;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2029784656:
                        if (str2.equals("HWBLN-H")) {
                            c = 133;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2030379515:
                        if (str2.equals("HWCAM-H")) {
                            c = 134;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2033393791:
                        if (str2.equals("ASUS_X00AD_2")) {
                            c = 135;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2047190025:
                        if (str2.equals("ELUGA_Note")) {
                            c = 136;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2047252157:
                        if (str2.equals("ELUGA_Prim")) {
                            c = 137;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2048319463:
                        if (str2.equals("HWVNS-H")) {
                            c = 138;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2048855701:
                        if (str2.equals("HWWAS-H")) {
                            c = 139;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    case '2':
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case SSL.SSL_PROTOCOL_TLS /* 62 */:
                    case '?':
                    case '@':
                    case 'A':
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    case 'D':
                    case 'E':
                    case 'F':
                    case TsExtractor.TS_SYNC_BYTE /* 71 */:
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                    case '[':
                    case ModuleDescriptor.MODULE_VERSION /* 92 */:
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case LocationRequestCompat.QUALITY_LOW_POWER /* 104 */:
                    case 'i':
                    case 'j':
                    case 'k':
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '{':
                    case '|':
                    case '}':
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                    case 131:
                    case 132:
                    case 133:
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    case 136:
                    case 137:
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    case 139:
                        break;
                    default:
                        String str3 = Util.MODEL;
                        str3.hashCode();
                        switch (str3.hashCode()) {
                            case -594534941:
                                if (str3.equals("JSN-L21")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2006367:
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                        }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.handler = createHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, createHandlerForCurrentLooper);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j, long j2) {
            if (Util.SDK_INT < 30) {
                this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j >> 32), (int) j));
                return;
            }
            handleFrameRendered(j);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        private void handleFrameRendered(long j) {
            if (this != MediaCodecVideoRenderer.this.tunnelingOnFrameRenderedListener) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j);
            } catch (ExoPlaybackException e) {
                MediaCodecVideoRenderer.this.setPendingPlaybackException(e);
            }
        }
    }
}
