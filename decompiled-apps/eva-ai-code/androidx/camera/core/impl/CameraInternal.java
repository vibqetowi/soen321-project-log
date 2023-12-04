package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {
    void attachUseCases(Collection<UseCase> collection);

    void close();

    void detachUseCases(Collection<UseCase> collection);

    @Override // androidx.camera.core.Camera
    CameraControl getCameraControl();

    CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    CameraInfo getCameraInfo();

    CameraInfoInternal getCameraInfoInternal();

    @Override // androidx.camera.core.Camera
    LinkedHashSet<CameraInternal> getCameraInternals();

    Observable<State> getCameraState();

    @Override // androidx.camera.core.Camera
    CameraConfig getExtendedConfig();

    void open();

    ListenableFuture<Void> release();

    void setActiveResumingMode(boolean z);

    @Override // androidx.camera.core.Camera
    void setExtendedConfig(CameraConfig cameraConfig);

    /* loaded from: classes.dex */
    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        private final boolean mHoldsCameraSlot;

        State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraInternal$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$setActiveResumingMode(CameraInternal _this, boolean z) {
        }

        public static void $default$setExtendedConfig(CameraInternal _this, CameraConfig cameraConfig) {
        }

        public static LinkedHashSet $default$getCameraInternals(CameraInternal _this) {
            return new LinkedHashSet(Collections.singleton(_this));
        }
    }
}
