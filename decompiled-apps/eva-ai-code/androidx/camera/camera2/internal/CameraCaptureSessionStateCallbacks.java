package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class CameraCaptureSessionStateCallbacks {
    private CameraCaptureSessionStateCallbacks() {
    }

    public static CameraCaptureSession.StateCallback createNoOpCallback() {
        return new NoOpSessionStateCallback();
    }

    public static CameraCaptureSession.StateCallback createComboCallback(List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new ComboSessionStateCallback(list);
    }

    public static CameraCaptureSession.StateCallback createComboCallback(CameraCaptureSession.StateCallback... stateCallbackArr) {
        return createComboCallback(Arrays.asList(stateCallbackArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class NoOpSessionStateCallback extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }

        NoOpSessionStateCallback() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ComboSessionStateCallback extends CameraCaptureSession.StateCallback {
        private final List<CameraCaptureSession.StateCallback> mCallbacks = new ArrayList();

        ComboSessionStateCallback(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof NoOpSessionStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.mCallbacks) {
                stateCallback.onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.mCallbacks) {
                stateCallback.onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.mCallbacks) {
                stateCallback.onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.mCallbacks) {
                stateCallback.onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.mCallbacks) {
                ApiCompat.Api26Impl.onCaptureQueueEmpty(stateCallback, cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            for (CameraCaptureSession.StateCallback stateCallback : this.mCallbacks) {
                ApiCompat.Api23Impl.onSurfacePrepared(stateCallback, cameraCaptureSession, surface);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.mCallbacks) {
                stateCallback.onConfigureFailed(cameraCaptureSession);
            }
        }
    }
}
