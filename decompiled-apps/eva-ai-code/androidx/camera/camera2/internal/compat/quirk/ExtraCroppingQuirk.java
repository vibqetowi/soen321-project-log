package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements Quirk {
    private static final List<String> SAMSUNG_DISTORTION_MODELS = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isSamsungDistortion();
    }

    public Size getVerifiedResolution(SurfaceConfig.ConfigType configType) {
        if (isSamsungDistortion()) {
            int i = AnonymousClass1.$SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType[configType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new Size(3264, 1836);
                }
                return new Size(1280, 720);
            }
            return new Size(1920, 1080);
        }
        return null;
    }

    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType;

        static {
            int[] iArr = new int[SurfaceConfig.ConfigType.values().length];
            $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType = iArr;
            try {
                iArr[SurfaceConfig.ConfigType.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType[SurfaceConfig.ConfigType.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType[SurfaceConfig.ConfigType.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static boolean isSamsungDistortion() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DISTORTION_MODELS.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
