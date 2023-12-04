package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
/* loaded from: classes.dex */
public final class ApiCompat {
    private ApiCompat() {
    }

    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void close(CameraDevice cameraDevice) {
            cameraDevice.close();
        }
    }

    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void onSurfacePrepared(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void onCaptureBufferLost(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static void onCaptureQueueEmpty(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }

        public static <T> OutputConfiguration newOutputConfiguration(Size size, Class<T> cls) {
            return ComponentDialog$$ExternalSyntheticApiModelOutline0.m(size, cls);
        }
    }

    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void onCameraAccessPrioritiesChanged(CameraManager.AvailabilityCallback availabilityCallback) {
            availabilityCallback.onCameraAccessPrioritiesChanged();
        }
    }
}
