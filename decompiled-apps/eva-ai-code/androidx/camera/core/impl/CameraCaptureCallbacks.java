package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class CameraCaptureCallbacks {
    private CameraCaptureCallbacks() {
    }

    public static CameraCaptureCallback createNoOpCallback() {
        return new NoOpCameraCaptureCallback();
    }

    static CameraCaptureCallback createComboCallback(List<CameraCaptureCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new ComboCameraCaptureCallback(list);
    }

    public static CameraCaptureCallback createComboCallback(CameraCaptureCallback... cameraCaptureCallbackArr) {
        return createComboCallback(Arrays.asList(cameraCaptureCallbackArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class NoOpCameraCaptureCallback extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
        }

        NoOpCameraCaptureCallback() {
        }
    }

    /* loaded from: classes.dex */
    public static final class ComboCameraCaptureCallback extends CameraCaptureCallback {
        private final List<CameraCaptureCallback> mCallbacks = new ArrayList();

        ComboCameraCaptureCallback(List<CameraCaptureCallback> list) {
            for (CameraCaptureCallback cameraCaptureCallback : list) {
                if (!(cameraCaptureCallback instanceof NoOpCameraCaptureCallback)) {
                    this.mCallbacks.add(cameraCaptureCallback);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            for (CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                cameraCaptureCallback.onCaptureCompleted(cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
            for (CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                cameraCaptureCallback.onCaptureFailed(cameraCaptureFailure);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            for (CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                cameraCaptureCallback.onCaptureCancelled();
            }
        }

        public List<CameraCaptureCallback> getCallbacks() {
            return this.mCallbacks;
        }
    }
}
