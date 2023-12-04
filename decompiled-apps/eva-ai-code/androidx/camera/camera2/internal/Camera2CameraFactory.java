package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class Camera2CameraFactory implements CameraFactory {
    private static final int DEFAULT_ALLOWED_CONCURRENT_OPEN_CAMERAS = 1;
    private static final String TAG = "Camera2CameraFactory";
    private final List<String> mAvailableCameraIds;
    private final CameraManagerCompat mCameraManager;
    private final DisplayInfoManager mDisplayInfoManager;
    private final CameraThreadConfig mThreadConfig;
    private final Map<String, Camera2CameraInfoImpl> mCameraInfos = new HashMap();
    private final CameraStateRegistry mCameraStateRegistry = new CameraStateRegistry(1);

    public Camera2CameraFactory(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) throws InitializationException {
        this.mThreadConfig = cameraThreadConfig;
        this.mCameraManager = CameraManagerCompat.from(context, cameraThreadConfig.getSchedulerHandler());
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
        this.mAvailableCameraIds = getBackwardCompatibleCameraIds(CameraSelectionOptimizer.getSelectedAvailableCameraIds(this, cameraSelector));
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public CameraInternal getCamera(String str) throws CameraUnavailableException {
        if (!this.mAvailableCameraIds.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        return new Camera2CameraImpl(this.mCameraManager, str, getCameraInfo(str), this.mCameraStateRegistry, this.mThreadConfig.getCameraExecutor(), this.mThreadConfig.getSchedulerHandler(), this.mDisplayInfoManager);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2CameraInfoImpl getCameraInfo(String str) throws CameraUnavailableException {
        try {
            Camera2CameraInfoImpl camera2CameraInfoImpl = this.mCameraInfos.get(str);
            if (camera2CameraInfoImpl == null) {
                Camera2CameraInfoImpl camera2CameraInfoImpl2 = new Camera2CameraInfoImpl(str, this.mCameraManager);
                this.mCameraInfos.put(str, camera2CameraInfoImpl2);
                return camera2CameraInfoImpl2;
            }
            return camera2CameraInfoImpl;
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public Set<String> getAvailableCameraIds() {
        return new LinkedHashSet(this.mAvailableCameraIds);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public CameraManagerCompat getCameraManager() {
        return this.mCameraManager;
    }

    private List<String> getBackwardCompatibleCameraIds(List<String> list) throws InitializationException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (isBackwardCompatible(str)) {
                arrayList.add(str);
            } else {
                Logger.d(TAG, "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    private boolean isBackwardCompatible(String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.mCameraManager.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(CameraUnavailableExceptionHelper.createFrom(e));
        }
    }
}
