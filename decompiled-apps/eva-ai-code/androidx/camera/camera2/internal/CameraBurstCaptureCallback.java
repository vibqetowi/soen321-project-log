package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class CameraBurstCaptureCallback extends CameraCaptureSession.CaptureCallback {
    CaptureSequenceCallback mCaptureSequenceCallback = null;
    final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> mCallbackMap = new HashMap();

    /* loaded from: classes.dex */
    interface CaptureSequenceCallback {
        void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback captureCallback : getCallbacks(captureRequest)) {
            ApiCompat.Api24Impl.onCaptureBufferLost(captureCallback, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : getCallbacks(captureRequest)) {
            captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback captureCallback : getCallbacks(captureRequest)) {
            captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : getCallbacks(captureRequest)) {
            captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback captureCallback : getCallbacks(captureRequest)) {
            captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.mCallbackMap.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.mCallbackMap.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i, false);
        }
    }

    private List<CameraCaptureSession.CaptureCallback> getCallbacks(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.mCallbackMap.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCamera2Callbacks(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.mCallbackMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.mCallbackMap.put(captureRequest, arrayList);
            return;
        }
        this.mCallbackMap.put(captureRequest, list);
    }

    public void setCaptureSequenceCallback(CaptureSequenceCallback captureSequenceCallback) {
        this.mCaptureSequenceCallback = captureSequenceCallback;
    }
}
