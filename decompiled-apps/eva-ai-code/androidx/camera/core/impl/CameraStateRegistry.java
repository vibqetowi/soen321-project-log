package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class CameraStateRegistry {
    private static final String TAG = "CameraStateRegistry";
    private int mAvailableCameras;
    private final int mMaxAllowedOpenedCameras;
    private final StringBuilder mDebugString = new StringBuilder();
    private final Object mLock = new Object();
    private final Map<Camera, CameraRegistration> mCameraStates = new HashMap();

    /* loaded from: classes.dex */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(int i) {
        this.mMaxAllowedOpenedCameras = i;
        synchronized ("mLock") {
            this.mAvailableCameras = i;
        }
    }

    public void registerCamera(Camera camera, Executor executor, OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.mLock) {
            boolean z = !this.mCameraStates.containsKey(camera);
            Preconditions.checkState(z, "Camera is already registered: " + camera);
            this.mCameraStates.put(camera, new CameraRegistration(null, executor, onOpenAvailableListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[Catch: all -> 0x009c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0053, B:9:0x0057, B:14:0x006a, B:16:0x0072, B:20:0x0081, B:22:0x0097, B:23:0x009a, B:13:0x0064), top: B:28:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[Catch: all -> 0x009c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0053, B:9:0x0057, B:14:0x006a, B:16:0x0072, B:20:0x0081, B:22:0x0097, B:23:0x009a, B:13:0x0064), top: B:28:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean tryOpenCamera(Camera camera) {
        boolean z;
        synchronized (this.mLock) {
            CameraRegistration cameraRegistration = (CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Camera must first be registered with registerCamera()");
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.setLength(0);
                this.mDebugString.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", camera, Integer.valueOf(this.mAvailableCameras), Boolean.valueOf(isOpen(cameraRegistration.getState())), cameraRegistration.getState()));
            }
            if (this.mAvailableCameras <= 0 && !isOpen(cameraRegistration.getState())) {
                z = false;
                if (Logger.isDebugEnabled(TAG)) {
                    StringBuilder sb = this.mDebugString;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    objArr[0] = z ? "SUCCESS" : "FAIL";
                    sb.append(String.format(locale, " --> %s", objArr));
                    Logger.d(TAG, this.mDebugString.toString());
                }
                if (z) {
                    recalculateAvailableCameras();
                }
            }
            cameraRegistration.setState(CameraInternal.State.OPENING);
            z = true;
            if (Logger.isDebugEnabled(TAG)) {
            }
            if (z) {
            }
        }
        return z;
    }

    public void markCameraState(Camera camera, CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    public void markCameraState(Camera camera, CameraInternal.State state, boolean z) {
        CameraInternal.State updateAndVerifyState;
        HashMap hashMap;
        synchronized (this.mLock) {
            int i = this.mAvailableCameras;
            if (state == CameraInternal.State.RELEASED) {
                updateAndVerifyState = unregisterCamera(camera);
            } else {
                updateAndVerifyState = updateAndVerifyState(camera, state);
            }
            if (updateAndVerifyState == state) {
                return;
            }
            if (i < 1 && this.mAvailableCameras > 0) {
                hashMap = new HashMap();
                for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
                    if (entry.getValue().getState() == CameraInternal.State.PENDING_OPEN) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else if (state != CameraInternal.State.PENDING_OPEN || this.mAvailableCameras <= 0) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                hashMap.put(camera, this.mCameraStates.get(camera));
            }
            if (hashMap != null && !z) {
                hashMap.remove(camera);
            }
            if (hashMap != null) {
                for (CameraRegistration cameraRegistration : hashMap.values()) {
                    cameraRegistration.notifyListener();
                }
            }
        }
    }

    private CameraInternal.State unregisterCamera(Camera camera) {
        CameraRegistration remove = this.mCameraStates.remove(camera);
        if (remove != null) {
            recalculateAvailableCameras();
            return remove.getState();
        }
        return null;
    }

    private CameraInternal.State updateAndVerifyState(Camera camera, CameraInternal.State state) {
        CameraInternal.State state2 = ((CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).setState(state);
        if (state == CameraInternal.State.OPENING) {
            Preconditions.checkState(isOpen(state) || state2 == CameraInternal.State.OPENING, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (state2 != state) {
            recalculateAvailableCameras();
        }
        return state2;
    }

    private static boolean isOpen(CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    private void recalculateAvailableCameras() {
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i++;
            }
        }
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            this.mDebugString.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.mMaxAllowedOpenedCameras)));
            Logger.d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = Math.max(this.mMaxAllowedOpenedCameras - i, 0);
    }

    public boolean isCameraClosing() {
        synchronized (this.mLock) {
            for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
                if (entry.getValue().getState() == CameraInternal.State.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CameraRegistration {
        private final OnOpenAvailableListener mCameraAvailableListener;
        private final Executor mNotifyExecutor;
        private CameraInternal.State mState;

        CameraRegistration(CameraInternal.State state, Executor executor, OnOpenAvailableListener onOpenAvailableListener) {
            this.mState = state;
            this.mNotifyExecutor = executor;
            this.mCameraAvailableListener = onOpenAvailableListener;
        }

        CameraInternal.State setState(CameraInternal.State state) {
            CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }

        CameraInternal.State getState() {
            return this.mState;
        }

        void notifyListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnOpenAvailableListener onOpenAvailableListener = this.mCameraAvailableListener;
                Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraStateRegistry.OnOpenAvailableListener.this.onOpenAvailable();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera.", e);
            }
        }
    }
}
