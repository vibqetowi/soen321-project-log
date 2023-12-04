package androidx.camera.video.internal.workaround;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.core.util.Preconditions;
import java.io.IOException;
/* loaded from: classes.dex */
public class EncoderFinder {
    private static final String TAG = "EncoderFinder";
    private final boolean mShouldRemoveKeyFrameRate;

    public EncoderFinder() {
        this.mShouldRemoveKeyFrameRate = ((MediaFormatMustNotUseFrameRateToFindEncoderQuirk) DeviceQuirks.get(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class)) != null;
    }

    public MediaCodec findEncoder(MediaFormat mediaFormat, MediaCodecList mediaCodecList) throws InvalidConfigException {
        String findEncoderForFormat = findEncoderForFormat(mediaFormat, mediaCodecList);
        try {
            if (TextUtils.isEmpty(findEncoderForFormat)) {
                String string = mediaFormat.getString("mime");
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                Logger.w(TAG, String.format("No encoder found that supports requested MediaFormat %s. Create encoder by MIME type. Dump codec info:\n%s", mediaFormat, DebugUtils.dumpCodecCapabilities(string, createEncoderByType, mediaFormat)));
                return createEncoderByType;
            }
            return MediaCodec.createByCodecName(findEncoderForFormat);
        } catch (IOException | IllegalArgumentException | NullPointerException e) {
            boolean shouldCreateCodecByType = shouldCreateCodecByType(mediaFormat);
            String dumpMediaCodecListForFormat = DebugUtils.dumpMediaCodecListForFormat(mediaCodecList, mediaFormat);
            throw new InvalidConfigException("Encoder cannot created: " + findEncoderForFormat + ", isMediaFormatInQuirk: " + shouldCreateCodecByType + "\n" + dumpMediaCodecListForFormat, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String findEncoderForFormat(MediaFormat mediaFormat, MediaCodecList mediaCodecList) {
        Integer num;
        Integer num2;
        Integer num3 = null;
        try {
            if (this.mShouldRemoveKeyFrameRate && mediaFormat.containsKey("frame-rate")) {
                num2 = Integer.valueOf(mediaFormat.getInteger("frame-rate"));
                try {
                    mediaFormat.setString("frame-rate", null);
                } catch (Throwable th) {
                    th = th;
                    num = num3;
                    num3 = num2;
                    if (num3 != null) {
                    }
                    if (num != null) {
                    }
                    throw th;
                }
            } else {
                num2 = null;
            }
            if (Build.VERSION.SDK_INT <= 23 && mediaFormat.containsKey("aac-profile")) {
                num = Integer.valueOf(mediaFormat.getInteger("aac-profile"));
                try {
                    mediaFormat.setString("aac-profile", null);
                    num3 = num;
                } catch (Throwable th2) {
                    th = th2;
                    num3 = num2;
                    if (num3 != null) {
                        mediaFormat.setInteger("frame-rate", num3.intValue());
                    }
                    if (num != null) {
                        mediaFormat.setInteger("aac-profile", num.intValue());
                    }
                    throw th;
                }
            }
            String findEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormat);
            if (findEncoderForFormat == null) {
                findEncoderForFormat = findEncoderWithNearestCompatibleBitrate(mediaFormat, mediaCodecList.getCodecInfos());
            }
            if (num2 != null) {
                mediaFormat.setInteger("frame-rate", num2.intValue());
            }
            if (num3 != null) {
                mediaFormat.setInteger("aac-profile", num3.intValue());
            }
            return findEncoderForFormat;
        } catch (Throwable th3) {
            th = th3;
            num = null;
        }
    }

    private String findEncoderWithNearestCompatibleBitrate(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) {
        int i;
        Integer num;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        int i2;
        String string = mediaFormat.getString("mime");
        Integer num2 = null;
        if (string == null) {
            Logger.w(TAG, "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (i = 0; i < length; i = i + 1) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    Preconditions.checkArgument(capabilitiesForType != null, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        Preconditions.checkArgument(videoCapabilities != null, "Not video codec");
                        num = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            i2 = videoCapabilities.getBitrateRange().clamp(num).intValue();
                            mediaFormat.setInteger("bitrate", i2);
                        } catch (IllegalArgumentException unused) {
                            i = num == null ? i + 1 : 0;
                            mediaFormat.setInteger("bitrate", num.intValue());
                        } catch (Throwable th) {
                            th = th;
                            num2 = num;
                            if (num2 != null) {
                                mediaFormat.setInteger("bitrate", num2.intValue());
                            }
                            throw th;
                        }
                    } else {
                        i2 = -1;
                        num = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    num = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    Logger.w(TAG, String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", num, Integer.valueOf(i2)));
                    String name = mediaCodecInfo.getName();
                    if (num != null) {
                        mediaFormat.setInteger("bitrate", num.intValue());
                    }
                    return name;
                }
                if (num == null) {
                }
                mediaFormat.setInteger("bitrate", num.intValue());
            }
        }
        return null;
    }

    private boolean shouldCreateCodecByType(MediaFormat mediaFormat) {
        MediaCodecInfoReportIncorrectInfoQuirk mediaCodecInfoReportIncorrectInfoQuirk = (MediaCodecInfoReportIncorrectInfoQuirk) DeviceQuirks.get(MediaCodecInfoReportIncorrectInfoQuirk.class);
        if (mediaCodecInfoReportIncorrectInfoQuirk == null) {
            return false;
        }
        return mediaCodecInfoReportIncorrectInfoQuirk.isUnSupportMediaCodecInfo(mediaFormat);
    }
}
