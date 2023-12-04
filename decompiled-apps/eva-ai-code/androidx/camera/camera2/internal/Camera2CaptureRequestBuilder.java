package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class Camera2CaptureRequestBuilder {
    private static final String TAG = "CaptureRequestBuilder";

    private Camera2CaptureRequestBuilder() {
    }

    private static List<Surface> getConfiguredSurfaces(List<DeferrableSurface> list, Map<DeferrableSurface, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            Surface surface = map.get(deferrableSurface);
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    private static void applyImplementationOptionToCaptureBuilder(CaptureRequest.Builder builder, Config config) {
        CaptureRequestOptions build = CaptureRequestOptions.Builder.from(config).build();
        for (Config.Option option : build.listOptions()) {
            CaptureRequest.Key key = (CaptureRequest.Key) option.getToken();
            try {
                builder.set(key, build.retrieveOption(option));
            } catch (IllegalArgumentException unused) {
                Logger.e(TAG, "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest build(CaptureConfig captureConfig, CameraDevice cameraDevice, Map<DeferrableSurface, Surface> map) throws CameraAccessException {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> configuredSurfaces = getConfiguredSurfaces(captureConfig.getSurfaces(), map);
        if (configuredSurfaces.isEmpty()) {
            return null;
        }
        CameraCaptureResult cameraCaptureResult = captureConfig.getCameraCaptureResult();
        if (captureConfig.getTemplateType() == 5 && cameraCaptureResult != null && (cameraCaptureResult.getCaptureResult() instanceof TotalCaptureResult)) {
            createCaptureRequest = Api23Impl.createReprocessCaptureRequest(cameraDevice, (TotalCaptureResult) cameraCaptureResult.getCaptureResult());
        } else {
            createCaptureRequest = cameraDevice.createCaptureRequest(captureConfig.getTemplateType());
        }
        applyImplementationOptionToCaptureBuilder(createCaptureRequest, captureConfig.getImplementationOptions());
        if (captureConfig.getImplementationOptions().containsOption(CaptureConfig.OPTION_ROTATION)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION));
        }
        if (captureConfig.getImplementationOptions().containsOption(CaptureConfig.OPTION_JPEG_QUALITY)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY)).byteValue()));
        }
        for (Surface surface : configuredSurfaces) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(captureConfig.getTagBundle());
        return createCaptureRequest.build();
    }

    public static CaptureRequest buildWithoutTarget(CaptureConfig captureConfig, CameraDevice cameraDevice) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(captureConfig.getTemplateType());
        applyImplementationOptionToCaptureBuilder(createCaptureRequest, captureConfig.getImplementationOptions());
        return createCaptureRequest.build();
    }

    /* loaded from: classes.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static CaptureRequest.Builder createReprocessCaptureRequest(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }
}
