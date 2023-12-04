package androidx.camera.camera2.impl;

import androidx.camera.core.impl.CaptureConfig;
/* loaded from: classes.dex */
public abstract class CameraEventCallback {
    public CaptureConfig onDisableSession() {
        return null;
    }

    public CaptureConfig onEnableSession() {
        return null;
    }

    public CaptureConfig onPresetSession() {
        return null;
    }

    public CaptureConfig onRepeating() {
        return null;
    }
}
