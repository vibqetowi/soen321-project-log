package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class CaptureCallbackConverter {
    private CaptureCallbackConverter() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraCaptureSession.CaptureCallback toCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        toCaptureCallback(cameraCaptureCallback, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toCaptureCallback(CameraCaptureCallback cameraCaptureCallback, List<CameraCaptureSession.CaptureCallback> list) {
        if (cameraCaptureCallback instanceof CameraCaptureCallbacks.ComboCameraCaptureCallback) {
            for (CameraCaptureCallback cameraCaptureCallback2 : ((CameraCaptureCallbacks.ComboCameraCaptureCallback) cameraCaptureCallback).getCallbacks()) {
                toCaptureCallback(cameraCaptureCallback2, list);
            }
        } else if (cameraCaptureCallback instanceof CaptureCallbackContainer) {
            list.add(((CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback());
        } else {
            list.add(new CaptureCallbackAdapter(cameraCaptureCallback));
        }
    }
}
