package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface VendorExtender {
    SessionProcessor createSessionProcessor(Context context);

    Range<Long> getEstimatedCaptureLatencyRange(Size size);

    List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions();

    List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions();

    Size[] getSupportedYuvAnalysisResolutions();

    void init(CameraInfo cameraInfo);

    boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map);
}
