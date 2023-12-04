package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator;
import androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AdvancedVendorExtender implements VendorExtender {
    private final AdvancedExtenderImpl mAdvancedExtenderImpl;
    private String mCameraId;
    private final ExtensionDisabledValidator mExtensionDisabledValidator = new ExtensionDisabledValidator();
    private final int mMode;

    public AdvancedVendorExtender(int i) {
        this.mMode = i;
        try {
            if (i == 1) {
                this.mAdvancedExtenderImpl = new BokehAdvancedExtenderImpl();
            } else if (i == 2) {
                this.mAdvancedExtenderImpl = new HdrAdvancedExtenderImpl();
            } else if (i == 3) {
                this.mAdvancedExtenderImpl = new NightAdvancedExtenderImpl();
            } else if (i == 4) {
                this.mAdvancedExtenderImpl = new BeautyAdvancedExtenderImpl();
            } else if (i == 5) {
                this.mAdvancedExtenderImpl = new AutoAdvancedExtenderImpl();
            } else {
                throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
            }
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public void init(CameraInfo cameraInfo) {
        this.mCameraId = Camera2CameraInfo.from(cameraInfo).getCameraId();
        this.mAdvancedExtenderImpl.init(this.mCameraId, Camera2CameraInfo.from(cameraInfo).getCameraCharacteristicsMap());
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
        if (this.mExtensionDisabledValidator.shouldDisableExtension(str, this.mMode)) {
            return false;
        }
        return this.mAdvancedExtenderImpl.isExtensionAvailable(str, map);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
        Preconditions.checkNotNull(this.mCameraId, "VendorExtender#init() must be called first");
        return this.mAdvancedExtenderImpl.getEstimatedCaptureLatencyRange(this.mCameraId, size, 256);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        Preconditions.checkNotNull(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedPreviewOutputResolutions(this.mCameraId));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        Preconditions.checkNotNull(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedCaptureOutputResolutions(this.mCameraId));
    }

    private List<Pair<Integer, Size[]>> convertResolutionMapToList(Map<Integer, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) map.get(num).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public Size[] getSupportedYuvAnalysisResolutions() {
        Preconditions.checkNotNull(this.mCameraId, "VendorExtender#init() must be called first");
        List supportedYuvAnalysisResolutions = this.mAdvancedExtenderImpl.getSupportedYuvAnalysisResolutions(this.mCameraId);
        return supportedYuvAnalysisResolutions == null ? new Size[0] : (Size[]) supportedYuvAnalysisResolutions.toArray(new Size[0]);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public SessionProcessor createSessionProcessor(Context context) {
        Preconditions.checkNotNull(this.mCameraId, "VendorExtender#init() must be called first");
        return new AdvancedSessionProcessor(this.mAdvancedExtenderImpl.createSessionProcessor(), context);
    }
}
