package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.List;
/* loaded from: classes.dex */
public class StillCaptureFlow {
    private final boolean mShouldStopRepeatingBeforeStillCapture;

    public StillCaptureFlow() {
        this.mShouldStopRepeatingBeforeStillCapture = ((StillCaptureFlashStopRepeatingQuirk) DeviceQuirks.get(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldStopRepeatingBeforeCapture(List<CaptureRequest> list, boolean z) {
        if (this.mShouldStopRepeatingBeforeStillCapture && z) {
            for (CaptureRequest captureRequest : list) {
                int intValue = ((Integer) captureRequest.get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
                while (r3.hasNext()) {
                }
            }
        }
        return false;
    }
}
