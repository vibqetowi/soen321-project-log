package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator;
import androidx.core.util.Preconditions;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class BasicVendorExtender implements VendorExtender {
    private static final String TAG = "BasicVendorExtender";
    private CameraInfo mCameraInfo;
    private final ExtensionDisabledValidator mExtensionDisabledValidator = new ExtensionDisabledValidator();
    private ImageCaptureExtenderImpl mImageCaptureExtenderImpl;
    private final int mMode;
    private PreviewExtenderImpl mPreviewExtenderImpl;

    private int getPreviewOutputImageFormat() {
        return 34;
    }

    public BasicVendorExtender(int i) {
        this.mPreviewExtenderImpl = null;
        this.mImageCaptureExtenderImpl = null;
        this.mMode = i;
        try {
            if (i == 1) {
                this.mPreviewExtenderImpl = new BokehPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new BokehImageCaptureExtenderImpl();
            } else if (i == 2) {
                this.mPreviewExtenderImpl = new HdrPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new HdrImageCaptureExtenderImpl();
            } else if (i == 3) {
                this.mPreviewExtenderImpl = new NightPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new NightImageCaptureExtenderImpl();
            } else if (i == 4) {
                this.mPreviewExtenderImpl = new BeautyPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new BeautyImageCaptureExtenderImpl();
            } else if (i == 5) {
                this.mPreviewExtenderImpl = new AutoPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new AutoImageCaptureExtenderImpl();
            } else {
                throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
            }
        } catch (NoClassDefFoundError unused) {
            Logger.e(TAG, "OEM implementation for extension mode " + i + "does not exist!");
        }
    }

    public PreviewExtenderImpl getPreviewExtenderImpl() {
        return this.mPreviewExtenderImpl;
    }

    public ImageCaptureExtenderImpl getImageCaptureExtenderImpl() {
        return this.mImageCaptureExtenderImpl;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
        if (this.mExtensionDisabledValidator.shouldDisableExtension(str, this.mMode) || this.mPreviewExtenderImpl == null || this.mImageCaptureExtenderImpl == null) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = map.get(str);
        return this.mPreviewExtenderImpl.isExtensionAvailable(str, cameraCharacteristics) && this.mImageCaptureExtenderImpl.isExtensionAvailable(str, cameraCharacteristics);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public void init(CameraInfo cameraInfo) {
        this.mCameraInfo = cameraInfo;
        if (this.mPreviewExtenderImpl == null || this.mImageCaptureExtenderImpl == null) {
            return;
        }
        String cameraId = Camera2CameraInfo.from(cameraInfo).getCameraId();
        CameraCharacteristics extractCameraCharacteristics = Camera2CameraInfo.extractCameraCharacteristics(cameraInfo);
        this.mPreviewExtenderImpl.init(cameraId, extractCameraCharacteristics);
        this.mImageCaptureExtenderImpl.init(cameraId, extractCameraCharacteristics);
        Logger.d(TAG, "Extension init Mode = " + this.mMode);
        Logger.d(TAG, "PreviewExtender processorType= " + this.mPreviewExtenderImpl.getProcessorType());
        Logger.d(TAG, "ImageCaptureExtender processor= " + this.mImageCaptureExtenderImpl.getCaptureProcessor());
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl == null || ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            return this.mImageCaptureExtenderImpl.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    private Size[] getOutputSizes(int i) {
        return ((StreamConfigurationMap) Camera2CameraInfo.from(this.mCameraInfo).getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i);
    }

    private int getCaptureOutputImageFormat() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.mImageCaptureExtenderImpl;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mPreviewExtenderImpl != null && ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.mPreviewExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int previewOutputImageFormat = getPreviewOutputImageFormat();
        return Arrays.asList(new Pair(Integer.valueOf(previewOutputImageFormat), getOutputSizes(previewOutputImageFormat)));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl != null && ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.mImageCaptureExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int captureOutputImageFormat = getCaptureOutputImageFormat();
        return Arrays.asList(new Pair(Integer.valueOf(captureOutputImageFormat), getOutputSizes(captureOutputImageFormat)));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public Size[] getSupportedYuvAnalysisResolutions() {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        return getOutputSizes(35);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public SessionProcessor createSessionProcessor(Context context) {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        return null;
    }
}
