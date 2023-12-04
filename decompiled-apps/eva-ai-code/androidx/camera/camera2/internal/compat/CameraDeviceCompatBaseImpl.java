package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CameraDeviceCompatBaseImpl implements CameraDeviceCompat.CameraDeviceCompatImpl {
    final CameraDevice mCameraDevice;
    final Object mImplParams;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraDeviceCompatBaseImpl(CameraDevice cameraDevice, Object obj) {
        this.mCameraDevice = (CameraDevice) Preconditions.checkNotNull(cameraDevice);
        this.mImplParams = obj;
    }

    static CameraDeviceCompatBaseImpl create(CameraDevice cameraDevice, Handler handler) {
        return new CameraDeviceCompatBaseImpl(cameraDevice, new CameraDeviceCompatParamsApi21(handler));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Surface> unpackSurfaces(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfigurationCompat outputConfigurationCompat : list) {
            arrayList.add(outputConfigurationCompat.getSurface());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void checkPreconditions(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat) {
        Preconditions.checkNotNull(cameraDevice);
        Preconditions.checkNotNull(sessionConfigurationCompat);
        Preconditions.checkNotNull(sessionConfigurationCompat.getStateCallback());
        List<OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (sessionConfigurationCompat.getExecutor() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        checkPhysicalCameraIdValid(cameraDevice, outputConfigurations);
    }

    private static void checkPhysicalCameraIdValid(CameraDevice cameraDevice, List<OutputConfigurationCompat> list) {
        String id = cameraDevice.getId();
        for (OutputConfigurationCompat outputConfigurationCompat : list) {
            String physicalCameraId = outputConfigurationCompat.getPhysicalCameraId();
            if (physicalCameraId != null && !physicalCameraId.isEmpty()) {
                Logger.w("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + physicalCameraId + ". Ignoring.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void createBaseCaptureSession(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessExceptionCompat {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        checkPreconditions(this.mCameraDevice, sessionConfigurationCompat);
        if (sessionConfigurationCompat.getInputConfiguration() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (sessionConfigurationCompat.getSessionType() == 1) {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new CameraCaptureSessionCompat.StateCallbackExecutorWrapper(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
        createBaseCaptureSession(this.mCameraDevice, unpackSurfaces(sessionConfigurationCompat.getOutputConfigurations()), stateCallbackExecutorWrapper, ((CameraDeviceCompatParamsApi21) this.mImplParams).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public CameraDevice unwrap() {
        return this.mCameraDevice;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class CameraDeviceCompatParamsApi21 {
        final Handler mCompatHandler;

        /* JADX INFO: Access modifiers changed from: package-private */
        public CameraDeviceCompatParamsApi21(Handler handler) {
            this.mCompatHandler = handler;
        }
    }
}
