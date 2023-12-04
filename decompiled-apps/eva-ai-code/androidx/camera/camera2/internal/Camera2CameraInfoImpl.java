package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CamcorderProfileProvider;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class Camera2CameraInfoImpl implements CameraInfoInternal {
    private static final String TAG = "Camera2CameraInfo";
    private final CamcorderProfileProvider mCamera2CamcorderProfileProvider;
    private Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final Camera2CameraInfo mCamera2CameraInfo;
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final String mCameraId;
    private final CameraManagerCompat mCameraManager;
    private final Quirks mCameraQuirks;
    private final RedirectableLiveData<CameraState> mCameraStateLiveData;
    private final Object mLock = new Object();
    private RedirectableLiveData<Integer> mRedirectTorchStateLiveData = null;
    private RedirectableLiveData<ZoomState> mRedirectZoomStateLiveData = null;
    private List<Pair<CameraCaptureCallback, Executor>> mCameraCaptureCallbacks = null;

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public /* synthetic */ CameraSelector getCameraSelector() {
        CameraSelector build;
        build = new CameraSelector.Builder().addCameraFilter(new CameraFilter() { // from class: androidx.camera.core.impl.CameraInfoInternal$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return CameraInfoInternal.CC.$private$lambda$getCameraSelector$0(CameraInfoInternal.this, list);
            }

            @Override // androidx.camera.core.CameraFilter
            public /* synthetic */ Identifier getIdentifier() {
                Identifier identifier;
                identifier = CameraFilter.DEFAULT_ID;
                return identifier;
            }
        }).build();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2CameraInfoImpl(String str, CameraManagerCompat cameraManagerCompat) throws CameraAccessExceptionCompat {
        String str2 = (String) Preconditions.checkNotNull(str);
        this.mCameraId = str2;
        this.mCameraManager = cameraManagerCompat;
        CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        this.mCamera2CameraInfo = new Camera2CameraInfo(this);
        this.mCameraQuirks = CameraQuirks.get(str, cameraCharacteristicsCompat);
        this.mCamera2CamcorderProfileProvider = new Camera2CamcorderProfileProvider(str, cameraCharacteristicsCompat);
        this.mCameraStateLiveData = new RedirectableLiveData<>(CameraState.create(CameraState.Type.CLOSED));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void linkWithCameraControl(Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.mLock) {
            this.mCamera2CameraControlImpl = camera2CameraControlImpl;
            RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
            if (redirectableLiveData != null) {
                redirectableLiveData.redirectTo(camera2CameraControlImpl.getZoomControl().getZoomState());
            }
            RedirectableLiveData<Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData2 != null) {
                redirectableLiveData2.redirectTo(this.mCamera2CameraControlImpl.getTorchControl().getTorchState());
            }
            List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
            if (list != null) {
                for (Pair<CameraCaptureCallback, Executor> pair : list) {
                    this.mCamera2CameraControlImpl.addSessionCameraCaptureCallback((Executor) pair.second, (CameraCaptureCallback) pair.first);
                }
                this.mCameraCaptureCallbacks = null;
            }
        }
        logDeviceInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCameraStateSource(LiveData<CameraState> liveData) {
        this.mCameraStateLiveData.redirectTo(liveData);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public String getCameraId() {
        return this.mCameraId;
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.mCameraCharacteristicsCompat;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Integer getLensFacing() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
        Preconditions.checkNotNull(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (1 == r1.intValue()) goto L5;
     */
    @Override // androidx.camera.core.CameraInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getSensorRotationDegrees(int i) {
        Integer valueOf = Integer.valueOf(getSensorOrientation());
        int surfaceRotationToDegrees = CameraOrientationUtil.surfaceRotationToDegrees(i);
        Integer lensFacing = getLensFacing();
        boolean z = lensFacing != null;
        return CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, valueOf.intValue(), z);
    }

    int getSensorOrientation() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSupportedHardwareLevel() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    private void logDeviceInfo() {
        logDeviceLevel();
    }

    private void logDeviceLevel() {
        String str;
        int supportedHardwareLevel = getSupportedHardwareLevel();
        if (supportedHardwareLevel == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (supportedHardwareLevel == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (supportedHardwareLevel == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (supportedHardwareLevel == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (supportedHardwareLevel != 4) {
            str = "Unknown value: " + supportedHardwareLevel;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        Logger.i(TAG, "Device Level: " + str);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        return FlashAvailabilityChecker.isFlashAvailable(this.mCameraCharacteristicsCompat);
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getTorchState() {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mRedirectTorchStateLiveData == null) {
                    this.mRedirectTorchStateLiveData = new RedirectableLiveData<>(0);
                }
                return this.mRedirectTorchStateLiveData;
            }
            RedirectableLiveData<Integer> redirectableLiveData = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData != null) {
                return redirectableLiveData;
            }
            return camera2CameraControlImpl.getTorchControl().getTorchState();
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<ZoomState> getZoomState() {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mRedirectZoomStateLiveData == null) {
                    this.mRedirectZoomStateLiveData = new RedirectableLiveData<>(ZoomControl.getDefaultZoomState(this.mCameraCharacteristicsCompat));
                }
                return this.mRedirectZoomStateLiveData;
            }
            RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
            if (redirectableLiveData != null) {
                return redirectableLiveData;
            }
            return camera2CameraControlImpl.getZoomControl().getZoomState();
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public ExposureState getExposureState() {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                return ExposureControl.getDefaultExposureState(this.mCameraCharacteristicsCompat);
            }
            return camera2CameraControlImpl.getExposureControl().getExposureState();
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<CameraState> getCameraState() {
        return this.mCameraStateLiveData;
    }

    @Override // androidx.camera.core.CameraInfo
    public String getImplementationType() {
        return getSupportedHardwareLevel() == 2 ? CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY : CameraInfo.IMPLEMENTATION_TYPE_CAMERA2;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                return false;
            }
            return camera2CameraControlImpl.getFocusMeteringControl().isFocusMeteringSupported(focusMeteringAction);
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isYuvReprocessingSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 7);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 4);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public CamcorderProfileProvider getCamcorderProfileProvider() {
        return this.mCamera2CamcorderProfileProvider;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mCameraCaptureCallbacks == null) {
                    this.mCameraCaptureCallbacks = new ArrayList();
                }
                this.mCameraCaptureCallbacks.add(new Pair<>(cameraCaptureCallback, executor));
                return;
            }
            camera2CameraControlImpl.addSessionCameraCaptureCallback(executor, cameraCaptureCallback);
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
                if (list == null) {
                    return;
                }
                Iterator<Pair<CameraCaptureCallback, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == cameraCaptureCallback) {
                        it.remove();
                    }
                }
                return;
            }
            camera2CameraControlImpl.removeSessionCameraCaptureCallback(cameraCaptureCallback);
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Quirks getCameraQuirks() {
        return this.mCameraQuirks;
    }

    public Camera2CameraInfo getCamera2CameraInfo() {
        return this.mCamera2CameraInfo;
    }

    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.mCameraId, this.mCameraCharacteristicsCompat.toCameraCharacteristics());
        for (String str : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
            if (!Objects.equals(str, this.mCameraId)) {
                try {
                    linkedHashMap.put(str, this.mCameraManager.getCameraCharacteristicsCompat(str).toCameraCharacteristics());
                } catch (CameraAccessExceptionCompat e) {
                    Logger.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class RedirectableLiveData<T> extends MediatorLiveData<T> {
        private T mInitialValue;
        private LiveData<T> mLiveDataSource;

        RedirectableLiveData(T t) {
            this.mInitialValue = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void redirectTo(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.mLiveDataSource;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.mLiveDataSource = liveData;
            super.addSource(liveData, new Observer() { // from class: androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Camera2CameraInfoImpl.RedirectableLiveData.this.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.MediatorLiveData
        public <S> void addSource(LiveData<S> liveData, Observer<? super S> observer) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
            LiveData<T> liveData = this.mLiveDataSource;
            return liveData == null ? this.mInitialValue : liveData.getValue();
        }
    }
}
