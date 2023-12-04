package androidx.camera.video.internal.compat.quirk;

import android.media.MediaFormat;
import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes.dex */
public class MediaCodecInfoReportIncorrectInfoQuirk implements Quirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isNokia1() || isMotoC() || isX650() || isX230() || isHuaweiMate9() || isPositivoTwist2Pro() || isRedmiNote4() || isLGK430();
    }

    private static boolean isNokia1() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isMotoC() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isX650() {
        return "infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isX230() {
        return "LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isHuaweiMate9() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isPositivoTwist2Pro() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isRedmiNote4() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "redmi note 4".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isLGK430() {
        return "lge".equalsIgnoreCase(Build.BRAND) && "lg-k430".equalsIgnoreCase(Build.MODEL);
    }

    public boolean isUnSupportMediaCodecInfo(MediaFormat mediaFormat) {
        if (isNokia1() || isMotoC() || isX650() || isX230() || isPositivoTwist2Pro()) {
            return MimeTypes.VIDEO_MP4V.equals(mediaFormat.getString("mime"));
        }
        if (isHuaweiMate9() && isVideoFormat(mediaFormat)) {
            return mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 3840 && mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 2160;
        } else if ((isRedmiNote4() || isLGK430()) && MimeTypes.VIDEO_H264.equals(mediaFormat.getString("mime"))) {
            return mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 1920 && mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 1080;
        } else {
            return false;
        }
    }

    private boolean isVideoFormat(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("video/");
    }
}
