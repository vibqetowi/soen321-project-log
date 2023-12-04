package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlus {
    public void toggleHDRPlus(int i, Camera2ImplConfig.Builder builder) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        if (((ImageCapturePixelHDRPlusQuirk) DeviceQuirks.get(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i == 0) {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            builder.setCaptureRequestOption(key, true);
        } else if (i != 1) {
        } else {
            key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
            builder.setCaptureRequestOption(key2, false);
        }
    }
}
