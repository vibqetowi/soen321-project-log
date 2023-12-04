package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;
/* loaded from: classes.dex */
public class ZslControlNoOpImpl implements ZslControl {
    @Override // androidx.camera.camera2.internal.ZslControl
    public void addZslConfig(Size size, SessionConfig.Builder builder) {
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public ImageProxy dequeueImageFromBuffer() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean enqueueImageToImageWriter(ImageProxy imageProxy) {
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabled(boolean z) {
    }
}
