package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class Camera2CaptureCallbacks {
    private Camera2CaptureCallbacks() {
    }

    public static CameraCaptureSession.CaptureCallback createNoOpCallback() {
        return new NoOpSessionCaptureCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraCaptureSession.CaptureCallback createComboCallback(List<CameraCaptureSession.CaptureCallback> list) {
        return new ComboSessionCaptureCallback(list);
    }

    public static CameraCaptureSession.CaptureCallback createComboCallback(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return createComboCallback(Arrays.asList(captureCallbackArr));
    }

    /* loaded from: classes.dex */
    static final class NoOpSessionCaptureCallback extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        }

        NoOpSessionCaptureCallback() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class ComboSessionCaptureCallback extends CameraCaptureSession.CaptureCallback {
        private final List<CameraCaptureSession.CaptureCallback> mCallbacks = new ArrayList();

        ComboSessionCaptureCallback(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                if (!(captureCallback instanceof NoOpSessionCaptureCallback)) {
                    this.mCallbacks.add(captureCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.mCallbacks) {
                ApiCompat.Api24Impl.onCaptureBufferLost(captureCallback, cameraCaptureSession, captureRequest, surface, j);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.mCallbacks) {
                captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.mCallbacks) {
                captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.mCallbacks) {
                captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.mCallbacks) {
                captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.mCallbacks) {
                captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.mCallbacks) {
                captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        }
    }
}
