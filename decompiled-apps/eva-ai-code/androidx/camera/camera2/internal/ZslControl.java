package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;
/* loaded from: classes.dex */
interface ZslControl {
    void addZslConfig(Size size, SessionConfig.Builder builder);

    ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(ImageProxy imageProxy);

    void setZslDisabled(boolean z);
}
