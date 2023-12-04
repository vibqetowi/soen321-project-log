package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
interface Camera2SessionConfig {
    List<Camera2OutputConfig> getOutputConfigs();

    Map<CaptureRequest.Key<?>, Object> getSessionParameters();

    int getSessionTemplateId();
}
