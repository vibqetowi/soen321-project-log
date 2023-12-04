package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class CameraManagerCompat {
    private final Map<String, CameraCharacteristicsCompat> mCameraCharacteristicsMap = new ArrayMap(4);
    private final CameraManagerCompatImpl mImpl;

    private CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.mImpl = cameraManagerCompatImpl;
    }

    public static CameraManagerCompat from(Context context) {
        return from(context, MainThreadAsyncHandler.getInstance());
    }

    public static CameraManagerCompat from(Context context, Handler handler) {
        return new CameraManagerCompat(CameraManagerCompatImpl.CC.from(context, handler));
    }

    public static CameraManagerCompat from(CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new CameraManagerCompat(cameraManagerCompatImpl);
    }

    public String[] getCameraIdList() throws CameraAccessExceptionCompat {
        return this.mImpl.getCameraIdList();
    }

    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.unregisterAvailabilityCallback(availabilityCallback);
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat(String str) throws CameraAccessExceptionCompat {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.mCameraCharacteristicsMap) {
            cameraCharacteristicsCompat = this.mCameraCharacteristicsMap.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.mImpl.getCameraCharacteristics(str));
                    this.mCameraCharacteristicsMap.put(str, cameraCharacteristicsCompat);
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR, e.getMessage(), e);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.mImpl.openCamera(str, executor, stateCallback);
    }

    public CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }

    /* loaded from: classes.dex */
    public interface CameraManagerCompatImpl {
        CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat;

        String[] getCameraIdList() throws CameraAccessExceptionCompat;

        CameraManager getCameraManager();

        void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl$-CC  reason: invalid class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class CC {
            public static CameraManagerCompatImpl from(Context context, Handler handler) {
                if (Build.VERSION.SDK_INT >= 29) {
                    return new CameraManagerCompatApi29Impl(context);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    return CameraManagerCompatApi28Impl.create(context);
                }
                return CameraManagerCompatBaseImpl.create(context, handler);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {
        private final Executor mExecutor;
        final CameraManager.AvailabilityCallback mWrappedCallback;
        private final Object mLock = new Object();
        private boolean mDisabled = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AvailabilityCallbackExecutorWrapper(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void setDisabled() {
            synchronized (this.mLock) {
                this.mDisabled = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.m124x9626b29c();
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onCameraAccessPrioritiesChanged$0$androidx-camera-camera2-internal-compat-CameraManagerCompat$AvailabilityCallbackExecutorWrapper  reason: not valid java name */
        public /* synthetic */ void m124x9626b29c() {
            ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(this.mWrappedCallback);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.m125x4d412d8(str);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onCameraAvailable$1$androidx-camera-camera2-internal-compat-CameraManagerCompat$AvailabilityCallbackExecutorWrapper  reason: not valid java name */
        public /* synthetic */ void m125x4d412d8(String str) {
            this.mWrappedCallback.onCameraAvailable(str);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.m126x572f6ee0(str);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onCameraUnavailable$2$androidx-camera-camera2-internal-compat-CameraManagerCompat$AvailabilityCallbackExecutorWrapper  reason: not valid java name */
        public /* synthetic */ void m126x572f6ee0(String str) {
            this.mWrappedCallback.onCameraUnavailable(str);
        }
    }
}
