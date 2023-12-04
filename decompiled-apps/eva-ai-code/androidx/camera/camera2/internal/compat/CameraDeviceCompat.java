package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class CameraDeviceCompat {
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;
    private final CameraDeviceCompatImpl mImpl;

    /* loaded from: classes.dex */
    interface CameraDeviceCompatImpl {
        void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat;

        CameraDevice unwrap();
    }

    private CameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new CameraDeviceCompatApi28Impl(cameraDevice);
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.mImpl = CameraDeviceCompatApi24Impl.create(cameraDevice, handler);
        } else {
            this.mImpl = CameraDeviceCompatApi23Impl.create(cameraDevice, handler);
        }
    }

    public static CameraDeviceCompat toCameraDeviceCompat(CameraDevice cameraDevice) {
        return toCameraDeviceCompat(cameraDevice, MainThreadAsyncHandler.getInstance());
    }

    public static CameraDeviceCompat toCameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        return new CameraDeviceCompat(cameraDevice, handler);
    }

    public CameraDevice toCameraDevice() {
        return this.mImpl.unwrap();
    }

    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        this.mImpl.createCaptureSession(sessionConfigurationCompat);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class StateCallbackExecutorWrapper extends CameraDevice.StateCallback {
        private final Executor mExecutor;
        final CameraDevice.StateCallback mWrappedCallback;

        /* JADX INFO: Access modifiers changed from: package-private */
        public StateCallbackExecutorWrapper(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onOpened$0$androidx-camera-camera2-internal-compat-CameraDeviceCompat$StateCallbackExecutorWrapper  reason: not valid java name */
        public /* synthetic */ void m123xbd558edf(CameraDevice cameraDevice) {
            this.mWrappedCallback.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.StateCallbackExecutorWrapper.this.m123xbd558edf(cameraDevice);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onDisconnected$1$androidx-camera-camera2-internal-compat-CameraDeviceCompat$StateCallbackExecutorWrapper  reason: not valid java name */
        public /* synthetic */ void m121xc1093a32(CameraDevice cameraDevice) {
            this.mWrappedCallback.onDisconnected(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.StateCallbackExecutorWrapper.this.m121xc1093a32(cameraDevice);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onError$2$androidx-camera-camera2-internal-compat-CameraDeviceCompat$StateCallbackExecutorWrapper  reason: not valid java name */
        public /* synthetic */ void m122x48d74a48(CameraDevice cameraDevice, int i) {
            this.mWrappedCallback.onError(cameraDevice, i);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.StateCallbackExecutorWrapper.this.m122x48d74a48(cameraDevice, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onClosed$3$androidx-camera-camera2-internal-compat-CameraDeviceCompat$StateCallbackExecutorWrapper  reason: not valid java name */
        public /* synthetic */ void m120xeb195125(CameraDevice cameraDevice) {
            this.mWrappedCallback.onClosed(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.StateCallbackExecutorWrapper.this.m120xeb195125(cameraDevice);
                }
            });
        }
    }
}
